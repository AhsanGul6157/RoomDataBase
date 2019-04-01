package com.example.ahsannaveed.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
private Button btnAddUser;
private Button btnReadUser,btnDeleteUser;
private Button btnUpdate;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        Button btnAddUser=view.findViewById(R.id.add_user);
        Button btnReadUser = view.findViewById(R.id.view_user);
        btnDeleteUser = view.findViewById(R.id.delete_user);
        btnUpdate = view.findViewById(R.id.update_user);
        btnAddUser.setOnClickListener(this);
        btnReadUser.setOnClickListener(this);
        btnDeleteUser.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment() )
                        .addToBackStack(null).commit();
                break;


            case R.id.view_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment() )
                        .addToBackStack(null).commit();
                break;

            case R.id.delete_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DeleteFragment())
                        .addToBackStack(null).commit();
                break;
            case R.id.update_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new UpdateFragment())
                        .addToBackStack(null).commit();
                    break;
        }

    }
}
