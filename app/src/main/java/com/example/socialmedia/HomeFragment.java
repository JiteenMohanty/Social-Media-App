package com.example.socialmedia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.socialmedia.Adapter.StoryAdapter;
import com.example.socialmedia.Model.StoryModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView story_rv;
    ArrayList<StoryModel> list;

    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        story_rv = view.findViewById(R.id.storyRV);

        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.image, R.drawable.ic_live, R.drawable.icuser24, "Random User"));
        list.add(new StoryModel(R.drawable.image, R.drawable.ic_live, R.drawable.icuser24, "Random User2"));
        list.add(new StoryModel(R.drawable.image, R.drawable.ic_live, R.drawable.icuser24, "Random User3"));
        list.add(new StoryModel(R.drawable.image, R.drawable.ic_live, R.drawable.icuser24, "Random User4"));

        StoryAdapter adapter = new StoryAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        story_rv.setLayoutManager(linearLayoutManager);
        story_rv.setNestedScrollingEnabled(false);
        story_rv.setAdapter(adapter);

        return view;
    }
}