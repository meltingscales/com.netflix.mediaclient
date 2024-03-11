package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import o.C8632dsu;
import o.dsA;
import o.dyS;

/* loaded from: classes2.dex */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    dyS<WindowLayoutInfo> windowLayoutInfo(Activity activity);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = dsA.a(WindowInfoTracker.class).b();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            C8632dsu.c((Object) context, "");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.window.layout.WindowBackend windowBackend$window_release(android.content.Context r3) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r3, r0)
                androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE     // Catch: java.lang.Throwable -> L14
                androidx.window.extensions.layout.WindowLayoutComponent r0 = r0.getWindowLayoutComponent()     // Catch: java.lang.Throwable -> L14
                if (r0 != 0) goto Le
                goto L1f
            Le:
                androidx.window.layout.ExtensionWindowLayoutInfoBackend r1 = new androidx.window.layout.ExtensionWindowLayoutInfoBackend     // Catch: java.lang.Throwable -> L14
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L14
                goto L20
            L14:
                boolean r0 = androidx.window.layout.WindowInfoTracker.Companion.DEBUG
                if (r0 == 0) goto L1f
                java.lang.String r0 = androidx.window.layout.WindowInfoTracker.Companion.TAG
                java.lang.String r1 = "Failed to load WindowExtensions"
                android.util.Log.d(r0, r1)
            L1f:
                r1 = 0
            L20:
                if (r1 != 0) goto L28
                androidx.window.layout.SidecarWindowBackend$Companion r0 = androidx.window.layout.SidecarWindowBackend.Companion
                androidx.window.layout.SidecarWindowBackend r1 = r0.getInstance(r3)
            L28:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTracker.Companion.windowBackend$window_release(android.content.Context):androidx.window.layout.WindowBackend");
        }
    }
}
