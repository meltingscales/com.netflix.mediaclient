package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.aZp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2093aZp implements InterfaceC2092aZo {
    public static final e b = new e(null);

    /* renamed from: o.aZp$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.InterfaceC2092aZo
    public boolean d() {
        C1044Mm.e("ReloadCommand", "Executing command...");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.aZr
            @Override // java.lang.Runnable
            public final void run() {
                C2093aZp.c();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        AbstractApplicationC1040Mh.getInstance().d(AbstractApplicationC1040Mh.d(), "deviceCommand");
    }
}
