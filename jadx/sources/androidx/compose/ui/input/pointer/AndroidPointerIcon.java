package androidx.compose.ui.input.pointer;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidPointerIcon implements PointerIcon {
    private final android.view.PointerIcon pointerIcon;

    public final android.view.PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(AndroidPointerIcon.class, obj != null ? obj.getClass() : null)) {
            C8632dsu.d(obj);
            return C8632dsu.c(this.pointerIcon, ((AndroidPointerIcon) obj).pointerIcon);
        }
        return false;
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}
