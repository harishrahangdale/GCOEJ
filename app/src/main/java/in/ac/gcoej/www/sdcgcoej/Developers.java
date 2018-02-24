package in.ac.gcoej.www.sdcgcoej;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Developers extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Shri. Harish D. Gadade\nAsst. CoE & Asst. Professor\n(Dept. Of Computer Engineering)\n+919225518494",
            "Mr. Harish S. Rahangdale\nS.Y. B.TECH. (Computer)\n+918237061139",
            "Mr. Akshay R. Ghodake\nL.Y. B.TECH. (Computer)\n+917030158668",
            "Mr. Rizwan R. Syed\nL.Y. B.TECH. (Computer)\n+919922592979",
            "Mr. Ojas J. Lunawat\nL.Y. B.TECH. (Computer)\n+918087577050",
            "Team - Software Development Cell\nGovernment College Of Engineering, Jalgaon\nsdc.gcoej.ac.in"

    } ;
    int[] gridViewImageId = {
            R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_main);

        CustomAdapter adapterViewAndroid = new CustomAdapter(Developers.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(Developers.this, "Developer - " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}