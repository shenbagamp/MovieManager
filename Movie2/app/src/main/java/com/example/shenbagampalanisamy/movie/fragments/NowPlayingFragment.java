package com.example.shenbagampalanisamy.movie.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shenbagampalanisamy.movie.R;
import com.example.shenbagampalanisamy.movie.models.Movie;
import com.example.shenbagampalanisamy.movie.adapter.*;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 /**
 * A simple {@link Fragment} subclass.
 */
public class NowPlayingFragment extends Fragment {


    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;

    public NowPlayingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_now_playing, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());

        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerView adapter;
        adapter = new MovieRecyclerView(getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }

    private void initializeData() {

        movies = new ArrayList<>();
        movies.add(new Movie("277834", "Moana", "In Ancient Polynesia, when a terrible curse incurred by Maui reaches an impetuous Chieftain's daughter's island, she answers the Ocean's call to seek out the demigod to set things right.", 6.5f, 854, "https://cdn-images-1.medium.com/max/1200/1*9RIn-3Mv2P4cAXrLkCw8eg.jpeg", "https://cdn-images-1.medium.com/max/1200/1*9RIn-3Mv2P4cAXrLkCw8eg.jpeg"));
        movies.add(new Movie("121856", "Passengers", "A spacecraft traveling to a distant colony planet and transporting thousands of people has a malfunction in its sleep chambers. As a result, two passengers are awakened 90 years early.", 6.2f, 745, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRA90ZLZIAsLhP7hSXCmwRafKcJH6fCVkCbJH3FnxyxvUpnKnV6UQ", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRA90ZLZIAsLhP7hSXCmwRafKcJH6fCVkCbJH3FnxyxvUpnKnV6UQ"));
        movies.add(new Movie("330459", "Assassin's Creed", "Lynch discovers he is a descendant of the secret Assassins society through unlocked genetic memories that allow him to relive the adventures of his ancestor, Aguilar, in 15th Century Spain. After gaining incredible knowledge and skills he’s poised to take on the oppressive Knights Templar in the present day.", 5.3f, 691, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTx-M7w9pUoMPgx0NiGDH775GbGuBsz4LKC9wTaGrExRpj8wids", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTx-M7w9pUoMPgx0NiGDH775GbGuBsz4LKC9wTaGrExRpj8wids"));
        movies.add(new Movie("283366", "Rogue One: A Star Wars Story", "A rogue band of resistance fighters unite for a mission to steal the Death Star plans and bring a new hope to the galaxy.", 7.2f, 1802, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWfke5D-mbBIwfMyXUv_LuhS13u1nrzQC8aAhNxLNtSBExUgRl", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWfke5D-mbBIwfMyXUv_LuhS13u1nrzQC8aAhNxLNtSBExUgRl"));
        movies.add(new Movie("313369", "La La Land", "Mia, an aspiring actress, serves lattes to movie stars in between auditions and Sebastian, a jazz musician, scrapes by playing cocktail party gigs in dingy bars, but as success mounts they are faced with decisions that begin to fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.", 8, 396, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXF74-7k0ogOi3ATudXqZj0t418aJFdCwbYImBhtgXWcV_fmTQXg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXF74-7k0ogOi3ATudXqZj0t418aJFdCwbYImBhtgXWcV_fmTQXg"));

    }

}
