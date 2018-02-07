package com.pace.cs639spring.hw1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;
import static com.pace.cs639spring.hw1.R.color.blue;
import static com.pace.cs639spring.hw1.R.color.green;
import static com.pace.cs639spring.hw1.R.color.purple;
import static com.pace.cs639spring.hw1.R.color.red;
import static com.pace.cs639spring.hw1.R.color.yellow;

public class MainActivity extends AppCompatActivity {
    // Widget variables
    public ImageView birdImageView;
    public ImageView catImageView;
    public ImageView dogImageView;
    public TextView birdTextView;
    public TextView catTextView;
    public TextView dogTextView;
    public Button redBtn;
    public Button blueBtn;
    public Button yellowBtn;
    public Button greenBtn;
    public Button magentaBtn;
    public ImageView selectedAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Gaining access to XML elements in JAVA
        birdImageView = (ImageView) findViewById(R.id.birdimg);
        catImageView = (ImageView) findViewById(R.id.catimg);
        dogImageView = (ImageView) findViewById(R.id.dogimg);
        birdTextView = (TextView) findViewById(R.id.birddesc);
        catTextView = (TextView) findViewById(R.id.catdesc);
        dogTextView = (TextView) findViewById(R.id.dogdesc);
        redBtn = (Button) findViewById(R.id.red);
        blueBtn = (Button) findViewById(R.id.blue);
        yellowBtn = (Button) findViewById(R.id.yellow);
        greenBtn = (Button) findViewById(R.id.green);
        magentaBtn = (Button) findViewById(R.id.magenta);
        selectedAnimal = null; // Self Explanatory

        //Click event handler for Bird
        birdImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Visibility Check
                if (birdTextView.getVisibility() == View.VISIBLE)
                {
                    //If true
                    birdTextView.setVisibility(View.INVISIBLE);
                    // Reseting selected animal for color change
                    selectedAnimal = null;
                }
                else {
                        //If False
                        birdTextView.setVisibility(View.VISIBLE);
                        // Also making other animals disappear
                        catTextView.setVisibility(View.INVISIBLE);
                        dogTextView.setVisibility(View.INVISIBLE);
                        // Setting selected animal for color change
                        selectedAnimal = (ImageView) findViewById(R.id.birdimg);
                }
            }
        });

        //Click event handler for Cat
        catImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Visibility Check
                if (catTextView.getVisibility() == View.VISIBLE)
                {
                    //If true
                    catTextView.setVisibility(View.INVISIBLE);
                    // Reseting selected animal for color change
                    selectedAnimal = null;
                }
                else {
                        //If False
                        birdTextView.setVisibility(View.INVISIBLE);
                        catTextView.setVisibility(View.VISIBLE);
                        dogTextView.setVisibility(View.INVISIBLE);
                        // Also making other animals disappear
                        // Setting selected animal for color change
                        selectedAnimal = (ImageView) findViewById(R.id.catimg);
                }
            }
        });

        //Click event handler Dog
        dogImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Visibility Check
                if (dogTextView.getVisibility() == View.VISIBLE)
                {
                    //If true
                    dogTextView.setVisibility(View.INVISIBLE);
                    // Reseting selected animal for color change
                    selectedAnimal = null;
                }
                else {
                        //If False
                        birdTextView.setVisibility(View.INVISIBLE);
                        catTextView.setVisibility(View.INVISIBLE);
                        dogTextView.setVisibility(View.VISIBLE);
                        // Also making other animals disappear
                        // Setting selected animal for color change
                        selectedAnimal = (ImageView) findViewById(R.id.dogimg);
                }
            }
        });

        //Click event handler for Red Color Button
        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedAnimal == null)
                {
                    // If null, shows toast
                    Toast.makeText(getApplicationContext(),"Select an animal first !",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //If not then allows changing color
                    selectedAnimal.setColorFilter(RED, PorterDuff.Mode.SRC_IN);
                }
            }
        });

        //Click event handler for Blue Color Button
        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedAnimal == null)
                {
                    // If null, shows toast
                    Toast.makeText(getApplicationContext(),"Select an animal first !",Toast.LENGTH_SHORT).show();
                }
                else {
                        //If not then allows changing color
                        selectedAnimal.setColorFilter(BLUE, PorterDuff.Mode.SRC_IN);
                }
            }
        });

        //Click event handler for Yellow Color Button
        yellowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedAnimal == null)
                {
                    // If null, shows toast
                    Toast.makeText(getApplicationContext(),"Select an animal first !",Toast.LENGTH_SHORT).show();
                }
                else {
                        //If not then allows changing color
                        selectedAnimal.setColorFilter(YELLOW, PorterDuff.Mode.SRC_IN);
                }
            }
        });

        //Click event handler for Green Color Button
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedAnimal == null)
                {
                    // If null, shows toast
                    Toast.makeText(getApplicationContext(),"Select an animal first !",Toast.LENGTH_SHORT).show();
                }
                else {
                        //If not then allows changing color
                        selectedAnimal.setColorFilter(GREEN, PorterDuff.Mode.SRC_IN);
                }
            }
        });

        //Click event handler for Magenta Color Button
        magentaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedAnimal == null)
                {
                    // If null, shows toast
                    Toast.makeText(getApplicationContext(),"Select an animal first !",Toast.LENGTH_SHORT).show();
                }
                else {
                        //If not then allows changing color
                        selectedAnimal.setColorFilter(MAGENTA, PorterDuff.Mode.SRC_IN);
                }
            }
        });

        // EASTER EGG ALERT
        // Longpress handler to changer to reset the animal image colors

        birdImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                birdImageView.setColorFilter(null);
                Toast.makeText(getApplicationContext(),"Color Reset",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        catImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                catImageView.setColorFilter(null);
                Toast.makeText(getApplicationContext(),"Color Reset",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        dogImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                dogImageView.setColorFilter(null);
                Toast.makeText(getApplicationContext(),"Color Reset",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

}
