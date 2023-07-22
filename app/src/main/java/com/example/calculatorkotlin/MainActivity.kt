package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //define layouts
    var off: Button?=null
    var c:Button?=null
    var mod:Button?=null
    var div :Button?=null
    var multi :Button?=null
    var minus :Button?=null
    var plus :Button?=null
    var equal :Button?=null
    var dot :Button?=null
    var negative :Button?=null
    var zero :Button?=null
    var one :Button?=null
    var two :Button?=null
    var three :Button?=null
    var four :Button?=null
    var five :Button?=null
    var six :Button?=null
    var seven :Button?=null
    var eight :Button?=null
    var nine :Button?=null
    var input:TextView?=null
    var output:TextView?=null
    //define vars
    var firstValue:Double=Double.NaN
    var secondValue:Double?=null
    var currentSymbol:Char?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        off=findViewById<Button>(R.id.off)
        c=findViewById<Button>(R.id.c);
        mod=findViewById(R.id.precent);
        div=findViewById(R.id.div)
        multi=findViewById(R.id.multi)
        minus=findViewById(R.id.min)
        plus=findViewById(R.id.plus)
        equal=findViewById(R.id.equal)
        dot=findViewById(R.id.dot)
        negative=findViewById(R.id.negative)
        zero=findViewById<Button>(R.id.zero)
        one=findViewById(R.id.one)
        two=findViewById(R.id.two)
        three=findViewById(R.id.three)
        four=findViewById(R.id.four)
        five=findViewById(R.id.five)
        six=findViewById(R.id.six)
        seven=findViewById(R.id.seven)
        eight=findViewById(R.id.eight)
        nine=findViewById(R.id.nine)
        input=findViewById(R.id.input)
        output=findViewById(R.id.output)
        zero?.setOnClickListener (object: View.OnClickListener {
            override fun onClick(view:View):Unit{
             input?.setText(input!!.text.toString()+"0")
        }
        } )
        one?.setOnClickListener {
            input?.setText(input!!.text.toString()+"1")
        }
        two?.setOnClickListener {
            input?.setText(input!!.text.toString()+"2")
        }
        three?.setOnClickListener {
            input?.setText(input!!.text.toString()+"3")
        }
        four?.setOnClickListener {
            input?.setText(input!!.text.toString()+"4")
        }
        five?.setOnClickListener {
            input?.setText(input!!.text.toString()+"5")
        }
        six?.setOnClickListener {
            input?.setText(input!!.text.toString()+"6")
        }
        seven?.setOnClickListener {
            input?.setText(input!!.text.toString()+"7")
        }
        eight?.setOnClickListener {
            input?.setText(input!!.text.toString()+"8")
        }
        nine?.setOnClickListener {
            input?.setText(input!!.text.toString()+"9")
        }
        dot?.setOnClickListener {
            if(!input?.text.toString().contains(".")){
                input?.setText(input!!.text.toString()+".")
            } }
        negative?.setOnClickListener {
            if(input?.text.toString().isEmpty()){
                input?.setText("-")
            }else if(input?.text.toString()=="-"){
                input?.text=""
            }
            else{
                allCalculations();
                firstValue*=-1
                input?.setText(""+firstValue)
            }
        }
        plus?.setOnClickListener {
            allCalculations()
            currentSymbol= ADDITION
            input?.text=""
            output?.setText("$firstValue+")
        }
        minus?.setOnClickListener {
            allCalculations()
            currentSymbol= MINUS
            input?.text=""
            output?.setText("$firstValue-")
        }
        multi?.setOnClickListener {
            allCalculations()
            currentSymbol= MULTIPLICATION
            input?.text=""
            output?.setText("$firstValue*")
        }
        div?.setOnClickListener {
            allCalculations()
            currentSymbol= DIVISION
            input?.text=""
            output?.setText("$firstValue/")
        }
        mod?.setOnClickListener {
            allCalculations()
            currentSymbol= DIVISION
            input?.text=""
            output?.setText("$firstValue/")
        }
        equal?.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View) {
                allCalculations()
                input?.text=""
                output?.setText(""+firstValue)
                firstValue= Double.NaN
                secondValue=null
            }
        });
        c?.setOnClickListener {
           input?.text=""
            output?.setText("")
            firstValue= Double.NaN
            secondValue=null
        }
        off?.setOnClickListener {
            finish();
        }

    }
    fun allCalculations(){
        var myCalculator=Calculator()
        if(!java.lang.Double.isNaN(firstValue)){
           secondValue=input!!.text.toString().toDouble()
            when(currentSymbol){
                ADDITION->{firstValue=myCalculator.add(firstValue,secondValue!!)}
                MINUS->{
                    firstValue=myCalculator.minus(firstValue,secondValue!!)
                }
                MULTIPLICATION->{
                    firstValue=myCalculator.multi(firstValue,secondValue!!)
                }
                DIVISION->{
                    firstValue=myCalculator.div(firstValue,secondValue!!)
                }
                MOD->{
                    firstValue=myCalculator.mod(firstValue,secondValue!!)
                }
            }
        }
        else{
            firstValue=input!!.text.toString().toDouble()
        }
    }

    companion object{
        private const val ADDITION:Char='+'
        private const val MINUS:Char='-'
        private const val MULTIPLICATION:Char='*'
        private const val DIVISION:Char='/'
        private const val MOD:Char='%'
    }

}