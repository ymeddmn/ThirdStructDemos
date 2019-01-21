package interview.horse.example.com.arouterdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_fourth.*

@Route(path = "/four/activity")
class FourthActivity : AppCompatActivity() {

    @JvmField
    @Autowired(name = "data")
    var data: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        ARouter.getInstance().inject(this)

        tv_content.text = data
    }
}
