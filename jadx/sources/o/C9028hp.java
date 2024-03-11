package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC9032ht;

/* renamed from: o.hp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9028hp implements InterfaceC9032ht.e {
    public static final b b = new b(null);
    public static final C9028hp c = new d().e();
    public static final C9028hp e = new d().d(true).e();
    public final List<C9035hw> a;
    public final Set<C9031hs> d;
    public final Set<String> f;
    private final Map<String, InterfaceC8949gP<?>> g;
    private final boolean i;

    public /* synthetic */ C9028hp(Map map, Set set, Set set2, List list, boolean z, C8627dsp c8627dsp) {
        this(map, set, set2, list, z);
    }

    @Override // o.InterfaceC9032ht.e
    public InterfaceC9032ht.b<?> a() {
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9028hp(Map<String, ? extends InterfaceC8949gP<?>> map, Set<String> set, Set<C9031hs> set2, List<C9035hw> list, boolean z) {
        this.f = set;
        this.d = set2;
        this.a = list;
        this.i = z;
        this.g = map;
    }

    /* renamed from: o.hp$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC9032ht.b<C9028hp> {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public final d d() {
        return new d().c(this).a(this.f).b(this.d);
    }

    /* renamed from: o.hp$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final Map<String, InterfaceC8949gP<?>> a = new LinkedHashMap();
        private List<C9035hw> b;
        private Set<C9031hs> c;
        private Set<String> d;
        private boolean e;

        public final d a(Set<String> set) {
            this.d = set;
            return this;
        }

        public final d b(Set<C9031hs> set) {
            this.c = set;
            return this;
        }

        public final d d(List<C9035hw> list) {
            this.b = list;
            return this;
        }

        public final d d(boolean z) {
            this.e = z;
            return this;
        }

        public final d c(C9028hp c9028hp) {
            C8632dsu.c((Object) c9028hp, "");
            this.a.putAll(c9028hp.g);
            return this;
        }

        public final C9028hp e() {
            return new C9028hp(this.a, this.d, this.c, this.b, this.e, null);
        }
    }
}
