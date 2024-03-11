package org.chromium.base.memory;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class MemoryInfoBridge {
    @CalledByNative
    public static Debug.MemoryInfo getActivityManagerMemoryInfoForSelf() {
        Debug.MemoryInfo[] processMemoryInfo;
        try {
            processMemoryInfo = ((ActivityManager) ContextUtils.getApplicationContext().getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
        } catch (SecurityException unused) {
        }
        if (processMemoryInfo == null) {
            return null;
        }
        return processMemoryInfo[0];
    }
}
