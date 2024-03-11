package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
class ViewGroupUtils {
    private static boolean sTryHiddenSuppressLayout = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewGroupOverlayImpl getOverlay(ViewGroup viewGroup) {
        return new ViewGroupOverlayApi18(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void suppressLayout(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            hiddenSuppressLayout(viewGroup, z);
        }
    }

    @SuppressLint({"NewApi"})
    private static void hiddenSuppressLayout(ViewGroup viewGroup, boolean z) {
        if (sTryHiddenSuppressLayout) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSuppressLayout = false;
            }
        }
    }
}
