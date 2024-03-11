package org.chromium.net;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.List;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.CalledByNativeUnchecked;
import org.chromium.base.compat.ApiHelperForM;
import org.chromium.base.compat.ApiHelperForN;
import org.chromium.base.compat.ApiHelperForP;
import org.chromium.base.compat.ApiHelperForQ;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AndroidNetworkLibrary {
    private static final String TAG = "AndroidNetworkLibrary";
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;

    AndroidNetworkLibrary() {
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            Log.w(TAG, "could not get network interfaces: " + e);
            return false;
        }
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    @CalledByNative
    public static byte[][] getUserAddedRoots() {
        return X509Util.getUserAddedRoots();
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.addTestRootCertificate(bArr);
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() {
        X509Util.clearTestRootCertificates();
    }

    @CalledByNative
    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @CalledByNative
    private static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = ApiHelperForM.getActiveNetwork(connectivityManager)) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    private static WifiInfo getWifiInfo() {
        TransportInfo transportInfo;
        if (!haveAccessWifiState()) {
            Intent registerProtectedBroadcastReceiver = ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerProtectedBroadcastReceiver != null) {
                return (WifiInfo) registerProtectedBroadcastReceiver.getParcelableExtra("wifiInfo");
            }
            return null;
        } else if (Build.VERSION.SDK_INT >= 31) {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = ApiHelperForQ.getTransportInfo(networkCapabilities)) != null && (transportInfo instanceof WifiInfo)) {
                    return (WifiInfo) transportInfo;
                }
            }
            return null;
        } else {
            return ((WifiManager) ContextUtils.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        }
    }

    @CalledByNative
    public static String getWifiSSID() {
        String ssid;
        WifiInfo wifiInfo = getWifiInfo();
        return (wifiInfo == null || (ssid = wifiInfo.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    @CalledByNative
    public static void setWifiEnabled(boolean z) {
        ((WifiManager) ContextUtils.getApplicationContext().getSystemService("wifi")).setWifiEnabled(z);
    }

    @CalledByNative
    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int calculateSignalLevel;
        if (ContextUtils.getApplicationContext() == null || ContextUtils.getApplicationContext().getContentResolver() == null) {
            return -1;
        }
        if (haveAccessWifiState()) {
            WifiInfo wifiInfo = getWifiInfo();
            if (wifiInfo == null) {
                return -1;
            }
            intExtra = wifiInfo.getRssi();
        } else {
            try {
                Intent registerProtectedBroadcastReceiver = ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (registerProtectedBroadcastReceiver == null) {
                    return -1;
                }
                intExtra = registerProtectedBroadcastReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i)) >= 0 && calculateSignalLevel < i) {
            return calculateSignalLevel;
        }
        return -1;
    }

    /* loaded from: classes6.dex */
    public static class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted(String str) {
            return ApiHelperForN.isCleartextTrafficPermitted(str);
        }

        public boolean isCleartextTrafficPermitted() {
            return ApiHelperForM.isCleartextTrafficPermitted();
        }
    }

    @CalledByNative
    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    private static boolean haveAccessNetworkState() {
        if (sHaveAccessNetworkState == null) {
            sHaveAccessNetworkState = Boolean.valueOf(ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        if (sHaveAccessWifiState == null) {
            sHaveAccessWifiState = Boolean.valueOf(ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    @CalledByNative
    public static DnsStatus getDnsStatusForNetwork(long j) {
        Network fromNetworkHandle;
        try {
            fromNetworkHandle = Network.fromNetworkHandle(j);
            return getDnsStatus(fromNetworkHandle);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @CalledByNative
    public static DnsStatus getCurrentDnsStatus() {
        return getDnsStatus(null);
    }

    public static DnsStatus getDnsStatus(Network network) {
        ConnectivityManager connectivityManager;
        if (haveAccessNetworkState() && (connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")) != null) {
            if (network == null) {
                network = ApiHelperForM.getActiveNetwork(connectivityManager);
            }
            if (network == null) {
                return null;
            }
            try {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                if (linkProperties == null) {
                    return null;
                }
                List<InetAddress> dnsServers = linkProperties.getDnsServers();
                String domains = linkProperties.getDomains();
                if (Build.VERSION.SDK_INT >= 28) {
                    return new DnsStatus(dnsServers, ApiHelperForP.isPrivateDnsActive(linkProperties), ApiHelperForP.getPrivateDnsServerName(linkProperties), domains);
                }
                return new DnsStatus(dnsServers, false, "", domains);
            } catch (RuntimeException unused) {
                return null;
            }
        }
        return null;
    }

    @CalledByNative
    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        ApiHelperForM.reportNetworkConnectivity(connectivityManager, null, false);
        return true;
    }

    /* loaded from: classes6.dex */
    static class SocketFd extends Socket {

        /* loaded from: classes6.dex */
        static class SocketImplFd extends SocketImpl {
            @Override // java.net.SocketImpl
            protected void close() {
            }

            @Override // java.net.SocketImpl
            protected void create(boolean z) {
            }

            SocketImplFd(FileDescriptor fileDescriptor) {
                ((SocketImpl) this).fd = fileDescriptor;
            }

            @Override // java.net.SocketImpl
            protected void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected int available() {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected void bind(InetAddress inetAddress, int i) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected void connect(InetAddress inetAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected void connect(SocketAddress socketAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected void connect(String str, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            @Override // java.net.SocketImpl
            protected OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            @Override // java.net.SocketImpl
            protected void listen(int i) {
                throw new RuntimeException("listen not implemented");
            }

            @Override // java.net.SocketImpl
            protected void sendUrgentData(int i) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            @Override // java.net.SocketOptions
            public Object getOption(int i) {
                throw new RuntimeException("getOption not implemented");
            }

            @Override // java.net.SocketOptions
            public void setOption(int i, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }
        }

        SocketFd(FileDescriptor fileDescriptor) {
            super(new SocketImplFd(fileDescriptor));
        }
    }

    @CalledByNative
    private static void tagSocket(int i, int i2, int i3) {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i);
        SocketFd socketFd = new SocketFd(adoptFd.getFileDescriptor());
        TrafficStats.tagSocket(socketFd);
        socketFd.close();
        adoptFd.detachFd();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }
}
