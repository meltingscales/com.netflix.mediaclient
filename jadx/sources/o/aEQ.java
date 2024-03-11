package o;

import com.netflix.model.leafs.VideoInfo;
import o.C2519ahc;
import o.C2529ahm;
import o.C2559aiP;

/* loaded from: classes3.dex */
public final class aEQ extends aEV implements InterfaceC5216bua {
    private VideoInfo.TallPanelArt d;
    private final C2519ahc.c e;

    @Override // o.InterfaceC5216bua
    public VideoInfo.TallPanelArt a() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aEQ(C2529ahm.e eVar, C2519ahc.c cVar) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) cVar, "");
        this.e = cVar;
        this.d = new VideoInfo.TallPanelArt() { // from class: o.aEQ.1
            @Override // com.netflix.model.leafs.VideoInfo.TallPanelArt
            public String getUrl() {
                C2519ahc.a a;
                C2559aiP b;
                C2559aiP.c e;
                C2519ahc.b b2 = aEQ.this.e.b();
                String d = (b2 == null || (a = b2.a()) == null || (b = a.b()) == null || (e = b.e()) == null) ? null : e.d();
                return d == null ? "" : d;
            }

            @Override // com.netflix.model.leafs.VideoInfo.TallPanelArt
            public String getImageTypeIdentifier() {
                C2519ahc.a a;
                C2559aiP b;
                C2559aiP.c e;
                C2519ahc.b b2 = aEQ.this.e.b();
                String e2 = (b2 == null || (a = b2.a()) == null || (b = a.b()) == null || (e = b.e()) == null) ? null : e.e();
                return e2 == null ? "" : e2;
            }
        };
    }
}
