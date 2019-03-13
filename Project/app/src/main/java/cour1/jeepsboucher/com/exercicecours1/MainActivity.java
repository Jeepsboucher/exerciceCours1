package cour1.jeepsboucher.com.exercicecours1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCompare = findViewById(R.id.btn_compare);
        btnCompare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guess();
            }
        });
    }

    public void guess()
    {
        EditText textOne = findViewById(R.id.txt_1);
        EditText textTwo = findViewById(R.id.txt_2);
        textOne.setBackgroundColor(Color.TRANSPARENT);
        textTwo.setBackgroundColor(Color.TRANSPARENT);

        if (!textOne.getText().toString().equals("") && !textTwo.getText().toString().equals("")) {
            BiggerAndSmaller.guessState state = BiggerAndSmaller.findBigger(Integer.parseInt(textOne.getText().toString()), Integer.parseInt(textTwo.getText().toString()));

            if (state == BiggerAndSmaller.guessState.ONEBIGGER) {
                textOne.setBackgroundColor(getResources().getColor(R.color.green));
                Toast.makeText(this, "1 is bigger", Toast.LENGTH_SHORT).show();
            } else if (state == BiggerAndSmaller.guessState.TWOBIGGER) {
                Toast.makeText(this, "2 is bigger", Toast.LENGTH_SHORT).show();
                textTwo.setBackgroundColor(getResources().getColor(R.color.green));
            } else {
                Toast.makeText(this, "Equal", Toast.LENGTH_SHORT).show();
                textOne.setBackgroundColor(getResources().getColor(R.color.green));
                textTwo.setBackgroundColor(getResources().getColor(R.color.green));
            }
        }
        else
            Toast.makeText(this, "Erreur", Toast.LENGTH_SHORT).show();
    }
}
