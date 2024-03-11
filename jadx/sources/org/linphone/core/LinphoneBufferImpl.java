package org.linphone.core;

/* loaded from: classes6.dex */
public class LinphoneBufferImpl implements LinphoneBuffer {
    private byte[] mData;
    private int mSize;

    @Override // org.linphone.core.LinphoneBuffer
    public byte[] getContent() {
        return this.mData;
    }

    @Override // org.linphone.core.LinphoneBuffer
    public int getSize() {
        return this.mSize;
    }

    @Override // org.linphone.core.LinphoneBuffer
    public void setContent(byte[] bArr) {
        this.mData = bArr;
    }

    @Override // org.linphone.core.LinphoneBuffer
    public void setSize(int i) {
        this.mSize = i;
    }

    public LinphoneBufferImpl(byte[] bArr, int i) {
        this.mData = bArr;
        this.mSize = i;
    }
}
