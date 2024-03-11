package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) viewGroup, "");
        this.container = viewGroup;
    }
}
