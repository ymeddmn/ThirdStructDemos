package interview.horse.example.com.arouterdemo

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Created by mayong on 2019/1/19.
 */
class OurApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initLibs()
        ARouter.init(this@OurApplication)

    }

    fun initLibs() {
        ARouter.openLog()
        ARouter.openDebug()
    }

}