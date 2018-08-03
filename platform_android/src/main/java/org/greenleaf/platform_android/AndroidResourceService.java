package org.greenleaf.platform_android;

import android.content.Context;
import android.content.res.Resources;

import org.greenleaf.lib.ResourceService;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/3
 * time: 14:57
 */

public class AndroidResourceService implements ResourceService {

    Context context;
    Resources resources;

    public AndroidResourceService(Context context) {
        System.out.println("AndroidResourceService 创建");
        this.context = context;
        resources = context.getResources();
    }

    @Override
    public String getString(String key) {
        return resources.getString(resources.getIdentifier(key, "string", context.getPackageName()));
    }

    @Override
    public String getString(int key) {
        return resources.getString(key);
    }

    @Override
    public String[] getStringArray(String key) {
        return new String[0];
    }

    @Override
    public String[] getStringArray(int key) {
        return resources.getStringArray(key);
    }
}
