package o;

/* renamed from: o.bUn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4054bUn {
    private final C5843cKk a;
    private final boolean e;

    public C4054bUn() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ C4054bUn d(C4054bUn c4054bUn, C5843cKk c5843cKk, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c5843cKk = c4054bUn.a;
        }
        if ((i & 2) != 0) {
            z = c4054bUn.e;
        }
        return c4054bUn.e(c5843cKk, z);
    }

    public final C5843cKk b() {
        return this.a;
    }

    public final boolean c() {
        return this.e;
    }

    public final C4054bUn e(C5843cKk c5843cKk, boolean z) {
        C8632dsu.c((Object) c5843cKk, "");
        return new C4054bUn(c5843cKk, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4054bUn) {
            C4054bUn c4054bUn = (C4054bUn) obj;
            return C8632dsu.c(this.a, c4054bUn.a) && this.e == c4054bUn.e;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        C5843cKk c5843cKk = this.a;
        boolean z = this.e;
        return "NotificationsState(notifications=" + c5843cKk + ", fetched=" + z + ")";
    }

    public C4054bUn(C5843cKk c5843cKk, boolean z) {
        C8632dsu.c((Object) c5843cKk, "");
        this.a = c5843cKk;
        this.e = z;
    }

    public /* synthetic */ C4054bUn(C5843cKk c5843cKk, boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new C5843cKk(null, null, 0, 7, null) : c5843cKk, (i & 2) != 0 ? false : z);
    }
}
