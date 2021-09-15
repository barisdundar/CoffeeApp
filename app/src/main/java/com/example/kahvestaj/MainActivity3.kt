package com.example.kahvestaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val intent=getIntent()
        val alinanVeri=intent.getStringExtra("yollananVeri")
        val özet: TextView =findViewById(R.id.textView7)
        özet.text=alinanVeri
        val name=getIntent()
        val fiyat=intent.getStringExtra("fiyat")
        val fiyatı:TextView=findViewById(R.id.textView6)
        fiyatı.text=fiyat
        val boy1=getIntent()
        val boyunalintisi=intent.getStringExtra("boy")
        val y:TextView=findViewById(R.id.textView4)
        y.text=boyunalintisi
        val adet=getIntent()
        val adetsayisi=intent.getStringExtra("adet")
        val z:TextView=findViewById(R.id.textView2)
        z.text=adetsayisi
    }
}