package o;

import com.netflix.mediaclient.service.player.StreamProfileType;

/* renamed from: o.bcS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4327bcS {
    public static final StreamProfileType c(String str) {
        boolean e;
        boolean e2;
        boolean e3;
        boolean e4;
        boolean e5;
        boolean e6;
        boolean e7;
        C8632dsu.c((Object) str, "");
        e = duD.e((CharSequence) str, (CharSequence) "live", true);
        if (e) {
            return StreamProfileType.f;
        }
        e2 = duD.e((CharSequence) str, (CharSequence) "av1", true);
        if (e2) {
            return StreamProfileType.e;
        }
        e3 = duD.e((CharSequence) str, (CharSequence) "hevc", true);
        if (e3) {
            return StreamProfileType.a;
        }
        e4 = duD.e((CharSequence) str, (CharSequence) "vp9", true);
        if (e4) {
            return StreamProfileType.d;
        }
        e5 = duD.e((CharSequence) str, (CharSequence) "h264hpl", true);
        if (e5) {
            return StreamProfileType.d;
        }
        e6 = duD.e((CharSequence) str, (CharSequence) "h264mpl", true);
        if (e6) {
            return StreamProfileType.c;
        }
        e7 = duD.e((CharSequence) str, (CharSequence) "cmaf", true);
        return e7 ? StreamProfileType.b : StreamProfileType.i;
    }
}
