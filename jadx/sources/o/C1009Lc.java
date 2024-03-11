package o;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* renamed from: o.Lc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1009Lc {

    /* renamed from: o.Lc$d */
    /* loaded from: classes3.dex */
    public static final class d implements RippleTheme {
        final /* synthetic */ KZ b;

        d(KZ kz) {
            this.b = kz;
        }

        @Override // androidx.compose.material.ripple.RippleTheme
        /* renamed from: defaultColor-WaAFU9c */
        public long mo701defaultColorWaAFU9c(Composer composer, int i) {
            composer.startReplaceableGroup(-1107812720);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1107812720, i, -1, "com.netflix.hawkins.consumer.component.ripple.hawkinsRippleTheme.<no name provided>.defaultColor (HawkinsRipple.kt:11)");
            }
            long b = this.b.b();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return b;
        }

        @Override // androidx.compose.material.ripple.RippleTheme
        public RippleAlpha rippleAlpha(Composer composer, int i) {
            composer.startReplaceableGroup(-470114389);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-470114389, i, -1, "com.netflix.hawkins.consumer.component.ripple.hawkinsRippleTheme.<no name provided>.rippleAlpha (HawkinsRipple.kt:14)");
            }
            RippleAlpha rippleAlpha = new RippleAlpha(0.16f, this.b.a(), 0.08f, this.b.a());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return rippleAlpha;
        }
    }

    public static final RippleTheme b(KZ kz) {
        C8632dsu.c((Object) kz, "");
        return new d(kz);
    }
}
