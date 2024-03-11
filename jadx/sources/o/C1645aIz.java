package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.aIB;

/* renamed from: o.aIz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645aIz {
    public static final void a(Activity activity, drM<? super ServiceManager, dpR> drm) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) drm, "");
        aIB.e.d(activity).e(drm);
    }

    public static final void a(Fragment fragment, drM<? super ServiceManager, dpR> drm) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) drm, "");
        aIB.d dVar = aIB.e;
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        dVar.d(requireActivity).e(drm);
    }
}
