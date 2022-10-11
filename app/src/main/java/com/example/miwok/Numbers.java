package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("one", "tolookosu"));
        words.add(new Word("one", "oyyisa"));
        words.add(new Word("one", "massokka"));
        words.add(new Word("one", "temmokka"));
        words.add(new Word("one", "kenekaku"));
        words.add(new Word("one", "kawinta"));
        words.add(new Word("one", "wo'e"));
        words.add(new Word("one", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, R.layout.single_item, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}