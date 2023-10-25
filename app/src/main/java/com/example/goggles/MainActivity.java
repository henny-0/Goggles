package com.example.goggles;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gotoGoogleButton = findViewById(R.id.gotoGoogleButton);

        gotoGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri googleURI = Uri.parse("https://www.google.com");
                Intent startGoogle = new Intent(Intent.ACTION_VIEW, googleURI);
                startActivity(startGoogle);
            }
        });


    }
}