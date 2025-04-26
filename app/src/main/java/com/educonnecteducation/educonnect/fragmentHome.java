package com.educonnecteducation.educonnect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


public class fragmentHome extends Fragment {

    public fragmentHome() {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container, false);
        LinearLayout courseSyllabus = view.findViewById(R.id.home_syllabus_show);
        LinearLayout questionPaper = view.findViewById(R.id.home_quePaper_show);
        LinearLayout notesMaterial = view.findViewById(R.id.home_notes_show);
        LinearLayout uniResult = view.findViewById(R.id.home_result_show);
        courseSyllabus.setOnClickListener(v -> {
            Intent intent=new Intent(getActivity(),CourseSyllabus.class);
            startActivity(intent);
        });
        notesMaterial.setOnClickListener(v -> {
            Intent intent=new Intent(getActivity(),NotesMaterials.class);
            startActivity(intent);
        });
        questionPaper.setOnClickListener(v -> {
            Intent intent=new Intent(getActivity(),QuestionPaper.class);
            startActivity(intent);
        });
        uniResult.setOnClickListener(v -> {
            Intent intent=new Intent(getActivity(),UniversityResult.class);
            startActivity(intent);
        });

        return view;

    }
}