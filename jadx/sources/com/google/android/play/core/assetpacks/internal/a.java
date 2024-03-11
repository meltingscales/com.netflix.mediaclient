package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public class a implements IInterface {
    private final IBinder a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
