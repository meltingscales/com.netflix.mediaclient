package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.graphql.models.type.ArtworkAlignment;
import com.netflix.mediaclient.graphql.models.type.ArtworkFallbackStrategy;
import com.netflix.mediaclient.graphql.models.type.ArtworkGenreBranding;
import com.netflix.mediaclient.graphql.models.type.ArtworkGravity;
import com.netflix.mediaclient.graphql.models.type.ArtworkIconIdentifier;
import com.netflix.mediaclient.graphql.models.type.ArtworkTone;
import com.netflix.mediaclient.graphql.models.type.BrandSizeBoost;
import com.netflix.mediaclient.graphql.models.type.GradientType;
import com.netflix.mediaclient.graphql.models.type.KnownBadgeText;
import com.netflix.mediaclient.graphql.models.type.RoundedCornerType;
import o.AbstractC8997hK;
import org.linphone.core.Privacy;

/* renamed from: o.apl */
/* loaded from: classes3.dex */
public final class C2952apl {
    private final AbstractC8997hK<Boolean> a;
    private final AbstractC8997hK<ArtworkGravity> b;
    private final AbstractC8997hK<ArtworkAlignment> c;
    private final AbstractC8997hK<Boolean> d;
    private final AbstractC8997hK<KnownBadgeText> e;
    private final AbstractC8997hK<Boolean> f;
    private final AbstractC8997hK<Boolean> g;
    private final AbstractC8997hK<BrandSizeBoost> h;
    private final AbstractC8997hK<ArtworkFallbackStrategy> i;
    private final AbstractC8997hK<Boolean> j;
    private final AbstractC8997hK<Boolean> k;
    private final AbstractC8997hK<ArtworkIconIdentifier> l;
    private final AbstractC8997hK<Boolean> m;
    private final AbstractC8997hK<GradientType> n;

    /* renamed from: o */
    private final AbstractC8997hK<ArtworkGenreBranding> f13478o;
    private final AbstractC8997hK<ArtworkTone> p;
    private final AbstractC8997hK<RoundedCornerType> q;
    private final AbstractC8997hK<Boolean> r;
    private final AbstractC8997hK<Boolean> s;
    private final AbstractC8997hK<Boolean> t;
    private final AbstractC8997hK<C3229auz> v;

    public C2952apl() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final AbstractC8997hK<Boolean> a() {
        return this.d;
    }

    public final AbstractC8997hK<Boolean> b() {
        return this.a;
    }

    public final AbstractC8997hK<ArtworkAlignment> c() {
        return this.c;
    }

    public final C2952apl d(AbstractC8997hK<Boolean> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2, AbstractC8997hK<? extends ArtworkTone> abstractC8997hK3, AbstractC8997hK<? extends ArtworkFallbackStrategy> abstractC8997hK4, AbstractC8997hK<? extends BrandSizeBoost> abstractC8997hK5, AbstractC8997hK<? extends ArtworkGravity> abstractC8997hK6, AbstractC8997hK<? extends ArtworkAlignment> abstractC8997hK7, AbstractC8997hK<Boolean> abstractC8997hK8, AbstractC8997hK<? extends ArtworkGenreBranding> abstractC8997hK9, AbstractC8997hK<? extends GradientType> abstractC8997hK10, AbstractC8997hK<Boolean> abstractC8997hK11, AbstractC8997hK<Boolean> abstractC8997hK12, AbstractC8997hK<Boolean> abstractC8997hK13, AbstractC8997hK<Boolean> abstractC8997hK14, AbstractC8997hK<C3229auz> abstractC8997hK15, AbstractC8997hK<Boolean> abstractC8997hK16, AbstractC8997hK<? extends KnownBadgeText> abstractC8997hK17, AbstractC8997hK<? extends RoundedCornerType> abstractC8997hK18, AbstractC8997hK<Boolean> abstractC8997hK19, AbstractC8997hK<? extends ArtworkIconIdentifier> abstractC8997hK20, AbstractC8997hK<Boolean> abstractC8997hK21) {
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
        C8632dsu.c((Object) abstractC8997hK14, "");
        C8632dsu.c((Object) abstractC8997hK15, "");
        C8632dsu.c((Object) abstractC8997hK16, "");
        C8632dsu.c((Object) abstractC8997hK17, "");
        C8632dsu.c((Object) abstractC8997hK18, "");
        C8632dsu.c((Object) abstractC8997hK19, "");
        C8632dsu.c((Object) abstractC8997hK20, "");
        C8632dsu.c((Object) abstractC8997hK21, "");
        return new C2952apl(abstractC8997hK, abstractC8997hK2, abstractC8997hK3, abstractC8997hK4, abstractC8997hK5, abstractC8997hK6, abstractC8997hK7, abstractC8997hK8, abstractC8997hK9, abstractC8997hK10, abstractC8997hK11, abstractC8997hK12, abstractC8997hK13, abstractC8997hK14, abstractC8997hK15, abstractC8997hK16, abstractC8997hK17, abstractC8997hK18, abstractC8997hK19, abstractC8997hK20, abstractC8997hK21);
    }

