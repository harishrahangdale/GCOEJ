package in.ac.gcoej.www.sdcgcoej;

/**
 * Created by Harish on 17-02-2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void notice(View view) {
        Intent intent = new Intent(Academics.this, Notice.class);
        startActivity(intent);
    }

    public void syllabus(View view) {
        Intent intent = new Intent(Academics.this, Syllabus.class);
        startActivity(intent);
    }

    public void calendar(View view) {
        Intent intent = new Intent(Academics.this, AcademicCalendar.class);
        startActivity(intent);
    }
    public void timetable(View view) {
        Intent intent = new Intent(Academics.this, TT.class);
        startActivity(intent);
    }
    public void results(View view) {
        Intent intent = new Intent(Academics.this, Result.class);
        startActivity(intent);
    }
}
