package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new drO<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final TextStyle invoke() {
            return TypographyTokensKt.getDefaultTextStyle();
        }
    });

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m838Text4IGK_g(final java.lang.String r68, androidx.compose.ui.Modifier r69, long r70, long r72, androidx.compose.ui.text.font.FontStyle r74, androidx.compose.ui.text.font.FontWeight r75, androidx.compose.ui.text.font.FontFamily r76, long r77, androidx.compose.ui.text.style.TextDecoration r79, androidx.compose.ui.text.style.TextAlign r80, long r81, int r83, boolean r84, int r85, int r86, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r87, androidx.compose.ui.text.TextStyle r88, androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m838Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, o.drM, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* renamed from: Text-IbK3jfQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m839TextIbK3jfQ(final androidx.compose.ui.text.AnnotatedString r61, androidx.compose.ui.Modifier r62, long r63, long r65, androidx.compose.ui.text.font.FontStyle r67, androidx.compose.ui.text.font.FontWeight r68, androidx.compose.ui.text.font.FontFamily r69, long r70, androidx.compose.ui.text.style.TextDecoration r72, androidx.compose.ui.text.style.TextAlign r73, long r74, int r76, boolean r77, int r78, int r79, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r80, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r81, androidx.compose.ui.text.TextStyle r82, androidx.compose.runtime.Composer r83, final int r84, final int r85, final int r86) {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m839TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, o.drM, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:349)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(textStyle)), drx, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
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
                    TextKt.ProvideTextStyle(TextStyle.this, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
