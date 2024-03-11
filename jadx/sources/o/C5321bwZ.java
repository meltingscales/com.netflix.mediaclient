package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import o.InterfaceC5378bxd;

/* renamed from: o.bwZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5321bwZ implements InterfaceC5378bxd {
    private final AdvisoryBoard c = AdvisoryBoard.BRAZIL;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
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
            if (r4 == 0) goto Lbf
            int r5 = r4.hashCode()
            switch(r5) {
                case 76: goto Lb3;
                case 1567: goto La8;
                case 1569: goto L9c;
                case 1571: goto L90;
                case 1573: goto L84;
                case 1575: goto L78;
                case 2091: goto L6c;
                case 64032: goto L60;
                case 64034: goto L52;
                case 64036: goto L44;
                case 64038: goto L36;
                case 64040: goto L28;
                default: goto L26;
            }
        L26:
            goto Lbf
        L28:
            java.lang.String r5 = "A18"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L32
            goto Lbf
        L32:
            int r4 = o.C5320bwY.a.i
            goto Lc0
        L36:
            java.lang.String r5 = "A16"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L40
            goto Lbf
        L40:
            int r4 = o.C5320bwY.a.h
            goto Lc0
        L44:
            java.lang.String r5 = "A14"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L4e
            goto Lbf
        L4e:
            int r4 = o.C5320bwY.a.f
            goto Lc0
        L52:
            java.lang.String r5 = "A12"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L5c
            goto Lbf
        L5c:
            int r4 = o.C5320bwY.a.g
            goto Lc0
        L60:
            java.lang.String r5 = "A10"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L69
            goto Lbf
        L69:
            int r4 = o.C5320bwY.a.j
            goto Lc0
        L6c:
            java.lang.String r5 = "AL"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L75
            goto Lbf
        L75:
            int r4 = o.C5320bwY.a.k
            goto Lc0
        L78:
            java.lang.String r5 = "18"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L81
            goto Lbf
        L81:
            int r4 = o.C5320bwY.a.e
            goto Lc0
        L84:
            java.lang.String r5 = "16"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L8d
            goto Lbf
        L8d:
            int r4 = o.C5320bwY.a.d
            goto Lc0
        L90:
            java.lang.String r5 = "14"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L99
            goto Lbf
        L99:
            int r4 = o.C5320bwY.a.b
            goto Lc0
        L9c:
            java.lang.String r5 = "12"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La5
            goto Lbf
        La5:
            int r4 = o.C5320bwY.a.a
            goto Lc0
        La8:
            java.lang.String r5 = "10"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lbf
            int r4 = o.C5320bwY.a.c
            goto Lc0
        Lb3:
            java.lang.String r5 = "L"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lbc
            goto Lbf
        Lbc:
            int r4 = o.C5320bwY.a.f13634o
            goto Lc0
        Lbf:
            r4 = -1
        Lc0:
            if (r4 <= 0) goto Lc6
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5321bwZ.a(android.content.Context, com.netflix.model.leafs.advisory.RatingDetails, boolean):android.graphics.drawable.Drawable");
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
