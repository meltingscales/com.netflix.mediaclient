package o;

import android.os.Handler;
import com.netflix.ssdp.SsdpDevice;
import com.netflix.upnp.UpnpDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C8450dma;
import o.C8456dmg;
import o.InterfaceC8457dmh;

/* renamed from: o.dmg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8456dmg {
    private final InterfaceC8457dmh a;
    private final C8450dma b;
    private final List<UpnpDevice> c = new ArrayList();
    private final d d;
    private final C8468dms e;
    private final Handler j;

    /* renamed from: o.dmg$b */
    /* loaded from: classes5.dex */
    public interface b {
        void a(UpnpDevice upnpDevice);

        void b(Exception exc);
    }

    /* renamed from: o.dmg$c */
    /* loaded from: classes5.dex */
    public static abstract class c {
        public abstract void a(UpnpDevice upnpDevice, Exception exc);

        public void c() {
        }

        public abstract void d(UpnpDevice upnpDevice);

        public void e() {
        }

        public abstract void e(UpnpDevice upnpDevice, UpnpDevice upnpDevice2);

        public abstract void e(Exception exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dmg$d */
    /* loaded from: classes5.dex */
    public interface d {
        UpnpDevice c(SsdpDevice ssdpDevice, Map<String, String> map, String str);
    }

    public C8456dmg(C8450dma c8450dma, InterfaceC8457dmh interfaceC8457dmh, C8468dms c8468dms, Handler handler) {
        C1044Mm.a("UpnpClient", "Creating new UpnpClient with policy: " + c8468dms);
        this.b = c8450dma;
        this.a = interfaceC8457dmh;
        this.e = c8468dms;
        this.j = handler;
        this.d = new d() { // from class: o.dmk
            @Override // o.C8456dmg.d
            public final UpnpDevice c(SsdpDevice ssdpDevice, Map map, String str) {
                return UpnpDevice.b(ssdpDevice, map, str);
            }
        };
    }

    public void c(String str, String[] strArr, c cVar, C8454dme c8454dme) {
        C1044Mm.a("UpnpClient", String.format("Starting discovery for service type: %s, headers to track: %s", str, strArr));
        this.b.e(str, e(strArr, cVar), c8454dme);
    }

    public void a() {
        C1044Mm.a("UpnpClient", "Stopping discovery");
        this.b.e();
    }

    public boolean e() {
        return this.b.d();
    }

    public void b() {
        C1044Mm.a("UpnpClient", "Clearing device list");
        synchronized (this.c) {
            this.c.clear();
        }
        this.b.b();
    }

    public void d(SsdpDevice ssdpDevice, int i, String[] strArr, b bVar) {
        C1044Mm.a("UpnpClient", String.format("Getting device info - device: %s, headers: %s", ssdpDevice.b(), strArr));
        String b2 = ssdpDevice.b();
        this.a.c(b2, new AnonymousClass3(b2, bVar, strArr, ssdpDevice, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dmg$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass3 implements InterfaceC8457dmh.e {
        final /* synthetic */ int b;
        final /* synthetic */ b c;
        final /* synthetic */ SsdpDevice d;
        final /* synthetic */ String[] e;
        final /* synthetic */ String g;

        AnonymousClass3(String str, b bVar, String[] strArr, SsdpDevice ssdpDevice, int i) {
            this.g = str;
            this.c = bVar;
            this.e = strArr;
            this.d = ssdpDevice;
            this.b = i;
        }

        @Override // o.InterfaceC8457dmh.e
        public void c(final int i, final Map<String, String> map, final String str) {
            Handler handler = C8456dmg.this.j;
            final String str2 = this.g;
            final b bVar = this.c;
            final String[] strArr = this.e;
            final SsdpDevice ssdpDevice = this.d;
            handler.post(new Runnable() { // from class: o.dmj
                @Override // java.lang.Runnable
                public final void run() {
                    C8456dmg.AnonymousClass3.this.b(i, str2, bVar, strArr, map, ssdpDevice, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, String str, b bVar, String[] strArr, Map map, SsdpDevice ssdpDevice, String str2) {
            if (i < 200 || i >= 300) {
                C1044Mm.d("UpnpClient", String.format("Received non-200 status code from device info response.  statusCode: %d, location: %s", Integer.valueOf(i), str));
                bVar.b(new Exception("Received non-200 status code from device info response.  Status: " + i));
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str3 : strArr) {
                if (map.containsKey(str3)) {
                    hashMap.put(str3, (String) map.get(str3));
                }
            }
            try {
                bVar.a(C8456dmg.this.d.c(ssdpDevice, hashMap, str2));
            } catch (Exception e) {
                C1044Mm.e("UpnpClient", "Failed to get UpnpDevice from device info response", e);
                bVar.b(e);
            }
        }

        @Override // o.InterfaceC8457dmh.e
        public void a(final Exception exc) {
            C1044Mm.e("UpnpClient", "Failed to get device info", exc);
            if (this.b == 0) {
                C8456dmg.this.d(this.d, 1, this.e, this.c);
                return;
            }
            Handler handler = C8456dmg.this.j;
            final b bVar = this.c;
            handler.post(new Runnable() { // from class: o.dml
                @Override // java.lang.Runnable
                public final void run() {
                    C8456dmg.b.this.b(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dmg$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass4 implements b {
        final /* synthetic */ c d;
        final /* synthetic */ SsdpDevice e;

        AnonymousClass4(SsdpDevice ssdpDevice, c cVar) {
            this.e = ssdpDevice;
            this.d = cVar;
        }

        @Override // o.C8456dmg.b
        public void a(UpnpDevice upnpDevice) {
            UpnpDevice d;
            boolean z;
            synchronized (C8456dmg.this.c) {
                d = C8456dmg.this.d(this.e.i());
                if (d == null) {
                    C8456dmg.this.c.add(upnpDevice);
                } else if (!upnpDevice.equals(d)) {
                    C8456dmg.this.c.remove(d);
                    C8456dmg.this.c.add(upnpDevice);
                    z = true;
                }
                z = false;
            }
            if (d == null) {
                this.d.d(upnpDevice);
            } else if (z) {
                this.d.e(d, upnpDevice);
            }
        }

        @Override // o.C8456dmg.b
        public void b(final Exception exc) {
            Handler handler = C8456dmg.this.j;
            final SsdpDevice ssdpDevice = this.e;
            final c cVar = this.d;
            handler.post(new Runnable() { // from class: o.dmp
                @Override // java.lang.Runnable
                public final void run() {
                    C8456dmg.AnonymousClass4.this.d(ssdpDevice, cVar, exc);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(SsdpDevice ssdpDevice, c cVar, Exception exc) {
            UpnpDevice d;
            synchronized (C8456dmg.this.c) {
                d = C8456dmg.this.d(ssdpDevice.i());
                if (d != null) {
                    C8456dmg.this.b.e(ssdpDevice);
                    C8456dmg.this.c.remove(d);
                }
            }
            if (d != null) {
                cVar.a(d, exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SsdpDevice ssdpDevice, String[] strArr, c cVar) {
        d(ssdpDevice, 0, strArr, new AnonymousClass4(ssdpDevice, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UpnpDevice d(String str) {
        synchronized (this.c) {
            for (UpnpDevice upnpDevice : this.c) {
                if (upnpDevice.k().i().equals(str)) {
                    return upnpDevice;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SsdpDevice ssdpDevice, c cVar, Exception exc) {
        UpnpDevice d2 = d(ssdpDevice.i());
        if (d2 != null) {
            synchronized (this.c) {
                this.c.remove(d2);
            }
            cVar.a(d2, exc);
        }
    }

    private C8450dma.c e(final String[] strArr, final c cVar) {
        return new C8450dma.c() { // from class: o.dmg.5
            @Override // o.C8450dma.c
            public void b(SsdpDevice ssdpDevice) {
                C8456dmg.this.c(ssdpDevice, strArr, cVar);
            }

            @Override // o.C8450dma.c
            public void d(SsdpDevice ssdpDevice, Exception exc) {
                C8456dmg.this.d(ssdpDevice, cVar, exc);
            }

            @Override // o.C8450dma.c
            public void a(SsdpDevice ssdpDevice, SsdpDevice ssdpDevice2) {
                C8456dmg.this.c(ssdpDevice2, strArr, cVar);
            }

            @Override // o.C8450dma.c
            public void d(Exception exc) {
                cVar.e(exc);
            }

            @Override // o.C8450dma.c
            public void c() {
                cVar.e();
            }

            @Override // o.C8450dma.c
            public void b() {
                synchronized (C8456dmg.this.c) {
                    for (UpnpDevice upnpDevice : C8456dmg.this.c) {
                        C8456dmg.this.c(upnpDevice.k(), strArr, cVar);
                    }
                }
                cVar.c();
            }
        };
    }
}
