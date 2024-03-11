package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.gT */
/* loaded from: classes2.dex */
public final class C8953gT {
    public static final C8952gS<Boolean> a;
    public static final C8952gS<Integer> b;
    public static final C8952gS<Double> c;
    public static final C8952gS<Object> d;
    public static final InterfaceC8949gP<Object> e;
    public static final InterfaceC8949gP<Float> f;
    public static final InterfaceC8949gP<Double> g;
    public static final C8952gS<String> h;
    public static final InterfaceC8949gP<Boolean> i;
    public static final InterfaceC8949gP<Integer> j;
    public static final C8994hH<Double> k;
    public static final C8994hH<Boolean> l;
    public static final C8994hH<Object> m;
    public static final C8994hH<Integer> n;

    /* renamed from: o */
    public static final InterfaceC8949gP<Long> f13871o;
    public static final InterfaceC8949gP<String> p;
    public static final InterfaceC8949gP<InterfaceC9001hO> s;
    public static final C8994hH<String> t;

    /* renamed from: o.gT$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<String> {
        g() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public String b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String k = jsonReader.k();
            C8632dsu.d((Object) k);
            return k;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, String str) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) str, "");
            interfaceC9069id.d(str);
        }
    }

    static {
        g gVar = new g();
        p = gVar;
        b bVar = new b();
        j = bVar;
        e eVar = new e();
        g = eVar;
        f = new c();
        f13871o = new h();
        d dVar = new d();
        i = dVar;
        a aVar = new a();
        e = aVar;
        s = new f();
        t = d(gVar);
        k = d(eVar);
        n = d(bVar);
        l = d(dVar);
        m = d(aVar);
        h = new C8952gS<>(gVar);
        c = new C8952gS<>(eVar);
        b = new C8952gS<>(bVar);
        a = new C8952gS<>(dVar);
        d = new C8952gS<>(aVar);
    }

    /* renamed from: o.gT$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<Integer> {
        b() {
        }

        @Override // o.InterfaceC8949gP
        public /* synthetic */ void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Integer num) {
            b(interfaceC9069id, c9028hp, num.intValue());
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public Integer b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            return Integer.valueOf(jsonReader.f());
        }

        public void b(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, int i) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            interfaceC9069id.e(i);
        }
    }

    /* renamed from: o.gT$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<Double> {
        e() {
        }

        @Override // o.InterfaceC8949gP
        public /* synthetic */ void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Double d) {
            b(interfaceC9069id, c9028hp, d.doubleValue());
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public Double b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            return Double.valueOf(jsonReader.i());
        }

        public void b(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, double d) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            interfaceC9069id.a(d);
        }
    }

    /* renamed from: o.gT$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<Float> {
        c() {
        }

        @Override // o.InterfaceC8949gP
        public /* synthetic */ void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Float f) {
            a(interfaceC9069id, c9028hp, f.floatValue());
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public Float b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            return Float.valueOf((float) jsonReader.i());
        }

        public void a(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, float f) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            interfaceC9069id.a(f);
        }
    }

    /* renamed from: o.gT$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<Long> {
        h() {
        }

        @Override // o.InterfaceC8949gP
        public /* synthetic */ void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Long l) {
            e(interfaceC9069id, c9028hp, l.longValue());
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public Long b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            return Long.valueOf(jsonReader.h());
        }

        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, long j) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            interfaceC9069id.d(j);
        }
    }

    /* renamed from: o.gT$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<Boolean> {
        d() {
        }

        @Override // o.InterfaceC8949gP
        public /* synthetic */ void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Boolean bool) {
            b(interfaceC9069id, c9028hp, bool.booleanValue());
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public Boolean b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            return Boolean.valueOf(jsonReader.j());
        }

        public void b(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            interfaceC9069id.d(z);
        }
    }

    /* renamed from: o.gT$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<Object> {
        a() {
        }

        public final Object e(JsonReader jsonReader) {
            C8632dsu.c((Object) jsonReader, "");
            Object b = C9011hY.b(jsonReader);
            C8632dsu.d(b);
            return b;
        }

        public final void c(InterfaceC9069id interfaceC9069id, Object obj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c(obj, "");
            C9012hZ.c(interfaceC9069id, obj);
        }

        @Override // o.InterfaceC8949gP
        public Object b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            return e(jsonReader);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Object obj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c(obj, "");
            c(interfaceC9069id, obj);
        }
    }

    /* renamed from: o.gT$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<InterfaceC9001hO> {
        f() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public InterfaceC9001hO b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            throw new IllegalStateException("File Upload used in output position".toString());
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, InterfaceC9001hO interfaceC9001hO) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) interfaceC9001hO, "");
            interfaceC9069id.b(interfaceC9001hO);
        }
    }

    public static final <T> C8996hJ<T> e(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        return new C8996hJ<>(interfaceC8949gP);
    }

    public static final <T> C8994hH<T> d(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        return new C8994hH<>(interfaceC8949gP);
    }

    public static final <T> C8989hC<T> a(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        return new C8989hC<>(interfaceC8949gP);
    }

    public static final <T> C8993hG<T> a(InterfaceC8949gP<T> interfaceC8949gP, boolean z) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        return new C8993hG<>(interfaceC8949gP, z);
    }

    public static /* synthetic */ C8993hG c(InterfaceC8949gP interfaceC8949gP, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return a(interfaceC8949gP, z);
    }
}
