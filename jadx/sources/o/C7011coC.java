package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.C6971cnP;

/* renamed from: o.coC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7011coC implements InterfaceC8888fH {
    private final boolean a;
    private final bZK b;
    private final boolean c;
    private final List<InterfaceC6972cnQ<?>> d;
    private final List<C7058coz> e;
    private final int f;
    private final C5839cKg g;
    private final String h;
    private final AbstractC8918fl<C7013coE> i;
    private final AbstractC8918fl<C6971cnP> j;
    private final MyListSortOrder l;
    private final MyListTabItems.Type m;

    public C7011coC() {
        this(null, null, false, null, null, null, null, 0, null, null, false, null, 4095, null);
    }

    public final List<InterfaceC6972cnQ<?>> a() {
        return this.d;
    }

    public final List<C7058coz> b() {
        return this.e;
    }

    public final C7011coC b(MyListTabItems.Type type, String str, boolean z, AbstractC8918fl<C7013coE> abstractC8918fl, AbstractC8918fl<C6971cnP> abstractC8918fl2, List<? extends InterfaceC6972cnQ<?>> list, MyListSortOrder myListSortOrder, int i, C5839cKg c5839cKg, List<C7058coz> list2, boolean z2, bZK bzk) {
        C8632dsu.c((Object) type, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) myListSortOrder, "");
        C8632dsu.c((Object) c5839cKg, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) bzk, "");
        return new C7011coC(type, str, z, abstractC8918fl, abstractC8918fl2, list, myListSortOrder, i, c5839cKg, list2, z2, bzk);
    }

    public final boolean c() {
        return this.c;
    }

    public final MyListTabItems.Type component1() {
        return this.m;
    }

    public final List<C7058coz> component10() {
        return this.e;
    }

    public final boolean component11() {
        return this.c;
    }

    public final bZK component12() {
        return this.b;
    }

    public final String component2() {
        return this.h;
    }

    public final boolean component3() {
        return this.a;
    }

    public final AbstractC8918fl<C7013coE> component4() {
        return this.i;
    }

    public final AbstractC8918fl<C6971cnP> component5() {
        return this.j;
    }

    public final List<InterfaceC6972cnQ<?>> component6() {
        return this.d;
    }

    public final MyListSortOrder component7() {
        return this.l;
    }

    public final int component8() {
        return this.f;
    }

    public final C5839cKg component9() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7011coC) {
            C7011coC c7011coC = (C7011coC) obj;
            return this.m == c7011coC.m && C8632dsu.c((Object) this.h, (Object) c7011coC.h) && this.a == c7011coC.a && C8632dsu.c(this.i, c7011coC.i) && C8632dsu.c(this.j, c7011coC.j) && C8632dsu.c(this.d, c7011coC.d) && C8632dsu.c(this.l, c7011coC.l) && this.f == c7011coC.f && C8632dsu.c(this.g, c7011coC.g) && C8632dsu.c(this.e, c7011coC.e) && this.c == c7011coC.c && C8632dsu.c(this.b, c7011coC.b);
        }
        return false;
    }

    public final AbstractC8918fl<C6971cnP> f() {
        return this.j;
    }

    public final String g() {
        return this.h;
    }

    public final AbstractC8918fl<C7013coE> h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.m.hashCode();
        String str = this.h;
        return (((((((((((((((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.a)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.d.hashCode()) * 31) + this.l.hashCode()) * 31) + Integer.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + this.b.hashCode();
    }

    public final C5839cKg i() {
        return this.g;
    }

    public final bZK j() {
        return this.b;
    }

    public final MyListTabItems.Type l() {
        return this.m;
    }

    public final MyListSortOrder n() {
        return this.l;
    }

    public final int o() {
        return this.f;
    }

    public final boolean p() {
        return this.a;
    }

    public String toString() {
        MyListTabItems.Type type = this.m;
        String str = this.h;
        boolean z = this.a;
        AbstractC8918fl<C7013coE> abstractC8918fl = this.i;
        AbstractC8918fl<C6971cnP> abstractC8918fl2 = this.j;
        List<InterfaceC6972cnQ<?>> list = this.d;
        MyListSortOrder myListSortOrder = this.l;
        int i = this.f;
        C5839cKg c5839cKg = this.g;
        List<C7058coz> list2 = this.e;
        boolean z2 = this.c;
        bZK bzk = this.b;
        return "MyListState(type=" + type + ", lolomoId=" + str + ", isListRefreshing=" + z + ", myListVideos=" + abstractC8918fl + ", myListGames=" + abstractC8918fl2 + ", filterGroups=" + list + ", sortOrder=" + myListSortOrder + ", selectedSortOrder=" + i + ", presentationTracking=" + c5839cKg + ", flaggedForRemovalList=" + list2 + ", editModeEnabled=" + z2 + ", liveVideosState=" + bzk + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7011coC(MyListTabItems.Type type, String str, boolean z, AbstractC8918fl<C7013coE> abstractC8918fl, AbstractC8918fl<C6971cnP> abstractC8918fl2, List<? extends InterfaceC6972cnQ<?>> list, MyListSortOrder myListSortOrder, int i, C5839cKg c5839cKg, List<C7058coz> list2, boolean z2, bZK bzk) {
        C8632dsu.c((Object) type, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) myListSortOrder, "");
        C8632dsu.c((Object) c5839cKg, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) bzk, "");
        this.m = type;
        this.h = str;
        this.a = z;
        this.i = abstractC8918fl;
        this.j = abstractC8918fl2;
        this.d = list;
        this.l = myListSortOrder;
        this.f = i;
        this.g = c5839cKg;
        this.e = list2;
        this.c = z2;
        this.b = bzk;
    }

    public /* synthetic */ C7011coC(MyListTabItems.Type type, String str, boolean z, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, List list, MyListSortOrder myListSortOrder, int i, C5839cKg c5839cKg, List list2, boolean z2, bZK bzk, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? MyListTabItems.Type.e : type, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? C8974go.e : abstractC8918fl, (i2 & 16) != 0 ? C8974go.e : abstractC8918fl2, (i2 & 32) != 0 ? InterfaceC6972cnQ.c.b() : list, (i2 & 64) != 0 ? MyListSortOrder.Default.b : myListSortOrder, (i2 & 128) != 0 ? 0 : i, (i2 & JSONzip.end) != 0 ? new C5839cKg() : c5839cKg, (i2 & 512) != 0 ? C8569dql.i() : list2, (i2 & 1024) == 0 ? z2 : false, (i2 & 2048) != 0 ? new bZK(null, null, null, 7, null) : bzk);
    }

    public final boolean s() {
        return !(this.i instanceof InterfaceC8881fA) ? !((this.j instanceof InterfaceC8881fA) && this.m == MyListTabItems.Type.a) : this.m != MyListTabItems.Type.e;
    }

    public final boolean e() {
        C7013coE c = this.i.c();
        return c != null && c.e();
    }

    public final List<C7053cou> k() {
        List<C7053cou> b;
        C7013coE c = this.i.c();
        if (c == null || (b = c.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (!c(((C7053cou) obj).getVideo().getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<C6971cnP.a> c(C6971cnP c6971cnP) {
        C8632dsu.c((Object) c6971cnP, "");
        List<C6971cnP.a> e = c6971cnP.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (!c(String.valueOf(((C6971cnP.a) obj).c()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean d() {
        AbstractC8918fl<C6971cnP> abstractC8918fl = this.j;
        return (abstractC8918fl instanceof C8974go) || (abstractC8918fl instanceof C8971gl);
    }

    public final boolean m() {
        List<InterfaceC6972cnQ<?>> list = this.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC6972cnQ) it.next()).a() != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean c(String str) {
        List<C7058coz> list = this.e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C7058coz c7058coz : list) {
                if (C8632dsu.c((Object) c7058coz.c(), (Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
