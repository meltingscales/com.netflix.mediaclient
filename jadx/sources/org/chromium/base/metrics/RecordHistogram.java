package org.chromium.base.metrics;

/* loaded from: classes6.dex */
public class RecordHistogram {
    public static void recordBooleanHistogram(String str, boolean z) {
        UmaRecorderHolder.get().recordBooleanHistogram(str, z);
    }

    public static void recordEnumeratedHistogram(String str, int i, int i2) {
        recordExactLinearHistogram(str, i, i2);
    }

    public static void recordExactLinearHistogram(String str, int i, int i2) {
        UmaRecorderHolder.get().recordLinearHistogram(str, i, 1, i2, i2 + 1);
    }
}
