package in.ac.gcoej.www.sdcgcoej;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


import static com.bumptech.glide.load.engine.DiskCacheStrategy.NONE;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (getIntent().getExtras() != null) {

            for (String key : getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);

                if (key.equals("Notice") && value.equals("True")) {
                    Intent intent = new Intent(this, Notifications.class);
                    intent.putExtra("value", value);
                    startActivity(intent);
                    finish();
                }
                else if (key.equals("Live") && value.equals("True")) {
                    Intent intent = new Intent(this, Live.class);
                    intent.putExtra("value", value);
                    startActivity(intent);
                    finish();
                }
                else if (key.equals("Krida") && value.equals("True")) {
                    Intent intent = new Intent(this, ScrollingActivity.class);
                    intent.putExtra("value", value);
                    startActivity(intent);
                    finish();
                }
                else if (key.equals("Academics") && value.equals("True")) {
                    Intent intent = new Intent(this, Result.class);
                    intent.putExtra("value", value);
                    startActivity(intent);
                    finish();
                }

            }
        }


        ImageView imageView1 = (ImageView) findViewById(R.id.name);
        Glide.with(this).load("https://sdc-gcoej.github.io/Android-App/name.png").diskCacheStrategy(NONE).into(imageView1);

        ImageView imageView = (ImageView) findViewById(R.id.imageView1);
        Glide.with(this).load("https://sdc-gcoej.github.io/Android-App/1.png").diskCacheStrategy(NONE).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Live.class));
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.Events_img);
        Glide.with(this).load("https://sdc-gcoej.github.io/Android-App/events.png").diskCacheStrategy(NONE).into(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.Quote_img);
        Glide.with(this).load("https://sdc-gcoej.github.io/Android-App/quote.png").diskCacheStrategy(NONE).into(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Notifications.class));
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            System.exit(0);
            return true;
        } else if (id == R.id.nav_notice) {
            Intent intent = new Intent(MainActivity.this, Notifications.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);

        } else if (id == R.id.nav_dev) {
            Intent intent = new Intent(MainActivity.this, Developers.class);
            startActivity(intent);

        }  else if (id == R.id.nav_address) {
            Intent intent = new Intent(MainActivity.this, Address.class);
            startActivity(intent);

        } else if (id == R.id.nav_phone) {
            Intent intent = new Intent(MainActivity.this, Contact.class);
            startActivity(intent);

        }else if (id == R.id.nav_kv) {
            Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_dept){
            Intent intent = new Intent(MainActivity.this, Department.class);
            startActivity(intent);

        }else if (id == R.id.academics){
            Intent intent = new Intent(MainActivity.this, Academics.class);
            startActivity(intent);

        }else if (id == R.id.nav_MIS){
            Intent intent = new Intent(MainActivity.this, MIS.class);
            startActivity(intent);

        }else if (id == R.id.nav_live){
            Intent intent = new Intent(MainActivity.this, Live.class);
            startActivity(intent);

        }else if (id == R.id.nav_PPolicy) {
            Intent intent = new Intent(MainActivity.this, Privacy.class);
            startActivity(intent);
        }else if (id == R.id.footer_spacer_1) {
            String url = "https://www.facebook.com/sdc.gcoej/";

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }else if (id == R.id.footer_spacer_2) {
            String url = "https://www.youtube.com/channel/UCS3oR-f0sQqoFy0BVaRsLrQ";

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
