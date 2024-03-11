package o;

import android.app.Activity;
import com.netflix.mediaclient.android.app.Status;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.aIu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1640aIu {
    public static final b d = b.e;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.aIu$d */
    /* loaded from: classes3.dex */
    public interface d {
        InterfaceC1640aIu k();
    }

    static void a(Activity activity, Status status) {
        d.a(activity, status);
    }

    static void a(Activity activity, String str) {
        d.a(activity, str);
    }

    static void e(Activity activity, Status status) {
        d.d(activity, status);
    }

    static void e(Activity activity, Status status, boolean z) {
        d.c(activity, status, z);
    }

    static void e(Activity activity, String str, Runnable runnable, boolean z) {
        d.a(activity, str, runnable, z);
    }

    void a(String str, Runnable runnable, boolean z);

    void d(Status status);

    void d(Status status, boolean z);

    /* renamed from: o.aIu$b */
    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b e = new b();

        public final void a(Activity activity, Status status) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) status, "");
            a(this, activity, status, false, 4, null);
        }

        public final void a(Activity activity, String str) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) str, "");
            e(this, activity, str, null, false, 12, null);
        }

        private b() {
        }

        public final InterfaceC1640aIu e(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((d) EntryPointAccessors.fromActivity(activity, d.class)).k();
        }

        public static /* synthetic */ void a(b bVar, Activity activity, Status status, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            bVar.c(activity, status, z);
        }

        public final void c(Activity activity, Status status, boolean z) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) status, "");
            e(activity).d(status, z);
        }

        public final void d(Activity activity, Status status) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) status, "");
            e(activity).d(status);
        }

        public static /* synthetic */ void e(b bVar, Activity activity, String str, Runnable runnable, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                runnable = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            bVar.a(activity, str, runnable, z);
        }

        public final void a(Activity activity, String str, Runnable runnable, boolean z) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) str, "");
            e(activity).a(str, runnable, z);
        }
    }
}
