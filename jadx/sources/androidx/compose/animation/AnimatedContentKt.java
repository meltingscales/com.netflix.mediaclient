package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import o.drX;

/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:135:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(final S r18, androidx.compose.ui.Modifier r19, o.drM<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r20, androidx.compose.ui.Alignment r21, java.lang.String r22, o.drM<? super S, ? extends java.lang.Object> r23, final o.InterfaceC8613dsb<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, o.drM, androidx.compose.ui.Alignment, java.lang.String, o.drM, o.dsb, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            drx = new drX<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // o.drX
                public /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m8invokeTemP2vQ(intSize.m2550unboximpl(), intSize2.m2550unboximpl());
                }

                /* renamed from: invoke-TemP2vQ  reason: not valid java name */
                public final SpringSpec<IntSize> m8invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
                }
            };
        }
        return SizeTransform(z, drx);
    }

    public static final SizeTransform SizeTransform(boolean z, drX<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> drx) {
        return new SizeTransformImpl(z, drx);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0242 A[LOOP:2: B:324:0x0240->B:325:0x0242, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(final androidx.compose.animation.core.Transition<S> r19, androidx.compose.ui.Modifier r20, o.drM<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r21, androidx.compose.ui.Alignment r22, o.drM<? super S, ? extends java.lang.Object> r23, final o.InterfaceC8613dsb<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, o.drM, androidx.compose.ui.Alignment, o.drM, o.dsb, androidx.compose.runtime.Composer, int, int):void");
    }
}
