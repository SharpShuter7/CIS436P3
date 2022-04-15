package com.nshute.cis436p3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.nshute.cis436p3.ui.main.MainFragment
import com.nshute.cis436p3.ui.main.Spinner

//headers[“x-api-key”] = "ABC123"
//need for API Key

class MainActivity : AppCompatActivity() {

    private var requestQueue: RequestQueue? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //instantiate the request queue
        requestQueue = Volley.newRequestQueue(this);

        //create object request
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET,  //the request method
            "https://jsonplaceholder.typicode.com/todos/1",  //the URL
            null,
            { response -> Log.i("JSON response", response.toString()) }
        ) { error -> Log.e("Volley Error", error.toString()) }

        //add request to the queue
        requestQueue!!.add(jsonObjectRequest)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.mainFragment, MainFragment.newInstance())
                .commitNow()

            supportFragmentManager.beginTransaction()
                .replace(R.id.spinnerFragment, Spinner.newInstance())
                .commitNow()
        }
    } //end of onCreate
}