package com.example.kahvestaj

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    var fiyatId:Double=10.0
    var sonfiyatId:Double=0.0
     lateinit var radioButton:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val seek = findViewById<SeekBar>(R.id.seekBar)
        val findik: CheckBox = findViewById(R.id.findikId)
        val nane: CheckBox = findViewById(R.id.naneId)
        val seker: CheckBox = findViewById(R.id.sekerId)
        val krema: CheckBox = findViewById(R.id.kremaId)


        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                val seekBarTexti: TextView = findViewById(R.id.seekbarinTexti)
                seekBarTexti.setText("Adet=$p1")
                sonfiyatId=fiyatId.times(p1)
                val fiyatId:TextView=findViewById(R.id.fiyatId)

                fiyatId.text=sonfiyatId.toString()



            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup3)
        val fiyat: TextView = findViewById(R.id.fiyatId)


        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton) {
                fiyatId = 10.0
                fiyatId += 0.0
                if (findik.isChecked) {
                    findik.toggle()

                    fiyatId = 10.0

                }
                if (nane.isChecked) {
                    nane.toggle()
                    fiyatId = 10.0


                }
                if (seker.isChecked) {
                    seker.toggle()
                    fiyatId = 10.0


                }
                if (krema.isChecked) {
                    krema.toggle()
                    fiyatId = 10.0


                }


                fiyat.text = fiyatId.toString()

            } else if (checkedId == R.id.radioButton2) {

                fiyatId = 10.0
                fiyatId += 2.5
                if (findik.isChecked) {
                    findik.toggle()

                    fiyatId = 12.5

                }
                if (nane.isChecked) {
                    nane.toggle()
                    fiyatId = 12.5


                }
                if (seker.isChecked) {
                    seker.toggle()
                    fiyatId = 12.5


                }
                if (krema.isChecked) {
                    krema.toggle()
                    fiyatId = 12.5


                }

                fiyat.text = fiyatId.toString()
            } else {
                fiyatId = 10.0
                fiyatId += 4.75
                if (findik.isChecked) {
                    findik.toggle()

                    fiyatId = 14.5
                }
                if (nane.isChecked) {
                    nane.toggle()
                    fiyatId = 14.5

                }
                if (seker.isChecked) {
                    seker.toggle()
                    fiyatId = 14.5

                }
                if (krema.isChecked) {
                    krema.toggle()
                    fiyatId = 14.5


                }
                fiyat.text = fiyatId.toString()
            }
        }

        findik.setOnCheckedChangeListener { buttonView, checkedId ->
            if (findik.isChecked) {
                fiyatId += 2.5
                fiyat.text = fiyatId.toString()
            }
            if (!findik.isChecked) {
                println(findik.isChecked)
                fiyatId -= 2.5

                fiyat.text = fiyatId.toString()

            }
        }
        nane.setOnCheckedChangeListener { buttonView, checkedId ->
            if (nane.isChecked) {
                fiyatId += 2.5
                fiyat.text = fiyatId.toString()
            }
            if (!nane.isChecked) {

                fiyatId -= 2.5

                fiyat.text = fiyatId.toString()

            }
            seker.setOnCheckedChangeListener { buttonView, checkedId ->

                fiyatId += 0.0

                fiyat.text = fiyatId.toString()

            }
            krema.setOnCheckedChangeListener { buttonView, checkedId ->
                fiyatId += 0.0

                fiyat.text = fiyatId.toString()
            }


            }
        val button: Button = findViewById(R.id.buttondevamet)
        button.setOnClickListener {
            val kullaniciVerisi: EditText = findViewById(R.id.isimId)
            val text=   kullaniciVerisi.text.toString()
            val intent = Intent(this, MainActivity3::class.java)
            val fiyatiGonder:TextView=findViewById(R.id.fiyatId)
            val x=fiyatiGonder.text.toString()
            val radioGroup: RadioGroup = findViewById(R.id.radioGroup3)
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            radioButton = findViewById(selectedOption)
            val seekbar_:TextView=findViewById(R.id.seekbarinTexti)
            val seekbar1=seekbar_.text.toString()
            intent.putExtra("boy", radioButton.text)
            intent.putExtra("adet", seekbar1)
            intent.putExtra("fiyat", x)
            intent.putExtra("yollananVeri", text)
            startActivity(intent)

            val uyariMesaji= AlertDialog.Builder(this)

            uyariMesaji.setTitle("İsim Hatası")
            uyariMesaji.setMessage("İsim Girmediniz Lütfen İsim Giriniz")




            uyariMesaji.show()

        }


        }



        }










