//package com.example.kotlin_basics.adapter
/*
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlin_basics.R
import com.example.kotlin_basics.adapter.RandomUserAdapter.RandomUserViewHolder
import com.example.kotlin_basics.model.Student

class StudentAdapter(private val studentList: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_list_item_randomuser, parent, false
        );
        return RandomUserViewHolder(view);
    };

    override fun onBindViewHolder(holder: RandomUserViewHolder, position: Int) {
        val user = userList[position];
        holder.nameText.text = user.name.first + " " + user.name.last;
        holder.emailText.text = user.email;
        holder.countryText.text = user.Location.country;

        Glide.with(holder.itemView.context)
            .load(user.picture.medium)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .into(holder.profileImage)
    }

    override fun getItemCount() = userList.size;

}*/