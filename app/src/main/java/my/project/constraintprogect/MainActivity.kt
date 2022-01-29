package my.project.constraintprogect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import my.project.constraintprogect.databinding.MainActivityBinding



class MainActivity : AppCompatActivity() {
    //private lateinit var bindings:   ActivityMainBinding
    private lateinit var bindings: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.main_activity)
        bindings = DataBindingUtil.setContentView(this,R.layout.main_activity)
       /*findViewById<Button>(R.id.button_done).setOnClickListener {
            addNickname(it)

        }*/
        bindings.buttonDone.setOnClickListener{addNickname(it)}
    }

    private fun addNickname(view: View)
    {
        //val editText = findViewById<EditText>(R.id.name_adit)
        //val nicknameTextView = findViewById<TextView>(R.id.textViewNickName)
        // nicknameTextView.text = editText.text
       //  editText.visibility = View.GONE
        //nicknameTextView.visibility = View.VISIBLE
        bindings.apply {
        bindings.textViewNickName.text = bindings.nameAdit.text
            invalidateAll()
        bindings.nameAdit.visibility = View.GONE
        bindings.textViewNickName.visibility = View.VISIBLE

        }



    }




}