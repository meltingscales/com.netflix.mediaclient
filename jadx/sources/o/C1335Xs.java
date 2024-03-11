package o;

import com.netflix.mediaclient.util.l10n.BidiMarker;
import kotlin.Pair;
import o.C1308Wr;

/* renamed from: o.Xs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1335Xs {
    public static final C1335Xs c = new C1335Xs();

    private C1335Xs() {
    }

    public final Pair<String, String> c(InterfaceC5160btX interfaceC5160btX) {
        String c2;
        String str;
        if (interfaceC5160btX == null || interfaceC5160btX.aI_() == null) {
            return new Pair<>("", "");
        }
        String aI_ = interfaceC5160btX.aI_();
        BidiMarker bidiMarker = BidiMarker.FORCED_RTL;
        String c3 = C8310dhv.c(aI_, bidiMarker);
        if (interfaceC5160btX.aY_()) {
            if (!interfaceC5160btX.aU_()) {
                c2 = C1333Xq.d(C1308Wr.d.g).d("seasonNumber", Integer.valueOf(interfaceC5160btX.x())).d("episodeNumber", Integer.valueOf(interfaceC5160btX.aw_())).d("episodeTitle", c3).c();
                C8632dsu.a(c2, "");
                str = C1333Xq.d(C1308Wr.d.f).d("seasonNumber", Integer.valueOf(interfaceC5160btX.x())).d("episodeNumber", Integer.valueOf(interfaceC5160btX.aw_())).d("episodeTitle", c3).c();
            } else {
                String c4 = C8310dhv.c(interfaceC5160btX.aC_(), bidiMarker);
                c2 = C1333Xq.d(C1308Wr.d.a).d("showTitle", c4).d("episodeName", c3).c();
                C8632dsu.a(c2, "");
                str = C1333Xq.d(C1308Wr.d.e).d("showTitle", c4).d("episodeTitle", c3).c();
            }
        } else {
            c2 = C1333Xq.d(C1308Wr.d.c).d("movieTitle", c3).c();
            C8632dsu.a(c2, "");
            str = null;
        }
        String obj = C8168dfL.c(c2).toString();
        if (str == null) {
            str = obj;
        }
        return new Pair<>(obj, str);
    }

    public final String b(InterfaceC5160btX interfaceC5160btX) {
        String aC_ = interfaceC5160btX != null ? interfaceC5160btX.aC_() : null;
        return aC_ == null ? "" : aC_;
    }
}
