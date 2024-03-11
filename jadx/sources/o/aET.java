package o;

import com.netflix.model.leafs.VideoInfo;
import o.C2522ahf;
import o.C2529ahm;
import o.C2564aiU;

/* loaded from: classes3.dex */
public final class aET extends aEV implements InterfaceC5217bub {
    private VideoInfo.TopTenBoxart b;
    private final C2522ahf.e d;

    @Override // o.InterfaceC5217bub
    public VideoInfo.TopTenBoxart b() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aET(C2529ahm.e eVar, C2522ahf.e eVar2) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) eVar2, "");
        this.d = eVar2;
        this.b = new VideoInfo.TopTenBoxart() { // from class: o.aET.1
            @Override // com.netflix.model.leafs.VideoInfo.TopTenBoxart
            public String getUrl() {
                C2522ahf.d c;
                C2564aiU d;
                C2564aiU.e d2;
                C2522ahf.c d3 = aET.this.d.d();
                if (d3 == null || (c = d3.c()) == null || (d = c.d()) == null || (d2 = d.d()) == null) {
                    return null;
                }
                return d2.a();
            }

            @Override // com.netflix.model.leafs.VideoInfo.TopTenBoxart
            public String getBoxartId() {
                C2522ahf.d c;
                C2564aiU d;
                C2564aiU.e d2;
                C2522ahf.c d3 = aET.this.d.d();
                if (d3 == null || (c = d3.c()) == null || (d = c.d()) == null || (d2 = d.d()) == null) {
                    return null;
                }
                return d2.d();
            }
        };
    }
}
