package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.Thisholder> {
    Context context;
    ArrayList<uchiha> anime;
    AlertDialog.Builder builder;
     Recycleradapter(Context context, ArrayList<uchiha> anime){
        this.context= context;
        this.anime=anime;
    }
    @NonNull
    @Override
    public Recycleradapter.Thisholder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.link,parent,false);
        Thisholder thisholder=new Thisholder(view);

        return thisholder;
    }

    @Override
    public void onBindViewHolder(@NonNull  Recycleradapter.Thisholder holder, int position) {
             uchiha uu= anime.get(position);
        holder.txtname.setText(uu.getName());
        holder.txtgender.setText(uu.getGender());





    }



    @Override
    public int getItemCount() {
        return anime.size();
    }


    public class Thisholder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView txtname;
        public TextView txtgender;
        public Button btndelete;

        public Thisholder(@NonNull  View itemView) {
            super(itemView);
            this.imageView=(ImageView)itemView.findViewById(R.id.img1);
            this.txtname=(TextView)itemView.findViewById(R.id.text11);
            this.txtgender=(TextView)itemView.findViewById(R.id.text22);

        }
    }
}
