package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.AbstractC8997hK;
import o.C8632dsu;
import o.C9021hi;
import o.InterfaceC9034hv;

/* renamed from: o.hf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9018hf extends AbstractC9025hm {
    private final List<C9020hh> a;
    private final String b;
    private final List<C9021hi> c;
    private final List<AbstractC9025hm> d;
    private final String e;
    private final AbstractC9026hn h;

    public final String a() {
        String str = this.e;
        return str == null ? this.b : str;
    }

    public final List<C9021hi> b() {
        return this.c;
    }

    public final List<C9020hh> c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.e;
    }

    public final AbstractC9026hn g() {
        return this.h;
    }

    public final List<AbstractC9025hm> j() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9018hf(String str, AbstractC9026hn abstractC9026hn, String str2, List<C9020hh> list, List<C9021hi> list2, List<? extends AbstractC9025hm> list3) {
        super(null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC9026hn, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) list3, "");
        this.b = str;
        this.h = abstractC9026hn;
        this.e = str2;
        this.a = list;
        this.c = list2;
        this.d = list3;
    }

    public final Object c(String str, InterfaceC9034hv.c cVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        return b(str, cVar).e();
    }

    public final String a(InterfaceC9034hv.c cVar) {
        C8632dsu.c((Object) cVar, "");
        Map<String, Object> e = e(cVar, new drM<C9021hi, Boolean>() { // from class: com.apollographql.apollo3.api.CompiledField$nameWithArguments$arguments$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C9021hi c9021hi) {
                C8632dsu.c((Object) c9021hi, "");
                return Boolean.valueOf(!c9021hi.a());
            }
        });
        if (e.isEmpty()) {
            return this.b;
        }
        try {
            C7872dIo c7872dIo = new C7872dIo();
            C9072ig c9072ig = new C9072ig(c7872dIo, null, 2, null);
            C9012hZ.c(c9072ig, e);
            c9072ig.close();
            return this.b + '(' + c7872dIo.v() + ')';
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final a i() {
        return new a(this);
    }

    /* renamed from: o.hf$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private List<C9021hi> a;
        private List<? extends AbstractC9025hm> b;
        private List<C9020hh> c;
        private final String d;
        private String e;
        private final AbstractC9026hn h;

        public final a b(List<C9021hi> list) {
            C8632dsu.c((Object) list, "");
            this.a = list;
            return this;
        }

        public final a c(String str) {
            this.e = str;
            return this;
        }

        public final a c(List<C9020hh> list) {
            C8632dsu.c((Object) list, "");
            this.c = list;
            return this;
        }

        public final a e(List<? extends AbstractC9025hm> list) {
            C8632dsu.c((Object) list, "");
            this.b = list;
            return this;
        }

        public a(String str, AbstractC9026hn abstractC9026hn) {
            List<C9020hh> i;
            List<C9021hi> i2;
            List<? extends AbstractC9025hm> i3;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) abstractC9026hn, "");
            this.d = str;
            this.h = abstractC9026hn;
            i = C8569dql.i();
            this.c = i;
            i2 = C8569dql.i();
            this.a = i2;
            i3 = C8569dql.i();
            this.b = i3;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C9018hf c9018hf) {
            this(c9018hf.d(), c9018hf.g());
            C8632dsu.c((Object) c9018hf, "");
            this.e = c9018hf.e();
            this.c = c9018hf.c();
            this.a = c9018hf.b();
            this.b = c9018hf.j();
        }

        public final C9018hf d() {
            return new C9018hf(this.d, this.h, this.e, this.c, this.a, this.b);
        }
    }

    public final AbstractC8997hK<Object> b(String str, InterfaceC9034hv.c cVar) {
        Object obj;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((C9021hi) obj).e(), (Object) str)) {
                break;
            }
        }
        C9021hi c9021hi = (C9021hi) obj;
        if (c9021hi == null) {
            return AbstractC8997hK.e.c;
        }
        if (c9021hi.b() instanceof AbstractC8997hK.e) {
            return AbstractC8997hK.e.c;
        }
        Object a2 = C9019hg.a(c9021hi.b().c(), cVar);
        if (a2 instanceof AbstractC8997hK.e) {
            return AbstractC8997hK.e.c;
        }
        return AbstractC8997hK.d.e(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, Object> e(InterfaceC9034hv.c cVar, drM<? super C9021hi, Boolean> drm) {
        int d;
        int e;
        int b;
        Map<String, Object> d2;
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) drm, "");
        List<C9021hi> list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (drm.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList<C9021hi> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C9021hi) obj2).b() instanceof AbstractC8997hK.b) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            d2 = dqE.d();
            return d2;
        }
        d = C8572dqo.d(arrayList2, 10);
        e = dqD.e(d);
        b = C8657dts.b(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (C9021hi c9021hi : arrayList2) {
            Pair a2 = dpD.a(c9021hi.e(), c9021hi.b().c());
            linkedHashMap.put(a2.d(), a2.a());
        }
        Object a3 = C9019hg.a(linkedHashMap, cVar);
        C8632dsu.d(a3);
        return (Map) a3;
    }
}
