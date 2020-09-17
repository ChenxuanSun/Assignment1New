package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.MyfirstButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               TextView view1 = (TextView) findViewById(R.id.textView);
               view1.setText("You have clicked the button");
            }
        });
    }
}