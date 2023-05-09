package com.h2square.listprac.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.h2square.listprac.R
import com.h2square.listprac.datas.Student
import java.util.*

class StudentAdapter(val mContext: Context,
                     val resId: Int,
                     val mList: ArrayList<Student>):ArrayAdapter<Student>(mContext,resId,mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow= convertView
        if (tempRow==null){
            tempRow = inf.inflate(
                R.layout.student_list_item,null
            )
        }
        val row = tempRow!!
        val studentData =mList[position]

        val nameTxt =row.findViewById<TextView>(R.id.nameTxt)
        val birthTxt = row.findViewById<TextView>(R.id.birthTxt)

        nameTxt.text = studentData.name
        //
        val koreanAge =2023 - studentData.birthYear +1

        birthTxt.text ="(${studentData.getMyAge()}세)"

        return row
    }

    fun aaa(){

    }

}