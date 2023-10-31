package lat.pam.myapplicationuts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView


class MainActivity3 : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val imgClick: ImageView = findViewById(R.id.pizza1)
        imgClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.pizza1 ->{
                    val pindahIntent = Intent( this, MainActivity4::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }

}