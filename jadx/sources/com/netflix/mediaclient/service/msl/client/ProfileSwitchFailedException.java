package com.netflix.mediaclient.service.msl.client;

import com.netflix.mediaclient.StatusCode;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ProfileSwitchFailedException extends RuntimeException {
    private final StatusCode a;

    public final StatusCode b() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSwitchFailedException(String str, StatusCode statusCode, Throwable th) {
        super(str, th);
        C8632dsu.c((Object) statusCode, "");
        this.a = statusCode;
    }
}
