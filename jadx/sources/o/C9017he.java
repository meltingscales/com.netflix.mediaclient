package o;

import java.util.List;

/* renamed from: o.he  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9017he extends AbstractC9025hm {
    private final List<AbstractC9025hm> a;
    private final List<C9020hh> b;
    private final String c;
    private final List<String> e;

    public final List<String> a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final List<C9020hh> d() {
        return this.b;
    }

    public final List<AbstractC9025hm> e() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9017he(String str, List<String> list, List<C9020hh> list2, List<? extends AbstractC9025hm> list3) {
        super(null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) list3, "");
        this.c = str;
        this.e = list;
        this.b = list2;
        this.a = list3;
    }

    /* renamed from: o.he$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final String b;
        private final List<String> c;
        private List<? extends AbstractC9025hm> d;
        private List<C9020hh> e;

        public final d b(List<? extends AbstractC9025hm> list) {
            C8632dsu.c((Object) list, "");
            this.d = list;
            return this;
        }

        public final d d(List<C9020hh> list) {
            C8632dsu.c((Object) list, "");
            this.e = list;
            return this;
        }

        public d(String str, List<String> list) {
            List<C9020hh> i;
            List<? extends AbstractC9025hm> i2;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            this.b = str;
            this.c = list;
            i = C8569dql.i();
            this.e = i;
            i2 = C8569dql.i();
            this.d = i2;
        }

        public final C9017he a() {
            return new C9017he(this.b, this.c, this.e, this.d);
        }
    }
}
