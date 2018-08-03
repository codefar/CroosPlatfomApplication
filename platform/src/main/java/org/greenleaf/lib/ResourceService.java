package org.greenleaf.lib;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/3
 * time: 09:58
 */

public interface ResourceService {

    String getString(final String key);

    String getString(final int key);

    String[] getStringArray(final String key);

    String[] getStringArray(final int key);

}
