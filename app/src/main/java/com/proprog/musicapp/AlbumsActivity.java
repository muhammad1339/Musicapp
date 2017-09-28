package com.proprog.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        Button goAllSongs = (Button) findViewById(R.id.albums_allsongs);

        goAllSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivity(AlbumsActivity.this, AllSongsActivity.class);
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
