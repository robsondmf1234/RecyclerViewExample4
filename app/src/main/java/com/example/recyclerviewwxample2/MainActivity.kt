package com.example.recyclerviewwxample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeExample = gerarExample(101)

        recycler_view.adapter = ExampleAdapter(listaDeExample)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

    }


    private fun gerarExample(size: Int): List<ExampleItem> {

        val list = ArrayList<ExampleItem>()

        for (i in 1 until size) {
            val item = ExampleItem("Item $i", "Descrição $i")
            list += item
        }
        return list
    }
}