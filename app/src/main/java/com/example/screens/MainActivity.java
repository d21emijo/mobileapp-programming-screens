package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView inlog = findViewById(R.id.login);
        TextView user = findViewById(R.id.user);
        Button logginbutton = findViewById(R.id.logInButton);

        logginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("===","knapptryckt");

                String log = inlog.getText().toString();
                Log.d("===","knapptryckt" + log);

                Intent intent = new Intent(MainActivity.this, SecondaryActivity2.class);
                intent.putExtra("name", "Daniel"); // Optional
                intent.putExtra("number", 1); // Optional
                startActivity(intent);



            }
        });
    }

}
