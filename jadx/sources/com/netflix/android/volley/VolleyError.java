package com.netflix.android.volley;

import java.io.PrintWriter;
import java.io.StringWriter;
import o.C9858xs;

/* loaded from: classes2.dex */
public class VolleyError extends Exception {
    public final C9858xs b;

    public VolleyError() {
        this.b = null;
    }

    public VolleyError(C9858xs c9858xs) {
        this.b = c9858xs;
    }

    public VolleyError(String str) {
        super(str);
        this.b = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.b = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.b = null;
    }

    public String a() {
        Throwable cause = getCause();
        if (cause != null) {
            StringWriter stringWriter = new StringWriter();
            cause.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
        return getMessage();
    }
}
