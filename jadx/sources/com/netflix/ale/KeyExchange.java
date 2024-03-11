package com.netflix.ale;

/* loaded from: classes5.dex */
public interface KeyExchange {
    KeyxRequestData getKeyxRequestData();

    Jwe processKeyxResponse(KeyxResponseData keyxResponseData);
}
