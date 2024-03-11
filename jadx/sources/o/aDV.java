package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import o.C1362Yt;
import o.C2328aeF;

/* loaded from: classes3.dex */
public final class aDV implements InterfaceC5195buF {
    private final C1362Yt.t d;
    private final String e;

    @Override // o.InterfaceC5195buF
    public String cd_() {
        return this.e;
    }

    public aDV(C1362Yt.t tVar, String str) {
        C8632dsu.c((Object) tVar, "");
        C8632dsu.c((Object) str, "");
        this.d = tVar;
        this.e = str;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.d.f());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String a = this.d.a();
        return a == null ? "" : a;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.SEASON;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.d.j();
    }

    @Override // o.InterfaceC5195buF
    public int D_() {
        C2328aeF c;
        Integer b;
        C1362Yt.m c2 = this.d.c();
        if (c2 == null || (c = c2.c()) == null || (b = c.b()) == null) {
            return -1;
        }
        return b.intValue();
    }

    @Override // o.InterfaceC5195buF
    public int x() {
        Integer e = this.d.e();
        if (e != null) {
            return e.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5195buF
    public String ch_() {
        String b = this.d.b();
        return b == null ? "" : b;
    }

    @Override // o.InterfaceC5195buF
    public List<InterfaceC5227bul> cf_() {
        List<InterfaceC5227bul> G;
        C2328aeF c;
        List<C2328aeF.b> a;
        int d;
        C2328aeF.e e;
        C1362Yt.m c2 = this.d.c();
        List list = null;
        if (c2 != null && (c = c2.c()) != null && (a = c.a()) != null) {
            d = C8572dqo.d(a, 10);
            ArrayList arrayList = new ArrayList(d);
            for (C2328aeF.b bVar : a) {
                arrayList.add((bVar == null || (e = bVar.e()) == null) ? null : new aDL(e));
            }
            list = arrayList;
        }
        if (list == null) {
            list = C8569dql.i();
        }
        G = C8576dqs.G(list);
        return G;
    }

    @Override // o.InterfaceC5195buF
    public C5239bux cg_() {
        C1362Yt.m c = this.d.c();
        return aDT.c(c != null ? c.c() : null);
    }
}
