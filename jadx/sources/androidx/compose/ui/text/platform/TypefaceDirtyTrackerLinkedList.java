package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypefaceDirtyTrackerLinkedList {
    private final Object initial;
    private final TypefaceDirtyTrackerLinkedList next;
    private final State<Object> resolveResult;

    public TypefaceDirtyTrackerLinkedList(State<? extends Object> state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.resolveResult = state;
        this.next = typefaceDirtyTrackerLinkedList;
        this.initial = state.getValue();
    }

    public final Typeface getTypeface() {
        Object obj = this.initial;
        C8632dsu.d(obj);
        return (Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        return this.resolveResult.getValue() != this.initial || ((typefaceDirtyTrackerLinkedList = this.next) != null && typefaceDirtyTrackerLinkedList.isStaleResolvedFont());
    }
}
