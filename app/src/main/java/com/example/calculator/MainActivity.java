package com.example.calculator;


import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Double firstNumber, secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonAdd.setOnClickListener(view -> {

            firstNumber = Double.parseDouble((binding.num1.getText().toString()));
            secondNumber = Double.parseDouble((binding.num2.getText().toString()));

            binding.result.setText(firstNumber + secondNumber + "");

        });
        binding.buttonMinimize.setOnClickListener(view -> {

            firstNumber = Double.parseDouble((binding.num1.getText().toString()));
            secondNumber = Double.parseDouble((binding.num2.getText().toString()));

            binding.result.setText(firstNumber - secondNumber + "");

        });

        binding.buttonDivision.setOnClickListener(view -> {

            firstNumber = Double.parseDouble((binding.num1.getText().toString()));
            secondNumber = Double.parseDouble((binding.num2.getText().toString()));

            binding.result.setText(firstNumber / secondNumber + "" );

        });


        binding.buttonMultiple.setOnClickListener(view -> {

            firstNumber = Double.parseDouble((binding.num1.getText().toString()));
            secondNumber = Double.parseDouble((binding.num2.getText().toString()));

            binding.result.setText(firstNumber * secondNumber + "");

        });

    }
}




