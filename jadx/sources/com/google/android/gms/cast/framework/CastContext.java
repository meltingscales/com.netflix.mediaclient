package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.cast.zzkk;
import com.google.android.gms.internal.cast.zzlk;
import com.google.android.gms.internal.cast.zzpg;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public class CastContext {
    private static final Logger zza = new Logger("CastContext");
    private static final Object zzb = new Object();
    private static volatile CastContext zzc;
    private final Context zzd;
    private final zzaa zze;
    private final SessionManager zzf;
    private final zzt zzg;
    private final PrecacheManager zzh;
    private final MediaNotificationManager zzi;
    private final CastOptions zzj;
    private final com.google.android.gms.internal.cast.zzap zzk;
    private final com.google.android.gms.internal.cast.zzak zzl;
    private final List zzm;
    private com.google.android.gms.internal.cast.zzo zzn;
    private CastReasonCodes zzo;

    private CastContext(Context context, CastOptions castOptions, List list, com.google.android.gms.internal.cast.zzap zzapVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zzj = castOptions;
        this.zzk = zzapVar;
        this.zzm = list;
        com.google.android.gms.internal.cast.zzak zzakVar = new com.google.android.gms.internal.cast.zzak(applicationContext);
        this.zzl = zzakVar;
        zzi();
        try {
            zzaa zza2 = com.google.android.gms.internal.cast.zzm.zza(applicationContext, castOptions, zzapVar, zzh());
            this.zze = zza2;
            try {
                this.zzg = new zzt(zza2.zzf());
                try {
                    SessionManager sessionManager = new SessionManager(zza2.zzg(), applicationContext);
                    this.zzf = sessionManager;
                    this.zzi = new MediaNotificationManager(sessionManager);
                    this.zzh = new PrecacheManager(castOptions, sessionManager, new com.google.android.gms.cast.internal.zzn(applicationContext));
                    com.google.android.gms.internal.cast.zzax zzn = zzapVar.zzn();
                    if (zzn != null) {
                        zzn.zzc(sessionManager);
                    }
                    try {
                        zza2.zzh(zzakVar.zza);
                        if (!castOptions.zza().isEmpty()) {
                            zza.i("Setting Route Discovery for appIds: ".concat(String.valueOf(castOptions.zza())), new Object[0]);
                            zzakVar.zza(castOptions.zza());
                        }
                        final com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(applicationContext);
                        final String[] strArr = {"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"};
                        zznVar.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zze
                            @Override // com.google.android.gms.common.api.internal.RemoteCall
                            public final void accept(Object obj, Object obj2) {
                                zzn zznVar2 = zzn.this;
                                String[] strArr2 = strArr;
                                ((zzah) ((zzo) obj).getService()).zzf(new zzk(zznVar2, (TaskCompletionSource) obj2), strArr2);
                            }
                        }).setFeatures(com.google.android.gms.cast.zzat.zzd).setAutoResolveMissingFeatures(false).setMethodKey(8425).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzc
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                CastContext.zzd(CastContext.this, (Bundle) obj);
                            }
                        });
                        final com.google.android.gms.cast.internal.zzn zznVar2 = new com.google.android.gms.cast.internal.zzn(applicationContext);
                        final String[] strArr2 = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                        zznVar2.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zzf
                            @Override // com.google.android.gms.common.api.internal.RemoteCall
                            public final void accept(Object obj, Object obj2) {
                                zzn zznVar3 = zzn.this;
                                String[] strArr3 = strArr2;
                                ((zzah) ((zzo) obj).getService()).zzg(new zzm(zznVar3, (TaskCompletionSource) obj2), strArr3);
                            }
                        }).setFeatures(com.google.android.gms.cast.zzat.zzh).setAutoResolveMissingFeatures(false).setMethodKey(8427).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzb
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                CastContext.this.zzf((Bundle) obj);
                            }
                        });
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    public static CastContext getSharedInstance() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return zzc;
    }

    public static CastContext zza(Context context) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return getSharedInstance(context);
        } catch (RuntimeException e) {
            zza.e("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ CastContext zzb(Context context, CastOptions castOptions, OptionsProvider optionsProvider, com.google.android.gms.internal.cast.zzap zzapVar) {
        synchronized (zzb) {
            if (zzc == null) {
                zzc = new CastContext(context, castOptions, optionsProvider.getAdditionalSessionProviders(context.getApplicationContext()), zzapVar);
            }
        }
        return zzc;
    }

    public static /* synthetic */ void zzd(final CastContext castContext, Bundle bundle) {
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (!z) {
            if (!z2) {
                return;
            }
            z2 = true;
        }
        String packageName = castContext.zzd.getPackageName();
        String format = String.format(Locale.ROOT, "%s.%s", castContext.zzd.getPackageName(), "client_cast_analytics_data");
        TransportRuntime.initialize(castContext.zzd);
        Transport transport = TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE).getTransport("CAST_SENDER_SDK", zzlk.class, new Transformer() { // from class: com.google.android.gms.cast.framework.zza
            @Override // com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                zzlk zzlkVar = (zzlk) obj;
                try {
                    byte[] bArr = new byte[zzlkVar.zzq()];
                    zzpg zzC = zzpg.zzC(bArr);
                    zzlkVar.zzB(zzC);
                    zzC.zzD();
                    return bArr;
                } catch (IOException e) {
                    String name = zzlkVar.getClass().getName();
                    StringBuilder sb = new StringBuilder(name.length() + 72);
                    sb.append("Serializing ");
                    sb.append(name);
                    sb.append(" to a byte array threw an IOException (should never happen).");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        });
        long j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
        final SharedPreferences sharedPreferences = castContext.zzd.getApplicationContext().getSharedPreferences(format, 0);
        final com.google.android.gms.internal.cast.zzd zza2 = com.google.android.gms.internal.cast.zzd.zza(sharedPreferences, transport, j);
        if (z) {
            final com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(castContext.zzd);
            final String[] strArr = {"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
            zznVar.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zzg
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzn zznVar2 = zzn.this;
                    String[] strArr2 = strArr;
                    ((zzah) ((zzo) obj).getService()).zzh(new zzl(zznVar2, (TaskCompletionSource) obj2), strArr2);
                }
            }).setFeatures(com.google.android.gms.cast.zzat.zzg).setAutoResolveMissingFeatures(false).setMethodKey(8426).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzd
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    CastContext.this.zze(zza2, sharedPreferences, (Bundle) obj);
                }
            });
        }
        if (z2) {
            Preconditions.checkNotNull(sharedPreferences);
            Preconditions.checkNotNull(zza2);
            com.google.android.gms.internal.cast.zzl.zza(sharedPreferences, zza2, packageName);
            com.google.android.gms.internal.cast.zzl.zzd(zzkk.CAST_CONTEXT);
        }
    }

    private static OptionsProvider zzg(Context context) {
        try {
            Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                zza.e("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string == null) {
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            }
            return (OptionsProvider) Class.forName(string).asSubclass(OptionsProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    private final Map zzh() {
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.zzo zzoVar = this.zzn;
        if (zzoVar != null) {
            hashMap.put(zzoVar.getCategory(), zzoVar.zza());
        }
        List<SessionProvider> list = this.zzm;
        if (list != null) {
            for (SessionProvider sessionProvider : list) {
                Preconditions.checkNotNull(sessionProvider, "Additional SessionProvider must not be null.");
                String checkNotEmpty = Preconditions.checkNotEmpty(sessionProvider.getCategory(), "Category for SessionProvider must not be null or empty string.");
                Preconditions.checkArgument(!hashMap.containsKey(checkNotEmpty), String.format("SessionProvider for category %s already added", checkNotEmpty));
                hashMap.put(checkNotEmpty, sessionProvider.zza());
            }
        }
        return hashMap;
    }

    @RequiresNonNull({"castOptions", "mediaRouter", "appContext"})
    private final void zzi() {
        this.zzn = !TextUtils.isEmpty(this.zzj.getReceiverApplicationId()) ? new com.google.android.gms.internal.cast.zzo(this.zzd, this.zzj, this.zzk) : null;
    }

    public void addCastStateListener(CastStateListener castStateListener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(castStateListener);
        this.zzf.zzc(castStateListener);
    }

    public CastOptions getCastOptions() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzj;
    }

    public MediaRouteSelector getMergedSelector() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return MediaRouteSelector.fromBundle(this.zze.zze());
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", zzaa.class.getSimpleName());
            return null;
        }
    }

    public SessionManager getSessionManager() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzf;
    }

    public final zzt zzc() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(com.google.android.gms.internal.cast.zzd zzdVar, SharedPreferences sharedPreferences, Bundle bundle) {
        Preconditions.checkNotNull(this.zzf);
        String packageName = this.zzd.getPackageName();
        new com.google.android.gms.internal.cast.zzh(sharedPreferences, zzdVar, bundle, packageName).zzn(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bundle bundle) {
        this.zzo = new CastReasonCodes(bundle);
    }

    @Deprecated
    public static CastContext getSharedInstance(Context context) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    OptionsProvider zzg = zzg(context.getApplicationContext());
                    CastOptions castOptions = zzg.getCastOptions(context.getApplicationContext());
                    try {
                        zzc = new CastContext(context, castOptions, zzg.getAdditionalSessionProviders(context.getApplicationContext()), new com.google.android.gms.internal.cast.zzap(MediaRouter.getInstance(context.getApplicationContext()), castOptions));
                    } catch (ModuleUnavailableException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return zzc;
    }

    public static Task<CastContext> getSharedInstance(final Context context, Executor executor) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzc == null) {
            final OptionsProvider zzg = zzg(context.getApplicationContext());
            final CastOptions castOptions = zzg.getCastOptions(context.getApplicationContext());
            final com.google.android.gms.internal.cast.zzap zzapVar = new com.google.android.gms.internal.cast.zzap(MediaRouter.getInstance(context.getApplicationContext()), castOptions);
            return Tasks.call(executor, new Callable() { // from class: com.google.android.gms.cast.framework.zze
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CastContext.zzb(context, castOptions, zzg, zzapVar);
                }
            });
        }
        return Tasks.forResult(zzc);
    }
}
