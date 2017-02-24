package com.chenqi.mytooldemo.designDemo.One;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.chenqi.mytooldemo.R;

import java.util.LinkedList;

/**
 *  简单的Fragment
 */
public class ItemFragment extends Fragment {

    public static Fragment getInstance(String str) {
        ItemFragment fragment = new ItemFragment();
        Bundle b = new Bundle();
        b.putString("str", str);
        fragment.setArguments(b);
        return fragment;
    }

    private String title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString("str");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_one, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(title + "  " + i);
        }
        ListView listView = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }
}
