package o;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonSize;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C8632dsu;
import o.LA;
import o.dpR;

/* loaded from: classes3.dex */
public final class KA {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[HawkinsButtonSize.values().length];
            try {
                iArr[HawkinsButtonSize.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HawkinsButtonSize.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HawkinsButtonSize.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r29, final long r30, final boolean r32, final o.drO<o.dpR> r33, final o.drO<o.dpR> r34, androidx.compose.ui.Modifier r35, com.netflix.hawkins.consumer.tokens.Theme r36, com.netflix.hawkins.consumer.component.button.HawkinsButtonSize r37, boolean r38, o.drO<o.dpR> r39, o.drO<o.dpR> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KA.b(java.lang.String, long, boolean, o.drO, o.drO, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, com.netflix.hawkins.consumer.component.button.HawkinsButtonSize, boolean, o.drO, o.drO, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r38, final long r39, final boolean r41, androidx.compose.ui.Modifier r42, com.netflix.hawkins.consumer.tokens.Theme r43, com.netflix.hawkins.consumer.component.button.HawkinsButtonSize r44, com.netflix.hawkins.consumer.icons.HawkinsIcon r45, com.netflix.hawkins.consumer.icons.HawkinsIcon r46, boolean r47, o.drO<o.dpR> r48, o.drO<o.dpR> r49, o.drO<o.dpR> r50, o.drO<o.dpR> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KA.a(java.lang.String, long, boolean, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, com.netflix.hawkins.consumer.component.button.HawkinsButtonSize, com.netflix.hawkins.consumer.icons.HawkinsIcon, com.netflix.hawkins.consumer.icons.HawkinsIcon, boolean, o.drO, o.drO, o.drO, o.drO, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final boolean r41, final java.lang.String r42, final long r43, final boolean r45, final com.netflix.hawkins.consumer.component.button.HawkinsButtonSize r46, final o.drO<o.dpR> r47, final o.drO<o.dpR> r48, final o.drO<o.dpR> r49, final o.drO<o.dpR> r50, final com.netflix.hawkins.consumer.tokens.Theme r51, androidx.compose.ui.Modifier r52, com.netflix.hawkins.consumer.icons.HawkinsIcon r53, com.netflix.hawkins.consumer.icons.HawkinsIcon r54, androidx.compose.foundation.interaction.MutableInteractionSource r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KA.e(boolean, java.lang.String, long, boolean, com.netflix.hawkins.consumer.component.button.HawkinsButtonSize, o.drO, o.drO, o.drO, o.drO, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.icons.HawkinsIcon, com.netflix.hawkins.consumer.icons.HawkinsIcon, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r33, final float r34, final boolean r35, final com.netflix.hawkins.consumer.component.button.HawkinsButtonSize r36, final o.drO<o.dpR> r37, final com.netflix.hawkins.consumer.tokens.Theme r38, androidx.compose.ui.Modifier r39, com.netflix.hawkins.consumer.icons.HawkinsIcon r40, com.netflix.hawkins.consumer.icons.HawkinsIcon r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KA.a(java.lang.String, float, boolean, com.netflix.hawkins.consumer.component.button.HawkinsButtonSize, o.drO, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.icons.HawkinsIcon, com.netflix.hawkins.consumer.icons.HawkinsIcon, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier e(Modifier modifier, final float f, final boolean z, final Theme theme, final boolean z2) {
        return DrawModifierKt.drawBehind(modifier, new drM<DrawScope, dpR>() { // from class: com.netflix.hawkins.consumer.component.button.HawkinsButtonCountdownKt$countdownProgressBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DrawScope drawScope) {
                e(drawScope);
                return dpR.c;
            }

            public final void e(DrawScope drawScope) {
                long d;
                long d2;
                long m1149getZeroF1C5BW0;
                C8632dsu.c((Object) drawScope, "");
                long mo1562getSizeNHjbRc = drawScope.mo1562getSizeNHjbRc();
                Path Path = AndroidPath_androidKt.Path();
                Offset.Companion companion = Offset.Companion;
                float f2 = 4;
                Path.addRoundRect(RoundRectKt.m1169RoundRectsniSvfs(RectKt.m1162Recttz77jQw(companion.m1149getZeroF1C5BW0(), SizeKt.Size(Size.m1176getWidthimpl(mo1562getSizeNHjbRc), Size.m1174getHeightimpl(mo1562getSizeNHjbRc))), CornerRadiusKt.CornerRadius(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f2)), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f2)))));
                boolean z3 = z;
                Theme theme2 = theme;
                float f3 = f;
                boolean z4 = z2;
                int m1283getIntersectrtfAjoo = ClipOp.Companion.m1283getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo1540clipPathmtrdDE(Path, m1283getIntersectrtfAjoo);
                long mo1562getSizeNHjbRc2 = drawScope.mo1562getSizeNHjbRc();
                if (z3) {
                    d = LA.d(Token.Color.C0437ay.e, theme2);
                } else {
                    d = LA.d(Token.Color.C0432at.c, theme2);
                }
                DrawScope.m1559drawRoundRectuAw5IA$default(drawScope, d, 0L, SizeKt.Size(Size.m1176getWidthimpl(mo1562getSizeNHjbRc2), Size.m1174getHeightimpl(mo1562getSizeNHjbRc2)), 0L, null, 0.0f, null, 0, 250, null);
                if (z3) {
                    d2 = LA.d(Token.Color.C0438az.d, theme2);
                } else {
                    d2 = LA.d(Token.Color.C0436ax.b, theme2);
                }
                long j = d2;
                float m1176getWidthimpl = (f3 / 100.0f) * Size.m1176getWidthimpl(mo1562getSizeNHjbRc2);
                if (z4) {
                    m1149getZeroF1C5BW0 = OffsetKt.Offset(Size.m1176getWidthimpl(mo1562getSizeNHjbRc2) - m1176getWidthimpl, 0.0f);
                } else {
                    m1149getZeroF1C5BW0 = companion.m1149getZeroF1C5BW0();
                }
                DrawScope.m1559drawRoundRectuAw5IA$default(drawScope, j, m1149getZeroF1C5BW0, SizeKt.Size(m1176getWidthimpl, Size.m1174getHeightimpl(mo1562getSizeNHjbRc2)), 0L, null, 0.0f, null, 0, 248, null);
                drawContext.getCanvas().restore();
                drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
            }
        });
    }

    private static final boolean c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == 0.0f || Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f) == 0.0f;
    }

    private static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
