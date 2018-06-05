package example.com.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        //Get the textView
        //val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = textView.text.toString()

        //convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count--

        textView.text = count.toString()
    }

    fun randomMe(view: View){
        //create intent to second activity
        val randomIntent = Intent(this, SecondActivity::class.java)
        //get data from text
        val countString = textView.text.toString()
        //convert string to int
        val count = Integer.parseInt(countString)

        //put data to intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        //start the new activity
        startActivity(randomIntent)
    }


}
