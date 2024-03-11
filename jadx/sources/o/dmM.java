package o;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8576dqs;
import o.C8632dsu;
import o.dmM;
import o.dpR;
import o.drM;
import o.duS;

/* loaded from: classes5.dex */
public final class dmM {
    public static final dmM d = new dmM();
    private static final drM<Integer, Integer> a = new drM<Integer, Integer>() { // from class: com.slack.circuit.foundation.NavigatorDefaults$SlightlyRight$1
        public final Integer e(int i) {
            return Integer.valueOf((int) (i * 0.05f));
        }

        @Override // o.drM
        public /* synthetic */ Integer invoke(Integer num) {
            return e(num.intValue());
        }
    };
    private static final drM<Integer, Integer> e = new drM<Integer, Integer>() { // from class: com.slack.circuit.foundation.NavigatorDefaults$SlightlyLeft$1
        public final Integer e(int i) {
            return Integer.valueOf(0 - ((int) (i * 0.05f)));
        }

        @Override // o.drM
        public /* synthetic */ Integer invoke(Integer num) {
            return e(num.intValue());
        }
    };

    private dmM() {
    }

    /* loaded from: classes5.dex */
    public static final class c implements dmC {
        public static final c e = new c();

        private c() {
        }

        @Override // o.dmC
        public <T> void d(final duS<? extends T> dus, final int i, final Modifier modifier, final InterfaceC8612dsa<? super T, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i2) {
            int i3;
            C8632dsu.c((Object) dus, "");
            C8632dsu.c((Object) modifier, "");
            C8632dsu.c((Object) interfaceC8612dsa, "");
            Composer startRestartGroup = composer.startRestartGroup(-1151330937);
            if ((i2 & 14) == 0) {
                i3 = (startRestartGroup.changed(dus) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? JSONzip.end : 128;
            }
            if ((i2 & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
            }
            int i4 = i3;
            if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1151330937, i4, -1, "com.slack.circuit.foundation.NavigatorDefaults.DefaultDecoration.DecoratedContent (NavigableCircuitContent.kt:173)");
                }
                Object[] objArr = new Object[0];
                startRestartGroup.startReplaceableGroup(-1504418918);
                boolean changed = startRestartGroup.changed(i);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new drO<MutableState<Integer>>() { // from class: com.slack.circuit.foundation.NavigatorDefaults$DefaultDecoration$DecoratedContent$prevStackDepth$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.drO
                        /* renamed from: a */
                        public final MutableState<Integer> invoke() {
                            MutableState<Integer> mutableStateOf$default;
                            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, null, null, (drO) rememberedValue, startRestartGroup, 8, 6);
                final int intValue = i - ((Number) mutableState.getValue()).intValue();
                mutableState.setValue(Integer.valueOf(i));
                startRestartGroup.startReplaceableGroup(-1504418679);
                boolean changed2 = startRestartGroup.changed(intValue);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new drM<AnimatedContentTransitionScope<duS<? extends T>>, ContentTransform>() { // from class: com.slack.circuit.foundation.NavigatorDefaults$DefaultDecoration$DecoratedContent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: d */
                        public final ContentTransform invoke(AnimatedContentTransitionScope<duS<T>> animatedContentTransitionScope) {
                            ContentTransform contentTransform;
                            drM drm;
                            drM drm2;
                            drM drm3;
                            drM drm4;
                            C8632dsu.c((Object) animatedContentTransitionScope, "");
                            int i5 = intValue;
                            if (i5 > 0) {
                                TweenSpec tween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                                drm3 = dmM.a;
                                EnterTransition plus = EnterExitTransitionKt.slideInHorizontally(tween$default, drm3).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                                TweenSpec tween$default2 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                                drm4 = dmM.e;
                                contentTransform = AnimatedContentKt.togetherWith(plus, EnterExitTransitionKt.slideOutHorizontally(tween$default2, drm4).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
                            } else if (i5 < 0) {
                                TweenSpec tween$default3 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                                drm = dmM.e;
                                EnterTransition plus2 = EnterExitTransitionKt.slideInHorizontally(tween$default3, drm).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                                TweenSpec tween$default4 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                                drm2 = dmM.a;
                                contentTransform = AnimatedContentKt.togetherWith(plus2, EnterExitTransitionKt.slideOutHorizontally(tween$default4, drm2).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
                            } else {
                                contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            }
                            return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform$default(false, null, 2, null));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                AnimatedContentKt.AnimatedContent(dus, modifier, (drM) rememberedValue2, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2132810466, true, new InterfaceC8613dsb<AnimatedContentScope, duS<? extends T>, Composer, Integer, dpR>() { // from class: com.slack.circuit.foundation.NavigatorDefaults$DefaultDecoration$DecoratedContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(AnimatedContentScope animatedContentScope, Object obj, Composer composer2, Integer num) {
                        e(animatedContentScope, (duS) obj, composer2, num.intValue());
                        return dpR.c;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void e(AnimatedContentScope animatedContentScope, duS<? extends T> dus2, Composer composer2, int i5) {
                        Object y;
                        C8632dsu.c((Object) animatedContentScope, "");
                        C8632dsu.c((Object) dus2, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2132810466, i5, -1, "com.slack.circuit.foundation.NavigatorDefaults.DefaultDecoration.DecoratedContent.<anonymous> (NavigableCircuitContent.kt:203)");
                        }
                        y = C8576dqs.y(dus2);
                        interfaceC8612dsa.invoke(y, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), startRestartGroup, 1572864 | (i4 & 14) | ((i4 >> 3) & 112), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.slack.circuit.foundation.NavigatorDefaults$DefaultDecoration$DecoratedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(Composer composer2, int i5) {
                        dmM.c.this.d(dus, i, modifier, interfaceC8612dsa, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        a(composer2, num.intValue());
                        return dpR.c;
                    }
                });
            }
        }
    }
}
