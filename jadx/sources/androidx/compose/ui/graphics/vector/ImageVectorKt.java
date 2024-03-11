package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ImageVectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }
}
