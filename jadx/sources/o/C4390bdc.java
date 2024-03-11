package o;

import android.content.Context;
import android.util.Pair;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.player.bladerunnerclient.BladeRunnerPrefetchResponseHandler;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.NqErrorStatus;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.json.JSONObject;

/* renamed from: o.bdc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4390bdc extends BladeRunnerPrefetchResponseHandler implements InterfaceC4333bcY {
    private final TQ b;
    private final C4394bdg e;

    public C4390bdc(TQ tq, C4394bdg c4394bdg) {
        this.b = tq;
        this.e = c4394bdg;
    }

    public void a(C4395bdh[] c4395bdhArr, ManifestRequestFlavor manifestRequestFlavor, boolean z, String str, boolean z2, boolean z3, InterfaceC4389bdb interfaceC4389bdb, aHT aht) {
        InterfaceC4362bdA c4412bdy;
        Context d = AbstractApplicationC1040Mh.d();
        C4400bdm c4400bdm = new C4400bdm(d, this.e, ConnectivityUtils.e(d), C1613aHu.c(AbstractApplicationC1040Mh.d()));
        Long[] lArr = (Long[]) ((List) Arrays.stream(c4395bdhArr).map(new Function() { // from class: o.bcZ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long b;
                b = C4390bdc.b((C4395bdh) obj);
                return b;
            }
        }).collect(Collectors.toList())).toArray(new Long[0]);
        String c = c(c4395bdhArr, manifestRequestFlavor, z, str, z2, c4400bdm);
        a aVar = new a(interfaceC4389bdb);
        if (z) {
            c4412bdy = new C4406bds(AbstractApplicationC1040Mh.d(), c, manifestRequestFlavor, aVar, this, lArr);
        } else {
            c4412bdy = new C4412bdy(AbstractApplicationC1040Mh.d(), c, manifestRequestFlavor, aVar, this, lArr, z3);
        }
        if (ManifestRequestFlavor.PREFETCH == manifestRequestFlavor) {
            a(lArr, c4412bdy);
        }
        if (aht != null) {
            c4412bdy.c(aht);
        }
        C1044Mm.e("nf_bladerunner", "sending nq_manifest request");
        this.b.c(c4412bdy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long b(C4395bdh c4395bdh) {
        return Long.valueOf(c4395bdh.b);
    }

    private String c(C4395bdh[] c4395bdhArr, ManifestRequestFlavor manifestRequestFlavor, boolean z, String str, boolean z2, ManifestRequestParamBuilderBase manifestRequestParamBuilderBase) {
        String[] strArr = new String[c4395bdhArr.length];
        boolean[] zArr = new boolean[c4395bdhArr.length];
        boolean[] zArr2 = new boolean[c4395bdhArr.length];
        C4419beE[] c4419beEArr = new C4419beE[c4395bdhArr.length];
        String[] strArr2 = new String[c4395bdhArr.length];
        String[] strArr3 = new String[c4395bdhArr.length];
        String[] strArr4 = new String[c4395bdhArr.length];
        Boolean[] boolArr = new Boolean[c4395bdhArr.length];
        String[] strArr5 = new String[c4395bdhArr.length];
        String[] strArr6 = new String[c4395bdhArr.length];
        String[] strArr7 = new String[c4395bdhArr.length];
        String[] strArr8 = new String[c4395bdhArr.length];
        int length = c4395bdhArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = length;
            C4395bdh c4395bdh = c4395bdhArr[i];
            String[] strArr9 = strArr7;
            String[] strArr10 = strArr8;
            strArr[i2] = Long.toString(c4395bdh.b);
            zArr[i2] = c4395bdh.e;
            zArr2[i2] = c4395bdh.m;
            c4419beEArr[i2] = c4395bdh.d;
            strArr2[i2] = c4395bdh.l;
            strArr3[i2] = c4395bdh.i;
            strArr4[i2] = c4395bdh.j;
            String str2 = c4395bdh.h;
            boolArr[i2] = (str2 == null || str2.equals("")) ? null : Boolean.valueOf(c4395bdh.h.equals("true"));
            strArr5[i2] = c4395bdh.g;
            strArr6[i2] = c4395bdh.f;
            strArr9[i2] = c4395bdh.c;
            strArr10[i2] = c4395bdh.a;
            i2++;
            i++;
            length = i3;
            strArr7 = strArr9;
            strArr8 = strArr10;
        }
        return ((C4400bdm) manifestRequestParamBuilderBase).n(strArr2).i(strArr5).j(strArr6).h(strArr7).d(c4419beEArr).a(zArr).c(zArr2).b(str).c(C8150deu.t(AbstractApplicationC1040Mh.d())).d(manifestRequestFlavor).b(strArr).c(strArr3, strArr4, boolArr).l(z2).a(strArr8).k(z).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bdc$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC4397bdj {
        final InterfaceC4389bdb e;

        a(InterfaceC4389bdb interfaceC4389bdb) {
            this.e = interfaceC4389bdb;
        }

        @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
        public void a(final JSONObject jSONObject, final Status status) {
            super.a(jSONObject, status);
            if (status instanceof BasePlayErrorStatus) {
                C1044Mm.d("nf_bladerunner", "Manifest error");
                BasePlayErrorStatus basePlayErrorStatus = (BasePlayErrorStatus) status;
                if (C8168dfL.h(basePlayErrorStatus.n()) && !C1880aRr.c()) {
                    if (!C8123deT.e(basePlayErrorStatus.s())) {
                        C1044Mm.a("nf_bladerunner", "Found ACCOUNT_ON_HOLD uma: %s", basePlayErrorStatus.s());
                        this.e.a(jSONObject, status);
                        return;
                    } else if (C8168dfL.g(basePlayErrorStatus.n())) {
                        C1044Mm.e("nf_bladerunner", "Fetch accountOnHoldUma, extra info missing, alert TAG is missing, go default");
                        this.e.a(jSONObject, status);
                        return;
                    } else {
                        C1044Mm.a("nf_bladerunner", "Fetch accountOnHoldUma, extra info missing, send alert TAG: %s", basePlayErrorStatus.n());
                        C4390bdc.this.b.c(new C4404bdq(AbstractApplicationC1040Mh.d(), basePlayErrorStatus.n(), C4390bdc.this.e() != null && C4390bdc.this.e().ai(), new AbstractC4397bdj() { // from class: o.bdc.a.4
                            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
                            public void e(JSONObject jSONObject2, Status status2) {
                                super.e(jSONObject2, status2);
                                C1044Mm.a("nf_bladerunner", "on dataFetched data:%s, umaStatus:%s", jSONObject2, status2);
                                if (status2.j()) {
                                    Status status3 = status;
                                    if (status3 instanceof NqErrorStatus) {
                                        NqErrorStatus nqErrorStatus = (NqErrorStatus) status3;
                                        nqErrorStatus.c(jSONObject2);
                                        a.this.e.a(jSONObject, nqErrorStatus);
                                        return;
                                    }
                                }
                                a.this.e.a(jSONObject, status);
                            }
                        }));
                        return;
                    }
                }
                this.e.a(jSONObject, status);
                return;
            }
            this.e.a(jSONObject, status);
        }
    }

    private String c(String str, String str2, String str3, DownloadVideoQuality downloadVideoQuality, String str4) {
        Context d = AbstractApplicationC1040Mh.d();
        C4392bde c4392bde = new C4392bde(d, this.e, ConnectivityUtils.e(d));
        if (str4 != null) {
            c4392bde = c4392bde.d(str4);
        }
        return c4392bde.b(downloadVideoQuality).b(str2, str3).c(C8150deu.t(d)).b(new String[]{str}).d();
    }

    public void d(String str, String str2, String str3, String str4, DownloadVideoQuality downloadVideoQuality, InterfaceC4389bdb interfaceC4389bdb) {
        a(str, str2, str3, str4, downloadVideoQuality, interfaceC4389bdb);
    }

    public void a(String str, String str2, String str3, String str4, DownloadVideoQuality downloadVideoQuality, InterfaceC4389bdb interfaceC4389bdb) {
        this.b.c(new C4408bdu(str4, AbstractApplicationC1040Mh.d(), c(str, str2, str3, downloadVideoQuality, null), ManifestRequestFlavor.OFFLINE, new a(interfaceC4389bdb)));
    }

    public void c(String str, String str2, String str3, String str4, String str5, DownloadVideoQuality downloadVideoQuality, InterfaceC4525bgE interfaceC4525bgE, InterfaceC4389bdb interfaceC4389bdb) {
        Object obj;
        C1044Mm.e("nf_bladerunner", "refreshOfflineManifest");
        if (interfaceC4525bgE == null || interfaceC4525bgE.U() == null) {
            d(str, str2, str3, str4, downloadVideoQuality, interfaceC4389bdb);
            return;
        }
        Pair<VideoTrack, Stream> d = C4526bgF.d(interfaceC4525bgE, str5);
        this.b.c(new C4368bdG(AbstractApplicationC1040Mh.d(), str4, c(str, str2, str3, downloadVideoQuality, (d == null || (obj = d.second) == null) ? null : ((Stream) obj).contentProfile()), interfaceC4525bgE, new a(interfaceC4389bdb)));
    }

    @Override // o.InterfaceC4333bcY
    public void d(InterfaceC4416beB interfaceC4416beB, InterfaceC4389bdb interfaceC4389bdb) {
        c(interfaceC4416beB, interfaceC4389bdb);
    }

    public void c(InterfaceC4416beB interfaceC4416beB, InterfaceC4389bdb interfaceC4389bdb) {
        C4407bdt c4407bdt = new C4407bdt(AbstractApplicationC1040Mh.d(), new C4396bdi(this.e.c).c(interfaceC4416beB.b()).b(interfaceC4416beB).d(System.currentTimeMillis() / 1000).a(), false, interfaceC4416beB.b(), interfaceC4389bdb, this, interfaceC4416beB.f(), interfaceC4416beB.l());
        if (interfaceC4416beB.b().equals(LicenseRequestFlavor.LIMITED)) {
            e(interfaceC4416beB.f(), c4407bdt);
        }
        this.b.c(c4407bdt);
    }

    public void a(String str, AbstractC4561bgo abstractC4561bgo, String str2, final InterfaceC4389bdb interfaceC4389bdb) {
        final Context d = AbstractApplicationC1040Mh.d();
        C4394bdg c4394bdg = this.e;
        C4391bdd c4391bdd = new C4391bdd(c4394bdg.c, c4394bdg.b.aq());
        c4391bdd.b(System.currentTimeMillis() / 1000);
        String d2 = c4391bdd.e(abstractC4561bgo, str2).d();
        AbstractC4397bdj abstractC4397bdj = new AbstractC4397bdj() { // from class: o.bdc.1
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void a(OfflineLicenseResponse offlineLicenseResponse, Status status) {
                super.a(offlineLicenseResponse, status);
                C1044Mm.a("nf_bladerunner", " license fetched status: %s", status.c());
                if (status.j() && offlineLicenseResponse.b()) {
                    Status d3 = C4390bdc.this.d(offlineLicenseResponse.r, C4984bqG.b.e(d).c());
                    C1044Mm.a("nf_bladerunner", " yearlyLicenseStatus fetched status: %s", d3.c());
                    interfaceC4389bdb.a(offlineLicenseResponse, d3);
                    return;
                }
                C4390bdc.this.d(status.c());
                interfaceC4389bdb.a(offlineLicenseResponse, status);
            }
        };
        C1044Mm.e("nf_bladerunner", "fetching offline license");
        this.b.c(new C4409bdv(d, str, d2, false, LicenseRequestFlavor.OFFLINE, abstractC4397bdj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(StatusCode statusCode) {
        this.e.b.d(statusCode);
    }

    public void c(AbstractC4561bgo abstractC4561bgo, String str, boolean z, InterfaceC4389bdb interfaceC4389bdb) {
        C4393bdf c = new C4388bda(z, str).c(abstractC4561bgo);
        this.b.c(new C4364bdC(AbstractApplicationC1040Mh.d(), c.a(), c.b(), interfaceC4389bdb));
    }

    public void c(String str, boolean z, AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, String str2, final InterfaceC4389bdb interfaceC4389bdb) {
        boolean z2 = a(abstractC4561bgo2) && d(abstractC4561bgo2);
        C1044Mm.a("nf_nq", "ROL - shouldUseNq: %s Link: %s", Boolean.valueOf(z2), abstractC4561bgo2);
        C4394bdg c4394bdg = this.e;
        C4391bdd c4391bdd = new C4391bdd(c4394bdg.c, c4394bdg.b.aq());
        if (z2) {
            c4391bdd.b(System.currentTimeMillis() / 1000);
        }
        c4391bdd.d(z);
        String d = c4391bdd.e(abstractC4561bgo2, str2).d();
        final Context d2 = AbstractApplicationC1040Mh.d();
        AbstractC4397bdj abstractC4397bdj = new AbstractC4397bdj() { // from class: o.bdc.4
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void a(OfflineLicenseResponse offlineLicenseResponse, Status status) {
                super.a(offlineLicenseResponse, status);
                C1044Mm.a("nf_bladerunner", "refresh license fetched status: %s", status);
                if (status.j() && offlineLicenseResponse.b()) {
                    status = C4390bdc.this.d(offlineLicenseResponse.r, C4984bqG.b.e(d2).c());
                    C1044Mm.a("nf_bladerunner", "refresh license fetched status: %s", status);
                }
                interfaceC4389bdb.a(offlineLicenseResponse, status);
            }
        };
        C1044Mm.e("nf_bladerunner", "refreshing offline license");
        if (z2) {
            c(str, d, abstractC4561bgo, abstractC4397bdj);
        } else {
            this.b.c(new FetchLicenseRequest(d2, FetchLicenseRequest.LicenseReqType.OFFLINE, d, true, LicenseRequestFlavor.OFFLINE, abstractC4397bdj));
        }
    }

    private boolean a(AbstractC4561bgo abstractC4561bgo) {
        String d = abstractC4561bgo.d();
        if (d == null) {
            return true;
        }
        return !d.contains("activateAndRefresh");
    }

    private boolean d(AbstractC4561bgo abstractC4561bgo) {
        String d = abstractC4561bgo.d();
        return d != null && d.contains("playbackContextId=");
    }

    private void c(String str, String str2, AbstractC4561bgo abstractC4561bgo, InterfaceC4389bdb interfaceC4389bdb) {
        Context d = AbstractApplicationC1040Mh.d();
        if (abstractC4561bgo != null) {
            C1044Mm.e("nf_nq", "refreshing");
            this.b.c(new C4409bdv(d, str, str2, true, LicenseRequestFlavor.OFFLINE, interfaceC4389bdb));
            return;
        }
        this.b.c(new C4409bdv(d, str, str2, true, LicenseRequestFlavor.OFFLINE, interfaceC4389bdb));
    }

    public void e(List<AbstractC4561bgo> list, InterfaceC4389bdb interfaceC4389bdb) {
        Context d = AbstractApplicationC1040Mh.d();
        C4399bdl b = new C4399bdl().b(list);
        this.b.c(new C4365bdD(d, b.c(), b.d(), interfaceC4389bdb));
    }

    public static String a(AbstractC4561bgo abstractC4561bgo, String str) {
        return new C4393bdf().c(abstractC4561bgo).d("xid", str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Status d(long j, Locale locale) {
        String c = c(j, locale);
        NetflixStatus netflixStatus = new NetflixStatus(StatusCode.DL_WARNING_DL_N_TIMES_BEFORE_DATE, 0);
        netflixStatus.a(c);
        netflixStatus.c(true);
        return netflixStatus;
    }

    private String c(long j, Locale locale) {
        String e = ((InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class)).e(j, locale);
        C1044Mm.a("nf_bladerunner", "yearly warning msg: %s", e);
        return e;
    }

    public void e(InterfaceC4416beB interfaceC4416beB, InterfaceC4389bdb interfaceC4389bdb) {
        FetchLicenseRequest e = e(interfaceC4416beB.f());
        if (e != null) {
            C1044Mm.a("nf_bladerunner", "%d has pending LDL request, may PROMOTE.", interfaceC4416beB.f());
            synchronized (e) {
                if (!e.A() && !e.D()) {
                    C1044Mm.e("nf_bladerunner", "PROMOTE pending LDL request in the queue.");
                    e.e();
                    d(interfaceC4416beB, interfaceC4389bdb);
                }
            }
        }
    }

    public boolean e(C4395bdh c4395bdh, InterfaceC4389bdb interfaceC4389bdb) {
        InterfaceC4362bdA d = d(Long.valueOf(c4395bdh.b));
        if (d != null) {
            C1044Mm.a("nf_bladerunner", "%d has pending manifest prefetch request, may PROMOTE.", Long.valueOf(c4395bdh.b));
            synchronized (d) {
                if (!d.A() && !d.D()) {
                    C1044Mm.e("nf_bladerunner", "PROMOTE pending manifest prefetch request in the queue.");
                    d.e();
                    a(new C4395bdh[]{c4395bdh}, ManifestRequestFlavor.STANDARD, d.W(), null, false, false, interfaceC4389bdb, null);
                    d.U();
                    return true;
                }
            }
        }
        return false;
    }

    public void b(String str, C4395bdh c4395bdh, String str2, InterfaceC4389bdb interfaceC4389bdb, aHT aht) {
        Context d = AbstractApplicationC1040Mh.d();
        C4331bcW c4331bcW = new C4331bcW(d, this.e, ConnectivityUtils.e(d), C1613aHu.c(AbstractApplicationC1040Mh.d()));
        c4331bcW.d(str);
        C4401bdn c4401bdn = new C4401bdn(AbstractApplicationC1040Mh.d(), c(new C4395bdh[]{c4395bdh}, ManifestRequestFlavor.ADBREAK_HYDRATION, false, str2, true, (ManifestRequestParamBuilderBase) c4331bcW), interfaceC4389bdb);
        C1044Mm.e("nf_bladerunner", "sending adBreakHydration request");
        this.b.c(c4401bdn);
    }

    public InterfaceC1843aQh c() {
        return this.e.b.w();
    }

    public aOV e() {
        return this.e.b;
    }
}
