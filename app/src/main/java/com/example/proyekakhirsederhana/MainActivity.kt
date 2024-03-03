package com.example.proyekakhirsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvUniversity: RecyclerView
    private  var list :ArrayList<University> = arrayListOf()
    private var menu: Menu? = null
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvUniversity = findViewById(R.id.rv_university)
        rvUniversity.setHasFixedSize(true)

        list.addAll(UniData.listData)
        showRecyclerList()
    }


    private fun showSelectedUni(univ: University) {
        Toast.makeText(this,  "You choose  " + univ.name, Toast.LENGTH_SHORT).show()
        val moveIntentDetail = Intent(this, UI::class.java)
        moveIntentDetail.putExtra(UI.UNI_DATA, univ)
        startActivity(moveIntentDetail)
    }

    private fun showRecyclerList() {
        rvUniversity.layoutManager = LinearLayoutManager(this)
        val listUniAdapter = ListUniAdapter(list)
        rvUniversity.adapter = listUniAdapter

        listUniAdapter.setOnItemClickCallback(object : ListUniAdapter.OnItemClickCallback {
            override fun onItemClicked(data: University) {
                showSelectedUni(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        this.menu = menu
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_profile -> {
                title = "My Profile"
                val about = Intent(this, AboutActivity::class.java)
                startActivity(about)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}