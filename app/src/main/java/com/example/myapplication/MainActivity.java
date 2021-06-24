package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText edtname;
    EditText edtgender;
    Button btnupdate;
    Recycleradapter recycleradapter;
    ArrayList<uchiha> anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        edtname = findViewById(R.id.edittext1);
        edtgender = findViewById(R.id.edittext2);
        btnupdate = findViewById(R.id.btn);
        anime = new ArrayList<>();
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtname.getText().toString();
                String gender = edtgender.getText().toString();
                anime.add(new uchiha(name,gender));
               
            }


        });
        Recycleradapter recycleradapter=new Recycleradapter( this,anime);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(recycleradapter);




    }

        }










