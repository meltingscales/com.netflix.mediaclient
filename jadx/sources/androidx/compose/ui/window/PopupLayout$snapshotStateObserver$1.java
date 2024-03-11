package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
final class PopupLayout$snapshotStateObserver$1 extends Lambda implements drM<drO<? extends dpR>, dpR> {
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$snapshotStateObserver$1(PopupLayout popupLayout) {
        super(1);
        this.this$0 = popupLayout;
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
            handler2.post(new Runnable() { // from class: androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    drO.this.invoke();
                }
            });
        }
    }
}
