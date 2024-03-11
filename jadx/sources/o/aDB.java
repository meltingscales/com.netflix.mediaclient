package o;

import com.netflix.mediaclient.graphql.models.type.ArtworkAlignment;
import com.netflix.mediaclient.graphql.models.type.ArtworkFallbackStrategy;
import com.netflix.mediaclient.graphql.models.type.ArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.ArtworkGravity;
import com.netflix.mediaclient.graphql.models.type.ArtworkTone;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import com.netflix.mediaclient.graphql.models.type.BrandSizeBoost;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC8997hK;
import org.chromium.net.PrivateKeyType;

@Singleton
/* loaded from: classes3.dex */
public final class aDB {
    private final InterfaceC1469aCl e;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;

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
            b = iArr;
        }
    }

    @Inject
    public aDB(InterfaceC1469aCl interfaceC1469aCl) {
        C8632dsu.c((Object) interfaceC1469aCl, "");
        this.e = interfaceC1469aCl;
    }

    private final boolean r() {
        Boolean a = this.e.a();
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    private final boolean q() {
        return C8151dev.f();
    }

    public final C2865aoD b() {
        return b(this, s(), null, 2, null);
    }

    public final C2865aoD c(int i) {
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.V);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i)), null, null, null, null, null, 62, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(e());
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public final C2865aoD o() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.Q);
        ImageResolutionClass e2 = this.e.e();
        int i = e2 == null ? -1 : b.b[e2.ordinal()];
        return new C2865aoD(e, null, null, cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i != 1 ? i != 2 ? 360 : 180 : 90)), null, null, null, null, null, 62, null)), null, 22, null);
    }

    public final C2865aoD m() {
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.j);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(s())), null, null, null, null, null, 62, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(e());
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public final C2865aoD h() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.ac);
        ImageResolutionClass e2 = this.e.e();
        int i = e2 == null ? -1 : b.b[e2.ordinal()];
        return new C2865aoD(e, null, null, cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i != 1 ? i != 2 ? 456 : 228 : 114)), null, null, null, null, null, 62, null)), null, 22, null);
    }

    public static /* synthetic */ C2865aoD d(aDB adb, boolean z, double d, ArtworkType artworkType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            d = 2.5d;
        }
        if ((i & 4) != 0) {
            artworkType = ArtworkType.K;
        }
        return adb.a(z, d, artworkType);
    }

    public final C2865aoD a(boolean z, double d, ArtworkType artworkType) {
        int i;
        int i2;
        List j;
        C8632dsu.c((Object) artworkType, "");
        boolean z2 = z || q();
        if (z2) {
            ImageResolutionClass e = this.e.e();
            i = e != null ? b.b[e.ordinal()] : -1;
            i2 = i != 1 ? i != 2 ? 456 : 228 : 114;
        } else if (!z2) {
            ImageResolutionClass e2 = this.e.e();
            i = e2 != null ? b.b[e2.ordinal()] : -1;
            i2 = i != 1 ? i != 2 ? PrivateKeyType.INVALID : 100 : 65;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e3 = cVar.e(artworkType);
        AbstractC8997hK.b e4 = cVar.e(new C2864aoC(cVar.e(Integer.valueOf((int) (i2 * d))), new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, 60, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e3, null, new AbstractC8997hK.b(j), e4, cVar.e(new C2952apl(null, null, cVar.e(ArtworkTone.e), null, cVar.e(BrandSizeBoost.a), !q() ? cVar.e(ArtworkGravity.g) : AbstractC8997hK.e.c, cVar.e(ArtworkAlignment.a), null, null, null, null, null, c(this.e), null, null, null, null, null, null, null, null, 2092939, null)), 2, null);
    }

    public static /* synthetic */ C2865aoD e(aDB adb, double d, ArtworkType artworkType, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 2.5d;
        }
        if ((i & 2) != 0) {
            artworkType = ArtworkType.K;
        }
        return adb.a(d, artworkType);
    }

    public final C2865aoD a(double d, ArtworkType artworkType) {
        List j;
        C8632dsu.c((Object) artworkType, "");
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        int i2 = i != 1 ? i != 2 ? 456 : 228 : 114;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e2 = cVar.e(artworkType);
        AbstractC8997hK.b e3 = cVar.e(new C2864aoC(cVar.e(Integer.valueOf((int) (i2 * d))), new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, 60, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e2, null, new AbstractC8997hK.b(j), e3, cVar.e(new C2952apl(null, null, cVar.e(ArtworkTone.e), null, cVar.e(BrandSizeBoost.a), cVar.e(ArtworkGravity.j), cVar.e(ArtworkAlignment.c), null, null, null, null, null, c(this.e), null, null, null, null, null, null, null, null, 2092939, null)), 2, null);
    }

    public final C2865aoD j() {
        AbstractC8997hK abstractC8997hK;
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.A);
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(new C2864aoC(cVar.e(450), null, null, null, null, null, 62, null));
        if (r()) {
            abstractC8997hK = new AbstractC8997hK.b(new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, new AbstractC8997hK.b(Boolean.TRUE), null, null, null, null, null, null, null, null, 2093055, null));
        } else {
            abstractC8997hK = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK2 = abstractC8997hK;
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), bVar, abstractC8997hK2, 2, null);
    }

    public final C2865aoD f() {
        AbstractC8997hK d;
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.V);
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(new C2864aoC(cVar.e(600), null, null, null, null, null, 62, null));
        if (r()) {
            d = new AbstractC8997hK.b(new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, new AbstractC8997hK.b(Boolean.TRUE), null, null, null, null, null, null, null, null, 2093055, null));
        } else {
            d = cVar.d();
        }
        AbstractC8997hK abstractC8997hK = d;
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), bVar, abstractC8997hK, 2, null);
    }

    public final C2865aoD i() {
        AbstractC8997hK d;
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.e);
        ImageResolutionClass e2 = this.e.e();
        int i = e2 == null ? -1 : b.b[e2.ordinal()];
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(new C2864aoC(cVar.e(Integer.valueOf(i != 1 ? i != 2 ? 300 : 150 : 100)), null, null, null, null, null, 62, null));
        if (r()) {
            d = new AbstractC8997hK.b(new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, new AbstractC8997hK.b(Boolean.TRUE), null, null, null, null, null, null, null, null, 2093055, null));
        } else {
            d = cVar.d();
        }
        AbstractC8997hK abstractC8997hK = d;
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), bVar, abstractC8997hK, 2, null);
    }

    public final C2865aoD g() {
        int i;
        AbstractC8997hK d;
        List j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.q);
        if (q()) {
            i = 1088;
        } else {
            ImageResolutionClass e2 = this.e.e();
            int i2 = e2 == null ? -1 : b.b[e2.ordinal()];
            i = i2 != 1 ? i2 != 2 ? 1000 : 608 : 342;
        }
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(new C2864aoC(cVar.e(Integer.valueOf(i)), null, null, null, null, null, 62, null));
        if (r()) {
            d = new AbstractC8997hK.b(new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, new AbstractC8997hK.b(Boolean.TRUE), null, null, null, null, null, null, null, null, 2093055, null));
        } else {
            d = cVar.d();
        }
        AbstractC8997hK abstractC8997hK = d;
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), bVar, abstractC8997hK, 2, null);
    }

    public final C2865aoD k() {
        List j;
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        int i2 = i != 1 ? i != 2 ? 660 : 500 : 400;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e2 = cVar.e(ArtworkType.S);
        AbstractC8997hK.b e3 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, null, 62, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(e());
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e2, null, new AbstractC8997hK.b(j), e3, bVar, 2, null);
    }

    public final C2865aoD l() {
        List j;
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        int i2 = i != 1 ? i != 2 ? 240 : 160 : 110;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e2 = cVar.e(ArtworkType.K);
        AbstractC8997hK.b e3 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i2)), null, null, null, null, null, 62, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(C2952apl.d(e(), null, null, new AbstractC8997hK.b(ArtworkTone.e), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097147, null));
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e2, null, new AbstractC8997hK.b(j), e3, bVar, 2, null);
    }

    public static /* synthetic */ C2865aoD c(aDB adb, int i, C2952apl c2952apl, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2952apl = adb.e();
        }
        return adb.d(i, c2952apl);
    }

    public final C2865aoD d(int i, C2952apl c2952apl) {
        List j;
        C8632dsu.c((Object) c2952apl, "");
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.S);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i)), null, null, null, null, null, 62, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(c2952apl);
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public static /* synthetic */ C2865aoD b(aDB adb, int i, C2952apl c2952apl, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2952apl = adb.e();
        }
        return adb.e(i, c2952apl);
    }

    public final C2865aoD e(int i, C2952apl c2952apl) {
        List j;
        C8632dsu.c((Object) c2952apl, "");
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e = cVar.e(ArtworkType.j);
        AbstractC8997hK.b e2 = cVar.e(new C2864aoC(new AbstractC8997hK.b(Integer.valueOf(i)), null, null, null, null, null, 62, null));
        AbstractC8997hK.b bVar = new AbstractC8997hK.b(c2952apl);
        j = C8569dql.j(ArtworkFormat.j, ArtworkFormat.c);
        return new C2865aoD(e, null, new AbstractC8997hK.b(j), e2, bVar, 2, null);
    }

    public final C2952apl e() {
        Boolean bool = Boolean.TRUE;
        C2952apl c2952apl = new C2952apl(null, null, null, new AbstractC8997hK.b(ArtworkFallbackStrategy.e), null, null, null, new AbstractC8997hK.b(bool), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097015, null);
        Boolean a = this.e.a();
        return (a == null || !a.booleanValue()) ? c2952apl : C2952apl.d(c2952apl, null, null, null, null, null, null, null, null, null, null, null, null, new AbstractC8997hK.b(bool), null, null, null, null, null, null, null, null, 2093055, null);
    }

    public final int s() {
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 150;
            }
            if (i == 3) {
                return 300;
            }
        }
        return 110;
    }

    public final int t() {
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 110 : 607;
            }
            return 508;
        }
        return 405;
    }

    public final int a() {
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 160;
            }
            if (i == 3) {
                return 380;
            }
        }
        return 110;
    }

    public final int n() {
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 460;
            }
            if (i == 3) {
                return 600;
            }
        }
        return 329;
    }

    public final int d() {
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 260;
            }
            if (i == 3) {
                return 342;
            }
        }
        return 180;
    }

    public final int c() {
        ImageResolutionClass e = this.e.e();
        int i = e == null ? -1 : b.b[e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 608;
            }
            if (i == 3) {
                return 912;
            }
        }
        return 342;
    }

    private final AbstractC8997hK<Boolean> c(InterfaceC1469aCl interfaceC1469aCl) {
        Boolean a = interfaceC1469aCl.a();
        Boolean bool = Boolean.TRUE;
        if (C8632dsu.c(a, bool)) {
            return new AbstractC8997hK.b(bool);
        }
        return AbstractC8997hK.e.c;
    }
}
