package com.lumen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentFavourites extends Fragment {


    protected RecyclerView favouritesRV;
    protected ArticlesRVAdapter adapter;
    protected ArrayList<Article> favourites;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        favourites = new ArrayList<Article>();
        // засунуть данные в favourites
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favourites, container, false);

        favouritesRV = (RecyclerView) rootView.findViewById(R.id.favourites_recycle_view);
        adapter = new ArticlesRVAdapter(favourites);
        favouritesRV.setAdapter(adapter);

        //return super.onCreateView(inflater, container, savedInstanceState);
        return rootView;
    }

    //ну так на будущее
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.place_holder, fragment);
        fragmentTransaction.commit();
    }
}
