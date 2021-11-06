package com.example.asm1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asm1.R;
import com.example.asm1.model.TodotodaytaskModel;

import java.util.ArrayList;



public class TodaytaskAdapter extends RecyclerView.Adapter<TodaytaskAdapter.MyViewHolder> {

    boolean showingfirst = true;
    Context context;

    int myPos = 0;
    private ArrayList<TodotodaytaskModel>todotodaytaskModelArrayList;

    public TodaytaskAdapter(Context context, ArrayList<TodotodaytaskModel> todotodaytaskModelArrayList) {
        this.context = context;
        this.todotodaytaskModelArrayList = todotodaytaskModelArrayList;
    }

    @NonNull
    @Override
    public TodaytaskAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.today_item, parent, false);
        return new MyViewHolder(view);
    }


    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull final TodaytaskAdapter.MyViewHolder holder, final int position) {
        TodotodaytaskModel modelfoodrecycler = todotodaytaskModelArrayList.get(position);

        holder.todoimg.setImageResource(modelfoodrecycler.getTodoimg());
        holder.todoimg2.setImageResource(modelfoodrecycler.getTodoimg2());
        //holder.tododottedimg.setImageResource(modelfoodrecycler.getTodoimg());


        holder.todotext.setText(modelfoodrecycler.getTodotext());
        holder.todotext2.setText(modelfoodrecycler.getTodotext2());
        holder.todotext3.setText(modelfoodrecycler.getTodotext3());
        holder.todotext4.setText(modelfoodrecycler.getTodotext4());
        holder.todotext5.setText(modelfoodrecycler.getTodotext5());

        if(position==3){
            holder.tododottedimg.setVisibility(View.GONE);
        }
        else {
            holder.tododottedimg.setVisibility(View.VISIBLE);
        }

        if (position == 0){
            holder.todotext2.setTextColor(Color.parseColor("#fe7d1f"));

            // holder.hoteltext1.setBackgroundResource(Color.parseColor("ffffff"));
        }else if(position == 1){

            holder.todotext2.setTextColor(Color.parseColor("#1377ec"));
            // holder.hoteltext1.setBackgroundColor(Color.parseColor("#00000000"));
        }else if(position == 2) {

            holder.todotext2.setTextColor(Color.parseColor("#fe7d1f"));
        }else if(position == 3) {

            holder.todotext2.setTextColor(Color.parseColor("#8e5cdd"));

        }


        if (position == 0){
            holder.todoimg.setBackgroundResource(R.drawable.todaytaskorange_ract);
        //   holder.radio.setButtonTintList(colorStateList1);//set the color tint list


            // holder.hoteltext1.setBackgroundResource(Color.parseColor("ffffff"));
        }else if(position == 1){

            holder.todoimg.setBackgroundResource(R.drawable.todaytaskblue_ract);
           // holder.radio.setButtonTintList(colorStateList);//set the color tint list

            // holder.hoteltext1.setBackgroundColor(Color.parseColor("#00000000"));
        }else if(position == 2) {


            holder.todoimg.setBackgroundResource(R.drawable.todaytaskorange_ract);
        }else if(position == 3) {

            holder.todoimg.setBackgroundResource(R.drawable.todaytaskpurple_ract);
            //holder.radio.setButtonTintList(colorStateList2);//set the color tint list


        }
    }

    @Override
    public int getItemCount() {
        return todotodaytaskModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView todotext,todotext2,todotext3,todotext4,todotext5;
       ImageView todoimg,tododottedimg,todoimg2;
     //   RadioButton radio;
        public MyViewHolder(View itemView) {
            super(itemView);


            todotext = (itemView).findViewById(R.id.todotext);
            todotext2 = (itemView).findViewById(R.id.todotext2);
            todotext3 = (itemView).findViewById(R.id.todotext3);
            todotext4 = (itemView).findViewById(R.id.todotext4);
            todotext5 = (itemView).findViewById(R.id.todotext5);

            tododottedimg = (itemView).findViewById(R.id.tododottedimg);
            todoimg = (itemView).findViewById(R.id.todoimg);
            todoimg2 = (itemView).findViewById(R.id.todoimg2);



        }
    }
}
