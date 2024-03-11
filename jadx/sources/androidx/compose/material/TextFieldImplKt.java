package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class TextFieldImplKt {
    private static final Modifier IconDefaultSizeModifier;
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m2492constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m2492constructorimpl(12);

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommonDecorationBox(final androidx.compose.material.TextFieldType r38, final java.lang.String r39, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r40, final androidx.compose.ui.text.input.VisualTransformation r41, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r42, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r43, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r44, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r45, boolean r46, boolean r47, boolean r48, final androidx.compose.foundation.interaction.InteractionSource r49, final androidx.compose.foundation.layout.PaddingValues r50, final androidx.compose.material.TextFieldColors r51, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.CommonDecorationBox(androidx.compose.material.TextFieldType, java.lang.String, o.drX, androidx.compose.ui.text.input.VisualTransformation, o.drX, o.drX, o.drX, o.drX, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material.TextFieldColors, o.drX, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: Decoration-euL9pac  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m687DecorationeuL9pac(final long r13, androidx.compose.ui.text.TextStyle r15, java.lang.Float r16, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m687DecorationeuL9pac(long, androidx.compose.ui.text.TextStyle, java.lang.Float, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 48;
        IconDefaultSizeModifier = SizeKt.m286defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(f));
    }
}
