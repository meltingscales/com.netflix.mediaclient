package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.MobileConnection;
import com.netflix.cl.model.context.WifiConnection;
import com.netflix.cl.model.context.WiredConnection;

/* renamed from: o.aUl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1955aUl {
    private boolean a;
    private boolean c;
    private boolean d;

    private void a() {
        this.c = false;
        this.d = false;
        this.a = false;
    }

    public void c(Context context) {
        C1044Mm.e("nf_log_cl", "handleConnectivityChange started");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            C1044Mm.j("nf_log_cl", "Connectivity manager is gone! Connectivity is lost!");
            c();
            return;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            C1044Mm.j("nf_log_cl", "Connectivity manager exist, but no active connection! Connectivity is lost!");
            c();
            return;
        }
        boolean isConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                this.c = isConnectedOrConnecting;
                this.d = false;
                this.a = false;
                if (isConnectedOrConnecting) {
                    Logger.INSTANCE.addContext(new WifiConnection());
                } else {
                    Logger.INSTANCE.removeExclusiveContext(WifiConnection.class);
                }
                Logger logger = Logger.INSTANCE;
                logger.removeExclusiveContext(WiredConnection.class);
                logger.removeExclusiveContext(MobileConnection.class);
                return;
            } else if (type != 6) {
                if (type == 9) {
                    this.c = false;
                    this.d = false;
                    this.a = isConnectedOrConnecting;
                    if (isConnectedOrConnecting) {
                        Logger.INSTANCE.addContext(new WiredConnection());
                    } else {
                        Logger.INSTANCE.removeExclusiveContext(WiredConnection.class);
                    }
                    Logger logger2 = Logger.INSTANCE;
                    logger2.removeExclusiveContext(WifiConnection.class);
                    logger2.removeExclusiveContext(MobileConnection.class);
                    return;
                }
                C1044Mm.e("nf_log_cl", "Not supported network type " + type);
                return;
            }
        }
        this.c = false;
        this.d = isConnectedOrConnecting;
        this.a = false;
        if (isConnectedOrConnecting) {
            Logger.INSTANCE.addContext(new MobileConnection());
        } else {
            Logger.INSTANCE.removeExclusiveContext(MobileConnection.class);
        }
        Logger logger3 = Logger.INSTANCE;
        logger3.removeExclusiveContext(WiredConnection.class);
        logger3.removeExclusiveContext(WifiConnection.class);
    }

    private void c() {
        a();
        Logger logger = Logger.INSTANCE;
        logger.removeExclusiveContext(WiredConnection.class);
        logger.removeExclusiveContext(WifiConnection.class);
        logger.removeExclusiveContext(MobileConnection.class);
    }
}
