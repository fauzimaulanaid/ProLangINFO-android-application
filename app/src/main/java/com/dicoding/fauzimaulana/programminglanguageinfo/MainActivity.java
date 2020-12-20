package com.dicoding.fauzimaulana.programminglanguageinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dicoding.fauzimaulana.programminglanguageinfo.adapter.ListLanguageAdapter;
import com.dicoding.fauzimaulana.programminglanguageinfo.model.Language;
import com.dicoding.fauzimaulana.programminglanguageinfo.model.LanguagesData;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView LANGUAGE;
    private ArrayList<Language> list = new ArrayList<>();

    private String title = "Programming Language INFO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        LANGUAGE = findViewById(R.id.rv_prolang);
        LANGUAGE.setHasFixedSize(true);

        list.addAll(LanguagesData.getListData());
        showList();
    }

    private void showList(){
        LANGUAGE.setLayoutManager(new LinearLayoutManager(this));
        ListLanguageAdapter listLanguageAdapter = new ListLanguageAdapter(list);
        LANGUAGE.setAdapter(listLanguageAdapter);

        listLanguageAdapter.setOnItemClickCallback(new ListLanguageAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Language data) {
                showSelectedHero(data);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                setActionBarTitle(title);
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.about_app:
                Intent move = new Intent(MainActivity.this, AppActivity.class);
                startActivity(move);
                break;
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHero(Language language) {
        Toast.makeText(this, "Kamu memilih " + language.getName(), Toast.LENGTH_SHORT).show();
        Log.d("Fauzi", language.toString());

        Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
        moveIntent.putExtra("detail", language.getDetail());
        moveIntent.putExtra("title", language.getName());
        startActivity(moveIntent);

        }



}