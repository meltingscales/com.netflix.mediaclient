package androidx.compose.ui.input.pointer;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidPointerIconType implements PointerIcon {
    private final int type;

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public AndroidPointerIconType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(AndroidPointerIconType.class, obj != null ? obj.getClass() : null)) {
            C8632dsu.d(obj);
            return this.type == ((AndroidPointerIconType) obj).type;
        }
        return false;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.type + ')';
    }
}
