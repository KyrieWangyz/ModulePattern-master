package com.guiying.module.girls;

import android.support.annotation.Keep;

import com.guiying.module.common.base.IApplicationDelegate;
import com.guiying.module.common.base.ViewManager;

/**
 * <p>类说明</p>
 *
 * @author Kyrie
 * @version V2.8.3
 * @name MyDelegate
 */
@Keep
public class MyDelegate implements IApplicationDelegate {

    @Override
    public void onCreate() {
        //主动添加
        ViewManager.getInstance().addFragment(0, GirlsFragment.newInstance());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
