package bill.lays.fragz.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import bill.lays.fragz.layouts.Imageview;
import bill.lays.fragz.layouts.Textlayout;
import bill.lays.fragz.layouts.Lists;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void startImageView(View v){
        Intent I = new Intent(MainActivity.this,Imageview.class);
        startActivity(I);
        finish();
    }
    public void startTextLayout(View v){
        Intent T = new Intent(MainActivity.this,Textlayout.class);
        startActivity(T);
    }
}


