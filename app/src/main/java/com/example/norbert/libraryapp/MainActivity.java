package com.example.norbert.libraryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bBookList = findViewById(R.id.bBookList );
        bBookList.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast. makeText (MainActivity. this , "TODO" , Toast. LENGTH_SHORT ).show();
            }
        });
    }
}
