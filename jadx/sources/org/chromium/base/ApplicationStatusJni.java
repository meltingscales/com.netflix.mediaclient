package org.chromium.base;

import org.chromium.base.ApplicationStatus;
import org.chromium.base.natives.GEN_JNI;

/* loaded from: classes6.dex */
class ApplicationStatusJni implements ApplicationStatus.Natives {
    public static final JniStaticTestMocker<ApplicationStatus.Natives> TEST_HOOKS = new JniStaticTestMocker<ApplicationStatus.Natives>() { // from class: org.chromium.base.ApplicationStatusJni.1
    };
    private static ApplicationStatus.Natives testInstance;

    ApplicationStatusJni() {
    }

    @Override // org.chromium.base.ApplicationStatus.Natives
    public void onApplicationStateChange(int i) {
        GEN_JNI.org_chromium_base_ApplicationStatus_onApplicationStateChange(i);
    }

    public static ApplicationStatus.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ApplicationStatus.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.ApplicationStatus.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ApplicationStatusJni();
    }
}
