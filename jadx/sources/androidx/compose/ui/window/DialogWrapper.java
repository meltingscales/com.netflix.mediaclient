package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DialogWrapper extends ComponentDialog {
    private final View composeView;
    private final int defaultSoftInputMode;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private drO<dpR> onDismissRequest;
    private DialogProperties properties;

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

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public DialogWrapper(drO<dpR> dro, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || dialogProperties.getDecorFitsSystemWindows()) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = dro;
        this.properties = dialogProperties;
        this.composeView = view;
        float m2492constructorimpl = Dp.m2492constructorimpl(8);
        this.maxSupportedElevation = m2492constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.defaultSoftInputMode = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(17170445);
        WindowCompat.setDecorFitsSystemWindows(window, this.properties.getDecorFitsSystemWindows());
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        int i = R.id.compose_view_saveable_id_tag;
        dialogLayout.setTag(i, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo193toPx0680j_4(m2492constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new drM<OnBackPressedCallback, dpR>() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback onBackPressedCallback) {
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
            }
        }, 2, null);
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
    }

    public final void setContent(CompositionContext compositionContext, drX<? super Composer, ? super Integer, dpR> drx) {
        this.dialogLayout.setContent(compositionContext, drx);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        C8632dsu.d(window);
        window.setFlags(shouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    public final void updateParameters(drO<dpR> dro, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        Window window;
        this.onDismissRequest = dro;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        if (dialogProperties.getUsePlatformDefaultWidth() && !this.dialogLayout.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.dialogLayout.setUsePlatformDefaultWidth(dialogProperties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (dialogProperties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }
}
