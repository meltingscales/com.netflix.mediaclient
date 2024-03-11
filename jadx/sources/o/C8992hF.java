package o;

import java.util.List;

/* renamed from: o.hF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8992hF extends AbstractC9023hk {
    private final List<String> a;
    private final List<C8987hA> b;
    private final List<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8992hF(String str, List<String> list, List<C8987hA> list2, List<String> list3) {
        super(str, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) list3, "");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    /* renamed from: o.hF$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private List<String> a;
        private List<C8987hA> c;
        private List<String> d;
        private final String e;

        public final a d(List<C8987hA> list) {
            C8632dsu.c((Object) list, "");
            this.c = list;
            return this;
        }

        public a(String str) {
            List<String> i;
            List<C8987hA> i2;
            List<String> i3;
            C8632dsu.c((Object) str, "");
            this.e = str;
            i = C8569dql.i();
            this.a = i;
            i2 = C8569dql.i();
            this.c = i2;
            i3 = C8569dql.i();
            this.d = i3;
        }

        public final C8992hF d() {
            return new C8992hF(this.e, this.a, this.c, this.d);
        }
    }
}
