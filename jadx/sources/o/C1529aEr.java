package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import com.netflix.model.leafs.TrackableListSummary;
import com.netflix.model.leafs.VideoInfo;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2410afi;

/* renamed from: o.aEr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1529aEr extends aEF implements InterfaceC5238buw {
    private final C2539ahw a;
    private final C2514ahX b;
    private final C2410afi c;
    private final C2579aij d;
    private final C2630ajh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529aEr(C2630ajh c2630ajh, C2579aij c2579aij, C2410afi c2410afi, C2514ahX c2514ahX, C2539ahw c2539ahw) {
        super(c2630ajh, c2579aij, null, null, null);
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2579aij, "");
        C8632dsu.c((Object) c2410afi, "");
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2539ahw, "");
        this.e = c2630ajh;
        this.d = c2579aij;
        this.c = c2410afi;
        this.b = c2514ahX;
        this.a = c2539ahw;
    }

    @Override // o.aEF, o.InterfaceC5173btk
    public String bM_() {
        C2410afi.c a = this.c.a();
        String d = a != null ? a.d() : null;
        return d == null ? "" : d;
    }

    @Override // o.InterfaceC5196buG
    public List<InterfaceC5223buh> bR_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5196buG
    public TrackableListSummary h() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.aEF, o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return new C1531aEt(this.b, this.a, this.d.c(), this.d.b(), null);
    }

    @Override // o.aEF, o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        return aE_().B();
    }

    @Override // o.InterfaceC5199buJ
    public List<InterfaceC5240buy> bS_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5199buJ
    public TrackableListSummary l() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5236buu
    public InterfaceC5231bup bT_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.aEF, o.InterfaceC5187bty
    public boolean ai() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.d);
        }
        return false;
    }

    @Override // o.aEF, o.InterfaceC5187bty
    public boolean av() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.k);
        }
        return false;
    }

    @Override // o.aEF, o.InterfaceC5187bty
    public boolean ar() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.n);
        }
        return false;
    }

    @Override // o.aEF, o.InterfaceC5187bty
    public boolean an() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.c);
        }
        return false;
    }

    @Override // o.aEF, o.InterfaceC5187bty
    public boolean aw() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.f13180o);
        }
        return false;
    }

    @Override // o.aEF, o.InterfaceC5187bty
    public boolean al() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.a);
        }
        return false;
    }
}
