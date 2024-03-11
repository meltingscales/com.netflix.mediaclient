package androidx.compose.ui.tooling.preview;

import o.C8670due;
import o.dtQ;

/* loaded from: classes5.dex */
public interface PreviewParameterProvider<T> {
    dtQ<T> getValues();

    default int getCount() {
        int k;
        k = C8670due.k(getValues());
        return k;
    }
}