    public final AbstractC8997hK<KnownBadgeText> d() {
        return this.e;
    }

    public final AbstractC8997hK<ArtworkGravity> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2952apl) {
            C2952apl c2952apl = (C2952apl) obj;
            return C8632dsu.c(this.k, c2952apl.k) && C8632dsu.c(this.t, c2952apl.t) && C8632dsu.c(this.p, c2952apl.p) && C8632dsu.c(this.i, c2952apl.i) && C8632dsu.c(this.h, c2952apl.h) && C8632dsu.c(this.b, c2952apl.b) && C8632dsu.c(this.c, c2952apl.c) && C8632dsu.c(this.f, c2952apl.f) && C8632dsu.c(this.f13478o, c2952apl.f13478o) && C8632dsu.c(this.n, c2952apl.n) && C8632dsu.c(this.d, c2952apl.d) && C8632dsu.c(this.j, c2952apl.j) && C8632dsu.c(this.g, c2952apl.g) && C8632dsu.c(this.m, c2952apl.m) && C8632dsu.c(this.v, c2952apl.v) && C8632dsu.c(this.s, c2952apl.s) && C8632dsu.c(this.e, c2952apl.e) && C8632dsu.c(this.q, c2952apl.q) && C8632dsu.c(this.a, c2952apl.a) && C8632dsu.c(this.l, c2952apl.l) && C8632dsu.c(this.r, c2952apl.r);
        }
        return false;
    }

    public final AbstractC8997hK<Boolean> f() {
        return this.f;
    }

    public final AbstractC8997hK<Boolean> g() {
        return this.g;
    }

    public final AbstractC8997hK<BrandSizeBoost> h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.k.hashCode() * 31) + this.t.hashCode()) * 31) + this.p.hashCode()) * 31) + this.i.hashCode()) * 31) + this.h.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f13478o.hashCode()) * 31) + this.n.hashCode()) * 31) + this.d.hashCode()) * 31) + this.j.hashCode()) * 31) + this.g.hashCode()) * 31) + this.m.hashCode()) * 31) + this.v.hashCode()) * 31) + this.s.hashCode()) * 31) + this.e.hashCode()) * 31) + this.q.hashCode()) * 31) + this.a.hashCode()) * 31) + this.l.hashCode()) * 31) + this.r.hashCode();
    }

    public final AbstractC8997hK<ArtworkFallbackStrategy> i() {
        return this.i;
    }

    public final AbstractC8997hK<Boolean> j() {
        return this.j;
    }

    public final AbstractC8997hK<Boolean> k() {
        return this.k;
    }

    public final AbstractC8997hK<GradientType> l() {
        return this.n;
    }

    public final AbstractC8997hK<Boolean> m() {
        return this.m;
    }

    public final AbstractC8997hK<ArtworkGenreBranding> n() {
        return this.f13478o;
    }

    public final AbstractC8997hK<ArtworkIconIdentifier> o() {
        return this.l;
    }

    public final AbstractC8997hK<Boolean> p() {
        return this.r;
    }

    public final AbstractC8997hK<Boolean> q() {
        return this.s;
    }

    public final AbstractC8997hK<ArtworkTone> r() {
        return this.p;
    }

    public final AbstractC8997hK<Boolean> s() {
        return this.t;
    }

    public final AbstractC8997hK<RoundedCornerType> t() {
        return this.q;
    }

    public String toString() {
        AbstractC8997hK<Boolean> abstractC8997hK = this.k;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.t;
        AbstractC8997hK<ArtworkTone> abstractC8997hK3 = this.p;
        AbstractC8997hK<ArtworkFallbackStrategy> abstractC8997hK4 = this.i;
        AbstractC8997hK<BrandSizeBoost> abstractC8997hK5 = this.h;
        AbstractC8997hK<ArtworkGravity> abstractC8997hK6 = this.b;
        AbstractC8997hK<ArtworkAlignment> abstractC8997hK7 = this.c;
        AbstractC8997hK<Boolean> abstractC8997hK8 = this.f;
        AbstractC8997hK<ArtworkGenreBranding> abstractC8997hK9 = this.f13478o;
        AbstractC8997hK<GradientType> abstractC8997hK10 = this.n;
        AbstractC8997hK<Boolean> abstractC8997hK11 = this.d;
        AbstractC8997hK<Boolean> abstractC8997hK12 = this.j;
        AbstractC8997hK<Boolean> abstractC8997hK13 = this.g;
        AbstractC8997hK<Boolean> abstractC8997hK14 = this.m;
        AbstractC8997hK<C3229auz> abstractC8997hK15 = this.v;
        AbstractC8997hK<Boolean> abstractC8997hK16 = this.s;
        AbstractC8997hK<KnownBadgeText> abstractC8997hK17 = this.e;
        AbstractC8997hK<RoundedCornerType> abstractC8997hK18 = this.q;
        AbstractC8997hK<Boolean> abstractC8997hK19 = this.a;
        AbstractC8997hK<ArtworkIconIdentifier> abstractC8997hK20 = this.l;
        AbstractC8997hK<Boolean> abstractC8997hK21 = this.r;
        return "ImageFeatures(graybox=" + abstractC8997hK + ", suppressTop10Badge=" + abstractC8997hK2 + ", tone=" + abstractC8997hK3 + ", fallbackStrategy=" + abstractC8997hK4 + ", brandSizeBoost=" + abstractC8997hK5 + ", brandPadGravity=" + abstractC8997hK6 + ", brandLogoAlign=" + abstractC8997hK7 + ", enableLockBadgeChecks=" + abstractC8997hK8 + ", forceGenreBranding=" + abstractC8997hK9 + ", gradient=" + abstractC8997hK10 + ", bottomBadgeLiveNow=" + abstractC8997hK11 + ", disableBottomBadgeLive=" + abstractC8997hK12 + ", enableAvifFormatTest=" + abstractC8997hK13 + ", kidsBrandRealignment=" + abstractC8997hK14 + ", tvuiCapability=" + abstractC8997hK15 + ", preferNonWebpForOriginals=" + abstractC8997hK16 + ", badgeText=" + abstractC8997hK17 + ", roundedCorners=" + abstractC8997hK18 + ", boxartForceUnbranded=" + abstractC8997hK19 + ", iconIdentifier=" + abstractC8997hK20 + ", performNewContentCheck=" + abstractC8997hK21 + ")";
    }

    public final AbstractC8997hK<C3229auz> y() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2952apl(AbstractC8997hK<Boolean> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2, AbstractC8997hK<? extends ArtworkTone> abstractC8997hK3, AbstractC8997hK<? extends ArtworkFallbackStrategy> abstractC8997hK4, AbstractC8997hK<? extends BrandSizeBoost> abstractC8997hK5, AbstractC8997hK<? extends ArtworkGravity> abstractC8997hK6, AbstractC8997hK<? extends ArtworkAlignment> abstractC8997hK7, AbstractC8997hK<Boolean> abstractC8997hK8, AbstractC8997hK<? extends ArtworkGenreBranding> abstractC8997hK9, AbstractC8997hK<? extends GradientType> abstractC8997hK10, AbstractC8997hK<Boolean> abstractC8997hK11, AbstractC8997hK<Boolean> abstractC8997hK12, AbstractC8997hK<Boolean> abstractC8997hK13, AbstractC8997hK<Boolean> abstractC8997hK14, AbstractC8997hK<C3229auz> abstractC8997hK15, AbstractC8997hK<Boolean> abstractC8997hK16, AbstractC8997hK<? extends KnownBadgeText> abstractC8997hK17, AbstractC8997hK<? extends RoundedCornerType> abstractC8997hK18, AbstractC8997hK<Boolean> abstractC8997hK19, AbstractC8997hK<? extends ArtworkIconIdentifier> abstractC8997hK20, AbstractC8997hK<Boolean> abstractC8997hK21) {
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
        C8632dsu.c((Object) abstractC8997hK14, "");
        C8632dsu.c((Object) abstractC8997hK15, "");
        C8632dsu.c((Object) abstractC8997hK16, "");
        C8632dsu.c((Object) abstractC8997hK17, "");
        C8632dsu.c((Object) abstractC8997hK18, "");
        C8632dsu.c((Object) abstractC8997hK19, "");
        C8632dsu.c((Object) abstractC8997hK20, "");
        C8632dsu.c((Object) abstractC8997hK21, "");
        this.k = abstractC8997hK;
        this.t = abstractC8997hK2;
        this.p = abstractC8997hK3;
        this.i = abstractC8997hK4;
        this.h = abstractC8997hK5;
        this.b = abstractC8997hK6;
        this.c = abstractC8997hK7;
        this.f = abstractC8997hK8;
        this.f13478o = abstractC8997hK9;
        this.n = abstractC8997hK10;
        this.d = abstractC8997hK11;
        this.j = abstractC8997hK12;
        this.g = abstractC8997hK13;
        this.m = abstractC8997hK14;
        this.v = abstractC8997hK15;
        this.s = abstractC8997hK16;
        this.e = abstractC8997hK17;
        this.q = abstractC8997hK18;
        this.a = abstractC8997hK19;
        this.l = abstractC8997hK20;
        this.r = abstractC8997hK21;
    }

    public /* synthetic */ C2952apl(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, AbstractC8997hK abstractC8997hK7, AbstractC8997hK abstractC8997hK8, AbstractC8997hK abstractC8997hK9, AbstractC8997hK abstractC8997hK10, AbstractC8997hK abstractC8997hK11, AbstractC8997hK abstractC8997hK12, AbstractC8997hK abstractC8997hK13, AbstractC8997hK abstractC8997hK14, AbstractC8997hK abstractC8997hK15, AbstractC8997hK abstractC8997hK16, AbstractC8997hK abstractC8997hK17, AbstractC8997hK abstractC8997hK18, AbstractC8997hK abstractC8997hK19, AbstractC8997hK abstractC8997hK20, AbstractC8997hK abstractC8997hK21, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5, (i & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK6, (i & 64) != 0 ? AbstractC8997hK.e.c : abstractC8997hK7, (i & 128) != 0 ? AbstractC8997hK.e.c : abstractC8997hK8, (i & JSONzip.end) != 0 ? AbstractC8997hK.e.c : abstractC8997hK9, (i & 512) != 0 ? AbstractC8997hK.e.c : abstractC8997hK10, (i & 1024) != 0 ? AbstractC8997hK.e.c : abstractC8997hK11, (i & 2048) != 0 ? AbstractC8997hK.e.c : abstractC8997hK12, (i & 4096) != 0 ? AbstractC8997hK.e.c : abstractC8997hK13, (i & 8192) != 0 ? AbstractC8997hK.e.c : abstractC8997hK14, (i & 16384) != 0 ? AbstractC8997hK.e.c : abstractC8997hK15, (i & Privacy.DEFAULT) != 0 ? AbstractC8997hK.e.c : abstractC8997hK16, (i & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? AbstractC8997hK.e.c : abstractC8997hK17, (i & 131072) != 0 ? AbstractC8997hK.e.c : abstractC8997hK18, (i & 262144) != 0 ? AbstractC8997hK.e.c : abstractC8997hK19, (i & 524288) != 0 ? AbstractC8997hK.e.c : abstractC8997hK20, (i & 1048576) != 0 ? AbstractC8997hK.e.c : abstractC8997hK21);
    }
}
