package com.example.viewsandviewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onGeneratePerson(view: View)
    {
        val firstName = etFirstName.text.toString()
        val lastName = etLastName.text.toString()
        val streetAddress = etStreetAddress.text.toString()
        val city = etCity.text.toString()
        val state = etState.text.toString()
        val zip = etZip.text.toString()

        val person = Person(firstName, lastName, streetAddress, city, state, zip)
        etPrintFirstName.setText(person.firstName.toCharArray(),0, person.firstName.length)
        etPrintLastName.setText(person.lastName.toCharArray(),0, person.lastName.length)
        etPrintStreet.setText(person.street.toCharArray(),0, person.street.length)
        etPrintCity.setText(person.city.toCharArray(),0, person.city.length)
        etPrintState.setText(person.state.toCharArray(),0, person.state.length)
        etPrintZip.setText(person.zip.toCharArray(),0, person.zip.length)

    }
}
