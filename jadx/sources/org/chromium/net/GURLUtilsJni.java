package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.GURLUtils;

/* loaded from: classes6.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    public static final JniStaticTestMocker<GURLUtils.Natives> TEST_HOOKS = new JniStaticTestMocker<GURLUtils.Natives>() { // from class: org.chromium.net.GURLUtilsJni.1
    };
    private static GURLUtils.Natives testInstance;

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return GEN_JNI.org_chromium_net_GURLUtils_getOrigin(str);
    }

    public static GURLUtils.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            GURLUtils.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.GURLUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new GURLUtilsJni();
    }
}
