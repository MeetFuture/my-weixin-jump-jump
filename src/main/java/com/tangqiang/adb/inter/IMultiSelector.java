package com.tangqiang.adb.inter;


import com.tangqiang.adb.AdbManager;

import java.util.Collection;

/**
 * TODO
 *
 * @author Tom
 * @version 1.0 2018-01-04 0004 Tom create
 * @date 2018-01-04 0004
 * @copyright Copyright © 2018 Grgbanking All rights reserved.
 */
public interface IMultiSelector {
    Collection<IAdbView> getViews(AdbManager var1);
}