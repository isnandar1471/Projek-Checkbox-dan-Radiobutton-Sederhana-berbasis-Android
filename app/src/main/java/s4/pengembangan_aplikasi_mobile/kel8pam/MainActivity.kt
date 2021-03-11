package s4.pengembangan_aplikasi_mobile.kel8pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstSetResource()

        firstSetVisibility()

        RAMBUT()
        JENGGOT()
        KEPALA()
        MATA()
        ALIS()
        ToggleKumis()
    }

    private fun firstSetResource(){
        imageHair.setImageResource(R.drawable.hair)
        imageBeard.setImageResource(R.drawable.beard)
        imageBody.setImageResource(R.drawable.body)
        imageEye.setImageResource(R.drawable.eyes)
        imageEyebrow.setImageResource(R.drawable.eyebrow)
        imageMoustache.setImageResource(R.drawable.moustache)
        imageMoustacheB.setImageResource(R.drawable.moustacheb)
    }

    private fun firstSetVisibility(){
        if (!rambut.isChecked) {
            imageHair.setVisibility(View.INVISIBLE)
        }
        if (!jenggot.isChecked) {
            imageBeard.setVisibility(View.INVISIBLE)
        }
        if (!kepala.isChecked) {
            imageBody.setVisibility(View.INVISIBLE)
        }
        if (!mata.isChecked) {
            imageEye.setVisibility(View.INVISIBLE)
        }
        if (!alis.isChecked) {
            imageEyebrow.setVisibility(View.INVISIBLE)
        }
        if (!kumisA.isChecked) {
            imageMoustache.setVisibility(View.INVISIBLE)
        }
        if (!kumisB.isChecked) {
            imageMoustacheB.setVisibility(View.INVISIBLE)
        }
    }

    private fun RAMBUT(){
        rambut.setOnClickListener {
            if (rambut.isChecked) {
                imageHair.setVisibility(View.VISIBLE)
            } else {
                imageHair.setVisibility(View.INVISIBLE)
            }
        }
    }
    private fun JENGGOT(){
        jenggot.setOnClickListener {
            if (jenggot.isChecked) {
                imageBeard.setVisibility(View.VISIBLE)
            } else {
                imageBeard.setVisibility(View.INVISIBLE)
            }
        }
    }
    private fun KEPALA(){
        kepala.setOnClickListener {
            if (kepala.isChecked) {
                imageBody.setVisibility(View.VISIBLE)
            } else {
                imageBody.setVisibility(View.INVISIBLE)
            }
        }
    }
    private fun MATA(){
        mata.setOnClickListener {
            if (mata.isChecked) {
                imageEye.setVisibility(View.VISIBLE)
            } else {
                imageEye.setVisibility(View.INVISIBLE)
            }
        }
    }
    private fun ALIS(){
        alis.setOnClickListener {
            if (alis.isChecked) {
                imageEyebrow.setVisibility(View.VISIBLE)
            } else {
                imageEyebrow.setVisibility(View.INVISIBLE)
            }
        }
    }
//    private fun KUMIS(){
//        kumis.setOnClickListener {
//            if (kumis.isChecked) {
//                imageMoustache.setVisibility(View.VISIBLE)
//            } else {
//                imageMoustache.setVisibility(View.INVISIBLE)
//            }
//        }
//    }
    private fun ToggleKumis(){
//    kumis.setOnClickListener{
        kumis.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.kumisA){
                imageMoustache.setVisibility(View.VISIBLE)
                imageMoustacheB.setVisibility(View.INVISIBLE)
            }else if (checkedId == R.id.kumisB){
                imageMoustache.setVisibility(View.INVISIBLE)
                imageMoustacheB.setVisibility(View.VISIBLE)
            }else if (checkedId == R.id.nokumis){
                imageMoustache.setVisibility(View.INVISIBLE)
                imageMoustacheB.setVisibility(View.INVISIBLE)
            }
        }
//        var id = kumis.checkedRadioButtonId
//        if (id=='kumisA'){
//            imageMoustache.setImageResource(R.drawable.moustache)
//        }else if (id=='kumisB''){
//        }
//    }
    }

}