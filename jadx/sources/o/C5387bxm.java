package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ContentAdvisoryIcon;
import java.util.ArrayList;
import java.util.List;
import o.C5320bwY;
import o.InterfaceC5378bxd;

/* renamed from: o.bxm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5387bxm implements InterfaceC5378bxd {
    private final AdvisoryBoard e = AdvisoryBoard.NICAM;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
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
            if (r4 == 0) goto L93
            int r5 = r4.hashCode()
            r1 = 54
            if (r5 == r1) goto L87
            r1 = 57
            if (r5 == r1) goto L7b
            r1 = 1569(0x621, float:2.199E-42)
            if (r5 == r1) goto L6f
            r1 = 1571(0x623, float:2.201E-42)
            if (r5 == r1) goto L63
            r1 = 1573(0x625, float:2.204E-42)
            if (r5 == r1) goto L57
            r1 = 1575(0x627, float:2.207E-42)
            if (r5 == r1) goto L4b
            r1 = 2091(0x82b, float:2.93E-42)
            if (r5 == r1) goto L40
            goto L93
        L40:
            java.lang.String r5 = "AL"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L93
            int r4 = o.C5320bwY.a.V
            goto L94
        L4b:
            java.lang.String r5 = "18"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L54
            goto L93
        L54:
            int r4 = o.C5320bwY.a.R
            goto L94
        L57:
            java.lang.String r5 = "16"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L60
            goto L93
        L60:
            int r4 = o.C5320bwY.a.O
            goto L94
        L63:
            java.lang.String r5 = "14"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6c
            goto L93
        L6c:
            int r4 = o.C5320bwY.a.S
            goto L94
        L6f:
            java.lang.String r5 = "12"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L78
            goto L93
        L78:
            int r4 = o.C5320bwY.a.K
            goto L94
        L7b:
            java.lang.String r5 = "9"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L84
            goto L93
        L84:
            int r4 = o.C5320bwY.a.Q
            goto L94
        L87:
            java.lang.String r5 = "6"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L90
            goto L93
        L90:
            int r4 = o.C5320bwY.a.P
            goto L94
        L93:
            r4 = -1
        L94:
            if (r4 <= 0) goto L9a
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5387bxm.a(android.content.Context, com.netflix.model.leafs.advisory.RatingDetails, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Drawable e(Context context, String str) {
        int i;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 54398:
                if (str.equals("707")) {
                    i = C5320bwY.a.M;
                    break;
                }
                i = -1;
                break;
            case 54399:
                if (str.equals("708")) {
                    i = C5320bwY.a.N;
                    break;
                }
                i = -1;
                break;
            case 54400:
                if (str.equals("709")) {
                    i = C5320bwY.a.f13633J;
                    break;
                }
                i = -1;
                break;
            default:
                switch (hashCode) {
                    case 54422:
                        if (str.equals("710")) {
                            i = C5320bwY.a.H;
                            break;
                        }
                        i = -1;
                        break;
                    case 54423:
                        if (str.equals("711")) {
                            i = C5320bwY.a.L;
                            break;
                        }
                        i = -1;
                        break;
                    case 54424:
                        if (str.equals("712")) {
                            i = C5320bwY.a.E;
                            break;
                        }
                        i = -1;
                        break;
                    default:
                        i = -1;
                        break;
                }
        }
        if (i > 0) {
            return context.getDrawable(i);
        }
        return null;
    }

    @Override // o.InterfaceC5378bxd
    public InterfaceC5396bxv d(Context context, ContentAdvisory contentAdvisory, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) contentAdvisory, "");
        Drawable e = InterfaceC5378bxd.a.e(this, context, contentAdvisory, false, 4, null);
        ArrayList arrayList = null;
        if (e != null) {
            LayoutInflater from = LayoutInflater.from(context);
            C8632dsu.a(from, "");
            C5394bxt c5394bxt = new C5394bxt(from, z);
            c5394bxt.d(e);
            List<ContentAdvisoryIcon> icons = contentAdvisory.getIcons();
            if (icons != null) {
                C8632dsu.d(icons);
                arrayList = new ArrayList();
                for (ContentAdvisoryIcon contentAdvisoryIcon : icons) {
                    String id = contentAdvisoryIcon.getId();
                    C8632dsu.a(id, "");
                    Drawable e2 = e(context, id);
                    if (e2 != null) {
                        arrayList.add(e2);
                    }
                }
            }
            c5394bxt.b(arrayList);
            c5394bxt.d(contentAdvisory.getI18nRating(), contentAdvisory.getI18nAdvisories());
            return c5394bxt;
        }
        return null;
    }
}
