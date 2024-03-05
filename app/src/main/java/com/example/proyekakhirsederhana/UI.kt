package com.example.proyekakhirsederhana

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyekakhirsederhana.databinding.ActivityUiBinding

class UI : AppCompatActivity() {

    private var title: String = ""

    companion object{
       const val UNI_DATA = "uni_data"
    }

    private lateinit var binding: ActivityUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setActionBarTitle(title)

        val univData = intent.getParcelableExtra<University>(UNI_DATA)


        if(univData != null) {



            binding.tvNameUi.text = univData.name
            binding.tvDetailUi.text = univData.detail
            binding.imgUi.setImageResource(univData.photo)
            binding.tvAlamat.text = univData.alamat
            binding.tvNomor.text = univData.telephone

            setActionBarTitle(binding.tvNameUi.text.toString())

            binding.actionShare.setOnClickListener{
                val intent = Intent(Intent.ACTION_SEND)
                intent.setType("image/jpeg")
                intent.putExtra(Intent.EXTRA_STREAM, univData.photo)
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                startActivity(Intent.createChooser(intent, "send"))
            }


            binding.btnSetFavorite.setOnClickListener{
                Toast.makeText(this,  "you add ${binding.tvNameUi.text} to the favorite list", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}