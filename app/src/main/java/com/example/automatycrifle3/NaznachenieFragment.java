package com.example.automatycrifle3;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class NaznachenieFragment extends Fragment {

    private TextView text_content;
    private ImageView image_content;
    private int position = 0;
    private int[] array_automaty_nazn= {R.string.naznachenie_akm_fragment,
            R.string.naznachenie_akms_fragment,
            R.string.naznachenie_ak74_fragment,
            R.string.naznachenie_ak74m_fragment,
            R.string.naznachenie_aks74_fragment,
            R.string.naznachenie_aks74u_fragment,
            R.string.naznachenie_ak12_fragment,
            R.string.naznachenie_ak15_fragment,
            R.string.naznachenie_ak101_fragment,
            R.string.naznachenie_ak102_fragment,
            R.string.naznachenie_ak103_fragment,
            R.string.naznachenie_ak104_fragment,
            R.string.naznachenie_ak105_fragment};

    private int[] array_image_automaty = {R.drawable.akm,
            R.drawable.akms, R.drawable.ak74,
            R.drawable.ak74m, R.drawable.aks74,
            R.drawable.aks74u, R.drawable.ak12,
            R.drawable.ak15, R.drawable.ak101,
            R.drawable.ak102, R.drawable.ak103,
            R.drawable.ak104, R.drawable.ak105};


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_naznachenie, container, false);
        text_content = view.findViewById(R.id.id_naznachenie);
        image_content = view.findViewById(R.id.id_image_automat);
        reciveIntent();
        return view;

    }

    private void reciveIntent() {
        Intent i = getActivity().getIntent();
        if (i != null) {
            position = i.getIntExtra("position", 0);
            //if (position == 0) {
                text_content.setText(array_automaty_nazn[position]);
                image_content.setImageResource(array_image_automaty[position]);
           /* }
            if (position == 1) {
                text_content.setText(array_automaty_nazn[position]);
                image_content.setImageResource(array_image_automaty[position]);
            }
            if (position == 2) {
                text_content.setText(array_automaty_nazn[position]);
                image_content.setImageResource(array_image_automaty[position]);
            }
            if (position == 3) {
                text_content.setText(array_automaty_nazn[position]);
                image_content.setImageResource(array_image_automaty[position]);
            }
            if (position == 4) {
                text_content.setText(array_automaty_nazn[position]);
                image_content.setImageResource(array_image_automaty[position]);
            }*/
        }

    }

}