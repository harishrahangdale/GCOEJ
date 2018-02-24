package in.ac.gcoej.www.sdcgcoej;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by harish on 9/15/2017.
 */

public class Address extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
