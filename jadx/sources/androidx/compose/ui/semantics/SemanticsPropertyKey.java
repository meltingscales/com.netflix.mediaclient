package androidx.compose.ui.semantics;

import o.C8627dsp;
import o.drX;
import o.dtC;

/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;
    private final drX<T, T, T> mergePolicy;
    private final String name;

    public final String getName() {
        return this.name;
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, drX<? super T, ? super T, ? extends T> drx) {
        this.name = str;
        this.mergePolicy = drx;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, drX drx, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? new drX<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // o.drX
            public final T invoke(T t, T t2) {
                return t == null ? t2 : t;
            }
        } : drx);
    }

    public SemanticsPropertyKey(String str, boolean z) {
        this(str, null, 2, null);
        this.isImportantForAccessibility = z;
    }

    public SemanticsPropertyKey(String str, boolean z, drX<? super T, ? super T, ? extends T> drx) {
        this(str, drx);
        this.isImportantForAccessibility = z;
    }

    public final T merge(T t, T t2) {
        return this.mergePolicy.invoke(t, t2);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, dtC<?> dtc, T t) {
        semanticsPropertyReceiver.set(this, t);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }
}
