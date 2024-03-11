package o;

import java.util.List;
import o.InterfaceC7817dGl;

/* renamed from: o.dHb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7834dHb implements InterfaceC7817dGl.e {
    private final dGO a;
    private int b;
    private final int c;
    private final int d;
    private final dGS e;
    private final int f;
    private final int g;
    private final List<InterfaceC7817dGl> h;
    private final C7826dGu i;

    public final int a() {
        return this.c;
    }

    public final dGO b() {
        return this.a;
    }

    @Override // o.InterfaceC7817dGl.e
    public dFY c() {
        return this.e;
    }

    public final dGS d() {
        return this.e;
    }

    @Override // o.InterfaceC7817dGl.e
    public C7826dGu e() {
        return this.i;
    }

    public final C7826dGu f() {
        return this.i;
    }

    public final int g() {
        return this.g;
    }

    public final int i() {
        return this.f;
    }

    public int j() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7834dHb(dGS dgs, List<? extends InterfaceC7817dGl> list, int i, dGO dgo, C7826dGu c7826dGu, int i2, int i3, int i4) {
        C8632dsu.d(dgs, "");
        C8632dsu.d(list, "");
        C8632dsu.d(c7826dGu, "");
        this.e = dgs;
        this.h = list;
        this.d = i;
        this.a = dgo;
        this.i = c7826dGu;
        this.c = i2;
        this.f = i3;
        this.g = i4;
    }

    public static /* synthetic */ C7834dHb b(C7834dHb c7834dHb, int i, dGO dgo, C7826dGu c7826dGu, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = c7834dHb.d;
        }
        if ((i5 & 2) != 0) {
            dgo = c7834dHb.a;
        }
        dGO dgo2 = dgo;
        if ((i5 & 4) != 0) {
            c7826dGu = c7834dHb.i;
        }
        C7826dGu c7826dGu2 = c7826dGu;
        if ((i5 & 8) != 0) {
            i2 = c7834dHb.c;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = c7834dHb.f;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = c7834dHb.g;
        }
        return c7834dHb.c(i, dgo2, c7826dGu2, i6, i7, i4);
    }

    public final C7834dHb c(int i, dGO dgo, C7826dGu c7826dGu, int i2, int i3, int i4) {
        C8632dsu.d(c7826dGu, "");
        return new C7834dHb(this.e, this.h, i, dgo, c7826dGu, i2, i3, i4);
    }

    @Override // o.InterfaceC7817dGl.e
    public C7824dGs e(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        if (this.d >= this.h.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.b++;
        dGO dgo = this.a;
        if (dgo != null) {
            if (!dgo.i().c(c7826dGu.j())) {
                throw new IllegalStateException(("network interceptor " + this.h.get(this.d - 1) + " must retain the same host and port").toString());
            } else if (this.b != 1) {
                throw new IllegalStateException(("network interceptor " + this.h.get(this.d - 1) + " must call proceed() exactly once").toString());
            }
        }
        C7834dHb b = b(this, this.d + 1, null, c7826dGu, 0, 0, 0, 58, null);
        InterfaceC7817dGl interfaceC7817dGl = this.h.get(this.d);
        C7824dGs a = interfaceC7817dGl.a(b);
        if (a == null) {
            throw new NullPointerException("interceptor " + interfaceC7817dGl + " returned null");
        }
        if (this.a != null) {
            if (this.d + 1 < this.h.size() && b.b != 1) {
                throw new IllegalStateException(("network interceptor " + interfaceC7817dGl + " must call proceed() exactly once").toString());
            }
        }
        if (a.e() != null) {
            return a;
        }
        throw new IllegalStateException(("interceptor " + interfaceC7817dGl + " returned a response with no body").toString());
    }
}
