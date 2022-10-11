package com.example.staggeredlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    Context context;
    List<UserModel> userModelList=new ArrayList<>();
    MainActivity onItemClick;

    public UserAdapter(Context context, List<UserModel> userModelList, MainActivity onItemClick) {
        this.context = context;
        this.userModelList = userModelList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public UserAdapter.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root=LayoutInflater.from(parent.getContext()).inflate(R.layout.customrecyclerview,parent,false);
        return new UserHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserHolder holder, int position) {

        holder.img.setImageResource(userModelList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {

        ImageView img;
        public UserHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.imgid);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClick.OnClick(getAdapterPosition());
                }
            });
        }
    }
}
