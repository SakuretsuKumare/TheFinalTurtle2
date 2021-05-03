package fsu.csc3560.sg.finalprojectturtles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Some of this code was used from https://www.youtube.com/watch?v=Vy_4sZ6JVHM for disabling button.

public class PaymentAmountActivity extends AppCompatActivity {

    // Declaring our variables.
    private EditText payAmount;
    ConfirmationFragment fragment;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_amount);

        // Assigning our widgets to the variables.
        fragment = new ConfirmationFragment();
        btn = findViewById(R.id.payButton2);

        // Uses an OnClickListener() to open up a DialogFragment.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment.show(getSupportFragmentManager(), "Fragment Support");
            }
        });

        // Assigning the text box to the variable name.
        payAmount = findViewById(R.id.payAmount);

        // Checks if the text boxes are empty (button disabled if any are empty).
        payAmount.addTextChangedListener(textWatcher);
    }

    // Public function to go to the Thank You page for button onClick.
    public void openThankYou(View view)
    {
        Intent thankYou = new Intent(this, ThankYouPage.class);
        startActivity(thankYou);
        fragment.dismiss();
    }

    // Public function to go to the Thank You page for button onClick (currently overridden).
    public void openConfirmation(View view) {
        Intent intent = new Intent(this, ThankYouPage.class);
        startActivity(intent);
    }

    // Checks every time the text boxes are changed. We want an input in the EditText.
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String amountInput = payAmount.getText().toString().trim();

            // If the text box is empty, then the button is DISABLED.
            payAmount.setEnabled(!amountInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}