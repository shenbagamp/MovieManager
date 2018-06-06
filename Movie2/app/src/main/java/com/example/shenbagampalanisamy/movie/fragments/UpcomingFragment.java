package com.example.shenbagampalanisamy.movie.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shenbagampalanisamy.movie.R;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.shenbagampalanisamy.movie.R;
import com.example.shenbagampalanisamy.movie.models.Movie;
import com.example.shenbagampalanisamy.movie.adapter.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingFragment extends Fragment {

    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;


    public UpcomingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);

        ButterKnife.bind(this, view);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerView adapter = new MovieRecyclerView(this.getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }


    private void initializeData() {
        movies = new ArrayList<>();
        movies.add(new Movie("277834", "Rings", "Julia (Matilda Lutz) becomes worried about her boyfriend, Holt (Alex Roe) when he explores the dark urban legend of a mysterious videotape said to kill the watcher seven days after viewing. She sacrifices herself to save her boyfriend and in doing so makes a horrifying discovery: there is a \\\"movie within the movie\\\" that no one has ever seen before.", 0f, 0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-RAxQiMkiNgxs9VfEPbCLO04Dfxnmp2OhhebuSrE95JomSIa8", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-RAxQiMkiNgxs9VfEPbCLO04Dfxnmp2OhhebuSrE95JomSIa8"));
        movies.add(new Movie("121856", "The Great Wall", "The story of an elite force making a last stand for humanity on the world’s most iconic structure.", 0f, 0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_SvGar3WfwiU7EX8T9mvhVxnn05snBXdHWwnaswNiuajEQxPFeg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_SvGar3WfwiU7EX8T9mvhVxnn05snBXdHWwnaswNiuajEQxPFeg"));
        movies.add(new Movie("330459", "Patriots Day", "An account of Boston Police Commissioner Ed Davis's actions in the events leading up to the 2013 Boston Marathon bombing and the aftermath, which includes the city-wide manhunt to find the terrorists behind it.", 0f, 0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWlOGGnnp0LWHuftrBRhUBK6ZBD42HNmVrmY8YENdRCPtbvTOjog", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWlOGGnnp0LWHuftrBRhUBK6ZBD42HNmVrmY8YENdRCPtbvTOjog"));
        movies.add(new Movie("283366", "T2 Trainspotting", "First there was an opportunity......then there was a betrayal. Twenty years have gone by. Much has changed but just as much remains the same. ", 0f, 0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjnMdzuHqzqOtR6N5UbWGWacQ4b3UqIvYbp-E6JPenS1yudaa9", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjnMdzuHqzqOtR6N5UbWGWacQ4b3UqIvYbp-E6JPenS1yudaa9"));

    }

}