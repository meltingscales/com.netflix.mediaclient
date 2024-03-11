package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(final boolean r23, androidx.compose.ui.Modifier r24, androidx.compose.animation.EnterTransition r25, androidx.compose.animation.ExitTransition r26, java.lang.String r27, final o.InterfaceC8612dsa<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r23, androidx.compose.ui.Modifier r24, androidx.compose.animation.EnterTransition r25, androidx.compose.animation.ExitTransition r26, java.lang.String r27, final o.InterfaceC8612dsa<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final <T> void AnimatedVisibilityImpl(final Transition<T> transition, final drM<? super T, Boolean> drm, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final InterfaceC8612dsa<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(429978603);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drm) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429978603, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:739)");
            }
            startRestartGroup.startReplaceableGroup(1276591712);
            boolean changedInstance = startRestartGroup.changedInstance(drm);
            boolean changed = startRestartGroup.changed(transition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m14invoke3p2s80s(measureScope, measurable, constraints.m2478unboximpl());
                    }

                    /* renamed from: invoke-3p2s80s  reason: not valid java name */
                    public final MeasureResult m14invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                        long IntSize;
                        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
                        if (measureScope.isLookingAhead() && !drm.invoke(transition.getTargetState()).booleanValue()) {
                            IntSize = IntSize.Companion.m2551getZeroYbymL2g();
                        } else {
                            IntSize = IntSizeKt.IntSize(mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight());
                        }
                        return MeasureScope.layout$default(measureScope, IntSize.m2547getWidthimpl(IntSize), IntSize.m2546getHeightimpl(IntSize), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedEnterExitImpl(transition, drm, LayoutModifierKt.layout(modifier, (InterfaceC8612dsa) rememberedValue), enterTransition, exitTransition, new drX<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // o.drX
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                }
            }, null, interfaceC8612dsa, startRestartGroup, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    AnimatedVisibilityKt.AnimatedVisibilityImpl(transition, drm, modifier, enterTransition, exitTransition, interfaceC8612dsa, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void AnimatedEnterExitImpl(final androidx.compose.animation.core.Transition<T> r20, final o.drM<? super T, java.lang.Boolean> r21, final androidx.compose.ui.Modifier r22, final androidx.compose.animation.EnterTransition r23, final androidx.compose.animation.ExitTransition r24, final o.drX<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean> r25, androidx.compose.animation.OnLookaheadMeasured r26, final o.InterfaceC8612dsa<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(androidx.compose.animation.core.Transition, o.drM, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, o.drX, androidx.compose.animation.OnLookaheadMeasured, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return currentState == enterExitState && transition.getTargetState() == enterExitState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, drM<? super T, Boolean> drm, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:889)");
        }
        composer.startMovableGroup(-721835388, transition);
        if (transition.isSeeking()) {
            if (drm.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (drm.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (drm.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (drm.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final drX<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$4(State<? extends drX<? super EnterExitState, ? super EnterExitState, Boolean>> state) {
        return (drX) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
