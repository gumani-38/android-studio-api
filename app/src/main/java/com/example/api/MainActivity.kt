package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var btnAccu: Button
    private lateinit var btnEbird: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAccu = findViewById(R.id.btnAccu)
        btnEbird = findViewById(R.id.btnEbird)

        btnAccu.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                val data = api.accuRetrofit.get5DayData("Iu043mNAqFTJ7SX5115XfRKuKUv9z4lO", "true")
                if (data.isSuccessful) {
                    launch(Dispatchers.Main) {
                        findViewById<TextView>(R.id.text).text = data.body().toString()
                    }
                } else {
                    Log.v("accu", data.code().toString())
                }

            }
        }
            btnEbird.setOnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    val data =
                        api.eBirdRetrofit.getBirdData("-25.731340", "28.218370", "fcj0sukk3qm4")
                    if (data.isSuccessful) {
                        launch(Dispatchers.Main) {
                            findViewById<TextView>(R.id.text).text = data.body().toString()
                        }
                    } else {
                        Log.v("ebird", data.code().toString())
                    }

                }
            }




        }
}