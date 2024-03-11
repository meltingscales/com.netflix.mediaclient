package androidx.activity.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import o.dpR;
import o.drX;

/* loaded from: classes5.dex */
public final class ComponentActivityKt {
    private static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void setContent$default(ComponentActivity componentActivity, CompositionContext compositionContext, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        setContent(componentActivity, compositionContext, drx);
    }

    public static final void setContent(ComponentActivity componentActivity, CompositionContext compositionContext, drX<? super Composer, ? super Integer, dpR> drx) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(drx);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(drx);
        setOwners(componentActivity);
        componentActivity.setContentView(composeView2, DefaultActivityContentLayoutParams);
    }

    private static final void setOwners(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.get(decorView) == null) {
            ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.get(decorView) == null) {
            ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.set(decorView, componentActivity);
        }
    }
}
