package o;

import com.netflix.android.org.json.zip.JSONzip;
import o.AbstractC8997hK;

/* renamed from: o.arP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3036arP {
    private final AbstractC8997hK<C3041arU> a;
    private final AbstractC8997hK<C3032arL> b;
    private final AbstractC8997hK<C2916apB> c;
    private final AbstractC8997hK<C3034arN> d;
    private final AbstractC8997hK<C3042arV> e;
    private final AbstractC8997hK<C3115asp> f;
    private final AbstractC8997hK<C3104ase> g;
    private final AbstractC8997hK<C3107ash> h;
    private final AbstractC8997hK<C3097asX> i;
    private final AbstractC8997hK<C3110ask> j;
    private final AbstractC8997hK<C3114aso> l;
    private final AbstractC8997hK<C3119ast> n;

    /* renamed from: o  reason: collision with root package name */
    private final AbstractC8997hK<C3113asn> f13482o;

    public C3036arP() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final AbstractC8997hK<C3042arV> a() {
        return this.e;
    }

    public final AbstractC8997hK<C3041arU> b() {
        return this.a;
    }

    public final AbstractC8997hK<C2916apB> c() {
        return this.c;
    }

    public final AbstractC8997hK<C3034arN> d() {
        return this.d;
    }

    public final AbstractC8997hK<C3032arL> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3036arP) {
            C3036arP c3036arP = (C3036arP) obj;
            return C8632dsu.c(this.b, c3036arP.b) && C8632dsu.c(this.d, c3036arP.d) && C8632dsu.c(this.e, c3036arP.e) && C8632dsu.c(this.a, c3036arP.a) && C8632dsu.c(this.c, c3036arP.c) && C8632dsu.c(this.h, c3036arP.h) && C8632dsu.c(this.g, c3036arP.g) && C8632dsu.c(this.j, c3036arP.j) && C8632dsu.c(this.f, c3036arP.f) && C8632dsu.c(this.l, c3036arP.l) && C8632dsu.c(this.f13482o, c3036arP.f13482o) && C8632dsu.c(this.n, c3036arP.n) && C8632dsu.c(this.i, c3036arP.i);
        }
        return false;
    }

    public final AbstractC8997hK<C3104ase> f() {
        return this.g;
    }

    public final AbstractC8997hK<C3110ask> g() {
        return this.j;
    }

    public final AbstractC8997hK<C3097asX> h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g.hashCode()) * 31) + this.j.hashCode()) * 31) + this.f.hashCode()) * 31) + this.l.hashCode()) * 31) + this.f13482o.hashCode()) * 31) + this.n.hashCode()) * 31) + this.i.hashCode();
    }

    public final AbstractC8997hK<C3107ash> i() {
        return this.h;
    }

    public final AbstractC8997hK<C3115asp> j() {
        return this.f;
    }

    public final AbstractC8997hK<C3114aso> k() {
        return this.l;
    }

    public final AbstractC8997hK<C3119ast> l() {
        return this.n;
    }

    public final AbstractC8997hK<C3113asn> o() {
        return this.f13482o;
    }

    public String toString() {
        AbstractC8997hK<C3032arL> abstractC8997hK = this.b;
        AbstractC8997hK<C3034arN> abstractC8997hK2 = this.d;
        AbstractC8997hK<C3042arV> abstractC8997hK3 = this.e;
        AbstractC8997hK<C3041arU> abstractC8997hK4 = this.a;
        AbstractC8997hK<C2916apB> abstractC8997hK5 = this.c;
        AbstractC8997hK<C3107ash> abstractC8997hK6 = this.h;
        AbstractC8997hK<C3104ase> abstractC8997hK7 = this.g;
        AbstractC8997hK<C3110ask> abstractC8997hK8 = this.j;
        AbstractC8997hK<C3115asp> abstractC8997hK9 = this.f;
        AbstractC8997hK<C3114aso> abstractC8997hK10 = this.l;
        AbstractC8997hK<C3113asn> abstractC8997hK11 = this.f13482o;
        AbstractC8997hK<C3119ast> abstractC8997hK12 = this.n;
        AbstractC8997hK<C3097asX> abstractC8997hK13 = this.i;
        return "PinotCapabilitiesBySectionTreatmentInput(pinotBanner=" + abstractC8997hK + ", pinotBillboard=" + abstractC8997hK2 + ", pinotCharacter=" + abstractC8997hK3 + ", pinotCreatorHome=" + abstractC8997hK4 + ", irmaCreatorHome=" + abstractC8997hK5 + ", pinotKidsFavorites=" + abstractC8997hK6 + ", pinotReminderHoverSoon=" + abstractC8997hK7 + ", pinotStandard=" + abstractC8997hK8 + ", pinotSuggestions=" + abstractC8997hK9 + ", pinotTallPanel=" + abstractC8997hK10 + ", pinotTextButtonWithChevron=" + abstractC8997hK11 + ", pinotTrailers=" + abstractC8997hK12 + ", pinotMultiHeadline=" + abstractC8997hK13 + ")";
    }

    public C3036arP(AbstractC8997hK<C3032arL> abstractC8997hK, AbstractC8997hK<C3034arN> abstractC8997hK2, AbstractC8997hK<C3042arV> abstractC8997hK3, AbstractC8997hK<C3041arU> abstractC8997hK4, AbstractC8997hK<C2916apB> abstractC8997hK5, AbstractC8997hK<C3107ash> abstractC8997hK6, AbstractC8997hK<C3104ase> abstractC8997hK7, AbstractC8997hK<C3110ask> abstractC8997hK8, AbstractC8997hK<C3115asp> abstractC8997hK9, AbstractC8997hK<C3114aso> abstractC8997hK10, AbstractC8997hK<C3113asn> abstractC8997hK11, AbstractC8997hK<C3119ast> abstractC8997hK12, AbstractC8997hK<C3097asX> abstractC8997hK13) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        C8632dsu.c((Object) abstractC8997hK7, "");
        C8632dsu.c((Object) abstractC8997hK8, "");
        C8632dsu.c((Object) abstractC8997hK9, "");
        C8632dsu.c((Object) abstractC8997hK10, "");
        C8632dsu.c((Object) abstractC8997hK11, "");
        C8632dsu.c((Object) abstractC8997hK12, "");
        C8632dsu.c((Object) abstractC8997hK13, "");
        this.b = abstractC8997hK;
        this.d = abstractC8997hK2;
        this.e = abstractC8997hK3;
        this.a = abstractC8997hK4;
        this.c = abstractC8997hK5;
        this.h = abstractC8997hK6;
        this.g = abstractC8997hK7;
        this.j = abstractC8997hK8;
        this.f = abstractC8997hK9;
        this.l = abstractC8997hK10;
        this.f13482o = abstractC8997hK11;
        this.n = abstractC8997hK12;
        this.i = abstractC8997hK13;
    }

    public /* synthetic */ C3036arP(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, AbstractC8997hK abstractC8997hK7, AbstractC8997hK abstractC8997hK8, AbstractC8997hK abstractC8997hK9, AbstractC8997hK abstractC8997hK10, AbstractC8997hK abstractC8997hK11, AbstractC8997hK abstractC8997hK12, AbstractC8997hK abstractC8997hK13, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5, (i & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK6, (i & 64) != 0 ? AbstractC8997hK.e.c : abstractC8997hK7, (i & 128) != 0 ? AbstractC8997hK.e.c : abstractC8997hK8, (i & JSONzip.end) != 0 ? AbstractC8997hK.e.c : abstractC8997hK9, (i & 512) != 0 ? AbstractC8997hK.e.c : abstractC8997hK10, (i & 1024) != 0 ? AbstractC8997hK.e.c : abstractC8997hK11, (i & 2048) != 0 ? AbstractC8997hK.e.c : abstractC8997hK12, (i & 4096) != 0 ? AbstractC8997hK.e.c : abstractC8997hK13);
    }
}
