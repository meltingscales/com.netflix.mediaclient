package o;

import com.netflix.mediaclient.util.l10n.BidiMarker;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class cBN {
    public static final cBN a = new cBN();

    private cBN() {
    }

    public final Pair<String, String> d(InterfaceC5160btX interfaceC5160btX) {
        String a2;
        String str;
        if (interfaceC5160btX == null || interfaceC5160btX.aI_() == null) {
            return new Pair<>("", "");
        }
        String aI_ = interfaceC5160btX.aI_();
        BidiMarker bidiMarker = BidiMarker.FORCED_RTL;
        String c = C8310dhv.c(aI_, bidiMarker);
        if (interfaceC5160btX.aY_()) {
            if (!interfaceC5160btX.aU_()) {
                String aL_ = interfaceC5160btX.aL_();
                C8632dsu.a(aL_, "");
                if (aL_.length() > 0) {
                    a2 = C8168dfL.a(com.netflix.mediaclient.ui.R.o.lM, interfaceC5160btX.aK_(), Integer.valueOf(interfaceC5160btX.aw_()), c);
                    C8632dsu.a(a2, "");
                    str = C1333Xq.d(com.netflix.mediaclient.ui.R.o.T).d("seasonLabel", interfaceC5160btX.aL_()).d("episodeNumber", Integer.valueOf(interfaceC5160btX.aw_())).d("episodeTitle", c).c();
                }
            }
            String c2 = C8310dhv.c(interfaceC5160btX.aC_(), bidiMarker);
            a2 = C8168dfL.a(com.netflix.mediaclient.ui.R.o.lO, c2, c);
            C8632dsu.a(a2, "");
            str = C1333Xq.d(com.netflix.mediaclient.ui.R.o.Q).d("showTitle", c2).d("episodeTitle", c).c();
        } else {
            a2 = C8168dfL.a(com.netflix.mediaclient.ui.R.o.lK, c);
            C8632dsu.a(a2, "");
            str = null;
        }
        String obj = C8168dfL.c(a2).toString();
        if (str == null) {
            str = obj;
        }
        return new Pair<>(obj, str);
    }
}
