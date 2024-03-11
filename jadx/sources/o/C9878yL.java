package o;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import o.AbstractC1017Lk;
import o.C9869yC;
import o.C9872yF;
import o.dpR;
import o.drM;
import o.drO;

/* renamed from: o.yL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9878yL {
    public static final void d(final C9872yF c9872yF, final Modifier modifier, final String str, final HawkinsIcon hawkinsIcon, final String str2, final AbstractC1017Lk abstractC1017Lk, final Theme theme, final int i, boolean z, final drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) c9872yF, "");
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC1017Lk, "");
        C8632dsu.c((Object) theme, "");
        c9872yF.a(z, new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            public final void b() {
                drM<Boolean, dpR> drm2 = drm;
                if (drm2 != null) {
                    drm2.invoke(Boolean.FALSE);
                }
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-633735918, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return dpR.c;
            }

            public final void d(Composer composer, int i2) {
                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-633735918, i2, -1, "com.netflix.android.widgetry.utils.compose.showBottomToastWithTimeout.<anonymous> (HawkinsToastCompat.kt:43)");
                    }
                    AbstractC1017Lk abstractC1017Lk2 = AbstractC1017Lk.this;
                    if (abstractC1017Lk2 instanceof AbstractC1017Lk.a) {
                        composer.startReplaceableGroup(1928060711);
                        String d = ((AbstractC1017Lk.a) AbstractC1017Lk.this).d();
                        final AbstractC1017Lk abstractC1017Lk3 = AbstractC1017Lk.this;
                        final drM<Boolean, dpR> drm2 = drm;
                        final C9872yF c9872yF2 = c9872yF;
                        AbstractC1017Lk.a aVar = new AbstractC1017Lk.a(d, new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                e();
                                return dpR.c;
                            }

                            public final void e() {
                                ((AbstractC1017Lk.a) AbstractC1017Lk.this).e().invoke();
                                drM<Boolean, dpR> drm3 = drm2;
                                if (drm3 != null) {
                                    drm3.invoke(Boolean.TRUE);
                                }
                                c9872yF2.e();
                            }
                        });
                        EnterTransition plus = EnterExitTransitionKt.slideInVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.2
                            public final Integer b(int i3) {
                                return Integer.valueOf(i3);
                            }

                            @Override // o.drM
                            public /* synthetic */ Integer invoke(Integer num) {
                                return b(num.intValue());
                            }
                        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        ExitTransition plus2 = EnterExitTransitionKt.slideOutVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.3
                            public final Integer b(int i3) {
                                return Integer.valueOf(i3);
                            }

                            @Override // o.drM
                            public /* synthetic */ Integer invoke(Integer num) {
                                return b(num.intValue());
                            }
                        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        String str3 = str;
                        Modifier modifier2 = modifier;
                        HawkinsIcon hawkinsIcon2 = hawkinsIcon;
                        String str4 = str2;
                        Theme theme2 = theme;
                        int i3 = i;
                        final drM<Boolean, dpR> drm3 = drm;
                        final C9872yF c9872yF3 = c9872yF;
                        C9869yC.a(str3, modifier2, hawkinsIcon2, str4, aVar, theme2, i3, plus, plus2, new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                d();
                                return dpR.c;
                            }

                            public final void d() {
                                drM<Boolean, dpR> drm4 = drm3;
                                if (drm4 != null) {
                                    drm4.invoke(Boolean.FALSE);
                                }
                                c9872yF3.e();
                            }
                        }, composer, (AbstractC1017Lk.a.d << 12) | 113246208, 0);
                        composer.endReplaceableGroup();
                    } else if (abstractC1017Lk2 instanceof AbstractC1017Lk.b) {
                        composer.startReplaceableGroup(1928061676);
                        final AbstractC1017Lk abstractC1017Lk4 = AbstractC1017Lk.this;
                        final drM<Boolean, dpR> drm4 = drm;
                        final C9872yF c9872yF4 = c9872yF;
                        AbstractC1017Lk.b bVar = new AbstractC1017Lk.b(new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                c();
                                return dpR.c;
                            }

                            public final void c() {
                                ((AbstractC1017Lk.b) AbstractC1017Lk.this).a().invoke();
                                drM<Boolean, dpR> drm5 = drm4;
                                if (drm5 != null) {
                                    drm5.invoke(Boolean.TRUE);
                                }
                                c9872yF4.e();
                            }
                        });
                        EnterTransition plus3 = EnterExitTransitionKt.slideInVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.6
                            public final Integer d(int i4) {
                                return Integer.valueOf(i4);
                            }

                            @Override // o.drM
                            public /* synthetic */ Integer invoke(Integer num) {
                                return d(num.intValue());
                            }
                        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        ExitTransition plus4 = EnterExitTransitionKt.slideOutVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.7
                            public final Integer e(int i4) {
                                return Integer.valueOf(i4);
                            }

                            @Override // o.drM
                            public /* synthetic */ Integer invoke(Integer num) {
                                return e(num.intValue());
                            }
                        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        String str5 = str;
                        Modifier modifier3 = modifier;
                        HawkinsIcon hawkinsIcon3 = hawkinsIcon;
                        String str6 = str2;
                        Theme theme3 = theme;
                        int i4 = i;
                        final drM<Boolean, dpR> drm5 = drm;
                        final C9872yF c9872yF5 = c9872yF;
                        C9869yC.a(str5, modifier3, hawkinsIcon3, str6, bVar, theme3, i4, plus3, plus4, new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                c();
                                return dpR.c;
                            }

                            public final void c() {
                                drM<Boolean, dpR> drm6 = drm5;
                                if (drm6 != null) {
                                    drm6.invoke(Boolean.FALSE);
                                }
                                c9872yF5.e();
                            }
                        }, composer, (AbstractC1017Lk.b.c << 12) | 113246208, 0);
                        composer.endReplaceableGroup();
                    } else if (abstractC1017Lk2 instanceof AbstractC1017Lk.d) {
                        composer.startReplaceableGroup(1928062627);
                        final drM<Boolean, dpR> drm6 = drm;
                        final C9872yF c9872yF6 = c9872yF;
                        AbstractC1017Lk.d dVar = new AbstractC1017Lk.d(new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                b();
                                return dpR.c;
                            }

                            public final void b() {
                                drM<Boolean, dpR> drm7 = drm6;
                                if (drm7 != null) {
                                    drm7.invoke(Boolean.TRUE);
                                }
                                c9872yF6.e();
                            }
                        });
                        EnterTransition plus5 = EnterExitTransitionKt.slideInVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.10
                            public final Integer c(int i5) {
                                return Integer.valueOf(i5);
                            }

                            @Override // o.drM
                            public /* synthetic */ Integer invoke(Integer num) {
                                return c(num.intValue());
                            }
                        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        ExitTransition plus6 = EnterExitTransitionKt.slideOutVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.11
                            public final Integer e(int i5) {
                                return Integer.valueOf(i5);
                            }

                            @Override // o.drM
                            public /* synthetic */ Integer invoke(Integer num) {
                                return e(num.intValue());
                            }
                        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        String str7 = str;
                        Modifier modifier4 = modifier;
                        HawkinsIcon hawkinsIcon4 = hawkinsIcon;
                        String str8 = str2;
                        Theme theme4 = theme;
                        int i5 = i;
                        final drM<Boolean, dpR> drm7 = drm;
                        final C9872yF c9872yF7 = c9872yF;
                        C9869yC.a(str7, modifier4, hawkinsIcon4, str8, dVar, theme4, i5, plus5, plus6, new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsToastCompatKt$showBottomToastWithTimeout$2.12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                c();
                                return dpR.c;
                            }

                            public final void c() {
                                drM<Boolean, dpR> drm8 = drm7;
                                if (drm8 != null) {
                                    drm8.invoke(Boolean.FALSE);
                                }
                                c9872yF7.e();
                            }
                        }, composer, (AbstractC1017Lk.d.b << 12) | 113246208, 0);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(1928063486);
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }
}
