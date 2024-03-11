package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import o.C8569dql;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i, int i2) {
        List f;
        f = C8569dql.f(new Rect(0, 0, i, i2));
        view.setSystemGestureExclusionRects(f);
    }
}
