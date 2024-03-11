package o;

import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.List;

/* renamed from: o.cox  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7056cox implements InterfaceC8888fH {
    private final boolean a;
    private final C7057coy b;
    private final MyListTabItems.Type c;
    private final boolean d;
    private final List<MyListTabItems.Type> e;

    public C7056cox() {
        this(false, null, false, null, null, 31, null);
    }

    public static /* synthetic */ C7056cox copy$default(C7056cox c7056cox, boolean z, C7057coy c7057coy, boolean z2, List list, MyListTabItems.Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c7056cox.d;
        }
        if ((i & 2) != 0) {
            c7057coy = c7056cox.b;
        }
        C7057coy c7057coy2 = c7057coy;
        if ((i & 4) != 0) {
            z2 = c7056cox.a;
        }
        boolean z3 = z2;
        List<MyListTabItems.Type> list2 = list;
        if ((i & 8) != 0) {
            list2 = c7056cox.e;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            type = c7056cox.c;
        }
        return c7056cox.c(z, c7057coy2, z3, list3, type);
    }

    public final boolean b() {
        return this.a;
    }

    public final C7056cox c(boolean z, C7057coy c7057coy, boolean z2, List<? extends MyListTabItems.Type> list, MyListTabItems.Type type) {
        C8632dsu.c((Object) c7057coy, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) type, "");
        return new C7056cox(z, c7057coy, z2, list, type);
    }

    public final C7057coy c() {
        return this.b;
    }

    public final boolean component1() {
        return this.d;
    }

    public final C7057coy component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.a;
    }

    public final List<MyListTabItems.Type> component4() {
        return this.e;
    }

    public final MyListTabItems.Type component5() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7056cox) {
            C7056cox c7056cox = (C7056cox) obj;
            return this.d == c7056cox.d && C8632dsu.c(this.b, c7056cox.b) && this.a == c7056cox.a && C8632dsu.c(this.e, c7056cox.e) && this.c == c7056cox.c;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.d) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + this.e.hashCode()) * 31) + this.c.hashCode();
    }

    public final List<MyListTabItems.Type> i() {
        return this.e;
    }

    public String toString() {
        boolean z = this.d;
        C7057coy c7057coy = this.b;
        boolean z2 = this.a;
        List<MyListTabItems.Type> list = this.e;
        MyListTabItems.Type type = this.c;
        return "MyListActivityState(editModeEnabled=" + z + ", editModeIconVisibilityState=" + c7057coy + ", showMyGamePopOver=" + z2 + ", tabs=" + list + ", selectedTab=" + type + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7056cox(boolean z, C7057coy c7057coy, boolean z2, List<? extends MyListTabItems.Type> list, MyListTabItems.Type type) {
        C8632dsu.c((Object) c7057coy, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) type, "");
        this.d = z;
        this.b = c7057coy;
        this.a = z2;
        this.e = list;
        this.c = type;
    }

    public /* synthetic */ C7056cox(boolean z, C7057coy c7057coy, boolean z2, List list, MyListTabItems.Type type, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new C7057coy(false, false) : c7057coy, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? C8569dql.i() : list, (i & 16) != 0 ? MyListTabItems.Type.e : type);
    }

    public final int d() {
        return this.e.indexOf(this.c);
    }

    public final boolean a() {
        return !this.d && ((this.c == MyListTabItems.Type.a && this.b.b()) || (this.c == MyListTabItems.Type.e && this.b.d()));
    }
}
