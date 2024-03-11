package androidx.compose.material3;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.dpR;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModalBottomSheetWindow extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener {
    private Object backCallback;
    private final View composeView;
    private final MutableState content$delegate;
    private drO<dpR> onDismissRequest;
    private final WindowManager.LayoutParams params;
    private final ModalBottomSheetProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final WindowManager windowManager;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public ModalBottomSheetWindow(ModalBottomSheetProperties modalBottomSheetProperties, drO<dpR> dro, View view, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        boolean isFlagSecureEnabled;
        boolean shouldApplySecureFlag;
        MutableState mutableStateOf$default;
        this.properties = modalBottomSheetProperties;
        this.onDismissRequest = dro;
        this.composeView = view;
        setId(16908290);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        int i = androidx.compose.ui.R.id.compose_view_saveable_id_tag;
        setTag(i, "Popup:" + uuid);
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        C8632dsu.d(systemService);
        this.windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = getDisplayWidth();
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        SecureFlagPolicy securePolicy = modalBottomSheetProperties.getSecurePolicy();
        isFlagSecureEnabled = ModalBottomSheet_androidKt.isFlagSecureEnabled(view);
        shouldApplySecureFlag = ModalBottomSheet_androidKt.shouldApplySecureFlag(securePolicy, isFlagSecureEnabled);
        layoutParams.flags = shouldApplySecureFlag ? layoutParams.flags | 8192 : layoutParams.flags & (-8193);
        layoutParams.flags = !modalBottomSheetProperties.isFocusable() ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.params = layoutParams;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m783getLambda2$material3_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    private final int getDisplayWidth() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-463309699);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463309699, i2, -1, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:562)");
            }
            getContent().invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ModalBottomSheetWindow$Content$4
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

                public final void invoke(Composer composer2, int i3) {
                    ModalBottomSheetWindow.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static /* synthetic */ void setCustomContent$default(ModalBottomSheetWindow modalBottomSheetWindow, CompositionContext compositionContext, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        modalBottomSheetWindow.setCustomContent(compositionContext, drx);
    }

    public final void setCustomContent(CompositionContext compositionContext, drX<? super Composer, ? super Integer, dpR> drx) {
        if (compositionContext != null) {
            setParentCompositionContext(compositionContext);
        }
        setContent(drx);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        ViewTreeSavedStateRegistryOwner.set(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.properties.getShouldDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.onDismissRequest.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    private final void maybeRegisterBackCallback() {
        if (!this.properties.getShouldDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    public final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final OnBackInvokedCallback createBackCallback(final drO<dpR> dro) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.ModalBottomSheetWindow$Api33Impl$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    drO.this.invoke();
                }
            };
        }

        public static final void maybeRegisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback((int) Prefetch.NANOSECONDS_PER_MILLISECOND, (OnBackInvokedCallback) obj);
        }

        public static final void maybeUnregisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    private final drX<Composer, Integer, dpR> getContent() {
        return (drX) this.content$delegate.getValue();
    }

    private final void setContent(drX<? super Composer, ? super Integer, dpR> drx) {
        this.content$delegate.setValue(drx);
    }
}
