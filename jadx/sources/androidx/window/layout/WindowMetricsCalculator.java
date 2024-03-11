package androidx.window.layout;

import android.app.Activity;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    WindowMetrics computeMaximumWindowMetrics(Activity activity);

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static drM<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = new drM<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // o.drM
            public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
                C8632dsu.c((Object) windowMetricsCalculator, "");
                return windowMetricsCalculator;
            }
        };

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }
    }
}
