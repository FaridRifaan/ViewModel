package com.latihan.viewmodel.withrecyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.latihan.viewmodel.R

class StudentViewModel : ViewModel(){

    val list = arrayListOf(
        DataStudent("rido", "24616724", R.drawable.wiiii),
        DataStudent("hayu", "64634634", R.drawable.wiiii),
        DataStudent("wido", "536436436", R.drawable.wiiii),
        DataStudent("Ricardo", "454345435",  R.drawable.wiiii),
        DataStudent("Basudara", "3252664",  R.drawable.wiiii)
    )
    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudentList(){
        var stu = list
        studentList.value = stu
    }

}