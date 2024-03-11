package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class k extends a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void c(Bundle bundle) {
        Parcel a = a();
        c.c(a, bundle);
        b(4, a);
    }

    public final void d(Bundle bundle) {
        Parcel a = a();
        c.c(a, bundle);
        b(3, a);
    }

    public final void e(Bundle bundle, Bundle bundle2) {
        Parcel a = a();
        c.c(a, bundle);
        c.c(a, bundle2);
        b(2, a);
    }
}
