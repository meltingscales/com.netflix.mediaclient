package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2360ael;
import o.C2547aiD;

/* loaded from: classes3.dex */
public final class aEE implements InterfaceC5195buF {
    private final C2360ael a;
    private final C2547aiD e;

    public aEE(C2547aiD c2547aiD, C2360ael c2360ael) {
        C8632dsu.c((Object) c2547aiD, "");
        this.e = c2547aiD;
        this.a = c2360ael;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.e.j());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String g = this.e.g();
        return g == null ? "" : g;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.SEASON;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.e.h();
    }

    @Override // o.InterfaceC5195buF
    public int D_() {
        C2547aiD.e b;
        Integer c;
        C2547aiD c2547aiD = this.e;
        if (c2547aiD == null || (b = c2547aiD.b()) == null || (c = b.c()) == null) {
            return 0;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5195buF
    public int x() {
        Integer c = this.e.c();
        if (c != null) {
            return c.intValue();
        }
        return 0;
    }

    @Override // o.InterfaceC5195buF
    public String ch_() {
        return this.e.d();
    }

    @Override // o.InterfaceC5195buF
    public String cd_() {
        C2547aiD.b e = this.e.e();
        String num = e != null ? Integer.valueOf(e.d()).toString() : null;
        return num == null ? "" : num;
    }

    @Override // o.InterfaceC5195buF
    public List<InterfaceC5227bul> cf_() {
        C2360ael.d b;
        List<C2360ael.e> c;
        int d;
        List<InterfaceC5227bul> U;
        C2360ael.c d2;
        C2360ael c2360ael = this.a;
        if (c2360ael == null || (b = c2360ael.b()) == null || (c = b.c()) == null) {
            return null;
        }
        d = C8572dqo.d(c, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C2360ael.e eVar : c) {
            C2363aeo d3 = (eVar == null || (d2 = eVar.d()) == null) ? null : d2.d();
            if (d3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            arrayList.add(new aED(d3, null, null, this.e, eVar != null ? eVar.e() : null));
        }
        U = C8576dqs.U(arrayList);
        return U;
    }

    @Override // o.InterfaceC5195buF
    public C5239bux cg_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
