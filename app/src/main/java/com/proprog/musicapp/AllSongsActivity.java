package com.proprog.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.src;

public class AllSongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        Button goAlbums = (Button) findViewById(R.id.allsongs_albums);
        Button goGenres = (Button) findViewById(R.id.allsongs_genres);
        Button goFavorite = (Button) findViewById(R.id.allsongs_favorite);

        goAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(AllSongsActivity.this, AlbumsActivity.class);
            }
        });
        goGenres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(AllSongsActivity.this, GenresActivity.class);
            }
        });
        goFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(AllSongsActivity.this, FavoriteActivity.class);
            }
        });


    }

    public void goActivity(Context src, Class dist) {
        Intent intent = new Intent(src, dist);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goActivity(this, MainActivity.class);
    }

}
