package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get retain instance for fragment " + fragment);
        C8632dsu.c((Object) fragment, "");
    }
}
