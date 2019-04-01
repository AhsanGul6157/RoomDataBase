package com.example.ahsannaveed.roomdatabase;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteFragment extends Fragment {
    private EditText textUserId;
    private Button btnDeleteUser;


    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_delete, container, false);
        textUserId = view.findViewById(R.id.editText);
        btnDeleteUser = view.findViewById(R.id.delete);
        btnDeleteUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =Integer.parseInt(textUserId.getText().toString());
                User user = new User();
                user.setId(id);
                MainActivity.myAppDataBase.myDao().deleteUser(user);
                Toast.makeText(getActivity(),"Deleted Successfully" ,Toast.LENGTH_SHORT ).show();
            }
        });
        return  view;
    }

}
