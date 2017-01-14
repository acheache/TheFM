package com.acheache.castillejo.thefm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.acheache.castillejo.thefm.ui.HypedArtistsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_container,new HypedArtistsFragment())
                    .commit();
        }


    }
}
