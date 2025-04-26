package com.educonnecteducation.educonnect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


public class fragmentAcademicsResources extends Fragment {
    LinearLayout courseSyllabus,questionPaper,notesMaterial,uniResult,rtmnuTimeTable;


    public fragmentAcademicsResources() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_academics_resources, container, false);
        courseSyllabus = view.findViewById(R.id.academics_syllabus_show);
        questionPaper = view.findViewById(R.id.academics_quePaper_show);
        notesMaterial = view.findViewById(R.id.academics_notes_show);
        uniResult = view.findViewById(R.id.academics_result_show);
        rtmnuTimeTable=view.findViewById(R.id.academics_timetable_show);

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
        rtmnuTimeTable.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://nagpuruniversity.ac.in/"))));
        return view;
    }
}