package com.google.android.gms.internal.auth_blockstore;

import android.os.IInterface;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zzl extends IInterface {
    void zzb(Status status, byte[] bArr);

    void zzc(Status status, RetrieveBytesResponse retrieveBytesResponse);
}
