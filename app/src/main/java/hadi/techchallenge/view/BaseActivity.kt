package hadi.techchallenge.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import hadi.techchallenge.utils.Constant
import hadi.techchallenge.utils.SharedPreferenceHelper

open class BaseActivity : AppCompatActivity() {
    lateinit var mSharedPreferenceHelper: SharedPreferenceHelper
    lateinit var mConstant: Constant
    override fun onResume() {
        super.onResume()
        mSharedPreferenceHelper = SharedPreferenceHelper(this)
        mConstant = Constant()
        val isAutologin: Boolean = mSharedPreferenceHelper.getBoolean(mConstant.ISLOGIN)
      /*  if (isAutologin) {
            startActivity<OrderActivity>()
        }else{
            logOut()
        }*/
    }



    fun logOut() {
        mSharedPreferenceHelper.setBoolean(mConstant.ISLOGIN, false)
        startActivity<HomeActivity>()
    }

    inline fun <reified T : Activity> startActivity() {
        val intent = Intent(this, T::class.java)
        startActivity(intent)
    }

}