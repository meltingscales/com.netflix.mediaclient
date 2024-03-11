package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes5.dex */
public final class zbn {
    private static zbn zbd;
    @VisibleForTesting
    final Storage zba;
    @VisibleForTesting
    GoogleSignInAccount zbb;
    @VisibleForTesting
    GoogleSignInOptions zbc;

    private zbn(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zba = storage;
        this.zbb = storage.getSavedDefaultGoogleSignInAccount();
        this.zbc = storage.getSavedDefaultGoogleSignInOptions();
    }

    public static zbn zbc(Context context) {
        zbn zbf;
        synchronized (zbn.class) {
            zbf = zbf(context.getApplicationContext());
        }
        return zbf;
    }

    private static zbn zbf(Context context) {
        synchronized (zbn.class) {
            zbn zbnVar = zbd;
            if (zbnVar != null) {
                return zbnVar;
            }
            zbn zbnVar2 = new zbn(context);
            zbd = zbnVar2;
            return zbnVar2;
        }
    }

    public final void zbd() {
        synchronized (this) {
            this.zba.clear();
            this.zbb = null;
            this.zbc = null;
        }
    }

    public final void zbe(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            this.zba.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
            this.zbb = googleSignInAccount;
            this.zbc = googleSignInOptions;
        }
    }
}
