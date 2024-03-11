package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) str, "");
        this.previousFragmentId = str;
    }
}
