package fsu.csc3560.sg.finalprojectturtles;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// Some of this code was used from https://www.youtube.com/watch?v=Vy_4sZ6JVHM for disabling button.

public class DonateMoneyActivity extends AppCompatActivity {

    // Declaring our variables.
    private EditText firstName;
    private EditText lastName;
    private EditText cardNumber;
    private EditText month;
    private EditText year;
    private EditText sCode;
    private Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_money);

        // Assigning each widget to the corresponding variables.
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        cardNumber =  findViewById(R.id.cardNumber);
        month = findViewById(R.id.month);
        year = findViewById(R.id.year);
        sCode = findViewById(R.id.sCode);
        payButton = findViewById(R.id.payButton);

        // Checks if the text boxes are empty (button disabled if any are empty).
        firstName.addTextChangedListener(textWatcher);
        lastName.addTextChangedListener(textWatcher);
        cardNumber.addTextChangedListener(textWatcher);
        month.addTextChangedListener(textWatcher);
        year.addTextChangedListener(textWatcher);
        sCode.addTextChangedListener(textWatcher);

        /*payButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });*/
    }

    /*boolean isEmpty(EditText text) {
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
    }*/

    // Public function to go to the Payment Amount page for button onClick.
    public void pay(View view) {
        Intent intent = new Intent(this, PaymentAmountActivity.class);
        startActivity(intent);
    }

    // Checks every time the text boxes are changed. We want an input in all EditTexts.
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // Check ALL of the text boxes.
            String firstNameInput = firstName.getText().toString().trim();
            String lastNameInput = lastName.getText().toString().trim();
            String cardNumberInput = cardNumber.getText().toString().trim();
            String monthInput = month.getText().toString().trim();
            String yearInput = year.getText().toString().trim();
            String sCodeInput = sCode.getText().toString().trim();

            // If any of the text boxes are empty, then the button is disabled.
            payButton.setEnabled(!firstNameInput.isEmpty() && !lastNameInput.isEmpty() && !cardNumberInput.isEmpty() && !monthInput.isEmpty() && !yearInput.isEmpty() && !sCodeInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
