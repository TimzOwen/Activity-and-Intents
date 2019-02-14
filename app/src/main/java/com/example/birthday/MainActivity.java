package com.example.birthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv001);
        tv2 = (TextView) findViewById(R.id.tv002);
        tv3 = (TextView) findViewById(R.id.tv003);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "you clickedintent one", Toast.LENGTH_LONG).show();

                Intent secondAct = new Intent(MainActivity.this, AcitivtyThree.class);
                startActivity(secondAct);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent third = new Intent(MainActivity.this, AcitivityTwo.class);
                startActivity(third);
            }
        });
    }
}
