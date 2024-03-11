package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

/* renamed from: o.Nc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058Nc {
    public static final void e(NetflixActivity netflixActivity) {
        new ArrayList().isEmpty();
        if (netflixActivity != null) {
            C9870yD.e(netflixActivity.getWindow().getDecorView());
        }
    }

    public static final void c(NetflixActivity netflixActivity) {
        if (netflixActivity != null) {
            C9870yD.b(netflixActivity.getWindow().getDecorView());
        }
    }

    public static final void d(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (aRD.e.e()) {
            Annotation[] annotations = netflixActivity.getClass().getAnnotations();
            C8632dsu.a(annotations, "");
            for (Annotation annotation : annotations) {
                if (annotation instanceof aIA) {
                    ((MS) C1642aIw.b(netflixActivity, MS.class)).a().d("ProfileScopedNetflixActivity: " + netflixActivity.getUiScreen());
                    return;
                }
            }
        }
    }
}
