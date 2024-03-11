package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes2.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        C8632dsu.c((Object) fragment, "");
    }
}
