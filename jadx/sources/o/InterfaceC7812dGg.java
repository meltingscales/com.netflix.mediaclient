package o;

import java.util.List;

/* renamed from: o.dGg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7812dGg {
    public static final c c = new c(null);
    public static final InterfaceC7812dGg e = new c.d();

    List<C7813dGh> b(C7818dGm c7818dGm);

    void d(C7818dGm c7818dGm, List<C7813dGh> list);

    /* renamed from: o.dGg$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.dGg$c$d */
        /* loaded from: classes5.dex */
        static final class d implements InterfaceC7812dGg {
            @Override // o.InterfaceC7812dGg
            public void d(C7818dGm c7818dGm, List<C7813dGh> list) {
                C8632dsu.d(c7818dGm, "");
                C8632dsu.d(list, "");
            }

            @Override // o.InterfaceC7812dGg
            public List<C7813dGh> b(C7818dGm c7818dGm) {
                List<C7813dGh> i;
                C8632dsu.d(c7818dGm, "");
                i = C8569dql.i();
                return i;
            }
        }
    }
}
