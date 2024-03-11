package o;

import java.util.List;

/* renamed from: o.dcz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8049dcz implements InterfaceC8888fH {
    private final C5839cKg a;
    private final boolean b;
    private final C7969dbY c;
    private final List<C7969dbY> d;

    public C8049dcz() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C8049dcz copy$default(C8049dcz c8049dcz, List list, C7969dbY c7969dbY, boolean z, C5839cKg c5839cKg, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c8049dcz.d;
        }
        if ((i & 2) != 0) {
            c7969dbY = c8049dcz.c;
        }
        if ((i & 4) != 0) {
            z = c8049dcz.b;
        }
        if ((i & 8) != 0) {
            c5839cKg = c8049dcz.a;
        }
        return c8049dcz.c(list, c7969dbY, z, c5839cKg);
    }

    public final List<C7969dbY> a() {
        return this.d;
    }

    public final C7969dbY b() {
        return this.c;
    }

    public final C8049dcz c(List<C7969dbY> list, C7969dbY c7969dbY, boolean z, C5839cKg c5839cKg) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c5839cKg, "");
        return new C8049dcz(list, c7969dbY, z, c5839cKg);
    }

    public final boolean c() {
        return this.b;
    }

    public final List<C7969dbY> component1() {
        return this.d;
    }

    public final C7969dbY component2() {
        return this.c;
    }

    public final boolean component3() {
        return this.b;
    }

    public final C5839cKg component4() {
        return this.a;
    }

    public final C5839cKg e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8049dcz) {
            C8049dcz c8049dcz = (C8049dcz) obj;
            return C8632dsu.c(this.d, c8049dcz.d) && C8632dsu.c(this.c, c8049dcz.c) && this.b == c8049dcz.b && C8632dsu.c(this.a, c8049dcz.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        C7969dbY c7969dbY = this.c;
        return (((((hashCode * 31) + (c7969dbY == null ? 0 : c7969dbY.hashCode())) * 31) + Boolean.hashCode(this.b)) * 31) + this.a.hashCode();
    }

    public String toString() {
        List<C7969dbY> list = this.d;
        C7969dbY c7969dbY = this.c;
        boolean z = this.b;
        C5839cKg c5839cKg = this.a;
        return "UserMarksState(userMarks=" + list + ", selectedUserMark=" + c7969dbY + ", editModeEnabled=" + z + ", presentationTracking=" + c5839cKg + ")";
    }

    public C8049dcz(List<C7969dbY> list, C7969dbY c7969dbY, boolean z, C5839cKg c5839cKg) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c5839cKg, "");
        this.d = list;
        this.c = c7969dbY;
        this.b = z;
        this.a = c5839cKg;
    }

    public /* synthetic */ C8049dcz(List list, C7969dbY c7969dbY, boolean z, C5839cKg c5839cKg, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C8569dql.i() : list, (i & 2) != 0 ? null : c7969dbY, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C5839cKg() : c5839cKg);
    }
}
