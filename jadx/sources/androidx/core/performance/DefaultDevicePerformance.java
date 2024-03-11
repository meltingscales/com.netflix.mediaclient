package androidx.core.performance;

import android.os.Build;
import java.util.HashMap;
import o.dpD;
import o.dqE;

/* loaded from: classes2.dex */
public final class DefaultDevicePerformance {
    private final int PERFCLASS_11 = 30;
    private final int PERFCLASS_12 = 31;
    private final int PERFCLASS_13 = 33;
    private final int PERFCLASS_NONE;
    private final HashMap<String, Integer> fingerprints;
    private final int mediaPerformanceClass;

    private final boolean isPerformanceClassValid(int i) {
        return i >= this.PERFCLASS_11;
    }

    public int getMediaPerformanceClass() {
        return this.mediaPerformanceClass;
    }

    public DefaultDevicePerformance() {
        HashMap<String, Integer> b;
        b = dqE.b(dpD.a("robolectric-BrandX/ProductX/Device30:11", 30), dpD.a("robolectric-BrandX/ProductX/Device31:12", 31), dpD.a("OPPO/CPH2025EEA/OP4BA2L1:12", 30), dpD.a("OPPO/CPH2207EEA/OP4F0BL1:12", 30), dpD.a("OPPO/PENM00/OP4EC1:11", 30), dpD.a("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), dpD.a("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), dpD.a("Xiaomi/umi_global/umi:11", 30), dpD.a("realme/RMX2085/RMX2085L1:11", 30), dpD.a("samsung/c1qsqw/c1q:12", 30), dpD.a("samsung/o1quew/o1q:12", 30), dpD.a("samsung/r0quew/r0q:12", 30), dpD.a("samsung/r0sxxx/r0s:12", 30));
        this.fingerprints = b;
        this.mediaPerformanceClass = getCalculatedMediaPerformanceClass();
    }

    private final int getMediaPerformanceClassFromFingerprint() {
        String str = Build.BRAND;
        String str2 = Build.PRODUCT;
        String str3 = Build.DEVICE;
        String str4 = Build.VERSION.RELEASE;
        Integer num = this.fingerprints.get(str + '/' + str2 + '/' + str3 + ':' + str4);
        if (num == null) {
            num = Integer.valueOf(this.PERFCLASS_NONE);
        }
        return num.intValue();
    }

    private final int getMediaPerformanceClassFromProperty() {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = Build.VERSION.MEDIA_PERFORMANCE_CLASS;
            return i;
        }
        return this.PERFCLASS_NONE;
    }

    private final int getCalculatedMediaPerformanceClass() {
        int mediaPerformanceClassFromProperty = getMediaPerformanceClassFromProperty();
        if (isPerformanceClassValid(mediaPerformanceClassFromProperty)) {
            return mediaPerformanceClassFromProperty;
        }
        int mediaPerformanceClassFromFingerprint = getMediaPerformanceClassFromFingerprint();
        return isPerformanceClassValid(mediaPerformanceClassFromFingerprint) ? mediaPerformanceClassFromFingerprint : this.PERFCLASS_NONE;
    }
}
