package o;

import android.media.MediaDrmResetException;
import android.os.SystemClock;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmFactory;
import com.netflix.mediaclient.drm.PlatformMediaDrm;
import o.aPT;

/* renamed from: o.aQb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1837aQb {
    private static final c c = new c(null);
    private NetflixMediaDrm a;
    private boolean b;
    private Throwable d;
    private byte[] e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;

    public final boolean a() {
        return this.b;
    }

    public final byte[] b() {
        return this.e;
    }

    public final Throwable d() {
        return this.d;
    }

    public final String e() {
        return this.i;
    }

    public final String f() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aQb$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("nf_widevine_WidevineInitializer");
        }
    }

    private final boolean i() {
        int i = this.f;
        if (i >= 2) {
            return false;
        }
        this.f = i + 1;
        C1840aQe.d.b(this.a);
        g();
        return true;
    }

    public final void c() {
        C8239dgd.e(SystemClock.elapsedRealtime());
        g();
    }

    private final void g() {
        PlatformMediaDrm platformMediaDrm;
        Throwable th;
        c cVar;
        PlatformMediaDrm createPlatformMediaDrm;
        aPT.b bVar = aPT.b.a;
        PlatformMediaDrm platformMediaDrm2 = null;
        try {
            cVar = c;
            cVar.getLogTag();
            createPlatformMediaDrm = NetflixMediaDrmFactory.createPlatformMediaDrm(C8189dfg.d);
        } catch (MediaDrmResetException e) {
            e = e;
        } catch (Throwable th2) {
            platformMediaDrm = null;
            th = th2;
        }
        try {
            this.a = createPlatformMediaDrm;
            aPT.c cVar2 = aPT.c.c;
            cVar.getLogTag();
            String propertyString = createPlatformMediaDrm.getPropertyString(NetflixMediaDrm.PROPERTY_SECURITY_LEVEL);
            this.i = propertyString;
            this.j = propertyString;
            C1840aQe c1840aQe = C1840aQe.d;
            if (c1840aQe.d()) {
                cVar.getLogTag();
                this.i = "L3";
            }
            aPT.e eVar = aPT.e.b;
            cVar.getLogTag();
            this.h = createPlatformMediaDrm.getPropertyString(NetflixMediaDrm.PROPERTY_SYSTEM_ID);
            aPT.a aVar = aPT.a.d;
            this.e = createPlatformMediaDrm.getPropertyByteArray(NetflixMediaDrm.PROPERTY_DEVICE_UNIQUE_ID);
            aPT.d dVar = aPT.d.c;
            cVar.getLogTag();
            this.g = c1840aQe.c(createPlatformMediaDrm);
            this.b = C8239dgd.a(true);
            c1840aQe.b(createPlatformMediaDrm);
            int i = this.f;
            if (i > 0) {
                c1840aQe.e("WidevineInitializer.collectMetadata:: Completed after retries", null, Integer.valueOf(i));
            } else {
                cVar.getLogTag();
            }
        } catch (MediaDrmResetException e2) {
            e = e2;
            platformMediaDrm2 = createPlatformMediaDrm;
            C1840aQe c1840aQe2 = C1840aQe.d;
            c1840aQe2.c(platformMediaDrm2, e, bVar.d());
            if (i()) {
                return;
            }
            c1840aQe2.e(bVar.a(), e, Integer.valueOf(this.f));
            this.b = C8239dgd.a(false);
            this.d = e;
        } catch (Throwable th3) {
            th = th3;
            platformMediaDrm = createPlatformMediaDrm;
            C1840aQe c1840aQe3 = C1840aQe.d;
            C1840aQe.d(c1840aQe3, bVar.a(), th, null, 4, null);
            c1840aQe3.c(platformMediaDrm, th, bVar.d());
            this.b = C8239dgd.a(false);
            this.d = th;
        }
    }
}
