package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import o.dpR;
import o.drX;
import o.dsT;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DialogLayout extends AbstractComposeView {
    private final MutableState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public Window getWindow() {
        return this.window;
    }

    public final void setUsePlatformDefaultWidth(boolean z) {
        this.usePlatformDefaultWidth = z;
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        MutableState mutableStateOf$default;
        this.window = window;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m2598getLambda1$ui_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    public final void setContent(CompositionContext compositionContext, drX<? super Composer, ? super Integer, dpR> drx) {
        setParentCompositionContext(compositionContext);
        setContent(drx);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    private final int getDisplayWidth() {
        int e;
        e = dsT.e(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return e;
    }

    private final int getDisplayHeight() {
        int e;
        e = dsT.e(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return e;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.window.DialogLayout$Content$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    DialogLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private final drX<Composer, Integer, dpR> getContent() {
        return (drX) this.content$delegate.getValue();
    }

    private final void setContent(drX<? super Composer, ? super Integer, dpR> drx) {
        this.content$delegate.setValue(drx);
    }
}
