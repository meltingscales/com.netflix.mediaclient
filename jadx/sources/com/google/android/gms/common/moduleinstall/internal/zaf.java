package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes5.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(zaa, apiFeatureRequest);
        com.google.android.gms.internal.base.zac.zad(zaa, zahVar);
        zac(2, zaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zad(zaa, zahVar);
        zac(6, zaa);
    }
}
