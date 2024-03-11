package org.chromium.net.impl;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class CronetUrlRequestContextJni implements CronetUrlRequestContext.Natives {
    public static final JniStaticTestMocker<CronetUrlRequestContext.Natives> TEST_HOOKS = new JniStaticTestMocker<CronetUrlRequestContext.Natives>() { // from class: org.chromium.net.impl.CronetUrlRequestContextJni.1
    };
    private static CronetUrlRequestContext.Natives testInstance;

    CronetUrlRequestContextJni() {
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextConfig(byte[] bArr) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(bArr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addQuicHint(long j, String str, int i, int i2) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(j, str, i, i2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addPkp(long j, String str, byte[][] bArr, boolean z, long j2) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addPkp(j, str, bArr, z, j2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextAdapter(long j) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(j);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public int setMinLogLevel(int i) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_setMinLogLevel(i);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public byte[] getHistogramDeltas() {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_getHistogramDeltas();
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void destroy(long j, CronetUrlRequestContext cronetUrlRequestContext) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_destroy(j, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean startNetLogToFile(long j, CronetUrlRequestContext cronetUrlRequestContext, String str, boolean z) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(j, cronetUrlRequestContext, str, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void startNetLogToDisk(long j, CronetUrlRequestContext cronetUrlRequestContext, String str, boolean z, int i) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(j, cronetUrlRequestContext, str, z, i);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void stopNetLog(long j, CronetUrlRequestContext cronetUrlRequestContext) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(j, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void initRequestContextOnInitThread(long j, CronetUrlRequestContext cronetUrlRequestContext) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(j, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void configureNetworkQualityEstimatorForTesting(long j, CronetUrlRequestContext cronetUrlRequestContext, boolean z, boolean z2, boolean z3) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(j, cronetUrlRequestContext, z, z2, z3);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideRTTObservations(long j, CronetUrlRequestContext cronetUrlRequestContext, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(j, cronetUrlRequestContext, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideThroughputObservations(long j, CronetUrlRequestContext cronetUrlRequestContext, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(j, cronetUrlRequestContext, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean getEnableTelemetry(long j, CronetUrlRequestContext cronetUrlRequestContext) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_getEnableTelemetry(j, cronetUrlRequestContext);
    }

    public static CronetUrlRequestContext.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CronetUrlRequestContext.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUrlRequestContext.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CronetUrlRequestContextJni();
    }
}
