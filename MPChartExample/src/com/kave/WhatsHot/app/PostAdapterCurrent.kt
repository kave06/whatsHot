package com.kave.WhatsHot.app

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kave.WhatsHot.R

/**
 * Created by kave on 6/01/18.
 */

class PostAdapterCurrent(dataSet: List<PostCurrent>) : RecyclerView.Adapter<PostAdapterCurrent.ViewHolder>(){

    val dataSet : List<PostCurrent> = dataSet
    final var onClick : (View)-> Unit = {}

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView_tit = view.findViewById<TextView>(R.id.textView_title) as TextView
        val textView_temp = view.findViewById<TextView>(R.id.textView_temperature) as TextView
        val textView_humi = view.findViewById<TextView>(R.id.textView_humidity) as TextView

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.current_state, parent,false)

        view.setOnClickListener(View.OnClickListener { view ->
            this.onClick(view)
        })
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.let { holder ->

            holder.textView_temp.setText(""+ this.dataSet[position].currentTemp)
            holder.textView_humi.setText(""+ this.dataSet[position].currentHumi)
            holder.textView_tit.text = this.dataSet[position].currentDate.toString()

        }

    }


    override fun getItemCount(): Int {

        return  this.dataSet.size
    }

}