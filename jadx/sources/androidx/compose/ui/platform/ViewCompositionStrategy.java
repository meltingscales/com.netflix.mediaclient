package androidx.compose.ui.platform;

import android.view.View;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.Ref;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    drO<dpR> installFor(AbstractComposeView abstractComposeView);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public drO<dpR> installFor(final AbstractComposeView abstractComposeView) {
            final ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    if (PoolingContainer.isWithinPoolingContainer(AbstractComposeView.this)) {
                        return;
                    }
                    AbstractComposeView.this.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r0);
            final PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    AbstractComposeView.this.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(abstractComposeView, poolingContainerListener);
            return new drO<dpR>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AbstractComposeView.this.removeOnAttachStateChangeListener(r0);
                    PoolingContainer.removePoolingContainerListener(AbstractComposeView.this, poolingContainerListener);
                }
            };
        }
    }

    /* loaded from: classes.dex */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        public DisposeOnLifecycleDestroyed(LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public drO<dpR> installFor(AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, this.lifecycle);
        }
    }

    /* loaded from: classes.dex */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public drO<dpR> installFor(final AbstractComposeView abstractComposeView) {
            if (abstractComposeView.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                if (lifecycleOwner == null) {
                    throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                }
                return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                /* JADX WARN: Type inference failed for: r3v7, types: [o.drO, T] */
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    ?? installForLifecycle;
                    LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(AbstractComposeView.this);
                    AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                    if (lifecycleOwner2 != null) {
                        Ref.ObjectRef<drO<dpR>> objectRef2 = objectRef;
                        installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, lifecycleOwner2.getLifecycle());
                        objectRef2.d = installForLifecycle;
                        AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                        return;
                    }
                    throw new IllegalStateException(("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner").toString());
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r1);
            objectRef.d = new drO<dpR>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AbstractComposeView.this.removeOnAttachStateChangeListener(r1);
                }
            };
            return new drO<dpR>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.d.invoke();
                }
            };
        }
    }
}
