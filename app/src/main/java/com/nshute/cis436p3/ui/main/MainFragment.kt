package com.nshute.cis436p3.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.nshute.cis436p3.R
import org.json.JSONArray

class MainFragment : Fragment() {
    val url = "https://api.thecatapi.com/v1/breeds" //for dropdown population
    //val search_url = "https://api.thecatapi.com/images/search?breed_id=${selected_breed.id}" //for dropdown population

    private val breedName = arrayOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //spinner=(Spinner)findViewById(R.id.)
        //get_json()
    }

    /*
    fun get_json(){
        val queue = Volley.newRequestQueue(context)
        val request = StringRequest(
            Request.Method.GET, url,
            { response ->
                val data = response.toString()
                var jArray = JSONArray(data)
                for(i in 0..jArray.length()-1){
                    var jobject = jArray.getJSONObject(i)
                    var userId = jobject.getInt("userId")
                    var id = jobject.getInt("id")
                    var title = jobject.getString("title")
                    var body = jobject.getString("body")
                }
                Log.e("Error", response.toString())
            },
            Response.ErrorListener {  })
        queue.add((request))
    }
     */

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}