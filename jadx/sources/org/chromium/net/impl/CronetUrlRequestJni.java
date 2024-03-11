package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class CronetUrlRequestJni implements CronetUrlRequest.Natives {
    public static final JniStaticTestMocker<CronetUrlRequest.Natives> TEST_HOOKS = new JniStaticTestMocker<CronetUrlRequest.Natives>() { // from class: org.chromium.net.impl.CronetUrlRequestJni.1
    };
    private static CronetUrlRequest.Natives testInstance;

    CronetUrlRequestJni() {
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public long createRequestAdapter(CronetUrlRequest cronetUrlRequest, long j, String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(cronetUrlRequest, j, str, i, z, z2, z3, i2, z4, i3, i4, j2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean setHttpMethod(long j, CronetUrlRequest cronetUrlRequest, String str) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_setHttpMethod(j, cronetUrlRequest, str);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean addRequestHeader(long j, CronetUrlRequest cronetUrlRequest, String str, String str2) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_addRequestHeader(j, cronetUrlRequest, str, str2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void start(long j, CronetUrlRequest cronetUrlRequest) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_start(j, cronetUrlRequest);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void followDeferredRedirect(long j, CronetUrlRequest cronetUrlRequest) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(j, cronetUrlRequest);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean readData(long j, CronetUrlRequest cronetUrlRequest, ByteBuffer byteBuffer, int i, int i2) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_readData(j, cronetUrlRequest, byteBuffer, i, i2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void destroy(long j, CronetUrlRequest cronetUrlRequest, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_destroy(j, cronetUrlRequest, z);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void getStatus(long j, CronetUrlRequest cronetUrlRequest, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_getStatus(j, cronetUrlRequest, urlRequestStatusListener);
    }

    public static CronetUrlRequest.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CronetUrlRequest.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUrlRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CronetUrlRequestJni();
    }
}
