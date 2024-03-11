package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.UnsupportedSchemeException;
import android.os.SystemClock;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.Chipset;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.configuration.ConfigurationState;
import com.netflix.mediaclient.service.configuration.EsnMigrationState;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.esn.WidevineL1NotSupportedAfterOsUpgradeException;
import com.netflix.mediaclient.service.configuration.esn.WidevineNotSupportedException;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MSLTransport;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NgpConfig;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.offline.agent.OfflineUnavailableReason;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.ftl.FtlController;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.BwCap;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingConfigOverride;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1824aPp;
import o.C1826aPr;
import o.aPC;

/* renamed from: o.aPd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1812aPd extends aMF implements aOV {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int U = 1;
    private static int W = 0;
    private static char[] b$s43$17149 = {57466};
    private static long d$s44$17149 = -1612325923713578367L;
    private InterfaceC6704ciN B;
    private boolean F;
    private C1821aPm G;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private C1890aSa f13437J;
    private InterfaceC1545aFg L;
    private C1823aPo M;
    private String N;
    private C1828aPt O;
    private C1829aPu P;
    private final String Q;
    private C1830aPv R;
    private VideoResolutionRange S;
    private final boolean a;
    private aOY b;
    private boolean c;
    private InterfaceC4604bhe d;
    private int g;
    private C1809aPa h;
    private String i;
    private C1810aPb j;
    private final CryptoErrorManager l;
    private Status m;
    private final Context n;

    /* renamed from: o  reason: collision with root package name */
    private BroadcastReceiver f13438o;
    private String p;
    private String q;
    private String r;
    private C1814aPf s;
    private final C1817aPi t;
    private EsnMigrationState u;
    private C1815aPg v;
    private InterfaceC1843aQh w;
    private boolean x;
    private C8246dgk y;
    private C1819aPk z;
    private boolean e = true;
    private final List<d> f = new ArrayList();
    private boolean D = false;
    private ImageResolutionClass A = null;
    private boolean H = false;
    private boolean C = false;
    private ConfigurationState k = ConfigurationState.j;
    private final Runnable X = new Runnable() { // from class: o.aPd.14
        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.a("nf_configurationagent", "Refreshing member config via runnable");
            C1812aPd c1812aPd = C1812aPd.this;
            c1812aPd.c(C1812aPd.l(c1812aPd).f(), true, null, null);
        }
    };
    private final Runnable V = new Runnable() { // from class: o.aPd.3
        @Override // java.lang.Runnable
        public void run() {
            UserAgent m = C1812aPd.m(C1812aPd.this);
            boolean z = m != null && m.v();
            C1044Mm.c("nf_configurationagent", "Refreshing non member config via runnable %b", Boolean.valueOf(z));
            C1812aPd c1812aPd = C1812aPd.this;
            c1812aPd.c(C1812aPd.t(c1812aPd).f(), z, null, null);
        }
    };
    private final InterfaceC1820aPl E = new InterfaceC1820aPl() { // from class: o.aPd.1
        @Override // o.InterfaceC1820aPl
        public boolean d() {
            return C1812aPd.h(C1812aPd.this).Q();
        }

        @Override // o.InterfaceC1820aPl
        public boolean b() {
            return C1812aPd.h(C1812aPd.this).H();
        }

        @Override // o.InterfaceC1820aPl
        public boolean c() {
            return C1812aPd.h(C1812aPd.this).P();
        }

        @Override // o.InterfaceC1820aPl
        public boolean e() {
            return C1812aPd.c(C1812aPd.this).c();
        }

        @Override // o.InterfaceC1820aPl
        public boolean a() {
            if (C8153dex.t()) {
                return false;
            }
            return C1812aPd.h(C1812aPd.this).G();
        }
    };
    private final InterfaceC1827aPs K = new InterfaceC1827aPs() { // from class: o.aPd.2
        @Override // o.InterfaceC1827aPs
        public boolean c() {
            return !C1812aPd.c(C1812aPd.this).h();
        }

        @Override // o.InterfaceC1827aPs
        public boolean b() {
            return C1812aPd.h(C1812aPd.this).O();
        }
    };

    /* renamed from: o.aPd$d */
    /* loaded from: classes.dex */
    public interface d {
        void d(Status status);
    }

    @AssistedFactory
    /* renamed from: o.aPd$e */
    /* loaded from: classes.dex */
    public interface e {
        C1812aPd e(CryptoErrorManager cryptoErrorManager);
    }

    static /* bridge */ /* synthetic */ List a(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 49;
        int i3 = i2 % 128;
        W = i3;
        int i4 = i2 % 2;
        List<d> list = c1812aPd.f;
        if (i4 == 0) {
            int i5 = i3 + 15;
            U = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
            }
            return list;
        }
        throw null;
    }

    static /* bridge */ /* synthetic */ void a(C1812aPd c1812aPd, Status status) {
        int i = 2 % 2;
        int i2 = W + 105;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            c1812aPd.m = status;
        } else {
            c1812aPd.m = status;
            throw null;
        }
    }

    static /* bridge */ /* synthetic */ Context b(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 57;
        W = i3 % 128;
        int i4 = i3 % 2;
        Context context = c1812aPd.n;
        int i5 = i2 + 121;
        W = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    static /* bridge */ /* synthetic */ C1810aPb c(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = W + 53;
        U = i2 % 128;
        int i3 = i2 % 2;
        C1810aPb c1810aPb = c1812aPd.j;
        if (i3 != 0) {
            return c1810aPb;
        }
        throw null;
    }

    static /* synthetic */ void c(C1812aPd c1812aPd, long j) {
        int i = 2 % 2;
        int i2 = W + 39;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            c1812aPd.b(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c1812aPd.b(j);
        int i3 = W + 77;
        U = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ void c(C1812aPd c1812aPd, Status status) {
        int i = 2 % 2;
        int i2 = U + 53;
        W = i2 % 128;
        int i3 = i2 % 2;
        c1812aPd.c(status);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = W + 31;
        U = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* bridge */ /* synthetic */ void c(C1812aPd c1812aPd, String str) {
        int i = 2 % 2;
        int i2 = U + 27;
        int i3 = i2 % 128;
        W = i3;
        int i4 = i2 % 2;
        c1812aPd.r = str;
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
        int i6 = i3 + 17;
        U = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* bridge */ /* synthetic */ InterfaceC4604bhe d(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 17;
        W = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC4604bhe interfaceC4604bhe = c1812aPd.d;
        int i5 = i2 + 41;
        W = i5 % 128;
        int i6 = i5 % 2;
        return interfaceC4604bhe;
    }

    static /* synthetic */ void d(C1812aPd c1812aPd, Status status) {
        int i = 2 % 2;
        int i2 = W + 3;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            c1812aPd.b(status);
            throw null;
        }
        c1812aPd.b(status);
        int i3 = U + 91;
        W = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
    }

    static /* bridge */ /* synthetic */ void d(C1812aPd c1812aPd, ConfigurationState configurationState) {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 87;
        W = i3 % 128;
        int i4 = i3 % 2;
        c1812aPd.k = configurationState;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 85;
        W = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* bridge */ /* synthetic */ Status e(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = W + 79;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
            return c1812aPd.m;
        }
        return c1812aPd.m;
    }

    static /* bridge */ /* synthetic */ Status e(C1812aPd c1812aPd, ConfigData configData) {
        int i = 2 % 2;
        int i2 = U + 59;
        W = i2 % 128;
        int i3 = i2 % 2;
        Status e2 = c1812aPd.e(configData);
        int i4 = U + 77;
        W = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return e2;
    }

    static /* synthetic */ void e(C1812aPd c1812aPd, Status status) {
        int i = 2 % 2;
        int i2 = W + 89;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            c1812aPd.d(status);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c1812aPd.d(status);
        int i3 = U + 23;
        W = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
    }

    static /* bridge */ /* synthetic */ void e(C1812aPd c1812aPd, boolean z) {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 63;
        W = i3 % 128;
        int i4 = i3 % 2;
        c1812aPd.D = z;
        int i5 = i2 + 11;
        W = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    static /* bridge */ /* synthetic */ Runnable f(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 53;
        U = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = c1812aPd.V;
        int i5 = i2 + 121;
        U = i5 % 128;
        int i6 = i5 % 2;
        return runnable;
    }

    static /* bridge */ /* synthetic */ String g(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 45;
        U = i3 % 128;
        int i4 = i3 % 2;
        String str = c1812aPd.Q;
        int i5 = i2 + 65;
        U = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static /* synthetic */ C1814aPf h(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 65;
        int i3 = i2 % 128;
        W = i3;
        int i4 = i2 % 2;
        C1814aPf c1814aPf = c1812aPd.s;
        int i5 = i3 + 13;
        U = i5 % 128;
        if (i5 % 2 != 0) {
            return c1814aPf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* bridge */ /* synthetic */ Runnable i(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 3;
        W = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = c1812aPd.X;
        int i5 = i2 + 101;
        W = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return runnable;
    }

    static /* bridge */ /* synthetic */ C1828aPt j(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 125;
        U = i3 % 128;
        int i4 = i3 % 2;
        C1828aPt c1828aPt = c1812aPd.O;
        int i5 = i2 + 57;
        U = i5 % 128;
        int i6 = i5 % 2;
        return c1828aPt;
    }

    static /* synthetic */ void k(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 101;
        W = i2 % 128;
        int i3 = i2 % 2;
        c1812aPd.aM();
        int i4 = U + 45;
        W = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void n(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 61;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            c1812aPd.aQ();
            return;
        }
        c1812aPd.aQ();
        int i3 = 47 / 0;
    }

    static /* synthetic */ void o(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 63;
        W = i2 % 128;
        int i3 = i2 % 2;
        c1812aPd.ba();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // o.aOV
    public InterfaceC1820aPl H() {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 63;
        U = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC1820aPl interfaceC1820aPl = this.E;
        int i5 = i2 + 25;
        U = i5 % 128;
        if (i5 % 2 != 0) {
            return interfaceC1820aPl;
        }
        throw null;
    }

    @Override // o.aOV
    public InterfaceC1827aPs J() {
        int i = 2 % 2;
        int i2 = W + 71;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        InterfaceC1827aPs interfaceC1827aPs = this.K;
        int i5 = i3 + 113;
        W = i5 % 128;
        if (i5 % 2 == 0) {
            return interfaceC1827aPs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public int P() {
        int i = 2 % 2;
        int i2 = W + 81;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2 == 0 ? 2921 : 1000;
        int i5 = i3 + 13;
        W = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void aG() {
        int i = 2 % 2;
        int i2 = U + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        W = i2 % 128;
        int i3 = i2 % 2;
    }

    public String aK() {
        int i = 2 % 2;
        int i2 = W + 71;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        String str = this.N;
        int i5 = i3 + 57;
        W = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.aMF
    public String agentName() {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 41;
        U = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        U = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return "config";
    }

    @Override // o.aOV
    public boolean ao() {
        int i = 2 % 2;
        int i2 = W + 125;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        boolean z = this.H;
        int i5 = i3 + 57;
        W = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // o.aOV
    public boolean at() {
        int i = 2 % 2;
        int i2 = W + 63;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        boolean z = this.I;
        int i5 = i3 + 7;
        W = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // o.aOV
    public boolean av() {
        int i = 2 % 2;
        int i2 = U + 123;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return this.c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public ApiEndpointRegistry j() {
        int i = 2 % 2;
        int i2 = U + 87;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return this.v;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public int k() {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 93;
        U = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        U = i5 % 128;
        int i6 = i5 % 2;
        return 4;
    }

    @Override // o.aOV
    public String p() {
        int i = 2 % 2;
        int i2 = W + 101;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        String str = this.r;
        int i5 = i3 + 33;
        W = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.aOV
    public C1817aPi q() {
        int i = 2 % 2;
        int i2 = W + 33;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        C1817aPi c1817aPi = this.t;
        int i5 = i3 + 121;
        W = i5 % 128;
        if (i5 % 2 == 0) {
            return c1817aPi;
        }
        throw null;
    }

    @Override // o.aOV
    public int t() {
        int i = 2 % 2;
        int i2 = U + 85;
        W = i2 % 128;
        return i2 % 2 != 0 ? 25106 : 10000;
    }

    @Override // o.aOV
    public InterfaceC1843aQh w() {
        int i = 2 % 2;
        int i2 = W;
        int i3 = i2 + 69;
        U = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC1843aQh interfaceC1843aQh = this.w;
        int i5 = i2 + 47;
        U = i5 % 128;
        int i6 = i5 % 2;
        return interfaceC1843aQh;
    }

    @Override // o.aOV
    public long x() {
        int i = 2 % 2;
        int i2 = W + 49;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            return 1209600000L;
        }
        throw null;
    }

    static /* synthetic */ void b(C1812aPd c1812aPd, Status status) {
        int i = 2 % 2;
        int i2 = U + 113;
        W = i2 % 128;
        int i3 = i2 % 2;
        c1812aPd.initCompleted(status);
        if (i3 != 0) {
            throw null;
        }
    }

    static /* synthetic */ UserAgent l(C1812aPd c1812aPd) {
        UserAgent userAgent;
        int i = 2 % 2;
        int i2 = U + 41;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            userAgent = c1812aPd.getUserAgent();
            int i3 = 82 / 0;
        } else {
            userAgent = c1812aPd.getUserAgent();
        }
        int i4 = W + 9;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return userAgent;
        }
        throw null;
    }

    static /* synthetic */ UserAgent m(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 1;
        W = i2 % 128;
        int i3 = i2 % 2;
        UserAgent userAgent = c1812aPd.getUserAgent();
        int i4 = W + 71;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return userAgent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ UserAgent t(C1812aPd c1812aPd) {
        int i = 2 % 2;
        int i2 = U + 91;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            c1812aPd.getUserAgent();
            throw null;
        }
        UserAgent userAgent = c1812aPd.getUserAgent();
        int i3 = W + 115;
        U = i3 % 128;
        int i4 = i3 % 2;
        return userAgent;
    }

    @AssistedInject
    public C1812aPd(@ApplicationContext Context context, C1823aPo c1823aPo, InterfaceC6704ciN interfaceC6704ciN, C8246dgk c8246dgk, @Assisted CryptoErrorManager cryptoErrorManager) {
        this.g = -1;
        this.N = null;
        int c = C8055ddE.c(context);
        this.g = c;
        this.l = cryptoErrorManager;
        C1044Mm.c("nf_configurationagent", "Current app version code=%d", Integer.valueOf(c));
        String e2 = C8055ddE.e(context);
        this.N = e2;
        C1044Mm.c("nf_configurationagent", "Current softwareVersion=%s", e2);
        this.t = new C1817aPi(this.g, C8055ddE.e(context), AbstractC1838aQc.d());
        this.s = (C1814aPf) C1332Xp.b(C1814aPf.class);
        this.y = c8246dgk;
        this.j = new C1810aPb(context);
        this.O = new C1828aPt(context);
        this.R = new C1830aPv(context);
        this.L = ((InterfaceC1549aFk) EntryPointAccessors.fromApplication(context, InterfaceC1549aFk.class)).X();
        this.b = new aOU(context);
        aL();
        this.M = c1823aPo;
        this.z = new C1819aPk(context);
        this.G = new C1821aPm(context);
        this.n = context;
        this.Q = context.getPackageName();
        this.x = C8157dfA.b(context, "offline_blaclisted_device_override", false);
        this.a = C8157dfA.b(context, "avif_unsatisfied_link_error", false);
        C1332Xp.d(aOV.class, this, true);
        this.B = interfaceC6704ciN;
    }

    @Override // o.aOV
    public ABTestConfigData a() {
        int i = 2 % 2;
        int i2 = W + 97;
        U = i2 % 128;
        int i3 = i2 % 2;
        ABTestConfigData c = this.b.c();
        int i4 = U + 95;
        W = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return c;
    }

    @Override // o.aMF
    public void doInit() {
        int i = 2 % 2;
        boolean b = C8157dfA.b(getContext(), "nf_drm_force_esn_migration", false);
        this.C = b;
        C1044Mm.a("nf_configurationagent", "Force ESN migration: %b", Boolean.valueOf(b));
        this.H = this.C;
        C8157dfA.e(getContext(), "nf_drm_force_esn_migration");
        this.f13437J = new C1890aSa(getContext(), this);
        C1044Mm.a("nf_configurationagent", "Use low mem config: %b ", Boolean.valueOf(am()));
        this.v = new C1815aPg(this.n, getUserAgent(), this, getOfflineAgent(), getLoggingAgent());
        this.F = aV();
        this.I = C8159dfC.d(this.n);
        C1809aPa c1809aPa = new C1809aPa(this.n, getMainHandler());
        this.h = c1809aPa;
        C1332Xp.a(C1809aPa.class, c1809aPa);
        if (C8150deu.a(this.n)) {
            new MB(this.n, getUserAgent(), this.B, this.y).a();
            int i2 = W + 57;
            U = i2 % 128;
            int i3 = i2 % 2;
        }
        aY();
    }

    private void aM() {
        int i = 2 % 2;
        this.c = false;
        this.k = ConfigurationState.b;
        aMH.c().h();
        new C1824aPp(getContext(), o(), this.l, new C1824aPp.c() { // from class: o.aPd.4
            @Override // o.C1824aPp.c
            public void e(Status status) {
                C1812aPd.c(C1812aPd.this, status);
            }
        }).b();
        int i2 = W + 23;
        U = i2 % 128;
        int i3 = i2 % 2;
    }

    private void c(Status status) {
        int i = 2 % 2;
        if (status.j()) {
            Status aU = aU();
            Logger logger = Logger.INSTANCE;
            logger.addContext(new Chipset(l() + m()));
            if (aU != null) {
                int i2 = W + 79;
                U = i2 % 128;
                if (i2 % 2 != 0) {
                    C1044Mm.d("nf_configurationagent", "Failed to calculate ESN, report failure during service startup!");
                    this.k = ConfigurationState.c;
                    initCompleted(aU);
                    return;
                }
                C1044Mm.d("nf_configurationagent", "Failed to calculate ESN, report failure during service startup!");
                this.k = ConfigurationState.c;
                initCompleted(aU);
                throw null;
            }
            return;
        }
        this.k = ConfigurationState.c;
        initCompleted(status);
        int i3 = U + 41;
        W = i3 % 128;
        int i4 = i3 % 2;
    }

    private Status aU() {
        int i = 2 % 2;
        int i2 = W + 121;
        U = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.k = ConfigurationState.g;
            obj.hashCode();
            throw null;
        }
        this.k = ConfigurationState.g;
        if (this.r == null) {
            C1044Mm.c("nf_configurationagent", "%s findDeviceId getting it from shared storage", this.Q);
            aP();
            int i3 = W + 15;
            U = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 70 / 0;
            }
            return null;
        }
        return aN();
    }

    private void aP() {
        int i = 2 % 2;
        if (aZ()) {
            int i2 = W + 45;
            U = i2 % 128;
            int i3 = i2 % 2;
            C1044Mm.c("nf_configurationagent", "%s fetchDeviceIdFromSharedStorage:: disabled", this.Q);
            aQ();
            int i4 = W + 71;
            U = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        C1826aPr.d(aT(), new C1826aPr.c() { // from class: o.aPd.7
            @Override // o.C1826aPr.c
            public void d(NgpStoreApi.a aVar) {
                C1044Mm.a("nf_configurationagent", "%s ngp_store read done. Took: %d, data: %s", C1812aPd.g(C1812aPd.this), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), aVar);
                if (aVar != null && aVar.b != null) {
                    C1044Mm.a("nf_configurationagent", "%s onDeviceIdFromSharedStorage:: deviceIdToken found: %s", C1812aPd.g(C1812aPd.this), aVar.b);
                    C1812aPd.c(C1812aPd.this, aVar.b);
                } else {
                    C1044Mm.c("nf_configurationagent", "%s onDeviceIdFromSharedStorage:: deviceIdToken is NOT found.", C1812aPd.g(C1812aPd.this));
                }
                C1812aPd.n(C1812aPd.this);
            }
        });
        int i6 = U + 107;
        W = i6 % 128;
        int i7 = i6 % 2;
    }

    private NgpStoreApi aT() {
        int i = 2 % 2;
        int i2 = W + 77;
        U = i2 % 128;
        int i3 = i2 % 2;
        NgpStoreApi a = aIR.d(getContext()).a();
        int i4 = U + 71;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void aQ() {
        int i = 2 % 2;
        int i2 = U + 21;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            aN();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Status aN = aN();
        if (aN != null) {
            this.k = ConfigurationState.c;
            initCompleted(aN);
            int i3 = W + 9;
            U = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private Status aN() {
        int i = 2 % 2;
        int i2 = U + 97;
        W = i2 % 128;
        int i3 = i2 % 2;
        this.k = ConfigurationState.e;
        try {
            SystemClock.elapsedRealtime();
            this.w = C1845aQj.a(this.n, this);
            aS();
            return null;
        } catch (MediaDrm.MediaDrmStateException e2) {
            C1044Mm.b("nf_configurationagent", e2, "MediaDrmStateException:", new Object[0]);
            this.l.a(ErrorSource.msl, StatusCode.DRM_FAILURE_MEDIADRM_STATE_EXCEPTION, e2);
            InterfaceC1598aHf.a(new C1596aHd("DRM_FAILURE_MEDIADRM_STATE_EXCEPTION").b(false));
            return InterfaceC1078Nw.r;
        } catch (MediaDrmResetException e3) {
            C1044Mm.b("nf_configurationagent", e3, "MediaDrmResetException:", new Object[0]);
            this.l.a(ErrorSource.msl, StatusCode.DRM_FAILURE_MEDIADRM_RESET, e3);
            InterfaceC1598aHf.a(new C1596aHd("DRM_FAILURE_MEDIADRM_RESET").b(false));
            return InterfaceC1078Nw.q;
        } catch (UnsupportedSchemeException e4) {
            C1044Mm.b("nf_configurationagent", e4, "Failed to create ESN", new Object[0]);
            return InterfaceC1078Nw.f;
        } catch (WidevineL1NotSupportedAfterOsUpgradeException e5) {
            C1044Mm.b("nf_configurationagent", e5, "WidevineL1NotSupportedAfterOsUpgradeException:", new Object[0]);
            this.l.a(ErrorSource.msl, StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE, null);
            InterfaceC1598aHf.a(new C1596aHd("DRM_FAILURE_OS_UPGRADE").b(false));
            return InterfaceC1078Nw.aQ;
        } catch (WidevineNotSupportedException e6) {
            Status d2 = d(e6);
            int i4 = U + 7;
            W = i4 % 128;
            int i5 = i4 % 2;
            return d2;
        } catch (Throwable th) {
            this.l.a(ErrorSource.msl, StatusCode.DRM_FAILURE_CDM_GENERIC_ERROR, th);
            InterfaceC1598aHf.a(new C1596aHd("DRM_FAILURE_CDM_GENERIC_ERROR").b(false));
            return InterfaceC1078Nw.f;
        }
    }

    private Status d(WidevineNotSupportedException widevineNotSupportedException) {
        int i = 2 % 2;
        C1044Mm.b("nf_configurationagent", widevineNotSupportedException, "WidevineNotSupportedException:", new Object[0]);
        if (!C8189dfg.a()) {
            if (C8189dfg.d(getContext(), o())) {
                C1044Mm.j("nf_configurationagent", "Widevine not supported, but Widevine was used before, we may be able to recover");
                this.l.a(ErrorSource.msl, StatusCode.MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE, null);
                InterfaceC1598aHf.a(new C1596aHd("MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE").b(false));
                return InterfaceC1078Nw.aA;
            }
            C1044Mm.j("nf_configurationagent", "Widevine not supported, never used before, we will not be able to recover");
            InterfaceC1598aHf.a(new C1596aHd("MSL_LEGACY_CRYPTO").b(false));
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.at;
            int i2 = U + 3;
            W = i2 % 128;
            int i3 = i2 % 2;
            return netflixImmutableStatus;
        }
        int i4 = W + 83;
        U = i4 % 128;
        int i5 = i4 % 2;
        C1044Mm.j("nf_configurationagent", "Widevine is supported, but plugin is in bad state, start DRM recovery workflow");
        this.l.a(ErrorSource.msl, StatusCode.WIDEVINE_PLUGIN_IN_BAD_STATE, null);
        return InterfaceC1078Nw.aT;
    }

    private void aS() {
        int i = 2 % 2;
        this.k = ConfigurationState.f;
        try {
            C1044Mm.e("nf_configurationagent", "::init createCryptoInstance ");
            final long currentTimeMillis = System.currentTimeMillis();
            aPB.b(this.n, this.l, this, new aPC.e() { // from class: o.aPd.6
                @Override // o.aPC.e
                public void d() {
                    C1812aPd.c(C1812aPd.this, currentTimeMillis);
                }

                @Override // o.aPC.e
                public void d(Status status) {
                    C1812aPd.e(C1812aPd.this, status);
                }

                @Override // o.aPC.e
                public void a() {
                    C1044Mm.e("nf_configurationagent", "::init: drmResoureReclaimed:: NOOP");
                }
            });
            int i2 = W + 99;
            U = i2 % 128;
            int i3 = i2 % 2;
        } catch (MediaDrmResetException e2) {
            C1044Mm.b("nf_configurationagent", e2, "::init: Failed to create MSL crypto registry because media server died", new Object[0]);
            d(InterfaceC1078Nw.f);
            int i4 = U + 107;
            W = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 5;
            }
        } catch (UnsupportedSchemeException e3) {
            C1044Mm.b("nf_configurationagent", e3, "::init: Failed to create MSL crypto registry", new Object[0]);
            d(InterfaceC1078Nw.x);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
        if (r5.s.Z() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
        if (r5.s.Z() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
        r7 = o.C1812aPd.W + 55;
        o.C1812aPd.U = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
        if (r5.s.Z() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
        r5.k = com.netflix.mediaclient.service.configuration.ConfigurationState.d;
        c((o.InterfaceC5093bsJ) null, new o.C1812aPd.AnonymousClass8(r5));
        r7 = o.C1812aPd.U + 87;
        o.C1812aPd.W = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(long r6) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.b(long):void");
    }

    private void b(Status status) {
        int i = 2 % 2;
        C1596aHd e2 = new C1596aHd("SPY-36938: Failed to download ESN based config").b(false).b(ErrorType.g).d(status.e()).e("originalStatusCode", status.c().name());
        if (status.b() != null) {
            e2.e("stacktrace", status.b());
        }
        if (status instanceof NetflixStatus) {
            int i2 = U + 123;
            W = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    NetflixStatus netflixStatus = (NetflixStatus) status;
                    if (netflixStatus.a() != null) {
                        int i3 = W + 93;
                        U = i3 % 128;
                        if (i3 % 2 == 0) {
                            e2.e(UmaAlert.ICON_ERROR, netflixStatus.a().toJSONObject().toString());
                            int i4 = 11 / 0;
                        } else {
                            e2.e(UmaAlert.ICON_ERROR, netflixStatus.a().toJSONObject().toString());
                        }
                    }
                } else {
                    ((NetflixStatus) status).a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (Throwable th) {
                C1044Mm.b("nf_configurationagent", th, "Failure to save error data", new Object[0]);
            }
        }
        InterfaceC1598aHf.a(e2);
        int i5 = U + 97;
        W = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        r4.k = com.netflix.mediaclient.service.configuration.ConfigurationState.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r5 == o.InterfaceC1078Nw.aJ) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r5 == o.InterfaceC1078Nw.aJ) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        r4.k = com.netflix.mediaclient.service.configuration.ConfigurationState.h;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.netflix.mediaclient.android.app.Status r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1812aPd.U
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.C1812aPd.W = r2
            int r1 = r1 % r0
            java.lang.String r2 = "Handling not delayed init crypto status %s"
            java.lang.String r3 = "nf_configurationagent"
            if (r1 == 0) goto L22
            com.netflix.mediaclient.StatusCode r1 = r5.c()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            o.C1044Mm.a(r3, r2, r1)
            com.netflix.mediaclient.android.app.NetflixImmutableStatus r1 = o.InterfaceC1078Nw.aJ
            if (r5 != r1) goto L36
            goto L31
        L22:
            com.netflix.mediaclient.StatusCode r1 = r5.c()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            o.C1044Mm.a(r3, r2, r1)
            com.netflix.mediaclient.android.app.NetflixImmutableStatus r1 = o.InterfaceC1078Nw.aJ
            if (r5 != r1) goto L36
        L31:
            com.netflix.mediaclient.service.configuration.ConfigurationState r1 = com.netflix.mediaclient.service.configuration.ConfigurationState.h
            r4.k = r1
            goto L3a
        L36:
            com.netflix.mediaclient.service.configuration.ConfigurationState r1 = com.netflix.mediaclient.service.configuration.ConfigurationState.c
            r4.k = r1
        L3a:
            r4.initCompleted(r5)
            int r5 = o.C1812aPd.W
            int r5 = r5 + 1
            int r1 = r5 % 128
            o.C1812aPd.U = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L49
            return
        L49:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.d(com.netflix.mediaclient.android.app.Status):void");
    }

    @Override // o.aOV
    public void d() {
        int i = 2 % 2;
        int i2 = W + 37;
        U = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.G.e();
            int i3 = U + 21;
            W = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.G.e();
        obj.hashCode();
        throw null;
    }

    private boolean aV() {
        int i = 2 % 2;
        int i2 = U + 107;
        W = i2 % 128;
        int i3 = i2 % 2;
        PackageManager packageManager = this.n.getPackageManager();
        if (packageManager != null) {
            boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.microphone");
            int i4 = U + 43;
            W = i4 % 128;
            int i5 = i4 % 2;
            return hasSystemFeature;
        }
        int i6 = U + 47;
        W = i6 % 128;
        if (i6 % 2 != 0) {
            C1044Mm.d("nf_configurationagent", "Unable to get PackageManager! This should NOT happen!");
            return true;
        }
        C1044Mm.d("nf_configurationagent", "Unable to get PackageManager! This should NOT happen!");
        return false;
    }

    public void aL() {
        int i = 2 % 2;
        int i2 = W + 107;
        U = i2 % 128;
        int i3 = i2 % 2;
        Logger logger = Logger.INSTANCE;
        if (i3 != 0) {
            C1274Vj.a(logger, this.b, this.L, this.O);
            return;
        }
        C1274Vj.a(logger, this.b, this.L, this.O);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void b(String str) {
        int i = 2 % 2;
        int i2 = W + 51;
        U = i2 % 128;
        int i3 = i2 % 2;
        C8168dfL.h(str);
        int i4 = W + 27;
        U = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aOV
    public void b(ConfigData configData) {
        int i = 2 % 2;
        this.s.d(configData.getDeviceConfig());
        this.h.e(this.s.i());
        this.R.a(configData.getStreamingConfig());
        this.j.c(configData.getAccountConfig());
        this.O.c(configData.getSyntheticAllocationConfig());
        if (C8168dfL.h(configData.getHendrixConfig())) {
            b(configData.getHendrixConfig());
        }
        this.b.b(configData.getABTestConfigData());
        aL();
        this.G.a(configData.getNrmConfigData());
        this.G.c(configData.getNrmLanguagesData());
        this.M.b(configData.getSignInConfigData());
        if (C8168dfL.h(configData.getFpConfig())) {
            int i2 = U + 55;
            W = i2 % 128;
            if (i2 % 2 == 0) {
                this.z.c(this.n, configData.getFpConfig());
            } else {
                this.z.c(this.n, configData.getFpConfig());
                throw null;
            }
        }
        if (configData.getFtlConfigData() != null) {
            FtlController.INSTANCE.e(configData.getFtlConfigData());
        }
        C1818aPj.e(this.n, this);
        if (aRD.h()) {
            int i3 = W + 83;
            U = i3 % 128;
            int i4 = i3 % 2;
            try {
                C1811aPc.a(this.n, configData);
            } catch (Exception e2) {
                InterfaceC1598aHf.a("Failed to notify Hendrix config listeners", e2, ErrorType.g);
            }
        }
        if (C8168dfL.h(configData.getFeatureConfigJson())) {
            XH.c.d(this.n).e(configData.getFeatureConfigJson());
            int i5 = U + 39;
            W = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // o.aOV
    public boolean am() {
        int i = 2 % 2;
        int i2 = U + 77;
        W = i2 % 128;
        int i3 = i2 % 2;
        boolean e2 = C8120deQ.e();
        int i4 = W + 37;
        U = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return e2;
    }

    public void c(InterfaceC5093bsJ interfaceC5093bsJ, boolean z, InterfaceC1813aPe interfaceC1813aPe, d dVar) {
        synchronized (this) {
            if (dVar != null) {
                this.f.add(dVar);
            }
            if (!this.D) {
                C1044Mm.a("nf_configurationagent", "Starting a config refresh ");
                e(interfaceC5093bsJ, z, interfaceC1813aPe, false);
            } else {
                C1044Mm.a("nf_configurationagent", "Ignoring request to refreshConfig because one is on-going.");
            }
        }
    }

    public void a(d dVar) {
        synchronized (this) {
            if (dVar != null) {
                this.f.add(dVar);
            }
        }
    }

    public void c(d dVar) {
        synchronized (this) {
            if (dVar != null) {
                this.f.remove(dVar);
            }
        }
    }

    private void ba() {
        int i = 2 % 2;
        getMainHandler().post(new Runnable() { // from class: o.aPd.9
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C1812aPd.this) {
                    C1044Mm.e("nf_configurationagent", "Invoking ConfigAgentListeners.");
                    for (d dVar : C1812aPd.a(C1812aPd.this)) {
                        dVar.d(C1812aPd.e(C1812aPd.this));
                    }
                    C1812aPd.a(C1812aPd.this).clear();
                }
            }
        });
        int i2 = U + 33;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    @Override // o.aMF
    public void destroy() {
        int i = 2 % 2;
        int i2 = U + 93;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            super.destroy();
            getMainHandler();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.destroy();
        if (getMainHandler() != null) {
            getMainHandler().removeCallbacks(this.X);
            getMainHandler().removeCallbacks(this.V);
        }
        C1814aPf c1814aPf = this.s;
        if (c1814aPf != null) {
            int i3 = U + 19;
            W = i3 % 128;
            int i4 = i3 % 2;
            c1814aPf.b();
        }
        List<d> list = this.f;
        if (list != null) {
            int i5 = U + 57;
            W = i5 % 128;
            int i6 = i5 % 2;
            list.clear();
            int i7 = U + 21;
            W = i7 % 128;
            int i8 = i7 % 2;
        }
        C1809aPa c1809aPa = this.h;
        if (c1809aPa != null) {
            c1809aPa.b();
        }
        if (this.f13438o != null) {
            C8116deM.a(getContext(), this.f13438o);
        }
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        int i = 2 % 2;
        int i2 = U + 27;
        W = i2 % 128;
        int i3 = i2 % 2;
        super.handleConnectivityChange(netType);
        if (this.e) {
            int i4 = W + 109;
            U = i4 % 128;
            if (i4 % 2 == 0) {
                this.e = true;
                return;
            } else {
                this.e = false;
                return;
            }
        }
        c((getUserAgent() == null || getUserAgent().f() == null) ? null : getUserAgent().f(), Collections.singletonList(aRZ.j), new C1831aPw());
    }

    private void e(InterfaceC5093bsJ interfaceC5093bsJ, final boolean z, final InterfaceC1813aPe interfaceC1813aPe, boolean z2) {
        int i = 2 % 2;
        this.D = true;
        C1831aPw c1831aPw = new C1831aPw() { // from class: o.aPd.10
            @Override // o.C1831aPw, o.InterfaceC1813aPe
            public void d(ConfigData configData, Status status) {
                C1044Mm.c("nf_configurationagent", "doRefreshConfig onConfigDataFetched %s", status);
                C1812aPd.e(C1812aPd.this, false);
                super.d(configData, status);
                InterfaceC1813aPe interfaceC1813aPe2 = interfaceC1813aPe;
                if (interfaceC1813aPe2 != null) {
                    interfaceC1813aPe2.d(configData, status);
                }
                C1812aPd.this.getMainHandler().postDelayed(z ? C1812aPd.i(C1812aPd.this) : C1812aPd.f(C1812aPd.this), 28800000L);
                C1812aPd.o(C1812aPd.this);
            }
        };
        ArrayList arrayList = new ArrayList();
        if (!c()) {
            int i2 = U + 41;
            W = i2 % 128;
            int i3 = i2 % 2;
            a(arrayList);
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
        }
        aRZ.d(arrayList);
        if (z) {
            int i5 = U + 35;
            W = i5 % 128;
            if (i5 % 2 != 0) {
                aRZ.a(arrayList, z2);
                int i6 = 12 / 0;
            } else {
                aRZ.a(arrayList, z2);
            }
            int i7 = U + 67;
            W = i7 % 128;
            int i8 = i7 % 2;
        } else {
            d(arrayList);
            aRZ.c(arrayList);
        }
        e(interfaceC5093bsJ, arrayList, c1831aPw, z2);
        int i9 = W + 109;
        U = i9 % 128;
        int i10 = i9 % 2;
    }

    private void d(List<String> list) {
        int i = 2 % 2;
        boolean aC = aC();
        boolean d2 = C1821aPm.d(this.n);
        if (!aC) {
            list.add(aRZ.f);
            int i2 = U + 73;
            W = i2 % 128;
            int i3 = i2 % 2;
        }
        if (d2) {
            return;
        }
        int i4 = U + 87;
        W = i4 % 128;
        int i5 = i4 % 2;
        list.add(aRZ.l);
        if (i5 != 0) {
            int i6 = 50 / 0;
        }
    }

    private void a(List<String> list) {
        int i = 2 % 2;
        boolean e2 = C1823aPo.e(this.n);
        boolean a = C1819aPk.a(this.n);
        boolean e3 = this.L.e();
        C1044Mm.a("nf_configurationagent", "addEsnDependentConfigPaths:: isSignInConfigInPref: %b, isFpConfigInPref: %b, isHendrixConfigInPref: %b", Boolean.valueOf(e2), Boolean.valueOf(a), Boolean.valueOf(e3));
        if (!e2) {
            list.add(aRZ.k);
        } else {
            list.add(aRZ.f13440o);
        }
        if (!a) {
            int i2 = U + 25;
            W = i2 % 128;
            if (i2 % 2 != 0) {
                list.add(aRZ.h);
                int i3 = 21 / 0;
            } else {
                list.add(aRZ.h);
            }
        }
        if (e3) {
            return;
        }
        list.add(aRZ.i);
        int i4 = W + 23;
        U = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aOV
    public boolean ad() {
        int i = 2 % 2;
        int i2 = W + 111;
        U = i2 % 128;
        int i3 = i2 % 2;
        if (C8153dex.j()) {
            return false;
        }
        boolean z = this.g < this.s.d();
        int i4 = U + 7;
        W = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // o.aOV
    public SearchResultsSimilarityAlgorithm T() {
        int i = 2 % 2;
        int i2 = U + 23;
        W = i2 % 128;
        int i3 = i2 % 2;
        SearchResultsSimilarityAlgorithm j = this.j.j();
        int i4 = W + 1;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public void a(InterfaceC4604bhe interfaceC4604bhe) {
        synchronized (this) {
            this.d = interfaceC4604bhe;
            interfaceC4604bhe.c(aJ(), this.O.a());
        }
    }

    public boolean aH() {
        boolean z;
        int i = 2 % 2;
        int i2 = U + 51;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            if (!C8153dex.j()) {
                z = true;
                int g = g();
                return !(true ^ C8055ddE.d(this.n, z())) ? false : false;
            }
            return true;
        }
        if (!C8153dex.j()) {
            z = false;
            int g2 = g();
            if (!(true ^ C8055ddE.d(this.n, z())) && this.g >= g2) {
                int i3 = W + 7;
                U = i3 % 128;
                int i4 = i3 % 2;
                return z;
            }
        }
        return true;
    }

    private ImageResolutionClass e(Context context) {
        ImageResolutionClass imageResolutionClass;
        int i = 2 % 2;
        ImageResolutionClass imageResolutionClass2 = this.A;
        if (imageResolutionClass2 != null) {
            return imageResolutionClass2;
        }
        boolean am = am();
        boolean f = C8151dev.f();
        int k = C8150deu.k(context);
        if (!f) {
            if (am) {
                int i2 = U + 17;
                W = i2 % 128;
                if (i2 % 2 == 0 ? k <= 240 : k <= 26517) {
                    imageResolutionClass = ImageResolutionClass.LOW;
                }
                imageResolutionClass = ImageResolutionClass.MEDIUM;
            } else if (k <= 240) {
                int i3 = W + 105;
                U = i3 % 128;
                if (i3 % 2 == 0) {
                    imageResolutionClass = ImageResolutionClass.MEDIUM;
                    int i4 = 79 / 0;
                } else {
                    imageResolutionClass = ImageResolutionClass.MEDIUM;
                }
            } else {
                imageResolutionClass = ImageResolutionClass.HIGH;
            }
            this.A = imageResolutionClass;
            C1044Mm.a("nf_configurationagent", "computeImageResolutionClass() [%s] dpi: %s, isTablet:%s, isLowMem:%s", imageResolutionClass, Integer.valueOf(k), Boolean.valueOf(f), Boolean.valueOf(am));
            return this.A;
        }
        int i5 = U + 7;
        int i6 = i5 % 128;
        W = i6;
        int i7 = i5 % 2;
        if (am) {
            int i8 = i6 + 117;
            int i9 = i8 % 128;
            U = i9;
            int i10 = i8 % 2;
            if (k <= 240) {
                int i11 = i9 + 17;
                W = i11 % 128;
                int i12 = i11 % 2;
                imageResolutionClass = ImageResolutionClass.MEDIUM;
                this.A = imageResolutionClass;
                C1044Mm.a("nf_configurationagent", "computeImageResolutionClass() [%s] dpi: %s, isTablet:%s, isLowMem:%s", imageResolutionClass, Integer.valueOf(k), Boolean.valueOf(f), Boolean.valueOf(am));
                return this.A;
            }
        }
        imageResolutionClass = ImageResolutionClass.HIGH;
        this.A = imageResolutionClass;
        C1044Mm.a("nf_configurationagent", "computeImageResolutionClass() [%s] dpi: %s, isTablet:%s, isLowMem:%s", imageResolutionClass, Integer.valueOf(k), Boolean.valueOf(f), Boolean.valueOf(am));
        return this.A;
    }

    @Override // o.aOV
    public DeviceCategory r() {
        int i = 2 % 2;
        int i2 = U + 43;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return C8151dev.a();
        }
        C8151dev.a();
        throw null;
    }

    public StreamingConfigOverride aJ() {
        int i = 2 % 2;
        int i2 = W + 21;
        U = i2 % 128;
        int i3 = i2 % 2;
        StreamingConfigOverride c = this.R.c();
        int i4 = W + 1;
        U = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return c;
    }

    @Override // o.aOV
    @SuppressLint({"NewApi"})
    public VideoResolutionRange ab() {
        int i = 2 % 2;
        if (this.S == null) {
            int A = A();
            if (A > 0) {
                int i2 = W + 69;
                U = i2 % 128;
                int i3 = i2 % 2;
                this.S = VideoResolutionRange.getVideoResolutionRangeFromMaxHeight(A);
                if (i3 == 0) {
                    throw null;
                }
            } else {
                if (aQX.c()) {
                    int i4 = U + 91;
                    W = i4 % 128;
                    if (i4 % 2 != 0) {
                        C8150deu.r(this.n);
                        throw null;
                    } else if (!C8150deu.r(this.n)) {
                        this.S = C8159dfC.a(this.n);
                    }
                }
                this.S = VideoResolutionRange.getVideoResolutionRangeFromMaxHeight(Integer.MAX_VALUE);
            }
        }
        return this.S;
    }

    @Override // o.aOV
    public int E() {
        int i = 2 % 2;
        int i2 = W + 69;
        U = i2 % 128;
        int i3 = i2 % 2;
        int m = this.s.m();
        int i4 = W + 57;
        U = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return m;
    }

    public long aI() {
        long v;
        int i = 2 % 2;
        int i2 = W + 95;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            v = this.s.v();
            int i3 = 60 / 0;
        } else {
            v = this.s.v();
        }
        int i4 = W + 13;
        U = i4 % 128;
        int i5 = i4 % 2;
        return v;
    }

    public String aE() {
        int i = 2 % 2;
        int i2 = U + 11;
        W = i2 % 128;
        int i3 = i2 % 2;
        String p = this.s.p();
        int i4 = W + 41;
        U = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return p;
    }

    @Override // o.aOV
    public int s() {
        int i = 2 % 2;
        int i2 = U + 73;
        W = i2 % 128;
        int i3 = i2 % 2;
        if (!am()) {
            return 4;
        }
        int i4 = U + 83;
        W = i4 % 128;
        return i4 % 2 != 0 ? 3 : 2;
    }

    @Override // o.aOV
    public ConsolidatedLoggingSessionSpecification c(String str) {
        int i = 2 % 2;
        int i2 = U + 63;
        W = i2 % 128;
        int i3 = i2 % 2;
        ConsolidatedLoggingSessionSpecification e2 = this.s.e(str);
        int i4 = U + 111;
        W = i4 % 128;
        int i5 = i4 % 2;
        return e2;
    }

    @Override // o.aOV
    public List<String> aa() {
        int i = 2 % 2;
        int i2 = W + 113;
        U = i2 % 128;
        int i3 = i2 % 2;
        List<String> w = this.s.w();
        int i4 = W + 89;
        U = i4 % 128;
        int i5 = i4 % 2;
        return w;
    }

    @Override // o.aOV
    public boolean as() {
        int i = 2 % 2;
        int i2 = W + 23;
        U = i2 % 128;
        int i3 = i2 % 2;
        boolean d2 = this.O.d();
        int i4 = W + 29;
        U = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return d2;
    }

    private void c(InterfaceC5093bsJ interfaceC5093bsJ, List<String> list, InterfaceC1813aPe interfaceC1813aPe) {
        int i = 2 % 2;
        int i2 = U + 43;
        W = i2 % 128;
        int i3 = i2 % 2;
        e(interfaceC5093bsJ, list, interfaceC1813aPe, false);
        int i4 = U + 87;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (aC() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (aC() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(o.InterfaceC5093bsJ r11, java.util.List<java.lang.String> r12, final o.InterfaceC1813aPe r13, boolean r14) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r2 = "nf_configurationagent"
            java.lang.String r3 = "fetchConfigData %s"
            o.C1044Mm.a(r2, r3, r1)
            o.aPd$12 r8 = new o.aPd$12
            r8.<init>()
            boolean r13 = r10.b(r12)
            r1 = 0
            if (r13 == 0) goto L38
            int r13 = o.C1812aPd.W
            int r13 = r13 + 93
            int r2 = r13 % 128
            o.C1812aPd.U = r2
            int r13 = r13 % r0
            if (r13 != 0) goto L2f
            boolean r13 = r10.aC()
            r2 = 48
            int r2 = r2 / r1
            if (r13 == 0) goto L38
            goto L35
        L2f:
            boolean r13 = r10.aC()
            if (r13 == 0) goto L38
        L35:
            r13 = 1
            r7 = r13
            goto L39
        L38:
            r7 = r1
        L39:
            int r13 = o.C1812aPd.W
            int r13 = r13 + 107
            int r1 = r13 % 128
            o.C1812aPd.U = r1
            int r13 = r13 % r0
            o.TQ r13 = r10.getNetflixPlatform()
            o.aSa r4 = r10.f13437J
            r5 = r11
            r6 = r12
            r9 = r14
            com.netflix.mediaclient.servicemgr.NetflixDataRequest r11 = r4.c(r5, r6, r7, r8, r9)
            r13.c(r11)
            int r11 = o.C1812aPd.U
            int r11 = r11 + 63
            int r12 = r11 % 128
            o.C1812aPd.W = r12
            int r11 = r11 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.e(o.bsJ, java.util.List, o.aPe, boolean):void");
    }

    private boolean b(List<String> list) {
        int i = 2 % 2;
        int i2 = U + 55;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            getUserAgent().v();
            throw null;
        } else if (getUserAgent().v() || !list.contains(aRZ.f13440o)) {
            return false;
        } else {
            int i3 = U + 125;
            W = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
    }

    @Override // o.aOV
    public void b() {
        int i = 2 % 2;
        this.j.a();
        this.b.d();
        C1818aPj.c(getContext());
        aG();
        C8187dfe.c(new Runnable() { // from class: o.aPd.15
            @Override // java.lang.Runnable
            public void run() {
                XH.c.d(C1812aPd.b(C1812aPd.this)).e();
            }
        });
        int i2 = U + 43;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public void c(InterfaceC5093bsJ interfaceC5093bsJ, boolean z, InterfaceC1813aPe interfaceC1813aPe) {
        int i = 2 % 2;
        int i2 = U + 9;
        W = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.c("nf_configurationagent", "refreshCustomerConfigData %b", Boolean.valueOf(z));
        e(interfaceC5093bsJ, z, interfaceC1813aPe, false);
        int i4 = U + 25;
        W = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aOV
    public void b(aOX aox, InterfaceC1813aPe interfaceC1813aPe) {
        int i = 2 % 2;
        int i2 = U + 81;
        W = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.c("nf_configurationagent", "refreshCustomerConfigData %b", aox);
        e(aox.b(), aox.a(), interfaceC1813aPe, aox.d());
        int i4 = W + 25;
        U = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        int i = 2 % 2;
        int i2 = U + 81;
        W = i2 % 128;
        int i3 = i2 % 2;
        Sessions sessions = Sessions.CONFIG_AGENT_LOADED;
        int i4 = W + 29;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return sessions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public int h() {
        int i = 2 % 2;
        int i2 = W + 57;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            this.s.y();
            throw null;
        }
        int y = this.s.y();
        if (y > 0) {
            return y;
        }
        int i3 = U + 99;
        W = i3 % 128;
        int i4 = i3 % 2;
        return 1800;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r7.s.e(r7.n) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        if ((!r1) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        r2 = o.C1812aPd.W + 61;
        o.C1812aPd.U = r2 % 128;
        r2 = r2 % 2;
        r7.s.c();
        o.C1044Mm.a("nf_configurationagent", "Device Config & Streaming Config in cache. forceFetchOnCrash=%b", java.lang.Boolean.valueOf(r1));
        aM();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        o.C1044Mm.a("nf_configurationagent", "Need to fetch device config on app start  forceFetchOnCrash=%b", java.lang.Boolean.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (o.C8159dfC.i() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (o.C8159dfC.i() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        o.C1044Mm.e("nf_configurationagent", "Update from stub, we need to fetch config on app start...");
        o.C8157dfA.d(getContext(), "wasUpgradedFromStub2", true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void aY() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1812aPd.W
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.C1812aPd.U = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "nf_configurationagent"
            r4 = 1
            if (r1 != 0) goto L21
            android.content.Context r1 = r7.n
            boolean r1 = o.C8157dfA.a(r1)
            r7.c = r4
            boolean r5 = o.C8159dfC.i()
            if (r5 == 0) goto L3e
            goto L2f
        L21:
            android.content.Context r1 = r7.n
            boolean r1 = o.C8157dfA.a(r1)
            r7.c = r2
            boolean r5 = o.C8159dfC.i()
            if (r5 == 0) goto L3e
        L2f:
            java.lang.String r0 = "Update from stub, we need to fetch config on app start..."
            o.C1044Mm.e(r3, r0)
            android.content.Context r0 = r7.getContext()
            java.lang.String r1 = "wasUpgradedFromStub2"
            o.C8157dfA.d(r0, r1, r4)
            goto L78
        L3e:
            o.aPf r5 = r7.s
            android.content.Context r6 = r7.n
            boolean r5 = r5.e(r6)
            if (r5 == 0) goto L6b
            r5 = r1 ^ 1
            if (r5 == 0) goto L6b
            int r2 = o.C1812aPd.W
            int r2 = r2 + 61
            int r4 = r2 % 128
            o.C1812aPd.U = r4
            int r2 = r2 % r0
            o.aPf r0 = r7.s
            r0.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Device Config & Streaming Config in cache. forceFetchOnCrash=%b"
            o.C1044Mm.a(r3, r1, r0)
            r7.aM()
            return
        L6b:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "Need to fetch device config on app start  forceFetchOnCrash=%b"
            o.C1044Mm.a(r3, r1, r0)
        L78:
            r7.c = r4
            r7.aO()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.aY():void");
    }

    private void aO() {
        int i = 2 % 2;
        this.k = ConfigurationState.a;
        Object obj = null;
        c((InterfaceC5093bsJ) null, Arrays.asList(aRZ.a, aRZ.l), new C1831aPw() { // from class: o.aPd.5
            @Override // o.C1831aPw, o.InterfaceC1813aPe
            public void d(ConfigData configData, Status status) {
                C1044Mm.a("nf_configurationagent", "fetchDeviceConfigOnAppStart onConfigDataFetched statusCode=%d", Integer.valueOf(status.c().getValue()));
                if (status.j() && configData != null) {
                    C1812aPd.h(C1812aPd.this).c();
                    C1812aPd.k(C1812aPd.this);
                    return;
                }
                C1044Mm.e("nf_configurationagent", "error in fetching first config status: %s, deviceConfig: %s", status, configData);
                if (C1812aPd.h(C1812aPd.this).M()) {
                    C1812aPd.h(C1812aPd.this).V();
                    C1044Mm.j("nf_configurationagent", "recovered using pre-5.0 configs");
                    status = InterfaceC1078Nw.aJ;
                }
                if (!status.g()) {
                    Object[] objArr = new Object[2];
                    objArr[0] = status;
                    Object obj2 = configData;
                    if (configData == null) {
                        obj2 = "";
                    }
                    objArr[1] = obj2;
                    InterfaceC1598aHf.a(new C1596aHd(String.format("status= %s, configData= %s", objArr)).b(false));
                }
                if (status == InterfaceC1078Nw.aJ) {
                    C1812aPd.d(C1812aPd.this, ConfigurationState.h);
                } else {
                    C1812aPd.d(C1812aPd.this, ConfigurationState.c);
                }
                C1812aPd.b(C1812aPd.this, status);
            }
        });
        int i2 = W + 79;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private Status e(ConfigData configData) {
        int i = 2 % 2;
        if (configData != null) {
            int i2 = U + 9;
            W = i2 % 128;
            int i3 = i2 % 2;
            DeviceConfigData deviceConfigData = configData.deviceConfig;
            if (deviceConfigData != null) {
                if (deviceConfigData.shouldForceLegacyCrypto()) {
                    return InterfaceC1078Nw.at;
                }
                if (configData.deviceConfig.isBlacklisted()) {
                    return InterfaceC1078Nw.y;
                }
                return InterfaceC1078Nw.aJ;
            }
        }
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        int i4 = W + 57;
        U = i4 % 128;
        int i5 = i4 % 2;
        return netflixImmutableStatus;
    }

    @Override // o.aOV
    public boolean c() {
        int i = 2 % 2;
        boolean aC = aC();
        boolean d2 = C1821aPm.d(this.n);
        boolean e2 = C1823aPo.e(this.n);
        boolean a = C1819aPk.a(this.n);
        boolean e3 = this.L.e();
        if (aC && d2 && e2) {
            int i2 = W;
            int i3 = i2 + 105;
            U = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            } else if (!(!a)) {
                int i4 = i2 + 17;
                U = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                } else if (e3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r4 != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        o.C1044Mm.e("nf_configurationagent", "Skipping fetch of esn dependent configs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r13 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        r12 = o.C1812aPd.W + 17;
        o.C1812aPd.U = r12 % 128;
        r12 = r12 % 2;
        r13.d(null, o.InterfaceC1078Nw.aJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r4 != false) goto L9;
     */
    @Override // o.aOV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(o.InterfaceC5093bsJ r12, o.InterfaceC1813aPe r13) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r11.aC()
            android.content.Context r2 = r11.n
            boolean r2 = o.C1821aPm.d(r2)
            android.content.Context r3 = r11.n
            boolean r3 = o.C1823aPo.e(r3)
            android.content.Context r4 = r11.n
            boolean r4 = o.C1819aPk.a(r4)
            o.aFg r5 = r11.L
            boolean r5 = r5.e()
            java.lang.String r6 = "nf_configurationagent"
            r7 = 0
            if (r1 == 0) goto L55
            if (r2 == 0) goto L55
            if (r3 == 0) goto L55
            int r8 = o.C1812aPd.U
            r9 = 1
            int r8 = r8 + r9
            int r10 = r8 % 128
            o.C1812aPd.W = r10
            int r8 = r8 % r0
            if (r8 == 0) goto L3a
            r8 = 13
            int r8 = r8 / 0
            if (r4 == 0) goto L55
            goto L3d
        L3a:
            if (r4 == r9) goto L3d
            goto L55
        L3d:
            if (r5 == 0) goto L55
            java.lang.String r12 = "Skipping fetch of esn dependent configs"
            o.C1044Mm.e(r6, r12)
            if (r13 == 0) goto L54
            int r12 = o.C1812aPd.W
            int r12 = r12 + 17
            int r1 = r12 % 128
            o.C1812aPd.U = r1
            int r12 = r12 % r0
            com.netflix.mediaclient.android.app.NetflixImmutableStatus r12 = o.InterfaceC1078Nw.aJ
            r13.d(r7, r12)
        L54:
            return
        L55:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r1 == 0) goto L5d
            goto L6d
        L5d:
            int r1 = o.C1812aPd.W
            int r1 = r1 + 11
            int r9 = r1 % 128
            o.C1812aPd.U = r9
            int r1 = r1 % r0
            if (r1 == 0) goto Lb9
            java.lang.String r1 = o.aRZ.f
            r8.add(r1)
        L6d:
            if (r2 != 0) goto L7d
            java.lang.String r1 = o.aRZ.l
            r8.add(r1)
            int r1 = o.C1812aPd.U
            int r1 = r1 + 119
            int r2 = r1 % 128
            o.C1812aPd.W = r2
            int r1 = r1 % r0
        L7d:
            if (r3 != 0) goto L85
            java.lang.String r1 = o.aRZ.k
            r8.add(r1)
            goto L8a
        L85:
            java.lang.String r1 = o.aRZ.f13440o
            r8.add(r1)
        L8a:
            if (r4 != 0) goto L91
            java.lang.String r1 = o.aRZ.h
            r8.add(r1)
        L91:
            if (r5 != 0) goto L98
            java.lang.String r1 = o.aRZ.i
            r8.add(r1)
        L98:
            int r1 = r8.size()
            if (r1 > 0) goto Lac
            int r1 = o.C1812aPd.W
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.C1812aPd.U = r2
            int r1 = r1 % r0
            java.lang.String r0 = "ConfigurationAgent.fetchEsnDependentConfigsOnAppStart:: pql size <= 0"
            o.InterfaceC1598aHf.a(r0)
        Lac:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r1 = "fetching esnBasedConfigs queries: %s"
            o.C1044Mm.a(r6, r1, r0)
            r11.c(r12, r8, r13)
            return
        Lb9:
            java.lang.String r12 = o.aRZ.f
            r8.add(r12)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.c(o.bsJ, o.aPe):void");
    }

    @Override // o.aOV
    public int A() {
        int i = 2 % 2;
        int i2 = W + 7;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
            return this.s.u();
        }
        return this.s.u();
    }

    @Override // o.aOV
    public aOP f() {
        int i = 2 % 2;
        aOP aop = new aOP(this.s.g());
        int i2 = W + 121;
        U = i2 % 128;
        int i3 = i2 % 2;
        return aop;
    }

    @Override // o.aOV
    public aOW u() {
        int i = 2 % 2;
        aOW aow = new aOW(this.s.f());
        int i2 = U + 113;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return aow;
    }

    @Override // o.aOV
    public PdsAndLogblobConfig N() {
        int i = 2 % 2;
        int i2 = U + 75;
        W = i2 % 128;
        int i3 = i2 % 2;
        PdsAndLogblobConfig s = this.s.s();
        int i4 = U + 101;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return s;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public PartnerIntegrationConfig M() {
        int i = 2 % 2;
        int i2 = W + 39;
        U = i2 % 128;
        int i3 = i2 % 2;
        PartnerIntegrationConfig q = this.s.q();
        int i4 = U + 93;
        W = i4 % 128;
        int i5 = i4 % 2;
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (o.aQA.c() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = o.C1812aPd.W + 67;
        o.C1812aPd.U = r1 % 128;
        r1 = r1 % 2;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r5.s.a() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r5.s.a() != true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean aW() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1812aPd.W
            int r1 = r1 + 57
            int r2 = r1 % 128
            o.C1812aPd.U = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            o.aPf r1 = r5.s
            boolean r1 = r1.a()
            r4 = 89
            int r4 = r4 / r3
            if (r1 == 0) goto L2c
            goto L25
        L1c:
            o.aPf r1 = r5.s
            boolean r1 = r1.a()
            if (r1 == r2) goto L25
            goto L2c
        L25:
            boolean r1 = o.aQA.c()
            if (r1 != 0) goto L2c
            goto L36
        L2c:
            int r1 = o.C1812aPd.W
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.C1812aPd.U = r2
            int r1 = r1 % r0
            r2 = r3
        L36:
            int r1 = o.C1812aPd.W
            int r1 = r1 + 17
            int r3 = r1 % 128
            o.C1812aPd.U = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L42
            return r2
        L42:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.aW():boolean");
    }

    @Override // o.aOV
    public boolean an() {
        int i = 2 % 2;
        int i2 = W + 55;
        U = i2 % 128;
        int i3 = i2 % 2;
        if ((this.s.z() & 2) == 0 || !C4373bdL.c()) {
            int i4 = W + 9;
            U = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        return true;
    }

    @Override // o.aOV
    public boolean al() {
        int i = 2 % 2;
        int i2 = W + 9;
        U = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if ((this.s.z() & 8) != 0) {
            int i4 = U + 81;
            W = i4 % 128;
            if (i4 % 2 != 0) {
                C4373bdL.c();
                throw null;
            } else if (!(!C4373bdL.c())) {
                return true;
            }
        }
        int i5 = U + 29;
        W = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public boolean ar() {
        int i = 2 % 2;
        int i2 = U + 43;
        W = i2 % 128;
        int i3 = i2 % 2;
        boolean K = this.s.K();
        int i4 = U + 85;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return K;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public boolean ap() {
        int i = 2 % 2;
        int i2 = U + 55;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
            return this.s.J();
        }
        return this.s.J();
    }

    @Override // o.aOV
    public boolean af() {
        int i = 2 % 2;
        int i2 = W + 81;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            this.s.C();
            throw null;
        }
        boolean C = this.s.C();
        int i3 = U + 113;
        W = i3 % 128;
        int i4 = i3 % 2;
        return C;
    }

    @Override // o.aOV
    public boolean ae() {
        int i = 2 % 2;
        int i2 = U + 49;
        W = i2 % 128;
        int i3 = i2 % 2;
        boolean B = this.s.B();
        int i4 = W + 87;
        U = i4 % 128;
        int i5 = i4 % 2;
        return B;
    }

    @Override // o.aOV
    public boolean ak() {
        int i = 2 % 2;
        if ((this.s.z() & 4) == 0 || (!C4373bdL.c())) {
            int i2 = W + 109;
            U = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = U + 13;
        W = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // o.aOV
    public boolean aB() {
        int i = 2 % 2;
        int i2 = U + 73;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return this.s.T();
        }
        this.s.T();
        throw null;
    }

    @Override // o.aOV
    public boolean az() {
        int i = 2 % 2;
        int i2 = W + 63;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            this.s.X();
            throw null;
        }
        boolean X = this.s.X();
        int i3 = W + 71;
        U = i3 % 128;
        int i4 = i3 % 2;
        return X;
    }

    @Override // o.aOV
    public boolean ay() {
        int i = 2 % 2;
        int i2 = U + 17;
        W = i2 % 128;
        int i3 = i2 % 2;
        boolean W2 = this.s.W();
        int i4 = U + 107;
        W = i4 % 128;
        int i5 = i4 % 2;
        return W2;
    }

    @Override // o.aOV
    public int S() {
        int t;
        int i = 2 % 2;
        int i2 = W + 117;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            t = this.s.t();
            int i3 = 51 / 0;
        } else {
            t = this.s.t();
        }
        int i4 = W + 71;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public BwCap b(StreamProfileType streamProfileType) {
        int i = 2 % 2;
        int i2 = U + 103;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return this.j.c(streamProfileType);
        }
        this.j.c(streamProfileType);
        throw null;
    }

    @Override // o.aOV
    public StreamingCodecPrefData U() {
        int i = 2 % 2;
        int i2 = W + 87;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            StreamingCodecPrefData i3 = this.j.i();
            int i4 = U + 19;
            W = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        }
        this.j.i();
        throw null;
    }

    @Override // o.aOV
    public OfflineCodecPrefData F() {
        int i = 2 % 2;
        int i2 = U + 65;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            return this.j.e();
        }
        this.j.e();
        throw null;
    }

    @Override // o.aOV
    public int R() {
        int i = 2 % 2;
        int i2 = U + 61;
        W = i2 % 128;
        int i3 = i2 % 2;
        int r = this.s.r();
        int i4 = U + 105;
        W = i4 % 128;
        int i5 = i4 % 2;
        return r;
    }

    @Override // o.aOV
    public String Q() {
        int i = 2 % 2;
        int i2 = U + 45;
        W = i2 % 128;
        int i3 = i2 % 2;
        String d2 = this.j.d();
        int i4 = U + 55;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public String K() {
        int i = 2 % 2;
        int i2 = U + 41;
        W = i2 % 128;
        int i3 = i2 % 2;
        String b = this.j.b();
        int i4 = U + 1;
        W = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return b;
    }

    @Override // o.aOV
    public boolean aA() {
        boolean z;
        int i = 2 % 2;
        int i2 = W + 79;
        U = i2 % 128;
        int i3 = i2 % 2;
        if (this.F && this.s.x().isEnableVoip() && (!this.s.Y() || !this.j.g())) {
            z = false;
        } else {
            int i4 = W + 75;
            U = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        int i6 = U + 105;
        W = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override // o.aOV
    public boolean au() {
        int i = 2 % 2;
        int i2 = W + 75;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            return this.s.S();
        }
        this.s.S();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public VoipConfiguration ac() {
        int i = 2 % 2;
        int i2 = U + 49;
        W = i2 % 128;
        int i3 = i2 % 2;
        VoipConfiguration x = this.s.x();
        int i4 = W + 85;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return x;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean aR() {
        int i = 2 % 2;
        int i2 = W + 9;
        U = i2 % 128;
        int i3 = i2 % 2;
        boolean a = C1815aPg.d(this.n).a();
        int i4 = W + 53;
        U = i4 % 128;
        int i5 = i4 % 2;
        return a;
    }

    public boolean aC() {
        int i = 2 % 2;
        int i2 = W + 19;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            return C8284dhV.e(aR()).isValid();
        }
        C8284dhV.e(aR()).isValid();
        throw null;
    }

    @Override // o.aOV
    public void e(UserCookies userCookies) {
        int i = 2 % 2;
        int i2 = U + 81;
        W = i2 % 128;
        int i3 = i2 % 2;
        this.G.a(userCookies);
        int i4 = U + 41;
        W = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aOV
    public SignInConfigData W() {
        int i = 2 % 2;
        int i2 = U + 43;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
            return this.M.c;
        }
        return this.M.c;
    }

    @Override // o.aOV
    public void d(C5007bqd c5007bqd, InterfaceC1813aPe interfaceC1813aPe) {
        int i = 2 % 2;
        getNetflixPlatform().c(this.f13437J.e(c5007bqd, interfaceC1813aPe, new C5010bqg("TEMP_PROFILE_ID")));
        int i2 = U + 3;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    @Override // o.aOV
    public ImageResolutionClass C() {
        int i = 2 % 2;
        int i2 = W + 39;
        U = i2 % 128;
        int i3 = i2 % 2;
        ImageResolutionClass e2 = e(getContext());
        int i4 = U + 87;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return e2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public String y() {
        int i = 2 % 2;
        int i2 = U + 65;
        W = i2 % 128;
        int i3 = i2 % 2;
        String o2 = this.s.o();
        int i4 = U + 113;
        W = i4 % 128;
        int i5 = i4 % 2;
        return o2;
    }

    @Override // o.aOV
    public OfflineUnavailableReason L() {
        int i = 2 % 2;
        if (this.s.n().isOfflineFeatureDisabled()) {
            return OfflineUnavailableReason.NA_DISABLED_FROM_END_POINT;
        }
        if (this.x) {
            int i2 = U + 123;
            W = i2 % 128;
            int i3 = i2 % 2;
            return OfflineUnavailableReason.NA_DISABLED_BY_SYSTEM_ID_4266_FROM_SERVER;
        } else if (this.w.J_() != CryptoProvider.WIDEVINE_L3 || (!"4266".equals(this.w.K_()))) {
            if (C8151dev.h()) {
                int i4 = U + 47;
                W = i4 % 128;
                int i5 = i4 % 2;
                return OfflineUnavailableReason.NA_DISABLED_SMART_DISPLAY;
            }
            return null;
        } else {
            int i6 = U + 5;
            W = i6 % 128;
            int i7 = i6 % 2;
            return OfflineUnavailableReason.NA_DISABLED_BY_SYSTEM_ID_4266;
        }
    }

    @Override // o.aOV
    public int G() {
        int i = 2 % 2;
        int i2 = W + 63;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            this.s.n().getMaintenanceJobPeriodInHrs();
            throw null;
        }
        int maintenanceJobPeriodInHrs = this.s.n().getMaintenanceJobPeriodInHrs();
        int i3 = W + 69;
        U = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
        return maintenanceJobPeriodInHrs;
    }

    @Override // o.aOV
    public boolean aw() {
        int i = 2 % 2;
        int i2 = U + 31;
        W = i2 % 128;
        int i3 = i2 % 2;
        if (L() != null) {
            int i4 = W + 47;
            U = i4 % 128;
            return i4 % 2 != 0;
        }
        return false;
    }

    @Override // o.aOV
    public void d(StatusCode statusCode) {
        int i = 2 % 2;
        int i2 = W + 55;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            if (statusCode == StatusCode.DL_BLACKLISTED_DEVICE) {
                C1044Mm.e("nf_configurationagent", "Device is blacklisted, disable offline");
                C8157dfA.d(this.n, "offline_blaclisted_device_override", true);
                this.x = true;
                getErrorHandler().b(aMH.c().a().c(this.n, statusCode));
                return;
            }
            int i3 = W + 21;
            U = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        StatusCode statusCode2 = StatusCode.DL_BLACKLISTED_DEVICE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public String v() {
        int i = 2 % 2;
        int i2 = W + 3;
        U = i2 % 128;
        int i3 = i2 % 2;
        String j = this.s.j();
        int i4 = U + 43;
        W = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return j;
    }

    @Override // o.aOV
    public boolean ah() {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 33;
        W = i3 % 128;
        int i4 = i3 % 2;
        C1814aPf c1814aPf = this.s;
        if (c1814aPf != null) {
            return c1814aPf.A();
        }
        int i5 = i2 + 17;
        W = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return false;
    }

    @Override // o.aOV
    public boolean aD() {
        int i = 2 % 2;
        int i2 = W + 95;
        int i3 = i2 % 128;
        U = i3;
        int i4 = i2 % 2;
        C1814aPf c1814aPf = this.s;
        if (c1814aPf != null) {
            int i5 = i3 + 103;
            W = i5 % 128;
            if (i5 % 2 == 0) {
                if (c1814aPf.x() != null) {
                    return this.s.x().isShowHelpForNonMember();
                }
            } else {
                c1814aPf.x();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i6 = W + 39;
        U = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // o.aOV
    public boolean aj() {
        int i = 2 % 2;
        int i2 = U + 61;
        int i3 = i2 % 128;
        W = i3;
        if (i2 % 2 == 0) {
            C1814aPf c1814aPf = this.s;
            if (c1814aPf != null) {
                int i4 = i3 + 13;
                U = i4 % 128;
                int i5 = i4 % 2;
                boolean I = c1814aPf.I();
                if (i5 == 0) {
                    int i6 = 35 / 0;
                    if (!I) {
                        return false;
                    }
                } else if (!I) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw null;
    }

    @Override // o.aOV
    public String n() {
        int i = 2 % 2;
        int i2 = U + 103;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
            return this.h.c();
        }
        return this.h.c();
    }

    @Override // o.aOV
    public String B() {
        String e2;
        int i = 2 % 2;
        int i2 = U + 29;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            e2 = this.h.e();
            int i3 = 81 / 0;
        } else {
            e2 = this.h.e();
        }
        int i4 = U + 123;
        W = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return e2;
    }

    @Override // o.aOV
    public String l() {
        int i = 2 % 2;
        int i2 = W + 5;
        U = i2 % 128;
        int i3 = i2 % 2;
        if (!(!C8168dfL.g(this.q))) {
            int i4 = W + 61;
            U = i4 % 128;
            int i5 = i4 % 2;
            this.q = C8054ddD.e("ro.board.platform", "");
        }
        return this.q;
    }

    @Override // o.aOV
    public String m() {
        int i = 2 % 2;
        int i2 = W + 57;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.i == null) {
            this.i = C8054ddD.e("ro.hardware", "");
            int i3 = U + 29;
            W = i3 % 128;
            int i4 = i3 % 2;
        }
        return this.i;
    }

    @Override // o.aOV
    public String X() {
        String str;
        synchronized (this) {
            if (this.p == null) {
                this.p = C8054ddD.e("ro.netflix.bsp_rev", "");
            }
            str = this.p;
        }
        return str;
    }

    @Override // o.aOV
    public String I() {
        synchronized (this) {
            C1829aPu c1829aPu = this.P;
            if (c1829aPu != null) {
                return c1829aPu.e();
            }
            for (Map.Entry<String, String> entry : new HashMap<String, String>() { // from class: com.netflix.mediaclient.service.configuration.ConfigurationAgentImpl$15
                {
                    put("ro.vendor.mtk_microtrust_tee_support", "microtrust");
                    put("ro.vendor.mtk_trustonic_tee_support", "trustonic");
                    put("ro.vendor.mtk_teegris_tee_support", "teegris");
                    put("ro.vendor.mtk_mitee_support", "mitee");
                }
            }.entrySet()) {
                String e2 = C8054ddD.e(entry.getKey(), "");
                if (C8168dfL.h(e2)) {
                    String trim = e2.trim();
                    Object[] objArr = new Object[1];
                    bb(1, (char) 42769, 0, objArr);
                    if (trim.equals(((String) objArr[0]).intern())) {
                        this.P = new C1829aPu(entry.getKey(), entry.getValue());
                        return entry.getValue();
                    }
                }
            }
            return null;
        }
    }

    @Override // o.aOV
    public String Y() {
        String f;
        int i = 2 % 2;
        int i2 = W + 63;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            f = this.j.f();
            int i3 = 44 / 0;
        } else {
            f = this.j.f();
        }
        int i4 = W + 71;
        U = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    @Override // o.aOV
    public int O() {
        int i = 2 % 2;
        if (!C8120deQ.e()) {
            int i2 = W + 29;
            U = i2 % 128;
            int i3 = i2 % 2;
            return 4;
        }
        int i4 = U + 69;
        W = i4 % 128;
        int i5 = i4 % 2;
        return 2;
    }

    @Override // o.aOV
    public void b(InterfaceC1813aPe interfaceC1813aPe) {
        int i = 2 % 2;
        int i2 = W + 91;
        U = i2 % 128;
        int i3 = i2 % 2;
        addDataRequest(this.f13437J.b(interfaceC1813aPe));
        int i4 = U + 29;
        W = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aOV
    public boolean aq() {
        boolean N;
        int i = 2 % 2;
        int i2 = W + 49;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            N = this.s.N();
            int i3 = 87 / 0;
        } else {
            N = this.s.N();
        }
        int i4 = W + 21;
        U = i4 % 128;
        int i5 = i4 % 2;
        return N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((r2 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r1.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        r2 = r2 + 99;
        o.C1812aPd.U = r2 % 128;
     */
    @Override // o.aOV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int D() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1812aPd.U
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.C1812aPd.W = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            o.aPf r1 = r4.s
            r3 = 17
            int r3 = r3 / 0
            if (r1 != 0) goto L2a
            goto L1b
        L17:
            o.aPf r1 = r4.s
            if (r1 != 0) goto L2a
        L1b:
            int r2 = r2 + 99
            int r1 = r2 % 128
            o.C1812aPd.U = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L28
            r0 = 68
            int r0 = r0 / 0
        L28:
            r0 = -1
            goto L2e
        L2a:
            int r0 = r1.l()
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.D():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        if ((!com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase.h(r1)) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4.isAVCHighCodecForceEnabled() != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // o.aOV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ag() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1812aPd.W
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.C1812aPd.U = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            o.aPf r1 = r7.s
            boolean r1 = r1.F()
            if (r1 == 0) goto L2e
            goto L20
        L18:
            o.aPf r1 = r7.s
            boolean r1 = r1.F()
            if (r1 == 0) goto L2e
        L20:
            int r1 = o.C1812aPd.W
            int r1 = r1 + 119
            int r3 = r1 % 128
            o.C1812aPd.U = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L2c
            return r2
        L2c:
            r0 = 0
            throw r0
        L2e:
            boolean r1 = o.C8189dfg.b()
            r3 = 1
            if (r1 == 0) goto L52
            int r1 = o.C1812aPd.W
            int r1 = r1 + 31
            int r4 = r1 % 128
            o.C1812aPd.U = r4
            int r1 = r1 % r0
            boolean r1 = r7.aW()
            if (r1 == 0) goto L52
            int r1 = o.C1812aPd.U
            int r1 = r1 + 89
            int r4 = r1 % 128
            o.C1812aPd.W = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L50
            goto L52
        L50:
            r1 = r3
            goto L53
        L52:
            r1 = r2
        L53:
            com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData r4 = r7.U()
            if (r4 == 0) goto L77
            boolean r5 = r4.isAVCHighCodecEnabled()
            if (r5 == 0) goto L6f
            int r5 = o.C1812aPd.W
            int r5 = r5 + 89
            int r6 = r5 % 128
            o.C1812aPd.U = r6
            int r5 = r5 % r0
            boolean r1 = com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase.h(r1)
            r1 = r1 ^ r3
            if (r1 == 0) goto L76
        L6f:
            boolean r1 = r4.isAVCHighCodecForceEnabled()
            if (r1 == r3) goto L76
            goto L77
        L76:
            r2 = r3
        L77:
            int r1 = o.C1812aPd.U
            int r1 = r1 + 123
            int r3 = r1 % 128
            o.C1812aPd.W = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1812aPd.ag():boolean");
    }

    @Override // o.aOV
    public int Z() {
        int i = 2 % 2;
        int i2 = U;
        int i3 = i2 + 51;
        W = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C1814aPf c1814aPf = this.s;
        if (c1814aPf == null) {
            int i4 = i2 + 99;
            W = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
            return -1;
        }
        return c1814aPf.D();
    }

    @Override // o.aOV
    public int g() {
        int i = 2 % 2;
        int i2 = U + 71;
        W = i2 % 128;
        int i3 = i2 % 2;
        int e2 = this.s.e();
        int i4 = U + 117;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return e2;
        }
        throw null;
    }

    @Override // o.aOV
    public int z() {
        int k;
        int i = 2 % 2;
        C1814aPf c1814aPf = this.s;
        if (c1814aPf == null) {
            int i2 = U + 63;
            W = i2 % 128;
            int i3 = i2 % 2;
            k = -1;
        } else {
            k = c1814aPf.k();
        }
        int i4 = W + 111;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return k;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public int i() {
        int i = 2 % 2;
        int i2 = W + 9;
        U = i2 % 128;
        if (i2 % 2 != 0) {
            C1814aPf c1814aPf = this.s;
            int h = c1814aPf == null ? -1 : c1814aPf.h();
            int i3 = W + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            U = i3 % 128;
            int i4 = i3 % 2;
            return h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aOV
    public Collection<String> V() {
        int i = 2 % 2;
        int i2 = W + 31;
        U = i2 % 128;
        int i3 = i2 % 2;
        List emptyList = Collections.emptyList();
        int i4 = U + 61;
        W = i4 % 128;
        if (i4 % 2 == 0) {
            return emptyList;
        }
        throw null;
    }

    @Override // o.aOV
    public boolean ai() {
        int i = 2 % 2;
        int i2 = U + 53;
        W = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            C1044Mm.e("nf_configurationagent", "using isConsumptionOnly from config ");
            C1814aPf c1814aPf = this.s;
            if (c1814aPf != null) {
                int i3 = W + 9;
                U = i3 % 128;
                if (i3 % 2 == 0) {
                    c1814aPf.E();
                    obj.hashCode();
                    throw null;
                } else if (c1814aPf.E()) {
                    int i4 = W + 65;
                    U = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
            return false;
        }
        C1044Mm.e("nf_configurationagent", "using isConsumptionOnly from config ");
        throw null;
    }

    @Override // o.aOV
    public boolean ax() {
        int i = 2 % 2;
        C1814aPf c1814aPf = this.s;
        if (c1814aPf != null) {
            int i2 = W + 55;
            U = i2 % 128;
            int i3 = i2 % 2;
            if (c1814aPf.R()) {
                int i4 = U + 41;
                W = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    @Override // o.aOV
    public void d(String str) {
        int i = 2 % 2;
        int i2 = W + 75;
        U = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.c("nf_configurationagent", "setDeviceIdToken existing: %s and received in MSL http response header: %s", this.r, str);
        this.r = str;
        C1826aPr.a(getContext(), aT(), str);
        int i4 = W + 33;
        U = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aOV
    public void e(String str) {
        int i = 2 % 2;
        int i2 = W + 91;
        U = i2 % 128;
        int i3 = i2 % 2;
        if (!aX()) {
            if (this.r == null) {
                C1044Mm.d("nf_configurationagent", "setSsoToken called but deviceId is missing.");
                InterfaceC1598aHf.a(new C1596aHd("Got ssoToken but missing deviceId.").b(false));
                return;
            }
            C1044Mm.c("nf_configurationagent", "setSsoToken saving to shared storage %s", str);
            C1826aPr.c(aT(), getContext(), str);
            int i4 = U + 3;
            W = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
                return;
            }
            return;
        }
        C1044Mm.c("nf_configurationagent", "%s onSsoTokenReceived:: disabled", this.Q);
    }

    private boolean aZ() {
        int i = 2 % 2;
        int i2 = W + 29;
        U = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
            return Config_FastProperty_NgpConfig.Companion.a();
        }
        return Config_FastProperty_NgpConfig.Companion.a();
    }

    private boolean aX() {
        int i = 2 % 2;
        int i2 = U + 65;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
            return Config_FastProperty_NgpConfig.Companion.c();
        }
        return Config_FastProperty_NgpConfig.Companion.c();
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        int i = 2 % 2;
        int i2 = W + 47;
        U = i2 % 128;
        int i3 = i2 % 2;
        Status c = this.k.c();
        int i4 = W + 55;
        U = i4 % 128;
        int i5 = i4 % 2;
        return c;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        int i = 2 % 2;
        int i2 = U + 65;
        W = i2 % 128;
        int i3 = i2 % 2;
        StopReason stopReason = StopReason.INIT_TIMED_OUT_CONFIG;
        int i4 = W + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        U = i4 % 128;
        if (i4 % 2 != 0) {
            return stopReason;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        int i = 2 % 2;
        int i2 = W + 55;
        U = i2 % 128;
        int i3 = i2 % 2;
        StopReason stopReason = StopReason.INIT_FAILED_CONFIG;
        if (i3 != 0) {
            return stopReason;
        }
        throw null;
    }

    @Override // o.aOV
    public boolean aF() {
        int i = 2 % 2;
        int i2 = U + 103;
        W = i2 % 128;
        if (i2 % 2 == 0) {
            boolean isEccAppBootKeyEnabled = Config_FastProperty_MSLTransport.isEccAppBootKeyEnabled();
            int i3 = U + 111;
            W = i3 % 128;
            int i4 = i3 % 2;
            return isEccAppBootKeyEnabled;
        }
        Config_FastProperty_MSLTransport.isEccAppBootKeyEnabled();
        throw null;
    }

    @Override // o.aOV
    public aPY o() {
        int i = 2 % 2;
        aPY apy = new aPY(aW(), C1811aPc.b(this.s), this.s.U());
        int i2 = U + 43;
        W = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return apy;
    }

    @Override // o.aOV
    public boolean e() {
        int i = 2 % 2;
        int i2 = W + 79;
        U = i2 % 128;
        int i3 = i2 % 2;
        boolean z = aQI.c() && !this.a;
        int i4 = U + 51;
        W = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return z;
    }

    private static void bb(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        C9581sN c9581sN = new C9581sN();
        long[] jArr = new long[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            int i4 = $10 + 71;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            jArr[c9581sN.d] = (((char) (b$s43$17149[i2 + c9581sN.d] ^ 8527296503698573146L)) ^ (c9581sN.d * (8527296503698573146L ^ d$s44$17149))) ^ c;
            c9581sN.d++;
        }
        char[] cArr = new char[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[c9581sN.d] = (char) jArr[c9581sN.d];
            } else {
                cArr[c9581sN.d] = (char) jArr[c9581sN.d];
            }
            c9581sN.d++;
        }
        objArr[0] = new String(cArr);
    }
}
