package o;

import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* renamed from: o.boe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4902boe {
    private final List<InterfaceC4525bgE> b;
    private final AbstractC4473bfF d;
    private final Status e;

    public final Status c() {
        return this.e;
    }

    public final AbstractC4473bfF d() {
        return this.d;
    }

    public final List<InterfaceC4525bgE> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4902boe) {
            C4902boe c4902boe = (C4902boe) obj;
            return C8632dsu.c(this.e, c4902boe.e) && C8632dsu.c(this.b, c4902boe.b) && C8632dsu.c(this.d, c4902boe.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.b.hashCode();
        AbstractC4473bfF abstractC4473bfF = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (abstractC4473bfF == null ? 0 : abstractC4473bfF.hashCode());
    }

    public String toString() {
        Status status = this.e;
        List<InterfaceC4525bgE> list = this.b;
        AbstractC4473bfF abstractC4473bfF = this.d;
        return "AdBreakHydrationRequestResult(status=" + status + ", adsManifests=" + list + ", adverts=" + abstractC4473bfF + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4902boe(Status status, List<? extends InterfaceC4525bgE> list, AbstractC4473bfF abstractC4473bfF) {
        C8632dsu.c((Object) status, "");
        C8632dsu.c((Object) list, "");
        this.e = status;
        this.b = list;
        this.d = abstractC4473bfF;
    }

    public /* synthetic */ C4902boe(Status status, List list, AbstractC4473bfF abstractC4473bfF, int i, C8627dsp c8627dsp) {
        this(status, (i & 2) != 0 ? C8569dql.i() : list, (i & 4) != 0 ? null : abstractC4473bfF);
    }
}
