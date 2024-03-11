package org.chromium.base;

import org.chromium.base.MemoryPressureListener;
import org.chromium.base.natives.GEN_JNI;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class MemoryPressureListenerJni implements MemoryPressureListener.Natives {
    public static final JniStaticTestMocker<MemoryPressureListener.Natives> TEST_HOOKS = new JniStaticTestMocker<MemoryPressureListener.Natives>() { // from class: org.chromium.base.MemoryPressureListenerJni.1
    };
    private static MemoryPressureListener.Natives testInstance;

    MemoryPressureListenerJni() {
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public void onMemoryPressure(int i) {
        GEN_JNI.org_chromium_base_MemoryPressureListener_onMemoryPressure(i);
    }

    public static MemoryPressureListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MemoryPressureListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.MemoryPressureListener.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new MemoryPressureListenerJni();
    }
}
