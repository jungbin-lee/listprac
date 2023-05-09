package com.h2square.listprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.h2square.listprac.adapters.StudentAdapter
import com.h2square.listprac.datas.Student
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()
    lateinit var mAdapter :StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("이정빈",1994))
        mStudentList.add(Student("이이정",1998))
        mStudentList.add(Student("이영지",2002))
        mStudentList.add(Student("안유진",2003))
        mStudentList.add(Student("김채원",2000))
        mStudentList.add(Student("사쿠라",1999))
        mStudentList.add(Student("이혜리",1994))
        mStudentList.add(Student("최예나",1999))

        mAdapter= StudentAdapter(this,R.layout.student_list_item,mStudentList)

        syudentListView.adapter=mAdapter
        
        
        
        syudentListView.setOnItemClickListener { parent, view, position, id ->
            val clickStudent = mStudentList[position]

            Toast.makeText(this,"${clickStudent.name}이 클릭됨",Toast.LENGTH_SHORT).show()
        }

        syudentListView.setOnItemLongClickListener { parent, view, position, id ->

            val longClickStudent =mStudentList[position]
            Toast.makeText(this,"${longClickStudent.name}길게 클릭됨",Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener true
        }
    }
}