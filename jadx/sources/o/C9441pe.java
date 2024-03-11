package o;

import o.InterfaceC9383oZ;

/* renamed from: o.pe  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9441pe<F extends InterfaceC9383oZ> {
    protected int a;

    protected C9441pe(int i) {
        this.a = i;
    }

    public static <F extends InterfaceC9383oZ> C9441pe<F> e(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int i = 0;
        for (F f : fArr) {
            if (f.b()) {
                i |= f.a();
            }
        }
        return new C9441pe<>(i);
    }

    public C9441pe<F> c(F f) {
        int a = f.a() | this.a;
        return a == this.a ? this : new C9441pe<>(a);
    }
}
