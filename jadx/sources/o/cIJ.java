package o;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.components.TranslateOrigin;

/* loaded from: classes4.dex */
public final class cIJ {
    private static final ExitTransition a;
    private static final EnterTransition b;
    private static final Easing c;
    private static final float e = androidx.compose.ui.unit.Dp.m2492constructorimpl(20);
    private static final TweenSpec<IntOffset> h = AnimationSpecKt.tween$default(300, 0, new Easing() { // from class: o.cIK
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float d2;
            d2 = cIJ.d(f);
            return d2;
        }
    }, 2, null);
    private static final TweenSpec<Float> d = AnimationSpecKt.tween$default(150, 0, null, 6, null);

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TranslateOrigin.values().length];
            try {
                iArr[TranslateOrigin.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranslateOrigin.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f) {
        return PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f).getInterpolation(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final com.netflix.mediaclient.ui.playercontrolscompose.impl.components.TranslateOrigin r17, final boolean r18, final boolean r19, androidx.compose.ui.Modifier r20, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cIJ.c(com.netflix.mediaclient.ui.playercontrolscompose.impl.components.TranslateOrigin, boolean, boolean, androidx.compose.ui.Modifier, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r16, final boolean r17, androidx.compose.ui.Modifier r18, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cIJ.a(boolean, boolean, androidx.compose.ui.Modifier, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f) {
        return PathInterpolatorCompat.create(0.0f, 0.5f, 0.1f, 1.0f).getInterpolation(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r15, final boolean r16, androidx.compose.ui.Modifier r17, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cIJ.d(androidx.compose.animation.core.MutableTransitionState, boolean, androidx.compose.ui.Modifier, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        Easing easing = new Easing() { // from class: o.cIN
            @Override // androidx.compose.animation.core.Easing
            public final float transform(float f) {
                float b2;
                b2 = cIJ.b(f);
                return b2;
            }
        };
        c = easing;
        b = EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(350, 0, easing, 2, null), new drM<Integer, Integer>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.AnimationsKt$PostPlayEnterTransition$1
            @Override // o.drM
            public /* synthetic */ Integer invoke(Integer num) {
                return c(num.intValue());
            }

            public final Integer c(int i) {
                return Integer.valueOf(i);
            }
        }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, easing, 2, null), 0.0f, 2, null));
        a = EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(350, 0, easing, 2, null), new drM<Integer, Integer>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.AnimationsKt$PostPlayExitTransition$1
            @Override // o.drM
            public /* synthetic */ Integer invoke(Integer num) {
                return b(num.intValue());
            }

            public final Integer b(int i) {
                return Integer.valueOf((int) (i * 0.8f));
            }
        }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(350, 0, easing, 2, null), 0.0f, 2, null));
    }
}
