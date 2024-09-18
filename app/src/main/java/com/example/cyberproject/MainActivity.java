package com.example.cyberproject;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.graphics.Color;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView titleText;
    LinearLayout mainLayout;
    Button changeSelfColor;
    Button changeTitleTextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mainLayout = findViewById(R.id.main);
        titleText= findViewById(R.id.titleText);

        Button getMessage = findViewById(R.id.getMessage);
        changeTitleTextColor = findViewById(R.id.changeTitleColor);
        Button changeBgroundColor = findViewById(R.id.changeBgroundColor);
        Button exitButton = findViewById(R.id.exitButton);
        changeSelfColor = findViewById(R.id.changeSelfColor);

    }
    public void getMessage(View view) {
        // Functionality for pressed button msg
        Toast.makeText(this, "Button Pressed!", Toast.LENGTH_SHORT).show();
    }
    public void changeTitleColor(View view) {
        changeTitleTextColor.setTextColor(Color.parseColor("#000000"));
    }
    public void changeColor(View view) {
        changeSelfColor.setBackgroundColor(Color.parseColor("#000EEE"));
    }
    public void changeBackground(View view) {
        mainLayout.setBackgroundColor(Color.parseColor("#FFF078"));
    }
    public void exitApp(View view) {
        System.exit(0);
    }
}