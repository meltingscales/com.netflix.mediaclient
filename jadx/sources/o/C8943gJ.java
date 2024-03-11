package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.gJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8943gJ extends AbstractC8935gB {
    private IGetInstallReferrerService b;
    private int c = 0;
    private ServiceConnection d;
    private final Context e;

    /* renamed from: o.gJ$d */
    /* loaded from: classes2.dex */
    final class d implements ServiceConnection {
        private final InterfaceC8940gG a;

        private d(InterfaceC8940gG interfaceC8940gG) {
            if (interfaceC8940gG == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.a = interfaceC8940gG;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C8941gH.c("InstallReferrerClient", "Install Referrer service connected.");
            C8943gJ.this.b = IGetInstallReferrerService.Stub.b(iBinder);
            C8943gJ.this.c = 2;
            this.a.c(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C8941gH.d("InstallReferrerClient", "Install Referrer service disconnected.");
            C8943gJ.this.b = null;
            C8943gJ.this.c = 0;
            this.a.d();
        }
    }

    public C8943gJ(Context context) {
        this.e = context.getApplicationContext();
    }

    private boolean d() {
        try {
            return this.e.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // o.AbstractC8935gB
    public void a() {
        this.c = 3;
        if (this.d != null) {
            C8941gH.c("InstallReferrerClient", "Unbinding from service.");
            this.e.unbindService(this.d);
            this.d = null;
        }
        this.b = null;
    }

    @Override // o.AbstractC8935gB
    public C8939gF b() {
        if (!e()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.e.getPackageName());
        try {
            return new C8939gF(this.b.c(bundle));
        } catch (RemoteException e) {
            C8941gH.d("InstallReferrerClient", "RemoteException getting install referrer information");
            this.c = 0;
            throw e;
        }
    }

    @Override // o.AbstractC8935gB
    public void b(InterfaceC8940gG interfaceC8940gG) {
        ServiceInfo serviceInfo;
        if (e()) {
            C8941gH.c("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            interfaceC8940gG.c(0);
            return;
        }
        int i = this.c;
        if (i == 1) {
            C8941gH.d("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            interfaceC8940gG.c(3);
        } else if (i == 3) {
            C8941gH.d("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            interfaceC8940gG.c(3);
        } else {
            C8941gH.c("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.c = 0;
                C8941gH.c("InstallReferrerClient", "Install Referrer service unavailable on device.");
                interfaceC8940gG.c(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !d()) {
                C8941gH.d("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.c = 0;
                interfaceC8940gG.c(2);
                return;
            }
            Intent intent2 = new Intent(intent);
            d dVar = new d(interfaceC8940gG);
            this.d = dVar;
            try {
                if (this.e.bindService(intent2, dVar, 1)) {
                    C8941gH.c("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                C8941gH.d("InstallReferrerClient", "Connection to service is blocked.");
                this.c = 0;
                interfaceC8940gG.c(1);
            } catch (SecurityException unused) {
                C8941gH.d("InstallReferrerClient", "No permission to connect to service.");
                this.c = 0;
                interfaceC8940gG.c(4);
            }
        }
    }

    public boolean e() {
        return (this.c != 2 || this.b == null || this.d == null) ? false : true;
    }
}
