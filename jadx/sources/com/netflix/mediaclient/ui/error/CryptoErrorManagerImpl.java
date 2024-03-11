package com.netflix.mediaclient.ui.error;

import android.os.SystemClock;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.MediaDrmConsumer;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1596aHd;
import o.C1834aPz;
import o.C3842bMr;
import o.C8157dfA;
import o.C8168dfL;
import o.C8189dfg;
import o.InterfaceC1598aHf;
import o.InterfaceC1905aSp;
import o.InterfaceC1910aSu;
import o.InterfaceC4208baF;
import o.InterfaceC5128bss;
import o.aPA;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public enum CryptoErrorManagerImpl implements CryptoErrorManager {
    INSTANCE;
    
    private static String d = "nf_crypto_error";
    private InterfaceC5128bss b;
    private long e;
    private UserAgent f;
    private AtomicBoolean j = new AtomicBoolean(false);
    private List<CryptoErrorManager.a> h = new ArrayList();
    private long i = -1;

    private void b() {
    }

    CryptoErrorManagerImpl() {
    }

    @Override // com.netflix.mediaclient.ui.error.CryptoErrorManager
    public void b(long j, UserAgent userAgent, InterfaceC4208baF interfaceC4208baF, InterfaceC5128bss interfaceC5128bss) {
        synchronized (this) {
            if (interfaceC4208baF == null) {
                throw new IllegalArgumentException("CryptoErrorManagerImpl can not be initialized with null offline agent!");
            }
            if (interfaceC5128bss == null) {
                throw new IllegalArgumentException("CryptoErrorManagerImpl can not be initialized with null error handler!");
            }
            this.f = userAgent;
            this.b = interfaceC5128bss;
            this.e = j;
            d();
        }
    }

    @Override // com.netflix.mediaclient.ui.error.CryptoErrorManager
    public void a(ErrorSource errorSource, StatusCode statusCode, Throwable th) {
        synchronized (this) {
            if (this.i < 0 || SystemClock.elapsedRealtime() > this.i + 60000) {
                InterfaceC1598aHf.a(new C1596aHd(c(statusCode, th)).b(false));
                this.i = SystemClock.elapsedRealtime();
            }
            InterfaceC1910aSu b = C3842bMr.b(errorSource, statusCode);
            if (b == null) {
                return;
            }
            InterfaceC1905aSp a = b.a(AbstractApplicationC1040Mh.d(), th);
            if (a == null) {
                return;
            }
            InterfaceC5128bss interfaceC5128bss = this.b;
            if (interfaceC5128bss != null) {
                interfaceC5128bss.b(a);
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.error.CryptoErrorManager
    public CryptoErrorManager.CryptoFailback d(CryptoErrorManager.CryptoFailbackCause cryptoFailbackCause, CryptoErrorManager.a[] aVarArr) {
        String str;
        CryptoErrorManager.CryptoFailback cryptoFailback;
        CryptoProvider a = C1834aPz.a.a();
        if (a == CryptoProvider.WIDEVINE_L1) {
            cryptoFailback = CryptoErrorManager.CryptoFailback.widevineL3;
            str = "WIDEVINE_FORCED_FALLBACK_TO_L3_AFTER_" + cryptoFailbackCause + ": MediaDrm failed for Widevine L1, fail back to Widevine L3 crypto scheme";
            C1044Mm.e(d, str);
            C8189dfg.e(cryptoFailbackCause);
            c(aVarArr);
            a();
        } else if (a == CryptoProvider.WIDEVINE_L3) {
            str = "MediaDrm failed for Widevine L3, there is nothing to fail back to anymore";
            C1044Mm.e(d, "MediaDrm failed for Widevine L3, there is nothing to fail back to anymore");
            a();
            cryptoFailback = CryptoErrorManager.CryptoFailback.widevineL3Failed;
        } else {
            str = "Crypto provider was not supported for this error " + a;
            C1044Mm.d(d, str);
            cryptoFailback = CryptoErrorManager.CryptoFailback.uknown;
        }
        InterfaceC1598aHf.a(new C1596aHd(str).b(false));
        return cryptoFailback;
    }

    private void c(CryptoErrorManager.a[] aVarArr) {
        if (aVarArr == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (CryptoErrorManager.a aVar : aVarArr) {
                jSONArray.put(aVar.d());
            }
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "disable_widevine_l1_evidence", jSONArray.toString());
        } catch (JSONException unused) {
        }
    }

    private void a() {
        this.h.clear();
        C8157dfA.e(AbstractApplicationC1040Mh.d(), "prefs_crypto_fatal_errors");
    }

    public static String c(StatusCode statusCode, Throwable th) {
        return e(null, statusCode, th);
    }

    static String e(String str, StatusCode statusCode, Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(" ");
        }
        sb.append("MediaDrm failure: ");
        sb.append(statusCode.name());
        sb.append(". Exception: ");
        if (th == null) {
            sb.append(" init failure: security level changed");
        } else {
            sb.append(C1044Mm.d(th));
        }
        return sb.toString();
    }

    public static String b(StatusCode statusCode, Throwable th, int i) {
        StringBuilder sb = new StringBuilder("MediaDrm failure: ");
        sb.append(statusCode.name());
        sb.append(". ResourceBusyException: SPY-12568");
        sb.append("MaxMslSessionOpened [");
        sb.append(i);
        sb.append("] ");
        sb.append("CurrentOpenedMslDrmSessionCount [");
        sb.append(aPA.a);
        sb.append("] ");
        try {
            NetflixMediaDrm d2 = C8189dfg.d(MediaDrmConsumer.MSL, (NetflixMediaDrm.OnEventListener) null);
            int intValue = Integer.valueOf(d2.getPropertyString(NetflixMediaDrm.PROPERTY_MAX_NUMBER_OF_SESSIONS)).intValue();
            sb.append("maxNumberOfSessions [");
            sb.append(intValue);
            sb.append("] ");
            int intValue2 = Integer.valueOf(d2.getPropertyString("numberOfOpenSessions")).intValue();
            sb.append("numberOfOpenSessions [");
            sb.append(intValue2);
            sb.append("] ");
            d2.close();
        } catch (Exception e) {
            C1044Mm.b(d, e, "ignore exception when createResourceBusyExceptionErrorMessage.", new Object[0]);
        }
        return sb.toString();
    }

    private void d() {
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "prefs_crypto_fatal_errors", (String) null);
        if (C8168dfL.g(e)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(e);
            int i = 0;
            while (i < jSONArray.length()) {
                CryptoErrorManager.a aVar = new CryptoErrorManager.a(jSONArray.getJSONObject(i));
                if (aVar.e()) {
                    this.h.add(aVar);
                } else {
                    C1044Mm.a(d, "Ignore, occured to long ago: %s: ", Integer.valueOf(i), aVar.toString());
                    i++;
                }
                i++;
            }
        } catch (Throwable th) {
            C1044Mm.b(d, th, "Fail to restore crypto error state.", new Object[0]);
        }
        b();
    }

    private void i() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (CryptoErrorManager.a aVar : this.h) {
                jSONArray.put(aVar.d());
            }
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "prefs_crypto_fatal_errors", jSONArray.toString());
        } catch (Throwable th) {
            C1044Mm.b(d, th, "Fail to save crypto error state!", new Object[0]);
        }
    }

    public int d(ErrorSource errorSource, StatusCode statusCode, Throwable th) {
        synchronized (this) {
            if (this.j.get()) {
                C1044Mm.j(d, "Crypto fallback in progress. We should not see this. Do not add error. Return crypto failback message. Next app start will see different crypto...");
                return R.o.dk;
            }
            CryptoErrorManager.a e = e();
            int i = R.o.dl;
            if (e != null && e.e()) {
                if (this.h.size() < 1) {
                    C1044Mm.e(d, "Did not had previous valid fatal error, just tell user to start app again");
                    i = R.o.dl;
                } else if (this.h.size() == 1) {
                    if (e.d(this.e)) {
                        C1044Mm.j(d, "Found previous valid fatal error, but it from this same app instance, do not add it again. It should NOT happen. Return message to start app again.");
                        return R.o.dl;
                    }
                    C1044Mm.j(d, "Found previous valid fatal error, app was restarted and we failed again, Tell user to restart device.");
                    i = R.o.dp;
                } else if (this.h.size() >= 2) {
                    if (e.d(this.e)) {
                        C1044Mm.j(d, "Found previous valid fatal error, but it from this same app instance, do not add it again. It should NOT happen. Return message to start app again.");
                        return R.o.dp;
                    }
                    C1044Mm.j(d, "Found previous valid fatal error, app was restarted and than rebooted and each time we failed again, Fallback...");
                    if (d(CryptoErrorManager.CryptoFailbackCause.WORKFLOW, (CryptoErrorManager.a[]) this.h.toArray(new CryptoErrorManager.a[0])) == CryptoErrorManager.CryptoFailback.widevineL3) {
                        C1044Mm.e(d, "Fallback to Widevine L3.");
                        return R.o.dj;
                    }
                    C1044Mm.e(d, "Widevine L3 failed, nowhere to fall back...");
                    return R.o.di;
                }
                this.h.add(new CryptoErrorManager.a(errorSource, statusCode, this.e, th));
                i();
                return i;
            }
            C1044Mm.e(d, "Did not had previous valid fatal error, just tell user to start app again");
            i = R.o.dl;
            this.h.add(new CryptoErrorManager.a(errorSource, statusCode, this.e, th));
            i();
            return i;
        }
    }

    private CryptoErrorManager.a e() {
        synchronized (this) {
            if (this.h.size() < 1) {
                return null;
            }
            List<CryptoErrorManager.a> list = this.h;
            return list.get(list.size() - 1);
        }
    }
}
