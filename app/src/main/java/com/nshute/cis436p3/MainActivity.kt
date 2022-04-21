package com.nshute.cis436p3

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
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