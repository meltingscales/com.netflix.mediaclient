package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Button(final o.drO<o.dpR> r37, androidx.compose.ui.Modifier r38, boolean r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.material.ButtonElevation r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.foundation.BorderStroke r43, androidx.compose.material.ButtonColors r44, androidx.compose.foundation.layout.PaddingValues r45, final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(o.drO, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void TextButton(drO<dpR> dro, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, InterfaceC8612dsa<? super RowScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(288797557);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        CornerBasedShape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        ButtonColors m555textButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m555textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i2 & JSONzip.end) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i, -1, "androidx.compose.material.TextButton (Button.kt:231)");
        }
        Button(dro, companion, z2, mutableInteractionSource2, buttonElevation2, small, borderStroke2, m555textButtonColorsRGew2ao, textButtonContentPadding, interfaceC8612dsa, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m1302unboximpl();
    }
}
