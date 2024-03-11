package o;

import com.netflix.mediaclient.graphql.models.type.MyListGenreFilter;
import com.netflix.mediaclient.graphql.models.type.MyListProgressFilter;
import java.util.List;
import o.C6956cnA;
import o.C8569dql;
import o.InterfaceC6972cnQ;
import o.InterfaceC6973cnR;

/* renamed from: o.cnR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6973cnR {
    public static final b d = b.b;

    String c();

    int d();

    /* renamed from: o.cnR$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final /* synthetic */ b b = new b();
        private static final InterfaceC8554dpx<List<InterfaceC6973cnR>> d;

        private b() {
        }

        static {
            InterfaceC8554dpx<List<InterfaceC6973cnR>> b2;
            b2 = dpB.b(new drO<List<? extends InterfaceC6973cnR>>() { // from class: com.netflix.mediaclient.ui.mylist.impl.filters.MyListFilter$Companion$ALL_FILTERS$2
                @Override // o.drO
                /* renamed from: a */
                public final List<InterfaceC6973cnR> invoke() {
                    List<InterfaceC6973cnR> j;
                    j = C8569dql.j(InterfaceC6973cnR.i.b, InterfaceC6973cnR.d.e, InterfaceC6973cnR.c.e, InterfaceC6973cnR.j.c, InterfaceC6973cnR.a.e, InterfaceC6973cnR.e.b);
                    return j;
                }
            });
            d = b2;
        }

        public final List<InterfaceC6973cnR> b() {
            return d.getValue();
        }
    }

    /* renamed from: o.cnR$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC6973cnR, InterfaceC6972cnQ.b {
        public static final d e = new d();
        private static final int c = C6956cnA.c.A;
        private static final String b = MyListGenreFilter.d.c();

        @Override // o.InterfaceC6973cnR
        public String c() {
            return b;
        }

        @Override // o.InterfaceC6973cnR
        public int d() {
            return c;
        }

        private d() {
        }
    }

    /* renamed from: o.cnR$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC6973cnR, InterfaceC6972cnQ.b {
        public static final i b = new i();
        private static final int a = C6956cnA.c.L;
        private static final String e = MyListGenreFilter.b.c();

        @Override // o.InterfaceC6973cnR
        public String c() {
            return e;
        }

        @Override // o.InterfaceC6973cnR
        public int d() {
            return a;
        }

        private i() {
        }
    }

    /* renamed from: o.cnR$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC6973cnR, InterfaceC6972cnQ.c {
        public static final c e = new c();
        private static final int b = C6956cnA.c.M;
        private static final String c = MyListProgressFilter.a.e();

        @Override // o.InterfaceC6973cnR
        public String c() {
            return c;
        }

        @Override // o.InterfaceC6973cnR
        public int d() {
            return b;
        }

        private c() {
        }
    }

    /* renamed from: o.cnR$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC6973cnR, InterfaceC6972cnQ.c {
        public static final j c = new j();
        private static final int e = C6956cnA.c.K;
        private static final String a = MyListProgressFilter.d.e();

        @Override // o.InterfaceC6973cnR
        public String c() {
            return a;
        }

        @Override // o.InterfaceC6973cnR
        public int d() {
            return e;
        }

        private j() {
        }
    }

    /* renamed from: o.cnR$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC6973cnR, InterfaceC6972cnQ.d {
        public static final a e = new a();
        private static final int b = C6956cnA.c.z;
        private static final String a = MyListProgressFilter.a.e();

        @Override // o.InterfaceC6973cnR
        public String c() {
            return a;
        }

        @Override // o.InterfaceC6973cnR
        public int d() {
            return b;
        }

        private a() {
        }
    }

    /* renamed from: o.cnR$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC6973cnR, InterfaceC6972cnQ.d {
        public static final e b = new e();
        private static final int e = C6956cnA.c.I;
        private static final String a = MyListProgressFilter.d.e();

        @Override // o.InterfaceC6973cnR
        public String c() {
            return a;
        }

        @Override // o.InterfaceC6973cnR
        public int d() {
            return e;
        }

        private e() {
        }
    }
}
