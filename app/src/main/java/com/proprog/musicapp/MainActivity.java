package com.proprog.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * The app’s structure is suitable for a music player app.
 * A similarly structured app which focuses on audio books, podcasts,
 * or other audio media is also acceptable.
 * Each activity is clearly labelled, using a TextView,
 * such that the final purpose of such an activity is easy to understand. For instance,
 * one screen might be labelled ‘song detail screen’ and another might be labelled ‘music library’
 * App must contain a Payment Activity.
 * Student should find an external library or API that can be used in this situation.
 * In the TextView of that activity, describe the library or API and how it can be used.
 * Any other Activity that requires an external library or class not yet covered also includes
 * the name of that library or class.
 * The app contains 3 to 6 activities.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout allSongsLayout = (RelativeLayout) findViewById(R.id.all_songs_container);
        RelativeLayout genresLayout = (RelativeLayout) findViewById(R.id.genres_container);
        RelativeLayout albumsLayout = (RelativeLayout) findViewById(R.id.albums_container);
        RelativeLayout favoriteLayout = (RelativeLayout) findViewById(R.id.favorite_container);
        Button buttonUpgrade = (Button) findViewById(R.id.btn_upgrade);

        allSongsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(intent);
            }
        });

        genresLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GenresActivity.class);
                startActivity(intent);
            }
        });
        albumsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });
        favoriteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(intent);
            }
        });
        buttonUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UpgradeActivity.class);
                startActivity(intent);
            }
        });

    }
}
