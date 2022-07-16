package com.example.landmark

import android.animation.ObjectAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LandmarkAdapter(val onClickListener: OnClickListener) : RecyclerView.Adapter<LandmarkAdapter.LandmarkViewHolder>() {

    var item: List<Landmark> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkViewHolder {
        return LandmarkViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.landmark_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LandmarkViewHolder, position: Int) {
        holder.itemView.setOnClickListener{

           onClickListener.clickListener(item[position])
        }

        holder.bind(item[position])
    }

    override fun getItemCount(): Int {
        return item.size
    }

    fun setData(landmark: ArrayList<Landmark>) {
        val data = LandmarkModel.setData()
        item = data
    }


    class LandmarkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var theAuthor: TextView = view.findViewById(R.id.author)
        var theImage: ImageView = view.findViewById(R.id.image)
        var theitle: TextView = view.findViewById(R.id.tittle)
        var theStory: TextView = view.findViewById(R.id.story)
        var theCountry: TextView = view.findViewById(R.id.country)

        fun bind(landmark: Landmark) {
            theAuthor.text = landmark.author
            theImage.setImageResource(landmark.image)
            theStory.text = landmark.story
            theStory.text = landmark.story
            theCountry.text = landmark.country
        }
    }
    class OnClickListener(val clickListener: (landmark: Landmark) -> Unit){
       fun onClick(itemClicker : Landmark) = clickListener(itemClicker)

    }
}