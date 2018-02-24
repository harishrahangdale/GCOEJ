package in.ac.gcoej.www.sdcgcoej;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by harish on 9/15/2017.
 */

public class Contact extends AppCompatActivity /*implements View.OnClickListener*/ {
    //TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        //t = (TextView)findViewById(R.id.website);
        //t.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    /*public void onClick(View v)
    {
        //handle the click events here, in this case open www.google.com with the default browser
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.gcoej.ac.in")));
    }*/
}

