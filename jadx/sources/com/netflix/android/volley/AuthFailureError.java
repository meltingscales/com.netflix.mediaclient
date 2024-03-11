package com.netflix.android.volley;

import android.content.Intent;
import o.C9858xs;

/* loaded from: classes2.dex */
public class AuthFailureError extends VolleyError {
    private Intent d;

    public AuthFailureError() {
    }

    public AuthFailureError(C9858xs c9858xs) {
        super(c9858xs);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.d != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
