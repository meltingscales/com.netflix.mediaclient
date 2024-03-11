package o;

import android.content.Context;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;

/* renamed from: o.bxq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5391bxq implements InterfaceC5378bxd {
    private final AdvisoryBoard a = AdvisoryBoard.PEGI;

    public Void e(Context context, ContentAdvisory contentAdvisory, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) contentAdvisory, "");
        return null;
    }

    @Override // o.InterfaceC5378bxd
    public /* synthetic */ InterfaceC5396bxv d(Context context, ContentAdvisory contentAdvisory, boolean z) {
        return (InterfaceC5396bxv) e(context, contentAdvisory, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d A[ORIG_RETURN, RETURN] */
    @Override // o.InterfaceC5378bxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Drawable a(android.content.Context r2, com.netflix.model.leafs.advisory.RatingDetails r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r4 = ""
            o.C8632dsu.c(r2, r4)
            o.C8632dsu.c(r3, r4)
            java.lang.String r3 = r3.getRatingLevel()
            if (r3 == 0) goto L65
            int r4 = r3.hashCode()
            r0 = 1634(0x662, float:2.29E-42)
            if (r4 == r0) goto L59
            r0 = 1661(0x67d, float:2.328E-42)
            if (r4 == r0) goto L4d
            r0 = 1784(0x6f8, float:2.5E-42)
            if (r4 == r0) goto L41
            r0 = 48656(0xbe10, float:6.8182E-41)
            if (r4 == r0) goto L35
            r0 = 1507423(0x17005f, float:2.11235E-39)
            if (r4 == r0) goto L29
            goto L65
        L29:
            java.lang.String r4 = "1000"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            goto L65
        L32:
            int r3 = o.C5320bwY.a.aG
            goto L66
        L35:
            java.lang.String r4 = "110"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3e
            goto L65
        L3e:
            int r3 = o.C5320bwY.a.aD
            goto L66
        L41:
            java.lang.String r4 = "80"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4a
            goto L65
        L4a:
            int r3 = o.C5320bwY.a.aB
            goto L66
        L4d:
            java.lang.String r4 = "41"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L56
            goto L65
        L56:
            int r3 = o.C5320bwY.a.aF
            goto L66
        L59:
            java.lang.String r4 = "35"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L62
            goto L65
        L62:
            int r3 = o.C5320bwY.a.aC
            goto L66
        L65:
            r3 = -1
        L66:
            if (r3 <= 0) goto L6d
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            goto L6e
        L6d:
            r2 = 0
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5391bxq.a(android.content.Context, com.netflix.model.leafs.advisory.RatingDetails, boolean):android.graphics.drawable.Drawable");
    }
}
