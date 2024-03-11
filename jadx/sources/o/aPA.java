package o;

import android.content.Context;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmFactory;
import com.netflix.mediaclient.drm.PlatformMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import com.netflix.mediaclient.service.configuration.crypto.DrmStateManager;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o.aPC;

/* loaded from: classes3.dex */
public abstract class aPA implements aPC, NetflixMediaDrm.OnEventListener {
    public static int a = 0;
    protected static final byte[] c = new byte[0];
    private static String l = "nf_msl_CryptoManager";
    protected Context b;
    protected aOV d;
    protected aPC.e e;
    protected CryptoProvider g;
    protected NetflixMediaDrm h;
    protected final CryptoErrorManager i;
    private C1833aPy m;
    private aYT t;
    protected DrmStateManager j = new DrmStateManager();
    protected AtomicInteger f = new AtomicInteger();
    private final List<aPC.a> p = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final List<aPC.a> f13435o = new ArrayList();
    private final Map<byte[], a> k = Collections.synchronizedMap(new HashMap());
    private int r = 0;

    protected static String a() {
        return "AES/CBC/NoPadding";
    }

    protected static String d() {
        return "HmacSHA256";
    }

    private void t() {
    }

    @Override // o.aPC
    public C1833aPy b() {
        return this.m;
    }

    protected abstract String e();

    protected abstract void h();

    protected abstract UUID j();

    public aPA(Context context, CryptoProvider cryptoProvider, aOV aov, aPC.e eVar, CryptoErrorManager cryptoErrorManager) {
        l = e();
        if (eVar == null) {
            throw new IllegalArgumentException("Callback is null!");
        }
        this.g = cryptoProvider;
        this.i = cryptoErrorManager;
        this.e = eVar;
        this.d = aov;
        this.b = context;
        n();
        t();
        p();
        this.e.d();
    }

    private void n() {
        synchronized (this) {
            try {
                try {
                    PlatformMediaDrm createPlatformMediaDrm = NetflixMediaDrmFactory.createPlatformMediaDrm(j());
                    this.h = createPlatformMediaDrm;
                    createPlatformMediaDrm.setOnEventListener(this);
                    h();
                    this.m = new C1833aPy(this.g, this.h);
                    this.r = 0;
                } catch (MediaDrmResetException e) {
                    b(e);
                }
            } catch (Exception e2) {
                DrmMetricsCollector.d.d(new aPH(this.h, DrmMetricsCollector.NfAppStage.e).b(DrmMetricsCollector.WvApi.v).c("BaseCryptoManager").b(e2));
                throw e2;
            }
        }
    }

    private void b(MediaDrmResetException mediaDrmResetException) {
        int i = this.r;
        if (i >= 2) {
            throw mediaDrmResetException;
        }
        this.r = i + 1;
        C1044Mm.d(l, "MediaDrm instance is not usable anymore, recreate!");
        try {
            this.h.close();
        } catch (Throwable unused) {
        }
        n();
    }

    @Override // o.aPC
    public void d(aPC.a aVar) {
        i(aVar);
        e(aVar);
    }

    public void e(aPC.a aVar) {
        byte[] bArr;
        if (aVar == null || this.h == null || (bArr = aVar.e) == null) {
            return;
        }
        a(bArr);
        byte[] bArr2 = aVar.e;
        aVar.e = null;
        aVar.b = null;
        a(aVar, bArr2);
    }

    private void a(byte[] bArr) {
        try {
            this.h.closeSession(bArr);
            this.f.decrementAndGet();
            this.k.remove(bArr);
        } catch (Throwable th) {
            C1044Mm.a(l, th, "closeCryptoSessions failed !");
        }
    }

    private void i(aPC.a aVar) {
        if (aVar == null || this.h == null || aVar.e == null) {
            return;
        }
        if (aVar.b == null) {
            C1044Mm.e(l, "removeSessionKeys:: Nothing to remove! Skip!");
            return;
        }
        C1044Mm.e(l, "removeSessionKeys:: ");
        try {
            this.h.removeKeys(aVar.e);
        } catch (Exception e) {
            C1044Mm.b(l, e, "removeSessionKeys failed", new Object[0]);
        }
    }

