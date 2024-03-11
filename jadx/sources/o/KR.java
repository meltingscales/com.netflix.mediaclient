package o;

import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C1027Lu;
import o.KP;

/* loaded from: classes3.dex */
public final class KR {
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ac, code lost:
        if (r6.changed(r59) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @android.annotation.SuppressLint({"ComposableLambdaParameterNaming"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final java.lang.String r46, final java.lang.String r47, final o.drM<? super java.lang.String, o.dpR> r48, androidx.compose.ui.Modifier r49, boolean r50, com.netflix.hawkins.consumer.icons.HawkinsIcon r51, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r52, o.KP r53, com.netflix.hawkins.consumer.component.input.HawkinsInputSize r54, androidx.compose.ui.text.input.VisualTransformation r55, androidx.compose.foundation.text.KeyboardOptions r56, androidx.compose.foundation.text.KeyboardActions r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, com.netflix.hawkins.consumer.tokens.Theme r59, java.lang.Integer r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KR.e(java.lang.String, java.lang.String, o.drM, androidx.compose.ui.Modifier, boolean, com.netflix.hawkins.consumer.icons.HawkinsIcon, o.drX, o.KP, com.netflix.hawkins.consumer.component.input.HawkinsInputSize, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.foundation.interaction.MutableInteractionSource, com.netflix.hawkins.consumer.tokens.Theme, java.lang.Integer, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final String c(String str, Integer num, Composer composer, int i) {
        String str2;
        Map c;
        composer.startReplaceableGroup(180790761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(180790761, i, -1, "com.netflix.hawkins.consumer.component.input.buildCharacterCount (HawkinsInput.kt:232)");
        }
        if (num == null || num.intValue() <= 0) {
            str2 = null;
        } else {
            String stringResource = StringResources_androidKt.stringResource(C1027Lu.b.a, composer, 0);
            c = dqE.c(dpD.a("counter", Integer.valueOf(str.length())), dpD.a("max", num));
            str2 = MessageFormat.format(stringResource, c);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str2;
    }

    private static final LZ b(Theme theme, KP kp, Composer composer, int i) {
        Token.Color color;
        Token.Color color2;
        composer.startReplaceableGroup(1908685420);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1908685420, i, -1, "com.netflix.hawkins.consumer.component.input.hawkinsTextInputColors (HawkinsInput.kt:245)");
        }
        boolean z = kp instanceof KP.c;
        if (z) {
            color = Token.Color.C0544ey.b;
        } else if (kp instanceof KP.a) {
            color = Token.Color.C0544ey.b;
        } else if (kp instanceof KP.e) {
            color = Token.Color.eD.b;
        } else if (kp instanceof KP.d) {
            color = Token.Color.eC.c;
        } else if (!(kp instanceof KP.b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            color = Token.Color.eB.d;
        }
        long d = LA.d(color, theme);
        if (z) {
            color2 = Token.Color.eE.b;
        } else if (kp instanceof KP.a) {
            color2 = Token.Color.eH.e;
        } else if (kp instanceof KP.e) {
            color2 = Token.Color.eF.d;
        } else if (kp instanceof KP.d) {
            color2 = Token.Color.eJ.c;
        } else if (!(kp instanceof KP.b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            color2 = Token.Color.eN.d;
        }
        long d2 = LA.d(color2, theme);
        LY ly = LY.b;
        Token.Color.eG eGVar = Token.Color.eG.b;
        long d3 = LA.d(eGVar, theme);
        long d4 = LA.d(eGVar, theme);
        Token.Color.eE eEVar = Token.Color.eE.b;
        long d5 = LA.d(eEVar, theme);
        long d6 = LA.d(eGVar, theme);
        long d7 = LA.d(eEVar, theme);
        long d8 = LA.d(eEVar, theme);
        Token.Color.C0545ez c0545ez = Token.Color.C0545ez.c;
        long d9 = LA.d(c0545ez, theme);
        Token.Color.eI eIVar = Token.Color.eI.e;
        long d10 = LA.d(eIVar, theme);
        long d11 = LA.d(c0545ez, theme);
        long d12 = LA.d(c0545ez, theme);
        long d13 = LA.d(c0545ez, theme);
        long d14 = LA.d(c0545ez, theme);
        long d15 = LA.d(c0545ez, theme);
        long d16 = LA.d(eIVar, theme);
        long d17 = LA.d(c0545ez, theme);
        long d18 = LA.d(c0545ez, theme);
        long d19 = LA.d(c0545ez, theme);
        long d20 = LA.d(eIVar, theme);
        long d21 = LA.d(c0545ez, theme);
        long d22 = LA.d(c0545ez, theme);
        Token.Color.C0561fo c0561fo = Token.Color.C0561fo.b;
        LZ c = ly.c(d17, d18, d16, d15, LA.d(c0561fo, theme), LA.d(c0561fo, theme), LA.d(c0561fo, theme), LA.d(c0561fo, theme), d13, d14, null, d, d, d4, d, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, d5, d8, d6, d7, 0L, 0L, 0L, 0L, d2, d2, d3, d2, d11, d12, d10, d9, d21, d22, d20, d19, composer, 0, 0, 0, 0, 3072, 2021622784, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
