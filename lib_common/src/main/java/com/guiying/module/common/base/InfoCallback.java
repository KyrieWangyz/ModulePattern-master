package com.guiying.module.common.base;

import android.support.annotation.Keep;

/**
 * <p>数据回调接口</p>
 *
 * @author Kyrie
 * @version V1.2.0
 * @name InfoCallback
 */
@Keep
public interface InfoCallback<T> {

    void onSuccess(T info);

    void onError(int code, String message);

}
