package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public class zaa implements IInterface {
    private final IBinder zaa;
    private final String zab;

    public zaa(IBinder iBinder, String str) {
        this.zaa = iBinder;
        this.zab = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zaa;
    }

    public final Parcel zaa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    public final void zac(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zad(int i, Parcel parcel) {
        try {
            this.zaa.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
