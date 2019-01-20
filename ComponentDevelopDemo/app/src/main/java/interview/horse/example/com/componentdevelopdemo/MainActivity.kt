package interview.horse.example.com.componentdevelopdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }

    private fun initListener() {
        btn_login.setOnClickListener {
            ARouter.getInstance().build("/login/activity").navigation()
        }
        btn_toapp.setOnClickListener{
            ARouter.getInstance().build("/second/activity").navigation()
        }
        btn_touser.setOnClickListener {
            ARouter.getInstance().build("/user/activity").navigation()
        }
    }
}
