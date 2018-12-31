package com.fourdt.europhistoryquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int question2Answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void submitButton(View view){
        EditText question1AnswerField = findViewById(R.id.question_1_answer_field);
        if (question1AnswerField.getText().toString().equalsIgnoreCase(getString(R.string.question_1_answer))){
            score++;
        }
        RadioGroup question2AnswerGroup = findViewById(R.id.question_2_answer_group);
        if(question2AnswerGroup.getCheckedRadioButtonId()== R.id.question_2_choice_2) {
            score++;
        }
        RadioGroup question3AnswerGroup = findViewById(R.id.question_3_answer_group);
        if(question3AnswerGroup.getCheckedRadioButtonId()== R.id.question_3_choice_4) {
            score++;
        }
        EditText question4AnswerField = findViewById(R.id.question_4_answer_field);
        if (question4AnswerField.getText().toString().equalsIgnoreCase(getString(R.string.question_4_answer))){
            score++;
        }
        CheckBox question5Choice1 = findViewById(R.id.question_5_choice_1);
        CheckBox question5Choice2 = findViewById(R.id.question_5_choice_2);
        CheckBox question5Choice3 = findViewById(R.id.question_5_choice_3);
        CheckBox question5Choice4 = findViewById(R.id.question_5_choice_4);

        if (question5Choice1.isChecked() && !question5Choice2.isChecked() && question5Choice3.isChecked() && !question5Choice4.isChecked()){
            score++;
        }

        Toast result = Toast.makeText(this, "Total Score is " + score + "/5", Toast.LENGTH_SHORT);
        result.show();
        score = 0;

    }
}
