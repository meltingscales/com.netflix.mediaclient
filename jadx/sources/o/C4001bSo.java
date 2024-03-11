package o;

import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* renamed from: o.bSo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4001bSo {
    private final boolean a;
    private final InterfaceC5155btS b;
    private final boolean c;
    private final List<C4003bSq> d;
    private final Status e;

    public static /* synthetic */ C4001bSo e(C4001bSo c4001bSo, InterfaceC5155btS interfaceC5155btS, List list, boolean z, boolean z2, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5155btS = c4001bSo.b;
        }
        List<C4003bSq> list2 = list;
        if ((i & 2) != 0) {
            list2 = c4001bSo.d;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            z = c4001bSo.a;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c4001bSo.c;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            status = c4001bSo.e;
        }
        return c4001bSo.d(interfaceC5155btS, list3, z3, z4, status);
    }

    public final InterfaceC5155btS b() {
        return this.b;
    }

    public final C4001bSo d(InterfaceC5155btS interfaceC5155btS, List<C4003bSq> list, boolean z, boolean z2, Status status) {
        return new C4001bSo(interfaceC5155btS, list, z, z2, status);
    }

    public final boolean d() {
        return this.a;
    }

    public final List<C4003bSq> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4001bSo) {
            C4001bSo c4001bSo = (C4001bSo) obj;
            return C8632dsu.c(this.b, c4001bSo.b) && C8632dsu.c(this.d, c4001bSo.d) && this.a == c4001bSo.a && this.c == c4001bSo.c && C8632dsu.c(this.e, c4001bSo.e);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC5155btS interfaceC5155btS = this.b;
        int hashCode = interfaceC5155btS == null ? 0 : interfaceC5155btS.hashCode();
        List<C4003bSq> list = this.d;
        int hashCode2 = list == null ? 0 : list.hashCode();
        int hashCode3 = Boolean.hashCode(this.a);
        int hashCode4 = Boolean.hashCode(this.c);
        Status status = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        InterfaceC5155btS interfaceC5155btS = this.b;
        List<C4003bSq> list = this.d;
        boolean z = this.a;
        boolean z2 = this.c;
        Status status = this.e;
        return "FetchNewLolomoResponse(summary=" + interfaceC5155btS + ", rows=" + list + ", hasNextPage=" + z + ", isFromCache=" + z2 + ", status=" + status + ")";
    }

    public C4001bSo(InterfaceC5155btS interfaceC5155btS, List<C4003bSq> list, boolean z, boolean z2, Status status) {
        this.b = interfaceC5155btS;
        this.d = list;
        this.a = z;
        this.c = z2;
        this.e = status;
    }

    public /* synthetic */ C4001bSo(InterfaceC5155btS interfaceC5155btS, List list, boolean z, boolean z2, Status status, int i, C8627dsp c8627dsp) {
        this(interfaceC5155btS, list, z, z2, (i & 16) != 0 ? null : status);
    }
}
