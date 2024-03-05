package com.example.proyekakhirsederhana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyekakhirsederhana.databinding.ActivityUiBinding

class UI : AppCompatActivity() {

    private var title: String = ""

    companion object{
       const val UNI_DATA = "uni_data"
    }

//    private lateinit var binding: ActivityUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)
        setActionBarTitle(title)

        val namaUniv: TextView = findViewById(R.id.tv_ui)
        val detailUniv: TextView = findViewById(R.id.tv_detail_ui)
        val photoUniv: ImageView= findViewById(R.id.img_ui)
        val alamatUniv : TextView = findViewById(R.id.tv_alamat)
        val nomorUniv : TextView = findViewById(R.id.tv_nomor)

        val univData = intent.getParcelableExtra<University>(UNI_DATA)


        if(univData != null) {

            namaUniv.text = univData.name
            detailUniv.text = univData.detail
            photoUniv.setImageResource(univData.photo ?: 0)
            alamatUniv.text = univData.alamat
            nomorUniv.text = univData.telephone

            setActionBarTitle(namaUniv.text.toString())

            val share : Button = findViewById(R.id.action_share)
            share.setOnClickListener{
                val intent = Intent(Intent.ACTION_SEND)
                intent.setType("image/jpeg")
                intent.putExtra(Intent.EXTRA_STREAM, univData.photo ?: 0)
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                startActivity(Intent.createChooser(intent, "send"))
            }

            val favorit: Button = findViewById(R.id.btn_set_favorite)
            favorit.setOnClickListener{
                Toast.makeText(this,  "kamu menambahkan ${namaUniv.text.toString()} ke daftar favorit", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}