package org.greenleaf.platform_android;

import android.content.Context;

import org.greenleaf.lib.DisplayService;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/7/31
 * time: 00:51
 */

public class AndroidDisplayService implements DisplayService {

    Context context;

    public AndroidDisplayService(Context context) {
        this.context = context;
    }

    @Override
    public String display() {
        return "This is display in module Android display";
    }
}
