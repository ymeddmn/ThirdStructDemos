package interview.horse.example.com.arouterdemo

import android.content.Context
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

/**
 * Created by mayong on 2019/1/21.
 */

@Interceptor(priority = 8,name = "拦截并添加参数拦截器")
class ARouterInterceptor : IInterceptor {

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        if (postcard?.path.equals("/four/activity")) {
            postcard?.withString("data", "我是拦截器，我拦截了你的路由，并且添加了这段话")
        }
        callback?.onContinue(postcard)//这句调用必须有，不然所以的路由跳转都会失效
    }

    override fun init(context: Context?) {
        //这个方法只在应用初始化的时候被调用一次
    }

}