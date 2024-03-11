package o;

import com.netflix.mediaclient.graphql.models.type.MyListProgressFilter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2209abt;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YN implements InterfaceC8999hM<c> {
    public static final a e = new a(null);
    private final MyListProgressFilter a;
    private final boolean b;
    private final Integer c;
    private final String d;
    private final C2865aoD h;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "1566d61f-5a85-4030-a408-9f1d0f91d9ae";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YN) {
            YN yn = (YN) obj;
            return C8632dsu.c(this.c, yn.c) && C8632dsu.c((Object) this.d, (Object) yn.d) && this.a == yn.a && C8632dsu.c(this.h, yn.h);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "MyListGames";
    }

    public final MyListProgressFilter g() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        Integer num = this.c;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        MyListProgressFilter myListProgressFilter = this.a;
        return (((((hashCode * 31) + hashCode2) * 31) + (myListProgressFilter != null ? myListProgressFilter.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final C2865aoD i() {
        return this.h;
    }

    public final Integer j() {
        return this.c;
    }

    public String toString() {
        Integer num = this.c;
        String str = this.d;
        MyListProgressFilter myListProgressFilter = this.a;
        C2865aoD c2865aoD = this.h;
        return "MyListGamesQuery(first=" + num + ", after=" + str + ", filter=" + myListProgressFilter + ", imageParamsForGamesIcon=" + c2865aoD + ")";
    }

    public YN(Integer num, String str, MyListProgressFilter myListProgressFilter, C2865aoD c2865aoD) {
        C8632dsu.c((Object) c2865aoD, "");
        this.c = num;
        this.d = str;
        this.a = myListProgressFilter;
        this.h = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2211abv.e.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2209abt.a.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2850anp.e.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final e d;

        public final e d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            e eVar = this.d;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.d;
            return "Data(myListGames=" + eVar + ")";
        }

        public c(e eVar) {
            this.d = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final g a;
        private final String b;
        private final Integer c;
        private final String d;
        private final List<b> e;
        private final Integer h;

        public final g a() {
            return this.a;
        }

        public final Integer b() {
            return this.h;
        }

        public final String c() {
            return this.b;
        }

        public final List<b> d() {
            return this.e;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.h, eVar.h) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public final String f() {
            return this.d;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.c;
            int hashCode3 = num == null ? 0 : num.hashCode();
            Integer num2 = this.h;
            int hashCode4 = num2 == null ? 0 : num2.hashCode();
            g gVar = this.a;
            int hashCode5 = gVar == null ? 0 : gVar.hashCode();
            List<b> list = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            Integer num = this.c;
            Integer num2 = this.h;
            g gVar = this.a;
            List<b> list = this.e;
            return "MyListGames(__typename=" + str + ", id=" + str2 + ", totalCount=" + num + ", trackId=" + num2 + ", pageInfo=" + gVar + ", edges=" + list + ")";
        }

        public e(String str, String str2, Integer num, Integer num2, g gVar, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = str2;
            this.c = num;
            this.h = num2;
            this.a = gVar;
            this.e = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {
        private final boolean a;
        private final String c;
        private final String d;
        private final String e;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public final boolean d() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c((Object) this.c, (Object) gVar.c) && this.a == gVar.a;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.c;
            boolean z = this.a;
            return "PageInfo(__typename=" + str + ", startCursor=" + str2 + ", endCursor=" + str3 + ", hasNextPage=" + z + ")";
        }

        public g(String str, String str2, String str3, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
            this.c = str3;
            this.a = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final d d;

        public final String a() {
            return this.b;
        }

        public final d d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.d;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            d dVar = this.d;
            return "Edge(__typename=" + str + ", node=" + dVar + ")";
        }

        public b(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = dVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final C2534ahr a;
        private final String c;
        private final int e;

        public final int c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public final C2534ahr e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && this.e == dVar.e && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + Integer.hashCode(this.e)) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            int i = this.e;
            C2534ahr c2534ahr = this.a;
            return "Node(__typename=" + str + ", gameId=" + i + ", myListGameSummary=" + c2534ahr + ")";
        }

        public d(String str, int i, C2534ahr c2534ahr) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2534ahr, "");
            this.c = str;
            this.e = i;
            this.a = c2534ahr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
