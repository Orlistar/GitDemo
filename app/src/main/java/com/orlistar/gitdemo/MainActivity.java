package com.orlistar.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        switch (view.getId()){
            case R.id.btn_1:
                Toast.makeText(this, "btn1 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                Toast.makeText(this, "btn2 is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
