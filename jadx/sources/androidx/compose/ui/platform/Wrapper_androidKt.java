package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.util.Collections;
import java.util.WeakHashMap;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static final ReusableComposition createSubcomposition(LayoutNode layoutNode, CompositionContext compositionContext) {
        return CompositionKt.ReusableComposition(new UiApplier(layoutNode), compositionContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.Composition setContent(androidx.compose.ui.platform.AbstractComposeView r3, androidx.compose.runtime.CompositionContext r4, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r5) {
        /*
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.ui.platform.GlobalSnapshotManager.INSTANCE
            r0.ensureStarted()
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L17
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L1a
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L1b
        L17:
            r3.removeAllViews()
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L33
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r3.getContext()
            o.dqZ r2 = r4.getEffectCoroutineContext()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = androidx.compose.ui.platform.Wrapper_androidKt.DefaultLayoutParams
            r3.addView(r1, r2)
        L33:
            androidx.compose.runtime.Composition r3 = doSetContent(r0, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Wrapper_androidKt.setContent(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.CompositionContext, o.drX):androidx.compose.runtime.Composition");
    }

    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, drX<? super Composer, ? super Integer, dpR> drx) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(R.id.inspection_slot_table_set) == null) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Composition Composition = CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext);
        Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, Composition);
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(drx);
        return wrappedComposition;
    }
}
