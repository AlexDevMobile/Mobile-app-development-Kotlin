package com.alexdev.mobileappdevelopment.adapters

import android.app.Activity
import android.content.Intent
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexdev.mobileappdevelopment.R
import com.alexdev.mobileappdevelopment.models.ItemPractice
import kotlinx.android.synthetic.main.item_practice_layout.view.*

/**
 * Created by alexdev on 14/02/18.
 */
class Unit1Adapter(private val itemsPractice: ArrayList<ItemPractice>, private val activity: Activity) : RecyclerView.Adapter<Unit1Adapter.ItemHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Unit1Adapter.ItemHolder{
        val inflatedView = parent!!.inflate(R.layout.item_practice_layout, false)
        return ItemHolder(inflatedView)
    }

    override fun getItemCount() = itemsPractice.size

    override fun onBindViewHolder(holder: Unit1Adapter.ItemHolder, position: Int) {
        val item = itemsPractice[position]
        holder.bindItem(item)
    }

    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    class ItemHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var item: ItemPractice? = null

        init {
            v.setOnClickListener(this)

        }

        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")
            val context = v.context
            val showPhotoIntent = Intent(context, item!!.activity::class.java)
            context.startActivity(showPhotoIntent)
        }
        fun bindItem(item: ItemPractice) {
            this.item = item
            view.textViewTitle.text = item.title
        }
    }
}