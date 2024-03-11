package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})
    static TransportFactory zza;
    private static final Pattern zzb = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final Context zzc;
    private final FirebaseInstanceId zzd;

    @Keep
    static FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, TransportFactory transportFactory) {
        this.zzc = firebaseApp.getApplicationContext();
        zza = transportFactory;
        this.zzd = firebaseInstanceId;
    }
}
