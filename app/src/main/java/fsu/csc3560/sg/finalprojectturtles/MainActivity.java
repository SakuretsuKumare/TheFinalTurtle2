package fsu.csc3560.sg.finalprojectturtles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendSecond(View view) {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }

    public void sendDonation(View view) {
        Intent intent = new Intent(this, DonateMoneyActivity.class);
        startActivity(intent);
    }

    public void sendHelpSite(View view) {
        Uri uri = Uri.parse("www.fisheries.noaa.gov/feature-story/what-can-you-do-save-sea-turtles");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
