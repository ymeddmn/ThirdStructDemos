package interview.horse.example.com.arouterdemo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_second.*

/**
 * 这里配置路径用于跳转，经常有配置了第一次不能跳转的情况，关闭ide多试几次一般就好了，原因暂时未知
 */
@Route(path = "/interview/second")
class SecondActivity : AppCompatActivity(), DegradeService {
    @Autowired(name = "haha")
    @JvmField
    var haha: String? = null
    val tag: String = "second"

    override fun init(context: Context?) {
    }

    override fun onLost(context: Context?, postcard: Postcard?) {
        tv_content.text = "没有找到正确页面"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        /**
         * 这一步注入必须有，不然@Autowired不能获取到参数
         */
        ARouter.getInstance().inject(this)
        println(tag + haha)
    }
}
