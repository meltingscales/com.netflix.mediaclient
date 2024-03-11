package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class i extends b implements j {
    public i() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.assetpacks.internal.b
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        k kVar = null;
        if (i == 2) {
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(readStrongBinder);
            }
            c.b(parcel);
            c(bundle, kVar);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                kVar = queryLocalInterface2 instanceof k ? (k) queryLocalInterface2 : new k(readStrongBinder2);
            }
            c.b(parcel);
            b(bundle2, kVar);
            return true;
        }
    }
}
