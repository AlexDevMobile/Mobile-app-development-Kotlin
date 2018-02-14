package com.alexdev.mobileappdevelopment.fragments.home

/**
 * Created by alexdev on 14/02/18.
 */
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexdev.mobileappdevelopment.R
import com.alexdev.mobileappdevelopment.activities.unit_1.HelloWordActivity
import com.alexdev.mobileappdevelopment.adapters.Unit1Adapter
import com.alexdev.mobileappdevelopment.models.ItemPractice
import kotlinx.android.synthetic.main.fragment_unit_1.*
import kotlinx.android.synthetic.main.fragment_unit_1.view.*

/**
 * Created by chirag on 31/7/17.
 */
class Unit1Fragment : Fragment(){

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: Unit1Adapter
    companion object {
        fun newInstance(): Unit1Fragment {
            var fragmentUnit1 = Unit1Fragment()
            var args = Bundle()
            fragmentUnit1.arguments = args
            return fragmentUnit1
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_unit_1, container, false)
        linearLayoutManager = LinearLayoutManager(this.context)
        rootView.recyclerView.layoutManager = linearLayoutManager
        val items: ArrayList<ItemPractice> = arrayListOf(
                ItemPractice(
                        "Hello word!!",
                        "text",
                        HelloWordActivity.create()
                )
        )
        adapter = Unit1Adapter(items, this.activity)
        rootView.recyclerView.adapter = adapter
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //editTextHome = view!!.findViewById(R.id.editTextHome) as EditText
    }
}