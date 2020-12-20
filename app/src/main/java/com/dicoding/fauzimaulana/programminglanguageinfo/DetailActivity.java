package com.dicoding.fauzimaulana.programminglanguageinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicoding.fauzimaulana.programminglanguageinfo.adapter.DetailAdapter;
import com.dicoding.fauzimaulana.programminglanguageinfo.model.Language;
import com.dicoding.fauzimaulana.programminglanguageinfo.model.LanguagesData;

import java.io.File;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView rv_language;
    private ArrayList<Language> list = new ArrayList<>();



    private String title = "Detail Information";
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_prolang);


        setActionBarTitle(title);

//        rv_language = findViewById(R.id.rv_language);
//        rv_language.setHasFixedSize(true);
//
//        list.addAll(LanguagesData.getListData());
//        showDetail();

        Intent intent = getIntent();
        String detail = intent.getStringExtra("detail");
        String name = intent.getStringExtra("title");


        Log.d("Fauzi", detail);

        TextView tdetail = findViewById(R.id.detil);
        tdetail.setText(detail);

        TextView tname = findViewById(R.id.namee);
        tname.setText(name);

        Button home = findViewById(R.id.hume);
        home.setOnClickListener(this);

    }

//    private void showDetail(){
//        rv_language.setLayoutManager(new LinearLayoutManager(this));
//        DetailAdapter detailAdapter = new DetailAdapter(list);
//        rv_language.setAdapter(detailAdapter);
//    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.hume:
                Intent moveIntent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}