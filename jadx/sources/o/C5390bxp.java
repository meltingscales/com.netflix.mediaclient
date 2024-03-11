package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import o.InterfaceC5378bxd;

/* renamed from: o.bxp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5390bxp implements InterfaceC5378bxd {
    private final AdvisoryBoard d = AdvisoryBoard.BBFC;

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC5378bxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Drawable a(android.content.Context r3, com.netflix.model.leafs.advisory.RatingDetails r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r5 = ""
            o.C8632dsu.c(r3, r5)
            o.C8632dsu.c(r4, r5)
            java.lang.String r4 = r4.getRatingValue()
            r0 = 0
            if (r4 == 0) goto L1c
            java.util.Locale r1 = java.util.Locale.US
            o.C8632dsu.a(r1, r5)
            java.lang.String r4 = r4.toUpperCase(r1)
            o.C8632dsu.a(r4, r5)
            goto L1d
        L1c:
            r4 = r0
        L1d:
            if (r4 == 0) goto L74
            int r5 = r4.hashCode()
            r1 = 85
            if (r5 == r1) goto L68
            r1 = 1569(0x621, float:2.199E-42)
            if (r5 == r1) goto L5c
            r1 = 1572(0x624, float:2.203E-42)
            if (r5 == r1) goto L50
            r1 = 1575(0x627, float:2.207E-42)
            if (r5 == r1) goto L44
            r1 = 2551(0x9f7, float:3.575E-42)
            if (r5 == r1) goto L38
            goto L74
        L38:
            java.lang.String r5 = "PG"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L41
            goto L74
        L41:
            int r4 = o.C5320bwY.a.y
            goto L75
        L44:
            java.lang.String r5 = "18"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L4d
            goto L74
        L4d:
            int r4 = o.C5320bwY.a.s
            goto L75
        L50:
            java.lang.String r5 = "15"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L59
            goto L74
        L59:
            int r4 = o.C5320bwY.a.p
            goto L75
        L5c:
            java.lang.String r5 = "12"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L65
            goto L74
        L65:
            int r4 = o.C5320bwY.a.q
            goto L75
        L68:
            java.lang.String r5 = "U"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L71
            goto L74
        L71:
            int r4 = o.C5320bwY.a.w
            goto L75
        L74:
            r4 = -1
        L75:
            if (r4 <= 0) goto L7b
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5390bxp.a(android.content.Context, com.netflix.model.leafs.advisory.RatingDetails, boolean):android.graphics.drawable.Drawable");
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
