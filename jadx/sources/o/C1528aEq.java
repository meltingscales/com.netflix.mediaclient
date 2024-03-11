package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import com.netflix.model.leafs.VideoInfo;
import java.util.List;
import o.C2363aeo;
import o.C2410afi;
import o.C2539ahw;

/* renamed from: o.aEq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1528aEq extends aED {
    private final C2363aeo a;
    private final C2539ahw b;
    private final C2410afi c;
    private final String d;
    private final String e;
    private final C2514ahX i;
    private final C2576aig j;

    @Override // o.aED, o.InterfaceC5225buj
    public String at() {
        return this.e;
    }

    @Override // o.aED, o.InterfaceC5227bul, o.InterfaceC5198buI
    public String w() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528aEq(C2363aeo c2363aeo, C2572aic c2572aic, C2576aig c2576aig, C2547aiD c2547aiD, String str, C2410afi c2410afi, String str2, C2514ahX c2514ahX, C2539ahw c2539ahw) {
        super(c2363aeo, c2572aic, c2576aig, c2547aiD, str);
        C8632dsu.c((Object) c2363aeo, "");
        C8632dsu.c((Object) c2547aiD, "");
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2539ahw, "");
        this.a = c2363aeo;
        this.j = c2576aig;
        this.e = str;
        this.c = c2410afi;
        this.d = str2;
        this.i = c2514ahX;
        this.b = c2539ahw;
    }

    @Override // o.aED, o.InterfaceC5173btk
    public String bM_() {
        C2410afi.c a;
        C2410afi c2410afi = this.c;
        String d = (c2410afi == null || (a = c2410afi.a()) == null) ? null : a.d();
        return d == null ? "" : d;
    }

    @Override // o.aED, o.InterfaceC5227bul
    public String ca_() {
        C2363aeo.e a = this.a.a();
        String c = a != null ? a.c() : null;
        return c == null ? "" : c;
    }

    @Override // o.aED, o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return new C1531aEt(this.i, this.b, this.a.h().c(), this.a.h().b(), this.j);
    }

    @Override // o.aED, o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        return aE_().B();
    }

    @Override // o.aED, o.InterfaceC5227bul
    public String cb_() {
        C2539ahw.b e;
        C2539ahw.c d;
        C2539ahw.e b;
        String num;
        C2539ahw.h b2 = this.b.b();
        if (b2 == null || (d = b2.d()) == null || (b = d.b()) == null || (num = Integer.valueOf(b.a()).toString()) == null) {
            C2539ahw.d a = this.b.a();
            if (a == null || (e = a.e()) == null) {
                return null;
            }
            return Integer.valueOf(e.b()).toString();
        }
        return num;
    }

    @Override // o.aED, o.InterfaceC5187bty
    public boolean ai() {
        List<PlaybackBadge> c = this.b.c();
        if (c != null) {
            return c.contains(PlaybackBadge.d);
        }
        return false;
    }

    @Override // o.aED, o.InterfaceC5187bty
    public boolean av() {
        List<PlaybackBadge> c = this.b.c();
        if (c != null) {
            return c.contains(PlaybackBadge.k);
        }
        return false;
    }

    @Override // o.aED, o.InterfaceC5187bty
    public boolean ar() {
        List<PlaybackBadge> c = this.b.c();
        if (c != null) {
            return c.contains(PlaybackBadge.n);
        }
        return false;
    }

    @Override // o.aED, o.InterfaceC5187bty
    public boolean an() {
        List<PlaybackBadge> c = this.b.c();
        if (c != null) {
            return c.contains(PlaybackBadge.c);
        }
        return false;
    }

    @Override // o.aED, o.InterfaceC5187bty
    public boolean aw() {
        List<PlaybackBadge> c = this.b.c();
        if (c != null) {
            return c.contains(PlaybackBadge.f13180o);
        }
        return false;
    }

    @Override // o.aED, o.InterfaceC5187bty
    public boolean al() {
        List<PlaybackBadge> c = this.b.c();
        if (c != null) {
            return c.contains(PlaybackBadge.a);
        }
        return false;
    }
}
