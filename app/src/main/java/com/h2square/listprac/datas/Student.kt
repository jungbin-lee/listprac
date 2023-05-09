package com.h2square.listprac.datas
//학생 하위정보 이름, 출생년도
class Student(
    val name : String ,
    val birthYear:Int) {

        fun getMyAge ():Int{
            val mtage = 2023-this.birthYear+1
            return mtage
        }

}