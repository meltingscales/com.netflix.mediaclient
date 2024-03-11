package com.netflix.mediaclient.android.app;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class WrappedStatus implements Status {
    private final StatusCode b;
    private final Status e;

    @Override // com.netflix.mediaclient.android.app.Status
    public StatusCode c() {
        return this.b;
    }

    public WrappedStatus(StatusCode statusCode, Status status) {
        C8632dsu.c((Object) statusCode, "");
        C8632dsu.c((Object) status, "");
        this.b = statusCode;
        this.e = status;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean j() {
        return this.e.j();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean h() {
        return this.e.h();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean f() {
        return this.e.f();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean i() {
        return this.e.i();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public String l() {
        return this.e.l();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean k() {
        return this.e.k();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean g() {
        return this.e.g();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public String b() {
        return this.e.b();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public Status.ErrorGroup d() {
        return this.e.d();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public Throwable e() {
        return this.e.e();
    }
}
