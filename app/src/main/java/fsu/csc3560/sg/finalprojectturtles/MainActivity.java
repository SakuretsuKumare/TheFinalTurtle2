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


}
