package com.omkar.high;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    private  void makeToast(String string){

        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();


    }
    public void guess(View view){

        EditText guessn = (EditText)findViewById(R.id.guessnum);
        int num = Integer.parseInt(guessn.getText().toString());
        if (num>randomnumber){
            makeToast("Lower");

        }else if(num==randomnumber) {

            makeToast("Correct!! try again");
            Random rand = new Random();
            randomnumber = rand.nextInt(20) + 1;
        }else {
            makeToast("Higher");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
         randomnumber = rand.nextInt(20) + 1;
    }
}
