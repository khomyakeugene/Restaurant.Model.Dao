package com.company.util;

import java.util.List;

/**
 * Created by Yevhen on 11.06.2016.
 */
public class Util {
    public static <T> T getFirstFromList(List<T> objects) {
        return  (objects != null && objects.size() > 0) ? objects.get(0) : null;
    }
}
