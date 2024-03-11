package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
public abstract class zbq extends com.google.android.gms.internal.p001authapi.zbb implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                zbd((GoogleSignInAccount) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            case 102:
                zbc((Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            case 103:
                zbb((Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
