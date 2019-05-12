package com.example.aa_bmi.model

import com.example.aa_bmi.R

data class Resources(val desc: Int, val imageFront: Int, val imageSide: Int, val textColor:Int)

fun getResources(BMI:Double): Resources{
    val desc:Int
    val imageFront:Int
    val imageSide:Int
    val textColor:Int

    when{
        BMI in 10.0..18.5 -> {
            desc = R.string.underweight_bodytype_desc
            imageFront = R.drawable.underweight_front
            imageSide = R.drawable.underweight_side
            textColor = R.color.underweight_color
        }

        BMI in 18.5..25.0 ->{
                desc = R.string.normal_bodytype_desc
                imageFront = R.drawable.normal_front
                imageSide = R.drawable.normal_side
                textColor = R.color.normal_color
        }
        BMI in 25.0..30.0 -> {
        desc = R.string.overweight_bodytype_desc
        imageFront = R.drawable.overweight_front
        imageSide = R.drawable.overweight_side
            textColor = R.color.overweight_color
        }
        BMI in 30.0..56.0 -> {
            desc = R.string.obese_bodytype_desc
            imageFront = R.drawable.obese_front
            imageSide = R.drawable.obese_side
            textColor = R.color.obese_color
        }
        else -> {
            desc = R.string.empty
            imageFront = R.drawable.empty
            imageSide = R.drawable.empty
            textColor = R.color.obese_color
        }

    }
    return Resources(
        desc,
        imageFront,
        imageSide,
        textColor
    )
}