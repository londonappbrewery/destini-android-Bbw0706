package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView Question;
    private Button answerOne;
    private Button answerTwo;
    private int mIndex = 0;

    int answOneList[][] = {
            { R.string.T1_Ans1, 2 },
            { R.string.T2_Ans1, 2 },
            { R.string.T3_Ans1, 5 },
    };

    int answTwoList[][] = {
            { R.string.T1_Ans2, 1 },
            { R.string.T2_Ans2, 3 },
            { R.string.T3_Ans2, 4 },
    };

    int storyTextList[] = {
        R.string.T1_Story,
        R.string.T2_Story,
        R.string.T3_Story,
        R.string.T4_End,
        R.string.T5_End,
        R.string.T6_End,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        Question = findViewById(R.id.storyTextView);
        answerOne = findViewById(R.id.buttonTop);
        answerTwo = findViewById(R.id.buttonBottom);

        Question.setText(storyTextList[mIndex]);
        answerOne.setText(answOneList[mIndex][0]);
        answerTwo.setText(answTwoList[mIndex][0]);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        answerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonOne(answOneList[mIndex][1]);
            }
        });

        answerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonTwo(answTwoList[mIndex][1]);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    }

    public void updateButtonOne(int nums) {
        mIndex = nums;

        if (mIndex < 3) {
            Question.setText(storyTextList[mIndex]);
            answerOne.setText(answOneList[mIndex][0]);
            answerTwo.setText(answTwoList[mIndex][0]);
        } else {
            Question.setText(storyTextList[mIndex]);
            answerOne.setVisibility(View.GONE);
            answerTwo.setVisibility(View.GONE);
        }
    }

    public void updateButtonTwo(int nums) {
        mIndex = nums;

        if (mIndex < 3) {
            Question.setText(storyTextList[mIndex]);
            answerOne.setText(answOneList[mIndex][0]);
            answerTwo.setText(answTwoList[mIndex][0]);
        } else {
            Question.setText(storyTextList[mIndex]);
            answerOne.setVisibility(View.GONE);
            answerTwo.setVisibility(View.GONE);
        }
    }
}
