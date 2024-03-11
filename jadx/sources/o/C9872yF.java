package o;

import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import o.dpR;

/* renamed from: o.yF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9872yF {
    public static final a a = new a(null);
    public static final int e = 8;
    private final ComponentActivity b;
    private final AtomicReference<ComposeView> c;
    private final AtomicReference<drO<dpR>> d;
    private final List<C9880yN> h;

    public C9872yF(ComponentActivity componentActivity) {
        C8632dsu.c((Object) componentActivity, "");
        this.b = componentActivity;
        this.c = new AtomicReference<>();
        this.h = new ArrayList();
        this.d = new AtomicReference<>();
    }

    /* renamed from: o.yF$a */
    /* loaded from: classes2.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ComposeViewOverlayManager");
        }
    }

    public final void a(final boolean z, final drO<dpR> dro, final drX<? super Composer, ? super Integer, dpR> drx) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drx, "");
        this.c.getAndUpdate(new UnaryOperator() { // from class: o.yG
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComposeView b;
                b = C9872yF.b(z, this, dro, drx, (ComposeView) obj);
                return b;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeView b(boolean z, C9872yF c9872yF, drO dro, drX drx, ComposeView composeView) {
        C8632dsu.c((Object) c9872yF, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drx, "");
        if (composeView == null) {
            composeView = c9872yF.a();
            if (composeView != null) {
                c9872yF.e(composeView, dro, drx);
            }
        } else if (z) {
            c9872yF.d.get().invoke();
            composeView.disposeComposition();
            c9872yF.e(composeView, dro, drx);
        } else {
            c9872yF.h.add(new C9880yN(drx, dro));
        }
        return composeView;
    }

    private final void e(ComposeView composeView, drO<dpR> dro, final drX<? super Composer, ? super Integer, dpR> drx) {
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-154706004, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.android.widgetry.utils.compose.ComposeViewOverlayManager$show$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void e(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-154706004, i, -1, "com.netflix.android.widgetry.utils.compose.ComposeViewOverlayManager.show.<anonymous> (ComposeViewOverlayManager.kt:56)");
                }
                drx.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                e(composer, num.intValue());
                return dpR.c;
            }
        }));
        this.d.set(dro);
    }

    public final void c() {
        this.c.getAndUpdate(new UnaryOperator() { // from class: o.yE
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComposeView a2;
                a2 = C9872yF.a(C9872yF.this, (ComposeView) obj);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeView a(C9872yF c9872yF, ComposeView composeView) {
        ViewGroup viewGroup;
        C8632dsu.c((Object) c9872yF, "");
        if (composeView == null || (viewGroup = (ViewGroup) c9872yF.b.findViewById(16908290)) == null) {
            return null;
        }
        viewGroup.removeView(composeView);
        return null;
    }

    public final void e() {
        Object p;
        p = C8571dqn.p(this.h);
        final C9880yN c9880yN = (C9880yN) p;
        if (c9880yN != null) {
            this.c.getAndUpdate(new UnaryOperator() { // from class: o.yI
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ComposeView c;
                    c = C9872yF.c(C9872yF.this, c9880yN, (ComposeView) obj);
                    return c;
                }
            });
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeView c(C9872yF c9872yF, C9880yN c9880yN, ComposeView composeView) {
        C8632dsu.c((Object) c9872yF, "");
        if (composeView != null) {
            composeView.disposeComposition();
            c9872yF.e(composeView, c9880yN.e(), c9880yN.b());
            return composeView;
        }
        return null;
    }

    private final ComposeView a() {
        ViewCompositionStrategy.DisposeOnLifecycleDestroyed disposeOnLifecycleDestroyed = new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(this.b);
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(16908290);
        if (viewGroup != null) {
            ComposeView composeView = new ComposeView(this.b, null, 0, 6, null);
            viewGroup.addView(composeView);
            composeView.setViewCompositionStrategy(disposeOnLifecycleDestroyed);
            ViewTreeLifecycleOwner.set(composeView, this.b);
            ViewTreeSavedStateRegistryOwner.set(composeView, this.b);
            return composeView;
        }
        return null;
    }
}
