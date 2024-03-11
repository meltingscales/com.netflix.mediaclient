package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzz extends GoogleApi implements BlockstoreClient {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new Api("Blockstore.API", zztVar, clientKey);
    }

    public zzz(Context context) {
        super(context, zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<Boolean> deleteBytes(final DeleteBytesRequest deleteBytesRequest) {
        Preconditions.checkNotNull(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        return doWrite(TaskApiCall.builder().setFeatures(zzaa.zzg).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzz zzzVar = zzz.this;
                DeleteBytesRequest deleteBytesRequest2 = deleteBytesRequest;
                ((zzf) ((zze) obj).getService()).zzc(new zzx(zzzVar, (TaskCompletionSource) obj2), deleteBytesRequest2);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1669).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<Boolean> isEndToEndEncryptionAvailable() {
        return doRead(TaskApiCall.builder().setFeatures(zzaa.zze).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzf) ((zze) obj).getService()).zzd(new zzy(zzz.this, (TaskCompletionSource) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1651).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<Integer> storeBytes(final StoreBytesData storeBytesData) {
        return doWrite(TaskApiCall.builder().setFeatures(zzaa.zzd, zzaa.zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzo
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzz zzzVar = zzz.this;
                StoreBytesData storeBytesData2 = storeBytesData;
                ((zzf) ((zze) obj).getService()).zzg(new zzu(zzzVar, (TaskCompletionSource) obj2), storeBytesData2);
            }
        }).setMethodKey(1645).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final Task<RetrieveBytesResponse> retrieveBytes(final RetrieveBytesRequest retrieveBytesRequest) {
        Preconditions.checkNotNull(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        return doRead(TaskApiCall.builder().setFeatures(zzaa.zzh).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzz zzzVar = zzz.this;
                RetrieveBytesRequest retrieveBytesRequest2 = retrieveBytesRequest;
                ((zzf) ((zze) obj).getService()).zzf(new zzv(zzzVar, (TaskCompletionSource) obj2), retrieveBytesRequest2);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1668).build());
    }
}
