package lat.pam.myapplicationuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tujuanSpinner: Spinner = findViewById(R.id.tujuanSpinner)

        val tujuanOptions = arrayOf("Cihampelas", "Cibiru",)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, tujuanOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        tujuanSpinner.adapter = adapter


        val btnClick: Button = findViewById(R.id.submitButton)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.submitButton ->{
                    val pindahIntent = Intent( this, MainActivity2::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}
