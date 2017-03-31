package com.rokhimin.profiltkj1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ZoomControls;

public class FullImage extends Activity {

    ZoomControls zoom;
    ImageView img;
        
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.full_image);
        
        // get intent data
        Intent i = getIntent();
        
        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        img = imageView;
        zoom = (ZoomControls) findViewById(R.id.zoomControls);

        zoom.setOnZoomInClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                int w = img.getWidth();
                int h = img.getHeight();

                RelativeLayout.LayoutParams params =
                    new RelativeLayout.LayoutParams(w + 10, h + 10);
                params.addRule(RelativeLayout.CENTER_IN_PARENT);

                img.setLayoutParams(params);
            }
        });

        zoom.setOnZoomOutClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                int w = img.getWidth();
                int h = img.getHeight();

                RelativeLayout.LayoutParams params =
                    new RelativeLayout.LayoutParams(w - 10, h - 10);
                params.addRule(RelativeLayout.CENTER_IN_PARENT);

                img.setLayoutParams(params);
            }
        });
    }
}