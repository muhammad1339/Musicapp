package com.proprog.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        Button goAlbums = (Button) findViewById(R.id.genres_albums);
        Button goAllSongs = (Button) findViewById(R.id.genres_allsongs);
        Button goFavorite = (Button) findViewById(R.id.genres_favorite);

        goAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(GenresActivity.this, AlbumsActivity.class);
            }
        });
        goAllSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(GenresActivity.this, AllSongsActivity.class);
            }
        });
        goFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(GenresActivity.this, FavoriteActivity.class);
            }
        });


    }

    public void goActivity(Context src, Class dist) {
        Intent intent = new Intent(src, dist);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goActivity(this, MainActivity.class);
    }
}
