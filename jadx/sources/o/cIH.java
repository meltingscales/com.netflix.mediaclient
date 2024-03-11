package o;

import android.app.Activity;
import android.view.ViewGroup;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* loaded from: classes4.dex */
public interface cIH {
    public static final e e = e.e;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public interface d {
        cIH q();
    }

    void b(cBA cba);

    void d(ViewGroup viewGroup, drM<? super cBO, dpR> drm);

    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e e = new e();

        private e() {
        }

        public final cIH e(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((d) EntryPointAccessors.fromActivity(activity, d.class)).q();
        }
    }
}
