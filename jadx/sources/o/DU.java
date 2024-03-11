package o;

import com.netflix.clcs.codegen.type.CLCSRdidAccessState;
import com.netflix.clcs.codegen.type.CLCSStreamQuality;
import java.util.List;
import o.AbstractC8997hK;

/* loaded from: classes2.dex */
public final class DU {
    private final AbstractC8997hK<Boolean> a;
    private final AbstractC8997hK<CLCSRdidAccessState> b;
    private final AbstractC8997hK<Boolean> c;
    private final AbstractC8997hK<Boolean> d;
    private final AbstractC8997hK<List<DY>> e;
    private final AbstractC8997hK<CLCSStreamQuality> h;

    public DU() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final AbstractC8997hK<CLCSStreamQuality> a() {
        return this.h;
    }

    public final AbstractC8997hK<Boolean> b() {
        return this.a;
    }

    public final AbstractC8997hK<List<DY>> c() {
        return this.e;
    }

    public final AbstractC8997hK<CLCSRdidAccessState> d() {
        return this.b;
    }

    public final AbstractC8997hK<Boolean> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DU) {
            DU du = (DU) obj;
            return C8632dsu.c(this.d, du.d) && C8632dsu.c(this.c, du.c) && C8632dsu.c(this.h, du.h) && C8632dsu.c(this.a, du.a) && C8632dsu.c(this.b, du.b) && C8632dsu.c(this.e, du.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public final AbstractC8997hK<Boolean> i() {
        return this.d;
    }

    public String toString() {
        AbstractC8997hK<Boolean> abstractC8997hK = this.d;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.c;
        AbstractC8997hK<CLCSStreamQuality> abstractC8997hK3 = this.h;
        AbstractC8997hK<Boolean> abstractC8997hK4 = this.a;
        AbstractC8997hK<CLCSRdidAccessState> abstractC8997hK5 = this.b;
        AbstractC8997hK<List<DY>> abstractC8997hK6 = this.e;
        return "CLCSInterstitialCommonParameters(isConsumptionOnly=" + abstractC8997hK + ", ignoreSnoozing=" + abstractC8997hK2 + ", supportedVideoFormat=" + abstractC8997hK3 + ", hasGooglePlayService=" + abstractC8997hK4 + ", rdidAccessState=" + abstractC8997hK5 + ", rdidConsentStates=" + abstractC8997hK6 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DU(AbstractC8997hK<Boolean> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2, AbstractC8997hK<? extends CLCSStreamQuality> abstractC8997hK3, AbstractC8997hK<Boolean> abstractC8997hK4, AbstractC8997hK<? extends CLCSRdidAccessState> abstractC8997hK5, AbstractC8997hK<? extends List<DY>> abstractC8997hK6) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        this.d = abstractC8997hK;
        this.c = abstractC8997hK2;
        this.h = abstractC8997hK3;
        this.a = abstractC8997hK4;
        this.b = abstractC8997hK5;
        this.e = abstractC8997hK6;
    }

    public /* synthetic */ DU(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5, (i & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK6);
    }
}
