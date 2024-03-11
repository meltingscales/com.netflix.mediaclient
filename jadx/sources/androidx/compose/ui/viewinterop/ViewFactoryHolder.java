package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import o.C8627dsp;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private drM<? super T, dpR> releaseBlock;
    private drM<? super T, dpR> resetBlock;
    private SaveableStateRegistry.Entry savableRegistryEntry;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private final T typedView;
    private drM<? super T, dpR> updateBlock;

    public final drM<T, dpR> getReleaseBlock() {
        return (drM<? super T, dpR>) this.releaseBlock;
    }

    public final drM<T, dpR> getResetBlock() {
        return (drM<? super T, dpR>) this.resetBlock;
    }

    public final drM<T, dpR> getUpdateBlock() {
        return (drM<? super T, dpR>) this.updateBlock;
    }

    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i, Owner owner, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : compositionContext, view, (i2 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i, owner);
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        super(context, compositionContext, i, nestedScrollDispatcher, t, owner);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.saveStateKey = valueOf;
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public ViewFactoryHolder(Context context, drM<? super Context, ? extends T> drm, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        this(context, compositionContext, drm.invoke(context), null, saveableStateRegistry, i, owner, 8, null);
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    public final void setUpdateBlock(drM<? super T, dpR> drm) {
        this.updateBlock = drm;
        setUpdate(new drO<dpR>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                view = ((ViewFactoryHolder) this.this$0).typedView;
                this.this$0.getUpdateBlock().invoke(view);
            }
        });
    }

    public final void setResetBlock(drM<? super T, dpR> drm) {
        this.resetBlock = drm;
        setReset(new drO<dpR>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                view = ((ViewFactoryHolder) this.this$0).typedView;
                this.this$0.getResetBlock().invoke(view);
            }
        });
    }

    public final void setReleaseBlock(drM<? super T, dpR> drm) {
        this.releaseBlock = drm;
        setRelease(new drO<dpR>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                view = ((ViewFactoryHolder) this.this$0).typedView;
                this.this$0.getReleaseBlock().invoke(view);
                this.this$0.unregisterSaveStateProvider();
            }
        });
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new drO<Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // o.drO
                public final Object invoke() {
                    View view;
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view = ((ViewFactoryHolder) this.this$0).typedView;
                    view.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }
}
