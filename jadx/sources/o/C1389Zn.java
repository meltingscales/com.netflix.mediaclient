package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2263acu;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1389Zn implements InterfaceC8990hD<a> {
    public static final d c = new d(null);
    private final boolean b;
    private final String d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "bc441fbd-dfeb-4462-b9be-4fdc303ee09d";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1389Zn) && C8632dsu.c((Object) this.d, (Object) ((C1389Zn) obj).d);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveFromMyList";
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        String str = this.d;
        return "RemoveFromMyListMutation(entityId=" + str + ")";
    }

    public C1389Zn(String str) {
        C8632dsu.c((Object) str, "");
        this.d = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2265acw.e.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2263acu.b.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2826anR.a.d()).d();
    }

    /* renamed from: o.Zn$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8990hD.b {
        private final b e;

        public final b e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.e, ((a) obj).e);
        }

        public int hashCode() {
            b bVar = this.e;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.e;
            return "Data(removeEntityFromPlaylist=" + bVar + ")";
        }

        public a(b bVar) {
            this.e = bVar;
        }
    }

    /* renamed from: o.Zn$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c b;
        private final String c;

        public final c c() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            c cVar = this.b;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            c cVar = this.b;
            return "RemoveEntityFromPlaylist(__typename=" + str + ", entity=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = cVar;
        }
    }

    /* renamed from: o.Zn$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final e a;
        private final String b;
        private final String c;

        public final e a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.b.hashCode();
            e eVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            e eVar = this.a;
            return "Entity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + eVar + ")";
        }

        public c(String str, String str2, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
            this.a = eVar;
        }
    }

    /* renamed from: o.Zn$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Boolean a;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final Boolean d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.e == eVar.e && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.e);
            Boolean bool = this.a;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            int i = this.e;
            Boolean bool = this.a;
            return "OnVideo(videoId=" + i + ", isInPlaylist=" + bool + ")";
        }

        public e(int i, Boolean bool) {
            this.e = i;
            this.a = bool;
        }
    }

    /* renamed from: o.Zn$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
