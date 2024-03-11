package com.google.android.gms.auth.blockstore;

import android.content.Context;
import com.google.android.gms.internal.auth_blockstore.zzz;

/* loaded from: classes2.dex */
public final class Blockstore {
    public static BlockstoreClient getClient(Context context) {
        return new zzz(context);
    }
}
