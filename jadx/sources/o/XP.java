package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import j$.time.Instant;
import java.util.List;
import o.C9018hf;
import o.InterfaceC8999hM;
import o.ZG;

/* loaded from: classes3.dex */
public final class XP implements InterfaceC8999hM<e> {
    public static final b a = new b(null);
    private final boolean b;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "1019f736-003d-4e06-be6d-24bb03ed8377";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AccountQuery";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == XP.class;
    }

    public int hashCode() {
        return dsA.a(XP.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(ZG.c.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2803amv.a.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final d e;

        public final d c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.e, ((e) obj).e);
        }

        public int hashCode() {
            d dVar = this.e;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.e;
            return "Data(account=" + dVar + ")";
        }

        public e(d dVar) {
            this.e = dVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final Boolean a;
        private final c b;
        private final String c;
        private final Boolean d;
        private final Boolean e;
        private final List<h> f;
        private final a g;
        private final String h;
        private final Instant i;

        public final String a() {
            return this.h;
        }

        public final Instant b() {
            return this.i;
        }

        public final c c() {
            return this.b;
        }

        public final a d() {
            return this.g;
        }

        public final Boolean e() {
            return this.d;
        }

        public final d e(String str, Boolean bool, c cVar, Boolean bool2, Boolean bool3, Instant instant, String str2, a aVar, List<h> list) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) list, "");
            return new d(str, bool, cVar, bool2, bool3, instant, str2, aVar, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.i, dVar.i) && C8632dsu.c((Object) this.h, (Object) dVar.h) && C8632dsu.c(this.g, dVar.g) && C8632dsu.c(this.f, dVar.f);
            }
            return false;
        }

        public final Boolean g() {
            return this.e;
        }

        public final Boolean h() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Boolean bool = this.d;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            c cVar = this.b;
            int hashCode3 = cVar == null ? 0 : cVar.hashCode();
            Boolean bool2 = this.e;
            int hashCode4 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.a;
            int hashCode5 = bool3 == null ? 0 : bool3.hashCode();
            Instant instant = this.i;
            int hashCode6 = instant == null ? 0 : instant.hashCode();
            int hashCode7 = this.h.hashCode();
            a aVar = this.g;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f.hashCode();
        }

        public final List<h> i() {
            return this.f;
        }

        public final String j() {
            return this.c;
        }

        public String toString() {
            String str = this.c;
            Boolean bool = this.d;
            c cVar = this.b;
            Boolean bool2 = this.e;
            Boolean bool3 = this.a;
            Instant instant = this.i;
            String str2 = this.h;
            a aVar = this.g;
            List<h> list = this.f;
            return "Account(__typename=" + str + ", canCreateUserProfile=" + bool + ", countryOfSignUp=" + cVar + ", isAgeVerified=" + bool2 + ", isNonMember=" + bool3 + ", memberSince=" + instant + ", ownerGuid=" + str2 + ", planInfo=" + aVar + ", profiles=" + list + ")";
        }

        public d(String str, Boolean bool, c cVar, Boolean bool2, Boolean bool3, Instant instant, String str2, a aVar, List<h> list) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) list, "");
            this.c = str;
            this.d = bool;
            this.b = cVar;
            this.e = bool2;
            this.a = bool3;
            this.i = instant;
            this.h = str2;
            this.g = aVar;
            this.f = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String c;
        private final String d;

        public final String b() {
            return this.d;
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
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            return "CountryOfSignUp(__typename=" + str + ", code=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String b;
        private final Boolean d;

        public final String a() {
            return this.b;
        }

        public final Boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Boolean bool = this.d;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.b;
            Boolean bool = this.d;
            return "PlanInfo(__typename=" + str + ", isMobileOnlyPlan=" + bool + ")";
        }

        public a(String str, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = bool;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h {
        private final String d;
        private final C2567aiX e;

        public final C2567aiX a() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.d, (Object) hVar.d) && C8632dsu.c(this.e, hVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2567aiX c2567aiX = this.e;
            return "Profile(__typename=" + str + ", userProfile=" + c2567aiX + ")";
        }

        public h(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.d = str;
            this.e = c2567aiX;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
