package com.mehmetonuraysel.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

Button button;
ImageView imageView;
int Images[] = {R.drawable.pink_floyd,R.drawable.pink_floyd_darkside_1973,R.drawable.pink_floyd_grup,R.drawable.pink,R.drawable.pink_floyd_1972_dark_1side_era, R.drawable.pink_floyd};
private int currentImage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        switcher();

    }
    public void switcher(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView.setImageResource(Images[currentImage]);
                currentImage = (currentImage+1)%Images.length;

            }
        });
    }

}