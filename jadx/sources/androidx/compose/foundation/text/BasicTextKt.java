package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import java.util.List;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* renamed from: BasicText-VhcvRP8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m405BasicTextVhcvRP8(final java.lang.String r42, androidx.compose.ui.Modifier r43, androidx.compose.ui.text.TextStyle r44, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r45, int r46, boolean r47, int r48, int r49, androidx.compose.ui.graphics.ColorProducer r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m405BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, o.drM, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* renamed from: BasicText-RWo7tUw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m404BasicTextRWo7tUw(final androidx.compose.ui.text.AnnotatedString r50, androidx.compose.ui.Modifier r51, androidx.compose.ui.text.TextStyle r52, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r53, int r54, boolean r55, int r56, int r57, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r58, androidx.compose.ui.graphics.ColorProducer r59, androidx.compose.runtime.Composer r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m404BasicTextRWo7tUw(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, o.drM, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new drX<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final Long invoke(SaverScope saverScope, long j) {
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new drM<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // o.drM
            public /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }

    /* renamed from: textModifier-RWo7tUw  reason: not valid java name */
    private static final Modifier m406textModifierRWo7tUw(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, drM<? super TextLayoutResult, dpR> drm, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, drM<? super List<Rect>, dpR> drm2, SelectionController selectionController, ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, drm, i, z, i2, i3, list, drm2, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, drm, i, z, i2, i3, list, drm2, selectionController, colorProducer, null));
    }
}
