package com.guiying.module.common.base;


import android.support.annotation.Keep;
import android.view.View;

/**
 * <p>类说明</p>
 *
 * @author Kyrie
 * @version V2.8.3
 * @name IFragmentDelegate
 */
@Keep
public interface IViewDelegate {

    BaseFragment getFragment(String name);

    View getView(String name);

}
