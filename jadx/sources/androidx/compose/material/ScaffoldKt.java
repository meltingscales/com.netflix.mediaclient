package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class ScaffoldKt {
    private static final float FabSpacing;
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement;
    private static final MutableState ScaffoldSubcomposeInMeasureFix$delegate;

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01cd, code lost:
        if (r0.changed(r54) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    /* renamed from: Scaffold-u4IkXBM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m629Scaffoldu4IkXBM(final androidx.compose.foundation.layout.WindowInsets r39, androidx.compose.ui.Modifier r40, androidx.compose.material.ScaffoldState r41, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r42, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r43, o.InterfaceC8612dsa<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r44, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r45, int r46, boolean r47, o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r48, boolean r49, androidx.compose.ui.graphics.Shape r50, float r51, long r52, long r54, long r56, long r58, long r60, final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m629Scaffoldu4IkXBM(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, o.drX, o.drX, o.dsa, o.drX, int, boolean, o.dsa, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, o.dsa, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b1, code lost:
        if (r0.changed(r71) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01cb, code lost:
        if (r0.changed(r73) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /* renamed from: Scaffold-27mzLpw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m628Scaffold27mzLpw(androidx.compose.ui.Modifier r57, androidx.compose.material.ScaffoldState r58, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r59, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r60, o.InterfaceC8612dsa<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r61, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r62, int r63, boolean r64, o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r65, boolean r66, androidx.compose.ui.graphics.Shape r67, float r68, long r69, long r71, long r73, long r75, long r77, final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r79, androidx.compose.runtime.Composer r80, final int r81, final int r82, final int r83) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m628Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, o.drX, o.drX, o.dsa, o.drX, int, boolean, o.dsa, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, o.dsa, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        ScaffoldSubcomposeInMeasureFix$delegate = mutableStateOf$default;
        LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new drO<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final FabPlacement invoke() {
                return null;
            }
        });
        FabSpacing = Dp.m2492constructorimpl(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-i1QSOvI  reason: not valid java name */
    public static final void m630ScaffoldLayouti1QSOvI(final boolean z, final int i, final drX<? super Composer, ? super Integer, dpR> drx, final InterfaceC8612dsa<? super PaddingValues, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx2, final drX<? super Composer, ? super Integer, dpR> drx3, final WindowInsets windowInsets, final drX<? super Composer, ? super Integer, dpR> drx4, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-468424875);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i3 |= startRestartGroup.changedInstance(drx2) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i3 |= startRestartGroup.changedInstance(drx3) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((i2 & 3670016) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i3 |= startRestartGroup.changedInstance(drx4) ? 8388608 : 4194304;
        }
        if ((i3 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:409)");
            }
            if (getScaffoldSubcomposeInMeasureFix()) {
                startRestartGroup.startReplaceableGroup(-2103098080);
                m631ScaffoldLayoutWithMeasureFixi1QSOvI(z, i, drx, interfaceC8612dsa, drx2, drx3, windowInsets, drx4, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (3670016 & i3) | (i3 & 29360128));
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-2103097736);
                m627LegacyScaffoldLayouti1QSOvI(z, i, drx, interfaceC8612dsa, drx2, drx3, windowInsets, drx4, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (3670016 & i3) | (i3 & 29360128));
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1
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

                public final void invoke(Composer composer2, int i4) {
                    ScaffoldKt.m630ScaffoldLayouti1QSOvI(z, i, drx, interfaceC8612dsa, drx2, drx3, windowInsets, drx4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayoutWithMeasureFix-i1QSOvI  reason: not valid java name */
    public static final void m631ScaffoldLayoutWithMeasureFixi1QSOvI(final boolean z, final int i, final drX<? super Composer, ? super Integer, dpR> drx, final InterfaceC8612dsa<? super PaddingValues, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx2, final drX<? super Composer, ? super Integer, dpR> drx3, final WindowInsets windowInsets, final drX<? super Composer, ? super Integer, dpR> drx4, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1285900760);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(drx2) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(drx3) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(drx4) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285900760, i3, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix (Scaffold.kt:449)");
            }
            startRestartGroup.startReplaceableGroup(188870142);
            boolean changedInstance = startRestartGroup.changedInstance(drx);
            boolean changedInstance2 = startRestartGroup.changedInstance(drx2);
            boolean changed = startRestartGroup.changed(windowInsets);
            boolean changedInstance3 = startRestartGroup.changedInstance(drx3);
            boolean changed2 = startRestartGroup.changed(i);
            boolean changed3 = startRestartGroup.changed(z);
            boolean changedInstance4 = startRestartGroup.changedInstance(drx4);
            boolean changedInstance5 = startRestartGroup.changedInstance(interfaceC8612dsa);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | changedInstance2 | changed | changedInstance3 | changed2 | changed3 | changedInstance4) || changedInstance5) || rememberedValue == Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                drX<SubcomposeMeasureScope, Constraints, MeasureResult> drx5 = new drX<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m636invoke0kLqBqw(subcomposeMeasureScope, constraints.m2478unboximpl());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:109:0x0299  */
                    /* JADX WARN: Removed duplicated region for block: B:110:0x02a4  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x02a8  */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x02e7  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x02eb  */
                    /* JADX WARN: Removed duplicated region for block: B:128:0x0303  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x0340 A[LOOP:4: B:130:0x033e->B:131:0x0340, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:95:0x0252 A[LOOP:3: B:94:0x0250->B:95:0x0252, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x0268  */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x026a  */
                    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final androidx.compose.ui.layout.MeasureResult m636invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope r33, long r34) {
                        /*
                            Method dump skipped, instructions count: 899
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1.m636invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
                    }
                };
                composer2.updateRememberedValue(drx5);
                rememberedValue = drx5;
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (drX) rememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer3, int i4) {
                    ScaffoldKt.m631ScaffoldLayoutWithMeasureFixi1QSOvI(z, i, drx, interfaceC8612dsa, drx2, drx3, windowInsets, drx4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LegacyScaffoldLayout-i1QSOvI  reason: not valid java name */
    public static final void m627LegacyScaffoldLayouti1QSOvI(final boolean z, final int i, final drX<? super Composer, ? super Integer, dpR> drx, final InterfaceC8612dsa<? super PaddingValues, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx2, final drX<? super Composer, ? super Integer, dpR> drx3, final WindowInsets windowInsets, final drX<? super Composer, ? super Integer, dpR> drx4, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(141059468);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(drx2) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(drx3) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(drx4) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141059468, i3, -1, "androidx.compose.material.LegacyScaffoldLayout (Scaffold.kt:627)");
            }
            startRestartGroup.startReplaceableGroup(188877366);
            boolean changedInstance = startRestartGroup.changedInstance(drx);
            boolean changedInstance2 = startRestartGroup.changedInstance(drx2);
            boolean changed = startRestartGroup.changed(windowInsets);
            boolean changedInstance3 = startRestartGroup.changedInstance(drx3);
            boolean changed2 = startRestartGroup.changed(i);
            boolean changed3 = startRestartGroup.changed(z);
            boolean changedInstance4 = startRestartGroup.changedInstance(drx4);
            boolean changedInstance5 = startRestartGroup.changedInstance(interfaceC8612dsa);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | changedInstance2 | changed | changedInstance3 | changed2 | changed3 | changedInstance4) || changedInstance5) || rememberedValue == Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                drX<SubcomposeMeasureScope, Constraints, MeasureResult> drx5 = new drX<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m635invoke0kLqBqw(subcomposeMeasureScope, constraints.m2478unboximpl());
                    }

                    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                    public final MeasureResult m635invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
                        final int m2472getMaxHeightimpl = Constraints.m2472getMaxHeightimpl(j);
                        final long m2464copyZbe2FdA$default = Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final drX<Composer, Integer, dpR> drx6 = drx;
                        final drX<Composer, Integer, dpR> drx7 = drx2;
                        final drX<Composer, Integer, dpR> drx8 = drx3;
                        final int i4 = i;
                        final boolean z2 = z;
                        final WindowInsets windowInsets2 = windowInsets;
                        final drX<Composer, Integer, dpR> drx9 = drx4;
                        final InterfaceC8612dsa<PaddingValues, Composer, Integer, dpR> interfaceC8612dsa2 = interfaceC8612dsa;
                        return MeasureScope.layout$default(subcomposeMeasureScope, m2473getMaxWidthimpl, m2472getMaxHeightimpl, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return dpR.c;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:107:0x029a  */
                            /* JADX WARN: Removed duplicated region for block: B:108:0x02a5  */
                            /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
                            /* JADX WARN: Removed duplicated region for block: B:117:0x02ed  */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x02f1  */
                            /* JADX WARN: Removed duplicated region for block: B:125:0x0309  */
                            /* JADX WARN: Removed duplicated region for block: B:128:0x034a A[LOOP:4: B:127:0x0348->B:128:0x034a, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:131:0x0373 A[LOOP:5: B:130:0x0371->B:131:0x0373, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:134:0x038e A[LOOP:6: B:133:0x038c->B:134:0x038e, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:137:0x03b1 A[LOOP:7: B:136:0x03af->B:137:0x03b1, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:140:0x03d4  */
                            /* JADX WARN: Removed duplicated region for block: B:147:0x03fa  */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0254 A[LOOP:3: B:92:0x0252->B:93:0x0254, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:96:0x026a  */
                            /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope r32) {
                                /*
                                    Method dump skipped, instructions count: 1060
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1.AnonymousClass1.invoke2(androidx.compose.ui.layout.Placeable$PlacementScope):void");
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(drx5);
                rememberedValue = drx5;
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (drX) rememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer3, int i4) {
                    ScaffoldKt.m627LegacyScaffoldLayouti1QSOvI(z, i, drx, interfaceC8612dsa, drx2, drx3, windowInsets, drx4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final boolean getScaffoldSubcomposeInMeasureFix() {
        return ((Boolean) ScaffoldSubcomposeInMeasureFix$delegate.getValue()).booleanValue();
    }
}
