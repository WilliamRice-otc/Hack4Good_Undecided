package com.example.myfirstapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CurriculumItem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CurriculumItem extends Fragment {

    private static final String ARG_ENABLED = "enabled";
    private static final String ARG_CHECKED = "editable";
    private static final String ARG_TITLE = "title";

    private boolean enabled;
    private boolean checked;
    private String title;

    public CurriculumItem() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param enabled  A boolean indicating if the fragment is enabled.
     * @param editable A boolean indicating if the fragment is editable.
     * @param title    A string representing the title.
     * @return A new instance of fragment CurriculumItem.
     */
    public static CurriculumItem newInstance(boolean enabled, boolean editable, String title) {
        CurriculumItem fragment = new CurriculumItem();
        Bundle args = new Bundle();
        args.putBoolean(ARG_ENABLED, enabled);
        args.putBoolean(ARG_CHECKED, editable);
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            enabled = getArguments().getBoolean(ARG_ENABLED);
            checked = getArguments().getBoolean(ARG_CHECKED);
            title = getArguments().getString(ARG_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_curriculum_item, container, false);
        CheckBox curriculum_checkbox = view.findViewById(R.id.curriculum_item_checkbox);
        TextView curriculum_text = view.findViewById(R.id.curriculum_item_text);
        curriculum_checkbox.setEnabled(enabled);
        curriculum_checkbox.setChecked(checked);
        curriculum_checkbox.setClickable(false);
        curriculum_text.setText(title);

        // Inflate the layout for this fragment
        return view;
    }
}
