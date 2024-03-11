package o;

import java.util.ArrayList;
import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.InterfaceC6972cnQ;
import o.InterfaceC6973cnR;

/* renamed from: o.cnQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6972cnQ<T> {
    public static final a c = a.c;

    /* renamed from: o.cnQ$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* renamed from: o.cnQ$c */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* renamed from: o.cnQ$d */
    /* loaded from: classes4.dex */
    public interface d {
    }

    int a();

    InterfaceC6973cnR b();

    List<InterfaceC6973cnR> c();

    Class<T> d();

    void d(int i);

    /* renamed from: o.cnQ$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public static <T> InterfaceC6973cnR c(InterfaceC6972cnQ<T> interfaceC6972cnQ) {
            Object f;
            f = C8576dqs.f((List<? extends Object>) interfaceC6972cnQ.c(), interfaceC6972cnQ.a());
            return (InterfaceC6973cnR) f;
        }
    }

    /* renamed from: o.cnQ$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final InterfaceC8554dpx<List<InterfaceC6972cnQ<d>>> a;
        private static final InterfaceC8554dpx<List<InterfaceC6972cnQ<? extends Object>>> b;
        static final /* synthetic */ a c = new a();

        private a() {
        }

        static {
            InterfaceC8554dpx<List<InterfaceC6972cnQ<? extends Object>>> b2;
            InterfaceC8554dpx<List<InterfaceC6972cnQ<d>>> b3;
            b2 = dpB.b(new drO<List<? extends InterfaceC6972cnQ<? extends Object>>>() { // from class: com.netflix.mediaclient.ui.mylist.impl.filters.MyListFilterGroup$Companion$VIDEO$2

                /* loaded from: classes4.dex */
                public static final class b implements InterfaceC6972cnQ<InterfaceC6972cnQ.b> {
                    private final Class<InterfaceC6972cnQ.b> a = InterfaceC6972cnQ.b.class;
                    private final List<InterfaceC6973cnR> b;
                    private int d;

                    @Override // o.InterfaceC6972cnQ
                    public int a() {
                        return this.d;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public List<InterfaceC6973cnR> c() {
                        return this.b;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public Class<InterfaceC6972cnQ.b> d() {
                        return this.a;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public void d(int i) {
                        this.d = i;
                    }

                    public b() {
                        List<InterfaceC6973cnR> b = InterfaceC6973cnR.b.b.b();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : b) {
                            if (((InterfaceC6973cnR) obj) instanceof InterfaceC6972cnQ.b) {
                                arrayList.add(obj);
                            }
                        }
                        this.b = arrayList;
                        this.d = -1;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public InterfaceC6973cnR b() {
                        return InterfaceC6972cnQ.e.c(this);
                    }
                }

                /* loaded from: classes4.dex */
                public static final class d implements InterfaceC6972cnQ<InterfaceC6972cnQ.c> {
                    private final Class<InterfaceC6972cnQ.c> b = InterfaceC6972cnQ.c.class;
                    private final List<InterfaceC6973cnR> d;
                    private int e;

                    @Override // o.InterfaceC6972cnQ
                    public int a() {
                        return this.e;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public List<InterfaceC6973cnR> c() {
                        return this.d;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public Class<InterfaceC6972cnQ.c> d() {
                        return this.b;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public void d(int i) {
                        this.e = i;
                    }

                    public d() {
                        List<InterfaceC6973cnR> b = InterfaceC6973cnR.b.b.b();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : b) {
                            if (((InterfaceC6973cnR) obj) instanceof InterfaceC6972cnQ.c) {
                                arrayList.add(obj);
                            }
                        }
                        this.d = arrayList;
                        this.e = -1;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public InterfaceC6973cnR b() {
                        return InterfaceC6972cnQ.e.c(this);
                    }
                }

                @Override // o.drO
                /* renamed from: b */
                public final List<InterfaceC6972cnQ<? extends Object>> invoke() {
                    List<InterfaceC6972cnQ<? extends Object>> j;
                    InterfaceC6973cnR.b bVar = InterfaceC6973cnR.d;
                    j = C8569dql.j(new d(), new b());
                    return j;
                }
            });
            b = b2;
            b3 = dpB.b(new drO<List<? extends InterfaceC6972cnQ<d>>>() { // from class: com.netflix.mediaclient.ui.mylist.impl.filters.MyListFilterGroup$Companion$GAME$2

                /* loaded from: classes4.dex */
                public static final class a implements InterfaceC6972cnQ<InterfaceC6972cnQ.d> {
                    private int a;
                    private final Class<InterfaceC6972cnQ.d> b = InterfaceC6972cnQ.d.class;
                    private final List<InterfaceC6973cnR> e;

                    @Override // o.InterfaceC6972cnQ
                    public int a() {
                        return this.a;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public List<InterfaceC6973cnR> c() {
                        return this.e;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public Class<InterfaceC6972cnQ.d> d() {
                        return this.b;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public void d(int i) {
                        this.a = i;
                    }

                    public a() {
                        List<InterfaceC6973cnR> b = InterfaceC6973cnR.b.b.b();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : b) {
                            if (((InterfaceC6973cnR) obj) instanceof InterfaceC6972cnQ.d) {
                                arrayList.add(obj);
                            }
                        }
                        this.e = arrayList;
                        this.a = -1;
                    }

                    @Override // o.InterfaceC6972cnQ
                    public InterfaceC6973cnR b() {
                        return InterfaceC6972cnQ.e.c(this);
                    }
                }

                @Override // o.drO
                /* renamed from: c */
                public final List<InterfaceC6972cnQ<InterfaceC6972cnQ.d>> invoke() {
                    List<InterfaceC6972cnQ<InterfaceC6972cnQ.d>> e;
                    InterfaceC6973cnR.b bVar = InterfaceC6973cnR.d;
                    e = C8566dqi.e(new a());
                    return e;
                }
            });
            a = b3;
        }

        public final List<InterfaceC6972cnQ<?>> b() {
            return b.getValue();
        }

        public final List<InterfaceC6972cnQ<?>> e() {
            return a.getValue();
        }
    }
}
