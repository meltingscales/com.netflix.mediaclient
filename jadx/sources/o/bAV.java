package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import kotlin.Pair;
import o.bAG;

/* loaded from: classes4.dex */
public final class bAV {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[CollectTaste.MessageType.values().length];
            try {
                iArr[CollectTaste.MessageType.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollectTaste.MessageType.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    public static final int e(boolean z) {
        return z ? bAG.e.q : bAG.e.t;
    }

    public static final int e() {
        return C1860aQy.b.e().b() ? bAG.e.d : bAG.e.a;
    }

    public static final int d() {
        return C1860aQy.b.e().b() ? bAG.e.b : bAG.e.c;
    }

    public static final int c() {
        return C1860aQy.b.e().b() ? bAG.e.m : bAG.e.f13489o;
    }

    public static final int a() {
        return C1860aQy.b.e().b() ? bAG.e.n : bAG.e.l;
    }

    public static final String d(boolean z, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        String c = C1333Xq.d(z ? bAG.e.s : bAG.e.r).d(SignupConstants.Field.VIDEO_TITLE, str).d("rated_title", str2).c();
        C8632dsu.a(c, "");
        return c;
    }

    public static final Pair<Integer, Integer> e(CollectTaste.MessageType messageType) {
        C8632dsu.c((Object) messageType, "");
        int i = e.e[messageType.ordinal()];
        if (i == 1) {
            return new Pair<>(Integer.valueOf(bAG.e.h), Integer.valueOf(bAG.e.g));
        } else if (i == 2) {
            return new Pair<>(Integer.valueOf(bAG.e.k), Integer.valueOf(bAG.e.j));
        } else {
            return new Pair<>(Integer.valueOf(bAG.e.i), Integer.valueOf(bAG.e.f));
        }
    }
}
