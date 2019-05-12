package com.example.aa_bmi.ui

import com.example.aa_bmi.R
import com.example.aa_bmi.logic.calculate
import com.example.aa_bmi.ui.base.BaseActivity
import com.example.aa_bmi.model.*
import kotlinx.android.synthetic.main.activity_main.*

class BMIActivity : BaseActivity() {
    override fun getLayoutResourceId() = R.layout.activity_main

    override fun setUpUi() {
        buttonCalculate.setOnClickListener {

            val BMI: Double = calculate(enterHeight.text.toString().toDouble(), enterWeight.text.toString().toDouble())

            setResValues(BMI)
        }
    }
    private fun setResValues(BMI:Double){
        val resources = getResources(BMI)
        val BMI_text:String = "%.2f".format(BMI)
        if(BMI > 0.0 && BMI < 56) textResult.text = BMI_text
        textResult.setTextColor(getResources().getColor(resources.textColor))
        textDesc.setTextColor(getResources().getColor(resources.textColor))
        textDesc.text = getString(resources.desc)
        imgFront.setImageResource(resources.imageFront)
        imgSide.setImageResource(resources.imageSide)
    }
}
