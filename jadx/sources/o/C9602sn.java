package o;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.gcm.INetworkTaskCallback;

/* renamed from: o.sn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C9602sn implements InterfaceC9605sq {
    private final INetworkTaskCallback d;

    public C9602sn(IBinder iBinder) {
        this.d = INetworkTaskCallback.Stub.asInterface(iBinder);
    }

    @Override // o.InterfaceC9605sq
    public void e(int i) {
        try {
            this.d.taskFinished(i);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
