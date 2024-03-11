package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    private final IMultiInstanceInvalidationCallback callback;
    private int clientId;
    private final Executor executor;
    private final InvalidationTracker invalidationTracker;
    private final String name;
    public InvalidationTracker.Observer observer;
    private final Runnable removeObserverRunnable;
    private IMultiInstanceInvalidationService service;
    private final ServiceConnection serviceConnection;
    private final Runnable setUpRunnable;
    private final AtomicBoolean stopped;

    public final int getClientId() {
        return this.clientId;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    public final IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void setObserver(InvalidationTracker.Observer observer) {
        C8632dsu.c((Object) observer, "");
        this.observer = observer;
    }

    public final void setService(IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public MultiInstanceInvalidationClient(Context context, String str, Intent intent, InvalidationTracker invalidationTracker, Executor executor) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) invalidationTracker, "");
        C8632dsu.c((Object) executor, "");
        this.name = str;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new MultiInstanceInvalidationClient$callback$1(this);
        this.stopped = new AtomicBoolean(false);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C8632dsu.c((Object) componentName, "");
                C8632dsu.c((Object) iBinder, "");
                MultiInstanceInvalidationClient.this.setService(IMultiInstanceInvalidationService.Stub.asInterface(iBinder));
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                C8632dsu.c((Object) componentName, "");
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getRemoveObserverRunnable());
                MultiInstanceInvalidationClient.this.setService(null);
            }
        };
        this.serviceConnection = serviceConnection;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.setUpRunnable$lambda$1(MultiInstanceInvalidationClient.this);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient.this);
            }
        };
        setObserver(new InvalidationTracker.Observer((String[]) invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> set) {
                C8632dsu.c((Object) set, "");
                if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                    if (service != null) {
                        service.broadcastInvalidation(MultiInstanceInvalidationClient.this.getClientId(), (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        });
        applicationContext.bindService(intent, serviceConnection, 1);
    }

    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRunnable$lambda$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        C8632dsu.c((Object) multiInstanceInvalidationClient, "");
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.service;
            if (iMultiInstanceInvalidationService != null) {
                multiInstanceInvalidationClient.clientId = iMultiInstanceInvalidationService.registerCallback(multiInstanceInvalidationClient.callback, multiInstanceInvalidationClient.name);
                multiInstanceInvalidationClient.invalidationTracker.addObserver(multiInstanceInvalidationClient.getObserver());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        C8632dsu.c((Object) multiInstanceInvalidationClient, "");
        multiInstanceInvalidationClient.invalidationTracker.removeObserver(multiInstanceInvalidationClient.getObserver());
    }
}
