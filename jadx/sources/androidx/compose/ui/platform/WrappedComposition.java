package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dsH;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrappedComposition implements Composition, LifecycleEventObserver {
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    private drX<? super Composer, ? super Integer, dpR> lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m1988getLambda1$ui_release();
    private final Composition original;
    private final AndroidComposeView owner;

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(final drX<? super Composer, ? super Integer, dpR> drx) {
        this.owner.setOnViewTreeOwnersAvailable(new drM<AndroidComposeView.ViewTreeOwners, dpR>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                invoke2(viewTreeOwners);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                boolean z;
                Lifecycle lifecycle;
                z = WrappedComposition.this.disposed;
                if (z) {
                    return;
                }
                Lifecycle lifecycle2 = viewTreeOwners.getLifecycleOwner().getLifecycle();
                WrappedComposition.this.lastContent = drx;
                lifecycle = WrappedComposition.this.addedToLifecycle;
                if (lifecycle == null) {
                    WrappedComposition.this.addedToLifecycle = lifecycle2;
                    lifecycle2.addObserver(WrappedComposition.this);
                } else if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    Composition original = WrappedComposition.this.getOriginal();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final drX<Composer, Integer, dpR> drx2 = drx;
                    original.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return dpR.c;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                                }
                                Object tag = WrappedComposition.this.getOwner().getTag(R.id.inspection_slot_table_set);
                                Set<CompositionData> set = dsH.m(tag) ? (Set) tag : null;
                                if (set == null) {
                                    ViewParent parent = WrappedComposition.this.getOwner().getParent();
                                    View view = parent instanceof View ? (View) parent : null;
                                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                                    set = dsH.m(tag2) ? (Set) tag2 : null;
                                }
                                if (set != null) {
                                    set.add(composer.getCompositionData());
                                    composer.collectParameterInformation();
                                }
                                EffectsKt.LaunchedEffect(WrappedComposition.this.getOwner(), new C00311(WrappedComposition.this, null), composer, 72);
                                ProvidedValue<Set<CompositionData>> provides = InspectionTablesKt.getLocalInspectionTables().provides(set);
                                final WrappedComposition wrappedComposition2 = WrappedComposition.this;
                                final drX<Composer, Integer, dpR> drx3 = drx2;
                                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.composableLambda(composer, -1193460702, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // o.drX
                                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return dpR.c;
                                    }

                                    public final void invoke(Composer composer2, int i2) {
                                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1193460702, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                                        }
                                        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(WrappedComposition.this.getOwner(), drx3, composer2, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes.dex */
                        public static final class C00311 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                            int label;
                            final /* synthetic */ WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00311(WrappedComposition wrappedComposition, InterfaceC8585dra<? super C00311> interfaceC8585dra) {
                                super(2, interfaceC8585dra);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                                return new C00311(this.this$0, interfaceC8585dra);
                            }

                            @Override // o.drX
                            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                                return ((C00311) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object e;
                                e = C8586drb.e();
                                int i = this.label;
                                if (i == 0) {
                                    C8556dpz.d(obj);
                                    AndroidComposeView owner = this.this$0.getOwner();
                                    this.label = 1;
                                    if (owner.boundsUpdatesEventLoop(this) == e) {
                                        return e;
                                    }
                                } else if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                } else {
                                    C8556dpz.d(obj);
                                }
                                return dpR.c;
                            }
                        }
                    }));
                }
            }
        });
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
        } else {
            setContent(this.lastContent);
        }
    }
}
