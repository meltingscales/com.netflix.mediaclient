package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    Object bringChildIntoView(drO<Rect> dro, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Rect calculateRectForParent(Rect rect);
}
