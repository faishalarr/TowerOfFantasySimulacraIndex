package com.example.toweroffantasyindex.simulacra

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.toweroffantasyindex.R

class SimulacraAdapter(val listSimulacra: ArrayList<SimulacraModel>) : RecyclerView.Adapter<SimulacraAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_row_simulacra, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSimulacra.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, rarity, image,weapname,resonance,element,shatter,charge,substat,elereso,weap_reso) = listSimulacra[position]

        Glide.with(holder.itemView.context)
            .load(image)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvRarity.text = rarity

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, SimulacraDetail::class.java)
            moveDetail.putExtra(SimulacraDetail.EXTRA_RARITY, rarity)
            moveDetail.putExtra(SimulacraDetail.EXTRA_NAME, name)
            moveDetail.putExtra(SimulacraDetail.EXTRA_PHOTO, image)
            moveDetail.putExtra(SimulacraDetail.EXTRA_WEAPONNAME, weapname)
            moveDetail.putExtra(SimulacraDetail.EXTRA_RESONANCE, resonance)
            moveDetail.putExtra(SimulacraDetail.EXTRA_ELEMENT, element)
            moveDetail.putExtra(SimulacraDetail.EXTRA_SHATTER, shatter)
            moveDetail.putExtra(SimulacraDetail.EXTRA_CHARGE, charge)
            moveDetail.putExtra(SimulacraDetail.EXTRA_SUBSTAT, substat)
            moveDetail.putExtra(SimulacraDetail.EXTRA_ELERESO, elereso)
            moveDetail.putExtra(SimulacraDetail.EXTRA_WEAPONRESO, weap_reso)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvNamaSimulacra)
        var tvRarity: TextView = itemView.findViewById(R.id.tvRaritySimulacra)
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageSimulacra)
    }

}