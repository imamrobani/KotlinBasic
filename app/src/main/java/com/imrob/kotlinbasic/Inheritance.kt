package com.imrob.kotlinbasic


// super class, parent class
open class Cars (name: String, brand: String) {

    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance")
    }
}

class ElectricCars(name: String, brand: String, batteryLife: Double): Cars(name, brand) {

    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }
}


fun main(){
    var audi3 = Cars("A3", "Audi")
    var tesla = ElectricCars("S-Model", "Tesla", 80.0)

    audi3.drive(200.0)
    tesla.drive(200.0)
    tesla.drive()
}