package ua.org.skravchenko.hw1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bOne = findViewById(R.id.bOne);
        final Button bTwo = findViewById(R.id.bTwo);
        final String sOne = "BTN 1";
        final String sTwo = "BTN 2";

        bOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bOne.getText().toString().contentEquals(sOne)){
                    bOne.setText(sTwo);
                    bOne.setBackgroundColor(Color.WHITE);
                } else {
                    bOne.setText(sOne);
                    bOne.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        bTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int rNum = random.nextInt(2);
                if (rNum==0){
                    bTwo.setText(sTwo);
                    bTwo.setBackgroundColor(Color.GRAY);
                } else {
                    bTwo.setText(sOne);
                    bTwo.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}
