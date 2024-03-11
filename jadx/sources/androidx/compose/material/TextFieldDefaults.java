package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
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

/* loaded from: classes5.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m2492constructorimpl(56);
    private static final float MinWidth = Dp.m2492constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m2492constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m2492constructorimpl(2);

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m679getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m680getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    private TextFieldDefaults() {
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m677textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m683textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m683textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m272PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m678textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m684textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m684textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m272PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m682textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(231892599);
        long m1292copywmQWz5c$default = (i4 & 1) != 0 ? Color.m1292copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1302unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m1292copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1292copywmQWz5c$default3 = (i4 & 4) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m565getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU() : j4;
        long m559getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m559getError0d7_KjU() : j5;
        long m1292copywmQWz5c$default4 = (i4 & 32) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m1292copywmQWz5c$default5 = (i4 & 64) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1292copywmQWz5c$default6 = (i4 & 128) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m559getError0d7_KjU2 = (i4 & JSONzip.end) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m559getError0d7_KjU() : j9;
        long m1292copywmQWz5c$default7 = (i4 & 512) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m1292copywmQWz5c$default8 = (i4 & 1024) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m1292copywmQWz5c$default7 : j12;
        long m1292copywmQWz5c$default9 = (i4 & 4096) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m1292copywmQWz5c$default10 = (i4 & 8192) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m559getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m559getError0d7_KjU() : j15;
        long m1292copywmQWz5c$default11 = (32768 & i4) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m1292copywmQWz5c$default12 = (65536 & i4) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m1292copywmQWz5c$default13 = (131072 & i4) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m559getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m559getError0d7_KjU() : j19;
        long m1292copywmQWz5c$default14 = (524288 & i4) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m1292copywmQWz5c$default15 = (i4 & 1048576) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m1292copywmQWz5c$default, m1292copywmQWz5c$default2, m565getPrimary0d7_KjU, m559getError0d7_KjU, m1292copywmQWz5c$default4, m1292copywmQWz5c$default5, m559getError0d7_KjU2, m1292copywmQWz5c$default6, m1292copywmQWz5c$default7, m1292copywmQWz5c$default8, j22, m1292copywmQWz5c$default9, m1292copywmQWz5c$default10, m559getError0d7_KjU3, m1292copywmQWz5c$default3, m1292copywmQWz5c$default11, m1292copywmQWz5c$default12, m1292copywmQWz5c$default13, m559getError0d7_KjU4, m1292copywmQWz5c$default14, m1292copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TextFieldDecorationBox(final java.lang.String r70, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r71, final boolean r72, final boolean r73, final androidx.compose.ui.text.input.VisualTransformation r74, final androidx.compose.foundation.interaction.InteractionSource r75, boolean r76, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r77, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r78, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r79, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r80, androidx.compose.material.TextFieldColors r81, androidx.compose.foundation.layout.PaddingValues r82, androidx.compose.runtime.Composer r83, final int r84, final int r85, final int r86) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, o.drX, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, o.drX, o.drX, o.drX, o.drX, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    public final Modifier m681indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m2490boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                State m686animateBorderStrokeAsStateNuRrP5Q;
                composer.startReplaceableGroup(1398930845);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:299)");
                }
                m686animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m686animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f, f2, composer, 0);
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, (BorderStroke) m686animateBorderStrokeAsStateNuRrP5Q.getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return drawIndicatorLine;
            }
        });
    }
}
