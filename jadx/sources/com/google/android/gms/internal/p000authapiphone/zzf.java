package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzf extends zza implements zze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zze
    public final void zza(zzg zzgVar) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
