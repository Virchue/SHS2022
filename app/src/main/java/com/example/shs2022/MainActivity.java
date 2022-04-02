package com.example.shs2022;

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


            Button btn = findViewById(R.id.thebutton);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("*/*");
                    intent.putExtra(Intent.EXTRA_EMAIL, "dmitriy.pautov138@gmail.com");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "baka~");

                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }

                    }
                }
            );


        }


    }
