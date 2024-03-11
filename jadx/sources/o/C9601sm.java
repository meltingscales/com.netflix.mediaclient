package o;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: o.sm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C9601sm implements InterfaceC9605sq {
    private final String d;
    private final Messenger e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9601sm(Messenger messenger, String str) {
        this.e = messenger;
        this.d = str;
    }

    @Override // o.InterfaceC9605sq
    public void e(int i) {
        try {
            this.e.send(a(i));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private Message a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putString("tag", this.d);
        obtain.setData(bundle);
        return obtain;
    }
}
