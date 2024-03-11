package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import o.dpR;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements drM<drO<? extends dpR>, dpR> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // o.drM
    public /* bridge */ /* synthetic */ dpR invoke(drO<? extends dpR> dro) {
        invoke2((drO<dpR>) dro);
        return dpR.c;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final drO<dpR> dro) {
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            dro.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    drO.this.invoke();
                }
            });
        }
    }
}
