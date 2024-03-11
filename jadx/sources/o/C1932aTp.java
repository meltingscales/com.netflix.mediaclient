package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.aTp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1932aTp {
    public static final C1932aTp b = new C1932aTp();

    private C1932aTp() {
    }

    public final SharedPreferences a(Context context) {
        C8632dsu.c((Object) context, "");
        return context.getSharedPreferences("com.netflix.android.jobscheduler", 0);
    }
}
