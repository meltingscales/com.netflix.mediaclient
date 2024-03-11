package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes2.dex */
public final class zzf extends AsyncTask {
    private static final Logger zza = new Logger("FetchBitmapTask");
    private final zzi zzb;
    private final zzb zzc;

    public zzf(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, zzb zzbVar, byte[] bArr) {
        this.zzc = zzbVar;
        this.zzb = com.google.android.gms.internal.cast.zzm.zze(context.getApplicationContext(), this, new zze(this, null), i, i2, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, 10000);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        zzi zziVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (zziVar = this.zzb) != null) {
            try {
                return zziVar.zze(uri);
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "doFetch", zzi.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        zzb zzbVar = this.zzc;
        if (zzbVar != null) {
            zzbVar.zzb(bitmap);
        }
    }
}
