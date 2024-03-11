package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.atomic.AtomicReference;
import o.C8737dwr;
import o.C8769dxw;
import o.C8789dyp;
import o.dxD;

/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View view) {
        final dxD c;
        Recomposer createRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, createRecomposer);
        c = C8737dwr.c(C8769dxw.e, C8789dyp.d(view.getHandler(), "windowRecomposer cleanup").b(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                dxD.b.b(dxD.this, null, 1, null);
            }
        });
        return createRecomposer;
    }
}
