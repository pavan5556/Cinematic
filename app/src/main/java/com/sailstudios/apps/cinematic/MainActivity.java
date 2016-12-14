package com.sailstudios.apps.cinematic;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sailstudios.apps.cinematic.fragments.FavFragment;
import com.sailstudios.apps.cinematic.fragments.ListFragment;
import com.sailstudios.apps.cinematic.fragments.PopularFragment;
import com.sailstudios.apps.cinematic.fragments.TopRatedFragment;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener,
        PopularFragment.OnFragmentInteractionListener,FavFragment.OnFragmentInteractionListener
        ,TopRatedFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
