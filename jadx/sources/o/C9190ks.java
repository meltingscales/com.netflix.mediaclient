package o;

import com.bugsnag.android.Breadcrumb;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.ks  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9190ks {
    public static final b c = new b(null);
    private final Collection<InterfaceC9215lQ> a;
    private InterfaceC9257mF b;
    private final Collection<InterfaceC9218lT> d;
    private final List<InterfaceC9214lP> e;
    private final Collection<InterfaceC9216lR> i;

    public C9190ks() {
        this(null, null, null, null, 15, null);
    }

    public final List<InterfaceC9214lP> a() {
        return this.e;
    }

    public final Collection<InterfaceC9216lR> c() {
        return this.i;
    }

    public final Collection<InterfaceC9215lQ> d() {
        return this.a;
    }

    public final Collection<InterfaceC9218lT> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9190ks) {
            C9190ks c9190ks = (C9190ks) obj;
            return C8632dsu.c(this.d, c9190ks.d) && C8632dsu.c(this.a, c9190ks.a) && C8632dsu.c(this.i, c9190ks.i) && C8632dsu.c(this.e, c9190ks.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.i.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "CallbackState(onErrorTasks=" + this.d + ", onBreadcrumbTasks=" + this.a + ", onSessionTasks=" + this.i + ", onSendTasks=" + this.e + ')';
    }

    public C9190ks(Collection<InterfaceC9218lT> collection, Collection<InterfaceC9215lQ> collection2, Collection<InterfaceC9216lR> collection3, List<InterfaceC9214lP> list) {
        this.d = collection;
        this.a = collection2;
        this.i = collection3;
        this.e = list;
        this.b = new C9260mI();
    }

    public /* synthetic */ C9190ks(Collection collection, Collection collection2, Collection collection3, List list, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new CopyOnWriteArrayList() : collection, (i & 2) != 0 ? new CopyOnWriteArrayList() : collection2, (i & 4) != 0 ? new CopyOnWriteArrayList() : collection3, (i & 8) != 0 ? new CopyOnWriteArrayList() : list);
    }

    /* renamed from: o.ks$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public final void e(InterfaceC9257mF interfaceC9257mF) {
        this.b = interfaceC9257mF;
        interfaceC9257mF.b(b());
    }

    public void c(InterfaceC9218lT interfaceC9218lT) {
        if (this.d.add(interfaceC9218lT)) {
            this.b.a("onError");
        }
    }

    public final boolean d(C9229le c9229le, InterfaceC9200lB interfaceC9200lB) {
        if (this.d.isEmpty()) {
            return true;
        }
        for (InterfaceC9218lT interfaceC9218lT : this.d) {
            try {
            } catch (Throwable th) {
                interfaceC9200lB.e("OnBreadcrumbCallback threw an Exception", th);
            }
            if (!interfaceC9218lT.c(c9229le)) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(Breadcrumb breadcrumb, InterfaceC9200lB interfaceC9200lB) {
        if (this.a.isEmpty()) {
            return true;
        }
        for (InterfaceC9215lQ interfaceC9215lQ : this.a) {
            try {
            } catch (Throwable th) {
                interfaceC9200lB.e("OnBreadcrumbCallback threw an Exception", th);
            }
            if (!interfaceC9215lQ.b(breadcrumb)) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(C9220lV c9220lV, InterfaceC9200lB interfaceC9200lB) {
        if (this.i.isEmpty()) {
            return true;
        }
        for (InterfaceC9216lR interfaceC9216lR : this.i) {
            try {
            } catch (Throwable th) {
                interfaceC9200lB.e("OnSessionCallback threw an Exception", th);
            }
            if (!interfaceC9216lR.d(c9220lV)) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(drO<? extends C9229le> dro, InterfaceC9200lB interfaceC9200lB) {
        if (this.e.isEmpty()) {
            return true;
        }
        return b(dro.invoke(), interfaceC9200lB);
    }

    private final Map<String, Integer> b() {
        HashMap hashMap = new HashMap();
        if (d().size() > 0) {
            hashMap.put("onBreadcrumb", Integer.valueOf(d().size()));
        }
        if (e().size() > 0) {
            hashMap.put("onError", Integer.valueOf(e().size()));
        }
        if (a().size() > 0) {
            hashMap.put("onSendError", Integer.valueOf(a().size()));
        }
        if (c().size() > 0) {
            hashMap.put("onSession", Integer.valueOf(c().size()));
        }
        return hashMap;
    }

    public final boolean b(C9229le c9229le, InterfaceC9200lB interfaceC9200lB) {
        for (InterfaceC9214lP interfaceC9214lP : this.e) {
            try {
            } catch (Throwable th) {
                interfaceC9200lB.e("OnSendCallback threw an Exception", th);
            }
            if (!interfaceC9214lP.d(c9229le)) {
                return false;
            }
        }
        return true;
    }
}
