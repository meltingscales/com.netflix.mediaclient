package o;

import java.util.List;

/* renamed from: o.hA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8987hA extends AbstractC9023hk {
    private final List<C8987hA> a;
    private final List<String> b;
    private final List<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8987hA(String str, List<String> list, List<C8987hA> list2, List<String> list3) {
        super(str, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) list3, "");
        this.b = list;
        this.a = list2;
        this.c = list3;
    }

    /* renamed from: o.hA$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private List<C8987hA> a;
        private List<String> b;
        private List<String> c;
        private final String e;

        public final d b(List<C8987hA> list) {
            C8632dsu.c((Object) list, "");
            this.a = list;
            return this;
        }

        public d(String str) {
            List<String> i;
            List<C8987hA> i2;
            List<String> i3;
            C8632dsu.c((Object) str, "");
            this.e = str;
            i = C8569dql.i();
            this.c = i;
            i2 = C8569dql.i();
            this.a = i2;
            i3 = C8569dql.i();
            this.b = i3;
        }

        public final C8987hA c() {
            return new C8987hA(this.e, this.c, this.a, this.b);
        }
    }
}
