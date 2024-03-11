package o;

import android.content.Context;

/* renamed from: o.Xu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1337Xu {
    public static final C1337Xu c = new C1337Xu();

    private final boolean b() {
        return false;
    }

    private C1337Xu() {
    }

    public static final boolean e(Context context, int i) {
        C8632dsu.c((Object) context, "");
        return c.b() && context.getSharedPreferences("NetflixCommon.debug", 0).getBoolean(context.getResources().getResourceName(i), false);
    }
}
