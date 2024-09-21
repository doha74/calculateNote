package com.example.note;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText note1;
    private EditText note2;
    private EditText note3;
    private EditText note4;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        note1 = findViewById(R.id.inputOne);
        note2 = findViewById(R.id.inputTwo);
        note3 = findViewById(R.id.inputTree);
        note4 = findViewById(R.id.inputFour);
        result = findViewById(R.id.result);
        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateNote();
            }
        });
    }
    private void calculateNote(){
        String input1 = note1.getText().toString();
        String input2 = note2.getText().toString();
        String input3 = note3.getText().toString();
        String input4 = note4.getText().toString();
        if(input1.isEmpty() || input2.isEmpty() || input3.isEmpty() || input4.isEmpty()){
            Toast.makeText(this, "Please enter a number",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        Float inp1 = Float.parseFloat(input1);
        Float inp2 = Float.parseFloat(input2);
        Float inp3 = Float.parseFloat(input3);
        Float inp4 = Float.parseFloat(input4);
        float moye =  (inp1+inp2+inp3+inp4)/ 4;
        String Result = Afficher(moye);
        result.setText("votre resultat est " +Result);
    }
    private String Afficher(float moye) {
        if (moye >= 16 && moye < 20 ) {
            return "Excellent";
        } else if (moye < 16 && moye >= 14) {
            return "tres bien";
        } else if (moye >= 12 && moye < 14) {
            return "bien";
        } else if (moye >= 10 && moye < 12) {
            return "Assez bien";
        } else {
            return "echec";
        }
    }
}