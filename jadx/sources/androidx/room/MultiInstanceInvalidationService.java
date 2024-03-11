package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;
    private final Map<Integer, String> clientNames = new LinkedHashMap();
    private final RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            C8632dsu.c((Object) iMultiInstanceInvalidationCallback, "");
            C8632dsu.c(obj, "");
            MultiInstanceInvalidationService.this.getClientNames$room_runtime_release().remove((Integer) obj);
        }
    };
    private final IMultiInstanceInvalidationService.Stub binder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            C8632dsu.c((Object) iMultiInstanceInvalidationCallback, "");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() + 1);
                int maxClientId$room_runtime_release = multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(iMultiInstanceInvalidationCallback, Integer.valueOf(maxClientId$room_runtime_release))) {
                    multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId$room_runtime_release), str);
                    i = maxClientId$room_runtime_release;
                } else {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() - 1);
                    multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                }
            }
            return i;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
            C8632dsu.c((Object) iMultiInstanceInvalidationCallback, "");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(iMultiInstanceInvalidationCallback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(i));
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i, String[] strArr) {
            C8632dsu.c((Object) strArr, "");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i2);
                    C8632dsu.d(broadcastCookie);
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(intValue));
                    if (i != intValue && C8632dsu.c((Object) str, (Object) str2)) {
                        try {
                            multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i2).onInvalidation(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                dpR dpr = dpR.c;
            }
        }
    };

    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> getCallbackList$room_runtime_release() {
        return this.callbackList;
    }

    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.clientNames;
    }

    public final int getMaxClientId$room_runtime_release() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return this.binder;
    }

    public final void setMaxClientId$room_runtime_release(int i) {
        this.maxClientId = i;
    }
}
