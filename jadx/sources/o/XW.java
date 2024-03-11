package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZR;

/* loaded from: classes3.dex */
public final class XW implements InterfaceC8990hD<d> {
    public static final c d = new c(null);
    private final String b;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "5c7a374f-a57b-465f-afea-171c800d4ad3";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XW) && C8632dsu.c((Object) this.b, (Object) ((XW) obj).b);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddToMyList";
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str = this.b;
        return "AddToMyListMutation(entityId=" + str + ")";
    }

    public XW(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZP.a.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(ZR.e.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2805amx.b.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final b a;

        public final b e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.a;
            return "Data(addEntityToPlaylist=" + bVar + ")";
        }

        public d(b bVar) {
            this.a = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final a a;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final a d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            a aVar = this.a;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            a aVar = this.a;
            return "AddEntityToPlaylist(__typename=" + str + ", entity=" + aVar + ")";
        }

        public b(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final e a;
        private final String b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final e b() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.b.hashCode();
            e eVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            e eVar = this.a;
            return "Entity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + eVar + ")";
        }

        public a(String str, String str2, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.b = str2;
            this.a = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final Boolean a;
        private final int d;

        public final Boolean a() {
            return this.a;
        }

        public final int c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.d == eVar.d && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.d);
            Boolean bool = this.a;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            int i = this.d;
            Boolean bool = this.a;
            return "OnVideo(videoId=" + i + ", isInPlaylist=" + bool + ")";
        }

        public e(int i, Boolean bool) {
            this.d = i;
            this.a = bool;
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
