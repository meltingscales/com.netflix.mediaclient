package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import o.InterfaceC5378bxd;

/* renamed from: o.bxi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5383bxi implements InterfaceC5378bxd {
    private final AdvisoryBoard e = AdvisoryBoard.KFCB;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[ORIG_RETURN, RETURN] */
    @Override // o.InterfaceC5378bxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Drawable a(android.content.Context r1, com.netflix.model.leafs.advisory.RatingDetails r2, boolean r3) {
        /*
            r0 = this;
            java.lang.String r3 = ""
            o.C8632dsu.c(r1, r3)
            o.C8632dsu.c(r2, r3)
            java.lang.String r2 = r2.getRatingId()
            if (r2 == 0) goto L52
            int r3 = r2.hashCode()
            switch(r3) {
                case 47774769: goto L46;
                case 47774770: goto L3a;
                case 47774771: goto L2e;
                case 47774772: goto L22;
                case 47774773: goto L16;
                default: goto L15;
            }
        L15:
            goto L52
        L16:
            java.lang.String r3 = "24205"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            goto L52
        L1f:
            int r2 = o.C5320bwY.a.aO
            goto L53
        L22:
            java.lang.String r3 = "24204"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            goto L52
        L2b:
            int r2 = o.C5320bwY.a.aQ
            goto L53
        L2e:
            java.lang.String r3 = "24203"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L52
        L37:
            int r2 = o.C5320bwY.a.aK
            goto L53
        L3a:
            java.lang.String r3 = "24202"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L43
            goto L52
        L43:
            int r2 = o.C5320bwY.a.aM
            goto L53
        L46:
            java.lang.String r3 = "24201"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            int r2 = o.C5320bwY.a.aN
            goto L53
        L52:
            r2 = -1
        L53:
            if (r2 <= 0) goto L5a
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            goto L5b
        L5a:
            r1 = 0
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5383bxi.a(android.content.Context, com.netflix.model.leafs.advisory.RatingDetails, boolean):android.graphics.drawable.Drawable");
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
