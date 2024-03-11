package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.netflix.clcs.ui.HostDialogFragment$onCreateDialog$1$composeView$1$1;
import com.netflix.clcs.ui.InterstitialCoordinator;
import o.C0722Ae;
import o.C0897Gu;
import o.C8632dsu;
import o.FE;
import o.FX;
import o.InterfaceC8812dzl;
import o.dpR;

/* renamed from: o.Gu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0897Gu extends DialogFragment {
    public static final d a = new d(null);
    public static final int c = 8;
    private Integer d;
    private final InterfaceC8812dzl<FX> e = dzB.d(null);

    /* renamed from: o.Gu$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean d(FX fx) {
            C8632dsu.c((Object) fx, "");
            return !(fx.e().a() instanceof C0876Fz);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        final InterstitialCoordinator c2;
        Window window;
        WindowManager.LayoutParams attributes;
        final FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        ComponentDialog componentDialog = new ComponentDialog(requireActivity, C0722Ae.c.d);
        Integer num = null;
        InterstitialCoordinator.b bVar = requireActivity instanceof InterstitialCoordinator.b ? (InterstitialCoordinator.b) requireActivity : null;
        if (bVar == null || (c2 = bVar.c()) == null) {
            dismissAllowingStateLoss();
            return componentDialog;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = componentDialog.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new drM<OnBackPressedCallback, dpR>() { // from class: com.netflix.clcs.ui.HostDialogFragment$onCreateDialog$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(OnBackPressedCallback onBackPressedCallback) {
                    c(onBackPressedCallback);
                    return dpR.c;
                }

                public final void c(OnBackPressedCallback onBackPressedCallback) {
                    InterfaceC8812dzl interfaceC8812dzl;
                    FE c3;
                    C8632dsu.c((Object) onBackPressedCallback, "");
                    interfaceC8812dzl = C0897Gu.this.e;
                    FX fx = (FX) interfaceC8812dzl.b();
                    if (fx == null || (c3 = fx.c()) == null) {
                        return;
                    }
                    InterstitialCoordinator interstitialCoordinator = c2;
                    interstitialCoordinator.c().c(null, "backButton");
                    interstitialCoordinator.e(c3);
                }
            }, 2, null);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C8632dsu.a(parentFragmentManager, "");
        c2.c(parentFragmentManager);
        Window window2 = componentDialog.getWindow();
        if (window2 != null) {
            WindowCompat.setDecorFitsSystemWindows(window2, false);
            if (Build.VERSION.SDK_INT < 30) {
                window2.setSoftInputMode(16);
            }
            window2.getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: o.Gt
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean e;
                    e = C0897Gu.e(FragmentActivity.this, view, motionEvent);
                    return e;
                }
            });
        }
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(282462047, true, new HostDialogFragment$onCreateDialog$1$composeView$1$1(this, c2)));
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            num = Integer.valueOf(attributes.softInputMode);
        }
        this.d = num;
        componentDialog.setContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
        return componentDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(FragmentActivity fragmentActivity, View view, MotionEvent motionEvent) {
        C8632dsu.c((Object) fragmentActivity, "");
        fragmentActivity.dispatchTouchEvent(motionEvent);
        view.performClick();
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        Integer num = this.d;
        if (num != null) {
            int intValue = num.intValue();
            Dialog dialog = getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(intValue);
        }
    }

    public final void e(FX fx) {
        this.e.d(fx);
    }
}
