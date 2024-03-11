package com.netflix.mediaclient.service.pushnotification;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils;
import java.util.Map;
import o.C1044Mm;
import o.C5168btf;
import o.C8166dfJ;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5130bsu;

/* loaded from: classes4.dex */
public abstract class PushJobServiceUtils {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "nf_push_service";

    /* loaded from: classes4.dex */
    public static final class NetflixServiceConnection implements ServiceConnection {
        public static final int $stable = 8;
        private NetflixServiceReadyCallback netflixNetflixServiceCallback;

        public NetflixServiceConnection(Object obj) {
            this.netflixNetflixServiceCallback = new NetflixServiceReadyCallback(obj);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C8632dsu.c((Object) componentName, "");
            C8632dsu.c((Object) iBinder, "");
            C1044Mm.e(PushJobServiceUtils.TAG, "ServiceConnected with IBinder");
            InterfaceC5130bsu b = ((NetflixService.e) iBinder).b();
            NetflixServiceReadyCallback netflixServiceReadyCallback = this.netflixNetflixServiceCallback;
            C8632dsu.d(b);
            netflixServiceReadyCallback.fillIn(this, b);
            b.b(this.netflixNetflixServiceCallback);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C8632dsu.c((Object) componentName, "");
            C1044Mm.e(PushJobServiceUtils.TAG, "onServiceDisconnected");
        }
    }

    /* loaded from: classes4.dex */
    public static final class NetflixServiceReadyCallback extends C5168btf {
        public static final int $stable = 8;
        private InterfaceC5130bsu netflixService;
        private final Object receivedMsg;
        private ServiceConnection serviceConnection;

        public final void fillIn(ServiceConnection serviceConnection, InterfaceC5130bsu interfaceC5130bsu) {
            C8632dsu.c((Object) serviceConnection, "");
            C8632dsu.c((Object) interfaceC5130bsu, "");
            this.netflixService = interfaceC5130bsu;
            this.serviceConnection = serviceConnection;
        }

        public NetflixServiceReadyCallback(Object obj) {
            this.receivedMsg = obj;
        }

