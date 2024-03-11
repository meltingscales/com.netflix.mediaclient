package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.cast.framework.zzaa;
import com.google.android.gms.cast.framework.zzad;
import com.google.android.gms.cast.framework.zzx;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzm {
    private static final Logger zza = new Logger("CastDynamiteModule");

    public static zzaa zza(Context context, CastOptions castOptions, zzs zzsVar, Map map) {
        return zzf(context).zze(ObjectWrapper.wrap(context.getApplicationContext()), castOptions, zzsVar, map);
    }

    public static zzad zzb(Context context, CastOptions castOptions, IObjectWrapper iObjectWrapper, zzx zzxVar) {
        if (iObjectWrapper == null) {
            return null;
        }
        try {
            return zzf(context).zzf(castOptions, iObjectWrapper, zzxVar);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.d(e, "Unable to call %s on %s.", "newCastSessionImpl", zzq.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.zzak zzc(Service service, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        if (iObjectWrapper == null || iObjectWrapper2 == null) {
            return null;
        }
        try {
            return zzf(service.getApplicationContext()).zzg(ObjectWrapper.wrap(service), iObjectWrapper, iObjectWrapper2);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.d(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", zzq.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.zzan zzd(Context context, String str, String str2, com.google.android.gms.cast.framework.zzav zzavVar) {
        try {
            return zzf(context).zzh(str, str2, zzavVar);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.d(e, "Unable to call %s on %s.", "newSessionImpl", zzq.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.media.internal.zzi zze(Context context, AsyncTask asyncTask, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return zzf(context.getApplicationContext()).zzi(ObjectWrapper.wrap(asyncTask), zzkVar, i, i2, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, 10000);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.d(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", zzq.class.getSimpleName());
            return null;
        }
    }

    private static zzq zzf(Context context) {
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cast.framework.dynamite").instantiate("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (instantiate == null) {
                return null;
            }
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof zzq) {
                return (zzq) queryLocalInterface;
            }
            return new zzp(instantiate);
        } catch (DynamiteModule.LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
