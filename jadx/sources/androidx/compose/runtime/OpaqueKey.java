package androidx.compose.runtime;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class OpaqueKey {
    private final String key;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && C8632dsu.c((Object) this.key, (Object) ((OpaqueKey) obj).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }

    public OpaqueKey(String str) {
        this.key = str;
    }
}
