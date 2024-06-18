package com.example.automatycrifle3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class UstroystvoFragment extends Fragment {

    private TextView text_content;
    private int position = 0;

    private int[] array_automaty_ustr= {R.string.ustroystvo_akm_fragment,
            R.string.ustroystvo_akms_fragment,
            R.string.ustroystvo_ak74_fragment,
            R.string.ustroystvo_ak74m_fragment,
            R.string.ustroystvo_aks74_fragment,
            R.string.ustroystvo_aks74u_fragment,
            R.string.ustroystvo_ak12_fragment,
            R.string.ustroystvo_ak15_fragment,
            R.string.ustroystvo_ak101_fragment,
            R.string.ustroystvo_ak102_fragment,
            R.string.ustroystvo_ak103_fragment,
            R.string.ustroystvo_ak104_fragment,
            R.string.ustroystvo_ak105_fragment};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ustroystvo, container, false);
        text_content = view.findViewById(R.id.id_ustroistvo);
        //image_content = view.findViewById(R.id.id_image_automat);
        reciveIntent();
        return view;
    }
    private void reciveIntent() {
        Intent i = getActivity().getIntent();
        if (i != null) {
            position = i.getIntExtra("position", 0);
            text_content.setText(array_automaty_ustr[position]);
        }

    }

}