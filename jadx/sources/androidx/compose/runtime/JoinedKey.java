package androidx.compose.runtime;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class JoinedKey {
    private final Object left;
    private final Object right;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JoinedKey) {
            JoinedKey joinedKey = (JoinedKey) obj;
            return C8632dsu.c(this.left, joinedKey.left) && C8632dsu.c(this.right, joinedKey.right);
        }
        return false;
    }

    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }

    public JoinedKey(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public int hashCode() {
        return (hashCodeOf(this.left) * 31) + hashCodeOf(this.right);
    }

    private final int hashCodeOf(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
