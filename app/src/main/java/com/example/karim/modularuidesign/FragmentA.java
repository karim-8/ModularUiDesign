package com.example.karim.modularuidesign;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{


    ListView listView;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        listView = (ListView) view.findViewById(R.id.list_item);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity()
                ,R.array.chapters,android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        return view;
    }

    public void setCommunicator(Communicator communicator){
        this.communicator=communicator;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        communicator.respond(i);
    }

    public interface Communicator
    {

        public void respond(int index);
    }
}
