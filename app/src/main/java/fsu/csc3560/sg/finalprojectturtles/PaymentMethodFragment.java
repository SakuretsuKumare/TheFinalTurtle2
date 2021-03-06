package fsu.csc3560.sg.finalprojectturtles;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentMethodFragment extends DialogFragment {

    public PaymentMethodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment_method, container, false);
    }

    // Public function to go to the Payment page for button onClick.
    public void sendDonation(View view) {
        Intent intent = new Intent(getActivity(), DonateMoneyActivity.class);
        startActivity(intent);
    }
}