package com.google.android.gms.auth.blockstore;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface BlockstoreClient {
    Task<Boolean> deleteBytes(DeleteBytesRequest deleteBytesRequest);

    Task<Boolean> isEndToEndEncryptionAvailable();

    Task<RetrieveBytesResponse> retrieveBytes(RetrieveBytesRequest retrieveBytesRequest);

    Task<Integer> storeBytes(StoreBytesData storeBytesData);
}
