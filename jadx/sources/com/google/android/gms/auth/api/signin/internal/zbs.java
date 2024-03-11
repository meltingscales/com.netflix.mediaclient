package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes5.dex */
public final class zbs extends com.google.android.gms.internal.p001authapi.zba implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, zbrVar);
        com.google.android.gms.internal.p001authapi.zbc.zbb(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbc(zba, zbrVar);
        com.google.android.gms.internal.p001authapi.zbc.zbb(zba, googleSignInOptions);
        zbb(102, zba);
    }
}
