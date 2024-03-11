package o;

import android.net.Uri;
import android.os.Handler;
import com.netflix.dial.DialDevice;
import com.netflix.upnp.UpnpDevice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C8456dmg;
import o.GM;
import o.InterfaceC8457dmh;

/* loaded from: classes3.dex */
public class GM {
    private static final boolean c = InterfaceC1730aMc.c.e(5);
    private GR a;
    private final d b;
    private final Handler f;
    private final GO g;
    private final C8456dmg i;
    private final List<DialDevice> d = new ArrayList();
    private final Map<UpnpDevice, Long> j = new ConcurrentHashMap();
    private final Map<String, Boolean> e = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    public static abstract class a {
        public void a() {
        }

        public abstract void c(DialDevice dialDevice);

        public abstract void d(DialDevice dialDevice);

        public abstract void d(DialDevice dialDevice, DialDevice dialDevice2);

        public abstract void d(Exception exc);

        public void e() {
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void b(DialDevice dialDevice);

        void d(Exception exc);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void c();

        void e(Exception exc);
    }

    /* loaded from: classes3.dex */
    interface d {
        DialDevice a(UpnpDevice upnpDevice, String str);
    }

    public GM(GO go, Handler handler) {
        C1044Mm.a("DialClient", "Creating new DialClient with policy: %s", this.a);
        this.i = new C8456dmg(new C8450dma(C8454dme.b), go, new C8468dms(), handler);
        this.g = go;
        this.f = handler;
        this.b = new d() { // from class: o.GK
            @Override // o.GM.d
            public final DialDevice a(UpnpDevice upnpDevice, String str) {
                return DialDevice.c(upnpDevice, str);
            }
        };
    }

    public void b(String str, a aVar) {
        b(str, aVar, null);
    }

    public void b(String str, a aVar, C8454dme c8454dme) {
        C1044Mm.a("DialClient", String.format("Starting discovery for app name: %s", str));
        this.i.c("urn:dial-multiscreen-org:service:dial:1", new String[]{"Application-URL", "WAKEUP"}, e(str, aVar), c8454dme);
    }

    public void b() {
        C1044Mm.a("DialClient", "Stopping discovery");
        this.i.a();
    }

    public boolean a() {
        return this.i.e();
    }

    public void d() {
        C1044Mm.a("DialClient", "Clearing device list");
        synchronized (this.d) {
            this.d.clear();
        }
        this.i.b();
    }

    public void c(String str, String str2, final c cVar) {
        final String a2 = a(str, str2);
        C1044Mm.a("DialClient", "Launching URL: " + a2);
        this.g.b(a2, new e(this.f) { // from class: o.GM.4
            @Override // o.GM.e
            void a(int i, Map<String, String> map, String str3) {
                if (i < 200 || i >= 300) {
                    C1044Mm.d("DialClient", "Launch response had invalid status code.  Code: " + i);
                    c cVar2 = cVar;
                    cVar2.e(new Exception("Launch response had invalid status code.  Code: " + i));
                    return;
                }
                C1044Mm.a("DialClient", "Successfully launched URL: " + a2);
                cVar.c();
            }

            @Override // o.GM.e
            void b(Exception exc) {
                C1044Mm.c("DialClient", "Failed to launch URL: " + a2, exc);
                cVar.e(exc);
            }
        });
    }

    public void d(UpnpDevice upnpDevice, String str, b bVar) {
        c(upnpDevice, str, bVar, Boolean.TRUE);
    }

    public void c(final UpnpDevice upnpDevice, final String str, final b bVar, final Boolean bool) {
        C1044Mm.a("DialClient", String.format("Getting device state - device: %s, appName: %s", upnpDevice.c(), str));
        String str2 = upnpDevice.b().get("Application-URL");
        if (C8168dfL.g(str2)) {
            C1044Mm.d("DialClient", "No App URL header found on device");
            bVar.d(new Exception("No App URL header found on device"));
            return;
        }
        String e2 = bool.booleanValue() ? e(str2, str) : a(str2, str);
        if (C8168dfL.g(Uri.parse(e2).getHost())) {
            if (c) {
                String f = upnpDevice.f();
                String str3 = "";
                if (f != null) {
                    str3 = "modelNumber:" + f;
                }
                String i = upnpDevice.i();
                if (i != null) {
                    str3 = str3 + " manufacturer:" + i;
                }
                InterfaceC1593aHa.b(str3 + " url:" + e2);
                InterfaceC1598aHf.a("SPY-31648 invalid URL");
            }
            bVar.d(new Exception("Invalid URL"));
            return;
        }
        this.g.c(e2, new e(this.f) { // from class: o.GM.5
            @Override // o.GM.e
            void a(int i2, Map<String, String> map, String str4) {
                if (i2 < 200 || i2 >= 300) {
                    if (bool.booleanValue()) {
                        GM.this.c(upnpDevice, str, bVar, Boolean.FALSE);
                        return;
                    }
                    C1044Mm.d("DialClient", "Received non-200 status code from device state response.  Status: " + i2);
                    b bVar2 = bVar;
                    bVar2.d(new Exception("Received non-200 status code from device state response.  Status: " + i2));
                    return;
                }
                try {
                    DialDevice a2 = GM.this.b.a(upnpDevice, str4);
                    C1044Mm.a("DialClient", "Successfully got device state for device: " + upnpDevice.c());
                    bVar.b(a2);
                } catch (Exception e3) {
                    C1044Mm.e("DialClient", "Failed to get DIAL device from app state response.  Response: " + str4, e3);
                    bVar.d(e3);
                }
            }

            @Override // o.GM.e
            void b(Exception exc) {
                C1044Mm.e("DialClient", "Failed to get device state for device: " + upnpDevice.c(), exc);
                bVar.d(new IOException(exc));
            }
        });
    }

    public List<DialDevice> c() {
        return Collections.unmodifiableList(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.GM$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements b {
        final /* synthetic */ a a;
        final /* synthetic */ String b;
        final /* synthetic */ UpnpDevice c;

        AnonymousClass2(UpnpDevice upnpDevice, a aVar, String str) {
            this.c = upnpDevice;
            this.a = aVar;
            this.b = str;
        }

        @Override // o.GM.b
        public void b(DialDevice dialDevice) {
            DialDevice b;
            boolean z;
            synchronized (GM.this.d) {
                b = GM.this.b(this.c.k().i());
                if (b == null) {
                    GM.this.d.add(dialDevice);
                } else if (!dialDevice.equals(b)) {
                    GM.this.d.remove(b);
                    GM.this.d.add(dialDevice);
                    z = true;
                }
                z = false;
            }
            if (b != null) {
                if (z) {
                    this.a.d(b, dialDevice);
                    return;
                }
                return;
            }
            String r = this.c.r();
            if (C8168dfL.h(r)) {
                GM.this.e.put(r, Boolean.TRUE);
            }
            this.a.c(dialDevice);
        }

        @Override // o.GM.b
        public void d(Exception exc) {
            DialDevice b;
            synchronized (GM.this.d) {
                b = GM.this.b(this.c.k().i());
                if (b != null) {
                    GM.this.d.remove(b);
                }
            }
            if (b != null) {
                this.a.d(b);
            }
            long e = GM.this.e(exc, this.c);
            if (e > 0) {
                Handler handler = GM.this.f;
                final UpnpDevice upnpDevice = this.c;
                final String str = this.b;
                final a aVar = this.a;
                handler.postDelayed(new Runnable() { // from class: o.GJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        GM.AnonymousClass2.this.e(upnpDevice, str, aVar);
                    }
                }, e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(UpnpDevice upnpDevice, String str, a aVar) {
            GM.this.e(upnpDevice, str, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UpnpDevice upnpDevice, String str, a aVar) {
        d(upnpDevice, str, new AnonymousClass2(upnpDevice, aVar, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r0.booleanValue() == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long e(java.lang.Exception r10, com.netflix.upnp.UpnpDevice r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dialErrorRetryNeededOnTvReboot "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DialClient"
            o.C1044Mm.a(r1, r0)
            java.lang.String r0 = r11.r()
            if (r0 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r9.e
            java.lang.String r2 = r11.r()
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L32
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != r2) goto L32
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L38
            r3 = 30000(0x7530, double:1.4822E-319)
            goto L3b
        L38:
            r3 = 60000(0xea60, double:2.9644E-319)
        L3b:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            if (r2 == 0) goto L42
            r5 = 5
            goto L44
        L42:
            r5 = 1
        L44:
            long r5 = r0.toMillis(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "dialErrorRetryNeededOnTvReboot timeout=%d timeWindow=%d"
            o.C1044Mm.c(r1, r2, r0)
            boolean r10 = r10 instanceof java.io.IOException
            if (r10 == 0) goto L83
            java.util.Map<com.netflix.upnp.UpnpDevice, java.lang.Long> r10 = r9.j
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            java.lang.Object[] r11 = new java.lang.Object[]{r10}
            java.lang.String r0 = "dialErrorRetryNeededOnTvReboot birthTime=%d"
            o.C1044Mm.c(r1, r0, r11)
            if (r10 == 0) goto L83
            long r10 = r10.longValue()
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 + r5
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 >= 0) goto L83
            java.lang.String r10 = "dialErrorRetryNeededOnTvReboot retry=true"
            o.C1044Mm.a(r1, r10)
            return r3
        L83:
            java.lang.String r10 = "dialErrorRetryNeededOnTvReboot retry=false"
            o.C1044Mm.a(r1, r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GM.e(java.lang.Exception, com.netflix.upnp.UpnpDevice):long");
    }

    private String a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        return str + str2;
    }

    private String e(String str, String str2) {
        String a2 = a(str, str2);
        return a2 + "?clientDialVer=2.1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DialDevice b(String str) {
        synchronized (this.d) {
            for (DialDevice dialDevice : this.d) {
                if (dialDevice.h().k().i().equals(str)) {
                    return dialDevice;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UpnpDevice upnpDevice, a aVar, Exception exc) {
        DialDevice b2 = b(upnpDevice.k().i());
        if (b2 != null) {
            C1044Mm.c("DialClient", "removeDevice %s %s", exc != null ? exc.getMessage() : "", b2.e());
            synchronized (this.d) {
                this.d.remove(b2);
            }
            aVar.d(b2);
        }
    }

    private C8456dmg.c e(final String str, final a aVar) {
        return new C8456dmg.c() { // from class: o.GM.1
            @Override // o.C8456dmg.c
            public void d(UpnpDevice upnpDevice) {
                C1044Mm.a("DialClient", "onDeviceAdded " + upnpDevice.c());
                GM.this.j.put(upnpDevice, Long.valueOf(System.currentTimeMillis()));
                GM.this.e(upnpDevice, str, aVar);
            }

            @Override // o.C8456dmg.c
            public void a(UpnpDevice upnpDevice, Exception exc) {
                C1044Mm.a("DialClient", "onDeviceRemoved " + upnpDevice.c());
                GM.this.j.remove(upnpDevice);
                GM.this.e(upnpDevice, aVar, exc);
            }

            @Override // o.C8456dmg.c
            public void e(UpnpDevice upnpDevice, UpnpDevice upnpDevice2) {
                GM.this.e(upnpDevice2, str, aVar);
            }

            @Override // o.C8456dmg.c
            public void e(Exception exc) {
                aVar.d(exc);
            }

            @Override // o.C8456dmg.c
            public void e() {
                aVar.e();
            }

            @Override // o.C8456dmg.c
            public void c() {
                ArrayList<DialDevice> arrayList = new ArrayList();
                synchronized (GM.this.d) {
                    arrayList.addAll(GM.this.d);
                }
                for (DialDevice dialDevice : arrayList) {
                    GM.this.e(dialDevice.h(), str, aVar);
                }
                aVar.a();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class e implements InterfaceC8457dmh.e {
        private final Handler d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void d(int i, Map<String, String> map, String str);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void d(Exception exc);

        e(Handler handler) {
            this.d = handler;
        }

        @Override // o.InterfaceC8457dmh.e
        public void c(final int i, final Map<String, String> map, final String str) {
            this.d.post(new Runnable() { // from class: o.GI
                @Override // java.lang.Runnable
                public final void run() {
                    GM.e.this.d(i, map, str);
                }
            });
        }

        @Override // o.InterfaceC8457dmh.e
        public void a(final Exception exc) {
            this.d.post(new Runnable() { // from class: o.GL
                @Override // java.lang.Runnable
                public final void run() {
                    GM.e.this.d(exc);
                }
            });
        }
    }
}
