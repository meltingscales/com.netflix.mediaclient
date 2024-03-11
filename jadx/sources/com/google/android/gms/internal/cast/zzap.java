package com.google.android.gms.internal.cast;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouterParams;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.Logger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzap extends zzr {
    private static final Logger zza = new Logger("MediaRouterProxy");
    private final MediaRouter zzb;
    private final Map zzc = new HashMap();
    private zzax zzd;

    public zzap(MediaRouter mediaRouter, CastOptions castOptions) {
        this.zzb = mediaRouter;
        if (Build.VERSION.SDK_INT > 30) {
            boolean zzd = castOptions.zzd();
            boolean zze = castOptions.zze();
            mediaRouter.setRouterParams(new MediaRouterParams.Builder().setOutputSwitcherEnabled(zzd).setTransferToLocalEnabled(zze).build());
            zza.d("output switcher = %b, transfer to local = %b", Boolean.valueOf(zzd), Boolean.valueOf(zze));
            if (zzd) {
                zzl.zzd(zzkk.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (zze) {
                this.zzd = new zzax();
                mediaRouter.setOnPrepareTransferListener(new zzam(this.zzd));
                zzl.zzd(zzkk.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    private final void zzr(MediaRouteSelector mediaRouteSelector, int i) {
        Set<MediaRouter.Callback> set = (Set) this.zzc.get(mediaRouteSelector);
        if (set == null) {
            return;
        }
        for (MediaRouter.Callback callback : set) {
            this.zzb.addCallback(mediaRouteSelector, callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzs */
    public final void zzp(MediaRouteSelector mediaRouteSelector) {
        Set<MediaRouter.Callback> set = (Set) this.zzc.get(mediaRouteSelector);
        if (set == null) {
            return;
        }
        for (MediaRouter.Callback callback : set) {
            this.zzb.removeCallback(callback);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final Bundle zzb(String str) {
        for (MediaRouter.RouteInfo routeInfo : this.zzb.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                return routeInfo.getExtras();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final String zzc() {
        return this.zzb.getSelectedRoute().getId();
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zzd(Bundle bundle, final int i) {
        final MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzr(fromBundle, i);
        } else {
            new zzcv(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    zzap.this.zzo(fromBundle, i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zze(Bundle bundle, zzu zzuVar) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return;
        }
        if (!this.zzc.containsKey(fromBundle)) {
            this.zzc.put(fromBundle, new HashSet());
        }
        ((Set) this.zzc.get(fromBundle)).add(new zzae(zzuVar));
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zzf() {
        for (Set<MediaRouter.Callback> set : this.zzc.values()) {
            for (MediaRouter.Callback callback : set) {
                this.zzb.removeCallback(callback);
            }
        }
        this.zzc.clear();
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zzg(Bundle bundle) {
        final MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzp(fromBundle);
        } else {
            new zzcv(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    zzap.this.zzp(fromBundle);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zzh() {
        MediaRouter mediaRouter = this.zzb;
        mediaRouter.selectRoute(mediaRouter.getDefaultRoute());
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zzi(String str) {
        zza.d("select route with routeId = %s", str);
        for (MediaRouter.RouteInfo routeInfo : this.zzb.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                zza.d("media route is found and selected", new Object[0]);
                this.zzb.selectRoute(routeInfo);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final void zzj(int i) {
        this.zzb.unselect(i);
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final boolean zzk() {
        MediaRouter.RouteInfo bluetoothRoute = this.zzb.getBluetoothRoute();
        return bluetoothRoute != null && this.zzb.getSelectedRoute().getId().equals(bluetoothRoute.getId());
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final boolean zzl() {
        MediaRouter.RouteInfo defaultRoute = this.zzb.getDefaultRoute();
        return defaultRoute != null && this.zzb.getSelectedRoute().getId().equals(defaultRoute.getId());
    }

    @Override // com.google.android.gms.internal.cast.zzs
    public final boolean zzm(Bundle bundle, int i) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return false;
        }
        return this.zzb.isRouteAvailable(fromBundle, i);
    }

    public final zzax zzn() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(MediaRouteSelector mediaRouteSelector, int i) {
        synchronized (this.zzc) {
            zzr(mediaRouteSelector, i);
        }
    }

    public final void zzq(MediaSessionCompat mediaSessionCompat) {
        this.zzb.setMediaSessionCompat(mediaSessionCompat);
    }
}
