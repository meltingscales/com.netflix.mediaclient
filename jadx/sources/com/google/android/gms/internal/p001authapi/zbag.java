package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zbag  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbag extends zba implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zby zbyVar, BeginSignInRequest beginSignInRequest) {
        Parcel zba = zba();
        zbc.zbc(zba, zbyVar);
        zbc.zbb(zba, beginSignInRequest);
        zbb(1, zba);
    }
}
