package org.chromium.net.impl;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.impl.CronetUploadDataStream;

/* loaded from: classes5.dex */
class CronetUploadDataStreamJni implements CronetUploadDataStream.Natives {
    public static final JniStaticTestMocker<CronetUploadDataStream.Natives> TEST_HOOKS = new JniStaticTestMocker<CronetUploadDataStream.Natives>() { // from class: org.chromium.net.impl.CronetUploadDataStreamJni.1
    };
    private static CronetUploadDataStream.Natives testInstance;

    CronetUploadDataStreamJni() {
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long attachUploadDataToRequest(CronetUploadDataStream cronetUploadDataStream, long j, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(cronetUploadDataStream, j, j2);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createAdapterForTesting(CronetUploadDataStream cronetUploadDataStream) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(cronetUploadDataStream);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createUploadDataStreamForTesting(CronetUploadDataStream cronetUploadDataStream, long j, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(cronetUploadDataStream, j, j2);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onReadSucceeded(long j, CronetUploadDataStream cronetUploadDataStream, int i, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(j, cronetUploadDataStream, i, z);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onRewindSucceeded(long j, CronetUploadDataStream cronetUploadDataStream) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(j, cronetUploadDataStream);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void destroy(long j) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_destroy(j);
    }

    public static CronetUploadDataStream.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CronetUploadDataStream.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUploadDataStream.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CronetUploadDataStreamJni();
    }
}
