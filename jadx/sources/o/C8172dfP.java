package o;

import android.graphics.drawable.Drawable;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.model.leafs.advisory.RatingDetails;

/* renamed from: o.dfP  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8172dfP {
    public static final SX a(InterfaceC5198buI interfaceC5198buI) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        SX sx = null;
        InterfaceC5221buf interfaceC5221buf = interfaceC5198buI instanceof InterfaceC5221buf ? (InterfaceC5221buf) interfaceC5198buI : null;
        RatingDetails n = interfaceC5221buf != null ? interfaceC5221buf.n() : null;
        if ((n != null ? n.getRatingValue() : null) != null) {
            sx = a(n);
        } else {
            c(interfaceC5198buI.e());
        }
        return sx == null ? c(interfaceC5198buI) : sx;
    }

    public static final SX d(TrailerItem trailerItem) {
        C8632dsu.c((Object) trailerItem, "");
        RatingDetails n = trailerItem.n();
        SX a = (n != null ? n.getRatingValue() : null) != null ? a(n) : null;
        return a == null ? new SX(null, null, null, 7, null) : a;
    }

    private static final SX a(RatingDetails ratingDetails) {
        C1332Xp c1332Xp = C1332Xp.b;
        Drawable b = ((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b(ratingDetails, true);
        if (b != null) {
            return new SX(ratingDetails.getRatingId(), b, null, ratingDetails.getRatingDescription(), 4, null);
        }
        if (ratingDetails.getRatingValue() != null) {
            return new SX(ratingDetails.getRatingId(), ratingDetails.getRatingValue(), ratingDetails.getRatingDescription());
        }
        return null;
    }

    private static final SX c(InterfaceC5183btu interfaceC5183btu) {
        String k = interfaceC5183btu.k();
        if (k != null && k.length() != 0) {
            return new SX(null, interfaceC5183btu.k(), null, 5, null);
        }
        return new SX(null, null, null, 7, null);
    }

    public static final SX a(InterfaceC5185btw interfaceC5185btw) {
        C8632dsu.c((Object) interfaceC5185btw, "");
        SX c = c(interfaceC5185btw.e());
        return c == null ? new SX(null, null, null, 7, null) : c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10, types: [o.SX] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [T] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final o.SX c(java.util.List<? extends com.netflix.model.leafs.advisory.Advisory> r13) {
        /*
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L93
            o.Xp r1 = o.C1332Xp.b
            java.lang.Class<o.aHr> r1 = o.InterfaceC1610aHr.class
            java.lang.Object r1 = o.C1332Xp.b(r1)
            o.aHr r1 = (o.InterfaceC1610aHr) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
        L1a:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r13.next()
            boolean r4 = r3 instanceof com.netflix.model.leafs.advisory.ContentAdvisory
            if (r4 == 0) goto L1a
            r2.add(r3)
            goto L1a
        L2c:
            java.util.Iterator r13 = r2.iterator()
        L30:
            boolean r3 = r13.hasNext()
            r4 = 0
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r13.next()
            com.netflix.model.leafs.advisory.ContentAdvisory r3 = (com.netflix.model.leafs.advisory.ContentAdvisory) r3
            r5 = 1
            android.graphics.drawable.Drawable r8 = r1.b(r3, r5)
            if (r8 == 0) goto L56
            java.lang.String r7 = r3.getRatingId()
            java.lang.String r10 = r3.getI18nRating()
            o.SX r3 = new o.SX
            r9 = 0
            r11 = 4
            r12 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L57
        L56:
            r3 = r4
        L57:
            if (r3 == 0) goto L30
            goto L5b
        L5a:
            r3 = r4
        L5b:
            r0.d = r3
            if (r3 != 0) goto L93
            java.util.Iterator r13 = r2.iterator()
        L63:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r13.next()
            com.netflix.model.leafs.advisory.ContentAdvisory r1 = (com.netflix.model.leafs.advisory.ContentAdvisory) r1
            java.lang.String r2 = r1.getRatingIconValue()
            if (r2 == 0) goto L8d
            o.C8632dsu.d(r2)
            boolean r3 = o.C8684dus.a(r2)
            if (r3 == 0) goto L7f
            goto L8d
        L7f:
            java.lang.String r3 = r1.getRatingId()
            java.lang.String r1 = r1.getI18nRating()
            o.SX r5 = new o.SX
            r5.<init>(r3, r2, r1)
            goto L8e
        L8d:
            r5 = r4
        L8e:
            if (r5 == 0) goto L63
            r4 = r5
        L91:
            r0.d = r4
        L93:
            T r13 = r0.d
            o.SX r13 = (o.SX) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8172dfP.c(java.util.List):o.SX");
    }
}
