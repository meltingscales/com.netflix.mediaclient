package androidx.window.layout;

import android.app.Activity;
import o.C8627dsp;
import o.C8632dsu;
import o.dyR;
import o.dyS;

/* loaded from: classes2.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        C8632dsu.c((Object) windowMetricsCalculator, "");
        C8632dsu.c((Object) windowBackend, "");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public dyS<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return dyR.d(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
