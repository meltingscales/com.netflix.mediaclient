package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zbz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbz extends zba implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbd(zbaf zbafVar, SavePasswordRequest savePasswordRequest) {
        Parcel zba = zba();
        zbc.zbc(zba, zbafVar);
        zbc.zbb(zba, savePasswordRequest);
        zbb(2, zba);
    }
}
