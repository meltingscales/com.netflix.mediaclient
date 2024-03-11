package org.linphone.core;

/* loaded from: classes6.dex */
public interface LinphoneBuffer {
    byte[] getContent();

    int getSize();

    void setContent(byte[] bArr);

    void setSize(int i);
}
