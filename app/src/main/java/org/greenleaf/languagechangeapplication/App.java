package org.greenleaf.languagechangeapplication;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.github.yuweiguocn.library.greendao.MigrationHelper;

import org.greenleaf.languagechangeapplication.db.MySQLiteOpenHelper;
import org.greenleaf.languagechangeapplication.db.entity.DaoMaster;
import org.greenleaf.lib.SysRuntime;
import org.greenleaf.platform_android.AndroidDisplayService;
import org.greenleaf.platform_android.AndroidResourceService;

import java.util.Locale;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/7/30
 * time: 14:28
 */

public class App extends Application {

    @Override
    public void onCreate() {
        System.out.println("onCreate " + Locale.getDefault() + " "
        + Locale.ENGLISH + " " + Locale.CHINA + " " + Locale.CHINESE);
        super.onCreate();
        int seed = (int) (Math.random() * 100);
        switchLanguage(seed % 2 == 0 ? Locale.CHINA : Locale.ENGLISH);

        MigrationHelper.DEBUG = true;
        MySQLiteOpenHelper helper = new MySQLiteOpenHelper(this, "test.db",null);
        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());

        SysRuntime.getInstance().setDisplayService(new AndroidDisplayService(getApplicationContext()));
        SysRuntime.getInstance().setResourceService(new AndroidResourceService(getApplicationContext()));
        SysRuntime.getInstance().setDisplayService(new AndroidDisplayService(getApplicationContext()));
    }

    private void switchLanguage(Locale locale) {
        Configuration config = getResources().getConfiguration();
        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        config.setLocale(locale);
        resources.updateConfiguration(config, dm);
    }
}
