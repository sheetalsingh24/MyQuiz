package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public RadioGroup radioGroup;
    public RadioButton radioButton;
    public Button btnDisplay;
     int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_1);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio_dehradun:

                            score = score + 1;
                            //  displayscore(score);

                        break;
                    case R.id.radio_kolkata:
                        break;

                }
            }

        });
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radio_2);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio_kim:

                            score = score + 1;
                            // displayscore(score);

                        break;
                    case R.id.radio_john:

                        break;

                }
            }

        });
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radio_3);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio_urjit:

                            score = score + 1;
                            // displayscore(score);

                        break;

                    case R.id.radio_subha:
                        break;

                }
            }

        });
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radio_4);
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio_bipin:

                            score = score + 1;
                            // displayscore(score);



                        break;
                    case R.id.radio_ashok:
                        break;

                }
            }

        });

    }
    public void displaybt(View view)
    {
        Button b=(Button) findViewById(R.id.butt_v);
        displayscore(score);
    }
    public void displayscore(int score)
    {
        TextView scoreview = (TextView) findViewById(R.id.score_v);
        scoreview.setText(String.valueOf(score));

        if(score>=3)
        {


            Toast.makeText(MainActivity.this,
                    "Good Job!", Toast.LENGTH_LONG).show();
        }
        if(score<3)
        {


            Toast.makeText(MainActivity.this,
                    "Better luck next time!", Toast.LENGTH_LONG).show();
        }
    }
    
}
