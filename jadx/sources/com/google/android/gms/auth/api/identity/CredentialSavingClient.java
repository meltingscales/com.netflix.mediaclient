package com.google.android.gms.auth.api.identity;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface CredentialSavingClient {
    @RecentlyNonNull
    Task<SavePasswordResult> savePassword(@RecentlyNonNull SavePasswordRequest savePasswordRequest);
}
