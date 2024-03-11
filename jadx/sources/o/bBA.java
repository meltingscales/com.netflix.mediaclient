package o;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Pair;
import o.bAG;

/* loaded from: classes4.dex */
public final class bBA {
    public static final Pair<Integer, Integer> c() {
        if (C1860aQy.b.e().b()) {
            int i = bAG.e.v;
            C1332Xp c1332Xp = C1332Xp.b;
            return new Pair<>(Integer.valueOf(i), Integer.valueOf((int) TypedValue.applyDimension(1, 48, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        }
        int i2 = bAG.e.y;
        C1332Xp c1332Xp2 = C1332Xp.b;
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf((int) TypedValue.applyDimension(1, 18, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
    }

    public static final int b() {
        return C1860aQy.b.e().b() ? bAG.e.C : bAG.e.u;
    }
}
