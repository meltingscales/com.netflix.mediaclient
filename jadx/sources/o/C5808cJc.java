package o;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import o.C8632dsu;
import o.C8657dts;
import o.dpR;

/* renamed from: o.cJc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5808cJc {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final boolean r20, final boolean r21, final o.drM<? super o.cJC, o.dpR> r22, androidx.compose.ui.Modifier r23, o.drM<? super androidx.compose.ui.Modifier, ? extends androidx.compose.ui.Modifier> r24, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5808cJc.c(boolean, boolean, o.drM, androidx.compose.ui.Modifier, o.drM, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final boolean r23, final boolean r24, final o.drO<o.dpR> r25, final o.drO<o.dpR> r26, final o.drO<o.dpR> r27, final o.drO<o.dpR> r28, final o.drO<o.dpR> r29, final o.drM<? super androidx.compose.ui.Modifier, ? extends androidx.compose.ui.Modifier> r30, androidx.compose.ui.Modifier r31, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5808cJc.e(boolean, boolean, o.drO, o.drO, o.drO, o.drO, o.drO, o.drM, androidx.compose.ui.Modifier, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Modifier a(Modifier modifier) {
        List j;
        C8632dsu.c((Object) modifier, "");
        cIR cir = cIR.a;
        j = C8569dql.j(Color.m1284boximpl(cir.a()), Color.m1284boximpl(cir.e()), Color.m1284boximpl(cir.a()));
        return e(modifier, j, 270.0f);
    }

    private static final Modifier e(Modifier modifier, final List<Color> list, final float f) {
        return modifier.then(DrawModifierKt.drawBehind(Modifier.Companion, new drM<DrawScope, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTappableContainerKt$customGradientBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DrawScope drawScope) {
                b(drawScope);
                return dpR.c;
            }

            public final void b(DrawScope drawScope) {
                float c;
                float c2;
                C8632dsu.c((Object) drawScope, "");
                double d = (f / 180.0f) * 3.141592653589793d;
                float cos = (float) Math.cos(d);
                double d2 = 2;
                float sqrt = ((float) Math.sqrt(((float) Math.pow(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()), d2)) + ((float) Math.pow(Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()), d2)))) / 2.0f;
                long m1142plusMKHz9U = Offset.m1142plusMKHz9U(drawScope.mo1561getCenterF1C5BW0(), OffsetKt.Offset(cos * sqrt, ((float) Math.sin(d)) * sqrt));
                c = C8657dts.c(Offset.m1137getXimpl(m1142plusMKHz9U), 0.0f);
                float min = Math.min(c, Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()));
                float m1174getHeightimpl = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc());
                c2 = C8657dts.c(Offset.m1138getYimpl(m1142plusMKHz9U), 0.0f);
                long Offset = OffsetKt.Offset(min, m1174getHeightimpl - Math.min(c2, Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc())));
                DrawScope.m1556drawRectAsUm42w$default(drawScope, Brush.Companion.m1266linearGradientmHitzGk$default(Brush.Companion, list, Offset.m1141minusMKHz9U(OffsetKt.Offset(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()), Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc())), Offset), Offset, 0, 8, null), 0L, drawScope.mo1562getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final drO<dpR> c(State<? extends drO<dpR>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final drO<dpR> b(State<? extends drO<dpR>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }
}
