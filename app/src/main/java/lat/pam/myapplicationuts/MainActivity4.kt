package lat.pam.myapplicationuts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity4 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnClick: Button = findViewById(R.id.orderButton )
        btnClick.setOnClickListener(this)

        val backButton: Button = findViewById(R.id.backButton) // Gantilah R.id.backButton dengan ID yang sesuai
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.orderButton ->{
                    val pindahIntent = Intent( this, MainActivity5::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }

    


}