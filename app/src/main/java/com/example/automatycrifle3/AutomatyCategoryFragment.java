package com.example.automatycrifle3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class AutomatyCategoryFragment extends Fragment {


    private int category_index;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        //необходимо добавить view для управления от активности
        View rootView = inflater.inflate(R.layout.fragment_automaty_category, container, false);


        AdapterView.OnItemClickListener itemClickListener=
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {

                            //getActivity() для действия от имени активити
                        Intent intent = new Intent(getActivity(), AutomatMenuActivity.class);
                        intent.putExtra("position", position);

                        startActivity(intent);
                    }

                };
        ListView listView = (ListView) rootView.findViewById(R.id.list_automaty);
        listView.setOnItemClickListener(itemClickListener);
        return rootView;
    }
}