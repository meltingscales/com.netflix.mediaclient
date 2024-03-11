package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzak extends MediaRouter.Callback {
    private static final Logger zzb = new Logger("MRDiscoveryCallback");
    private final zzaj zzf;
    private final Map zzd = Collections.synchronizedMap(new HashMap());
    private final LinkedHashSet zze = new LinkedHashSet();
    private final Set zzc = Collections.synchronizedSet(new LinkedHashSet());
    public final zzai zza = new zzai(this);

    public zzak(Context context) {
        this.zzf = new zzaj(context);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        zzf(routeInfo, true);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        zzf(routeInfo, true);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        zzf(routeInfo, false);
    }

    public final void zza(List list) {
        Logger logger = zzb;
        int size = list.size();
        StringBuilder sb = new StringBuilder(37);
        sb.append("SetRouteDiscovery for ");
        sb.append(size);
        sb.append(" IDs");
        logger.d(sb.toString(), new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(zzdk.zza((String) it.next()));
        }
        zzb.d("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        HashMap hashMap = new HashMap();
        synchronized (this.zzd) {
            for (String str : linkedHashSet) {
                zzah zzahVar = (zzah) this.zzd.get(zzdk.zza(str));
                if (zzahVar != null) {
                    hashMap.put(str, zzahVar);
                }
            }
            this.zzd.clear();
            this.zzd.putAll(hashMap);
        }
        zzb.d("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        synchronized (this.zze) {
            this.zze.clear();
            this.zze.addAll(linkedHashSet);
        }
        zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Logger logger = zzb;
        int size = this.zze.size();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Starting RouteDiscovery with ");
        sb.append(size);
        sb.append(" IDs");
        logger.d(sb.toString(), new Object[0]);
        logger.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzc();
        } else {
            new zzcv(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    zzak.this.zzc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        this.zzf.zzb(this);
        synchronized (this.zze) {
            Iterator it = this.zze.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                MediaRouteSelector build = new MediaRouteSelector.Builder().addControlCategory(CastMediaControlIntent.categoryForCast(str)).build();
                if (((zzah) this.zzd.get(str)) == null) {
                    this.zzd.put(str, new zzah(build));
                }
                Logger logger = zzb;
                String categoryForCast = CastMediaControlIntent.categoryForCast(str);
                logger.d(categoryForCast.length() != 0 ? "Adding mediaRouter callback for control category ".concat(categoryForCast) : new String("Adding mediaRouter callback for control category "), new Object[0]);
                this.zzf.zza().addCallback(build, this, 4);
            }
        }
        zzb.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
    }

    @VisibleForTesting
    public final void zzd() {
        zzb.d("Stopping RouteDiscovery.", new Object[0]);
        this.zzd.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zzf.zzb(this);
        } else {
            new zzcv(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    zzak.this.zze();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        this.zzf.zzb(this);
    }

    final void zzf(MediaRouter.RouteInfo routeInfo, boolean z) {
        boolean z2;
        zzei zzj;
        boolean remove;
        Logger logger = zzb;
        logger.d("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), routeInfo);
        synchronized (this.zzd) {
            String valueOf = String.valueOf(this.zzd.keySet());
            StringBuilder sb = new StringBuilder(valueOf.length() + 45);
            sb.append("appIdToRouteInfo has these appId route keys: ");
            sb.append(valueOf);
            logger.d(sb.toString(), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.zzd.entrySet()) {
                String str = (String) entry.getKey();
                zzah zzahVar = (zzah) entry.getValue();
                if (routeInfo.matchesSelector(zzahVar.zzb)) {
                    if (z) {
                        Logger logger2 = zzb;
                        String valueOf2 = String.valueOf(str);
                        logger2.d(valueOf2.length() != 0 ? "Adding/updating route for appId ".concat(valueOf2) : new String("Adding/updating route for appId "), new Object[0]);
                        remove = zzahVar.zza.add(routeInfo);
                        if (!remove) {
                            String valueOf3 = String.valueOf(routeInfo);
                            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 32 + String.valueOf(str).length());
                            sb2.append("Route ");
                            sb2.append(valueOf3);
                            sb2.append(" already exists for appId ");
                            sb2.append(str);
                            logger2.w(sb2.toString(), new Object[0]);
                        }
                    } else {
                        Logger logger3 = zzb;
                        String valueOf4 = String.valueOf(str);
                        logger3.d(valueOf4.length() != 0 ? "Removing route for appId ".concat(valueOf4) : new String("Removing route for appId "), new Object[0]);
                        remove = zzahVar.zza.remove(routeInfo);
                        if (!remove) {
                            String valueOf5 = String.valueOf(routeInfo);
                            StringBuilder sb3 = new StringBuilder(valueOf5.length() + 34 + String.valueOf(str).length());
                            sb3.append("Route ");
                            sb3.append(valueOf5);
                            sb3.append(" already removed from appId ");
                            sb3.append(str);
                            logger3.w(sb3.toString(), new Object[0]);
                        }
                    }
                    z2 = remove;
                }
            }
        }
        if (z2) {
            zzb.d("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.zzc) {
                HashMap hashMap = new HashMap();
                synchronized (this.zzd) {
                    for (String str2 : this.zzd.keySet()) {
                        zzah zzahVar2 = (zzah) this.zzd.get(zzdk.zza(str2));
                        if (zzahVar2 == null) {
                            zzj = zzei.zzk();
                        } else {
                            zzj = zzei.zzj(zzahVar2.zza);
                        }
                        if (!zzj.isEmpty()) {
                            hashMap.put(str2, zzj);
                        }
                    }
                }
                zzeh.zzc(hashMap.entrySet());
                for (com.google.android.gms.cast.framework.zzax zzaxVar : this.zzc) {
                    zzaxVar.zza();
                }
            }
        }
    }
}
