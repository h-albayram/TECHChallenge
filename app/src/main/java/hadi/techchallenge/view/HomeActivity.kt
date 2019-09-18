package hadi.techchallenge.view

import android.os.Bundle
import android.view.View
import hadi.techchallenge.R
import hadi.techchallenge.utils.Constant
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnLogin -> {
                val userName = edtUserName.text.toString()
                val password = edtPasword.text.toString()
                if (userName.equals(mConstant.USERNAME) && password.equals(mConstant.PASSWORD)) {
                    startActivity<OrderActivity>()
                } else {

                }
            }
        }
    }
}
