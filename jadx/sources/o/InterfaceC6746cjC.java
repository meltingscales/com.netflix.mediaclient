package o;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.cjC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6746cjC {
    public static final a c = a.c;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.cjC$b */
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC6746cjC m();
    }

    static InterfaceC6746cjC a(Activity activity) {
        return c.b(activity);
    }

    void b(String str, String str2, drM<? super LifecycleOwner, dpR> drm, drO<dpR> dro);

    LifecycleOwner e();

    /* renamed from: o.cjC$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a c = new a();

        private a() {
        }

        public final InterfaceC6746cjC b(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((b) EntryPointAccessors.fromActivity(activity, b.class)).m();
        }
    }
}
