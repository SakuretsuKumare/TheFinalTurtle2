package fsu.csc3560.sg.finalprojectturtles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Declaring our variables.
    PaymentMethodFragment fragment;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning our widgets to the variables.
        fragment = new PaymentMethodFragment();
        btn = findViewById(R.id.donateButton);

        // Uses an OnClickListener() to open up a DialogFragment.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment.show(getSupportFragmentManager(), "Fragment Support");
            }
        });
    }

    // Public function to go to the Information page page for button onClick.
    public void sendSecond(View view) {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }

    // Public function to go to the Payment page for button onClick (currently Overridden).
    public void sendDonation(View view) {
        Intent intent = new Intent(this, DonateMoneyActivity.class);
        startActivity(intent);
    }
}