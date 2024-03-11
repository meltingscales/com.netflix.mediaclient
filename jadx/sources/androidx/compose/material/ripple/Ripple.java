package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z, float f, State state, C8627dsp c8627dsp) {
        this(z, f, state);
    }

    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo702rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i);

    private Ripple(boolean z, float f, State<Color> state) {
        this.bounded = z;
        this.radius = f;
        this.color = state;
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i) {
        long mo701defaultColorWaAFU9c;
        composer.startReplaceableGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:115)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        composer.startReplaceableGroup(-1524341038);
        if (this.color.getValue().m1302unboximpl() != Color.Companion.m1309getUnspecified0d7_KjU()) {
            mo701defaultColorWaAFU9c = this.color.getValue().m1302unboximpl();
        } else {
            mo701defaultColorWaAFU9c = rippleTheme.mo701defaultColorWaAFU9c(composer, 0);
        }
        composer.endReplaceableGroup();
        RippleIndicationInstance mo702rememberUpdatedRippleInstance942rkJo = mo702rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(mo701defaultColorWaAFU9c), composer, 0), SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0), composer, (i & 14) | ((i << 12) & 458752));
        EffectsKt.LaunchedEffect(mo702rememberUpdatedRippleInstance942rkJo, interactionSource, new Ripple$rememberUpdatedInstance$1(interactionSource, mo702rememberUpdatedRippleInstance942rkJo, null), composer, ((i << 3) & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mo702rememberUpdatedRippleInstance942rkJo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ripple) {
            Ripple ripple = (Ripple) obj;
            return this.bounded == ripple.bounded && Dp.m2494equalsimpl0(this.radius, ripple.radius) && C8632dsu.c(this.color, ripple.color);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.bounded);
        return (((hashCode * 31) + Dp.m2495hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }
}
