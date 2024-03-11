package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.common.internal.Preconditions;
import java.util.UUID;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes2.dex */
public final class zzd {
    private final Transport zza;
    private final String zzb;
    private final int zzc;

    private zzd(SharedPreferences sharedPreferences, Transport transport, long j) {
        this.zza = transport;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.zzb = string;
        this.zzc = j == 0 ? 1 : 2;
    }

    public static zzd zza(SharedPreferences sharedPreferences, Transport transport, long j) {
        return new zzd(sharedPreferences, transport, j);
    }

    @Pure
    public final void zzb(zzlk zzlkVar, int i) {
        Event ofTelemetry;
        zzlj zzd = zzlk.zzd(zzlkVar);
        zzd.zzi(this.zzb);
        zzlk zzlkVar2 = (zzlk) zzd.zzp();
        if (this.zzc - 1 == 0) {
            ofTelemetry = Event.ofTelemetry(i - 1, zzlkVar2);
        } else {
            ofTelemetry = Event.ofData(i - 1, zzlkVar2);
        }
        Preconditions.checkNotNull(ofTelemetry);
        this.zza.send(ofTelemetry);
    }
}
