package com.uottawa.runnan.seg_deliberable1;

import android.app.Service;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    EditText view;
    EditText view2;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        String username = getIntent().getStringExtra("username");
        String role = getIntent().getStringExtra("roletype");
        view = (EditText) findViewById(R.id.welcome);
        view2 = (EditText)findViewById(R.id.etrole);
        view.setText("Welcome " + username + "!");
        view2.setText("You are logged as " + role);
        next =(Button)findViewById(R.id.btnnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String role2 = getIntent().getStringExtra("roletype");
                if(role2.equals("Administrator")){
                    Intent intent = new Intent(getApplicationContext(),ServiceList.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Home.this,"Will be implemented in deliverable 3", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
