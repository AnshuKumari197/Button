package com.coding.a02projectbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button redbutton;
    Button bluebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        redbutton = (Button) findViewById(R.id.mybtn);
//        bluebutton = (Button) findViewById(R.id.bluebtn);

        // red button using long method
//        redbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("TEST", "redClicked");
//            }
//        });


        // blue button using long method... 35, 36, 37, 38, 39, 40
//        bluebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("Blue", "blueClicked");
//            }
//        });

    }

    // red button using short method
    public void redclicked(View view) {

        Log.d("RED", "clickedred");
    }


    //  blue button in short method... 52,53
    public void bluePressed(View view) {
//        Log.d("BLUE", "clicked via method");

        // Toast - this is for  msg on the same page in a small dialogue box
//        Context context = getApplicationContext();
//        CharSequence text = "Hello from blue"; // what text should appear
//        int duration = Toast.LENGTH_SHORT; // this is for how many second the msg should go back
//        Toast toast = Toast.makeText(context, text, duration); // calling toast
//        toast.show(); // showing the toast

        //shoeter way to create toast... 5 lines to 1 line
        Toast.makeText(this, "shorter Hello from blue", Toast.LENGTH_SHORT).show();
    }
}


// do the assignment
//create the toast on your own for both the buttons
