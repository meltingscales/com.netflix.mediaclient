package com.netflix.ale;

/* loaded from: classes5.dex */
public interface AleUtil {
    byte[] base64ToBytes(String str);

    String bytesToBase64Url(byte[] bArr);

    byte[] stringToUtf8Bytes(String str);

    String utf8BytesToString(byte[] bArr);
}
