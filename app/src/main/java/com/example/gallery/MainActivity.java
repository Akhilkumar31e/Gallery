package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery simpleGallery;
    CustonGalleryAdapter c;
    ImageView s;
    int[] images={R.mipmap.ic_me_foreground,R.mipmap.ic_trees_foreground,R.mipmap.ic_3_foreground};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGallery=findViewById(R.id.gallery);
        s=findViewById(R.id.imageView);
        c=new CustonGalleryAdapter(getApplicationContext(),images);
        simpleGallery.setAdapter(c);
        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                s.setImageResource(images[i]);
            }
        });
    }
}
