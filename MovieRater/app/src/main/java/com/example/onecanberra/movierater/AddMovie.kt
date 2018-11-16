package com.example.onecanberra.movierater

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_movie.*


class AddMovie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)

        checkBox1.setOnClickListener(View.OnClickListener {
            if(checkBox1.isChecked == true)
            {
                checkBox2.setVisibility(View.VISIBLE)
                checkBox3.setVisibility(View.VISIBLE)
            }
            else
            {
                checkBox2.setVisibility(View.INVISIBLE)
                checkBox3.setVisibility(View.INVISIBLE)
            }
        })

    }


    fun onButtonClick (v: View){

        //if(TextUtils.isEmpty(Name.getText()) or TextUtils.isEmpty(Description.getText()) or TextUtils.isEmpty(ReleaseDate.getText())){
            //Name.setError("Required!");
            //Description.setError("Required");
            //ReleaseDate.setError("Required");
        //}
        //else{
            //Toast.makeText(this,
                //"Title = "+ Name.text + "\nDescription = " + Description.text + "\nRelease Date = " +ReleaseDate.text,Toast.LENGTH_LONG).show()
        //}

        if(Name.getText().toString().isEmpty()) {
            Name.setError("Required")
        }
        if(Description.getText().toString().isEmpty()) {
            Description.setError("Required")
        }
        if(ReleaseDate.getText().toString().isEmpty()) {
            ReleaseDate.setError("Required")
        }


        val name = findViewById<EditText>(R.id.Name)
        val description = findViewById<EditText>(R.id.Description)
        var id: Int = radioLang.checkedRadioButtonId
        val langRadio:RadioButton = findViewById(id)
        val releasedate = findViewById<EditText>(R.id.ReleaseDate)

        var vioreason : String = ""
        var langreason : String = ""
        if (checkBox2.isChecked == true ) {
            vioreason = "Violence\n"
        }
        else if (checkBox2.isChecked == false) {
            vioreason = ""
        }
        if (checkBox3.isChecked == false) {
            langreason = "Language"
        }
        else if (checkBox3.isChecked == false) {
            langreason = ""
        }
        Toast.makeText(this,
            "Title = "+ name.text + "\nOverview = " + description.text + "\nRelease date = " + releasedate.text + "\nLanguage = " +langRadio.text + "\nSuitable for all ages = " +checkBox1.isChecked + "\nReason:\n" +vioreason + langreason,Toast.LENGTH_LONG).show()


    }



}




