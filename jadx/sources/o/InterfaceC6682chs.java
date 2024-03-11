package o;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import o.dpR;

/* renamed from: o.chs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6682chs {
    boolean a();

    void b();

    void b(int i, int i2);

    void b(drO<dpR> dro);

    boolean b(MotionEvent motionEvent);

    void c(View view, boolean z, boolean z2);

    void c(boolean z, int i, int i2, int i3, int i4);

    View d();

    WindowInsets d(WindowInsets windowInsets);

    ViewGroup e();

    /* renamed from: o.chs$c */
    /* loaded from: classes4.dex */
    public static final class c {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(InterfaceC6682chs interfaceC6682chs, drO dro, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismiss");
            }
            if ((i & 1) != 0) {
                dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingTooltipViewGroupManager$dismiss$1
                    public final void b() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }
                };
            }
            interfaceC6682chs.b(dro);
        }
    }
}
