package org.greenleaf.platform_android;

import android.content.Context;

import org.greenleaf.lib.DalService;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/3
 * time: 14:58
 */

public class AndroidDalService implements DalService {

    Context context;

    public AndroidDalService(Context context) {
        System.out.println("AndroidResourceService 创建");
        this.context = context;
    }
}
