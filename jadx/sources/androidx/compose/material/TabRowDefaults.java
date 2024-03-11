package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;
import org.chromium.net.NetError;

/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m2492constructorimpl(1);
    private static final float IndicatorHeight = Dp.m2492constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m2492constructorimpl(52);

    /* renamed from: getIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m673getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    private TabRowDefaults() {
    }

    /* renamed from: Divider-9IZ8Weo  reason: not valid java name */
    public final void m671Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        Object obj;
        int i3;
        float f2;
        long j2;
        final Object obj2;
        final float f3;
        final long j3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = JSONzip.end;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                obj2 = i6 != 0 ? Modifier.Companion : obj;
                if ((i2 & 2) != 0) {
                    f3 = DividerThickness;
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    j2 = Color.m1292copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1302unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                obj2 = obj;
                f3 = f2;
            }
            long j4 = j2;
            int i7 = i3;
            j3 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910934799, i7, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:371)");
            }
            DividerKt.m586DivideroMI9zvI(obj2, j3, f3, 0.0f, startRestartGroup, (i7 & 14) | ((i7 >> 3) & 112) | ((i7 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            obj2 = obj;
            f3 = f2;
            j3 = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
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

                public final void invoke(Composer composer2, int i8) {
                    TabRowDefaults.this.m671Divider9IZ8Weo(obj2, f3, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: Indicator-9IZ8Weo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m672Indicator9IZ8Weo(androidx.compose.ui.Modifier r17, float r18, long r19, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.m672Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition tabPosition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(TabPosition.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-398757863);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-398757863, i, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:412)");
                }
                State<Dp> m53animateDpAsStateAjpBEmI = AnimateAsStateKt.m53animateDpAsStateAjpBEmI(TabPosition.this.m670getWidthD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
                Modifier m300width3ABfNKs = SizeKt.m300width3ABfNKs(OffsetKt.m254offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null), invoke$lambda$1(AnimateAsStateKt.m53animateDpAsStateAjpBEmI(TabPosition.this.m668getLeftD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12)), 0.0f, 2, null), invoke$lambda$0(m53animateDpAsStateAjpBEmI));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return m300width3ABfNKs;
            }

            private static final float invoke$lambda$0(State<Dp> state) {
                return state.getValue().m2498unboximpl();
            }

            private static final float invoke$lambda$1(State<Dp> state) {
                return state.getValue().m2498unboximpl();
            }
        });
    }
}
