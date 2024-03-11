package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class GetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get target fragment from fragment " + fragment);
        C8632dsu.c((Object) fragment, "");
    }
}
