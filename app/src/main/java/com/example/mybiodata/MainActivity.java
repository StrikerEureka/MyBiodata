package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      button map
        ImageButton map = (ImageButton) findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/p3jB2BDKvqe9HYUYA"));
                startActivity(map);
            }
        });

//      button telpon
        ImageButton telpon = (ImageButton) findViewById(R.id.telpon);
        telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telpon = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +6289632123033"));
                startActivity(telpon);
            }
        });

//      button email
        ImageButton email = (ImageButton) findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto: dinodamara11@gmail.com"));
                startActivity(email);
            }
        });
    }
}