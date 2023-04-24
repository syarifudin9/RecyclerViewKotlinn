package com.example.recyclerviewkotlinn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.superman,
                "SUPERMAN",
                "Laser eye"
            ),

            Superhero(
                R.drawable.batman,
                "BATMAN",
                "Bat power"
            ),

            Superhero(
                R.drawable.yar,
                "YAR",
                "Split time"
            ),

            Superhero(
                R.drawable.robin,
                "ROBIN",
                "Smart Boy"
            ),

            Superhero(
                R.drawable.atomsmasher,
                "ATOMSMASHER",
                "Atom crasher"
            ),

            Superhero(
                R.drawable.atrocitus,
                "ATROCITUS",
                "Blood power"
            ),

            Superhero(
                R.drawable.beastboy,
                "BEASTBOY",
                "Beast and Splash"
            ),

            Superhero(
                R.drawable.bigbarda,
                "BIG BARDA",
                "Ladies power"
            ),

            Superhero(
                R.drawable.greenlatern,
                "GREEN LATERN",
                "Green fire"
            ),

            Superhero(
                R.drawable.cyborg,
                "CYBORG",
                "Radical beam"
            ),

            Superhero(
                R.drawable.aquaman,
                "AQUAMAN",
                "Water power"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}