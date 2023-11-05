package com.example.myfirstapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link djoke#newInstance} factory method to
 * create an instance of this fragment.
 */
public class djoke extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_DJOKE = "param1";

    // TODO: Rename and change types of parameters
    private String djoke_string;

    public djoke() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment djoke.
     */
    // TODO: Rename and change types and number of parameters
    public static djoke newInstance(String param1) {
        djoke fragment = new djoke();
        Bundle args = new Bundle();
        args.putString(ARG_DJOKE, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            djoke_string = getArguments().getString(ARG_DJOKE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_djoke, container, false);

        TextView theJokeComponent = (TextView) view.findViewById(R.id.djoke_text);


        // Array of dad jokes
        String[] dadJokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "I used to play piano by ear, but now I use my hands.",
                "What do you call a factory that makes okay products? A satisfactory.",
                "I told my wife she was drawing her eyebrows too high. She looked surprised.",
                "I'm reading a book on anti-gravity. It's impossible to put down."
        };

        // Generate a random number between 1 and 5
        int min = 1;
        int max = 5;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Select a random dad joke
        String selectedJoke = dadJokes[randomNumber - 1];

        theJokeComponent.setText(selectedJoke);

        return view;
    }
}