package o;

import android.content.Context;
import android.media.MediaDrmResetException;
import android.media.UnsupportedSchemeException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmFactory;
import com.netflix.mediaclient.drm.PlatformMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.esn.WidevineL1NotSupportedWhenExpectedException;
import com.netflix.mediaclient.service.configuration.esn.WidevineNotSupportedException;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aPp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1824aPp implements aPR {
    private NetflixMediaDrm a;
    private final aPY b;
    private final String c;
    private final c d;
    private final Context e;
    private final CryptoErrorManager h;

    /* renamed from: o.aPp$c */
    /* loaded from: classes3.dex */
    public interface c {
        void e(Status status);
    }

    public C1824aPp(Context context, aPY apy, CryptoErrorManager cryptoErrorManager, c cVar) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) apy, "");
        C8632dsu.c((Object) cryptoErrorManager, "");
        C8632dsu.c((Object) cVar, "");
        this.e = context;
        this.b = apy;
        this.h = cryptoErrorManager;
        this.d = cVar;
        this.c = "ProvisioningConsumer";
    }

    public final void b() {
        Throwable th;
        try {
            CryptoProvider c2 = C1834aPz.a.c(this.e, this.b);
            if (c2 == CryptoProvider.LEGACY && AbstractApplicationC1040Mh.getInstance().o().j()) {
                C1044Mm.d(this.c, "legacy crypto in the background.");
                C8054ddD.e(this.e);
                return;
            }
            NetflixMediaDrm a = a(c2);
            this.a = a;
            new C1841aQf(a, c2, this.h, this).e();
        } catch (UnsupportedSchemeException e) {
            d(e);
        } catch (WidevineL1NotSupportedWhenExpectedException e2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd c1596aHd = new C1596aHd("Widevine L1 not supported when expected", e2, ErrorType.p, false, null, false, false, 112, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c3 = errorType.c();
                    c1596aHd.a(c3 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            c cVar2 = this.d;
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aU;
            C8632dsu.a(netflixImmutableStatus, "");
            cVar2.e(netflixImmutableStatus);
        } catch (WidevineNotSupportedException e3) {
            d(e3);
        } catch (Throwable th2) {
            C1044Mm.b(this.c, th2, "Failed to check on provisioning!", new Object[0]);
            c cVar3 = this.d;
            NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.aM;
            C8632dsu.a(netflixImmutableStatus2, "");
            cVar3.e(netflixImmutableStatus2);
        }
    }

    private final void e() {
        try {
            NetflixMediaDrm netflixMediaDrm = this.a;
            if (netflixMediaDrm != null) {
                netflixMediaDrm.close();
            }
            this.a = null;
        } catch (Throwable th) {
            C1044Mm.b(this.c, th, "Failed to close MediaDrm after provisioning test!", new Object[0]);
        }
    }

    @Override // o.aPR
    public void c() {
        C1044Mm.e(this.c, "reportSuccess");
        e();
        c cVar = this.d;
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        C8632dsu.a(netflixImmutableStatus, "");
        cVar.e(netflixImmutableStatus);
    }

    @Override // o.aPR
    public void c(Status status) {
        C8632dsu.c((Object) status, "");
        String str = this.c;
        C1044Mm.d(str, "reportSuccess res=" + status);
        e();
        this.d.e(status);
    }

    @Override // o.aPR
    public NetflixMediaDrm c(Throwable th, CryptoProvider cryptoProvider) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) cryptoProvider, "");
        if (th instanceof MediaDrmResetException) {
            C1044Mm.d(this.c, "MediaDrm instance is not usable anymore, recreate!");
            e();
            try {
                PlatformMediaDrm createPlatformMediaDrm = NetflixMediaDrmFactory.createPlatformMediaDrm(C8189dfg.d);
                C8632dsu.a(createPlatformMediaDrm, "");
                if (cryptoProvider == CryptoProvider.WIDEVINE_L3) {
                    C8189dfg.d(createPlatformMediaDrm);
                }
                this.a = createPlatformMediaDrm;
                return createPlatformMediaDrm;
            } catch (Throwable th2) {
                C1044Mm.b(this.c, th2, "Failed to recreate MediaDrm, abort", new Object[0]);
                return null;
            }
        }
        return null;
    }

    private final NetflixMediaDrm a(CryptoProvider cryptoProvider) {
        PlatformMediaDrm createPlatformMediaDrm = NetflixMediaDrmFactory.createPlatformMediaDrm(C8189dfg.d);
        C8632dsu.a(createPlatformMediaDrm, "");
        if (cryptoProvider == CryptoProvider.WIDEVINE_L3) {
            C1044Mm.e(this.c, "Setting security level to L3");
            C8189dfg.d(createPlatformMediaDrm);
        } else if (cryptoProvider == CryptoProvider.LEGACY) {
            throw new WidevineNotSupportedException();
        }
        return createPlatformMediaDrm;
    }

    private final void d(Exception exc) {
        Throwable th;
        Throwable th2;
        if (C8189dfg.d(this.e, this.b)) {
            C1044Mm.j(this.c, "Legacy crypto provider, unable to create Crypto, but Widevine was used before, we may be able to recover");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd d = new C1596aHd("No Widevine support, but Widevine used before", null, null, false, null, false, false, 126, null).b(false).d(exc);
            ErrorType errorType = d.a;
            if (errorType != null) {
                d.e.put("errorType", errorType.c());
                String b = d.b();
                if (b != null) {
                    String c2 = errorType.c();
                    d.a(c2 + " " + b);
                }
            }
            if (d.b() != null && d.i != null) {
                th2 = new Throwable(d.b(), d.i);
            } else if (d.b() != null) {
                th2 = new Throwable(d.b());
            } else {
                th2 = d.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(d, th2);
            } else {
                dVar.e().b(d, th2);
            }
            this.h.a(ErrorSource.msl, StatusCode.MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE, null);
            c cVar2 = this.d;
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aA;
            C8632dsu.a(netflixImmutableStatus, "");
            cVar2.e(netflixImmutableStatus);
            return;
        }
        C1044Mm.d(this.c, "Legacy crypto provider, unable to create Crypto");
        InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
        C1596aHd d2 = new C1596aHd("No Widevine support", null, null, false, null, false, false, 126, null).b(false).d(exc);
        ErrorType errorType2 = d2.a;
        if (errorType2 != null) {
            d2.e.put("errorType", errorType2.c());
            String b2 = d2.b();
            if (b2 != null) {
                String c3 = errorType2.c();
                d2.a(c3 + " " + b2);
            }
        }
        if (d2.b() != null && d2.i != null) {
            th = new Throwable(d2.b(), d2.i);
        } else if (d2.b() != null) {
            th = new Throwable(d2.b());
        } else {
            th = d2.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar2.a();
        if (a2 != null) {
            a2.e(d2, th);
        } else {
            dVar2.e().b(d2, th);
        }
        c cVar4 = this.d;
        NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.at;
        C8632dsu.a(netflixImmutableStatus2, "");
        cVar4.e(netflixImmutableStatus2);
    }
}
