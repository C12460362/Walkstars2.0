package com.google.ryan.walkstar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button aCMaker = (Button)findViewById(R.id.cmaker);
        Button aChallenger = (Button)findViewById(R.id.challenger);
        TextView aReg = (TextView)findViewById(R.id.regText);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        aCMaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent options = new Intent(LoginOptionActivity.this, ChallengeMakerActivity.class);
                startActivity(options);
            }
        });

        aChallenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent options = new Intent(LoginOptionActivity.this, LoginActivity.class);
                startActivity(options);
            }
        });
    }

}
