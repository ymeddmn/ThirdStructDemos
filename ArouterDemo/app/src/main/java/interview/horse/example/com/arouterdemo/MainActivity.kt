package interview.horse.example.com.arouterdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_tosecond.setOnClickListener {
            ARouter.getInstance().build("/interview/second").navigation()
        }
        btn_withparams.setOnClickListener {
            ARouter.getInstance().build("/interview/second").withString("haha","haha").navigation(this@MainActivity)
        }
    }
}
