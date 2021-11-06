package com.example.asm1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asm1.R;
import com.example.asm1.adapter.TodaytaskAdapter;
import com.example.asm1.model.TodotodaytaskModel;

import java.util.ArrayList;


public class Today extends Fragment {

    String[] todotext = {"9.30 AM","1.00 PM","4.30 PM","7.00 AM"};
    String[] todotext2 = {"Project meeting","Doctor appointment","Give project update to client","Continue with online course"};
    String[] todotextt3 = {"9.30 — 10.30 AM","1.00 — 1.30 PM","4.30 — 4.45 PM","7.00 — 8.30 PM"};
    String[] todotext4 = {"Mauris non tempor quam, et lacinia sapien. Mauris accumsan eros eget libero posuere vulputate. Etiam elit elit, elementum sed varius at…","Mauris non tempor quam, et lacinia sapien. Mauris accumsan eros.","Mauris non tempor quam, et lacinia sapien. ","Mauris non tempor quam, et lacinia sapien. Mauris accumsan eros eget libero posuere vulputate."};
    String[] todotext5 = {"Work","Health","Work","Personal"};

    Integer[] todoimg = {R.drawable.todaytaskorange_ract,R.drawable.todaytaskblue_ract,R.drawable.todaytaskorange_ract,R.drawable.todaytaskpurple_ract};
   // int[] radio = {R.drawable.todaytaskorange_ract,R.drawable.todaytaskblue_ract,R.drawable.todaytaskorange_ract,R.drawable.todaytaskpurple_ract};
   Integer[] todoimg2 = {R.drawable.ic_circle_orange,R.drawable.ic_circle_blue,R.drawable.ic_circle_orange,R.drawable.ic_circle_purple};


    private TodaytaskAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<TodotodaytaskModel> todotodaytaskModelArrayList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.todo_recyclerview_todaytask, container, false);

        recyclerview = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        todotodaytaskModelArrayList = new ArrayList<>();


        for (int i = 0; i < todotext.length; i++) {
            TodotodaytaskModel view1 = new TodotodaytaskModel(todotext[i], todotext2[i], todotextt3[i], todotext4[i],todotext5[i],todoimg[i],todoimg2[i]);
            todotodaytaskModelArrayList.add(view1);
        }
        homepageAdapter = new TodaytaskAdapter(getActivity(), todotodaytaskModelArrayList);
        recyclerview.setAdapter(homepageAdapter);

        return view;
    }
}
