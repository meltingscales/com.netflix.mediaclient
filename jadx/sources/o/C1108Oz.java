package o;

import o.InterfaceC1107Oy;
import o.InterfaceC1107Oy.c;

/* renamed from: o.Oz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1108Oz<T extends InterfaceC1107Oy.c> implements InterfaceC1107Oy<T> {
    private final T b;
    private final T c;
    private final T d;
    private final InterfaceC1107Oy<T> e;

    @Override // o.InterfaceC1107Oy
    public T a() {
        return this.b;
    }

    @Override // o.InterfaceC1107Oy
    public boolean d() {
        return true;
    }

    @Override // o.InterfaceC1107Oy
    public T e() {
        return this.d;
    }

    @Override // o.InterfaceC1107Oy
    public InterfaceC1107Oy<T> f() {
        return this.e;
    }

    @Override // o.InterfaceC1107Oy
    public boolean h() {
        return false;
    }

    public C1108Oz(T t, InterfaceC1107Oy<T> interfaceC1107Oy) {
        C8632dsu.c((Object) t, "");
        this.c = t;
        this.e = interfaceC1107Oy;
        this.b = t;
        this.d = t;
    }

    @Override // o.InterfaceC1107Oy
    public InterfaceC1107Oy<T> b() {
        return InterfaceC1107Oy.d.e(this);
    }

    @Override // o.InterfaceC1107Oy
    public T c() {
        return (T) InterfaceC1107Oy.d.d(this);
    }

    @Override // o.InterfaceC1107Oy
    public boolean a(int i) {
        Integer e = this.c.e();
        return e != null && e.intValue() == i;
    }
}
