package o;

import kotlinx.serialization.SerializationException;
import o.InterfaceC7717dCt;
import o.InterfaceC7720dCw;

/* renamed from: o.dCo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7712dCo implements InterfaceC7720dCw, InterfaceC7717dCt {
    @Override // o.InterfaceC7720dCw
    public InterfaceC7720dCw a(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this;
    }

    @Override // o.InterfaceC7720dCw
    public InterfaceC7717dCt c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this;
    }

    @Override // o.InterfaceC7717dCt
    public void e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
    }

    @Override // o.InterfaceC7720dCw
    public Void g() {
        return null;
    }

    @Override // o.InterfaceC7720dCw
    public boolean i() {
        return true;
    }

    @Override // o.InterfaceC7717dCt
    public int b(InterfaceC7707dCj interfaceC7707dCj) {
        return InterfaceC7717dCt.d.a(this, interfaceC7707dCj);
    }

    @Override // o.InterfaceC7720dCw
    public <T> T d(dBP<? extends T> dbp) {
        return (T) InterfaceC7720dCw.a.c(this, dbp);
    }

    @Override // o.InterfaceC7717dCt
    public boolean h() {
        return InterfaceC7717dCt.d.d(this);
    }

    public Object cB_() {
        throw new SerializationException(dsA.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // o.InterfaceC7720dCw
    public boolean c() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Boolean) cB_).booleanValue();
    }

    @Override // o.InterfaceC7720dCw
    public byte a() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Byte) cB_).byteValue();
    }

    @Override // o.InterfaceC7720dCw
    public short o() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Short) cB_).shortValue();
    }

    @Override // o.InterfaceC7720dCw
    public int f() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Integer) cB_).intValue();
    }

    @Override // o.InterfaceC7720dCw
    public long j() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Long) cB_).longValue();
    }

    @Override // o.InterfaceC7720dCw
    public float b() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Float) cB_).floatValue();
    }

    @Override // o.InterfaceC7720dCw
    public double d() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Double) cB_).doubleValue();
    }

    @Override // o.InterfaceC7720dCw
    public char e() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Character) cB_).charValue();
    }

    @Override // o.InterfaceC7720dCw
    public String m() {
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return (String) cB_;
    }

    @Override // o.InterfaceC7720dCw
    public int d(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        Object cB_ = cB_();
        C8632dsu.d(cB_);
        return ((Integer) cB_).intValue();
    }

    public <T> T d(dBP<? extends T> dbp, T t) {
        C8632dsu.c((Object) dbp, "");
        return (T) d(dbp);
    }

    @Override // o.InterfaceC7717dCt
    public final boolean a(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return c();
    }

    @Override // o.InterfaceC7717dCt
    public final byte d(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return a();
    }

    @Override // o.InterfaceC7717dCt
    public final short g(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return o();
    }

    @Override // o.InterfaceC7717dCt
    public final int j(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return f();
    }

    @Override // o.InterfaceC7717dCt
    public final long i(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return j();
    }

    @Override // o.InterfaceC7717dCt
    public final float e(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return b();
    }

    @Override // o.InterfaceC7717dCt
    public final double b(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return d();
    }

    @Override // o.InterfaceC7717dCt
    public final char c(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return e();
    }

    @Override // o.InterfaceC7717dCt
    public final String h(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return m();
    }

    @Override // o.InterfaceC7717dCt
    public InterfaceC7720dCw f(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return a(interfaceC7707dCj.c(i));
    }

    @Override // o.InterfaceC7717dCt
    public <T> T d(InterfaceC7707dCj interfaceC7707dCj, int i, dBP<? extends T> dbp, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbp, "");
        return (T) d((dBP<? extends dBP<? extends T>>) dbp, (dBP<? extends T>) t);
    }

    @Override // o.InterfaceC7717dCt
    public final <T> T e(InterfaceC7707dCj interfaceC7707dCj, int i, dBP<? extends T> dbp, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbp, "");
        return (dbp.e().i() || i()) ? (T) d((dBP<? extends dBP<? extends T>>) dbp, (dBP<? extends T>) t) : (T) g();
    }
}
