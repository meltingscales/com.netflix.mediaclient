package com.netflix.msl;

import o.AbstractC8424dlb;
import o.C8373dje;
import o.djG;
import o.dkO;
import o.dkU;

/* loaded from: classes5.dex */
public class MslException extends Exception {
    private static final long serialVersionUID = -2444322310603180494L;
    private final C8373dje a;
    private djG b;
    private dkO c;
    private Long d;
    private AbstractC8424dlb e;
    private dkU f;

    public MslException(C8373dje c8373dje) {
        super(c8373dje.d());
        this.c = null;
        this.b = null;
        this.f = null;
        this.e = null;
        this.d = null;
        this.a = c8373dje;
    }

    public MslException(C8373dje c8373dje, String str) {
        super(c8373dje.d() + " [" + str + "]");
        this.c = null;
        this.b = null;
        this.f = null;
        this.e = null;
        this.d = null;
        this.a = c8373dje;
    }

    public MslException(C8373dje c8373dje, String str, Throwable th) {
        super(c8373dje.d() + " [" + str + "]", th);
        this.c = null;
        this.b = null;
        this.f = null;
        this.e = null;
        this.d = null;
        this.a = c8373dje;
    }

    public MslException(C8373dje c8373dje, Throwable th) {
        super(c8373dje.d(), th);
        this.c = null;
        this.b = null;
        this.f = null;
        this.e = null;
        this.d = null;
        this.a = c8373dje;
    }

    public MslException e(dkO dko) {
        if (e() == null && a() == null) {
            this.c = dko;
        }
        return this;
    }

    public MslException d(djG djg) {
        if (e() == null && a() == null) {
            this.b = djg;
        }
        return this;
    }

    public MslException b(dkU dku) {
        if (d() == null && b() == null) {
            this.f = dku;
        }
        return this;
    }

    public MslException a(AbstractC8424dlb abstractC8424dlb) {
        if (d() == null && b() == null) {
            this.e = abstractC8424dlb;
        }
        return this;
    }

    public MslException a(long j) {
        if (j < 0 || j > 9007199254740992L) {
            throw new IllegalArgumentException("Message ID " + j + " is outside the valid range.");
        }
        if (c() == null) {
            this.d = Long.valueOf(j);
        }
        return this;
    }

    public dkO e() {
        dkO dko = this.c;
        if (dko != null) {
            return dko;
        }
        Throwable cause = getCause();
        if (cause == null || !(cause instanceof MslException)) {
            return null;
        }
        return ((MslException) cause).e();
    }

    public djG a() {
        djG djg = this.b;
        if (djg != null) {
            return djg;
        }
        Throwable cause = getCause();
        if (cause == null || !(cause instanceof MslException)) {
            return null;
        }
        return ((MslException) cause).a();
    }

    public dkU d() {
        dkU dku = this.f;
        if (dku != null) {
            return dku;
        }
        Throwable cause = getCause();
        if (cause == null || !(cause instanceof MslException)) {
            return null;
        }
        return ((MslException) cause).d();
    }

    public AbstractC8424dlb b() {
        AbstractC8424dlb abstractC8424dlb = this.e;
        if (abstractC8424dlb != null) {
            return abstractC8424dlb;
        }
        Throwable cause = getCause();
        if (cause == null || !(cause instanceof MslException)) {
            return null;
        }
        return ((MslException) cause).b();
    }

    public Long c() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Throwable cause = getCause();
        if (cause == null || !(cause instanceof MslException)) {
            return null;
        }
        return ((MslException) cause).c();
    }
}
