package example.com.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    @SuppressLint("SetTextI18n")
    private fun showRandomNumber(){
        //get the count from main activity
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //generate random number
        val random = Random()
        var randomInt = 0

        if (count > 0){
            randomInt = random.nextInt(count + 1)
        }

        //display random number
        textview_random.text = Integer.toString(randomInt)

        //subtitute the max value to label
        textview_label.text = getString(R.string.random_heading, count)
    }
}
