package com.example.ahsannaveed.roomdatabase;


import android.os.Bundle;
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
public class UpdateFragment extends Fragment {
    private EditText userId,userName,userEmail;
    private Button btnUpdate;


    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update, container, false);
        userId = view.findViewById(R.id.id);
        userName = view.findViewById(R.id.name);
        userEmail = view.findViewById(R.id.email);
        Button btnUpdate=view.findViewById(R.id.update);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(userId.getText().toString());
                String name = userName.getText().toString();
                String email = userEmail.getText().toString();
                User user = new User();
                 user.setId(id);
                 user.setName(name);
                 user.setEmail(email);
                 MainActivity.myAppDataBase.myDao().updateUser(user);
                Toast.makeText(getActivity(),"Updated Successfully" ,Toast.LENGTH_SHORT ).show();
                userId.setText("");
                userName.setText("");
                userEmail.setText("");
            }
        });
    return  view  ;
    }

}
