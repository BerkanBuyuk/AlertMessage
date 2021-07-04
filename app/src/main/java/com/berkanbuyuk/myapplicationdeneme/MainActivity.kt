package com.berkanbuyuk.myapplicationdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext,"Hoşgeldiniz",Toast.LENGTH_SHORT).show()
    }

    fun kaydet(view : View)
    {
        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setTitle("Uyarı")
        uyariMesaji.setMessage("Emin Misiniz ?")
        uyariMesaji.setPositiveButton("Hayır"){dialog, which->
            Toast.makeText(applicationContext,"Kayıt Başarısız",Toast.LENGTH_SHORT).show()
        }
        uyariMesaji.setNegativeButton("Evet"){dialog, which->
            Toast.makeText(applicationContext,"Kaydedildi",Toast.LENGTH_SHORT).show()
        }
        uyariMesaji.show()
    }
}