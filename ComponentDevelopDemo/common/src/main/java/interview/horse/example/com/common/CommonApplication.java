package interview.horse.example.com.common;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by mayong on 2019/1/20.
 */

public class CommonApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
