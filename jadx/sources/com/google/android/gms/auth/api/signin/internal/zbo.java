package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class zbo extends com.google.android.gms.internal.p001authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zbc();
        } else if (i != 2) {
            return false;
        } else {
            zbb();
        }
        return true;
    }
}
