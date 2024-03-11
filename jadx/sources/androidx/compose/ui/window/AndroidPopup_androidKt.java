package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntRect;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new drO<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // o.drO
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:112:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Popup(final androidx.compose.ui.window.PopupPositionProvider r35, o.drO<o.dpR> r36, androidx.compose.ui.window.PopupProperties r37, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, o.drO, androidx.compose.ui.window.PopupProperties, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final drX<Composer, Integer, dpR> Popup$lambda$1(State<? extends drX<? super Composer, ? super Integer, dpR>> state) {
        return (drX) state.getValue();
    }
}
