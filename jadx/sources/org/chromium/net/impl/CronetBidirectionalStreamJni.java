package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.impl.CronetBidirectionalStream;

/* loaded from: classes6.dex */
class CronetBidirectionalStreamJni implements CronetBidirectionalStream.Natives {
    public static final JniStaticTestMocker<CronetBidirectionalStream.Natives> TEST_HOOKS = new JniStaticTestMocker<CronetBidirectionalStream.Natives>() { // from class: org.chromium.net.impl.CronetBidirectionalStreamJni.1
    };
    private static CronetBidirectionalStream.Natives testInstance;

    CronetBidirectionalStreamJni() {
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public long createBidirectionalStream(CronetBidirectionalStream cronetBidirectionalStream, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(cronetBidirectionalStream, j, z, z2, i, z3, i2, j2);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public int start(long j, CronetBidirectionalStream cronetBidirectionalStream, String str, int i, String str2, String[] strArr, boolean z) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_start(j, cronetBidirectionalStream, str, i, str2, strArr, z);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void sendRequestHeaders(long j, CronetBidirectionalStream cronetBidirectionalStream) {
        GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(j, cronetBidirectionalStream);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean readData(long j, CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, int i, int i2) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_readData(j, cronetBidirectionalStream, byteBuffer, i, i2);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean writevData(long j, CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_writevData(j, cronetBidirectionalStream, byteBufferArr, iArr, iArr2, z);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void destroy(long j, CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_destroy(j, cronetBidirectionalStream, z);
    }

    public static CronetBidirectionalStream.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CronetBidirectionalStream.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetBidirectionalStream.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CronetBidirectionalStreamJni();
    }
}
