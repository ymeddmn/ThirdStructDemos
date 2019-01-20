package interview.horse.example.com.loginmodel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_login.*

@Route(path = "/login/activity")
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ARouter.getInstance().inject(this)
        btn_logintouser.setOnClickListener {
            ARouter.getInstance().build("/user/activity").navigation()
        }
    }
}
