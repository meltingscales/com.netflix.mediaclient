package com.google.android.gms.internal.flags;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public class zzb extends Binder implements IInterface {
    public zzb(String str) {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zza(i, parcel, parcel2, i2);
    }

    protected boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }
}
