package o;

import com.netflix.model.leafs.RecommendedTrailer;
import o.C2347aeY;
import o.aEX;

/* renamed from: o.aEg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1518aEg extends C1514aEc implements InterfaceC5139btC, RecommendedTrailer {
    private final C2347aeY a;

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5139btC
    public RecommendedTrailer l() {
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1518aEg(o.C2454agQ.d r8, o.C2344aeV r9, o.C2342aeT r10, o.C2347aeY r11) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r9, r0)
            o.C8632dsu.c(r10, r0)
            o.C8632dsu.c(r11, r0)
            java.lang.String r2 = r8.c()
            java.lang.Integer r8 = r8.b()
            if (r8 == 0) goto L1d
            int r8 = r8.intValue()
            goto L1e
        L1d:
            r8 = -1
        L1e:
            r3 = r8
            o.aeT$e r8 = r10.c()
            r0 = 0
            if (r8 == 0) goto L2c
            java.lang.String r8 = r8.e()
            r5 = r8
            goto L2d
        L2c:
            r5 = r0
        L2d:
            o.aeT$e r8 = r10.c()
            if (r8 == 0) goto L39
            java.lang.String r8 = r8.a()
            r6 = r8
            goto L3a
        L39:
            r6 = r0
        L3a:
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.a = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1518aEg.<init>(o.agQ$d, o.aeV, o.aeT, o.aeY):void");
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoId() {
        C2347aeY.c d;
        String num;
        C2347aeY.e a = this.a.a();
        return (a == null || (d = a.d()) == null || (num = Integer.valueOf(d.a()).toString()) == null) ? "" : num;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoType() {
        C2347aeY.c d;
        aEX.e eVar = aEX.a;
        C2347aeY.e a = this.a.a();
        return eVar.c((a == null || (d = a.d()) == null || (r1 = d.b()) == null) ? "" : "").name();
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public int getSupplementalVideoRuntime() {
        C2347aeY.c d;
        C2347aeY.d e;
        Integer e2;
        C2347aeY.e a = this.a.a();
        if (a == null || (d = a.d()) == null || (e = d.e()) == null || (e2 = e.e()) == null) {
            return 0;
        }
        return e2.intValue();
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoInterestingUrl() {
        C2347aeY.c d;
        C2347aeY.a d2;
        C2347aeY.e a = this.a.a();
        if (a == null || (d = a.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        return d2.a();
    }
}
