package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import o.InterfaceC5378bxd;

/* renamed from: o.bxo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5389bxo implements InterfaceC5378bxd {
    private final AdvisoryBoard a = AdvisoryBoard.ZA;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[ORIG_RETURN, RETURN] */
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
            if (r3 == 0) goto L75
            int r4 = r3.hashCode()
            r0 = 1634(0x662, float:2.29E-42)
            if (r4 == r0) goto L69
            r0 = 1661(0x67d, float:2.328E-42)
            if (r4 == r0) goto L5d
            r0 = 1753(0x6d9, float:2.456E-42)
            if (r4 == r0) goto L51
            r0 = 1784(0x6f8, float:2.5E-42)
            if (r4 == r0) goto L45
            r0 = 48656(0xbe10, float:6.8182E-41)
            if (r4 == r0) goto L39
            r0 = 1507423(0x17005f, float:2.11235E-39)
            if (r4 == r0) goto L2d
            goto L75
        L2d:
            java.lang.String r4 = "1000"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L36
            goto L75
        L36:
            int r3 = o.C5320bwY.a.aT
            goto L76
        L39:
            java.lang.String r4 = "110"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L42
            goto L75
        L42:
            int r3 = o.C5320bwY.a.aS
            goto L76
        L45:
            java.lang.String r4 = "80"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4e
            goto L75
        L4e:
            int r3 = o.C5320bwY.a.aR
            goto L76
        L51:
            java.lang.String r4 = "70"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L5a
            goto L75
        L5a:
            int r3 = o.C5320bwY.a.aP
            goto L76
        L5d:
            java.lang.String r4 = "41"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L66
            goto L75
        L66:
            int r3 = o.C5320bwY.a.aU
            goto L76
        L69:
            java.lang.String r4 = "35"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L72
            goto L75
        L72:
            int r3 = o.C5320bwY.a.aV
            goto L76
        L75:
            r3 = -1
        L76:
            if (r3 <= 0) goto L7d
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            goto L7e
        L7d:
            r2 = 0
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5389bxo.a(android.content.Context, com.netflix.model.leafs.advisory.RatingDetails, boolean):android.graphics.drawable.Drawable");
    }

    @Override // o.InterfaceC5378bxd
    public InterfaceC5396bxv d(Context context, ContentAdvisory contentAdvisory, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) contentAdvisory, "");
        Drawable e = InterfaceC5378bxd.a.e(this, context, contentAdvisory, false, 4, null);
        if (e != null) {
            LayoutInflater from = LayoutInflater.from(context);
            C8632dsu.a(from, "");
            C5397bxw c5397bxw = new C5397bxw(from, z);
            c5397bxw.b(contentAdvisory.getSecondaryMessage());
            c5397bxw.b(e, contentAdvisory.getI18nRating());
            return c5397bxw;
        }
        return null;
    }
}
