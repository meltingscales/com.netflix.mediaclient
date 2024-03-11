package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.aZq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2094aZq implements InterfaceC2092aZo {
    public static final b a = new b(null);

    /* renamed from: o.aZq$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.InterfaceC2092aZo
    public boolean d() {
        C1044Mm.e("ResetCommand", "Executing command...");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.aZt
            @Override // java.lang.Runnable
            public final void run() {
                C2094aZq.b();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        C8196dfn.c(AbstractApplicationC1040Mh.d(), "deviceCommand");
    }
}
