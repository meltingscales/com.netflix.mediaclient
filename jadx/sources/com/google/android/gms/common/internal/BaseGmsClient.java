package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private ConnectionResult zzB;
    private boolean zzC;
    private volatile zzk zzD;
    zzv zza;
    final Handler zzb;
    protected ConnectionProgressReportCallbacks zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* loaded from: classes2.dex */
    public interface BaseConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* loaded from: classes2.dex */
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* loaded from: classes2.dex */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    /* loaded from: classes2.dex */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (BaseGmsClient.this.zzx != null) {
                BaseGmsClient.this.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(BaseGmsClient baseGmsClient, zzk zzkVar) {
        baseGmsClient.zzD = zzkVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.zzd;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        synchronized (baseGmsClient.zzp) {
            i2 = baseGmsClient.zzv;
        }
        if (i2 == 3) {
            baseGmsClient.zzC = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i3, baseGmsClient.zzd.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzn(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i) {
                return false;
            }
            baseGmsClient.zzp(i2, iInterface);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzo(BaseGmsClient baseGmsClient) {
        if (!baseGmsClient.zzC && !TextUtils.isEmpty(baseGmsClient.getServiceDescriptor()) && !TextUtils.isEmpty(baseGmsClient.getLocalStartServiceAction())) {
            try {
                Class.forName(baseGmsClient.getServiceDescriptor());
                return true;
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i, IInterface iInterface) {
        zzv zzvVar;
        zzv zzvVar2;
        Preconditions.checkArgument((i == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i;
            this.zzs = iInterface;
            if (i == 1) {
                zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    String zzb = this.zza.zzb();
                    Preconditions.checkNotNull(zzb);
                    gmsClientSupervisor.zzb(zzb, this.zza.zza(), 4225, zzeVar, zze(), this.zza.zzc());
                    this.zzu = null;
                }
            } else if (i == 2 || i == 3) {
                zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzvVar2 = this.zza) != null) {
                    String zzb2 = zzvVar2.zzb();
                    String zza = zzvVar2.zza();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzb2 + " on " + zza);
                    GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    String zzb3 = this.zza.zzb();
                    Preconditions.checkNotNull(zzb3);
                    gmsClientSupervisor2.zzb(zzb3, this.zza.zza(), 4225, zzeVar2, zze(), this.zza.zzc());
                    this.zzd.incrementAndGet();
                }
                zze zzeVar3 = new zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                    zzvVar = new zzv(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup());
                } else {
                    zzvVar = new zzv(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                }
                this.zza = zzvVar;
                if (zzvVar.zzc() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.zzb())));
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                String zzb4 = this.zza.zzb();
                Preconditions.checkNotNull(zzb4);
                if (!gmsClientSupervisor3.zzc(new zzo(zzb4, this.zza.zza(), 4225, this.zza.zzc()), zzeVar3, zze(), getBindServiceExecutor())) {
                    String zzb5 = this.zza.zzb();
                    String zza2 = this.zza.zza();
                    Log.w("GmsClient", "unable to connect to service: " + zzb5 + " on " + zza2);
                    zzl(16, null, this.zzd.get());
                }
            } else if (i == 4) {
                Preconditions.checkNotNull(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable != 0) {
            zzp(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), isGooglePlayServicesAvailable, null);
            return;
        }
        connect(new LegacyClientCallbackAdapter());
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i = 0; i < size; i++) {
                ((zzc) this.zzt.get(i)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i == 5) {
            printWriter.print("DISCONNECTING");
        } else {
            printWriter.print("UNKNOWN");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 == 3) {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            } else {
                printWriter.append((CharSequence) String.valueOf(i2));
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.getStatusCodeString(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzb;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        zzv zzvVar;
        if (!isConnected() || (zzvVar = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zzvVar.zza();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        int i2 = this.zzy;
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzj = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            synchronized (this.zzq) {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new zzd(this, this.zzd.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t = (T) this.zzs;
            Preconditions.checkNotNull(t, "Client is connected but service is null");
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzd;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = i == 2 || i == 3;
        }
        return z;
    }

    protected void onConnectedLocked(T t) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i2, -1, new zzf(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i));
    }

    protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i, Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i2, -1, new zzg(this, i, null)));
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
