package org.linphone.core;

/* loaded from: classes6.dex */
public class LinphoneEventImpl implements LinphoneEvent {
    private long mNativePtr;
    private Object mUserContext;

    private native int acceptSubscription(long j);

    private native void addCustomHeader(long j, String str, String str2);

    private native int denySubscription(long j, int i);

    private native Object getCore(long j);

    private native String getCustomHeader(long j, String str);

    private native long getErrorInfo(long j);

    private native String getEventName(long j);

    private native int getReason(long j);

    private native int getSubscriptionDir(long j);

    private native int getSubscriptionState(long j);

    private native int notify(long j, String str, String str2, byte[] bArr, String str3);

    private native void sendPublish(long j, String str, String str2, byte[] bArr, String str3);

    private native void sendSubscribe(long j, String str, String str2, byte[] bArr, String str3);

    private native int terminate(long j);

    private native void unref(long j);

    private native int updatePublish(long j, String str, String str2, byte[] bArr, String str3);

    private native int updateSubscribe(long j, String str, String str2, byte[] bArr, String str3);

    protected LinphoneEventImpl(long j) {
        this.mNativePtr = j;
    }

    @Override // org.linphone.core.LinphoneEvent
    public String getEventName() {
        String eventName;
        synchronized (this) {
            eventName = getEventName(this.mNativePtr);
        }
        return eventName;
    }

    @Override // org.linphone.core.LinphoneEvent
    public void acceptSubscription() {
        synchronized (this) {
            synchronized (getCore()) {
                acceptSubscription(this.mNativePtr);
            }
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public void denySubscription(Reason reason) {
        synchronized (this) {
            synchronized (getCore()) {
                denySubscription(this.mNativePtr, reason.mValue);
            }
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public void notify(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            notify(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public void updateSubscribe(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            updateSubscribe(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public void updatePublish(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            updatePublish(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public void terminate() {
        synchronized (getCore()) {
            terminate(this.mNativePtr);
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public Reason getReason() {
        Reason fromInt;
        synchronized (this) {
            fromInt = Reason.fromInt(getReason(this.mNativePtr));
        }
        return fromInt;
    }

    @Override // org.linphone.core.LinphoneEvent
    public void setUserContext(Object obj) {
        synchronized (this) {
            this.mUserContext = obj;
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public Object getUserContext() {
        Object obj;
        synchronized (this) {
            obj = this.mUserContext;
        }
        return obj;
    }

    @Override // org.linphone.core.LinphoneEvent
    public SubscriptionDir getSubscriptionDir() {
        SubscriptionDir fromInt;
        synchronized (this) {
            fromInt = SubscriptionDir.fromInt(getSubscriptionDir(this.mNativePtr));
        }
        return fromInt;
    }

    @Override // org.linphone.core.LinphoneEvent
    public SubscriptionState getSubscriptionState() {
        SubscriptionState fromInt;
        synchronized (this) {
            try {
                fromInt = SubscriptionState.fromInt(getSubscriptionState(this.mNativePtr));
            } catch (LinphoneCoreException e) {
                e.printStackTrace();
                return SubscriptionState.Error;
            }
        }
        return fromInt;
    }

    protected void finalize() {
        unref(this.mNativePtr);
    }

    @Override // org.linphone.core.LinphoneEvent
    public void addCustomHeader(String str, String str2) {
        synchronized (this) {
            addCustomHeader(this.mNativePtr, str, str2);
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public String getCustomHeader(String str) {
        String customHeader;
        synchronized (this) {
            customHeader = getCustomHeader(this.mNativePtr, str);
        }
        return customHeader;
    }

    @Override // org.linphone.core.LinphoneEvent
    public void sendSubscribe(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            if (linphoneContent != null) {
                sendSubscribe(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
            } else {
                sendSubscribe(this.mNativePtr, null, null, null, null);
            }
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public void sendPublish(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            if (linphoneContent != null) {
                sendPublish(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
            } else {
                sendPublish(this.mNativePtr, null, null, null, null);
            }
        }
    }

    @Override // org.linphone.core.LinphoneEvent
    public ErrorInfo getErrorInfo() {
        ErrorInfoImpl errorInfoImpl;
        synchronized (this) {
            errorInfoImpl = new ErrorInfoImpl(getErrorInfo(this.mNativePtr));
        }
        return errorInfoImpl;
    }

    @Override // org.linphone.core.LinphoneEvent
    public LinphoneCore getCore() {
        LinphoneCore linphoneCore;
        synchronized (this) {
            linphoneCore = (LinphoneCore) getCore(this.mNativePtr);
        }
        return linphoneCore;
    }
}
