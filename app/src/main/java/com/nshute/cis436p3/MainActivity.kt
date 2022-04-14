package com.nshute.cis436p3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.nshute.cis436p3.ui.main.MainFragment
import com.nshute.cis436p3.ui.main.Spinner

class MainActivity : AppCompatActivity() {

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
    }
}