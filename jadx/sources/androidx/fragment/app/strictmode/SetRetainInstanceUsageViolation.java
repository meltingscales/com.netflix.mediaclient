package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRetainInstanceUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to set retain instance for fragment " + fragment);
        C8632dsu.c((Object) fragment, "");
    }
}
