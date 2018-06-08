package com.example.ishaikh0287.lab_08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    ImageButton Cloth;
    ImageButton Toys;
    ImageButton Electronic;
    ImageButton Appliance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cloth =(ImageButton)findViewById(R.id.clickCloth);
        Toys = (ImageButton)findViewById(R.id.imageButton2);
        Electronic =(ImageButton)findViewById(R.id.imageButton3) ;
        Appliance = (ImageButton)findViewById(R.id.imageButton4) ;

        Cloth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)  {
                Toast.makeText(MainActivity.this,
                        "Clothing Image Button is Clicked!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        Toys.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)  {
                Toast.makeText(MainActivity.this,
                        "Toys Image Button is Clicked!!!!", Toast.LENGTH_SHORT).show();
            }
        });

        Electronic.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,
                        "Electronics Image Button is Clicked!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        Appliance.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)  {
                Intent myIntent = new Intent();
                Toast.makeText(MainActivity.this,
                        "Appliances Image Button is Clicked!!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
