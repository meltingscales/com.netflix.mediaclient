package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.unit.Density;

/* loaded from: classes.dex */
public interface PlatformMagnifierFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: create-nHHXs2Y  reason: not valid java name */
    PlatformMagnifier mo150createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3);

    boolean getCanUpdateZoom();

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                if (Build.VERSION.SDK_INT == 28) {
                    return PlatformMagnifierFactoryApi28Impl.INSTANCE;
                }
                return PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
