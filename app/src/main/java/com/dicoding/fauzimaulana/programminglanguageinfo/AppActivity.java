package com.dicoding.fauzimaulana.programminglanguageinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppActivity extends AppCompatActivity implements View.OnClickListener {

    private String title = "About Application";
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        setActionBarTitle(title);

        Button home = findViewById(R.id.back);
        home.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.back:
                Intent moveIntent = new Intent(AppActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
