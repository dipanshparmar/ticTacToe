package com.parmardipansh.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // to track the user number
    private int turn = 0;

    // collection the buttons
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    // to reset the state and colors
    private void resetState() {
        btn1.setText("-");
        btn1.setTextColor(Color.parseColor("#FF9800"));
        btn2.setText("-");
        btn2.setTextColor(Color.parseColor("#FF9800"));
        btn3.setText("-");
        btn3.setTextColor(Color.parseColor("#FF9800"));
        btn4.setText("-");
        btn4.setTextColor(Color.parseColor("#FF9800"));
        btn5.setText("-");
        btn5.setTextColor(Color.parseColor("#FF9800"));
        btn6.setText("-");
        btn6.setTextColor(Color.parseColor("#FF9800"));
        btn7.setText("-");
        btn7.setTextColor(Color.parseColor("#FF9800"));
        btn8.setText("-");
        btn8.setTextColor(Color.parseColor("#FF9800"));
        btn9.setText("-");
        btn9.setTextColor(Color.parseColor("#FF9800"));
    }

    // setting user turns
    private void setTurn(Button btn) {
        if(btn.getText() != "X" && btn.getText() != "O") {
            if(turn == 0) {
                turn = 1;
            } else {
                turn = 0;
            }
        }
    }

    // method to setThe move
    private void setMove(int turn, Button btn) {
        if(turn == 1) {
            if(btn.getText() != "X" && btn.getText() != "O") { // avoiding double clicks
                btn.setText("X");
            } else {
                Toast.makeText(this, "Move already played here", Toast.LENGTH_SHORT).show();
            }
        } else {
            if(btn.getText() != "X" && btn.getText() != "O") { // avoiding double clicks
                btn.setText("O");
                btn.setTextColor(Color.parseColor("#2196F3"));
            } else {
                Toast.makeText(this, "Move already played here", Toast.LENGTH_SHORT).show();
            }
        }
    }

    // method to validate the result
    private void validateResult() {
        if((btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") || (btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X") || (btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X") || (btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X") || (btn2.getText() == "'X" && btn5.getText() == "X" && btn8.getText() == "X") || (btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X") || (btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X") || (btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X")) {
            Toast.makeText(this, "Congrats Player 1, You Won!", Toast.LENGTH_SHORT).show();
            resetState();
        } else if((btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") || (btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O") || (btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O") || (btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O") || (btn2.getText() == "'O" && btn5.getText() == "O" && btn8.getText() == "O") || (btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O") || (btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O") || (btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O")) {
            Toast.makeText(this, "Congrats Player 2, You Won!", Toast.LENGTH_SHORT).show();
            resetState();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // collection the buttons
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        // setting onClick listeners
        btn1.setOnClickListener(v -> {
            setTurn(btn1);
            setMove(turn, btn1);
            validateResult();
        });

        btn2.setOnClickListener(v -> {
            setTurn(btn2);
            setMove(turn, btn2);
            validateResult();
        });

        btn3.setOnClickListener(v -> {
            setTurn(btn3);
            setMove(turn, btn3);
            validateResult();
        });

        btn4.setOnClickListener(v -> {
            setTurn(btn4);
            setMove(turn, btn4);
            validateResult();
        });

        btn5.setOnClickListener(v -> {
            setTurn(btn5);
            setMove(turn, btn5);
            validateResult();
        });

        btn6.setOnClickListener(v -> {
            setTurn(btn6);
            setMove(turn, btn6);
            validateResult();
        });

        btn7.setOnClickListener(v -> {
            setTurn(btn7);
            setMove(turn, btn7);
            validateResult();
        });

        btn8.setOnClickListener(v -> {
            setTurn(btn8);
            setMove(turn, btn8);
            validateResult();
        });

        btn9.setOnClickListener(v -> {
            setTurn(btn9);
            setMove(turn, btn9);
            validateResult();
        });
    }
}