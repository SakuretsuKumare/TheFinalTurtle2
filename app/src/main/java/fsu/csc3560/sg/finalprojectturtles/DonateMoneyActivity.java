package fsu.csc3560.sg.finalprojectturtles;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DonateMoneyActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText cardNumber;
    EditText month;
    EditText year;
    EditText sCode;
    Button payButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_money);

    /*
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        cardNumber =  findViewById(R.id.cardNumber);
        month = findViewById(R.id.month);
        year = findViewById(R.id.year);
        sCode = findViewById(R.id.sCode);

        payButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDataEntered();
            }
        });
        */
    }
/*
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(firstName)) {
            Toast.makeText(this, "You must enter first name to register!", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(lastName)) {
            Toast.makeText(this, "Last name is required!", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(cardNumber)) {
            Toast.makeText(this, "A valid card number is required!", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(month)) {
            Toast.makeText(this, "An expiration month is required!", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(year)) {
            Toast.makeText(this, "An expiration year is required!", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(sCode)) {
            Toast.makeText(this, "A security code is required!", Toast.LENGTH_SHORT).show();
        }
    }
 */
    public void pay(View view) {
        Intent intent = new Intent(this, ThankYouPage.class);
        startActivity(intent);
    }
}
