package o;

import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2232acP;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zw  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1398Zw implements InterfaceC8990hD<b> {
    public static final a e = new a(null);
    private final ThumbRating a;
    private final String b;
    private final int c;
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d7aa60a4-ef90-45a4-8d40-3657977920fd";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1398Zw) {
            C1398Zw c1398Zw = (C1398Zw) obj;
            return C8632dsu.c((Object) this.b, (Object) c1398Zw.b) && this.a == c1398Zw.a && this.c == c1398Zw.c;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "SetEntityThumbRating";
    }

    public final ThumbRating h() {
        return this.a;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + Integer.hashCode(this.c);
    }

    public final String i() {
        return this.b;
    }

    public final int j() {
        return this.c;
    }

    public String toString() {
        String str = this.b;
        ThumbRating thumbRating = this.a;
        int i = this.c;
        return "SetEntityThumbRatingMutation(entityId=" + str + ", rating=" + thumbRating + ", trackId=" + i + ")";
    }

    public C1398Zw(String str, ThumbRating thumbRating, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) thumbRating, "");
        this.b = str;
        this.a = thumbRating;
        this.c = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2233acQ.e.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2232acP.b.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2889aob.e.c()).d();
    }

    /* renamed from: o.Zw$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC8990hD.b {
        private final g b;

        public final g c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            g gVar = this.b;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            g gVar = this.b;
            return "Data(setEntityThumbRating=" + gVar + ")";
        }

        public b(g gVar) {
            this.b = gVar;
        }
    }

    /* renamed from: o.Zw$g */
    /* loaded from: classes6.dex */
    public static final class g {
        private final d a;
        private final String c;
        private final List<c> e;

        public final d a() {
            return this.a;
        }

        public final List<c> b() {
            return this.e;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.c, (Object) gVar.c) && C8632dsu.c(this.a, gVar.a) && C8632dsu.c(this.e, gVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            d dVar = this.a;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            List<c> list = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            d dVar = this.a;
            List<c> list = this.e;
            return "SetEntityThumbRating(__typename=" + str + ", entity=" + dVar + ", errors=" + list + ")";
        }

        public g(String str, d dVar, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = dVar;
            this.e = list;
        }
    }

    /* renamed from: o.Zw$d */
    /* loaded from: classes6.dex */
    public static final class d {
        private final e a;
        private final String b;
        private final String d;

        public final e a() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.d.hashCode();
            e eVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            e eVar = this.a;
            return "Entity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onGame=" + eVar + ")";
        }

        public d(String str, String str2, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
            this.a = eVar;
        }
    }

    /* renamed from: o.Zw$e */
    /* loaded from: classes6.dex */
    public static final class e {
        private final ThumbRating a;
        private final int d;

        public final int d() {
            return this.d;
        }

        public final ThumbRating e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.d == eVar.d && this.a == eVar.a;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.d);
            ThumbRating thumbRating = this.a;
            return (hashCode * 31) + (thumbRating == null ? 0 : thumbRating.hashCode());
        }

        public String toString() {
            int i = this.d;
            ThumbRating thumbRating = this.a;
            return "OnGame(gameId=" + i + ", thumbRating=" + thumbRating + ")";
        }

        public e(int i, ThumbRating thumbRating) {
            this.d = i;
            this.a = thumbRating;
        }
    }

    /* renamed from: o.Zw$c */
    /* loaded from: classes6.dex */
    public static final class c {
        private final String b;
        private final String d;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            return "Error(__typename=" + str + ", message=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
        }
    }

    /* renamed from: o.Zw$a */
    /* loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
