package com.acc.control;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pccw on 2016/11/24.
 */

public class ActivityControler {
    private ActivityControler() {
        super();
    }


    private static final ActivityControler ACTIVITY_CONTROLER = new ActivityControler();


    private static List<Activity> list = new ArrayList<>();


    public static void addActivity(Activity activity) {
        list.add(activity);
    }


    public static void removeActivity(Activity activity) {
        list.remove(activity);
    }


    /**
     * 完成所有的activity活动
     */
    public static void isFinsh() {
        for (Activity activity : list) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }


}

