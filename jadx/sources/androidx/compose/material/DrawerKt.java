package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8657dts;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class DrawerKt {
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = Dp.m2492constructorimpl(400);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(JSONzip.end, 0, null, 6, null);

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final drM<? super DrawerValue, Boolean> drm, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1435874229);
        if ((i2 & 2) != 0) {
            drm = new drM<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // o.drM
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:448)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(drm);
        composer.startReplaceableGroup(1903586313);
        boolean changed = composer.changed(drawerValue);
        boolean changedInstance = composer.changedInstance(drm);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changedInstance) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final DrawerState invoke() {
                    return new DrawerState(DrawerValue.this, drm);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.rememberSaveable(objArr, Saver, null, (drO) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /* renamed from: ModalDrawer-Gs3lGvM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m588ModalDrawerGs3lGvM(final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r34, androidx.compose.ui.Modifier r35, androidx.compose.material.DrawerState r36, boolean r37, androidx.compose.ui.graphics.Shape r38, float r39, long r40, long r42, long r44, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m588ModalDrawerGs3lGvM(o.dsa, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        float a;
        a = C8657dts.a((f3 - f) / (f2 - f), 0.0f, 1.0f);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc  reason: not valid java name */
    public static final void m589ScrimBx497Mc(final boolean z, final drO<dpR> dro, final drO<Float> dro2, final long j, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(dro) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(dro2) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:827)");
            }
            final String m657getString4foXLRw = Strings_androidKt.m657getString4foXLRw(Strings.Companion.m650getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            if (z) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1903601685);
                boolean changedInstance = startRestartGroup.changedInstance(dro);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(dro, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, dro, (drX) rememberedValue);
                startRestartGroup.startReplaceableGroup(1903601769);
                boolean changed = startRestartGroup.changed(m657getString4foXLRw);
                boolean changedInstance2 = startRestartGroup.changedInstance(dro);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed | changedInstance2) || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m657getString4foXLRw);
                            final drO<dpR> dro3 = dro;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new drO<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // o.drO
                                public final Boolean invoke() {
                                    dro3.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (drM) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
            startRestartGroup.startReplaceableGroup(1903602010);
            boolean changed2 = startRestartGroup.changed(j);
            boolean changedInstance3 = startRestartGroup.changedInstance(dro2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed2 | changedInstance3) || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new drM<DrawScope, dpR>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        DrawScope.m1557drawRectnJ9OG0$default(drawScope, j, 0L, 0L, dro2.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (drM) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    DrawerKt.m589ScrimBx497Mc(z, dro, dro2, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 56;
        EndDrawerPadding = Dp.m2492constructorimpl(f);
        DrawerPositionalThreshold = Dp.m2492constructorimpl(f);
    }
}
