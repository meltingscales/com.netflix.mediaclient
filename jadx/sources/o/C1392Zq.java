package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2220acD;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1392Zq implements InterfaceC8990hD<b> {
    public static final a a = new a(null);
    private final String c;
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "06526dd2-c8c1-4780-ba65-7ae9c7bbe662";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1392Zq) && C8632dsu.c((Object) this.c, (Object) ((C1392Zq) obj).c);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveGameFromMyList";
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        String str = this.c;
        return "RemoveGameFromMyListMutation(gameId=" + str + ")";
    }

    public C1392Zq(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2218acB.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2220acD.e.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2829anU.b.a()).d();
    }

    /* renamed from: o.Zq$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8990hD.b {
        private final g a;

        public final g e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            g gVar = this.a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            g gVar = this.a;
            return "Data(removeEntityFromPlaylist=" + gVar + ")";
        }

        public b(g gVar) {
            this.a = gVar;
        }
    }

    /* renamed from: o.Zq$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String a;
        private final List<e> b;
        private final d d;

        public final String a() {
            return this.a;
        }

        public final List<e> b() {
            return this.b;
        }

        public final d d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.d, gVar.d) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            d dVar = this.d;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            List<e> list = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            d dVar = this.d;
            List<e> list = this.b;
            return "RemoveEntityFromPlaylist(__typename=" + str + ", entity=" + dVar + ", errors=" + list + ")";
        }

        public g(String str, d dVar, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = dVar;
            this.b = list;
        }
    }

    /* renamed from: o.Zq$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final c a;
        private final String b;
        private final String c;

        public final c a() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            c cVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            c cVar = this.a;
            return "Entity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onGame=" + cVar + ")";
        }

        public d(String str, String str2, c cVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
            this.a = cVar;
        }
    }

    /* renamed from: o.Zq$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Boolean a;
        private final int c;

        public final Boolean b() {
            return this.a;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.c == cVar.c && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.c);
            Boolean bool = this.a;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            int i = this.c;
            Boolean bool = this.a;
            return "OnGame(gameId=" + i + ", isInPlaylist=" + bool + ")";
        }

        public c(int i, Boolean bool) {
            this.c = i;
            this.a = bool;
        }
    }

    /* renamed from: o.Zq$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.c, (Object) eVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            return "Error(__typename=" + str + ", message=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
        }
    }

    /* renamed from: o.Zq$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
