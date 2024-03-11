package o;

import android.net.TrafficStats;
import android.net.Uri;
import com.netflix.android.org.json.HTTP;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.ssdp.SsdpDevice;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: o.dma  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8450dma {
    private final ScheduledExecutorService a;
    private ScheduledFuture<?> b;
    private final Object c = new Object();
    private volatile MulticastSocket d;
    private final a e;
    private final C8454dme f;
    private final List<SsdpDevice> h;
    private final b j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dma$a */
    /* loaded from: classes5.dex */
    public interface a {
        DatagramSocket d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dma$b */
    /* loaded from: classes5.dex */
    public interface b {
        SsdpDevice b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6);
    }

    /* renamed from: o.dma$c */
    /* loaded from: classes5.dex */
    public static abstract class c {
        public abstract void a(SsdpDevice ssdpDevice, SsdpDevice ssdpDevice2);

        public void b() {
        }

        public abstract void b(SsdpDevice ssdpDevice);

        public void c() {
        }

        public abstract void d(SsdpDevice ssdpDevice, Exception exc);

        public abstract void d(Exception exc);
    }

    public C8450dma(C8454dme c8454dme) {
        C1044Mm.a("SsdpClient", "Creating new SsdpClient with policy: %s", c8454dme);
        this.f = c8454dme;
        this.h = new ArrayList();
        this.a = Executors.newScheduledThreadPool(1);
        this.e = new a() { // from class: o.dmd
            @Override // o.C8450dma.a
            public final DatagramSocket d() {
                return new DatagramSocket();
            }
        };
        this.j = new b() { // from class: o.dmb
            @Override // o.C8450dma.b
            public final SsdpDevice b(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
                return new SsdpDevice(str, str2, str3, str4, str5, map, str6);
            }
        };
    }

    public List<SsdpDevice> a(String str, c cVar) {
        SsdpDevice a2;
        boolean z;
        for (SsdpDevice ssdpDevice : d((String) null, str)) {
            synchronized (this.h) {
                a2 = a(ssdpDevice.i());
                if (a2 == null) {
                    this.h.add(ssdpDevice);
                } else if (!ssdpDevice.equals(a2)) {
                    C1044Mm.c("SsdpClient", "Updating device: %s", a2);
                    this.h.remove(a2);
                    this.h.add(ssdpDevice);
                    z = true;
                }
                z = false;
            }
            if (a2 == null) {
                cVar.b(ssdpDevice);
            } else if (z) {
                cVar.a(a2, ssdpDevice);
            }
        }
        return a();
    }

    public void d(String str, c cVar) {
        e(str, cVar, this.f);
    }

    public void e(final String str, final c cVar, C8454dme c8454dme) {
        if (this.b == null) {
            C1044Mm.c("SsdpClient", "Starting discovery for service type: %s", str);
            if (c8454dme == null) {
                c8454dme = this.f;
            }
            this.b = this.a.scheduleWithFixedDelay(new Runnable() { // from class: o.dmc
                @Override // java.lang.Runnable
                public final void run() {
                    C8450dma.this.c(str, cVar);
                }
            }, 0L, c8454dme.a(), TimeUnit.MILLISECONDS);
            e(str, cVar);
        }
    }

    public void e() {
        if (this.b != null) {
            C1044Mm.a("SsdpClient", "Stopping discovery");
            this.b.cancel(true);
            this.b = null;
            c();
        }
    }

    public boolean d() {
        return (this.b == null || this.d == null || this.d.isClosed()) ? false : true;
    }

    public void b() {
        C1044Mm.a("SsdpClient", "Clearing device list");
        synchronized (this.h) {
            this.h.clear();
        }
    }

    public void e(SsdpDevice ssdpDevice) {
        if (ssdpDevice == null || !this.h.contains(ssdpDevice)) {
            return;
        }
        C1044Mm.c("SsdpClient", "Clearing device from device list: %s", ssdpDevice);
        synchronized (this.h) {
            this.h.remove(ssdpDevice);
        }
    }

    public List<SsdpDevice> a() {
        return Collections.unmodifiableList(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void c(String str, c cVar) {
        C1044Mm.c("SsdpClient", "Starting discover session for serviceType: %s", str);
        try {
            try {
                cVar.c();
                for (int i = 0; i < this.f.b(); i++) {
                    a(str, cVar);
                }
            } catch (IOException e) {
                C1044Mm.b("SsdpClient", e, "Failed to search for devices of service type: %s", str);
                cVar.d(e);
            }
            cVar.b();
            C1044Mm.c("SsdpClient", "Finished discover session for serviceType: %s", str);
        } catch (Throwable th) {
            cVar.b();
            throw th;
        }
    }

    private String e(boolean z, String str) {
        String str2 = "M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:1900\r\nMAN: \"ssdp:discover\"\r\nST: " + str + HTTP.CRLF;
        if (!z) {
            str2 = str2 + "MX: " + TimeUnit.MILLISECONDS.toSeconds(this.f.c()) + HTTP.CRLF;
        }
        String str3 = str2 + HTTP.CRLF;
        C1044Mm.a("SsdpClient", "Query: %s", str3);
        return str3;
    }

    private void e(boolean z, String str, List<SsdpDevice> list, DatagramSocket datagramSocket) {
        String substring;
        C1044Mm.e("SsdpClient", "Listening for responses");
        long currentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - currentTimeMillis <= this.f.c() + 1000) {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
            datagramSocket.receive(datagramPacket);
            String str2 = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            C1044Mm.a("SsdpClient", "Response: %s", str2);
            if (str2.length() < 12) {
                InterfaceC1598aHf.a(new C1596aHd("SSDP discovery response too short").b(ErrorType.k).b(false).e("response", str2));
                substring = str2;
            } else {
                substring = str2.substring(0, 12);
            }
            if (substring.toUpperCase(Locale.US).equals("HTTP/1.1 200")) {
                C1044Mm.a("SsdpClient", "Got valid M-SEARCH response from HostName: %s, response: %s", datagramPacket.getAddress().getHostAddress(), str2);
                list.add(a(str, datagramPacket.getAddress(), str2));
                if (z) {
                    break;
                }
            }
        }
        C1044Mm.e("SsdpClient", "Finished listening for responses");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r6 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.netflix.ssdp.SsdpDevice> d(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            java.lang.String r1 = "Search started for service type: %s"
            java.lang.String r2 = "SsdpClient"
            o.C1044Mm.a(r2, r1, r0)
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L11
            r3 = r0
            goto L12
        L11:
            r3 = r1
        L12:
            if (r3 == 0) goto L15
            goto L17
        L15:
            java.lang.String r10 = "239.255.255.250"
        L17:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r3 == 0) goto L1f
            java.lang.String r5 = "unicast"
            goto L21
        L1f:
            java.lang.String r5 = "multicast"
        L21:
            r4[r1] = r5
            r4[r0] = r10
            java.lang.String r5 = "Search is %s, host set to %s"
            o.C1044Mm.a(r2, r5, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 4096(0x1000, float:5.74E-42)
            r6 = 0
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            java.net.InetAddress r10 = java.net.InetAddress.getByName(r10)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            o.dma$a r5 = r9.e     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            java.net.DatagramSocket r6 = r5.d()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            o.dme r5 = r9.f     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            int r5 = r5.c()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            r6.setSoTimeout(r5)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            r6.setReuseAddress(r0)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            java.lang.String r0 = r9.e(r3, r11)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            byte[] r7 = r0.getBytes()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            r8 = 1900(0x76c, float:2.662E-42)
            r5.<init>(r7, r0, r10, r8)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            r6.send(r5)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            r9.e(r3, r11, r4, r6)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67 java.net.SocketTimeoutException -> L70
            goto L77
        L65:
            r10 = move-exception
            goto L90
        L67:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = "Failed to search for devices"
            o.C1044Mm.b(r2, r10, r0, r11)     // Catch: java.lang.Throwable -> L65
            throw r10     // Catch: java.lang.Throwable -> L65
        L70:
            java.lang.String r10 = "Socket timeout occurred.  Most likely because no more devices responded."
            o.C1044Mm.e(r2, r10)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L7a
        L77:
            r6.close()
        L7a:
            int r10 = r4.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r11 = "Finished search - found %d Netflix targets"
            o.C1044Mm.a(r2, r11, r10)
            java.util.List r10 = java.util.Collections.unmodifiableList(r4)
            return r10
        L90:
            if (r6 == 0) goto L95
            r6.close()
        L95:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8450dma.d(java.lang.String, java.lang.String):java.util.List");
    }

    private void e(final String str, final c cVar) {
        final String str2;
        C1044Mm.c("SsdpClient", "Started listening for events for: %s", str);
        synchronized (this.c) {
            if (this.d != null) {
                return;
            }
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            try {
                this.d = new MulticastSocket(1900);
                this.d.joinGroup(InetAddress.getByName("239.255.255.250"));
                this.d.setReuseAddress(true);
                String[] split = str.split(":");
                if (split.length <= 1 || !C8168dfL.i(split[split.length - 1])) {
                    str2 = str;
                } else {
                    C1044Mm.b("SsdpClient", "Service type includes version segment - stripping that off");
                    str2 = str.substring(0, str.lastIndexOf(58));
                    C1044Mm.d("SsdpClient", "New service type: %s", str);
                }
                new Thread(new Runnable() { // from class: o.dmf
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8450dma.this.b(str2, str, cVar);
                    }
                }).start();
            } catch (IOException e) {
                C1044Mm.b("SsdpClient", e, "Failed to create multicast socket - NOTIFY events will not be listened to", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, c cVar) {
        SsdpDevice a2;
        try {
            try {
                try {
                    try {
                        C1044Mm.c("SsdpClient", "Beginning listening for events for: %s", str);
                        while (this.d != null && !this.d.isClosed()) {
                            C1044Mm.b("SsdpClient", "Waiting for response packet");
                            DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                            try {
                                this.d.receive(datagramPacket);
                                String str3 = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                                C1044Mm.d("SsdpClient", "Got response: %s", str3);
                                if (str3.length() >= 17 && str3.substring(0, 17).toUpperCase(Locale.US).equals("NOTIFY * HTTP/1.1")) {
                                    boolean z = true;
                                    C1044Mm.d("SsdpClient", "Got valid NOTIFY event from HostName: %s, response: %s", datagramPacket.getAddress().getHostAddress(), str3);
                                    String c2 = c(str3, "NT: ");
                                    String c3 = c(str3, "NTS: ");
                                    String c4 = c(str3, "USN: ");
                                    String d = C8458dmi.d(c4);
                                    if (c2.contains(str)) {
                                        C1044Mm.d("SsdpClient", "NOTIFY event is for our service type - used ST: %s, response ST: %s", str, c2);
                                        if (c3.equals("ssdp:alive")) {
                                            C1044Mm.c("SsdpClient", "Got SSDP alive message from usn: %s, uuid: %s", c4, d);
                                            SsdpDevice a3 = a(str2, datagramPacket.getAddress(), str3);
                                            synchronized (this.h) {
                                                if (a(d) == null) {
                                                    C1044Mm.c("SsdpClient", "SSDP alive device does not exist yet, so adding it - uuid: %s", d);
                                                    this.h.add(a3);
                                                } else {
                                                    z = false;
                                                }
                                            }
                                            if (z) {
                                                cVar.b(a3);
                                            }
                                        } else if (c3.equals("ssdp:byebye")) {
                                            C1044Mm.c("SsdpClient", "Got SSDP bye bye message from usn: %s, uuid: %s", c4, d);
                                            synchronized (this.h) {
                                                a2 = a(d);
                                                if (a2 != null) {
                                                    C1044Mm.c("SsdpClient", "SSDP byebye device does exist, so removing it - uuid: %s", d);
                                                    this.h.remove(a2);
                                                } else {
                                                    C1044Mm.j("SsdpClient", "SSDP byebye device does not exist.  Device list size: %d", Integer.valueOf(this.h.size()));
                                                }
                                            }
                                            if (a2 != null) {
                                                cVar.d(a2, new Exception("ssdp:bye"));
                                            }
                                        } else {
                                            C1044Mm.d("SsdpClient", "Unhandled NOTIFY event: %s", c3);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    C1044Mm.j("SsdpClient", "Ignoring response ");
                                }
                            } catch (NullPointerException e) {
                                if (this.d == null) {
                                    C1044Mm.b("SsdpClient", e, "Socket no longer exists", new Object[0]);
                                } else {
                                    throw e;
                                }
                            } catch (SocketException e2) {
                                C1044Mm.b("SsdpClient", e2, "Failed to receive datagram packet; trying again", new Object[0]);
                            }
                        }
                        C1044Mm.c("SsdpClient", "Finished listening for events for: %s", str);
                    } catch (SocketTimeoutException unused) {
                        C1044Mm.d("SsdpClient", "Socket timeout occurred.  Multicast socket shouldn't timeout.");
                    }
                } catch (IOException e3) {
                    C1044Mm.b("SsdpClient", e3, "Failed to search for devices", new Object[0]);
                }
            } catch (NullPointerException e4) {
                C1044Mm.b("SsdpClient", e4, "ListeningSocket no longer exists. Failed to search for devices", new Object[0]);
            }
        } finally {
            c();
        }
    }

    private void c() {
        C1044Mm.a("SsdpClient", "Stopping listening for events for");
        if (this.d != null) {
            synchronized (this.c) {
                if (this.d != null) {
                    if (!this.d.isClosed()) {
                        this.d.close();
                    }
                    this.d = null;
                }
            }
        }
    }

    private String c(String str, String str2) {
        int indexOf = str.toUpperCase(Locale.US).indexOf(str2);
        if (indexOf != -1) {
            int length = indexOf + str2.length();
            int indexOf2 = str.indexOf(HTTP.CRLF, length);
            if (indexOf2 < length) {
                indexOf2 = str.length();
            }
            return str.substring(length, indexOf2);
        }
        return "";
    }

    private Map<String, String> c(String str) {
        C1044Mm.a("SsdpClient", "Getting extended headers for response: %s", str);
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(HTTP.CRLF)) {
            String trim = str2.trim();
            C1044Mm.d("SsdpClient", "Checking header: %s", trim);
            if (trim.startsWith("X-")) {
                C1044Mm.a("SsdpClient", "Found extended header: %s", trim);
                String[] split = trim.split(":");
                if (split.length == 2) {
                    String trim2 = split[0].trim();
                    String trim3 = split[1].trim();
                    C1044Mm.a("SsdpClient", "Adding extended header - key: %s, value: %s", trim2, trim3);
                    hashMap.put(trim2, trim3);
                }
            }
        }
        return hashMap;
    }

    private SsdpDevice a(String str, InetAddress inetAddress, String str2) {
        String c2 = c(str2, "LOCATION: ");
        String c3 = c(str2, "SERVER: ");
        String c4 = c(str2, "USN: ");
        String c5 = c(str2, "WAKEUP: ");
        String host = Uri.parse(c2).getHost();
        return this.j.b(host != null ? host : inetAddress.getHostAddress(), c2, c3, c4, str, c(str2), c5);
    }

    private SsdpDevice a(String str) {
        synchronized (this.h) {
            for (SsdpDevice ssdpDevice : this.h) {
                if (ssdpDevice.i().equals(str)) {
                    return ssdpDevice;
                }
            }
            return null;
        }
    }

    public void b(SsdpDevice ssdpDevice) {
        C1044Mm.a("SsdpClient", "Waking up SSDP device: %s", ssdpDevice.i());
        if (C8168dfL.g(ssdpDevice.d())) {
            C1044Mm.d("SsdpClient", "Device does not have MAC Address");
            return;
        }
        byte[] bArr = new byte[6];
        String[] split = ssdpDevice.d().split("([:\\-])");
        if (split.length != 6) {
            C1044Mm.e("SsdpClient", "Error parsing MAC Address: %s", ssdpDevice.d());
            return;
        }
        for (int i = 0; i < 6; i++) {
            try {
                bArr[i] = (byte) Integer.parseInt(split[i], 16);
            } catch (Exception e) {
                C1044Mm.b("SsdpClient", e, "Error parsing MAC Address", new Object[0]);
                return;
            }
        }
        try {
            byte[] bArr2 = new byte[102];
            for (int i2 = 0; i2 < 6; i2++) {
                bArr2[i2] = -1;
            }
            for (int i3 = 6; i3 < 102; i3 += 6) {
                System.arraycopy(bArr, 0, bArr2, i3, 6);
            }
            DatagramPacket datagramPacket = new DatagramPacket(bArr2, 102, InetAddress.getByName("255.255.255.255"), 9);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (Exception e2) {
            C1044Mm.b("SsdpClient", e2, "Error while waking up device", new Object[0]);
        }
    }
}
