package org.chromium.base.metrics;

/* loaded from: classes6.dex */
public class UmaRecorderHolder {
    private static CachingUmaRecorder sRecorder = new CachingUmaRecorder();
    private static boolean sSetUpNativeUmaRecorder = true;

    public static UmaRecorder get() {
        return sRecorder;
    }
}
