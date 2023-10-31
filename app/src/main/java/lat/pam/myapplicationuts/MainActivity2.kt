package lat.pam.myapplicationuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btnClick: Button = findViewById(R.id.seeMenusButton)
        btnClick.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.seeMenusButton ->{
                    val pindahIntent = Intent( this, MainActivity3::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }


}