package o;

import android.app.Activity;
import android.content.Context;
import dagger.hilt.android.EntryPointAccessors;

/* renamed from: o.aGw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588aGw {
    public static final bEX e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC1591aGz) EntryPointAccessors.fromActivity(activity, InterfaceC1591aGz.class)).j();
    }

    public static final bEY a(Context context) {
        C8632dsu.c((Object) context, "");
        return ((aGA) EntryPointAccessors.fromApplication(context, aGA.class)).z();
    }
}
