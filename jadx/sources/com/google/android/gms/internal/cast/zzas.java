package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzas extends BasePendingResult {
    private final zzat zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzat zzatVar) {
        super((GoogleApiClient) null);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        int i = CastSession.zza;
        return status;
    }
}
