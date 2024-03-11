package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;

/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(final java.lang.String r41, final o.drM<? super java.lang.String, o.dpR> r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, int r51, androidx.compose.ui.text.input.VisualTransformation r52, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.ui.graphics.Brush r55, o.InterfaceC8612dsa<? super o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, o.drM, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, o.drM, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, o.dsa, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r37, final o.drM<? super androidx.compose.ui.text.input.TextFieldValue, o.dpR> r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, o.InterfaceC8612dsa<? super o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, o.drM, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, o.drM, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, o.dsa, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
