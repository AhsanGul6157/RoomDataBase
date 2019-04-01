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
public class AddUserFragment extends Fragment  {
    private EditText userId,userName,userEmail;
    private Button savebtn;


    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        userId =view.findViewById(R.id.id);
        userName = view.findViewById(R.id.name);
        userEmail = view.findViewById(R.id.email);
        savebtn = view.findViewById(R.id.save);
       savebtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int userid = Integer.parseInt(userId.getText().toString());
               String username = userName.getText().toString();
               String useremail = userEmail.getText().toString();
               User user = new User();
               user.setId(userid);
               user.setName(username);
               user.setEmail(useremail);
               MainActivity.myAppDataBase.myDao().addUser(user);
               Toast.makeText(getActivity(),"USER ADDED SUCCESSFULLY" ,Toast.LENGTH_SHORT ).show();
               userId.setText("");
               userName.setText("");
               userEmail.setText("");

           }
       });
        return view;

    }


}
