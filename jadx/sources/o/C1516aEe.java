package o;

import com.netflix.model.leafs.TrackableListSummary;
import o.C1362Yt;

/* renamed from: o.aEe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1516aEe implements InterfaceC5199buJ {
    private final String a;
    private final TrackableListSummary b;
    private final C1362Yt.z c;
    private final int d;
    private final int e;
    private final int f;
    private final String h;

    @Override // o.InterfaceC5199buJ
    public TrackableListSummary l() {
        return this.b;
    }

    public C1516aEe(C1362Yt.z zVar, int i, String str) {
        C8632dsu.c((Object) zVar, "");
        this.c = zVar;
        this.d = i;
        this.a = str;
        this.f = i;
        this.h = str;
        this.e = -1;
        Integer e = zVar.e();
        this.b = new aDZ(i, str, e != null ? e.intValue() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = o.C8576dqs.G(r0);
     */
    @Override // o.InterfaceC5199buJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<o.InterfaceC5240buy> bS_() {
        /*
            r8 = this;
            o.Yt$z r0 = r8.c
            java.util.List r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L56
            java.util.List r0 = o.C8570dqm.e(r0)
            if (r0 == 0) goto L56
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = o.C8570dqm.a(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.next()
            o.Yt$k r3 = (o.C1362Yt.k) r3
            o.Yt$r r3 = r3.a()
            if (r3 != 0) goto L32
            r3 = r1
            goto L51
        L32:
            o.aEX r4 = r8.b(r3)
            o.aDY r5 = new o.aDY
            o.ajh r6 = r3.d()
            r5.<init>(r6)
            o.adZ r6 = r3.b()
            o.adT r3 = r3.c()
            o.aDN r7 = new o.aDN
            r7.<init>(r5, r6, r3)
            o.aDU r3 = new o.aDU
            r3.<init>(r4, r7)
        L51:
            r2.add(r3)
            goto L1e
        L55:
            r1 = r2
        L56:
            if (r1 != 0) goto L5c
            java.util.List r1 = o.C8570dqm.c()
        L5c:
            java.util.List r0 = o.C8570dqm.e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1516aEe.bS_():java.util.List");
    }

    private final aEX b(C1362Yt.r rVar) {
        C2630ajh d = rVar.d();
        C1362Yt.p a = rVar.a();
        return new aEX(d, a != null ? a.e() : null, null);
    }
}
