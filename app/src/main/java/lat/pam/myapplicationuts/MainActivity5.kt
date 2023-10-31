package lat.pam.myapplicationuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val doneButton = findViewById<Button>(R.id.doneButton)
        val ambilSendiriCheckBox = findViewById<CheckBox>(R.id.checkBox)

        doneButton.setOnClickListener {
            // Mengecek status CheckBox "Ambil Sendiri"
            val isAmbilSendiriChecked = ambilSendiriCheckBox.isChecked

            // Membuat pesan berdasarkan status CheckBox
            val message = if (isAmbilSendiriChecked) {
                "Terimakasih Dea Lestari telah memesan di toko kami,pesanan pizza bisa diambil di store Cihampelas Terimakasih."
            } else {
                "Terimakasih Dea Lestari telah memesan di toko kami,pesanan pizza anda akan dikirim menggunakan Fast Delivery."
            }

            // Menampilkan pesan dalam AlertDialog
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("")
            alertDialogBuilder.setMessage(message)
            alertDialogBuilder.setPositiveButton("OK") { dialog, which ->
                dialog.dismiss()
            }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }
}