    protected NetflixMediaDrm.CryptoSession c(aPC.a aVar) {
        NetflixMediaDrm.CryptoSession cryptoSession;
        synchronized (this) {
            if (aVar == null) {
                return null;
            }
            a(aVar);
            byte[] bArr = aVar.e;
            if (bArr == null) {
                String str = l;
                C1044Mm.j(str, "findMediaDrmCryptoSession:: session found but without session ID: " + aVar);
                return null;
            }
            System.currentTimeMillis();
            synchronized (this.k) {
                a aVar2 = this.k.get(bArr);
                if (aVar2 == null || aVar2.c == null) {
                    a aVar3 = new a(this.h.getCryptoSession(bArr, a(), d()), aVar);
                    this.k.put(bArr, aVar3);
                    aVar2 = aVar3;
                }
                cryptoSession = aVar2.c;
                System.currentTimeMillis();
            }
            return cryptoSession;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    @Override // o.aPC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] d(o.aPC.a r3, o.aPC.c r4, byte[] r5, byte[] r6) {
        /*
            r2 = this;
            byte[] r3 = r2.c(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5
            goto L19
        L5:
            r0 = move-exception
            boolean r0 = r2.e(r0)
            r1 = 0
            if (r0 == 0) goto L18
            r3.e = r1
            byte[] r3 = r2.c(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r3 = move-exception
            r2.c(r3)
        L18:
            r3 = r1
        L19:
            if (r3 == 0) goto L1c
            return r3
        L1c:
            byte[] r3 = o.aPA.c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aPA.d(o.aPC$a, o.aPC$c, byte[], byte[]):byte[]");
    }

    protected byte[] c(aPC.a aVar, aPC.c cVar, byte[] bArr, byte[] bArr2) {
        NetflixMediaDrm.CryptoSession c2 = c(aVar);
        if (c2 == null) {
            C1044Mm.j(l, "decrypt - session NOT found!");
            return null;
        } else if (cVar == null) {
            C1044Mm.j(l, "decrypt - kce is null!");
            return null;
        } else {
            try {
                return C8137deh.e(c2.decrypt(cVar.a(), bArr, bArr2), 16);
            } catch (Throwable th) {
                C1044Mm.b(l, th, "Failed to decrypt ", new Object[0]);
                b(StatusCode.DRM_FAILURE_MEDIADRM_DECRYPT, th);
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // o.aPC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] e(o.aPC.a r3, o.aPC.c r4, byte[] r5, byte[] r6) {
        /*
            r2 = this;
            java.lang.String r0 = o.aPA.l
            java.lang.String r1 = "BaseCryptoManager::encrypt..."
            o.C1044Mm.e(r0, r1)
            byte[] r3 = r2.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc
            goto L20
        Lc:
            r0 = move-exception
            boolean r0 = r2.e(r0)
            r1 = 0
            if (r0 == 0) goto L1f
            r3.e = r1
            byte[] r3 = r2.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            goto L20
        L1b:
            r3 = move-exception
            r2.c(r3)
        L1f:
            r3 = r1
        L20:
            if (r3 == 0) goto L23
            return r3
        L23:
            byte[] r3 = o.aPA.c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aPA.e(o.aPC$a, o.aPC$c, byte[], byte[]):byte[]");
    }

    protected boolean e(Throwable th) {
        if (th instanceof MediaDrmResetException) {
            C1044Mm.d(l, "MediaDrm instance is not usable anymore, recreate!");
            try {
                this.h.close();
            } catch (Throwable unused) {
            }
            try {
                n();
                p();
                return true;
            } catch (Throwable th2) {
                C1044Mm.b(l, th2, "Failed to recreate MediaDrm, abort", new Object[0]);
                return false;
            }
        }
        return false;
    }

    private boolean c(Throwable th) {
        if (th instanceof MediaDrmResetException) {
            b(StatusCode.DRM_FAILURE_MEDIADRM_RESET, th);
            return true;
        }
        return false;
    }

    protected byte[] b(aPC.a aVar, aPC.c cVar, byte[] bArr, byte[] bArr2) {
        int i;
        byte[] copyOfRange;
        int i2;
        NetflixMediaDrm.CryptoSession c2 = c(aVar);
        if (c2 == null) {
            C1044Mm.j(l, "encrypt - session NOT found!");
            return null;
        } else if (cVar == null) {
            C1044Mm.j(l, "encrypt - kce is null!");
            return null;
        } else {
            try {
                int length = bArr.length;
                if (length <= 16384) {
                    return c2.encrypt(cVar.a(), C8137deh.b(bArr, 16), bArr2);
                }
                C1044Mm.j(l, "encrypt piecewise");
                byte[] bArr3 = new byte[(16 - (length % 16)) + length];
                int i3 = 0;
                while (true) {
                    i = i3 + 16384;
                    byte[] encrypt = c2.encrypt(cVar.a(), Arrays.copyOfRange(bArr, i3, i), bArr2);
                    copyOfRange = Arrays.copyOfRange(encrypt, 16368, 16384);
                    System.arraycopy(encrypt, 0, bArr3, i3, 16384);
                    i2 = length - i;
                    if (i2 <= 16384) {
                        break;
                    }
                    i3 = i;
                    bArr2 = copyOfRange;
                }
                if (i2 > 0) {
                    byte[] encrypt2 = c2.encrypt(cVar.a(), C8137deh.b(Arrays.copyOfRange(bArr, i, length), 16), copyOfRange);
                    System.arraycopy(encrypt2, 0, bArr3, i, encrypt2.length);
                }
                return bArr3;
            } catch (Throwable th) {
                C1044Mm.b(l, th, "Failed to encrypt ", new Object[0]);
                b(StatusCode.DRM_FAILURE_MEDIADRM_ENCRYPT, th);
                return null;
            }
        }
    }

    @Override // o.aPC
    public byte[] a(aPC.a aVar, aPC.c cVar, byte[] bArr) {
        byte[] bArr2;
        try {
            bArr2 = c(aVar, cVar, bArr);
        } catch (Throwable th) {
            if (!e(th)) {
                return c;
            }
            aVar.e = null;
            try {
                bArr2 = c(aVar, cVar, bArr);
            } catch (Throwable th2) {
                if (!c(th2)) {
                    return c;
                }
                bArr2 = null;
            }
        }
        return bArr2 != null ? bArr2 : c;
    }

    private byte[] c(aPC.a aVar, aPC.c cVar, byte[] bArr) {
        NetflixMediaDrm.CryptoSession c2 = c(aVar);
        if (c2 == null) {
            C1044Mm.j(l, "sign - session NOT found!");
            return null;
        } else if (cVar == null) {
            C1044Mm.j(l, "sign - kch is null!");
            return null;
        } else {
            return c2.sign(cVar.a(), bArr);
        }
    }

    @Override // o.aPC
    public boolean a(aPC.a aVar, aPC.c cVar, byte[] bArr, byte[] bArr2) {
        try {
            return j(aVar, cVar, bArr, bArr2);
        } catch (Throwable th) {
            if (e(th)) {
                aVar.e = null;
                try {
                    return j(aVar, cVar, bArr, bArr2);
                } catch (Throwable th2) {
                    return !c(th2) ? false : false;
                }
            }
            return false;
        }
    }

    private boolean j(aPC.a aVar, aPC.c cVar, byte[] bArr, byte[] bArr2) {
        NetflixMediaDrm.CryptoSession c2 = c(aVar);
        if (c2 == null) {
            C1044Mm.j(l, "verify - session NOT found!");
            return false;
        } else if (cVar == null) {
            C1044Mm.j(l, "verify - kch is null!");
            return false;
        } else {
            return c2.verify(cVar.a(), bArr, bArr2);
        }
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.OnEventListener
    public void onEvent(NetflixMediaDrm netflixMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        if (i == 1) {
            C1044Mm.e(l, "Provisioning is required");
        } else if (i == 2) {
            C1044Mm.e(l, "MediaDrm event: Key required");
        } else if (i == 3) {
            C1044Mm.e(l, "MediaDrm event: Key expired");
        } else if (i != 4 && i == 5) {
            a(bArr);
            d(bArr);
            this.e.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:15:0x0066, B:17:0x006f, B:20:0x0078, B:14:0x0032), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:15:0x0066, B:17:0x006f, B:20:0x0078, B:14:0x0032), top: B:26:0x0001 }] */
    @Override // o.aPC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.aPC.a c(o.C8418dkw r5, byte[] r6, o.aPC.c r7, o.aPC.c r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r7 = o.aPA.l     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = "Provide key response..."
            o.C1044Mm.e(r7, r8)     // Catch: java.lang.Throwable -> L81
            o.aPC$a r5 = r4.a(r5)     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.service.configuration.crypto.DrmStateManager r7 = r4.j     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.service.configuration.crypto.DrmStateManager$State r7 = r7.b()     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.service.configuration.crypto.DrmStateManager$State r8 = com.netflix.mediaclient.service.configuration.crypto.DrmStateManager.State.suspended     // Catch: java.lang.Throwable -> L81
            if (r7 != r8) goto L20
            java.lang.String r7 = o.aPA.l     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = "DRM in suspended state, update key response called, need to restore state"
            o.C1044Mm.e(r7, r8)     // Catch: java.lang.Throwable -> L81
            r4.i()     // Catch: java.lang.Throwable -> L81
        L20:
            r7 = 0
            com.netflix.mediaclient.drm.NetflixMediaDrm r8 = r4.h     // Catch: java.lang.Throwable -> L2f
            byte[] r0 = r5.e     // Catch: java.lang.Throwable -> L2f
            byte[] r6 = r8.provideKeyResponse(r0, r6)     // Catch: java.lang.Throwable -> L2f
            r4.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L66
        L2d:
            r8 = move-exception
            goto L32
        L2f:
            r6 = move-exception
            r8 = r6
            r6 = r7
        L32:
            com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector r0 = com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector.d     // Catch: java.lang.Throwable -> L81
            o.aPH r1 = new o.aPH     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.drm.NetflixMediaDrm r2 = r4.h     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector$NfAppStage r3 = com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector.NfAppStage.e     // Catch: java.lang.Throwable -> L81
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector$WvApi r2 = com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector.WvApi.p     // Catch: java.lang.Throwable -> L81
            o.aPH r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "BaseCryptoManager"
            o.aPH r1 = r1.c(r2)     // Catch: java.lang.Throwable -> L81
            o.aPH r1 = r1.b(r8)     // Catch: java.lang.Throwable -> L81
            r0.d(r1)     // Catch: java.lang.Throwable -> L81
            r4.e(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = o.aPA.l     // Catch: java.lang.Throwable -> L81
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "Failed to provide key response"
            o.C1044Mm.b(r0, r8, r2, r1)     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.ui.error.CryptoErrorManager r0 = r4.i     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.service.error.crypto.ErrorSource r1 = com.netflix.mediaclient.service.error.crypto.ErrorSource.msl     // Catch: java.lang.Throwable -> L81
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.DRM_FAILURE_MEDIADRM_PROVIDE_KEY_RESPONSE     // Catch: java.lang.Throwable -> L81
            r0.a(r1, r2, r8)     // Catch: java.lang.Throwable -> L81
        L66:
            java.lang.String r8 = o.aPA.l     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "Save keys..."
            o.C1044Mm.e(r8, r0)     // Catch: java.lang.Throwable -> L81
            if (r6 != 0) goto L78
            java.lang.String r5 = o.aPA.l     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = "Something is wrong, this should not happen! KeySetId is null!"
            o.C1044Mm.d(r5, r6)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r4)
            return r7
        L78:
            o.aPC$c r7 = new o.aPC$c     // Catch: java.lang.Throwable -> L81
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L81
            r5.b = r7     // Catch: java.lang.Throwable -> L81
            monitor-exit(r4)
            return r5
        L81:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aPA.c(o.dkw, byte[], o.aPC$c, o.aPC$c):o.aPC$a");
    }

    private aPC.a a(C8418dkw c8418dkw) {
        if (!(c8418dkw instanceof aYT)) {
            throw new IllegalStateException("Not original request! But: " + c8418dkw);
        }
        aYT ayt = (aYT) c8418dkw;
        if (this.t != ayt) {
            throw new IllegalStateException("Not original request! Instead of: " + this.t + ", we got: " + c8418dkw);
        }
        this.t = null;
        return ayt.a();
    }

    @Override // o.aPC
    public C8418dkw c() {
        aYT ayt;
        synchronized (this) {
            aYT ayt2 = this.t;
            if (ayt2 != null && !ayt2.a().d()) {
                C1044Mm.e(l, "Key request is already pending, return it");
                ayt = this.t;
            }
            C1044Mm.e(l, "valid keyRequestData does not exist, create it!");
            this.t = new aYT(m(), this.d.w().j());
            ayt = this.t;
        }
        return ayt;
    }

    private aPC.a m() {
        aPC.a aVar = new aPC.a();
        try {
            C1044Mm.e(l, "createCryptoSession:: before open session");
            aVar.e = this.h.openSession(NetflixMediaDrm.SessionType.OFFLINE);
            k();
            C1044Mm.e(l, "createCryptoSession:: after open session");
            aVar.a = this.h.getKeyRequest(aVar.e, aPC.n, "application/xml", 2, new HashMap<>()).getData();
            if (aVar.d()) {
                C1044Mm.d(l, "keyRequestData is null or empty, doCloseCryptoSession to avoid session leaks");
                e(aVar);
            }
            String str = l;
            C1044Mm.e(str, "keyRequestData: |" + aVar.e() + "|");
            C1044Mm.a(l, "Number of all opened crypto sessions: %d", Integer.valueOf(this.f.get()));
        } catch (Throwable th) {
            C1044Mm.b(l, th, "createCryptoSession failed !", new Object[0]);
            DrmMetricsCollector.d.d(new aPH(this.h, DrmMetricsCollector.NfAppStage.e).b(DrmMetricsCollector.WvApi.m).c("BaseCryptoManager").b(th));
            if (e(th)) {
                try {
                    aVar.e = this.h.openSession(NetflixMediaDrm.SessionType.OFFLINE);
                    k();
                    aVar.a = this.h.getKeyRequest(aVar.e, aPC.n, "application/xml", 2, new HashMap<>()).getData();
                    if (aVar.d()) {
                        C1044Mm.d(l, "keyRequestData is null or empty, doCloseCryptoSession to avoid session leaks");
                        e(aVar);
                    }
                } catch (Throwable th2) {
                    DrmMetricsCollector.d.d(new aPH(this.h, DrmMetricsCollector.NfAppStage.e).b(DrmMetricsCollector.WvApi.l).c("BaseCryptoManager").b(th));
                    C1044Mm.b(l, th2, "Failed to get key request on retry, report an error", new Object[0]);
                    e(aVar);
                    a = this.f.get();
                    this.i.a(ErrorSource.msl, StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST, th);
                    return aVar;
                }
            }
            e(aVar);
            a = this.f.get();
            this.i.a(ErrorSource.msl, StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST, th);
        }
        return aVar;
    }

    @Override // o.aPC
    public aPC.a c(aPC.c cVar) {
        aPC.a aVar = new aPC.a();
        aVar.b = cVar;
        C1044Mm.a(l, "deferred restoreKeysToSession %s ", cVar);
        return aVar;
    }

    private void b(StatusCode statusCode, Throwable th) {
        if (th instanceof NotProvisionedException) {
            InterfaceC1598aHf.a(new C1596aHd("NotProvisionedException in CryptoManager").b(false).d(th).b(ErrorType.p).c(true));
        }
        this.i.a(ErrorSource.msl, statusCode, th);
    }

    private void k() {
        this.f.incrementAndGet();
    }

    private void p() {
        C1044Mm.e(l, "resetOpenedSessionCount::");
        this.f.set(0);
        this.p.clear();
        this.f13435o.clear();
    }

    private void a(aPC.a aVar) {
        if (this.h == null) {
            C1044Mm.j(l, "MediaDrm is null, app was in suspended state");
            try {
                n();
            } catch (MediaDrmResetException | UnsupportedSchemeException e) {
                C1044Mm.b(l, e, "Unable to restore MediaDrm", new Object[0]);
                b(StatusCode.DRM_FAILURE_MEDIADRM_RECOVERY_FROM_SUSPEND_UNABLE_TO_CREATE_DRM, e);
                return;
            }
        }
        if (aVar.e != null || aVar.b == null) {
            return;
        }
        try {
            aVar.e = this.h.openSession(NetflixMediaDrm.SessionType.OFFLINE);
            k();
            this.h.restoreKeys(aVar.e, aVar.b.a());
            this.j.c(DrmStateManager.State.notSuspended);
            h(aVar);
        } catch (Throwable th) {
            DrmMetricsCollector.d.d(new aPH(this.h, DrmMetricsCollector.NfAppStage.e).b(DrmMetricsCollector.WvApi.n).c("BaseCryptoManager").b(th));
            e(aVar, th);
        }
    }

    private void e(aPC.a aVar, Throwable th) {
        StatusCode statusCode;
        C1044Mm.b(l, th, "Failed to restore keys!", new Object[0]);
        if (this.j.b() == DrmStateManager.State.notSuspended) {
            statusCode = StatusCode.DRM_FAILURE_MEDIADRM_KEYS_RESTORE_FAILED;
        } else if (this.j.b() == DrmStateManager.State.inRestoration) {
            statusCode = StatusCode.DRM_FAILURE_MEDIADRM_SUSPENDED_KEYS_RESTORE_FAILED;
        } else {
            statusCode = StatusCode.DRM_FAILURE_MEDIADRM_IN_RECOVERY_FROM_SUSPEND_KEYS_RESTORE_FAILED;
        }
        InterfaceC1598aHf.a(new C1596aHd(statusCode.name()).b(false));
        try {
            e(aVar);
        } catch (Throwable th2) {
            C1044Mm.b(l, th2, "Failed to close crypto session?", new Object[0]);
        }
        b(statusCode, th);
    }

    private void h(aPC.a aVar) {
        e(aVar, this.p, 2, "OpenedPersistedSessions");
    }

    private void e(aPC.a aVar, List<aPC.a> list, int i, String str) {
        synchronized (Collections.unmodifiableList(list)) {
            boolean add = list.add(aVar);
            int size = list.size() - i;
            C1044Mm.a(l, "Crypto session %s added to %s successfully %b, Need to remove %d older sessions", C8137deh.e(aVar.e), str, Boolean.valueOf(add), Integer.valueOf(size));
            for (int i2 = 0; i2 < size; i2++) {
                aPC.a remove = list.remove(0);
                if (remove != null && remove.e != null) {
                    C1044Mm.a(l, "addSessionToFIFO: removing %s from %d position", remove, Integer.valueOf(i2));
                    a(remove.e);
                    remove.e = null;
                }
            }
        }
    }

    private void a(aPC.a aVar, byte[] bArr) {
        boolean remove;
        boolean remove2;
        if (aVar == null) {
            C1044Mm.j(l, "Session is null!");
            return;
        }
        synchronized (this.p) {
            remove = this.p.remove(aVar);
        }
        C1044Mm.a(l, "Crypto session %s was removed from OpenedPersistedSessions %b, left %d", null, Boolean.valueOf(remove), Integer.valueOf(this.p.size()));
        synchronized (this.f13435o) {
            remove2 = this.f13435o.remove(aVar);
        }
        C1044Mm.a(l, "Crypto session %s was removed from KeyAcquiredSessions %b, left %d", null, Boolean.valueOf(remove2), Integer.valueOf(this.f13435o.size()));
    }

    private void d(byte[] bArr) {
        if (d(bArr, this.p) == null) {
            d(bArr, this.f13435o);
        }
    }

    private aPC.a d(byte[] bArr, List<aPC.a> list) {
        aPC.a aVar;
        synchronized (Collections.unmodifiableList(list)) {
            Iterator<aPC.a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (Arrays.equals(bArr, aVar.e)) {
                    break;
                }
            }
            if (aVar != null) {
                list.remove(aVar);
            }
        }
        return aVar;
    }

