package com.example.karim.modularuidesign;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);

        textView = (TextView) view.findViewById(R.id.text);
        return view;
    }

    public void  changeData (int index)

    {
        String[]  description  = getResources().getStringArray(R.array.des);
          textView.setText(description[index]);
    }
}
