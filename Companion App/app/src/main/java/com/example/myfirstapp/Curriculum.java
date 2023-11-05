package com.example.myfirstapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Curriculum#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Curriculum extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public Curriculum() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Curriculum.
     */
    // TODO: Rename and change types and number of parameters
    public static Curriculum newInstance(String param1, String param2) {
        Curriculum fragment = new Curriculum();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_curriculum, container, false);


        CurriculumItem completed1 = CurriculumItem.newInstance(true, true, "Introduction to Conflict Resolution");

        CurriculumItem completed2 = CurriculumItem.newInstance(true, true, "Active Listening and You");

        CurriculumItem progress = CurriculumItem.newInstance(true, false, "Growth vs Fixed Mindset");

        CurriculumItem notcomplete1 = CurriculumItem.newInstance(false, false, "Quiz 1");

        CurriculumItem notcomplete2 = CurriculumItem.newInstance(false, false, "Showing Up For Them");



        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

        transaction.replace(R.id.completed_item_1, completed1);
        transaction.replace(R.id.completed_item_2, completed2);
        transaction.replace(R.id.todo_item_1, progress);
        transaction.replace(R.id.upcoming_item_1, notcomplete1);
        transaction.replace(R.id.upcoming_item_2, notcomplete2);

        // Optionally add the transaction to the back stack
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();

        // Inflate the layout for this fragment
        return view;
    }
}