package org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContextUtils;
import org.chromium.base.StrictModeContext;
import org.chromium.base.TraceEvent;
import org.chromium.base.compat.ApiHelperForM;
import org.chromium.base.compat.ApiHelperForO;
import org.chromium.base.compat.ApiHelperForP;
import org.chromium.build.BuildConfig;

@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private static final int UNKNOWN_LINK_SPEED = -1;
    private ConnectivityManagerDelegate mConnectivityManagerDelegate;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private MyNetworkCallback mNetworkCallback;
    private NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private WifiManagerDelegate mWifiManagerDelegate;

    /* loaded from: classes5.dex */
    public interface Observer {
        void onConnectionCostChanged(int i);

        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        return i != 9 ? 0 : 1;
                    }
                    return 7;
                }
                return 5;
            }
        }
        if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 3;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 4;
                case 13:
                    return 5;
                default:
                    return 0;
            }
        }
        return 8;
    }

    RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
    }

    void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.mWifiManagerDelegate = wifiManagerDelegate;
    }

    /* loaded from: classes5.dex */
    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }

        public NetworkState(boolean z, int i, int i2, boolean z2, String str, boolean z3, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mIsMetered = z2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z3;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionType() {
            if (isConnected()) {
                return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (isConnected()) {
                int networkType = getNetworkType();
                if (networkType == 0 || networkType == 4 || networkType == 5) {
                    switch (getNetworkSubType()) {
                        case 1:
                            return 7;
                        case 2:
                            return 8;
                        case 3:
                            return 9;
                        case 4:
                            return 5;
                        case 5:
                            return 10;
                        case 6:
                            return 11;
                        case 7:
                            return 6;
                        case 8:
                            return 14;
                        case 9:
                            return 15;
                        case 10:
                            return 12;
                        case 11:
                            return 4;
                        case 12:
                            return 13;
                        case 13:
                            return 18;
                        case 14:
                            return 16;
                        case 15:
                            return 17;
                        default:
                            return 0;
                    }
                }
                return 0;
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class ConnectivityManagerDelegate {
        private final ConnectivityManager mConnectivityManager;

        ConnectivityManagerDelegate(Context context) {
            this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        ConnectivityManagerDelegate() {
            this.mConnectivityManager = null;
        }

        private NetworkInfo processActiveNetworkInfo(NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1) {
                return networkInfo;
            }
            return null;
        }

        NetworkState getNetworkState(WifiManagerDelegate wifiManagerDelegate) {
            Network defaultNetwork = getDefaultNetwork();
            NetworkInfo processActiveNetworkInfo = processActiveNetworkInfo(getNetworkInfo(defaultNetwork));
            if (processActiveNetworkInfo == null) {
                return new NetworkState(false, -1, -1, false, null, false, "");
            }
            boolean z = true;
            if (defaultNetwork != null) {
                NetworkCapabilities networkCapabilities = getNetworkCapabilities(defaultNetwork);
                boolean z2 = (networkCapabilities == null || networkCapabilities.hasCapability(11)) ? false : false;
                DnsStatus dnsStatus = AndroidNetworkLibrary.getDnsStatus(defaultNetwork);
                if (dnsStatus == null) {
                    return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), z2, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(defaultNetwork)), false, "");
                }
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), z2, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(defaultNetwork)), dnsStatus.getPrivateDnsActive(), dnsStatus.getPrivateDnsServerName());
            } else if (processActiveNetworkInfo.getType() == 1) {
                if (processActiveNetworkInfo.getExtraInfo() != null && !"".equals(processActiveNetworkInfo.getExtraInfo())) {
                    return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, processActiveNetworkInfo.getExtraInfo(), false, "");
                }
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, wifiManagerDelegate.getWifiSsid(), false, "");
            } else {
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, null, false, "");
            }
        }

        NetworkInfo getRawNetworkInfo(Network network) {
            try {
                try {
                    return this.mConnectivityManager.getNetworkInfo(network);
                } catch (NullPointerException unused) {
                    return this.mConnectivityManager.getNetworkInfo(network);
                }
            } catch (NullPointerException unused2) {
                return null;
            }
        }

        NetworkInfo getNetworkInfo(Network network) {
            NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
            return (rawNetworkInfo == null || rawNetworkInfo.getType() != 17) ? rawNetworkInfo : this.mConnectivityManager.getActiveNetworkInfo();
        }

        int getConnectionType(Network network) {
            NetworkInfo networkInfo = getNetworkInfo(network);
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
        }

        protected Network[] getAllNetworksUnfiltered() {
            Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
            return allNetworks == null ? new Network[0] : allNetworks;
        }

        protected boolean vpnAccessible(Network network) {
            Socket socket = new Socket();
            try {
                try {
                    StrictModeContext allowAllVmPolicies = StrictModeContext.allowAllVmPolicies();
                    try {
                        network.bindSocket(socket);
                        if (allowAllVmPolicies != null) {
                            allowAllVmPolicies.close();
                        }
                        try {
                            socket.close();
                            return true;
                        } catch (IOException unused) {
                            return true;
                        }
                    } catch (Throwable th) {
                        if (allowAllVmPolicies != null) {
                            try {
                                allowAllVmPolicies.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    socket.close();
                    return false;
                } catch (Throwable th3) {
                    try {
                        socket.close();
                    } catch (IOException unused3) {
                    }
                    throw th3;
                }
            } catch (IOException unused4) {
                return false;
            }
        }

        protected NetworkCapabilities getNetworkCapabilities(Network network) {
            for (int i = 0; i < 2; i++) {
                try {
                    return this.mConnectivityManager.getNetworkCapabilities(network);
                } catch (SecurityException unused) {
                }
            }
            return null;
        }

        void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            if (Build.VERSION.SDK_INT >= 26) {
                ApiHelperForO.registerNetworkCallback(this.mConnectivityManager, networkRequest, networkCallback, handler);
            } else {
                this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback);
            }
        }

        void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            ApiHelperForO.registerDefaultNetworkCallback(this.mConnectivityManager, networkCallback, handler);
        }

        void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
        }

        Network getDefaultNetwork() {
            Network[] allNetworksFiltered;
            Network activeNetwork = ApiHelperForM.getActiveNetwork(this.mConnectivityManager);
            if (activeNetwork != null) {
                return activeNetwork;
            }
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
                if (rawNetworkInfo != null && (rawNetworkInfo.getType() == activeNetworkInfo.getType() || rawNetworkInfo.getType() == 17)) {
                    if (activeNetwork != null && Build.VERSION.SDK_INT >= 29) {
                        if (rawNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.CONNECTING) {
                            NetworkInfo rawNetworkInfo2 = getRawNetworkInfo(activeNetwork);
                            if (rawNetworkInfo2 != null) {
                                rawNetworkInfo2.getDetailedState();
                            }
                        }
                    }
                    activeNetwork = network;
                }
            }
            return activeNetwork;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class WifiManagerDelegate {
        private boolean mHasWifiPermission;
        private boolean mHasWifiPermissionComputed;
        private WifiManager mWifiManager;
        private final Object mLock = new Object();
        private final Context mContext = null;

        WifiManagerDelegate() {
        }

        @SuppressLint({"WifiManagerPotentialLeak"})
        private boolean hasPermissionLocked() {
            if (this.mHasWifiPermissionComputed) {
                return this.mHasWifiPermission;
            }
            boolean z = this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.mContext.getPackageName()) == 0;
            this.mHasWifiPermission = z;
            this.mWifiManager = z ? (WifiManager) this.mContext.getSystemService("wifi") : null;
            this.mHasWifiPermissionComputed = true;
            return this.mHasWifiPermission;
        }

        String getWifiSsid() {
            synchronized (this.mLock) {
                if (hasPermissionLocked()) {
                    WifiInfo wifiInfoLocked = getWifiInfoLocked();
                    if (wifiInfoLocked != null) {
                        return wifiInfoLocked.getSSID();
                    }
                    return "";
                }
                return AndroidNetworkLibrary.getWifiSSID();
            }
        }

        private WifiInfo getWifiInfoLocked() {
            try {
                try {
                    return this.mWifiManager.getConnectionInfo();
                } catch (NullPointerException unused) {
                    return this.mWifiManager.getConnectionInfo();
                }
            } catch (NullPointerException unused2) {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        private DefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }
    }

    /* loaded from: classes5.dex */
    class AndroidRDefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        LinkProperties mLinkProperties;
        NetworkCapabilities mNetworkCapabilities;

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.mLinkProperties = null;
            this.mNetworkCapabilities = null;
        }

        private AndroidRDefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.mLinkProperties = null;
            this.mNetworkCapabilities = null;
            if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(new NetworkState(false, -1, -1, false, null, false, ""));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            this.mLinkProperties = linkProperties;
            if (!NetworkChangeNotifierAutoDetect.this.mRegistered || this.mLinkProperties == null || this.mNetworkCapabilities == null) {
                return;
            }
            NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(getNetworkState(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            this.mNetworkCapabilities = networkCapabilities;
            if (!NetworkChangeNotifierAutoDetect.this.mRegistered || this.mLinkProperties == null || this.mNetworkCapabilities == null) {
                return;
            }
            NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(getNetworkState(network));
        }

        private NetworkState getNetworkState(Network network) {
            int i;
            int i2;
            int i3;
            if (!this.mNetworkCapabilities.hasTransport(1) && !this.mNetworkCapabilities.hasTransport(5)) {
                if (this.mNetworkCapabilities.hasTransport(0)) {
                    NetworkInfo rawNetworkInfo = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getRawNetworkInfo(network);
                    i3 = rawNetworkInfo != null ? rawNetworkInfo.getSubtype() : -1;
                    i2 = 0;
                } else if (this.mNetworkCapabilities.hasTransport(3)) {
                    i = 9;
                } else if (this.mNetworkCapabilities.hasTransport(2)) {
                    i = 7;
                } else if (this.mNetworkCapabilities.hasTransport(4)) {
                    NetworkInfo networkInfo = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkInfo(network);
                    i = networkInfo != null ? networkInfo.getType() : 17;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                return new NetworkState(true, i2, i3, !this.mNetworkCapabilities.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), ApiHelperForP.isPrivateDnsActive(this.mLinkProperties), ApiHelperForP.getPrivateDnsServerName(this.mLinkProperties));
            }
            i = 1;
            i2 = i;
            i3 = -1;
            return new NetworkState(true, i2, i3, !this.mNetworkCapabilities.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), ApiHelperForP.isPrivateDnsActive(this.mLinkProperties), ApiHelperForP.getPrivateDnsServerName(this.mLinkProperties));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class MyNetworkCallback extends ConnectivityManager.NetworkCallback {
        private Network mVpnInPlace;

        private MyNetworkCallback() {
        }

        void initializeVpnInPlace() {
            NetworkCapabilities networkCapabilities;
            Network[] allNetworksFiltered = NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, null);
            this.mVpnInPlace = null;
            if (allNetworksFiltered.length == 1 && (networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(allNetworksFiltered[0])) != null && networkCapabilities.hasTransport(4)) {
                this.mVpnInPlace = allNetworksFiltered[0];
            }
        }

        private boolean ignoreNetworkDueToVpn(Network network) {
            Network network2 = this.mVpnInPlace;
            return (network2 == null || network2.equals(network)) ? false : true;
        }

        private boolean ignoreConnectedInaccessibleVpn(Network network, NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
            }
            return networkCapabilities == null || (networkCapabilities.hasTransport(4) && !NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.vpnAccessible(network));
        }

        private boolean ignoreConnectedNetwork(Network network, NetworkCapabilities networkCapabilities) {
            return ignoreNetworkDueToVpn(network) || ignoreConnectedInaccessibleVpn(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Network network2;
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onAvailable");
            try {
                NetworkCapabilities networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
                if (ignoreConnectedNetwork(network, networkCapabilities)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                final boolean z = networkCapabilities.hasTransport(4) && ((network2 = this.mVpnInPlace) == null || !network.equals(network2));
                if (z) {
                    this.mVpnInPlace = network;
                }
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        if (z) {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                            NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId});
                        }
                    }
                });
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onCapabilitiesChanged");
            try {
                if (ignoreConnectedNetwork(network, networkCapabilities)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.2
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                    }
                });
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onLosing");
            try {
                if (ignoreConnectedNetwork(network, null)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.3
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkSoonToDisconnect(networkToNetId);
                    }
                });
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(final Network network) {
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onLost");
            try {
                if (ignoreNetworkDueToVpn(network)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.4
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                    }
                });
                if (this.mVpnInPlace != null) {
                    this.mVpnInPlace = null;
                    for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, network)) {
                        onAvailable(network2);
                    }
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState().getConnectionType();
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.5
                        @Override // java.lang.Runnable
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                        }
                    });
                }
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        protected abstract void destroy();

        /* JADX INFO: Access modifiers changed from: protected */
        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void register() {
            this.mNotifier.register();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void unregister() {
            this.mNotifier.unregister();
        }
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
        this.mObserver = observer;
        this.mConnectivityManagerDelegate = new ConnectivityManagerDelegate(ContextUtils.getApplicationContext());
        int i = Build.VERSION.SDK_INT;
        this.mNetworkCallback = new MyNetworkCallback();
        this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i >= 30) {
            this.mDefaultNetworkCallback = new AndroidRDefaultNetworkCallback();
        } else {
            this.mDefaultNetworkCallback = i >= 28 ? new DefaultNetworkCallback() : null;
        }
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    private void assertOnThread() {
        if (BuildConfig.ENABLE_ASSERTS && !onThread()) {
            throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeNotifierAutoDetect.this.lambda$runOnThread$0(runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    public void destroy() {
        assertOnThread();
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public void register() {
        assertOnThread();
        if (this.mRegistered) {
            connectionTypeChanged();
            return;
        }
        if (this.mShouldSignalObserver) {
            connectionTypeChanged();
        }
        ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
        if (networkCallback != null) {
            try {
                this.mConnectivityManagerDelegate.registerDefaultNetworkCallback(networkCallback, this.mHandler);
            } catch (RuntimeException unused) {
                this.mDefaultNetworkCallback = null;
            }
        }
        if (this.mDefaultNetworkCallback == null) {
            this.mIgnoreNextBroadcast = ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), this, this.mIntentFilter) != null;
        }
        this.mRegistered = true;
        MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
        if (myNetworkCallback != null) {
            myNetworkCallback.initializeVpnInPlace();
            try {
                this.mConnectivityManagerDelegate.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
            } catch (RuntimeException unused2) {
                this.mRegisterNetworkCallbackFailed = true;
                this.mNetworkCallback = null;
            }
            if (this.mRegisterNetworkCallbackFailed || !this.mShouldSignalObserver) {
                return;
            }
            Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
            long[] jArr = new long[allNetworksFiltered.length];
            for (int i = 0; i < allNetworksFiltered.length; i++) {
                jArr[i] = networkToNetId(allNetworksFiltered[i]);
            }
            this.mObserver.purgeActiveNetworkList(jArr);
        }
    }

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mRegistered = false;
            MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
            if (myNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(myNetworkCallback);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(networkCallback);
            } else {
                ContextUtils.getApplicationContext().unregisterReceiver(this);
            }
        }
    }

    public NetworkState getCurrentNetworkState() {
        return this.mConnectivityManagerDelegate.getNetworkState(this.mWifiManagerDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] getAllNetworksFiltered(ConnectivityManagerDelegate connectivityManagerDelegate, Network network) {
        NetworkCapabilities networkCapabilities;
        Network[] allNetworksUnfiltered = connectivityManagerDelegate.getAllNetworksUnfiltered();
        int i = 0;
        for (Network network2 : allNetworksUnfiltered) {
            if (!network2.equals(network) && (networkCapabilities = connectivityManagerDelegate.getNetworkCapabilities(network2)) != null && networkCapabilities.hasCapability(12)) {
                if (networkCapabilities.hasTransport(4)) {
                    if (connectivityManagerDelegate.vpnAccessible(network2)) {
                        return new Network[]{network2};
                    }
                } else {
                    allNetworksUnfiltered[i] = network2;
                    i++;
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworksUnfiltered, i);
    }

    public long[] getNetworksAndTypes() {
        Network network;
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        long[] jArr = new long[allNetworksFiltered.length * 2];
        int length = allNetworksFiltered.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            jArr[i] = networkToNetId(allNetworksFiltered[i2]);
            jArr[i + 1] = this.mConnectivityManagerDelegate.getConnectionType(network);
            i2++;
            i += 2;
        }
        return jArr;
    }

    public long getDefaultNetId() {
        Network defaultNetwork = this.mConnectivityManagerDelegate.getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return networkToNetId(defaultNetwork);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.1
            @Override // java.lang.Runnable
            public void run() {
                if (NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast) {
                    NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast = false;
                } else {
                    NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        connectionTypeChangedTo(getCurrentNetworkState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static long networkToNetId(Network network) {
        return ApiHelperForM.getNetworkHandle(network);
    }
}
