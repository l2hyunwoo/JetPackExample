package com.example.jetpackexample

fun main(){
    //변
    val str = "Hello"

    //Int, Float, Double

    //상수
    // t = 10 -> 안됨

    print("$str World")
    // print(str + "World") 와 동치

    print("${myMethod(10, 20)}")

    val items = listOf(1,2,3,4,5) // Int
    print(items)

    //list는 한번 생성되면 불변
    //변하는 리스트 == ArrayList
    val items2 = arrayListOf(1,2,3,4,5)
    items2.add(6)
    items2.remove(1)

    items2[0] = 10
    items2[0] = 10

    for(i in 0..9){
        println(i)
    }

    for(item in items2){
        println(item)
    }

    //when 문
    //when문은 처음 조건이 맞는 하나의 식만 실행됨
    when(20){
        1 -> print("1임")
        2 -> print("2임")
        3 -> print("3임")
        20 -> print("20임")
        in 6..20 -> print("620임")
        in 10..20 -> print("1020사이아")
        else -> print("else")
    }
}

//fun myMethod(a : Int, b : Int) : Int {
//    return a + b
//}

fun myMethod (a : Int, b : Int) = a + b

// Unit == Void 타입

//멤버 변수로 정의 안해줘도 이미 name이라는 변수가 있다고 설정함
open class Person

