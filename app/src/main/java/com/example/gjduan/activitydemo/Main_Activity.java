package com.example.gjduan.activitydemo;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Main_Activity extends AppCompatActivity {
    private Button btnBack,btnExit;
    public Main_Activity ct = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ct= this;
        btnBack = (Button)findViewById(R.id.button3) ;
        btnExit = (Button)findViewById(R.id.exitbutton);
        //btnBack.setOnClickListener(lst);

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main_Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
              //  finish();
               ct.finish();


            }
        });


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
//    Button.OnClickListener lst =  new Button.OnClickListener() {
//        public void onClick(View view) {
//            Intent intent = new Intent(Main_Activity.this, Main2Activity.class);
//            startActivity(intent);
//        }
//    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
