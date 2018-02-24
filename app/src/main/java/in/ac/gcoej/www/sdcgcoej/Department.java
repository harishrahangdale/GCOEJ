package in.ac.gcoej.www.sdcgcoej;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void computer(View view) {
        Intent intent = new Intent(Department.this, Comp.class);
        startActivity(intent);
    }

    public void mech(View view) {
        Intent intent = new Intent(Department.this, Mech.class);
        startActivity(intent);
    }

    public void civil(View view) {
        Intent intent = new Intent(Department.this, Civil.class);
        startActivity(intent);
    }
    public void elec(View view) {
        Intent intent = new Intent(Department.this, Elect.class);
        startActivity(intent);
    }
    public void entc(View view) {
        Intent intent = new Intent(Department.this, Entc.class);
        startActivity(intent);
    }
    public void instru(View view) {
        Intent intent = new Intent(Department.this, Instru.class);
        startActivity(intent);
    }
    public void science(View view) {
        Intent intent = new Intent(Department.this, Science.class);
        startActivity(intent);
    }
    public void wrkshp(View view) {
        Intent intent = new Intent(Department.this, Wrkshp.class);
        startActivity(intent);
    }
}
