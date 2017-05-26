package com.example.alex.trade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TradeActivity extends AppCompatActivity {
    private TextView mProductTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade);
        Intent intent = getIntent();
        String product = intent.getStringExtra("product");
        mProductTextView.setText("Here are all the products: " + product);
    }
}
