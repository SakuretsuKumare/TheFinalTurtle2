package fsu.csc3560.sg.finalprojectturtles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

// Some of this code was used from https://www.youtube.com/watch?v=z7QS2oHY0lM for random number

public class ThankYouPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you_page);

        // Changes the text box to display a randomly generated number
        final Random myRandom = new Random();
        final TextView textGenerateNumber = (TextView)findViewById(R.id.randomNumber);
        textGenerateNumber.setText("$" + String.valueOf(myRandom.nextInt(4000001)) + ".00");
    }

    // Public function to go to the Main page for button onClick.
    public void homePage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}