package com.example.toweroffantasyindex.simulacra

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.toweroffantasyindex.R

class SimulacraDetail : AppCompatActivity(){

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.detail_simulacra)
    val actionbar = supportActionBar
    actionbar!!.title = "Detail Simulacra"
    actionbar.setDisplayHomeAsUpEnabled(true)

    val tvSetName: TextView = findViewById(R.id.tv_simulacra_name)
    val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
    val tvRarity: TextView = findViewById(R.id.tv_simulacra_rarity)
    val tvReso: TextView = findViewById(R.id.tv_resonance)
    val tvElement: TextView = findViewById(R.id.tv_element)
    val tvShatter: TextView = findViewById(R.id.tv_shatter)
    val tvCharge: TextView = findViewById(R.id.tv_charge)
    val tvSubstat: TextView = findViewById(R.id.tv_substat)
    val tvEleReso: TextView = findViewById(R.id.tv_set_ele_resonance)
    val tvWeapReso: TextView = findViewById(R.id.tv_weapon_resonance)
    val tvWeapName: TextView = findViewById(R.id.tv_weapon_name)


    val tName  = intent.getStringExtra(EXTRA_NAME)
    val tImg = intent.getStringExtra(EXTRA_PHOTO)
    val tRarity = intent.getStringExtra(EXTRA_RARITY)
    val tResonance = intent.getStringExtra(EXTRA_RESONANCE)
    val tElement = intent.getStringExtra(EXTRA_ELEMENT)
    val tShatter = intent.getStringExtra(EXTRA_SHATTER)
    val tCharge = intent.getStringExtra(EXTRA_CHARGE)
    val tWeapReso = intent.getStringExtra(EXTRA_WEAPONRESO)
    val tSubstat = intent.getStringExtra(EXTRA_SUBSTAT)
    val tEleReso = intent.getStringExtra(EXTRA_ELERESO)
    val tWeapName = intent.getStringExtra(EXTRA_WEAPONNAME)




    tvSetName.text = tName
    Glide.with(this)
        .load(tImg)
        .apply(RequestOptions())
        .into(imgSetPhoto)
    tvRarity.text = tRarity
    tvReso.text = tResonance
    tvElement.text = tElement
    tvShatter.text = tShatter
    tvCharge.text = tCharge
    tvSubstat.text = tSubstat
    tvEleReso.text = tEleReso
    tvWeapReso.text = tWeapReso
    tvWeapName.text = tWeapName

}

companion object {
    const val EXTRA_NAME = "extra_name"
    const val EXTRA_PHOTO = "extra_photo"
    const val EXTRA_RESONANCE = "extra_resonance"
    const val EXTRA_RARITY = "extra_rarity"
    const val EXTRA_ELEMENT = "extra_element"
    const val EXTRA_SHATTER = "extra_shatter"
    const val EXTRA_CHARGE = "extra_charge"
    const val EXTRA_SUBSTAT = "extra_substat"
    const val EXTRA_WEAPONRESO = "extra_weaponreso"
    const val EXTRA_ELERESO = "extra_elereso"
    const val EXTRA_WEAPONNAME = "extra_weaponname"
}

override fun onSupportNavigateUp(): Boolean {
    onBackPressed()
    return true
}
}