package com.dicoding.fauzimaulana.programminglanguageinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    private String title = "About Developer";
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        setActionBarTitle(title);

        Button home = findViewById(R.id.btn_home);
        home.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_home:
                Intent moveIntent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
