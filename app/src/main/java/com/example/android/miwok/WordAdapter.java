package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int ColorResourceId) {
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }


        @Override
        public View getView( int position, View convertView, ViewGroup parent){

            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@link AndroidFlavor} object located at this position in the list
            Word currentWordPosition = getItem(position);

            // seta imagem
            ImageView imageView = listItemView.findViewById(R.id.miwokImage);
            if (currentWordPosition.hasImage()) {
                imageView.setImageResource(currentWordPosition.getmImageResourceId());

                // make sure image is visible
                imageView.setVisibility(View.VISIBLE);

            }else {
                imageView.setVisibility(View.GONE);
            }

            //set the theme color for the list item
            View textContainer = listItemView.findViewById(R.id.text_container);
            // find the color that the resource id maps to
            int color = ContextCompat.getColor(getContext(),mColorResourceId);
            //set the background color of the text container View
            textContainer.setBackgroundColor(color);


            // pega palavra em miwok
            TextView miwoTextView = listItemView.findViewById(R.id.miwok_text_view);
            miwoTextView.setText(currentWordPosition.getMiwokTranslation());

            // pega a palavra em inglês
            TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
            defaultTextView.setText(currentWordPosition.getDefaultTranslation());

            return listItemView;
        }
    }

