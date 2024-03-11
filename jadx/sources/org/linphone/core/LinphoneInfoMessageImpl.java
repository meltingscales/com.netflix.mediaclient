package org.linphone.core;

/* loaded from: classes6.dex */
public class LinphoneInfoMessageImpl implements LinphoneInfoMessage {
    private LinphoneContent mContent;
    protected long nativePtr;

    private native void addHeader(long j, String str, String str2);

    private native void delete(long j);

    private native Object getContent(long j);

    private native String getHeader(long j, String str);

    private native void setContent(long j, String str, String str2, String str3);

    @Override // org.linphone.core.LinphoneInfoMessage
    public LinphoneContent getContent() {
        return this.mContent;
    }

    public LinphoneInfoMessageImpl(long j) {
        this.nativePtr = j;
        this.mContent = (LinphoneContent) getContent(j);
    }

    @Override // org.linphone.core.LinphoneInfoMessage
    public void setContent(LinphoneContent linphoneContent) {
        this.mContent = linphoneContent;
        setContent(this.nativePtr, linphoneContent.getType(), this.mContent.getSubtype(), this.mContent.getDataAsString());
    }

    @Override // org.linphone.core.LinphoneInfoMessage
    public void addHeader(String str, String str2) {
        addHeader(this.nativePtr, str, str2);
    }

    @Override // org.linphone.core.LinphoneInfoMessage
    public String getHeader(String str) {
        return getHeader(this.nativePtr, str);
    }

    protected void finalize() {
        delete(this.nativePtr);
    }
}
