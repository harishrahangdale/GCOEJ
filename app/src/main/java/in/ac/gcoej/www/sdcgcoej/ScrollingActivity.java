package in.ac.gcoej.www.sdcgcoej;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

   public void cricket(View view) {
       Intent intent = new Intent(ScrollingActivity.this, CricScore.class);
       startActivity(intent);
   }

    public void football(View view) {
        Intent intent = new Intent(ScrollingActivity.this, FootScore.class);
        startActivity(intent);
    }

    public void basketball(View view) {
        Intent intent = new Intent(ScrollingActivity.this, BasketScore.class);
        startActivity(intent);
    }
    public void kabaddi(View view) {
        Intent intent = new Intent(ScrollingActivity.this, KabaddiScore.class);
        startActivity(intent);
    }
    public void volleyball(View view) {
        Intent intent = new Intent(ScrollingActivity.this, VolleyScore.class);
        startActivity(intent);
    }
    public void khokho(View view) {
        Intent intent = new Intent(ScrollingActivity.this, KhoScore.class);
        startActivity(intent);
    }
}
