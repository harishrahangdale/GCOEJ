package in.ac.gcoej.www.sdcgcoej;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Harish on 13-02-2018.
 */

public class Notifications extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        recyclerView = (RecyclerView) findViewById(R.id.myrecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Notify");
        databaseReference.keepSynced(true);
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<BlogNotifications, Notifications.BlogViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<BlogNotifications, Notifications.BlogViewHolder>
                (BlogNotifications.class, R.layout.blog_notifications, Notifications.BlogViewHolder.class, databaseReference) {
            @Override
            protected void populateViewHolder(Notifications.BlogViewHolder viewHolder, BlogNotifications model, int position) {

                viewHolder.setName1(model.getMessage());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView message_1;

        public BlogViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            message_1 = (TextView) itemView.findViewById(R.id.message);
        }

        private void setName1(String message) {
            message_1.setText(message);
        }

    }

}
