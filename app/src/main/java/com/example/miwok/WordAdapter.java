package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convert, ViewGroup parent) {

        View currentView = convert;
        if(currentView == null)
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.single_item,parent,false);

        Word word = (Word)getItem(position);

        TextView tvEnglishWord = (TextView) currentView.findViewById(R.id.english);
        tvEnglishWord.setText(word.getEnglish());

        TextView tvMiwok = (TextView) currentView.findViewById(R.id.miwok);
        tvMiwok.setText(word.getMiwok());


        return currentView;
    }

}
