package o;

import java.util.List;

/* renamed from: o.cAv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5530cAv implements InterfaceC8888fH {
    private final List<C5528cAt> d;
    private final C5524cAp e;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5530cAv copy$default(C5530cAv c5530cAv, List list, C5524cAp c5524cAp, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c5530cAv.d;
        }
        if ((i & 2) != 0) {
            c5524cAp = c5530cAv.e;
        }
        return c5530cAv.a(list, c5524cAp);
    }

    public final C5530cAv a(List<C5528cAt> list, C5524cAp c5524cAp) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c5524cAp, "");
        return new C5530cAv(list, c5524cAp);
    }

    public final List<C5528cAt> component1() {
        return this.d;
    }

    public final C5524cAp component2() {
        return this.e;
    }

    public final C5524cAp d() {
        return this.e;
    }

    public final List<C5528cAt> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5530cAv) {
            C5530cAv c5530cAv = (C5530cAv) obj;
            return C8632dsu.c(this.d, c5530cAv.d) && C8632dsu.c(this.e, c5530cAv.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        List<C5528cAt> list = this.d;
        C5524cAp c5524cAp = this.e;
        return "PostPlayPreviewsState(postPlayPreviewVideos=" + list + ", playlist=" + c5524cAp + ")";
    }

    public C5530cAv(List<C5528cAt> list, C5524cAp c5524cAp) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c5524cAp, "");
        this.d = list;
        this.e = c5524cAp;
    }
}
