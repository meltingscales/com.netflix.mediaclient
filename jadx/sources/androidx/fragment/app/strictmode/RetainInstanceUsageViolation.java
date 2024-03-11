package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes5.dex */
public abstract class RetainInstanceUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        C8632dsu.c((Object) fragment, "");
    }
}
