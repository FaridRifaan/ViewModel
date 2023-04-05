package com.latihan.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.latihan.viewmodel.databinding.ActivityUsingViewModelBinding


class UsingViewModel : AppCompatActivity() {
    lateinit var binding : ActivityUsingViewModelBinding

    lateinit var btnHitung : Button
    lateinit var etPanjang : EditText
    lateinit var etLebar : EditText
     lateinit var etTinggi : EditText
     lateinit var txtHasil : TextView
     lateinit var viewModel : HitungViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUsingViewModelBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        viewModel = ViewModelProvider(this).get(HitungViewModel::class.java)
        txtHasil.text = viewModel.hasil.toString()


        btnHitung.setOnClickListener{
            var pj = etPanjang.text.toString().toInt()
            var lb = etLebar.text.toString().toInt()
            var tg = etTinggi.text.toString().toInt()
            viewModel.Hitung(pj,lb,tg)
            txtHasil.text = viewModel.hasil.toString()
        }

    }
    fun displayResult(){
        txtHasil.text = viewModel.hasil.toString()
    }


}