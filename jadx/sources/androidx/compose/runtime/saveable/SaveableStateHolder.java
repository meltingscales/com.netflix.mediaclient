package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public interface SaveableStateHolder {
    void SaveableStateProvider(Object obj, drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i);

    void removeState(Object obj);
}
