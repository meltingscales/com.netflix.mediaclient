package org.chromium.base;

import org.chromium.base.JavaExceptionReporter;
import org.chromium.base.natives.GEN_JNI;

/* loaded from: classes6.dex */
class JavaExceptionReporterJni implements JavaExceptionReporter.Natives {
    public static final JniStaticTestMocker<JavaExceptionReporter.Natives> TEST_HOOKS = new JniStaticTestMocker<JavaExceptionReporter.Natives>() { // from class: org.chromium.base.JavaExceptionReporterJni.1
    };
    private static JavaExceptionReporter.Natives testInstance;

    JavaExceptionReporterJni() {
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaException(boolean z, Throwable th) {
        GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaException(z, th);
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaStackTrace(String str) {
        GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(str);
    }

    public static JavaExceptionReporter.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            JavaExceptionReporter.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.JavaExceptionReporter.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new JavaExceptionReporterJni();
    }
}
