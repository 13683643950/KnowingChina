package com.example.frank.wuhanjikong.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.frank.wuhanjikong.R;
import com.example.frank.wuhanjikong.config.PersonInfo;
import com.example.frank.wuhanjikong.config.PublicInfo;

import java.util.HashMap;

public class AddInfoFragment extends Fragment {

    private Button button;
    private EditText editText,photo,location,mention;

    public AddInfoFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_add_info, container, false);

        button=(Button)view.findViewById(R.id.button20);
        editText=(EditText)view.findViewById(R.id.editText);
        photo=(EditText)view.findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String,Object> map=new HashMap<>();
                map.put("nickName", PersonInfo.userName);
                map.put("contentInfo",editText.getText().toString());
                map.put("discussInfo","no comment");
                map.put("tag","4");
                map.put("time","刚刚");
                map.put("url",photo.getText().toString());
                PublicInfo.listItemCation.add(0,map);
                Toast.makeText(getActivity(),"send successful！",Toast.LENGTH_LONG).show();
                editText.setText("");
            }
        });


        return view;
    }


}
