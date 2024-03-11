package o;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.cSu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6068cSu {
    public static final e e = e.b;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.cSu$d */
    /* loaded from: classes4.dex */
    public interface d {
        InterfaceC6068cSu y();
    }

    static InterfaceC6068cSu c(Activity activity) {
        return e.d(activity);
    }

    MenuItem a(Menu menu);

    void a(String str, boolean z);

    boolean a();

    void c(String str);

    /* renamed from: o.cSu$e */
    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e b = new e();

        private e() {
        }

        public final InterfaceC6068cSu d(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((d) EntryPointAccessors.fromActivity(activity, d.class)).y();
        }
    }
}
