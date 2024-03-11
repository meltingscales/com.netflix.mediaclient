package org.linphone.core;

/* loaded from: classes6.dex */
public class LinphoneConferenceParamsImpl implements LinphoneConferenceParams {
    private long nativePtr;

    private native long copyInstance(long j);

    private native long createInstance(LinphoneCoreImpl linphoneCoreImpl);

    private native void destroyInstance(long j);

    private native void enableVideo(long j, boolean z);

    private native boolean isVideoRequested(long j);

    public LinphoneConferenceParamsImpl(LinphoneCore linphoneCore) {
        this.nativePtr = 0L;
        this.nativePtr = createInstance((LinphoneCoreImpl) linphoneCore);
    }

    public LinphoneConferenceParamsImpl(LinphoneConferenceParamsImpl linphoneConferenceParamsImpl) {
        this.nativePtr = 0L;
        this.nativePtr = copyInstance(linphoneConferenceParamsImpl.nativePtr);
    }

    public void finalize() {
        destroyInstance(this.nativePtr);
    }

    @Override // org.linphone.core.LinphoneConferenceParams
    public void enableVideo(boolean z) {
        enableVideo(this.nativePtr, z);
    }

    @Override // org.linphone.core.LinphoneConferenceParams
    public boolean isVideoRequested() {
        return isVideoRequested(this.nativePtr);
    }
}
