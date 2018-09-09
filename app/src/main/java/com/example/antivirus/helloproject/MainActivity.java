package com.example.antivirus.helloproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public  int total = 0;
    public  int turnscount = 0;
    public TextView scores;
    public TextView turns;
    public TextView currentNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get All Labels
        scores  = findViewById(R.id.txtViewScores);
        turns = findViewById(R.id.txtViewTurns);
        currentNumber = findViewById(R.id.txtViewCurrentNumber);

        Button RollButton = findViewById(R.id.btnRollDice);

        // jb Roll Dice Button py Click krain  gy

        RollButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Random r = new Random();
                int n = r.nextInt(6) + 1;
                currentNumber.setText(Integer.toString(n));
                total += n;
                scores.setText(Integer.toString(total));
                turnscount ++;
                turns.setText(Integer.toString(turnscount));
            }
        });
        Button NewGameButton = findViewById(R.id.btnNewGame);

        // Jb new game k button py click hoga
        NewGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = 0;
                turnscount = 0;
                currentNumber.setText(Integer.toString(0));
                turns.setText(Integer.toString(turnscount));
                scores.setText(Integer.toString(0));
            }
        });

    }
}