    private void b(aPC.a aVar) {
        e(aVar, this.f13435o, 2, "KeyAcquiredSessions");
    }

    @Override // o.aPC
    public void g() {
        synchronized (this) {
            C1044Mm.e(l, "Suspend requested and enabled...");
            this.j.c(DrmStateManager.State.suspended);
            C1044Mm.a(l, "OpenedPersistedSessions: %d", Integer.valueOf(this.p.size()));
            C1044Mm.a(l, "Crypto sessions: %d", Integer.valueOf(this.k.size()));
            ArrayList<aPC.a> arrayList = new ArrayList();
            for (a aVar : this.k.values()) {
                this.j.e().add(aVar.e);
                arrayList.add(aVar.e);
            }
            for (aPC.a aVar2 : arrayList) {
                byte[] bArr = aVar2.e;
                if (bArr != null) {
                    aVar2.e = null;
                    a(bArr);
                    a(aVar2, bArr);
                }
            }
            arrayList.clear();
            C1044Mm.j(l, "Suspend:: Still opened crypto sessions: %d", Integer.valueOf(this.k.size()));
            NetflixMediaDrm netflixMediaDrm = this.h;
            if (netflixMediaDrm != null) {
                netflixMediaDrm.close();
                this.h = null;
            }
        }
    }

    @Override // o.aPC
    public void i() {
        synchronized (this) {
            C1044Mm.e(l, "Restore requested and enabled...");
            if (this.j.b() == DrmStateManager.State.notSuspended) {
                C1044Mm.j(l, "It was already restored, do nothing...");
                return;
            }
            this.j.c(DrmStateManager.State.inRestoration);
            List<aPC.a> e = this.j.e();
            C1044Mm.a(l, "Restoring crypto sessions: %d", Integer.valueOf(e.size()));
            for (aPC.a aVar : e) {
                c(aVar);
            }
            this.j.e().clear();
            this.j.c(DrmStateManager.State.notSuspended);
        }
    }

    @Override // o.aPC
    public boolean f() {
        return this.j.b() != DrmStateManager.State.notSuspended;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class a {
        NetflixMediaDrm.CryptoSession c;
        aPC.a e;

        public a(NetflixMediaDrm.CryptoSession cryptoSession, aPC.a aVar) {
            this.c = cryptoSession;
            this.e = aVar;
        }
    }
}
