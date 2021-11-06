package com.example.asm1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asm1.Add_Task_Todo;
import com.example.asm1.MainActivity;
import com.example.asm1.R;
import com.example.asm1.Today_Task_Todo;
import com.example.asm1.model.KwikListModelClass;

import java.util.List;



public class ToDo_ListRecycleAdapter extends RecyclerView.Adapter<ToDo_ListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<KwikListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public ToDo_ListRecycleAdapter(Context context, List<KwikListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_todo_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        KwikListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, MainActivity.class);
                    context.startActivity(i);
                }else if(position == 1) {
                    Intent i = new Intent(context, Add_Task_Todo.class);
                    context.startActivity(i);
                }else if(position == 2) {
                    Intent i = new Intent(context, Today_Task_Todo.class);
                    context.startActivity(i);
                }

            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


