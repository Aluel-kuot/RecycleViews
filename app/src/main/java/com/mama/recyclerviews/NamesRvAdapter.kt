package com.mama.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NamesRvAdapter (var namesList:List<String>): RecyclerView.Adapter<NamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.names_list_items,parent,false)
        return NamesViewHolder(itemView)

    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        var currentName=namesList.get(position)
        holder.tvNames.text=currentName

    }
    override fun getItemCount(): Int {
        return namesList.size
    }
}
class NamesViewHolder(itemView:View):ViewHolder(itemView){
    var tvNames=itemView.findViewById<TextView>(R.id.tvNames)

}
