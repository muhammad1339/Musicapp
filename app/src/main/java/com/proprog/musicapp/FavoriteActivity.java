package com.proprog.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        Button goGenres = (Button) findViewById(R.id.favorite_genres);
        Button goAllSongs = (Button) findViewById(R.id.favorite_allsongs);
        Button goAlbums = (Button) findViewById(R.id.favorite_albums);

        goGenres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(FavoriteActivity.this, GenresActivity.class);
            }
        });
        goAllSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(FavoriteActivity.this, AllSongsActivity.class);
            }
        });
        goAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(FavoriteActivity.this, AlbumsActivity.class);
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
