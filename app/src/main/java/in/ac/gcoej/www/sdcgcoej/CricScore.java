package in.ac.gcoej.www.sdcgcoej;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CricScore extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cric_score);

        recyclerView = (RecyclerView) findViewById(R.id.myrecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Cricket");
        databaseReference.keepSynced(true);
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Blog, BlogViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Blog, BlogViewHolder>
                (Blog.class, R.layout.blog_row, BlogViewHolder.class, databaseReference) {
            @Override
            protected void populateViewHolder(BlogViewHolder viewHolder, Blog model, int position) {

                viewHolder.setName1(model.getName1());
                viewHolder.setName2(model.getName2());
                viewHolder.setRuns1(model.getRuns1());
                viewHolder.setRuns2(model.getRuns2());
                viewHolder.setOvers1(model.getOvers1());
                viewHolder.setOvers2(model.getOvers2());
                viewHolder.setWickets1(model.getWickets1());
                viewHolder.setWickets2(model.getWickets2());
                viewHolder.setStatus(model.getStatus());
                viewHolder.setWinner(model.getWinner());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView name_1, name_2, runs_1, runs_2, overs_1, overs_2, wickets_1, wickets_2, status_1, winner_1;

        public BlogViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            name_1 = (TextView) itemView.findViewById(R.id.rcb);
            name_2 = (TextView) itemView.findViewById(R.id.mi);
            runs_1 = (TextView) itemView.findViewById(R.id.runs1);
            runs_2 = (TextView) itemView.findViewById(R.id.runs2);
            overs_1 = (TextView) itemView.findViewById(R.id.overs1);
            overs_2 = (TextView) itemView.findViewById(R.id.overs2);
            wickets_1 = (TextView) itemView.findViewById(R.id.wickets1);
            wickets_2 = (TextView) itemView.findViewById(R.id.wickets2);
            status_1 = (TextView) itemView.findViewById(R.id.status);
            winner_1 = (TextView) itemView.findViewById(R.id.winner);
        }

        private void setName1(String name1) {
            name_1.setText(name1);
        }

        private void setName2(String name2) {
            name_2.setText(name2);
        }

        private void setRuns1(String runs1) {
            runs_1.setText(runs1);
        }

        private void setRuns2(String  runs2) {
            runs_2.setText(runs2);
        }

        private void setOvers1(String over1) {
            overs_1.setText(over1);
        }

        private void setOvers2(String over2) {
            overs_2.setText(over2);
        }

        private void setWickets1(String wickets1) {
            wickets_1.setText(wickets1);
        }

        private void setWickets2(String wickets2) {
            wickets_2.setText(wickets2);
        }

        private void setStatus(String status) {
            status_1.setText(status);
        }

        private void setWinner(String winner) {
            winner_1.setText(winner);
        }
    }

}
