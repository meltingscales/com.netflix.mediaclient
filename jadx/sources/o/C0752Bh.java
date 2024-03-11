package o;

import com.netflix.clcs.codegen.type.CLCSLoggableSessionType;
import j$.time.Instant;
import java.util.List;

/* renamed from: o.Bh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0752Bh implements InterfaceC9037hy {
    private final m a;
    private final String b;
    private final o c;
    private final j d;
    private final d e;
    private final q f;
    private final l g;
    private final r h;
    private final n i;
    private final s j;
    private final u k;
    private final p m;
    private final t n;

    public final n a() {
        return this.i;
    }

    public final m b() {
        return this.a;
    }

    public final o c() {
        return this.c;
    }

    public final d d() {
        return this.e;
    }

    public final j e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0752Bh) {
            C0752Bh c0752Bh = (C0752Bh) obj;
            return C8632dsu.c((Object) this.b, (Object) c0752Bh.b) && C8632dsu.c(this.e, c0752Bh.e) && C8632dsu.c(this.c, c0752Bh.c) && C8632dsu.c(this.k, c0752Bh.k) && C8632dsu.c(this.n, c0752Bh.n) && C8632dsu.c(this.h, c0752Bh.h) && C8632dsu.c(this.f, c0752Bh.f) && C8632dsu.c(this.a, c0752Bh.a) && C8632dsu.c(this.d, c0752Bh.d) && C8632dsu.c(this.i, c0752Bh.i) && C8632dsu.c(this.m, c0752Bh.m) && C8632dsu.c(this.j, c0752Bh.j) && C8632dsu.c(this.g, c0752Bh.g);
        }
        return false;
    }

    public final r f() {
        return this.h;
    }

    public final q g() {
        return this.f;
    }

    public final l h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        d dVar = this.e;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        o oVar = this.c;
        int hashCode3 = oVar == null ? 0 : oVar.hashCode();
        u uVar = this.k;
        int hashCode4 = uVar == null ? 0 : uVar.hashCode();
        t tVar = this.n;
        int hashCode5 = tVar == null ? 0 : tVar.hashCode();
        r rVar = this.h;
        int hashCode6 = rVar == null ? 0 : rVar.hashCode();
        q qVar = this.f;
        int hashCode7 = qVar == null ? 0 : qVar.hashCode();
        m mVar = this.a;
        int hashCode8 = mVar == null ? 0 : mVar.hashCode();
        j jVar = this.d;
        int hashCode9 = jVar == null ? 0 : jVar.hashCode();
        n nVar = this.i;
        int hashCode10 = nVar == null ? 0 : nVar.hashCode();
        p pVar = this.m;
        int hashCode11 = pVar == null ? 0 : pVar.hashCode();
        s sVar = this.j;
        int hashCode12 = sVar == null ? 0 : sVar.hashCode();
        l lVar = this.g;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (lVar != null ? lVar.hashCode() : 0);
    }

    public final p i() {
        return this.m;
    }

    public final s j() {
        return this.j;
    }

    public final String m() {
        return this.b;
    }

    public final t n() {
        return this.n;
    }

    public final u o() {
        return this.k;
    }

    public String toString() {
        String str = this.b;
        d dVar = this.e;
        o oVar = this.c;
        u uVar = this.k;
        t tVar = this.n;
        r rVar = this.h;
        q qVar = this.f;
        m mVar = this.a;
        j jVar = this.d;
        n nVar = this.i;
        p pVar = this.m;
        s sVar = this.j;
        l lVar = this.g;
        return "EffectFields(__typename=" + str + ", errorHandling=" + dVar + ", onCLCSDismiss=" + oVar + ", onCLCSSubmitAction=" + uVar + ", onCLCSSendFeedback=" + tVar + ", onCLCSOpenWebView=" + rVar + ", onCLCSRecordRdidCtaConsent=" + qVar + ", onCLCSClientLogging=" + mVar + ", onCLCSClientDebugLogging=" + jVar + ", onCLCSInAppNavigation=" + nVar + ", onCLCSRequestScreenUpdate=" + pVar + ", onCLCSNavigateBack=" + sVar + ", onCLCSLogOut=" + lVar + ")";
    }

    public C0752Bh(String str, d dVar, o oVar, u uVar, t tVar, r rVar, q qVar, m mVar, j jVar, n nVar, p pVar, s sVar, l lVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.e = dVar;
        this.c = oVar;
        this.k = uVar;
        this.n = tVar;
        this.h = rVar;
        this.f = qVar;
        this.a = mVar;
        this.d = jVar;
        this.i = nVar;
        this.m = pVar;
        this.j = sVar;
        this.g = lVar;
    }

    /* renamed from: o.Bh$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final k b;
        private final String e;

        public final k a() {
            return this.b;
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
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            k kVar = this.b;
            return (hashCode * 31) + (kVar == null ? 0 : kVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            k kVar = this.b;
            return "ErrorHandling(__typename=" + str + ", onCLCSEffectErrorHandlingAlert=" + kVar + ")";
        }

        public d(String str, k kVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = kVar;
        }
    }

    /* renamed from: o.Bh$o */
    /* loaded from: classes2.dex */
    public static final class o {
        private final String a;

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && C8632dsu.c((Object) this.a, (Object) ((o) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "OnCLCSDismiss(loggingCommand=" + str + ")";
        }

        public o(String str) {
            this.a = str;
        }
    }

    /* renamed from: o.Bh$u */
    /* loaded from: classes2.dex */
    public static final class u {
        private final List<h> a;
        private final String b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final List<h> c() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return C8632dsu.c((Object) this.b, (Object) uVar.b) && C8632dsu.c((Object) this.c, (Object) uVar.c) && C8632dsu.c(this.a, uVar.a);
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.c.hashCode();
            List<h> list = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            List<h> list = this.a;
            return "OnCLCSSubmitAction(loggingCommand=" + str + ", serverAction=" + str2 + ", inputFieldRequirements=" + list + ")";
        }

        public u(String str, String str2, List<h> list) {
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
            this.a = list;
        }
    }

    /* renamed from: o.Bh$t */
    /* loaded from: classes2.dex */
    public static final class t {
        private final List<g> a;
        private final String e;

        public final List<g> a() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.e, (Object) tVar.e) && C8632dsu.c(this.a, tVar.a);
            }
            return false;
        }

        public int hashCode() {
            String str = this.e;
            int hashCode = str == null ? 0 : str.hashCode();
            List<g> list = this.a;
            return (hashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            List<g> list = this.a;
            return "OnCLCSSendFeedback(serverFeedback=" + str + ", inputFields=" + list + ")";
        }

        public t(String str, List<g> list) {
            this.e = str;
            this.a = list;
        }
    }

    /* renamed from: o.Bh$r */
    /* loaded from: classes2.dex */
    public static final class r {
        private final Boolean a;
        private final Boolean b;
        private final String c;

        public final Boolean a() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final Boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return C8632dsu.c((Object) this.c, (Object) rVar.c) && C8632dsu.c(this.b, rVar.b) && C8632dsu.c(this.a, rVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Boolean bool = this.b;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            Boolean bool = this.b;
            Boolean bool2 = this.a;
            return "OnCLCSOpenWebView(uri=" + str + ", useAutoLogin=" + bool + ", useEmbeddedWebView=" + bool2 + ")";
        }

        public r(String str, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = bool;
            this.a = bool2;
        }
    }

    /* renamed from: o.Bh$q */
    /* loaded from: classes2.dex */
    public static final class q {
        private final v e;

        public final v d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && C8632dsu.c(this.e, ((q) obj).e);
        }

        public int hashCode() {
            v vVar = this.e;
            if (vVar == null) {
                return 0;
            }
            return vVar.hashCode();
        }

        public String toString() {
            v vVar = this.e;
            return "OnCLCSRecordRdidCtaConsent(rdidCtaConsentState=" + vVar + ")";
        }

        public q(v vVar) {
            this.e = vVar;
        }
    }

    /* renamed from: o.Bh$m */
    /* loaded from: classes2.dex */
    public static final class m {
        private final a b;
        private final CLCSLoggableSessionType c;

        public final a d() {
            return this.b;
        }

        public final CLCSLoggableSessionType e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return this.c == mVar.c && C8632dsu.c(this.b, mVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            a aVar = this.b;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            CLCSLoggableSessionType cLCSLoggableSessionType = this.c;
            a aVar = this.b;
            return "OnCLCSClientLogging(type=" + cLCSLoggableSessionType + ", data=" + aVar + ")";
        }

        public m(CLCSLoggableSessionType cLCSLoggableSessionType, a aVar) {
            C8632dsu.c((Object) cLCSLoggableSessionType, "");
            this.c = cLCSLoggableSessionType;
            this.b = aVar;
        }
    }

    /* renamed from: o.Bh$j */
    /* loaded from: classes2.dex */
    public static final class j {
        private final String b;

        public final String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && C8632dsu.c((Object) this.b, (Object) ((j) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "OnCLCSClientDebugLogging(debugData=" + str + ")";
        }

        public j(String str) {
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }

    /* renamed from: o.Bh$n */
    /* loaded from: classes2.dex */
    public static final class n {
        private final f a;

        public final f c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && C8632dsu.c(this.a, ((n) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            f fVar = this.a;
            return "OnCLCSInAppNavigation(location=" + fVar + ")";
        }

        public n(f fVar) {
            C8632dsu.c((Object) fVar, "");
            this.a = fVar;
        }
    }

    /* renamed from: o.Bh$p */
    /* loaded from: classes2.dex */
    public static final class p {
        private final String a;
        private final List<i> c;
        private final String d;
        private final String e;

        public final List<i> a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.d, (Object) pVar.d) && C8632dsu.c(this.c, pVar.c) && C8632dsu.c((Object) this.a, (Object) pVar.a) && C8632dsu.c((Object) this.e, (Object) pVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<i> list = this.c;
            int hashCode2 = list == null ? 0 : list.hashCode();
            String str = this.a;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            List<i> list = this.c;
            String str2 = this.a;
            String str3 = this.e;
            return "OnCLCSRequestScreenUpdate(serverScreenUpdate=" + str + ", inputFieldRequirements=" + list + ", loggingCommand=" + str2 + ", loggingAction=" + str3 + ")";
        }

        public p(String str, List<i> list, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = list;
            this.a = str2;
            this.e = str3;
        }
    }

    /* renamed from: o.Bh$s */
    /* loaded from: classes2.dex */
    public static final class s {
        private final String a;
        private final String b;
        private final String d;

        public final String a() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return C8632dsu.c((Object) this.a, (Object) sVar.a) && C8632dsu.c((Object) this.b, (Object) sVar.b) && C8632dsu.c((Object) this.d, (Object) sVar.d);
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.d;
            return "OnCLCSNavigateBack(loggingCommand=" + str + ", loggingAction=" + str2 + ", navigationMarker=" + str3 + ")";
        }

        public s(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.Bh$l */
    /* loaded from: classes2.dex */
    public static final class l {
        private final String d;

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C8632dsu.c((Object) this.d, (Object) ((l) obj).d);
        }

        public int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "OnCLCSLogOut(loggingCommand=" + str + ")";
        }

        public l(String str) {
            this.d = str;
        }
    }

    /* renamed from: o.Bh$k */
    /* loaded from: classes2.dex */
    public static final class k {
        private final b d;

        public final b c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && C8632dsu.c(this.d, ((k) obj).d);
        }

        public int hashCode() {
            b bVar = this.d;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.d;
            return "OnCLCSEffectErrorHandlingAlert(alert=" + bVar + ")";
        }

        public k(b bVar) {
            this.d = bVar;
        }
    }

    /* renamed from: o.Bh$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final AE c;
        private final String e;

        public final AE a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            AE ae = this.c;
            return "Alert(__typename=" + str + ", alertDialogFragment=" + ae + ")";
        }

        public b(String str, AE ae) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ae, "");
            this.e = str;
            this.c = ae;
        }
    }

    /* renamed from: o.Bh$h */
    /* loaded from: classes2.dex */
    public static final class h {
        private final String a;
        private final e c;
        private final boolean e;

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.e;
        }

        public final e e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.a, (Object) hVar.a) && C8632dsu.c(this.c, hVar.c) && this.e == hVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.a;
            e eVar = this.c;
            boolean z = this.e;
            return "InputFieldRequirement(__typename=" + str + ", field=" + eVar + ", required=" + z + ")";
        }

        public h(String str, e eVar, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            this.a = str;
            this.c = eVar;
            this.e = z;
        }
    }

    /* renamed from: o.Bh$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;
        private final C0751Bg e;

        public final C0751Bg b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0751Bg c0751Bg = this.e;
            return "Field(__typename=" + str + ", fieldFragment=" + c0751Bg + ")";
        }

        public e(String str, C0751Bg c0751Bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0751Bg, "");
            this.b = str;
            this.e = c0751Bg;
        }
    }

    /* renamed from: o.Bh$g */
    /* loaded from: classes2.dex */
    public static final class g {
        private final C0751Bg a;
        private final String d;

        public final C0751Bg b() {
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
                return C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c(this.a, gVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0751Bg c0751Bg = this.a;
            return "InputField(__typename=" + str + ", fieldFragment=" + c0751Bg + ")";
        }

        public g(String str, C0751Bg c0751Bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0751Bg, "");
            this.d = str;
            this.a = c0751Bg;
        }
    }

    /* renamed from: o.Bh$v */
    /* loaded from: classes2.dex */
    public static final class v {
        private final Instant a;
        private final String b;
        private final String c;
        private final Boolean e;

        public final String b() {
            return this.b;
        }

        public final Boolean c() {
            return this.e;
        }

        public final Instant d() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return C8632dsu.c((Object) this.b, (Object) vVar.b) && C8632dsu.c((Object) this.c, (Object) vVar.c) && C8632dsu.c(this.a, vVar.a) && C8632dsu.c(this.e, vVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Instant instant = this.a;
            int hashCode3 = instant == null ? 0 : instant.hashCode();
            Boolean bool = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            Instant instant = this.a;
            Boolean bool = this.e;
            return "RdidCtaConsentState(__typename=" + str + ", consentId=" + str2 + ", displayedAt=" + instant + ", isDenied=" + bool + ")";
        }

        public v(String str, String str2, Instant instant, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
            this.a = instant;
            this.e = bool;
        }
    }

    /* renamed from: o.Bh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.b;
            String str4 = this.a;
            return "Data(__typename=" + str + ", viewName=" + str2 + ", contextName=" + str3 + ", trackingInfo=" + str4 + ")";
        }

        public a(String str, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = str2;
            this.b = str3;
            this.a = str4;
        }
    }

    /* renamed from: o.Bh$f */
    /* loaded from: classes2.dex */
    public static final class f {
        private final String a;
        private final String d;

        public final String a() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.a, (Object) fVar.a) && C8632dsu.c((Object) this.d, (Object) fVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            return "Location(__typename=" + str + ", universal=" + str2 + ")";
        }

        public f(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
        }
    }

    /* renamed from: o.Bh$i */
    /* loaded from: classes2.dex */
    public static final class i {
        private final String b;
        private final boolean c;
        private final c d;

        public final c a() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.b, (Object) iVar.b) && C8632dsu.c(this.d, iVar.d) && this.c == iVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.b;
            c cVar = this.d;
            boolean z = this.c;
            return "InputFieldRequirement1(__typename=" + str + ", field=" + cVar + ", required=" + z + ")";
        }

        public i(String str, c cVar, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) cVar, "");
            this.b = str;
            this.d = cVar;
            this.c = z;
        }
    }

    /* renamed from: o.Bh$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final String d;
        private final C0751Bg e;

        public final String b() {
            return this.d;
        }

        public final C0751Bg d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0751Bg c0751Bg = this.e;
            return "Field1(__typename=" + str + ", fieldFragment=" + c0751Bg + ")";
        }

        public c(String str, C0751Bg c0751Bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0751Bg, "");
            this.d = str;
            this.e = c0751Bg;
        }
    }
}
