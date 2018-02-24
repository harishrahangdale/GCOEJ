package in.ac.gcoej.www.sdcgcoej;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VolleyScore extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_score);

        recyclerView = (RecyclerView) findViewById(R.id.myrecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Volley");
        databaseReference.keepSynced(true);
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<BlogVolley, BlogViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<BlogVolley, BlogViewHolder>
                (BlogVolley.class, R.layout.blog_row_volley, BlogViewHolder.class, databaseReference) {
            @Override
            protected void populateViewHolder(BlogViewHolder viewHolder, BlogVolley model, int position) {

                viewHolder.setName1(model.getName1());
                viewHolder.setName2(model.getName2());
                viewHolder.setGoals1(model.getGoals1());
                viewHolder.setGoals2(model.getGoals2());
                viewHolder.setStatus(model.getStatus());
                viewHolder.setWinner(model.getWinner());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView name_1, name_2, goals_1, goals_2, status_1, winner_1;

        public BlogViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            name_1 = (TextView) itemView.findViewById(R.id.rcb);

            name_2 = (TextView) itemView.findViewById(R.id.mi);
            goals_1 = (TextView) itemView.findViewById(R.id.goals1);
            goals_2 = (TextView) itemView.findViewById(R.id.goals2);
            status_1 = (TextView) itemView.findViewById(R.id.status);
            winner_1 = (TextView) itemView.findViewById(R.id.winner);
        }

        private void setName1(String name1) {
            name_1.setText(name1);
        }

        private void setName2(String name2) {
            name_2.setText(name2);
        }

        private void setGoals1(String goals1) {
            goals_1.setText(goals1);
        }

        private void setGoals2(String  goals2) {
            goals_2.setText(goals2);
        }

        private void setStatus(String status) {
            status_1.setText(status);
        }

        private void setWinner(String winner) {
            winner_1.setText(winner);
        }
    }

}
