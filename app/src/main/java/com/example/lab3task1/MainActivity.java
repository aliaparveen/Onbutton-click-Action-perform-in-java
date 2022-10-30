package com.example.lab3task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    int pic=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        Button button=findViewById(R.id.btn_change);

        ConstraintLayout mainlayout=findViewById(R.id.mainlayout);


        RadioButton rb_background=findViewById(R.id.rb_background);
        RadioButton rb_size=findViewById(R.id.rb_size);
        RadioButton rb_style=findViewById(R.id.rb_textstyle);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioGroup.getCheckedRadioButtonId()==R.id.rb_background){

                    if(pic==0){
                        mainlayout.setBackground(getDrawable(R.drawable.frank));
                        pic++;
                    }else{
                        mainlayout.setBackground(getDrawable(R.drawable.banner));
                        pic--;
                    }

                }
                else if(radioGroup.getCheckedRadioButtonId()==R.id.rb_size){
                    rb_background.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                    rb_size.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                    rb_style.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                }
                else if(radioGroup.getCheckedRadioButtonId()==R.id.rb_textstyle){
                    rb_background.setText("change Background");
                    rb_size.setText("change TextSize");
                    rb_style.setText("change Text");
                    button.setText("i m clicked");


                }



            }
        });
    }
}
