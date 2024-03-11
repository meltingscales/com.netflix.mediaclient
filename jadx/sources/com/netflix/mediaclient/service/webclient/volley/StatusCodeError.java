package com.netflix.mediaclient.service.webclient.volley;

import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
public class StatusCodeError extends VolleyError {
    private final StatusCode d;

    public StatusCode d() {
        return this.d;
    }

    public StatusCodeError(StatusCode statusCode) {
        this.d = statusCode;
    }

    public StatusCodeError(StatusCode statusCode, String str) {
        super(str);
        this.d = statusCode;
    }

    public StatusCodeError(StatusCode statusCode, Throwable th) {
        super(th);
        this.d = statusCode;
    }
}
