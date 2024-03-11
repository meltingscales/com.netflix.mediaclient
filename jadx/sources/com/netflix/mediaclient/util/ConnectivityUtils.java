package com.netflix.mediaclient.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.net.LogMobileType;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.Locale;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1596aHd;
import o.C8115deL;
import o.C8138dei;
import o.C9580sM;
import o.InterfaceC1598aHf;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ConnectivityUtils {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int b = 1;
    private static int[] b$s52$381 = {1697729980, 53174422, 1056236755, -520769534, 1429722146, 1257088259, -152385568, 1730831937, -1968881825, 1755049843, 172048676, 1836526563, 586467654, 1330881092, -1865567679, -710184725, -1465006942, 999804677};
    private static int d;

    /* loaded from: classes.dex */
    public enum NetType {
        wifi,
        mobile,
        wired;

        public static NetType b(String str) {
            NetType[] values;
            for (NetType netType : values()) {
                if (netType.name().equals(str)) {
                    return netType;
                }
            }
            return null;
        }
    }

    @SuppressLint({"netflix.GetWifiManager"})
    public static WifiManager j(Context context) {
        int i = 2 % 2;
        int i2 = b + 117;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            if (context == null) {
                return null;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            int i3 = d + 63;
            b = i3 % 128;
            int i4 = i3 % 2;
            return wifiManager;
        }
        throw null;
    }

    public static boolean o(Context context) {
        int i = 2 % 2;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null!");
        }
        ConnectivityManager e = e();
        if (e == null) {
            int i2 = b + 53;
            d = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NetworkInfo c = c(e);
        if (c != null) {
            int i4 = b + 15;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                if (c.isConnectedOrConnecting()) {
                    int i5 = d;
                    int i6 = i5 + 51;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 101;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    return true;
                }
                return false;
            }
            c.isConnectedOrConnecting();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return false;
    }

    public static LogMobileType d(Context context) {
        int i = 2 % 2;
        int i2 = b + 65;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (context == null) {
            throw new IllegalArgumentException("Activity cannot be null!");
        }
        ConnectivityManager e = e();
        if (e != null) {
            NetworkInfo c = c(e);
            if (c == null) {
                return LogMobileType.UKNOWN;
            }
            return LogMobileType.d(c);
        }
        int i4 = d + 93;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return LogMobileType.UKNOWN;
        }
        LogMobileType logMobileType = LogMobileType.UKNOWN;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static ConnectivityManager e() {
        int i = 2 % 2;
        int i2 = d + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        Context d2 = AbstractApplicationC1040Mh.d();
        if (d2 != null) {
            int i4 = b + 39;
            d = i4 % 128;
            int i5 = i4 % 2;
            ConnectivityManager connectivityManager = (ConnectivityManager) d2.getSystemService("connectivity");
            if (i5 != 0) {
                int i6 = 19 / 0;
            }
            int i7 = b + 85;
            d = i7 % 128;
            int i8 = i7 % 2;
            return connectivityManager;
        }
        return null;
    }

    public static NetworkInfo a(Context context) {
        int i = 2 % 2;
        if (context != null) {
            ConnectivityManager e = e();
            if (e == null) {
                return null;
            }
            return c(e);
        }
        int i2 = b + 43;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return null;
    }

    public static String f(Context context) {
        int i = 2 % 2;
        if (context == null) {
            int i2 = b + 75;
            d = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        ConnectivityManager e = e();
        if (e == null) {
            int i4 = d + 113;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return "";
            }
            throw null;
        }
        NetworkInfo c = c(e);
        if (c == null) {
            int i5 = b + 75;
            d = i5 % 128;
            int i6 = i5 % 2;
            return "";
        }
        C1044Mm.e("nf_net", "networkInfo type: " + c.getType());
        int type = c.getType();
        if (type != 1) {
            if (type != 9) {
                if (type != 6) {
                    int i7 = d + 115;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (type == 72) {
                            return "bluetooth";
                        }
                    } else if (type == 7) {
                        return "bluetooth";
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        C1044Mm.e("nf_net", "tm type: " + telephonyManager.getPhoneType());
                        int phoneType = telephonyManager.getPhoneType();
                        return phoneType != 1 ? phoneType != 2 ? "mobile" : "cdma" : "gsm";
                    }
                    return "mobile";
                }
                return "wimax";
            }
            return "wired";
        }
        return "wifi";
    }

    public static boolean p(Context context) {
        int i = 2 % 2;
        String f = f(context);
        if (f.equals("mobile") || !(!f.equals("cdma"))) {
            return true;
        }
        int i2 = b + 29;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
            if (f.equals("gsm")) {
                return true;
            }
        } else if (f.equals("gsm")) {
            return true;
        }
        int i4 = d + 61;
        b = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        r4 = r4.getSimState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r4 != 5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        r4 = com.netflix.mediaclient.util.ConnectivityUtils.b;
        r1 = r4 + 57;
        com.netflix.mediaclient.util.ConnectivityUtils.d = r1 % 128;
        r1 = r1 % 2;
        r4 = r4 + 65;
        com.netflix.mediaclient.util.ConnectivityUtils.d = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        o.C1044Mm.e("nf_net", "tm simState: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(android.content.Context r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r4 != 0) goto L10
            int r4 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r4 = r4 + 81
            int r2 = r4 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r2
            int r4 = r4 % r0
            return r1
        L10:
            android.net.ConnectivityManager r2 = e()
            if (r2 == 0) goto L6d
            android.net.NetworkInfo r2 = c(r2)
            if (r2 == 0) goto L6d
            int r2 = com.netflix.mediaclient.util.ConnectivityUtils.d
            int r2 = r2 + 29
            int r3 = r2 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.b = r3
            int r2 = r2 % r0
            java.lang.String r3 = "phone"
            if (r2 != 0) goto L35
            java.lang.Object r4 = r4.getSystemService(r3)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            r2 = 70
            int r2 = r2 / r1
            if (r4 != 0) goto L3e
            goto L3d
        L35:
            java.lang.Object r4 = r4.getSystemService(r3)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            if (r4 != 0) goto L3e
        L3d:
            return r1
        L3e:
            int r4 = r4.getSimState()
            r2 = 5
            if (r4 != r2) goto L57
            int r4 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r1 = r4 + 57
            int r2 = r1 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r2
            int r1 = r1 % r0
            int r4 = r4 + 65
            int r1 = r4 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r1
            int r4 = r4 % r0
            r4 = 1
            return r4
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "tm simState: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "nf_net"
            java.lang.String r0 = r0.toString()
            o.C1044Mm.e(r4, r0)
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.ConnectivityUtils.k(android.content.Context):boolean");
    }

    public static boolean l(Context context) {
        int i = 2 % 2;
        if (context == null) {
            int i2 = d + 9;
            b = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ConnectivityManager e = e();
        if (e == null) {
            int i4 = d + 115;
            b = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NetworkInfo c = c(e);
        if (c == null) {
            int i6 = b + 117;
            d = i6 % 128;
            return i6 % 2 != 0;
        }
        return c.isConnected();
    }

    public static boolean n(Context context) {
        int i = 2 % 2;
        if (context == null) {
            int i2 = d + 109;
            b = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ConnectivityManager e = e();
        if (e == null) {
            int i4 = b + 115;
            d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NetworkInfo c = c(e);
        if (c == null) {
            return false;
        }
        return c.isConnectedOrConnecting();
    }

    public static boolean m(Context context) {
        int i = 2 % 2;
        if (context == null) {
            int i2 = d + 19;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        LogMobileType d2 = d(context);
        if (!LogMobileType.WIFI.equals(d2)) {
            int i3 = d + 103;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
                if (!LogMobileType.Ethernet.equals(d2)) {
                    return false;
                }
            } else if (!LogMobileType.Ethernet.equals(d2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        r3 = b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        r3 = com.netflix.mediaclient.util.ConnectivityUtils.d + 117;
        com.netflix.mediaclient.util.ConnectivityUtils.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if ((r3 % 2) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        r3 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        return android.text.format.Formatter.formatIpAddress(r3.getIpAddress());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(android.content.Context r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            android.net.wifi.WifiManager r3 = j(r3)
            r1 = 85
            int r1 = r1 / 0
            if (r3 != 0) goto L21
            goto L20
        L1a:
            android.net.wifi.WifiManager r3 = j(r3)
            if (r3 != 0) goto L21
        L20:
            return r2
        L21:
            android.net.wifi.WifiInfo r3 = b(r3)
            if (r3 != 0) goto L37
            int r3 = com.netflix.mediaclient.util.ConnectivityUtils.d
            int r3 = r3 + 117
            int r1 = r3 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.b = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L36
            r3 = 81
            int r3 = r3 / 0
        L36:
            return r2
        L37:
            int r3 = r3.getIpAddress()
            java.lang.String r3 = android.text.format.Formatter.formatIpAddress(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.ConnectivityUtils.g(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.ConnectivityUtils.h(android.content.Context):java.lang.String");
    }

    public static InetAddress e(boolean z, boolean z2) {
        Enumeration<NetworkInterface> networkInterfaces;
        int i = 2 % 2;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (Throwable th) {
            C1044Mm.e("nf_net", "Failed to get IP address", th);
        }
        if (networkInterfaces == null) {
            return null;
        }
        while (!(!networkInterfaces.hasMoreElements())) {
            int i2 = b + 15;
            d = i2 % 128;
            int i3 = i2 % 2;
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement != null) {
                if (nextElement.isLoopback()) {
                    C1044Mm.e("nf_net", "NI is loopback, skip");
                } else if (nextElement.isVirtual()) {
                    C1044Mm.e("nf_net", "NI is virtual, skip");
                    int i4 = b + 115;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                } else if (!nextElement.isUp()) {
                    C1044Mm.e("nf_net", "NI is not up, skip");
                } else if (nextElement.getInetAddresses() != null) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress()) {
                            C1044Mm.a("nf_net", "getLocalInetAddress:: Found: %s", nextElement2);
                            if (z && (nextElement2 instanceof Inet4Address)) {
                                return nextElement2;
                            }
                            if (z2) {
                                int i6 = b + 7;
                                int i7 = i6 % 128;
                                d = i7;
                                if (i6 % 2 != 0) {
                                    boolean z3 = nextElement2 instanceof Inet6Address;
                                    throw null;
                                } else if (nextElement2 instanceof Inet6Address) {
                                    int i8 = i7 + 105;
                                    b = i8 % 128;
                                    int i9 = i8 % 2;
                                    return nextElement2;
                                }
                            }
                            if (z && z2) {
                                int i10 = b + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                                d = i10 % 128;
                                int i11 = i10 % 2;
                                return nextElement2;
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static String b(Context context) {
        int i = 2 % 2;
        if (context == null) {
            return null;
        }
        ConnectivityManager e = e();
        NetworkInfo c = e != null ? c(e) : null;
        if (c != null && c.getTypeName() != null) {
            int i2 = b + 23;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                if ("WIFI".equalsIgnoreCase(c.getTypeName())) {
                    int i3 = b + 3;
                    d = i3 % 128;
                    int i4 = i3 % 2;
                    C1044Mm.e("nf_net", "Local active network interface is WiFi");
                    String g = g(context);
                    int i5 = b + 103;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    return g;
                }
            } else {
                "WIFI".equalsIgnoreCase(c.getTypeName());
                throw null;
            }
        }
        C1044Mm.e("nf_net", "Local active network interface is Mobile (it also covers everything else).");
        return h(context);
    }

    public static NetType e(Context context) {
        int i = 2 % 2;
        int i2 = d + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        NetworkInfo a = a(context);
        if (a != null) {
            int type = a.getType();
            if (type != 1) {
                if (type != 9) {
                    int i4 = d + 15;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        return NetType.mobile;
                    }
                    NetType netType = NetType.mobile;
                    throw null;
                }
                return NetType.wired;
            }
            return NetType.wifi;
        }
        int i5 = b;
        int i6 = i5 + 91;
        d = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 59;
        d = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    @Deprecated
    public static String e(WifiManager wifiManager) {
        WifiInfo b2;
        int i = 2 % 2;
        if (wifiManager == null || (b2 = b(wifiManager)) == null) {
            return "";
        }
        int i2 = b + 65;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            String ssid = b2.getSSID();
            if (ssid != null) {
                int i3 = b + 35;
                d = i3 % 128;
                int i4 = i3 % 2;
                return ssid;
            }
            return "";
        }
        b2.getSSID();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int d(WifiManager wifiManager) {
        WifiInfo b2;
        int i = 2 % 2;
        if (wifiManager == null || (b2 = b(wifiManager)) == null) {
            return -1;
        }
        int i2 = b + 19;
        d = i2 % 128;
        int i3 = i2 % 2;
        int networkId = b2.getNetworkId();
        int i4 = d + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        b = i4 % 128;
        int i5 = i4 % 2;
        return networkId;
    }

    public static String a(TelephonyManager telephonyManager) {
        int i = 2 % 2;
        if (telephonyManager != null) {
            int i2 = d + 29;
            b = i2 % 128;
            int i3 = i2 % 2;
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null) {
                int i4 = b + 103;
                d = i4 % 128;
                int i5 = i4 % 2;
                return networkOperatorName;
            }
            return "";
        }
        return "";
    }

    public static int c(TelephonyManager telephonyManager) {
        int simCarrierId;
        int i = 2 % 2;
        if (telephonyManager != null) {
            int i2 = d + 85;
            b = i2 % 128;
            if (i2 % 2 != 0 ? Build.VERSION.SDK_INT >= 28 : Build.VERSION.SDK_INT >= 38) {
                simCarrierId = telephonyManager.getSimCarrierId();
                return simCarrierId;
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null) {
                int i3 = d + 71;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 0;
                    return networkOperatorName.hashCode();
                }
                return networkOperatorName.hashCode();
            }
        }
        int i5 = d + 121;
        b = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    public static JSONObject c(JSONObject jSONObject, NetType netType) {
        int i = 2 % 2;
        try {
            if (NetType.mobile.equals(netType)) {
                jSONObject.put("netType", "mobile");
            } else if (!NetType.wifi.equals(netType)) {
                if (NetType.wired.equals(netType)) {
                    int i2 = b + 103;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                    jSONObject.put("netType", "wired");
                    int i4 = d + 79;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    jSONObject.put("netType", "mobile");
                }
            } else {
                int i6 = d + 25;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    jSONObject.put("netType", "wifi");
                    int i7 = 13 / 0;
                } else {
                    jSONObject.put("netType", "wifi");
                }
            }
        } catch (JSONException e) {
            C1044Mm.e("nf_net", "error adding nettype to json", e);
        }
        return jSONObject;
    }

    public static String i(Context context) {
        TelephonyManager telephonyManager;
        int i = 2 % 2;
        int i2 = d + 13;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            int i3 = 46 / 0;
            if (telephonyManager == null) {
                return null;
            }
        } else {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            int i4 = d + 57;
            b = i4 % 128;
            int i5 = i4 % 2;
            return networkOperator;
        } catch (SecurityException e) {
            C1044Mm.b("nf_net", e, "unable to query mnc/mcc", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (o.C8168dfL.g(r6) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject c(android.content.Context r16) {
        /*
            r0 = r16
            java.lang.String r1 = "mcc_mnc"
            java.lang.String r2 = "name"
            java.lang.String r3 = "nf_net"
            r4 = 2
            int r5 = r4 % r4
            int r5 = com.netflix.mediaclient.util.ConnectivityUtils.d
            int r5 = r5 + 89
            int r6 = r5 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.b = r6
            int r5 = r5 % r4
            java.lang.String r6 = "phone"
            r7 = 0
            if (r5 == 0) goto Lc2
            java.lang.Object r0 = r0.getSystemService(r6)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 != 0) goto L22
            return r7
        L22:
            java.lang.String r5 = r0.getNetworkOperatorName()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r6 = r0.getNetworkOperator()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            boolean r8 = o.C8168dfL.g(r5)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r9 = 1
            if (r8 != 0) goto La3
            int r8 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r8 = r8 + 45
            int r10 = r8 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r10
            int r8 = r8 % r4
            r10 = 0
            if (r8 == 0) goto L4a
            boolean r8 = o.C8168dfL.g(r6)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r11 = 68
            int r11 = r11 / r10
            if (r8 == 0) goto L51
            goto La3
        L47:
            r0 = move-exception
            r1 = r0
            throw r1
        L4a:
            boolean r8 = o.C8168dfL.g(r6)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            if (r8 == 0) goto L51
            goto La3
        L51:
            java.lang.String r4 = r0.getNetworkOperatorName()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r0 = r0.getNetworkOperator()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r8.<init>()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r11.<init>()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r12.<init>()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r13.<init>()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r14 = "simindex"
            r15 = -1433257802(0xffffffffaa9238b6, float:-2.597416E-13)
            r7 = -1478364464(0xffffffffa7e1f2d0, float:-6.2713303E-15)
            int[] r7 = new int[]{r15, r7}     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            q(r9, r7, r15)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r7 = r15[r10]     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r7 = r7.intern()     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r12.put(r14, r7)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r12.put(r2, r5)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r12.put(r1, r6)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r11.put(r12)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r13.put(r2, r4)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            r13.put(r1, r0)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r0 = "siminfo"
            r8.put(r0, r11)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            java.lang.String r0 = "currentoperator"
            r8.put(r0, r13)     // Catch: org.json.JSONException -> Lb3 java.lang.SecurityException -> Lba
            return r8
        La3:
            int r0 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r0 = r0 + r9
            int r1 = r0 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r1
            int r0 = r0 % r4
            r1 = 0
            if (r0 != 0) goto Laf
            return r1
        Laf:
            r1.hashCode()
            throw r1
        Lb3:
            r0 = move-exception
            java.lang.String r1 = "getCarrierInfo JSONException:"
            o.C1044Mm.e(r3, r1, r0)
            goto Lc0
        Lba:
            r0 = move-exception
            java.lang.String r1 = "getCarrierInfo SecurityException:"
            o.C1044Mm.e(r3, r1, r0)
        Lc0:
            r1 = 0
            return r1
        Lc2:
            r1 = r7
            java.lang.Object r0 = r0.getSystemService(r6)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.ConnectivityUtils.c(android.content.Context):org.json.JSONObject");
    }

    public static boolean c() {
        int i = 2 % 2;
        ConnectivityManager e = e();
        if (e == null) {
            int i2 = d + 73;
            b = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Network activeNetwork = e.getActiveNetwork();
        if (activeNetwork == null) {
            int i4 = b + 9;
            d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = e.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                int i6 = b + 85;
                d = i6 % 128;
                return i6 % 2 != 0;
            }
            return networkCapabilities.hasTransport(0);
        } catch (Throwable th) {
            C1044Mm.b("nf_net", th, "Failed to get current network capabilities", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("SPY-37325: Exception on connectivityManager").b(true).b(ErrorType.c).d(th));
            return false;
        }
    }

    private static WifiInfo b(WifiManager wifiManager) {
        int i = 2 % 2;
        int i2 = d + 77;
        b = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return wifiManager.getConnectionInfo();
            }
            int i3 = 95 / 0;
            return wifiManager.getConnectionInfo();
        } catch (SecurityException e) {
            C1044Mm.e("nf_net", "WifiManager.getConnectionInfo failed", e);
            return null;
        }
    }

    private static NetworkInfo c(ConnectivityManager connectivityManager) {
        int i = 2 % 2;
        int i2 = d + 21;
        b = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return connectivityManager.getActiveNetworkInfo();
            }
            connectivityManager.getActiveNetworkInfo();
            throw null;
        } catch (Throwable th) {
            C1044Mm.e("nf_net", "ConnectivityManager.getActivityNetworkInfo failed", th);
            InterfaceC1598aHf.a(new C1596aHd("ConnectivityManager.getActivityNetworkInfo failed").b(true).b(ErrorType.c).d(th));
            return null;
        }
    }

    public static boolean b() {
        int i = 2 % 2;
        int i2 = b + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (Settings.Global.getInt(AbstractApplicationC1040Mh.d().getContentResolver(), "airplane_mode_on", 0) != 0) {
                int i4 = b + 113;
                d = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            return false;
        } catch (Exception e) {
            C1044Mm.e("nf_net", "falling back due to error in detecting AirplaneMode", e);
            return false;
        }
    }

    public static Short a(InetAddress inetAddress) {
        NetworkInterface byInetAddress;
        int i = 2 % 2;
        int i2 = d + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (inetAddress == null || (byInetAddress = NetworkInterface.getByInetAddress(inetAddress)) == null) {
            return null;
        }
        int i4 = b + 117;
        d = i4 % 128;
        int i5 = i4 % 2;
        for (InterfaceAddress interfaceAddress : byInetAddress.getInterfaceAddresses()) {
            int i6 = b + 37;
            d = i6 % 128;
            int i7 = i6 % 2;
            if (interfaceAddress != null && interfaceAddress.getAddress().equals(inetAddress)) {
                return Short.valueOf(interfaceAddress.getNetworkPrefixLength());
            }
        }
        return null;
    }

    public static InetAddress d(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = d + 63;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            e();
            throw null;
        }
        ConnectivityManager e = e();
        if (e == null) {
            int i3 = d + 101;
            b = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        LinkProperties linkProperties = e.getLinkProperties(e.getActiveNetwork());
        if (linkProperties == null) {
            int i5 = b + 1;
            d = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (a(routeInfo)) {
                int i7 = b + 85;
                d = i7 % 128;
                int i8 = i7 % 2;
                InetAddress gateway = routeInfo.getGateway();
                if (z) {
                    int i9 = b;
                    int i10 = i9 + 117;
                    d = i10 % 128;
                    int i11 = i10 % 2;
                    if (gateway instanceof Inet4Address) {
                        int i12 = i9 + 71;
                        d = i12 % 128;
                        int i13 = i12 % 2;
                        return gateway;
                    }
                }
                if (z2 && (gateway instanceof Inet6Address)) {
                    return gateway;
                }
                if (z2 && z) {
                    return gateway;
                }
            }
        }
        int i14 = d + 99;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(android.net.RouteInfo r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L38
            int r1 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r1 = r1 + 45
            int r3 = r1 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r3
            int r1 = r1 % r0
            boolean r1 = r4.isDefaultRoute()
            if (r1 == 0) goto L2a
            boolean r4 = o.C8132dec.d(r4)
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == r1) goto L2a
            int r4 = com.netflix.mediaclient.util.ConnectivityUtils.d
            int r4 = r4 + 119
            int r3 = r4 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.b = r3
            int r4 = r4 % r0
            goto L2b
        L2a:
            r1 = 0
        L2b:
            int r4 = com.netflix.mediaclient.util.ConnectivityUtils.b
            int r4 = r4 + r2
            int r2 = r4 % 128
            com.netflix.mediaclient.util.ConnectivityUtils.d = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L36
            return r1
        L36:
            r4 = 0
            throw r4
        L38:
            boolean r4 = r4.isDefaultRoute()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.ConnectivityUtils.a(android.net.RouteInfo):boolean");
    }

    public static String b(InetAddress inetAddress, short s) {
        int i = 2 % 2;
        int i2 = d + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        byte[] address = inetAddress.getAddress();
        boolean z = inetAddress instanceof Inet4Address;
        if (i3 != 0) {
            return a(address, s, z);
        }
        a(address, s, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String d(InetAddress inetAddress) {
        int i = 2 % 2;
        int i2 = d + 21;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return C8115deL.a(inetAddress);
        }
        C8115deL.a(inetAddress);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String e(byte b2) {
        String format;
        int i = 2 % 2;
        int i2 = d + 1;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = Integer.toBinaryString(b2 & 15846);
            format = String.format("%8s", objArr);
        } else {
            format = String.format("%8s", Integer.toBinaryString(b2 & 255));
        }
        String replace = format.replace(" ", "0");
        int i3 = d + 35;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return replace;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String a(byte[] bArr, short s, boolean z) {
        int length;
        int i;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = d + 103;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            length = bArr.length;
            i = 1;
        } else {
            length = bArr.length;
            i = 0;
        }
        while (i < length) {
            int i4 = b + 11;
            d = i4 % 128;
            int i5 = i4 % 2;
            C8138dei.a(bArr[i]);
            i++;
        }
        int length2 = bArr.length * 8;
        BitSet bitSet = new BitSet(length2);
        int i6 = 0;
        for (byte b2 : bArr) {
            int i7 = d + 99;
            b = i7 % 128;
            int i8 = i7 % 2;
            String e = e(b2);
            int i9 = 0;
            while (i9 < 8) {
                if (e.charAt(i9) == '1') {
                    int i10 = b;
                    int i11 = i10 + 53;
                    d = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = i10 + 21;
                    d = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                bitSet.set(i6, z2);
                i9++;
                i6++;
            }
        }
        BitSet bitSet2 = new BitSet(length2);
        bitSet2.set(0, s, true);
        bitSet.and(bitSet2);
        String[] b3 = b(bitSet, bArr.length);
        if (z) {
            String b4 = b(b3);
            int i15 = d + 37;
            b = i15 % 128;
            int i16 = i15 % 2;
            return b4;
        }
        return a(b3);
    }

    private static String[] b(BitSet bitSet, int i) {
        String[] strArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = d + 107;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            strArr = new String[i];
            i2 = 1;
        } else {
            strArr = new String[i];
            i2 = 0;
        }
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            int i5 = b + 113;
            d = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < 8; i7++) {
                int i8 = b + 97;
                d = i8 % 128;
                sb.append((i8 % 2 == 0 ? !bitSet.get((i2 * 8) + i7) : !bitSet.get((i2 >> 8) >> i7)) ? '0' : '1');
            }
            strArr[i2] = sb.toString();
            i2++;
        }
        return strArr;
    }

    private static String b(String[] strArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : strArr) {
            int i2 = d;
            int i3 = i2 + 71;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (z) {
                int i5 = i2 + 33;
                b = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            } else {
                sb.append('.');
            }
            sb.append(Integer.parseInt(str, 2));
        }
        return sb.toString();
    }

    private static String a(String[] strArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (i2 < length) {
            String str = strArr[i2];
            if (z) {
                int i5 = b + 79;
                int i6 = i5 % 128;
                d = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 89;
                b = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            } else if (i3 < 2 && i4 == 2) {
                int i10 = d + 91;
                b = i10 % 128;
                int i11 = i10 % 2;
                sb.append(':');
                i3++;
                i4 = 0;
            }
            int parseInt = Integer.parseInt(str, 2);
            i4++;
            if (parseInt != 0) {
                sb.append(Integer.toHexString(parseInt).toLowerCase(Locale.US));
                i3 = 0;
            }
            i2++;
            int i12 = d + 85;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 % 2;
            }
        }
        String sb2 = sb.toString();
        int i14 = b + 115;
        d = i14 % 128;
        if (i14 % 2 == 0) {
            return sb2;
        }
        throw null;
    }

    private static void q(int i, int[] iArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9580sM c9580sM = new C9580sM();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b$s52$381;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr3[i3] = (int) (iArr2[i3] ^ 8179569925890482642L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b$s52$381;
        if (iArr5 != null) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                int i7 = $10 + 13;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                iArr6[i6] = (int) (iArr5[i6] ^ 8179569925890482642L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        c9580sM.a = 0;
        while (c9580sM.a < iArr.length) {
            int i9 = $10 + 117;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[c9580sM.a] >> 16);
            cArr[1] = (char) iArr[c9580sM.a];
            cArr[2] = (char) (iArr[c9580sM.a + 1] >> 16);
            cArr[3] = (char) iArr[c9580sM.a + 1];
            c9580sM.b = (cArr[0] << 16) + cArr[1];
            c9580sM.e = (cArr[2] << 16) + cArr[3];
            C9580sM.e(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                c9580sM.b ^= iArr4[i11];
                c9580sM.e = C9580sM.e(c9580sM.b) ^ c9580sM.e;
                int i12 = c9580sM.b;
                c9580sM.b = c9580sM.e;
                c9580sM.e = i12;
            }
            int i13 = c9580sM.b;
            c9580sM.b = c9580sM.e;
            c9580sM.e = i13;
            c9580sM.e ^= iArr4[16];
            c9580sM.b ^= iArr4[17];
            int i14 = c9580sM.b;
            int i15 = c9580sM.e;
            cArr[0] = (char) (c9580sM.b >>> 16);
            cArr[1] = (char) c9580sM.b;
            cArr[2] = (char) (c9580sM.e >>> 16);
            cArr[3] = (char) c9580sM.e;
            C9580sM.e(iArr4);
            cArr2[c9580sM.a * 2] = cArr[0];
            cArr2[(c9580sM.a * 2) + 1] = cArr[1];
            cArr2[(c9580sM.a * 2) + 2] = cArr[2];
            cArr2[(c9580sM.a * 2) + 3] = cArr[3];
            c9580sM.a += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
