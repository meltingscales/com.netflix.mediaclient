package org.chromium.base;

import org.chromium.base.TraceEvent;
import org.chromium.base.natives.GEN_JNI;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TraceEventJni implements TraceEvent.Natives {
    public static final JniStaticTestMocker<TraceEvent.Natives> TEST_HOOKS = new JniStaticTestMocker<TraceEvent.Natives>() { // from class: org.chromium.base.TraceEventJni.1
    };
    private static TraceEvent.Natives testInstance;

    TraceEventJni() {
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void registerEnabledObserver() {
        GEN_JNI.org_chromium_base_TraceEvent_registerEnabledObserver();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startATrace(String str) {
        GEN_JNI.org_chromium_base_TraceEvent_startATrace(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void stopATrace() {
        GEN_JNI.org_chromium_base_TraceEvent_stopATrace();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void setupATraceStartupTrace(String str) {
        GEN_JNI.org_chromium_base_TraceEvent_setupATraceStartupTrace(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instant(String str, String str2) {
        GEN_JNI.org_chromium_base_TraceEvent_instant(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void begin(String str, String str2) {
        GEN_JNI.org_chromium_base_TraceEvent_begin(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void end(String str, String str2, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_end(str, str2, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginToplevel(String str) {
        GEN_JNI.org_chromium_base_TraceEvent_beginToplevel(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void endToplevel(String str) {
        GEN_JNI.org_chromium_base_TraceEvent_endToplevel(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startAsync(String str, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_startAsync(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void finishAsync(String str, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_finishAsync(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public boolean viewHierarchyDumpEnabled() {
        return GEN_JNI.org_chromium_base_TraceEvent_viewHierarchyDumpEnabled();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void initViewHierarchyDump(long j, Object obj) {
        GEN_JNI.org_chromium_base_TraceEvent_initViewHierarchyDump(j, obj);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public long startActivityDump(String str, long j) {
        return GEN_JNI.org_chromium_base_TraceEvent_startActivityDump(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void addViewDump(int i, int i2, boolean z, boolean z2, String str, String str2, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_addViewDump(i, i2, z, z2, str, str2, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidIPC(String str, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_instantAndroidIPC(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidToolbar(int i, int i2, int i3) {
        GEN_JNI.org_chromium_base_TraceEvent_instantAndroidToolbar(i, i2, i3);
    }

    public static TraceEvent.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            TraceEvent.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.TraceEvent.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new TraceEventJni();
    }
}
