package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZO;

/* loaded from: classes3.dex */
public final class XQ implements InterfaceC8990hD<e> {
    public static final c c = new c(null);
    private final String a;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "2820f870-3171-4a62-ae0e-4d7998ba25fc";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XQ) && C8632dsu.c((Object) this.a, (Object) ((XQ) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddGameToMyList";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final String i() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        return "AddGameToMyListMutation(gameId=" + str + ")";
    }

    public XQ(String str) {
        C8632dsu.c((Object) str, "");
        this.a = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZN.c.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(ZO.e.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2802amu.a.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8990hD.b {
        private final b c;

        public final b c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            b bVar = this.c;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.c;
            return "Data(addEntityToPlaylist=" + bVar + ")";
        }

        public e(b bVar) {
            this.c = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final List<a> a;
        private final String b;
        private final d d;

        public final d a() {
            return this.d;
        }

        public final List<a> c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.d;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            List<a> list = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            d dVar = this.d;
            List<a> list = this.a;
            return "AddEntityToPlaylist(__typename=" + str + ", entity=" + dVar + ", errors=" + list + ")";
        }

        public b(String str, d dVar, List<a> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = dVar;
            this.a = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final j b;
        private final String e;

        public final j b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.e.hashCode();
            j jVar = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (jVar == null ? 0 : jVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            j jVar = this.b;
            return "Entity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onGame=" + jVar + ")";
        }

        public d(String str, String str2, j jVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
            this.b = jVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j {
        private final Boolean c;
        private final int d;

        public final Boolean a() {
            return this.c;
        }

        public final int c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return this.d == jVar.d && C8632dsu.c(this.c, jVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.d);
            Boolean bool = this.c;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            int i = this.d;
            Boolean bool = this.c;
            return "OnGame(gameId=" + i + ", isInPlaylist=" + bool + ")";
        }

        public j(int i, Boolean bool) {
            this.d = i;
            this.c = bool;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String b;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "Error(__typename=" + str + ", message=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.e = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
