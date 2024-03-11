package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.model.leafs.VideoInfo;
import java.util.List;
import o.C2410afi;
import o.C2539ahw;

/* renamed from: o.aEy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536aEy extends aEA {
    private final C2539ahw a;
    private final C2538ahv b;
    private final C2514ahX c;
    private final C2410afi d;
    private final C2553aiJ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536aEy(C2553aiJ c2553aiJ, C2410afi c2410afi, C2514ahX c2514ahX, C2539ahw c2539ahw, C2538ahv c2538ahv) {
        super(c2553aiJ);
        C8632dsu.c((Object) c2553aiJ, "");
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2539ahw, "");
        this.e = c2553aiJ;
        this.d = c2410afi;
        this.c = c2514ahX;
        this.a = c2539ahw;
        this.b = c2538ahv;
    }

    @Override // o.aEA, o.InterfaceC5173btk
    public String bM_() {
        C2410afi.c a;
        C2410afi c2410afi = this.d;
        String d = (c2410afi == null || (a = c2410afi.a()) == null) ? null : a.d();
        return d == null ? "" : d;
    }

    @Override // o.aEA, o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        C2539ahw.c d;
        C2363aeo c;
        C2579aij h;
        C2539ahw.c d2;
        C2363aeo c2;
        C2579aij h2;
        C2514ahX c2514ahX = this.c;
        C2539ahw c2539ahw = this.a;
        C2539ahw.h b = c2539ahw.b();
        C2637ajo c3 = (b == null || (d2 = b.d()) == null || (c2 = d2.c()) == null || (h2 = c2.h()) == null) ? null : h2.c();
        C2539ahw.h b2 = this.a.b();
        return new C1531aEt(c2514ahX, c2539ahw, c3, (b2 == null || (d = b2.d()) == null || (c = d.c()) == null || (h = c.h()) == null) ? null : h.b(), null);
    }

    @Override // o.aEA, o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        return aE_().B();
    }

    @Override // o.aEA, o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        return super.e(textContext);
    }

    @Override // o.aEA, o.InterfaceC5198buI
    public int ag() {
        Integer d;
        C2538ahv c2538ahv = this.b;
        if (c2538ahv == null || (d = c2538ahv.d()) == null) {
            return 0;
        }
        return d.intValue();
    }

    @Override // o.aEA, o.InterfaceC5187bty
    public boolean ai() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.d);
        }
        return false;
    }

    @Override // o.aEA, o.InterfaceC5187bty
    public boolean av() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.k);
        }
        return false;
    }

    @Override // o.aEA, o.InterfaceC5187bty
    public boolean ar() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.n);
        }
        return false;
    }

    @Override // o.aEA, o.InterfaceC5187bty
    public boolean an() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.c);
        }
        return false;
    }

    @Override // o.aEA, o.InterfaceC5187bty
    public boolean aw() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.f13180o);
        }
        return false;
    }

    @Override // o.aEA, o.InterfaceC5187bty
    public boolean al() {
        List<PlaybackBadge> c = this.a.c();
        if (c != null) {
            return c.contains(PlaybackBadge.a);
        }
        return false;
    }
}
