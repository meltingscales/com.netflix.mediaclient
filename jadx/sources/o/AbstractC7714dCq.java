package o;

import kotlinx.serialization.SerializationException;
import o.InterfaceC7719dCv;
import o.InterfaceC7721dCx;

/* renamed from: o.dCq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7714dCq implements InterfaceC7721dCx, InterfaceC7719dCv {
    @Override // o.InterfaceC7721dCx
    public InterfaceC7721dCx c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this;
    }

    @Override // o.InterfaceC7719dCv
    public void d(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
    }

    @Override // o.InterfaceC7721dCx
    public InterfaceC7719dCv e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this;
    }

    public boolean e(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return true;
    }

    @Override // o.InterfaceC7721dCx
    public InterfaceC7719dCv b(InterfaceC7707dCj interfaceC7707dCj, int i) {
        return InterfaceC7721dCx.a.a(this, interfaceC7707dCj, i);
    }

    public <T> void b(dBZ<? super T> dbz, T t) {
        InterfaceC7721dCx.a.c(this, dbz, t);
    }

    @Override // o.InterfaceC7719dCv
    public boolean c(InterfaceC7707dCj interfaceC7707dCj, int i) {
        return InterfaceC7719dCv.e.e(this, interfaceC7707dCj, i);
    }

    @Override // o.InterfaceC7721dCx
    public void d() {
        InterfaceC7721dCx.a.b(this);
    }

    @Override // o.InterfaceC7721dCx
    public <T> void e(dBZ<? super T> dbz, T t) {
        InterfaceC7721dCx.a.e(this, dbz, t);
    }

    public void b(Object obj) {
        C8632dsu.c(obj, "");
        throw new SerializationException("Non-serializable " + dsA.a(obj.getClass()) + " is not supported by " + dsA.a(getClass()) + " encoder");
    }

    @Override // o.InterfaceC7721dCx
    public void e() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // o.InterfaceC7721dCx
    public void c(boolean z) {
        b(Boolean.valueOf(z));
    }

    @Override // o.InterfaceC7721dCx
    public void b(byte b) {
        b(Byte.valueOf(b));
    }

    @Override // o.InterfaceC7721dCx
    public void d(short s) {
        b(Short.valueOf(s));
    }

    @Override // o.InterfaceC7721dCx
    public void b(int i) {
        b(Integer.valueOf(i));
    }

    @Override // o.InterfaceC7721dCx
    public void e(long j) {
        b(Long.valueOf(j));
    }

    @Override // o.InterfaceC7721dCx
    public void a(float f) {
        b(Float.valueOf(f));
    }

    @Override // o.InterfaceC7721dCx
    public void c(double d) {
        b(Double.valueOf(d));
    }

    @Override // o.InterfaceC7721dCx
    public void d(char c) {
        b(Character.valueOf(c));
    }

    @Override // o.InterfaceC7721dCx
    public void e(String str) {
        C8632dsu.c((Object) str, "");
        b(str);
    }

    @Override // o.InterfaceC7721dCx
    public void a(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        b(Integer.valueOf(i));
    }

    @Override // o.InterfaceC7719dCv
    public final void d(InterfaceC7707dCj interfaceC7707dCj, int i, boolean z) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            c(z);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void e(InterfaceC7707dCj interfaceC7707dCj, int i, byte b) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            b(b);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void a(InterfaceC7707dCj interfaceC7707dCj, int i, short s) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            d(s);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void c(InterfaceC7707dCj interfaceC7707dCj, int i, int i2) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            b(i2);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void b(InterfaceC7707dCj interfaceC7707dCj, int i, long j) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            e(j);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void d(InterfaceC7707dCj interfaceC7707dCj, int i, float f) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            a(f);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void e(InterfaceC7707dCj interfaceC7707dCj, int i, double d) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            c(d);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void a(InterfaceC7707dCj interfaceC7707dCj, int i, char c) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (e(interfaceC7707dCj, i)) {
            d(c);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final void c(InterfaceC7707dCj interfaceC7707dCj, int i, String str) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) str, "");
        if (e(interfaceC7707dCj, i)) {
            e(str);
        }
    }

    @Override // o.InterfaceC7719dCv
    public final InterfaceC7721dCx d(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return e(interfaceC7707dCj, i) ? c(interfaceC7707dCj.c(i)) : dDI.e;
    }

    @Override // o.InterfaceC7719dCv
    public <T> void b(InterfaceC7707dCj interfaceC7707dCj, int i, dBZ<? super T> dbz, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbz, "");
        if (e(interfaceC7707dCj, i)) {
            e((dBZ<? super dBZ<? super T>>) dbz, (dBZ<? super T>) t);
        }
    }

    @Override // o.InterfaceC7719dCv
    public <T> void d(InterfaceC7707dCj interfaceC7707dCj, int i, dBZ<? super T> dbz, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbz, "");
        if (e(interfaceC7707dCj, i)) {
            b((dBZ<? super dBZ<? super T>>) dbz, (dBZ<? super T>) t);
        }
    }
}
