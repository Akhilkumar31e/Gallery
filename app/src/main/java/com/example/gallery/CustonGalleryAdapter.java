package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustonGalleryAdapter extends BaseAdapter {
    private Context context;
    private int[] images;
    public CustonGalleryAdapter(Context c,int[] images){
        context=c;
        this.images=images;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView iV=new ImageView(context);
        iV.setImageResource(images[i]);
        iV.setLayoutParams(new Gallery.LayoutParams(200,200));
        return iV;
    }
}
