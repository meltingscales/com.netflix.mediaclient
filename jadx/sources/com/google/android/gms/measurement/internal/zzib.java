package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzib implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzic zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzhz zzf;

    public zzib(zzhz zzhzVar, String str, URL url, byte[] bArr, Map<String, String> map, zzic zzicVar) {
        this.zzf = zzhzVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzicVar);
        this.zza = url;
        this.zzb = null;
        this.zzc = zzicVar;
        this.zzd = str;
        this.zze = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        IOException e;
        byte[] zza;
        this.zzf.zzc();
        int i = 0;
        try {
            httpURLConnection = this.zzf.zza(this.zza);
            try {
                Map<String, String> map2 = this.zze;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
                try {
                    zzhz zzhzVar = this.zzf;
                    zza = zzhz.zza(httpURLConnection);
                    httpURLConnection.disconnect();
                    zzb(i, null, zza, map);
                } catch (IOException e2) {
                    e = e2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, e, null, map);
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, null, null, map);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                map = null;
            } catch (Throwable th3) {
                th = th3;
                map = null;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            map = null;
        }
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zzf.zzq().zza(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.zzie
            private final zzib zza;
            private final int zzb;
            private final Exception zzc;
            private final byte[] zzd;
            private final Map zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
                this.zzc = exc;
                this.zzd = bArr;
                this.zze = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzc.zza(this.zzd, i, exc, bArr, map);
    }
}
