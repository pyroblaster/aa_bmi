package com.example.aa_bmi.logic

fun calculate(height:Double, weight:Double):Double{
    if(weight<= 0 || weight > 350 || height <= 0 || height > 250){
        return 0.0
    }
    else if (weight/((height/100)*(height/100)) >56 || weight/((height/100)*(height/100)) <= 0.0){
        return 0.0
    }
    else return weight/((height/100)*(height/100))
}
