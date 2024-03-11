package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public interface TextToolbar {
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, drO<dpR> dro, drO<dpR> dro2, drO<dpR> dro3, drO<dpR> dro4);
}
