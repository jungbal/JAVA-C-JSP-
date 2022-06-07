package com.cookandroid.project10_6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Movie> mData;

    public MovieAdapter(Context mContext, ArrayList<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = View.inflate(mContext, R.layout.list_item, null);
        }
        ImageView image = (ImageView)view.findViewById(R.id.imgPoster);
        TextView title = (TextView)view.findViewById(R.id.txtTitle);
        TextView genre = (TextView)view.findViewById(R.id.txtGenre);

        image.setImageDrawable(mData.get(i).getImage());
        title.setText(mData.get(i).getTitle());
        genre.setText(mData.get(i).getGenre());
        return view;
    }
}
