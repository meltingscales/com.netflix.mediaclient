package o;

import android.content.Context;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.graphql.models.type.ArtworkFallbackStrategy;
import com.netflix.mediaclient.graphql.models.type.ArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import com.netflix.mediaclient.graphql.models.type.GradientType;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import java.util.List;
import o.AbstractC8997hK;
import org.linphone.core.Privacy;

/* renamed from: o.bXg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4128bXg {
    public static final C4128bXg d = new C4128bXg();

    /* renamed from: o.bXg$b */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ImageResolutionClass.values().length];
            try {
                iArr[ImageResolutionClass.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResolutionClass.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    private C4128bXg() {
    }

    private final boolean o() {
        return C8151dev.f();
    }

    private final aOV h() {
        return AbstractApplicationC1040Mh.getInstance().i().d();
    }

    private final boolean m() {
        return C8310dhv.a();
    }

    private final aDB n() {
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        return aGD.d(d2);
    }

    public final C2865aoD e(aOV aov) {
        ImageResolutionClass C;
        List j;
        List j2;
        AbstractC8997hK abstractC8997hK;
        if (o()) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            AbstractC8997hK.b e = cVar.e(ArtworkType.h);
            C = aov != null ? aov.C() : null;
            int i = C == null ? -1 : b.c[C.ordinal()];
            AbstractC8997hK.b e2 = cVar.e(new C2864aoC(cVar.e(Integer.valueOf(i != 1 ? i != 2 ? 1750 : 1024 : 742)), null, null, null, null, null, 62, null));
            j2 = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
            AbstractC8997hK.b bVar = new AbstractC8997hK.b(j2);
            AbstractC8997hK.b e3 = cVar.e(ArtworkFallbackStrategy.c);
            if (m()) {
                abstractC8997hK = cVar.e(GradientType.f);
            } else {
                abstractC8997hK = AbstractC8997hK.e.c;
            }
            return new C2865aoD(e, null, bVar, e2, cVar.e(new C2952apl(null, null, null, e3, null, null, null, null, null, abstractC8997hK, null, null, a(aov), null, null, null, null, null, null, null, null, 2092535, null)), 2, null);
        }
        AbstractC8997hK.c cVar2 = AbstractC8997hK.d;
        AbstractC8997hK.b e4 = cVar2.e(ArtworkType.am);
        C = aov != null ? aov.C() : null;
        AbstractC8997hK.b e5 = cVar2.e(new C2864aoC(cVar2.e(Integer.valueOf((C != null && b.c[C.ordinal()] == 3) ? 820 : 450)), null, null, null, null, null, 62, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e4, null, new AbstractC8997hK.b(j), e5, new AbstractC8997hK.b(new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, a(aov), null, null, null, null, null, null, null, null, 2093055, null)), 2, null);
    }

    public final C2865aoD b(aOV aov) {
        List j;
        AbstractC8997hK abstractC8997hK;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.h);
        ImageResolutionClass C = aov != null ? aov.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(cVar.e(Integer.valueOf(i != 1 ? i != 2 ? 1000 : 562 : 408)), null, null, null, null, null, 62, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(j);
        AbstractC8997hK.b e3 = cVar.e(ArtworkFallbackStrategy.c);
        if (m()) {
            abstractC8997hK = cVar.e(GradientType.f);
        } else {
            abstractC8997hK = AbstractC8997hK.e.c;
        }
        return new C2865aoD(e, null, bVar, e2, cVar.e(new C2952apl(null, null, null, e3, null, null, null, null, null, abstractC8997hK, null, null, a(aov), null, null, null, null, null, null, null, null, 2092535, null)), 2, null);
    }

    public final C2865aoD d() {
        AbstractC8997hK.c cVar;
        ArtworkType artworkType;
        C2865aoD d2 = aDB.d(n(), true, o() ? 1.5d : 1.0d, null, 4, null);
        if (o()) {
            cVar = AbstractC8997hK.d;
            artworkType = ArtworkType.L;
        } else {
            cVar = AbstractC8997hK.d;
            artworkType = ArtworkType.M;
        }
        return C2865aoD.c(d2, cVar.e(artworkType), null, null, null, null, 30, null);
    }

    public final C2865aoD g() {
        C2952apl d2;
        C2865aoD b2 = n().b();
        C2952apl e = b2.a().e();
        if (e == null) {
            e = new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        }
        C2952apl c2952apl = e;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        d2 = c2952apl.d((r39 & 1) != 0 ? c2952apl.k : null, (r39 & 2) != 0 ? c2952apl.t : cVar.e(Boolean.TRUE), (r39 & 4) != 0 ? c2952apl.p : null, (r39 & 8) != 0 ? c2952apl.i : null, (r39 & 16) != 0 ? c2952apl.h : null, (r39 & 32) != 0 ? c2952apl.b : null, (r39 & 64) != 0 ? c2952apl.c : null, (r39 & 128) != 0 ? c2952apl.f : null, (r39 & JSONzip.end) != 0 ? c2952apl.f13478o : null, (r39 & 512) != 0 ? c2952apl.n : null, (r39 & 1024) != 0 ? c2952apl.d : null, (r39 & 2048) != 0 ? c2952apl.j : null, (r39 & 4096) != 0 ? c2952apl.g : a(h()), (r39 & 8192) != 0 ? c2952apl.m : null, (r39 & 16384) != 0 ? c2952apl.v : null, (r39 & Privacy.DEFAULT) != 0 ? c2952apl.s : null, (r39 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c2952apl.e : null, (r39 & 131072) != 0 ? c2952apl.q : null, (r39 & 262144) != 0 ? c2952apl.a : null, (r39 & 524288) != 0 ? c2952apl.l : null, (r39 & 1048576) != 0 ? c2952apl.r : null);
        return C2865aoD.c(b2, null, null, null, null, cVar.e(d2), 15, null);
    }

    public final C2865aoD c(aOV aov) {
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.ag);
        ImageResolutionClass C = aov != null ? aov.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(cVar.e(Integer.valueOf(i != 1 ? i != 2 ? 460 : 150 : 100)), null, null, null, null, null, 62, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, cVar.e(new C2952apl(null, null, null, null, null, null, null, new AbstractC8997hK.b(Boolean.TRUE), null, null, null, null, a(h()), null, null, null, null, null, null, null, null, 2092927, null)), 2, null);
    }

    public final C2865aoD e() {
        List j;
        AbstractC8997hK<Integer> e;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e2 = cVar.e(ArtworkType.f13173o);
        C2864aoC e3 = n().b().b().e();
        AbstractC8997hK.b e4 = cVar.e(new C2864aoC(cVar.b((e3 == null || (e = e3.e()) == null) ? null : e.e()), null, null, null, null, null, 62, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e2, null, new AbstractC8997hK.b(j), e4, new AbstractC8997hK.b(new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, a(h()), null, null, null, null, null, null, null, null, 2093055, null)), 2, null);
    }

    public final C2865aoD j() {
        C2952apl d2;
        if (C8153dex.f()) {
            aDB n = n();
            aOV d3 = AbstractApplicationC1040Mh.getInstance().i().d();
            ImageResolutionClass C = d3 != null ? d3.C() : null;
            int i = C == null ? -1 : b.c[C.ordinal()];
            int i2 = i != 1 ? i != 2 ? 1280 : 1024 : 742;
            d2 = r2.d((r39 & 1) != 0 ? r2.k : null, (r39 & 2) != 0 ? r2.t : AbstractC8997hK.d.e(Boolean.TRUE), (r39 & 4) != 0 ? r2.p : null, (r39 & 8) != 0 ? r2.i : null, (r39 & 16) != 0 ? r2.h : null, (r39 & 32) != 0 ? r2.b : null, (r39 & 64) != 0 ? r2.c : null, (r39 & 128) != 0 ? r2.f : null, (r39 & JSONzip.end) != 0 ? r2.f13478o : null, (r39 & 512) != 0 ? r2.n : null, (r39 & 1024) != 0 ? r2.d : null, (r39 & 2048) != 0 ? r2.j : null, (r39 & 4096) != 0 ? r2.g : null, (r39 & 8192) != 0 ? r2.m : null, (r39 & 16384) != 0 ? r2.v : null, (r39 & Privacy.DEFAULT) != 0 ? r2.s : null, (r39 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? r2.e : null, (r39 & 131072) != 0 ? r2.q : null, (r39 & 262144) != 0 ? r2.a : null, (r39 & 524288) != 0 ? r2.l : null, (r39 & 1048576) != 0 ? new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null).r : null);
            return n.e(i2, d2);
        }
        return n().b();
    }

    public final C2865aoD b() {
        C2952apl d2;
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.ak);
        aOV d3 = AbstractApplicationC1040Mh.getInstance().i().d();
        ImageResolutionClass C = d3 != null ? d3.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i != 1 ? i != 2 ? 1280 : 1024 : 742)), null, null, null, null, null, 62, null));
        C2952apl c2952apl = new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        Boolean bool = Boolean.TRUE;
        d2 = c2952apl.d((r39 & 1) != 0 ? c2952apl.k : null, (r39 & 2) != 0 ? c2952apl.t : cVar.e(bool), (r39 & 4) != 0 ? c2952apl.p : null, (r39 & 8) != 0 ? c2952apl.i : null, (r39 & 16) != 0 ? c2952apl.h : null, (r39 & 32) != 0 ? c2952apl.b : null, (r39 & 64) != 0 ? c2952apl.c : null, (r39 & 128) != 0 ? c2952apl.f : null, (r39 & JSONzip.end) != 0 ? c2952apl.f13478o : null, (r39 & 512) != 0 ? c2952apl.n : null, (r39 & 1024) != 0 ? c2952apl.d : null, (r39 & 2048) != 0 ? c2952apl.j : cVar.e(bool), (r39 & 4096) != 0 ? c2952apl.g : null, (r39 & 8192) != 0 ? c2952apl.m : null, (r39 & 16384) != 0 ? c2952apl.v : null, (r39 & Privacy.DEFAULT) != 0 ? c2952apl.s : null, (r39 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c2952apl.e : null, (r39 & 131072) != 0 ? c2952apl.q : null, (r39 & 262144) != 0 ? c2952apl.a : null, (r39 & 524288) != 0 ? c2952apl.l : null, (r39 & 1048576) != 0 ? c2952apl.r : null);
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(d2);
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public final C2865aoD c() {
        List j;
        aOV d2 = AbstractApplicationC1040Mh.getInstance().i().d();
        ImageResolutionClass C = d2 != null ? d2.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        int i2 = i != 1 ? i != 2 ? 700 : 562 : 408;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.l);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, null, 62, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, null, 18, null);
    }

    public final C2865aoD a() {
        List j;
        aOV h = h();
        ImageResolutionClass C = h != null ? h.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        int i2 = i != 1 ? i != 2 ? 80 : 65 : 50;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.P);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(null, new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, 61, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(n().e());
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public final C2865aoD f() {
        C2952apl d2;
        List j;
        aOV h = h();
        ImageResolutionClass C = h != null ? h.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        int i2 = i != 1 ? i != 2 ? 800 : 650 : 500;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.V);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, null, 62, null));
        d2 = r10.d((r39 & 1) != 0 ? r10.k : null, (r39 & 2) != 0 ? r10.t : new AbstractC8997hK.b(Boolean.TRUE), (r39 & 4) != 0 ? r10.p : null, (r39 & 8) != 0 ? r10.i : null, (r39 & 16) != 0 ? r10.h : null, (r39 & 32) != 0 ? r10.b : null, (r39 & 64) != 0 ? r10.c : null, (r39 & 128) != 0 ? r10.f : null, (r39 & JSONzip.end) != 0 ? r10.f13478o : null, (r39 & 512) != 0 ? r10.n : null, (r39 & 1024) != 0 ? r10.d : null, (r39 & 2048) != 0 ? r10.j : null, (r39 & 4096) != 0 ? r10.g : null, (r39 & 8192) != 0 ? r10.m : null, (r39 & 16384) != 0 ? r10.v : null, (r39 & Privacy.DEFAULT) != 0 ? r10.s : null, (r39 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? r10.e : null, (r39 & 131072) != 0 ? r10.q : null, (r39 & 262144) != 0 ? r10.a : null, (r39 & 524288) != 0 ? r10.l : null, (r39 & 1048576) != 0 ? n().e().r : null);
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(d2);
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public final C2865aoD i() {
        List j;
        aOV h = h();
        ImageResolutionClass C = h != null ? h.C() : null;
        int i = C == null ? -1 : b.c[C.ordinal()];
        int i2 = i != 1 ? i != 2 ? 200 : 150 : 100;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.Q);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(null, new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, 61, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(n().e());
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    private final AbstractC8997hK<Boolean> a(aOV aov) {
        if (aov != null && aov.e()) {
            return new AbstractC8997hK.b(Boolean.TRUE);
        }
        return AbstractC8997hK.e.c;
    }
}
