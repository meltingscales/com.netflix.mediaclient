package o;

import com.netflix.mediaclient.servicemgr.interface_.GameTagRecipe;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.originals.TagSummary;
import java.util.ArrayList;
import java.util.List;
import o.C2335aeM;
import o.C2340aeR;
import o.C2347aeY;
import o.C2471agh;

/* renamed from: o.aEf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1517aEf extends C1514aEc implements InterfaceC5141btE, RecommendedTrailer {
    private final C2340aeR.c b;
    private final C2347aeY.c c;
    private final C2471agh.d d;

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
    public C1517aEf(o.C2454agQ.d r8, o.C2344aeV r9, o.C2342aeT r10, o.C2471agh.c r11) {
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
            o.agh$e r8 = r11.e()
            if (r8 == 0) goto L4a
            o.agh$d r8 = r8.c()
            goto L4b
        L4a:
            r8 = r0
        L4b:
            r7.d = r8
            if (r8 == 0) goto L60
            o.aeY r9 = r8.a()
            if (r9 == 0) goto L60
            o.aeY$e r9 = r9.a()
            if (r9 == 0) goto L60
            o.aeY$c r9 = r9.d()
            goto L61
        L60:
            r9 = r0
        L61:
            r7.c = r9
            if (r8 == 0) goto L6f
            o.aeR r8 = r8.d()
            if (r8 == 0) goto L6f
            o.aeR$c r0 = r8.c()
        L6f:
            r7.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1517aEf.<init>(o.agQ$d, o.aeV, o.aeT, o.agh$c):void");
    }

    @Override // o.InterfaceC5141btE
    public String j() {
        C2335aeM b;
        C2335aeM.d d;
        C2471agh.d dVar = this.d;
        if (dVar == null || (b = dVar.b()) == null || (d = b.d()) == null) {
            return null;
        }
        return d.a();
    }

    @Override // o.InterfaceC5141btE
    public String n() {
        C2335aeM b;
        C2335aeM.b c;
        C2335aeM.c e2;
        C2471agh.d dVar = this.d;
        if (dVar == null || (b = dVar.b()) == null || (c = b.c()) == null || (e2 = c.e()) == null) {
            return null;
        }
        return Integer.valueOf(e2.d()).toString();
    }

    @Override // o.InterfaceC5141btE
    public List<TagSummary> e(GameTagRecipe gameTagRecipe) {
        C2471agh.b c;
        List<C2471agh.h> b;
        List<TagSummary> U;
        C8632dsu.c((Object) gameTagRecipe, "");
        C2471agh.d dVar = this.d;
        if (dVar == null || (c = dVar.c()) == null || (b = c.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C2471agh.h hVar : b) {
            e eVar = hVar == null ? null : new e(hVar);
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        U = C8576dqs.U(arrayList);
        return U;
    }

    /* renamed from: o.aEf$e */
    /* loaded from: classes3.dex */
    public static final class e implements TagSummary {
        final /* synthetic */ C2471agh.h e;

        @Override // com.netflix.model.leafs.originals.TagSummary
        public int getPosition() {
            return 0;
        }

        @Override // com.netflix.model.leafs.originals.TagSummary
        public int getRank() {
            return 0;
        }

        @Override // com.netflix.model.leafs.originals.TagSummary
        public void setRank(int i) {
        }

        e(C2471agh.h hVar) {
            this.e = hVar;
        }

        @Override // o.InterfaceC5178btp
        public String getId() {
            return String.valueOf(this.e.d());
        }

        @Override // o.InterfaceC5178btp
        public String getTitle() {
            return this.e.a();
        }

        @Override // o.InterfaceC5178btp
        public LoMoType getType() {
            return LoMoType.STANDARD;
        }
    }

    @Override // o.InterfaceC5140btD
    public String k() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer i() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer f() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer o() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public String h() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // o.InterfaceC5146btJ
    public boolean m() {
        C2471agh.b c;
        C2471agh.d dVar = this.d;
        if (dVar == null || (c = dVar.c()) == null) {
            return false;
        }
        return C8632dsu.c(c.c(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5146btJ
    public String g() {
        C2471agh.b c;
        String num;
        C2471agh.d dVar = this.d;
        return (dVar == null || (c = dVar.c()) == null || (num = Integer.valueOf(c.e()).toString()) == null) ? getId() : num;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoId() {
        String num;
        C2347aeY.c cVar = this.c;
        return (cVar == null || (num = Integer.valueOf(cVar.a()).toString()) == null) ? "" : num;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoType() {
        C2347aeY.c cVar = this.c;
        String b = cVar != null ? cVar.b() : null;
        return b == null ? "" : b;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public int getSupplementalVideoRuntime() {
        C2347aeY.d e2;
        Integer e3;
        C2347aeY.c cVar = this.c;
        if (cVar == null || (e2 = cVar.e()) == null || (e3 = e2.e()) == null) {
            return 0;
        }
        return e3.intValue();
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoInterestingUrl() {
        C2347aeY.a d;
        C2347aeY.c cVar = this.c;
        if (cVar == null || (d = cVar.d()) == null) {
            return null;
        }
        return d.a();
    }
}
