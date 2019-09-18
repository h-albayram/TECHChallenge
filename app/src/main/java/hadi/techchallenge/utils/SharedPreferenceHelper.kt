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

    fun setString(key: String, value: String) {
        if (mSharedPref != null) {
            if(mSharedPref!=null){
                mEditor!!.putString(key, value)
                mEditor!!.apply()
            }
        }
    }
}