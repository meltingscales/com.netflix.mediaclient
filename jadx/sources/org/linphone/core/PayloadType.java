package org.linphone.core;

/* loaded from: classes6.dex */
public interface PayloadType {
    String getMime();

    int getRate();

    String getRecvFmtp();

    String getSendFmtp();

    void setRecvFmtp(String str);

    void setSendFmtp(String str);
}
