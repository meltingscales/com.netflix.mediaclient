package org.linphone.core.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import java.net.InetAddress;
import java.util.List;
import org.linphone.mediastream.Log;

/* loaded from: classes6.dex */
public class AndroidPlatformHelper {
    private ConnectivityManager mConnectivityManager;
    private WifiManager.MulticastLock mMcastLock;
    private PowerManager mPowerManager;
    private PowerManager.WakeLock mWakeLock;
    private WifiManager.WifiLock mWifiLock;

    public Object getPowerManager() {
        return this.mPowerManager;
    }

    public AndroidPlatformHelper(Object obj) {
        Context context = (Context) obj;
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        this.mPowerManager = (PowerManager) context.getSystemService("power");
        this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        PowerManager.WakeLock newWakeLock = this.mPowerManager.newWakeLock(1, "AndroidPlatformHelper");
        this.mWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(true);
        WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("AndroidPlatformHelper");
        this.mMcastLock = createMulticastLock;
        createMulticastLock.setReferenceCounted(true);
        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "AndroidPlatformHelper");
        this.mWifiLock = createWifiLock;
        createWifiLock.setReferenceCounted(true);
    }

    public String[] getDnsServers() {
        ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager != null && connectivityManager.getActiveNetwork() != null) {
            ConnectivityManager connectivityManager2 = this.mConnectivityManager;
            if (connectivityManager2.getLinkProperties(connectivityManager2.getActiveNetwork()) != null) {
                ConnectivityManager connectivityManager3 = this.mConnectivityManager;
                List<InetAddress> dnsServers = connectivityManager3.getLinkProperties(connectivityManager3.getActiveNetwork()).getDnsServers();
                String[] strArr = new String[dnsServers.size()];
                int i = 0;
                for (InetAddress inetAddress : dnsServers) {
                    strArr[i] = inetAddress.getHostAddress();
                    i++;
                }
                Log.i("getDnsServers() returning");
                return strArr;
            }
        }
        return null;
    }

    public void acquireWifiLock() {
        Log.i("acquireWifiLock()");
        this.mWifiLock.acquire();
    }

    public void releaseWifiLock() {
        Log.i("releaseWifiLock()");
        this.mWifiLock.release();
    }

    public void acquireMcastLock() {
        Log.i("acquireMcastLock()");
        this.mMcastLock.acquire();
    }

    public void releaseMcastLock() {
        Log.i("releaseMcastLock()");
        this.mMcastLock.release();
    }

    public void acquireCpuLock() {
        Log.i("acquireCpuLock()");
        this.mWakeLock.acquire();
    }

    public void releaseCpuLock() {
        Log.i("releaseCpuLock()");
        this.mWakeLock.release();
    }
}
