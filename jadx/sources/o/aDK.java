package o;

import com.netflix.model.leafs.VideoInfo;
import o.C2353aee;
import o.C2465agb;
import o.C2529ahm;

/* loaded from: classes3.dex */
public final class aDK extends aEV implements InterfaceC5142btF {
    private VideoInfo.HorzBillboardArt b;
    private final C2465agb.b d;

    @Override // o.InterfaceC5142btF
    public VideoInfo.HorzBillboardArt bN_() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aDK(C2529ahm.e eVar, C2465agb.b bVar) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        this.d = bVar;
        this.b = new VideoInfo.HorzBillboardArt() { // from class: o.aDK.2
            @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
            public String getKey() {
                C2353aee b;
                C2353aee.b e;
                C2465agb.b bVar2 = aDK.this.d;
                if (bVar2 == null || (b = bVar2.b()) == null || (e = b.e()) == null) {
                    return null;
                }
                return e.e();
            }

            @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
            public String getUrl() {
                C2353aee b;
                C2353aee.b e;
                C2465agb.b bVar2 = aDK.this.d;
                if (bVar2 == null || (b = bVar2.b()) == null || (e = b.e()) == null) {
                    return null;
                }
                return e.d();
            }

            @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
            public Integer getWidth() {
                C2353aee b;
                C2353aee.b e;
                C2465agb.b bVar2 = aDK.this.d;
                if (bVar2 == null || (b = bVar2.b()) == null || (e = b.e()) == null) {
                    return null;
                }
                return e.b();
            }

            @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
            public Integer getHeight() {
                C2353aee b;
                C2353aee.b e;
                C2465agb.b bVar2 = aDK.this.d;
                if (bVar2 == null || (b = bVar2.b()) == null || (e = b.e()) == null) {
                    return null;
                }
                return e.c();
            }
        };
    }
}
