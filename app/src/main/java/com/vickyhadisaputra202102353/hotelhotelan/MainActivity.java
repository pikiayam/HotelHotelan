package com.vickyhadisaputra202102353.hotelhotelan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://cdns.klimg.com/merdeka.com/i/w/news/2013/07/02/214121/670x335/jalan-jalan-di-pantai-bikin-orang-lebih-santai.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}