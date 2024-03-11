package com.google.android.gms.gcm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public interface INetworkTaskCallback extends IInterface {
    void taskFinished(int i);

    /* loaded from: classes5.dex */
    public static abstract class Stub extends Binder implements INetworkTaskCallback {
        public Stub() {
            attachInterface(this, "com.google.android.gms.gcm.INetworkTaskCallback");
        }

        public static INetworkTaskCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof INetworkTaskCallback)) {
                return (INetworkTaskCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString("com.google.android.gms.gcm.INetworkTaskCallback");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            taskFinished(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes5.dex */
        static class Proxy implements INetworkTaskCallback {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.google.android.gms.gcm.INetworkTaskCallback
            public void taskFinished(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
