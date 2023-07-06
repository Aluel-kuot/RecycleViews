package com.mama.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNames:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        rvNames=findViewById(R.id.rvNames)

    var names= listOf("Rachel","Alice","Joyce","Hellen","Winnie","Paul","Diana","Rebecca",
        "natalie","Clever","Peace","Wanja","Mary")
    val namesAdapter=NamesRvAdapter(names)
    rvNames.layoutManager=LinearLayoutManager(this)
    rvNames.adapter=namesAdapter


 }

}
