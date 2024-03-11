package o;

import android.app.Activity;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* loaded from: classes4.dex */
public interface cWC {
    public static final c b = c.a;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public interface a {
        cWC z();
    }

    boolean c(UmaAlert umaAlert);

    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final cWC c(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((a) EntryPointAccessors.fromActivity(activity, a.class)).z();
        }
    }
}
