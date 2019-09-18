package hadi.techchallenge.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager


class SharedPreferenceHelper(var context: Context) {
    private var mSharedPref: SharedPreferences?
    var mEditor: SharedPreferences.Editor?
    init {
        mSharedPref = PreferenceManager.getDefaultSharedPreferences(context)
        mEditor = mSharedPref!!.edit()
    }

    fun setBoolean(key: String, value: Boolean) {
            if(mSharedPref!=null){
                mEditor!!.putBoolean(key, value)
                mEditor!!.apply()
            }
    }
    fun getBoolean(key:String):Boolean= mSharedPref!!.getBoolean(key,false)
}