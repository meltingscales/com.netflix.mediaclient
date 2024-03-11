package o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class dIs extends dIK {
    private dIK d;

    public final dIK e() {
        return this.d;
    }

    public final dIs e(dIK dik) {
        C8632dsu.c((Object) dik, "");
        this.d = dik;
        return this;
    }

    public dIs(dIK dik) {
        C8632dsu.c((Object) dik, "");
        this.d = dik;
    }

    @Override // o.dIK
    public dIK a(long j, TimeUnit timeUnit) {
        C8632dsu.c((Object) timeUnit, "");
        return this.d.a(j, timeUnit);
    }

    @Override // o.dIK
    public long i() {
        return this.d.i();
    }

    @Override // o.dIK
    public boolean cF_() {
        return this.d.cF_();
    }

    @Override // o.dIK
    public long cE_() {
        return this.d.cE_();
    }

    @Override // o.dIK
    public dIK e(long j) {
        return this.d.e(j);
    }

    @Override // o.dIK
    public dIK cD_() {
        return this.d.cD_();
    }

    @Override // o.dIK
    public dIK cC_() {
        return this.d.cC_();
    }

    @Override // o.dIK
    public void h() {
        this.d.h();
    }
}