        @Override // o.C5168btf, o.InterfaceC5133bsx
        public void onServiceReady(int i, Status status, String str) {
            C8632dsu.c((Object) status, "");
            if (this.netflixService != null) {
                if (status.j()) {
                    Companion companion = PushJobServiceUtils.Companion;
                    InterfaceC5130bsu interfaceC5130bsu = this.netflixService;
                    if (interfaceC5130bsu == null) {
                        C8632dsu.d("");
                        interfaceC5130bsu = null;
                    }
                    Context applicationContext = interfaceC5130bsu.getApplicationContext();
                    C8632dsu.a(applicationContext, "");
                    Intent buildOnMessageIntent = companion.buildOnMessageIntent(applicationContext, this.receivedMsg);
                    C1044Mm.b(PushJobServiceUtils.TAG, "sending message to netflixService:", buildOnMessageIntent);
                    InterfaceC5130bsu interfaceC5130bsu2 = this.netflixService;
                    if (interfaceC5130bsu2 == null) {
                        C8632dsu.d("");
                        interfaceC5130bsu2 = null;
                    }
                    interfaceC5130bsu2.e(buildOnMessageIntent);
                } else {
                    C1044Mm.e(PushJobServiceUtils.TAG, "dropping received intent: %s, service init failed: %s", this.receivedMsg, status);
                }
                InterfaceC5130bsu interfaceC5130bsu3 = this.netflixService;
                if (interfaceC5130bsu3 == null) {
                    C8632dsu.d("");
                    interfaceC5130bsu3 = null;
                }
                interfaceC5130bsu3.e(this);
                if (this.serviceConnection != null) {
                    C8166dfJ.e(null, false, 3, null);
                    new Handler().postDelayed(new Runnable() { // from class: com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils$NetflixServiceReadyCallback$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PushJobServiceUtils.NetflixServiceReadyCallback.onServiceReady$lambda$0(PushJobServiceUtils.NetflixServiceReadyCallback.this);
                        }
                    }, 10000L);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onServiceReady$lambda$0(NetflixServiceReadyCallback netflixServiceReadyCallback) {
            C8632dsu.c((Object) netflixServiceReadyCallback, "");
            try {
                C1044Mm.e(PushJobServiceUtils.TAG, "unbinding service");
                InterfaceC5130bsu interfaceC5130bsu = netflixServiceReadyCallback.netflixService;
                ServiceConnection serviceConnection = null;
                if (interfaceC5130bsu == null) {
                    C8632dsu.d("");
                    interfaceC5130bsu = null;
                }
                Context applicationContext = interfaceC5130bsu.getApplicationContext();
                ServiceConnection serviceConnection2 = netflixServiceReadyCallback.serviceConnection;
                if (serviceConnection2 == null) {
                    C8632dsu.d("");
                } else {
                    serviceConnection = serviceConnection2;
                }
                applicationContext.unbindService(serviceConnection);
            } catch (Exception e) {
                C1044Mm.e(PushJobServiceUtils.TAG, "could not unbind service " + e.getMessage());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class NetflixServiceConnectionForPushServiceRegistration implements ServiceConnection {
        public static final int $stable = 8;
        private NetflixServiceReadyCallbackForPushServiceRegistration netflixNetflixServiceCallback;

        public NetflixServiceConnectionForPushServiceRegistration(String str) {
            C8632dsu.c((Object) str, "");
            this.netflixNetflixServiceCallback = new NetflixServiceReadyCallbackForPushServiceRegistration(str);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C8632dsu.c((Object) componentName, "");
            C8632dsu.c((Object) iBinder, "");
            C1044Mm.e(PushJobServiceUtils.TAG, "ServiceConnected with IBinder");
            InterfaceC5130bsu b = ((NetflixService.e) iBinder).b();
            NetflixServiceReadyCallbackForPushServiceRegistration netflixServiceReadyCallbackForPushServiceRegistration = this.netflixNetflixServiceCallback;
            C8632dsu.d(b);
            netflixServiceReadyCallbackForPushServiceRegistration.fillIn(this, b);
            b.b(this.netflixNetflixServiceCallback);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C8632dsu.c((Object) componentName, "");
            C1044Mm.e(PushJobServiceUtils.TAG, "onServiceDisconnected");
        }
    }

    /* loaded from: classes6.dex */
    public static final class NetflixServiceReadyCallbackForPushServiceRegistration extends C5168btf {
        public static final int $stable = 8;
        private InterfaceC5130bsu netflixService;
        private final String registrationId;
        private ServiceConnection serviceConnection;

        public final void fillIn(ServiceConnection serviceConnection, InterfaceC5130bsu interfaceC5130bsu) {
            C8632dsu.c((Object) serviceConnection, "");
            C8632dsu.c((Object) interfaceC5130bsu, "");
            this.netflixService = interfaceC5130bsu;
            this.serviceConnection = serviceConnection;
        }

        public NetflixServiceReadyCallbackForPushServiceRegistration(String str) {
            C8632dsu.c((Object) str, "");
            this.registrationId = str;
        }

        @Override // o.C5168btf, o.InterfaceC5133bsx
        public void onServiceReady(int i, Status status, String str) {
            C8632dsu.c((Object) status, "");
            if (this.netflixService != null) {
                if (status.j()) {
                    Companion companion = PushJobServiceUtils.Companion;
                    InterfaceC5130bsu interfaceC5130bsu = this.netflixService;
                    if (interfaceC5130bsu == null) {
                        C8632dsu.d("");
                        interfaceC5130bsu = null;
                    }
                    Context applicationContext = interfaceC5130bsu.getApplicationContext();
                    C8632dsu.a(applicationContext, "");
                    Intent buildOnRegisteredIntent = companion.buildOnRegisteredIntent(applicationContext, this.registrationId);
                    C1044Mm.b(PushJobServiceUtils.TAG, "sending registration to netflixService:", buildOnRegisteredIntent);
                    InterfaceC5130bsu interfaceC5130bsu2 = this.netflixService;
                    if (interfaceC5130bsu2 == null) {
                        C8632dsu.d("");
                        interfaceC5130bsu2 = null;
                    }
                    interfaceC5130bsu2.e(buildOnRegisteredIntent);
                } else {
                    C1044Mm.e(PushJobServiceUtils.TAG, "dropping received registration: %s, service init failed: %s", this.registrationId, status);
                }
                InterfaceC5130bsu interfaceC5130bsu3 = this.netflixService;
                if (interfaceC5130bsu3 == null) {
                    C8632dsu.d("");
                    interfaceC5130bsu3 = null;
                }
                interfaceC5130bsu3.e(this);
                if (this.serviceConnection != null) {
                    C8166dfJ.e(null, false, 3, null);
                    new Handler().postDelayed(new Runnable() { // from class: com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils$NetflixServiceReadyCallbackForPushServiceRegistration$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PushJobServiceUtils.NetflixServiceReadyCallbackForPushServiceRegistration.onServiceReady$lambda$0(PushJobServiceUtils.NetflixServiceReadyCallbackForPushServiceRegistration.this);
                        }
                    }, 10000L);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onServiceReady$lambda$0(NetflixServiceReadyCallbackForPushServiceRegistration netflixServiceReadyCallbackForPushServiceRegistration) {
            C8632dsu.c((Object) netflixServiceReadyCallbackForPushServiceRegistration, "");
            try {
                C1044Mm.e(PushJobServiceUtils.TAG, "unbinding service");
                InterfaceC5130bsu interfaceC5130bsu = netflixServiceReadyCallbackForPushServiceRegistration.netflixService;
                ServiceConnection serviceConnection = null;
                if (interfaceC5130bsu == null) {
                    C8632dsu.d("");
                    interfaceC5130bsu = null;
                }
                Context applicationContext = interfaceC5130bsu.getApplicationContext();
                ServiceConnection serviceConnection2 = netflixServiceReadyCallbackForPushServiceRegistration.serviceConnection;
                if (serviceConnection2 == null) {
                    C8632dsu.d("");
                } else {
                    serviceConnection = serviceConnection2;
                }
                applicationContext.unbindService(serviceConnection);
            } catch (Exception e) {
                C1044Mm.e(PushJobServiceUtils.TAG, "could not unbind service " + e.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Intent getNetflixServiceIntent(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, NetflixService.class);
        }

        public final Intent buildOnRegisteredIntent(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            return addDataToIntent(createBaseIntentToSend(context, "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_ONREGISTERED"), str);
        }

        public final Intent buildOnMessageIntent(Context context, Object obj) {
            C8632dsu.c((Object) context, "");
            Intent createBaseIntentToSend = createBaseIntentToSend(context, "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_ONMESSAGE");
            return obj != null ? addDataToIntent(createBaseIntentToSend, obj) : createBaseIntentToSend;
        }

        public final Intent createBaseIntentToSend(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            Intent intent = new Intent(str);
            intent.setClass(context, NetflixService.class);
            intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
            intent.putExtra("isRunning", NetflixService.i());
            return intent;
        }

        public final Intent addDataToIntent(Intent intent, Object obj) {
            C8632dsu.c((Object) intent, "");
            C8632dsu.c(obj, "");
            if (obj instanceof String) {
                intent.putExtra("reg_id", (String) obj);
            } else if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                for (String str : bundle.keySet()) {
                    Object obj2 = bundle.get(str);
                    intent.putExtra(str, obj2 != null ? obj2.toString() : null);
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                for (Object obj3 : map.keySet()) {
                    if (obj3 instanceof String) {
                        String str2 = (String) obj3;
                        Object obj4 = map.get(obj3);
                        intent.putExtra(str2, obj4 != null ? obj4.toString() : null);
                    }
                }
            }
            return intent;
        }
    }
}
