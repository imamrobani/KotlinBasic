package com.imrob.kotlinbasic

fun main(){
    for(num in 1..10000) {
        if(num == 9001)
            print("IT'S OVER 9000!!!")
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }

}