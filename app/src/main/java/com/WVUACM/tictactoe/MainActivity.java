package com.WVUACM.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    /* Declare the variable */
    Button[] board;
    int[][]  board_status = new int[3][3];
    int round = 0;
    boolean is_player_X = true;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Initialize the variable */
        board[0] = (Button) findViewById(R.id.button1);
        ...
        board[8] = (Button) findViewById(R.id.button9);

        reset = (Button) findViewById(R.id.reset);

        /* Set on click listener */

    }

    @Override
    public void onClick(View view) {
        boolean resetButtonClick = false;

        switch (view.getId()){

            // Tell Button what to do
            case R.id.button1:
                // Player X

                // Player O

                // Disable the button

                break;
                
            ...
            case R.id.reset:
                resetButtonClick = true;
        }
        
        if(resetButtonClick){
            resetBoard();
        }else{
            round++;
            boolean game_over = checkWinner();

            if(game_over){
                gameStop();
            }else{
                if (round == 9){
                    Toast.makeText(getApplicationContext(), "Game Draw", Toast.LENGTH_LONG).show();
                }else{
                    //Change Players

                    //Tell Player "It's your turn"
                    if (is_player_X){
                        Toast.makeText(getApplicationContext(), "Player X Turn", Toast.LENGTH_LONG).show();
                    }else{

                    }
                }
            }
        }

        
    }

    private void gameStop() {
        //Disable all the board
    }

    private boolean checkWinner() {
        // Horizontal


        // Vertical


        // First diagonal


        // Second diagonal

    }

    private void resetBoard() {
        // Enable all the board



        // reinitialize variables
    }


    // Record the board status
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);


    }
}
