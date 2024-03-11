package o;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.deZ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8129deZ extends C1045Mp {
    public static final C8129deZ a = new C8129deZ();

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.deZ$a */
    /* loaded from: classes5.dex */
    public interface a {
        bZN g();
    }

    private C8129deZ() {
        super("LocalDiscoveryConsentAccess");
    }

    public static final boolean d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return a(activity).b();
    }

    public static final void d(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        bZN a2 = a(netflixActivity);
        C9872yF c9872yF = netflixActivity.composeViewOverlayManager;
        C8632dsu.a(c9872yF, "");
        netflixActivity.displayDialog(a2.c(c9872yF));
    }

    public static final boolean b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return a(activity).e();
    }

    private static final bZN a(Activity activity) {
        return ((a) EntryPointAccessors.fromActivity(activity, a.class)).g();
    }
}
