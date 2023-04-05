package com.latihan.viewmodel.withrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.latihan.viewmodel.R
import com.latihan.viewmodel.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    lateinit var rvStudent : RecyclerView
    lateinit var studentVm : StudentViewModel
    lateinit var studentAdapter: StudentAdapter
    lateinit var binding : ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityStudentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initStudent()
        studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentVm.getStudentList()
        studentVm.studentList.observe(this, Observer {
            studentAdapter.setStudentData(it as ArrayList<DataStudent>)
        })


    }

    fun initStudent (){
        studentAdapter = StudentAdapter(ArrayList())
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = studentAdapter
    }

    fun setDataStudent(){
            
    }
}