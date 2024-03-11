package com.netflix.mediaclient.android.app;

import com.netflix.cl.model.Error;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes3.dex */
public class NetflixStatus extends BaseStatus {
    private static final long serialVersionUID = 5121797712426793309L;
    protected String a;
    protected transient Error b;
    protected boolean c;
    private int h;

    @Override // com.netflix.mediaclient.android.app.BaseStatus
    public Error a() {
        return this.b;
    }

    public void a(String str) {
        this.a = str;
    }

    public void c(boolean z) {
        this.c = z;
    }

    public void e(int i) {
        this.h = i;
    }

    public void e(Error error) {
        this.b = error;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean k() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public String l() {
        return this.a;
    }

    public NetflixStatus(StatusCode statusCode, int i) {
        if (statusCode == null) {
            throw new IllegalArgumentException("Status code can not be null!");
        }
        this.e = statusCode;
        this.h = i;
    }

    public NetflixStatus(StatusCode statusCode) {
        this(statusCode, Integer.MAX_VALUE);
    }

    public NetflixStatus(StatusCode statusCode, Throwable th) {
        this(statusCode, Integer.MAX_VALUE);
        this.d = th;
    }

    public String toString() {
        return "NetflixStatus, " + this.e;
    }
}
