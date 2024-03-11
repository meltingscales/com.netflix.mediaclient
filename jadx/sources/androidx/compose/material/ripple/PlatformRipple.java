package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class PlatformRipple extends Ripple {
    public /* synthetic */ PlatformRipple(boolean z, float f, State state, C8627dsp c8627dsp) {
        this(z, f, state);
    }

    private PlatformRipple(boolean z, float f, State<Color> state) {
        super(z, f, state, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* renamed from: rememberUpdatedRippleInstance-942rkJo  reason: not valid java name */
    public RippleIndicationInstance mo702rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i) {
        composer.startReplaceableGroup(331259447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331259447, i, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:63)");
        }
        ViewGroup findNearestViewGroup = findNearestViewGroup(composer, (i >> 15) & 14);
        composer.startReplaceableGroup(1643267293);
        if (findNearestViewGroup.isInEditMode()) {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(interactionSource);
            boolean changed2 = composer.changed(this);
            Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CommonRippleIndicationInstance(z, f, state, state2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) rememberedValue;
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return commonRippleIndicationInstance;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1618982084);
        boolean changed3 = composer.changed(interactionSource);
        boolean changed4 = composer.changed(this);
        boolean changed5 = composer.changed(findNearestViewGroup);
        Object rememberedValue2 = composer.rememberedValue();
        if ((changed3 | changed4 | changed5) || rememberedValue2 == Composer.Companion.getEmpty()) {
            AndroidRippleIndicationInstance androidRippleIndicationInstance = new AndroidRippleIndicationInstance(z, f, state, state2, findNearestViewGroup, null);
            composer.updateRememberedValue(androidRippleIndicationInstance);
            rememberedValue2 = androidRippleIndicationInstance;
        }
        composer.endReplaceableGroup();
        AndroidRippleIndicationInstance androidRippleIndicationInstance2 = (AndroidRippleIndicationInstance) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidRippleIndicationInstance2;
    }

    private final ViewGroup findNearestViewGroup(Composer composer, int i) {
        composer.startReplaceableGroup(-1737891121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737891121, i, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:86)");
        }
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(consume instanceof ViewGroup)) {
            ViewParent parent = ((View) consume).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + consume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            consume = parent;
        }
        ViewGroup viewGroup = (ViewGroup) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewGroup;
    }
}
