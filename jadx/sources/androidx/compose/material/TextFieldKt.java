package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dsT;

/* loaded from: classes5.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m2492constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m2492constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m2492constructorimpl(2);

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b1, code lost:
        if (r0.changed(r116) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextField(final java.lang.String r103, final o.drM<? super java.lang.String, o.dpR> r104, androidx.compose.ui.Modifier r105, boolean r106, boolean r107, androidx.compose.ui.text.TextStyle r108, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r109, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r110, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r111, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r112, boolean r113, androidx.compose.ui.text.input.VisualTransformation r114, androidx.compose.foundation.text.KeyboardOptions r115, androidx.compose.foundation.text.KeyboardActions r116, boolean r117, int r118, int r119, androidx.compose.foundation.interaction.MutableInteractionSource r120, androidx.compose.ui.graphics.Shape r121, androidx.compose.material.TextFieldColors r122, androidx.compose.runtime.Composer r123, final int r124, final int r125, final int r126) {
        /*
            Method dump skipped, instructions count: 1607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, o.drM, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, o.drX, o.drX, o.drX, o.drX, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ad, code lost:
        if (r0.changed(r86) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void TextField(final java.lang.String r73, final o.drM r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, o.drX r79, o.drX r80, o.drX r81, o.drX r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, o.drM, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, o.drX, o.drX, o.drX, o.drX, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void TextFieldLayout(final Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, final drX<? super Composer, ? super Integer, dpR> drx2, final InterfaceC8612dsa<? super Modifier, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx3, final drX<? super Composer, ? super Integer, dpR> drx4, final boolean z, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        int i3;
        float c;
        float c2;
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(drx2) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(drx3) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(drx4) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:486)");
            }
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed(Boolean.valueOf(z));
            boolean changed2 = startRestartGroup.changed(Float.valueOf(f));
            boolean changed3 = startRestartGroup.changed(paddingValues);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
            Updater.m1013setimpl(m1009constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(254819939);
            if (drx3 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor2 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl2 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                drx3.invoke(startRestartGroup, Integer.valueOf((i2 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254820224);
            if (drx4 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor3 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl3 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                drx4.invoke(startRestartGroup, Integer.valueOf((i2 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (drx3 != null) {
                i3 = 0;
                c2 = C8657dts.c(Dp.m2492constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m2492constructorimpl(0));
                calculateStartPadding = Dp.m2492constructorimpl(c2);
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (drx4 != null) {
                c = C8657dts.c(Dp.m2492constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m2492constructorimpl(i3));
                calculateEndPadding = Dp.m2492constructorimpl(c);
            }
            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(companion2, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(254821235);
            if (interfaceC8612dsa != null) {
                interfaceC8612dsa.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m277paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i2 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254821364);
            if (drx2 != null) {
                Modifier then3 = LayoutIdKt.layoutId(companion2, "Label").then(m277paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor4 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(then3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl4 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl4.getInserting() || !C8632dsu.c(m1009constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1009constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1009constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                drx2.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(companion2, "TextField").then(m277paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor5 = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(then4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor5);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1009constructorimpl5 = Updater.m1009constructorimpl(startRestartGroup);
            Updater.m1013setimpl(m1009constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl5.getInserting() || !C8632dsu.c(m1009constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m1009constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m1009constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            modifierMaterializerOf5.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            drx.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
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
                    TextFieldKt.TextFieldLayout(Modifier.this, drx, drx2, interfaceC8612dsa, drx3, drx4, z, f, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m694calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m2475getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw  reason: not valid java name */
    public static final int m693calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        int e;
        float f2 = TextFieldTopPadding;
        float mo251calculateTopPaddingD9Ej5fM = paddingValues.mo251calculateTopPaddingD9Ej5fM();
        float mo248calculateBottomPaddingD9Ej5fM = paddingValues.mo248calculateBottomPaddingD9Ej5fM() * f;
        int max = Math.max(i, i5);
        e = dsT.e(z ? i2 + (f2 * f) + max + mo248calculateBottomPaddingD9Ej5fM : (mo251calculateTopPaddingD9Ej5fM * f) + max + mo248calculateBottomPaddingD9Ej5fM);
        return Math.max(e, Math.max(Math.max(i3, i4), Constraints.m2474getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int e;
        int e2;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                e = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                e = dsT.e(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            e2 = dsT.e((e - i3) * f);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), e - e2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int e;
        e = dsT.e(paddingValues.mo251calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2) : e, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                e = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), e, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke borderStroke) {
        final float m123getWidthD9Ej5fM = borderStroke.m123getWidthD9Ej5fM();
        return DrawModifierKt.drawWithContent(modifier, new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                if (Dp.m2494equalsimpl0(m123getWidthD9Ej5fM, Dp.Companion.m2499getHairlineD9Ej5fM())) {
                    return;
                }
                float density = m123getWidthD9Ej5fM * contentDrawScope.getDensity();
                float m1174getHeightimpl = Size.m1174getHeightimpl(contentDrawScope.mo1562getSizeNHjbRc()) - (density / 2);
                DrawScope.m1550drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, m1174getHeightimpl), OffsetKt.Offset(Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc()), m1174getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }
}
