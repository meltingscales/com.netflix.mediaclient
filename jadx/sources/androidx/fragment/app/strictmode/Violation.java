package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes2.dex */
public abstract class Violation extends RuntimeException {
    private final Fragment fragment;

    public final Fragment getFragment() {
        return this.fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        C8632dsu.c((Object) fragment, "");
        this.fragment = fragment;
    }
}
