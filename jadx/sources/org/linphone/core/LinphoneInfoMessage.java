package org.linphone.core;

/* loaded from: classes6.dex */
public interface LinphoneInfoMessage {
    void addHeader(String str, String str2);

    LinphoneContent getContent();

    String getHeader(String str);

    void setContent(LinphoneContent linphoneContent);
}
