package o;

import androidx.compose.runtime.RememberObserver;
import java.util.Arrays;
import o.InterfaceC8488dnl;

/* renamed from: o.dnm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8489dnm<T> implements InterfaceC8494dnr, RememberObserver {
    private InterfaceC8488dnl.b a;
    private String b;
    private Object[] c;
    private InterfaceC8479dnc d;
    private InterfaceC8488dnl e;
    private T h;

    public C8489dnm(InterfaceC8488dnl interfaceC8488dnl, InterfaceC8479dnc interfaceC8479dnc, String str, T t, Object[] objArr) {
        C8632dsu.c((Object) interfaceC8479dnc, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) objArr, "");
        this.e = interfaceC8488dnl;
        this.d = interfaceC8479dnc;
        this.b = str;
        this.h = t;
        this.c = objArr;
    }

    public final void d(InterfaceC8488dnl interfaceC8488dnl, String str, T t, Object[] objArr) {
        boolean z;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) objArr, "");
        boolean z2 = true;
        if (this.e != interfaceC8488dnl) {
            this.e = interfaceC8488dnl;
            z = true;
        } else {
            z = false;
        }
        if (C8632dsu.c((Object) this.b, (Object) str)) {
            z2 = z;
        } else {
            this.b = str;
        }
        this.h = t;
        this.c = objArr;
        InterfaceC8488dnl.b bVar = this.a;
        if (bVar == null || !z2) {
            return;
        }
        if (bVar != null) {
            bVar.a();
        }
        this.a = null;
        d();
    }

    private final void d() {
        InterfaceC8488dnl interfaceC8488dnl = this.e;
        InterfaceC8488dnl.b bVar = this.a;
        if (bVar == null) {
            if (interfaceC8488dnl != null) {
                this.a = interfaceC8488dnl.e(this.b, this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + bVar + ") is not null").toString());
    }

    @Override // o.InterfaceC8494dnr, o.drO
    public Object invoke() {
        T t = this.h;
        if (t != null) {
            return new d(t, this.c);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }

    public final void c() {
        InterfaceC8488dnl.b bVar;
        T t = this.h;
        if (t instanceof InterfaceC8488dnl) {
            C8632dsu.d(t);
            ((InterfaceC8488dnl) t).a();
            InterfaceC8488dnl interfaceC8488dnl = this.e;
            if (interfaceC8488dnl != null) {
                interfaceC8488dnl.a(this.b);
            }
        }
        InterfaceC8488dnl interfaceC8488dnl2 = this.e;
        if (interfaceC8488dnl2 != null) {
            InterfaceC8479dnc interfaceC8479dnc = this.d;
            C8632dsu.d(interfaceC8488dnl2);
            if (interfaceC8479dnc.d(interfaceC8488dnl2) || (bVar = this.a) == null) {
                return;
            }
            bVar.a();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        d();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        c();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        c();
    }

    public final T e(Object[] objArr) {
        C8632dsu.c((Object) objArr, "");
        T t = this.h;
        if (Arrays.equals(objArr, this.c)) {
            return t;
        }
        return null;
    }

    /* renamed from: o.dnm$d */
    /* loaded from: classes5.dex */
    public static final class d<T> {
        private final Object[] b;
        private final T e;

        public final T a() {
            return this.e;
        }

        public final Object[] e() {
            return this.b;
        }

        public d(T t, Object[] objArr) {
            C8632dsu.c((Object) objArr, "");
            this.e = t;
            this.b = objArr;
        }
    }
}
