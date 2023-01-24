package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var one:Button
    private lateinit var two:Button
    private lateinit var three:Button
    private lateinit var four:Button
    private lateinit var five:Button
    private lateinit var six:Button
    private lateinit var seven:Button
    private lateinit var eight:Button
    private lateinit var nine:Button
    private lateinit var zero:Button
    private lateinit var show_num:TextView
    private lateinit var show_answer:TextView
    private lateinit var dot:Button
    private lateinit var exit:Button
    private lateinit var equal:Button
    private lateinit var div:Button
    private lateinit var multply:Button



    private var ispoint=true
    private var is_div=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initui()

        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        zero.setOnClickListener(this)
    dot.setOnClickListener{
        if(ispoint){
            show_answer.text=show_answer.text.toString()+"."
            ispoint=false
        }

    }

        exit.setOnClickListener{
            show_answer.text="0"
            ispoint = true

        }

        div.setOnClickListener{
            if(is_div==true){
                show_answer.text=show_answer.text.toString()+"/"
                is_div=false
            }
            else {
                if (show_answer.text != "0") {
                    show_answer.text =
                        show_answer.text.substring(0, show_answer.text.length - 1) + "/"
                }
            }
        }
    }

    override fun onClick(p0: View?) {
        val btn=findViewById<Button>(p0!!.id)
        if(show_answer.text!="0") {
            show_answer.text = show_answer.text.toString() + btn.text
            //Log.d("TAG", btn.text.toString())
        }
        else {
            show_answer.text = btn.text
        }
        show_num.text=calculate()
    }



    private fun calculate(): String{
        var r = "123"
        return r
    }

    fun addSimvol(simvol:String){
        if (




        )
    }

    fun createArray(s:String):MutableList<Any>{
        var list= mutableListOf<Any>()
        var temp=""

        for (i in s){
            if(i.isDigit() || i=='.'){
                temp+=i
            }

        }
    }


    fun initui(){
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)
        dot=findViewById(R.id.dot)
        exit=findViewById(R.id.exit)
        equal=findViewById(R.id.equal)
        show_num=findViewById(R.id.show_num)
        show_answer=findViewById(R.id.show_answer)
        div=findViewById(R.id.div)
        multply=findViewById(R.id.multiple)
    }
}