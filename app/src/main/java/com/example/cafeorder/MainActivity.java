package com.example.cafeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextTextName);
        editTextPassword = findViewById(R.id.editTextTextPassword);
    }

    public void onClickCreateOrder(View view){
        String name = editTextName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if (!name.isEmpty() && !password.isEmpty()){
            Intent intent = new Intent(this, CreateOrderActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("password", password);
            startActivity(intent);
        } else{
            Toast.makeText(this, R.string.warning, Toast.LENGTH_SHORT).show();
        }

    }
}