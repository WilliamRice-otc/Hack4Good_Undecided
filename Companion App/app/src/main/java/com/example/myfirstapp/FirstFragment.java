package com.example.myfirstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myfirstapp.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
    @Override
    public void onViewStateRestored(Bundle savedInstanceState)
    {
        super.onViewStateRestored(savedInstanceState);

        View view = getView();
        ImageButton btn = view.findViewById(R.id.menuButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout mgcBox = (LinearLayout) v.findViewById(R.id.magicBox);
                ImageButton menuBtn = (ImageButton) v.findViewById(R.id.menuButton);
                if(mgcBox.getVisibility() == View.VISIBLE){
                    mgcBox.setVisibility(View.GONE);
                    menuBtn.setImageResource(R.drawable.up_arrow);
                }
                else {
                    mgcBox.setVisibility(View.VISIBLE);
                    menuBtn.setImageResource(R.drawable.down_arrow);
                }
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}