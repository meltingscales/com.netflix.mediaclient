package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.ih  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9073ih implements InterfaceC9069id {
    private boolean a;
    private Object d;
    private final List<a> e = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: o.ih$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.ih$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0125a extends a {
            private final List<Object> b;

            public final List<Object> d() {
                return this.b;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0125a(List<Object> list) {
                super(null);
                C8632dsu.c((Object) list, "");
                this.b = list;
            }

            public String toString() {
                return "List (" + this.b.size() + ')';
            }
        }

        private a() {
        }

        /* renamed from: o.ih$a$e */
        /* loaded from: classes2.dex */
        public static final class e extends a {
            private final Map<String, Object> a;
            private String c;

            public final String a() {
                return this.c;
            }

            public final void b(String str) {
                this.c = str;
            }

            public final Map<String, Object> d() {
                return this.a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Map<String, Object> map, String str) {
                super(null);
                C8632dsu.c((Object) map, "");
                this.a = map;
                this.c = str;
            }

            public String toString() {
                return "Map (" + this.c + ')';
            }
        }
    }

    public final Object f() {
        if (this.a) {
            return this.d;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id c() {
        this.e.add(new a.C0125a(new ArrayList()));
        return this;
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id a() {
        List<a> list = this.e;
        a remove = list.remove(list.size() - 1);
        if (!(remove instanceof a.C0125a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        e((C9073ih) ((a.C0125a) remove).d());
        return this;
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id e() {
        this.e.add(new a.e(new LinkedHashMap(), null));
        return this;
    }

    private final Object a(Object obj, Object obj2) {
        Set c;
        int d;
        Map d2;
        C8654dtp f;
        int d3;
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        if (obj instanceof List) {
            if (!(obj2 instanceof List)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            f = C8569dql.f((Collection) obj);
            d3 = C8572dqo.d(f, 10);
            ArrayList arrayList = new ArrayList(d3);
            Iterator<Integer> it = f.iterator();
            while (it.hasNext()) {
                int nextInt = ((dqB) it).nextInt();
                arrayList.add(a(list.get(nextInt), list2.get(nextInt)));
            }
            return arrayList;
        } else if (obj instanceof Map) {
            if (!(obj2 instanceof Map)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            Map map = (Map) obj;
            Map map2 = (Map) obj2;
            c = dqM.c(map.keySet(), map2.keySet());
            Set<String> set = c;
            d = C8572dqo.d(set, 10);
            ArrayList arrayList2 = new ArrayList(d);
            for (String str : set) {
                arrayList2.add(dpD.a(str, a(map.get(str), map2.get(str))));
            }
            d2 = dqE.d(arrayList2);
            return d2;
        } else if (C8632dsu.c(obj, obj2)) {
            return obj;
        } else {
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id d() {
        List<a> list = this.e;
        a remove = list.remove(list.size() - 1);
        if (!(remove instanceof a.e)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        e((C9073ih) ((a.e) remove).d());
        return this;
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id e(String str) {
        Object B;
        C8632dsu.c((Object) str, "");
        B = C8576dqs.B((List<? extends Object>) this.e);
        a aVar = (a) B;
        if (!(aVar instanceof a.e)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        a.e eVar = (a.e) aVar;
        if (eVar.a() != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        eVar.b(str);
        return this;
    }

    private final <T> C9073ih e(T t) {
        Object D;
        D = C8576dqs.D((List<? extends Object>) this.e);
        a aVar = (a) D;
        if (aVar instanceof a.e) {
            a.e eVar = (a.e) aVar;
            String a2 = eVar.a();
            if (a2 == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (eVar.d().containsKey(a2)) {
                eVar.d().put(a2, a(eVar.d().get(a2), t));
            } else {
                eVar.d().put(a2, t);
            }
            eVar.b(null);
        } else if (aVar instanceof a.C0125a) {
            ((a.C0125a) aVar).d().add(t);
        } else {
            this.d = t;
            this.a = true;
        }
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: a */
    public C9073ih d(String str) {
        C8632dsu.c((Object) str, "");
        return e((C9073ih) str);
    }

    @Override // o.InterfaceC9069id
    /* renamed from: e */
    public C9073ih d(boolean z) {
        return e((C9073ih) Boolean.valueOf(z));
    }

    @Override // o.InterfaceC9069id
    /* renamed from: c */
    public C9073ih a(double d) {
        return e((C9073ih) Double.valueOf(d));
    }

    @Override // o.InterfaceC9069id
    /* renamed from: b */
    public C9073ih e(int i) {
        return e((C9073ih) Integer.valueOf(i));
    }

    @Override // o.InterfaceC9069id
    /* renamed from: e */
    public C9073ih d(long j) {
        return e((C9073ih) Long.valueOf(j));
    }

    @Override // o.InterfaceC9069id
    /* renamed from: e */
    public C9073ih a(C9071if c9071if) {
        C8632dsu.c((Object) c9071if, "");
        return e((C9073ih) c9071if);
    }

    @Override // o.InterfaceC9069id
    /* renamed from: d */
    public C9073ih b(InterfaceC9001hO interfaceC9001hO) {
        C8632dsu.c((Object) interfaceC9001hO, "");
        return e((C9073ih) null);
    }

    @Override // o.InterfaceC9069id
    /* renamed from: b */
    public C9073ih j() {
        return e((C9073ih) null);
    }

    @Override // o.InterfaceC9069id
    public String i() {
        int d;
        String d2;
        String a2;
        List<a> list = this.e;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (a aVar : list) {
            if (aVar instanceof a.C0125a) {
                a2 = String.valueOf(((a.C0125a) aVar).d().size());
            } else if (!(aVar instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            } else {
                a2 = ((a.e) aVar).a();
                if (a2 == null) {
                    a2 = "?";
                }
            }
            arrayList.add(a2);
        }
        d2 = C8576dqs.d(arrayList, ".", null, null, 0, null, null, 62, null);
        return d2;
    }
}
