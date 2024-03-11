package com.netflix.mediaclient.service.msl.client;

import com.netflix.mediaclient.StatusCode;
import com.netflix.msl.MslInternalException;

/* loaded from: classes3.dex */
public class WidevineContextException extends MslInternalException {
    private final StatusCode b;

    public StatusCode e() {
        return this.b;
    }

    public WidevineContextException(String str, StatusCode statusCode, Throwable th) {
        super(str, th);
        this.b = statusCode;
    }
}
