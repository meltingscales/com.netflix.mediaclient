package androidx.navigation;

import android.os.Bundle;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class NavArgument {
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isNullable;
    private final NavType<Object> type;

    public final NavType<Object> getType() {
        return this.type;
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    public final void putDefaultValue(String str, Bundle bundle) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bundle, "");
        if (this.isDefaultValuePresent) {
            this.type.put(bundle, str, this.defaultValue);
        }
    }

    public final boolean verify(String str, Bundle bundle) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bundle, "");
        if (!this.isNullable && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.type.get(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavArgument.class.getSimpleName());
        sb.append(" Type: " + this.type);
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb.append(" DefaultValue: " + this.defaultValue);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C8632dsu.c(NavArgument.class, obj.getClass())) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.isNullable == navArgument.isNullable && this.isDefaultValuePresent == navArgument.isDefaultValuePresent && C8632dsu.c(this.type, navArgument.type)) {
            Object obj2 = this.defaultValue;
            if (obj2 != null) {
                return C8632dsu.c(obj2, navArgument.defaultValue);
            }
            return navArgument.defaultValue == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode();
        boolean z = this.isNullable;
        boolean z2 = this.isDefaultValuePresent;
        Object obj = this.defaultValue;
        return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
