package com.acheache.castillejo.thefm.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.acheache.castillejo.thefm.R;

/**
 * Created by CASTILLEJO on 11/01/2017.
 */
public class HypedArtistsFragment extends Fragment {
    public static final int NUM_COLUMNS=2;

    private RecyclerView mHypedArtistList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_hyped_artists,container,false);
        mHypedArtistList=(RecyclerView) root.findViewById(R.id.hyped_artists_list);
        return root;
    }

    private void setupArtistList(){
        mHypedArtistList.setLayoutManager(new GridLayoutManager(getActivity(),NUM_COLUMNS));
    }

}
