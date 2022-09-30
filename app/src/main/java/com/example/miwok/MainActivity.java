/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView tvNumbers = (TextView)findViewById(R.id.numbers);
        tvNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numb = new Intent(getApplicationContext(),Numbers.class);
                startActivity(numb);
            }
        });

        TextView tvFamilyMembers = (TextView)findViewById(R.id.family);
        tvFamilyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fam = new Intent(getApplicationContext(),FamilyMembers.class);
                startActivity(fam);
            }
        });

        TextView tvColors = (TextView)findViewById(R.id.colors);
        tvColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent color = new Intent(getApplicationContext(),Colors.class);
                startActivity(color);
            }
        });

        TextView tvPhrases = (TextView)findViewById(R.id.phrases);
        tvPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrases = new Intent(getApplicationContext(),Phrases.class);
                startActivity(phrases);
            }
        });
    }

}
