package com.example.kiddiestories.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kiddiestories.R;
import com.example.kiddiestories.classes.Score;

import java.util.ArrayList;

public class ScoresAdapter extends ArrayAdapter<Score> {
    Context context;
    ArrayList<Score> scoreArrayList=new ArrayList<>();
    public ScoresAdapter(@NonNull Context context, ArrayList<Score> scoreArrayList) {
        super(context, R.layout.layout_scores,scoreArrayList);
        this.scoreArrayList=scoreArrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_scores,null,true);
        TextView tvQuizName = view.findViewById(R.id.tvQuizName);
        TextView tvScore = view.findViewById(R.id.tvScore);
        TextView tvDate = view.findViewById(R.id.tvDate);
        tvQuizName.setText(scoreArrayList.get(position).getQuizName());
        tvScore.setText(scoreArrayList.get(position).getScore());
        tvDate.setText(scoreArrayList.get(position).getDate());
        return view;
    }
}
