package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import java.util.HashSet;

/* renamed from: o.fV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8902fV {
    private static final HashSet<Integer> d = new HashSet<>();
    private static final Handler a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.fR
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean c;
            c = C8902fV.c(message);
            return c;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Message message) {
        C8632dsu.c((Object) message, "");
        Object obj = message.obj;
        C8632dsu.d(obj);
        InterfaceC8894fN interfaceC8894fN = (InterfaceC8894fN) obj;
        d.remove(Integer.valueOf(System.identityHashCode(interfaceC8894fN)));
        if (interfaceC8894fN.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC8894fN.e();
            return true;
        }
        return true;
    }
}
