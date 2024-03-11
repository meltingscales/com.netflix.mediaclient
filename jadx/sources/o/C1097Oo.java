package o;

import java.util.List;

/* renamed from: o.Oo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1097Oo {
    private final C3658bG b;
    private final List<C1099Oq> c;
    private final int d;
    private final int e;

    public final int a() {
        return this.e;
    }

    public final int c() {
        return this.d;
    }

    public final C3658bG d() {
        return this.b;
    }

    public final List<C1099Oq> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1097Oo) {
            C1097Oo c1097Oo = (C1097Oo) obj;
            return C8632dsu.c(this.b, c1097Oo.b) && C8632dsu.c(this.c, c1097Oo.c) && this.e == c1097Oo.e && this.d == c1097Oo.d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        C3658bG c3658bG = this.b;
        List<C1099Oq> list = this.c;
        int i = this.e;
        int i2 = this.d;
        return "NetflixLottieComposition(composition=" + c3658bG + ", netflixTagList=" + list + ", sourceWidth=" + i + ", sourceHeight=" + i2 + ")";
    }

    public C1097Oo(C3658bG c3658bG, List<C1099Oq> list, int i, int i2) {
        C8632dsu.c((Object) c3658bG, "");
        C8632dsu.c((Object) list, "");
        this.b = c3658bG;
        this.c = list;
        this.e = i;
        this.d = i2;
    }
}
