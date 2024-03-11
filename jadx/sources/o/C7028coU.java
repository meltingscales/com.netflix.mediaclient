package o;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import java.util.Map;

/* renamed from: o.coU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7028coU {
    public static final void c(bXD bxd, int i, Activity activity, InterfaceC5283bvo interfaceC5283bvo, FragmentManager fragmentManager) {
        Map<String, ? extends Object> b;
        C8632dsu.c((Object) bxd, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) fragmentManager, "");
        b = dqD.b(dpD.a("titleId", Integer.valueOf(i)));
        bxd.a("freeBrowseJoin", b, activity, interfaceC5283bvo, fragmentManager);
    }
}
