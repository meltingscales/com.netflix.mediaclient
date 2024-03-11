package com.netflix.mediaclient.service.mdx.logging.connection;

import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.connection.ConnectLogblob;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1044Mm;
import o.InterfaceC5090bsG;
import o.aOV;
import o.aVX;
import o.aWL;
import o.aWO;
import o.aWR;
import o.aWT;
import o.aWU;

/* loaded from: classes.dex */
public class MdxConnectionLogblobLogger {
    private static long b;
    private final aOV e;
    private final InterfaceC5090bsG g;
    private static ConnectionState c = ConnectionState.NotStarted;
    private static String a = null;
    private static ConnectLogblob.LaunchOrigin d = ConnectLogblob.LaunchOrigin.Unknown;

    public static void e(ConnectLogblob.LaunchOrigin launchOrigin) {
        d = launchOrigin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum ConnectionState {
        NotStarted,
        Starting,
        NotConnected,
        Connecting,
        Connected,
        Reconnecting,
        Disconnecting;
        
        private static final Map<ConnectionState, List<ConnectionState>> i;

        static {
            r0 = NotStarted;
            ConnectionState connectionState = Starting;
            ConnectionState connectionState2 = NotConnected;
            ConnectionState connectionState3 = Connecting;
            ConnectionState connectionState4 = Connected;
            ConnectionState connectionState5 = Reconnecting;
            ConnectionState connectionState6 = Disconnecting;
            HashMap hashMap = new HashMap();
            i = hashMap;
            hashMap.put(r0, Arrays.asList(connectionState));
            hashMap.put(connectionState, Arrays.asList(r0, connectionState2));
            hashMap.put(connectionState2, Arrays.asList(connectionState3, connectionState5));
            hashMap.put(connectionState3, Arrays.asList(connectionState2, connectionState4));
            hashMap.put(connectionState4, Arrays.asList(connectionState5, connectionState6));
            hashMap.put(connectionState5, Arrays.asList(connectionState4, connectionState2));
            hashMap.put(connectionState6, Arrays.asList(connectionState4, connectionState2));
        }

        boolean d(ConnectionState connectionState) {
            Map<ConnectionState, List<ConnectionState>> map = i;
            return map.containsKey(this) && map.get(this).contains(connectionState);
        }
    }

    public MdxConnectionLogblobLogger(InterfaceC5090bsG interfaceC5090bsG, aOV aov) {
        this.g = interfaceC5090bsG;
        this.e = aov;
    }

    public static void a() {
        b(ConnectionState.Starting);
    }

    public static void a(String str) {
        c = ConnectionState.Connecting;
        C1044Mm.c("MdxConnectionLogblobLogger", "connectionStarted - current target location set to %s", str);
        a = str;
        b = System.currentTimeMillis();
    }

    public static void c(String str) {
        if (a == null) {
            a = str;
        }
        if (a.equals(str)) {
            b(ConnectionState.Reconnecting);
        }
    }

    public static void e(String str) {
        String str2 = a;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        b(ConnectionState.Disconnecting);
    }

    public static boolean b() {
        return ConnectionState.Reconnecting.equals(c);
    }

    private static void b(ConnectionState connectionState) {
        if (c.d(connectionState)) {
            C1044Mm.d("MdxConnectionLogblobLogger", "setState - state changed from %s to %s", c, connectionState);
            c = connectionState;
            b = System.currentTimeMillis();
            if (connectionState == ConnectionState.NotConnected) {
                C1044Mm.a("MdxConnectionLogblobLogger", "setState - clearing current target");
                a = null;
            }
        }
    }

    public void c() {
        ConnectionState connectionState = ConnectionState.NotConnected;
        if (b(connectionState, null, "MDX Init")) {
            long d2 = d();
            this.g.a(d(d2));
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onMdxInit - delay: %s", Long.valueOf(d2));
        }
    }

    public void b(aVX avx, String str) {
        ConnectionState connectionState = ConnectionState.NotStarted;
        if (b(connectionState, null, "MDX Init Error")) {
            long d2 = d();
            aWU d3 = d(d2);
            d3.a(new aWO(avx, str));
            this.g.a(d3);
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onMdxInitError - delay %s, code: %s, subCode: %s, extCode: %s, details: %s, timeout: %s", Long.valueOf(d2), avx.e(), avx.b(), avx.d(), avx.c(), str);
        }
    }

    public void a(MdxTargetType mdxTargetType, String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, boolean z3, boolean z4) {
        ConnectionState connectionState = ConnectionState.Connected;
        if (b(connectionState, str, "Connect")) {
            long d2 = d();
            this.g.a(a(d2, mdxTargetType, str2, str3, z, str4, str5, str6, z2).c(z3).d(z4));
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onConnect - delay: %s, origin: %s, targetType: %s, deviceId: %s, deviceName: %s, userMismatch: %b, manufacturer: %s, modelName: %s, modelNumber: %s isRemoteLoginEnabled: %b supportsWol: %b wasWakeupAttempted: %b", Long.valueOf(d2), d.c(), mdxTargetType.d(), str2, str3, Boolean.valueOf(z), str4, str5, str6, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4));
            g();
        }
    }

    public void c(MdxTargetType mdxTargetType, String str, String str2, String str3, boolean z, String str4, String str5, String str6, aVX avx, String str7, boolean z2, boolean z3, boolean z4) {
        ConnectionState connectionState = ConnectionState.NotConnected;
        if (b(connectionState, str, "Connect Error")) {
            long d2 = d();
            ConnectLogblob d3 = a(d2, mdxTargetType, str2, str3, z, str4, str5, str6, z2).c(z3).d(z4);
            d3.a(new aWO(avx, str7));
            this.g.a(d3);
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onConnectError - delay: %s, origin: %s, targetType: %s, deviceId: %s, deviceName: %s, userMismatch: %b, manufacturer: %s, modelName: %s, modelNumber: %s, code: %s, subCode: %s, extCode: %s, details: %s, timeout: %s isRemoteLoginEnabled: %b supportsWol: %b wasWakeupAttempted: %b", Long.valueOf(d2), d.c(), mdxTargetType.d(), str2, str3, Boolean.valueOf(z), str4, str5, str6, avx.e(), avx.b(), avx.d(), avx.c(), str7, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4));
            g();
        }
    }

    public void e(MdxTargetType mdxTargetType, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        ConnectionState connectionState = ConnectionState.Connected;
        if (b(connectionState, str, "Reconnect")) {
            long d2 = d();
            this.g.a(b(d2, mdxTargetType, str2, str3, z, str4, str5, str6));
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onReconnect - delay: %s, targetType: %s, deviceId: %s, deviceName: %s, userMismatch: %bmanufacturer: $s, modelName: $s, modelNumber: $s", Long.valueOf(d2), mdxTargetType.d(), str2, str3, Boolean.valueOf(z), str4, str5, str6);
        }
    }

    public void b(MdxTargetType mdxTargetType, String str, String str2, String str3, boolean z, String str4, String str5, String str6, aVX avx, String str7) {
        ConnectionState connectionState = ConnectionState.NotConnected;
        if (b(connectionState, str, "Reconnect Error")) {
            long d2 = d();
            aWT b2 = b(d2, mdxTargetType, str2, str3, z, str4, str5, str6);
            b2.a(new aWO(avx, str7));
            this.g.a(b2);
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onReconnectError - delay: %s, targetType: %s, deviceId: %s, deviceName: %s, userMismatch: %b, manufacturer: $s, modelName: $s, modelNumber: $s, code: %s, subCode: %s, extCode: %s, details: %s, timeout: %s", Long.valueOf(d2), mdxTargetType.d(), str2, str3, Boolean.valueOf(z), str4, str5, str6, avx.e(), avx.b(), avx.d(), avx.c(), str7);
        }
    }

    public void d(MdxTargetType mdxTargetType, String str, String str2, String str3, String str4, String str5, String str6) {
        ConnectionState connectionState = ConnectionState.NotConnected;
        if (b(connectionState, str, "Disconnect")) {
            long d2 = d();
            this.g.a(a(d2, mdxTargetType, str2, str3, str4, str5, str6));
            b(connectionState);
            C1044Mm.c("MdxConnectionLogblobLogger", "onDisconnect - delay: %s, targetType: %s, deviceId: %s, deviceName: %s, manufacturer: $s, modelName: $s, modelNumber: $s", Long.valueOf(d2), mdxTargetType.d(), str2, str3, str4, str5, str6);
        }
    }

    private long d() {
        return System.currentTimeMillis() - b;
    }

    private boolean b(ConnectionState connectionState, String str, String str2) {
        if (c.d(connectionState)) {
            String str3 = a;
            if (str3 != null && !str3.equals(str)) {
                C1044Mm.d("MdxConnectionLogblobLogger", "isStateValid - invalid target location, ignoring - current location: %s, new ID: %s", a, str);
                return false;
            } else if (this.g == null) {
                C1044Mm.e("MdxConnectionLogblobLogger", "MdxConnectionLogblobLogger can't log %s, since internal logger is null", str2);
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private void g() {
        d = ConnectLogblob.LaunchOrigin.Unknown;
    }

    private aWU d(long j) {
        return new aWU(e(), j);
    }

    private ConnectLogblob a(long j, MdxTargetType mdxTargetType, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2) {
        return new ConnectLogblob(e(), j, d, mdxTargetType, str, str2, z, str3, str4, str5, z2);
    }

    private aWT b(long j, MdxTargetType mdxTargetType, String str, String str2, boolean z, String str3, String str4, String str5) {
        return new aWT(e(), j, mdxTargetType, str, str2, z, str3, str4, str5);
    }

    private aWR a(long j, MdxTargetType mdxTargetType, String str, String str2, String str3, String str4, String str5) {
        return new aWR(e(), j, mdxTargetType, str, str2, str3, str4, str5);
    }

    private String e() {
        aOV aov = this.e;
        if (aov != null) {
            return aWL.d(aov.a());
        }
        return null;
    }
}
