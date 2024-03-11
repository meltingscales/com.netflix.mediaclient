package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: o.uL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9644uL {
    private final Fragment b;
    private final FragmentActivity c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9644uL) {
            C9644uL c9644uL = (C9644uL) obj;
            return C8632dsu.c(this.c, c9644uL.c) && C8632dsu.c(this.b, c9644uL.b);
        }
        return false;
    }

    public int hashCode() {
        FragmentActivity fragmentActivity = this.c;
        int hashCode = fragmentActivity == null ? 0 : fragmentActivity.hashCode();
        Fragment fragment = this.b;
        return (hashCode * 31) + (fragment != null ? fragment.hashCode() : 0);
    }

    public String toString() {
        FragmentActivity fragmentActivity = this.c;
        Fragment fragment = this.b;
        return "ImageRequestOwner(activity=" + fragmentActivity + ", fragment=" + fragment + ")";
    }

    public C9644uL(FragmentActivity fragmentActivity, Fragment fragment) {
        this.c = fragmentActivity;
        this.b = fragment;
    }
}
