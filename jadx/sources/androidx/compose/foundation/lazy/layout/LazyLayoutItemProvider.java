package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;

/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    void Item(int i, Object obj, Composer composer, int i2);

    default Object getContentType(int i) {
        return null;
    }

    default int getIndex(Object obj) {
        return -1;
    }

    int getItemCount();

    default Object getKey(int i) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i);
    }
}
