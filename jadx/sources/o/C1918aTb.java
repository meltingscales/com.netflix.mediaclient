package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.aTb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1918aTb {
    public static final C1918aTb a = new C1918aTb();

    private C1918aTb() {
    }

    public final long e(Context context, long j) {
        C8632dsu.c((Object) context, "");
        return a(context).getLong("insomnia_last_job_timestamp", j);
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.netflix.android.jobscheduler", 0);
        C8632dsu.a(sharedPreferences, "");
        return sharedPreferences;
    }
}
