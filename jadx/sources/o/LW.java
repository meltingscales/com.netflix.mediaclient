package o;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.util.MathHelpersKt;
import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;

/* loaded from: classes3.dex */
public final class LW {
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02f2, code lost:
        if (r7.changed(r146) == false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r123, final o.drM<? super java.lang.String, o.dpR> r124, final com.netflix.hawkins.consumer.component.input.HawkinsInputSize r125, androidx.compose.ui.Modifier r126, boolean r127, boolean r128, androidx.compose.ui.text.TextStyle r129, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r130, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r131, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r132, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r133, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r134, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r135, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r136, boolean r137, androidx.compose.ui.text.input.VisualTransformation r138, androidx.compose.foundation.text.KeyboardOptions r139, androidx.compose.foundation.text.KeyboardActions r140, boolean r141, int r142, int r143, androidx.compose.foundation.interaction.MutableInteractionSource r144, androidx.compose.ui.graphics.Shape r145, o.LZ r146, androidx.compose.runtime.Composer r147, final int r148, final int r149, final int r150, final int r151) {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LW.b(java.lang.String, o.drM, com.netflix.hawkins.consumer.component.input.HawkinsInputSize, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, o.drX, o.drX, o.drX, o.drX, o.drX, o.drX, o.drX, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, o.LZ, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r36, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r37, final o.InterfaceC8612dsa<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r38, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r39, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r40, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r41, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r42, final boolean r43, final float r44, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r45, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r46, final androidx.compose.foundation.layout.PaddingValues r47, final com.netflix.hawkins.consumer.component.input.HawkinsInputSize r48, androidx.compose.ui.Modifier r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LW.a(o.drX, o.drX, o.dsa, o.drX, o.drX, o.drX, o.drX, boolean, float, o.drX, o.drX, androidx.compose.foundation.layout.PaddingValues, com.netflix.hawkins.consumer.component.input.HawkinsInputSize, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2, HawkinsInputSize hawkinsInputSize) {
        float g;
        int e;
        int e2;
        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m2538getZeronOccac(), 0.0f, 2, null);
        int c = i2 - C1033Ma.c(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                e = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), c);
            } else {
                if (hawkinsInputSize == HawkinsInputSize.b) {
                    g = LQ.b();
                } else {
                    g = LQ.g();
                }
                e = dsT.e(g * f2);
            }
            e2 = dsT.e((e - i3) * f);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, C1033Ma.b(placeable4), e - e2, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, C1033Ma.b(placeable4), i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - C1033Ma.b(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, null);
        }
        int b = C1033Ma.b(placeable4) + C1033Ma.b(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, b, i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, b, i4, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, c, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        int e;
        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m2538getZeronOccac(), 0.0f, 2, null);
        int c = i2 - C1033Ma.c(placeable8);
        e = dsT.e(paddingValues.mo251calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, C1033Ma.b(placeable3), c(z, c, e, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            int b = C1033Ma.b(placeable4);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - b) - placeable6.getWidth(), c(z, c, e, placeable6), 0.0f, 4, null);
        }
        int b2 = C1033Ma.b(placeable3) + C1033Ma.b(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, b2, c(z, c, e, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, b2, c(z, c, e, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, c, 0.0f, 4, null);
        }
    }

    private static final int c(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        int maxOf;
        int e;
        boolean z = i2 > 0;
        float m2492constructorimpl = androidx.compose.ui.unit.Dp.m2492constructorimpl(paddingValues.mo251calculateTopPaddingD9Ej5fM() + paddingValues.mo248calculateBottomPaddingD9Ej5fM()) * f2;
        if (z) {
            m2492constructorimpl = MathHelpersKt.lerp(androidx.compose.ui.unit.Dp.m2492constructorimpl(LQ.j() * 2) * f2, m2492constructorimpl, f);
        }
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(i, i7, i5, i6, MathHelpersKt.lerp(i2, 0, f));
        int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        e = dsT.e(m2492constructorimpl + MathHelpersKt.lerp(0, i2, f) + maxOf);
        return Math.max(m2474getMinHeightimpl, Math.max(i3, Math.max(i4, e)) + i8);
    }
}
