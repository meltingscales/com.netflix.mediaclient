package org.chromium.base;

import android.os.StrictMode;
import java.util.TimeZone;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
class TimezoneUtils {
    private TimezoneUtils() {
    }

    @CalledByNative
    private static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
