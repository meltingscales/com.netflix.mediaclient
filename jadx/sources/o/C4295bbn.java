package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import com.netflix.mediaclient.service.offline.log.OfflineErrorLogblob;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC4213baK;
import o.InterfaceC4208baF;
import o.InterfaceC4290bbi;

/* renamed from: o.bbn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4295bbn implements InterfaceC4290bbi, InterfaceC4282bba {
    private final Context a;
    private int b;
    private e d;
    private final HandlerThread e;
    private final String f;
    private final IClientLogging g;
    private final File h;
    private int j;
    private final InterfaceC4262bbG k;
    private final InterfaceC4300bbs l;
    private final C4260bbE m;
    private final InterfaceC4268bbM n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13566o;
    private final C4256bbA p;
    private C4306bby q;
    private final C9865xz r;
    private final InterfaceC4299bbr t;
    private CreateRequest.DownloadRequestType v;
    private final List<C4226baX> i = new ArrayList();
    private final b s = new b();
    private final C4288bbg c = new C4288bbg();

    private void a(boolean z) {
        this.f13566o = z;
    }

    @Override // o.InterfaceC4290bbi
    public String d() {
        return this.f;
    }

    @Override // o.InterfaceC4290bbi
    public InterfaceC4299bbr e() {
        return this.t;
    }

    @Override // o.InterfaceC4290bbi
    public InterfaceC4299bbr i() {
        return this.t;
    }

    @Override // o.InterfaceC5206buQ
    public C4284bbc aQ_() {
        return this.t.R();
    }

    public C4295bbn(Context context, InterfaceC4299bbr interfaceC4299bbr, C4256bbA c4256bbA, String str, C9865xz c9865xz, InterfaceC4268bbM interfaceC4268bbM, InterfaceC4262bbG interfaceC4262bbG, InterfaceC4300bbs interfaceC4300bbs, HandlerThread handlerThread, IClientLogging iClientLogging, C4260bbE c4260bbE) {
        this.a = context;
        this.t = interfaceC4299bbr;
        this.p = c4256bbA;
        this.f = str;
        this.h = new File(str);
        this.r = c9865xz;
        this.n = interfaceC4268bbM;
        this.k = interfaceC4262bbG;
        this.l = interfaceC4300bbs;
        this.d = new e(handlerThread.getLooper());
        this.e = handlerThread;
        this.g = iClientLogging;
        this.m = c4260bbE;
        if (interfaceC4299bbr.t() == DownloadState.InProgress) {
            C1044Mm.a("nf_offlinePlayable", "OfflinePlayableImpl constructor marking item stopped");
            interfaceC4299bbr.d(StopReason.WaitingToBeStarted);
        }
        if ((interfaceC4299bbr.t() != DownloadState.Stopped || interfaceC4299bbr.H() != StopReason.DownloadLimitRequiresManualResume) && aA_().c() != StatusCode.DL_ENCODES_DELETE_ON_REVOCATION && !K()) {
            C1044Mm.d("nf_offlinePlayable", "OfflinePlayableImpl checkAllDownloadablesExists false");
            interfaceC4299bbr.d(StopReason.WaitingToBeStarted);
            interfaceC4299bbr.Q();
        }
        N();
        if (interfaceC4268bbM == null || interfaceC4262bbG == null) {
            throw new RuntimeException("mOfflineManifestManager or mOfflineLicenseManager can't be null");
        }
        if (au_() != DownloadState.Complete) {
            this.q = new C4306bby(c4256bbA, interfaceC4299bbr);
            C4220baR.d.c(aH_(), this.q);
        }
    }

    private void U() {
        this.d.removeCallbacks(this.s);
    }

    private void T() {
        this.d.postDelayed(this.s, 0L);
    }

    private void W() {
        this.d.postDelayed(this.s, 2000L);
    }

    private void e(int i, Object obj) {
        e eVar = this.d;
        if (eVar != null) {
            eVar.obtainMessage(i, obj).sendToTarget();
        } else {
            C1044Mm.d("nf_offlinePlayable", "sendMessageToHandler after handler is gone");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
        d(new AbstractC4213baK.j(aH_(), y(), status.c()));
        boolean j = status.j();
        NetflixStatus netflixStatus = status;
        if (j) {
            Status e2 = e(interfaceC4525bgE);
            if (e2.j()) {
                if (S()) {
                    if (interfaceC4525bgE.at()) {
                        this.k.a(this.t, interfaceC4525bgE.R(), interfaceC4525bgE.U().a(), new InterfaceC4264bbI() { // from class: o.bbn.2
                            @Override // o.InterfaceC4264bbI
                            public void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status2) {
                                C4295bbn c4295bbn = C4295bbn.this;
                                c4295bbn.d(new AbstractC4213baK.e(c4295bbn.aH_(), C4295bbn.this.y(), status2.c(), true));
                                C4295bbn.this.e(str, offlineLicenseResponse, status2);
                            }
                        });
                        return;
                    }
                    d(new AbstractC4213baK.e(aH_(), y(), e2.c(), false));
                    Q();
                    return;
                }
                StatusCode statusCode = StatusCode.DL_NOT_ENOUGH_FREE_SPACE;
                NetflixStatus netflixStatus2 = new NetflixStatus(statusCode);
                netflixStatus2.b(M());
                OfflineErrorLogblob.a(this.g.e(), this.t, netflixStatus2);
                C1044Mm.d("nf_offlinePlayable", "handleFirstTimeManifestReceived not enough space");
                d(new AbstractC4213baK.g(aH_(), y(), statusCode));
                netflixStatus = netflixStatus2;
            } else {
                d(new AbstractC4213baK.g(aH_(), y(), StatusCode.INTERNAL_ERROR));
                netflixStatus = e2;
            }
        }
        this.l.c(this, netflixStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(InterfaceC4525bgE interfaceC4525bgE) {
        if (a(interfaceC4525bgE)) {
            if (S()) {
                X();
                this.l.a();
                return;
            }
            c(new NetflixStatus(StatusCode.DL_NOT_ENOUGH_FREE_SPACE), StopReason.NotEnoughSpace);
            return;
        }
        ab();
    }

    private void Q() {
        this.l.c(this, InterfaceC1078Nw.aJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        if (status.j()) {
            C4338bcd.a(offlineLicenseResponse, this.t);
            this.t.Q();
        } else {
            this.t.a(status);
        }
        this.l.c(this, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        c(new NetflixStatus(StatusCode.DL_URL_DOWNLOAD_DISK_IO_ERROR), StopReason.StorageError);
    }

    private void c(Status status, StopReason stopReason) {
        b(stopReason);
        a(status, stopReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(C4226baX c4226baX, Status status) {
        StopReason stopReason = StopReason.NetworkError;
        Y();
        if (ConnectivityUtils.n(this.a)) {
            C1044Mm.a("nf_offlinePlayable", "handleNetworkError networkConnected");
            if (this.b > 0) {
                return;
            }
        } else {
            stopReason = StopReason.NoNetworkConnectivity;
            C1044Mm.a("nf_offlinePlayable", "handleNetworkError noNetwork");
        }
        b(status, stopReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Status status) {
        b((StopReason) null);
        if (S()) {
            V();
        } else {
            c(new NetflixStatus(StatusCode.DL_NOT_ENOUGH_FREE_SPACE), StopReason.NotEnoughSpace);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Status status) {
        b(status, StopReason.GeoCheckError);
    }

    private void b(Status status, StopReason stopReason) {
        b(stopReason);
        e(status, stopReason);
    }

    private void ab() {
        NetflixStatus netflixStatus = new NetflixStatus(StatusCode.DL_ENCODES_ARE_NOT_AVAILABLE);
        StopReason stopReason = StopReason.EncodesAreNotAvailableAnyMore;
        b(stopReason);
        this.t.d(stopReason);
        this.t.a(netflixStatus);
        this.l.e(this, netflixStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(C4226baX c4226baX) {
        Y();
        int i = this.j;
        int i2 = this.b;
        C1044Mm.c("nf_offlinePlayable", " completeTrackCount=%d activeTrackCount=%d downloadableId=%s", Integer.valueOf(i), Integer.valueOf(i2), c4226baX.a());
        if (this.j == this.i.size()) {
            C1044Mm.a("nf_offlinePlayable", "all tracks downloaded");
            this.c.e();
            this.t.T();
            this.p.b();
            this.l.c(this);
            d(new AbstractC4213baK.g(aH_(), y(), StatusCode.OK));
        } else {
            C1044Mm.c("nf_offlinePlayable", "completeTrackCount=%d activeTrackCount=%d", Integer.valueOf(this.j), Integer.valueOf(this.b));
            if (!S()) {
                StatusCode statusCode = StatusCode.DL_NOT_ENOUGH_FREE_SPACE;
                c(new NetflixStatus(statusCode), StopReason.NotEnoughSpace);
                d(new AbstractC4213baK.g(aH_(), y(), statusCode));
                return;
            }
        }
        this.l.a();
        C4221baS.a(this.a);
    }

    @Override // o.InterfaceC4290bbi
    public void j() {
        C1044Mm.c("nf_offlinePlayable", "initialize playableId=%s", this.t.h());
        C8166dfJ.c();
        if (L()) {
            this.l.c(this, new NetflixStatus(StatusCode.DL_CANT_CREATE_VIEWABLE_DIRECTORY));
            return;
        }
        d(new AbstractC4213baK.h(aH_(), y()));
        InterfaceC4268bbM interfaceC4268bbM = this.n;
        InterfaceC4299bbr interfaceC4299bbr = this.t;
        interfaceC4268bbM.c(interfaceC4299bbr, C4338bcd.c(interfaceC4299bbr), this.f, DownloadVideoQuality.c(this.t.r()), new InterfaceC4271bbP() { // from class: o.bbn.8
            @Override // o.InterfaceC4271bbP
            public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                C4295bbn.this.a(interfaceC4525bgE, status);
            }
        });
    }

    @Override // o.InterfaceC4290bbi
    public void f() {
        C8166dfJ.c();
        C1044Mm.a("nf_offlinePlayable", "startDownload");
        this.c.a(t(), y());
        if (this.t.t() == DownloadState.Complete || this.t.t() == DownloadState.InProgress) {
            this.c.d(StopReason.WaitingToBeStarted);
        } else if (!a()) {
            C1044Mm.d("nf_offlinePlayable", "Download is not resume-able without user action");
            this.c.d(this.t.H());
        } else if (!C8106deC.c(this.f)) {
            String aH_ = aH_();
            String y = y();
            StatusCode statusCode = StatusCode.DL_VIEWABLE_DIRECTORY_MISSING;
            d(new AbstractC4213baK.g(aH_, y, statusCode));
            C4288bbg c4288bbg = this.c;
            StopReason stopReason = StopReason.StorageError;
            c4288bbg.d(stopReason);
            this.t.d(stopReason);
            this.l.d(this, new NetflixStatus(statusCode));
        } else {
            this.t.ab();
            if (!S()) {
                String aH_2 = aH_();
                String y2 = y();
                StatusCode statusCode2 = StatusCode.DL_NOT_ENOUGH_FREE_SPACE;
                d(new AbstractC4213baK.g(aH_2, y2, statusCode2));
                C4288bbg c4288bbg2 = this.c;
                StopReason stopReason2 = StopReason.NotEnoughSpace;
                c4288bbg2.d(stopReason2);
                c(new NetflixStatus(statusCode2), stopReason2);
                return;
            }
            b((StopReason) null);
            this.n.e(this.t, this.f, new InterfaceC4271bbP() { // from class: o.bbn.6
                @Override // o.InterfaceC4271bbP
                public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                    if (status.i() || C4338bcd.c(interfaceC4525bgE)) {
                        C4295bbn.this.V();
                    } else {
                        C4295bbn.this.d(interfaceC4525bgE);
                    }
                }
            });
        }
    }

    @Override // o.InterfaceC4290bbi
    public void d(StopReason stopReason) {
        C8166dfJ.c();
        if (stopReason == StopReason.PlayerStreaming) {
            return;
        }
        b(stopReason);
        this.t.d(stopReason);
    }

    @Override // o.InterfaceC4290bbi
    public Status e(boolean z) {
        C8166dfJ.c();
        return b(z);
    }

    @Override // o.InterfaceC4290bbi
    public void b(final InterfaceC4290bbi.a aVar) {
        this.n.e(this.t, this.f, new InterfaceC4271bbP() { // from class: o.bbn.7
            @Override // o.InterfaceC4271bbP
            public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                C4295bbn.this.b(interfaceC4525bgE, status, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC4525bgE interfaceC4525bgE, Status status, InterfaceC4290bbi.a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C4275bbT c4275bbT;
        Status status2;
        NetflixStatus netflixStatus;
        Status status3;
        if (status.j()) {
            try {
                c4275bbT = new C4275bbT(this.a, this.f, interfaceC4525bgE, C4338bcd.b(this.t), this.t.p(), C4338bcd.b(this.t.l()), C4338bcd.b(this.t.L()), C4338bcd.b(this.t.K()), C4338bcd.b(this.t.J()), this.t.i(), this.t.g(), C4338bcd.c(this.t));
                status2 = status;
            } catch (Exception e2) {
                int i5 = -1;
                try {
                    i = !new File(C4336bcb.c(this.f, aH_())).exists();
                    try {
                        i2 = 0;
                        i3 = 0;
                        for (DownloadablePersistentData downloadablePersistentData : this.t.l()) {
                            try {
                                File c2 = C4336bcb.c(this.f, downloadablePersistentData.mDownloadableId, DownloadableType.Audio);
                                if (!c2.exists()) {
                                    i3++;
                                } else if (C4269bbN.d(c2.getAbsolutePath())) {
                                    i2++;
                                    C1044Mm.e("nf_offlinePlayable", "failed audio track deleted=%b %s", Boolean.valueOf(c2.delete()), c2.getAbsolutePath());
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i3 = -1;
                                i4 = 0;
                                C1044Mm.c("nf_offlinePlayable", "exception", e);
                                String str = "OfflinePlayableManifestImpl DL_MANIFEST_DATA_MISSING oxid=" + y() + " manifestCount=" + i + " audioCounts=" + i3 + " videoCounts=" + i5 + " failedAudio=" + i2 + " failedVideo=" + i4 + " allExists=" + K();
                                C1044Mm.e("nf_offlinePlayable", str, e2);
                                Throwable th = new Throwable(str, e2);
                                NetflixStatus netflixStatus2 = new NetflixStatus(StatusCode.DL_MANIFEST_DATA_MISSING);
                                this.t.d(StopReason.WaitingToBeStarted);
                                netflixStatus2.b(th);
                                InterfaceC1598aHf.a(new C1596aHd().d(th).b(false));
                                netflixStatus = netflixStatus2;
                                c4275bbT = null;
                                status2 = netflixStatus;
                                aVar.c(c4275bbT, y(), status2);
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i2 = 0;
                        i3 = -1;
                        i4 = 0;
                        C1044Mm.c("nf_offlinePlayable", "exception", e);
                        String str2 = "OfflinePlayableManifestImpl DL_MANIFEST_DATA_MISSING oxid=" + y() + " manifestCount=" + i + " audioCounts=" + i3 + " videoCounts=" + i5 + " failedAudio=" + i2 + " failedVideo=" + i4 + " allExists=" + K();
                        C1044Mm.e("nf_offlinePlayable", str2, e2);
                        Throwable th2 = new Throwable(str2, e2);
                        NetflixStatus netflixStatus22 = new NetflixStatus(StatusCode.DL_MANIFEST_DATA_MISSING);
                        this.t.d(StopReason.WaitingToBeStarted);
                        netflixStatus22.b(th2);
                        InterfaceC1598aHf.a(new C1596aHd().d(th2).b(false));
                        netflixStatus = netflixStatus22;
                        c4275bbT = null;
                        status2 = netflixStatus;
                        aVar.c(c4275bbT, y(), status2);
                    }
                } catch (Exception e5) {
                    e = e5;
                    i = -1;
                }
                try {
                    i4 = 0;
                    int i6 = 0;
                    for (DownloadablePersistentData downloadablePersistentData2 : this.t.L()) {
                        try {
                            File c3 = C4336bcb.c(this.f, downloadablePersistentData2.mDownloadableId, DownloadableType.Video);
                            if (!c3.exists()) {
                                i6++;
                            } else if (C4269bbN.d(c3.getAbsolutePath())) {
                                i4++;
                                C1044Mm.e("nf_offlinePlayable", "failed video track deleted=%b %s", Boolean.valueOf(c3.delete()), c3.getAbsolutePath());
                            }
                        } catch (Exception e6) {
                            e = e6;
                            C1044Mm.c("nf_offlinePlayable", "exception", e);
                            String str22 = "OfflinePlayableManifestImpl DL_MANIFEST_DATA_MISSING oxid=" + y() + " manifestCount=" + i + " audioCounts=" + i3 + " videoCounts=" + i5 + " failedAudio=" + i2 + " failedVideo=" + i4 + " allExists=" + K();
                            C1044Mm.e("nf_offlinePlayable", str22, e2);
                            Throwable th22 = new Throwable(str22, e2);
                            NetflixStatus netflixStatus222 = new NetflixStatus(StatusCode.DL_MANIFEST_DATA_MISSING);
                            this.t.d(StopReason.WaitingToBeStarted);
                            netflixStatus222.b(th22);
                            InterfaceC1598aHf.a(new C1596aHd().d(th22).b(false));
                            netflixStatus = netflixStatus222;
                            c4275bbT = null;
                            status2 = netflixStatus;
                            aVar.c(c4275bbT, y(), status2);
                        }
                    }
                    i5 = i6;
                } catch (Exception e7) {
                    e = e7;
                    i4 = 0;
                    C1044Mm.c("nf_offlinePlayable", "exception", e);
                    String str222 = "OfflinePlayableManifestImpl DL_MANIFEST_DATA_MISSING oxid=" + y() + " manifestCount=" + i + " audioCounts=" + i3 + " videoCounts=" + i5 + " failedAudio=" + i2 + " failedVideo=" + i4 + " allExists=" + K();
                    C1044Mm.e("nf_offlinePlayable", str222, e2);
                    Throwable th222 = new Throwable(str222, e2);
                    NetflixStatus netflixStatus2222 = new NetflixStatus(StatusCode.DL_MANIFEST_DATA_MISSING);
                    this.t.d(StopReason.WaitingToBeStarted);
                    netflixStatus2222.b(th222);
                    InterfaceC1598aHf.a(new C1596aHd().d(th222).b(false));
                    netflixStatus = netflixStatus2222;
                    c4275bbT = null;
                    status2 = netflixStatus;
                    aVar.c(c4275bbT, y(), status2);
                }
                String str2222 = "OfflinePlayableManifestImpl DL_MANIFEST_DATA_MISSING oxid=" + y() + " manifestCount=" + i + " audioCounts=" + i3 + " videoCounts=" + i5 + " failedAudio=" + i2 + " failedVideo=" + i4 + " allExists=" + K();
                C1044Mm.e("nf_offlinePlayable", str2222, e2);
                Throwable th2222 = new Throwable(str2222, e2);
                NetflixStatus netflixStatus22222 = new NetflixStatus(StatusCode.DL_MANIFEST_DATA_MISSING);
                this.t.d(StopReason.WaitingToBeStarted);
                netflixStatus22222.b(th2222);
                InterfaceC1598aHf.a(new C1596aHd().d(th2222).b(false));
                netflixStatus = netflixStatus22222;
            }
            aVar.c(c4275bbT, y(), status2);
        }
        if (status.c().getValue() == StatusCode.DL_MANIFEST_NOT_FOUND_IN_CACHE.getValue()) {
            status3 = status;
            this.t.a(status3);
            this.t.d(StopReason.ManifestError);
        } else {
            status3 = status;
        }
        netflixStatus = status3;
        c4275bbT = null;
        status2 = netflixStatus;
        aVar.c(c4275bbT, y(), status2);
    }

    @Override // o.InterfaceC4290bbi
    public void b(final InterfaceC4290bbi.c cVar) {
        if (this.t.I()) {
            C1044Mm.a("nf_offlinePlayable", "attempt auto refresh playableId=%s", aH_());
            e(!AbstractApplicationC1040Mh.getInstance().n() ? ConfigFastPropertyFeatureControlConfig.Companion.b() : false, new InterfaceC4208baF.d() { // from class: o.bbn.9
                @Override // o.InterfaceC4208baF.d
                public void a(Status status) {
                    InterfaceC4290bbi.c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.c(C4295bbn.this);
                    }
                }
            });
            return;
        }
        C1044Mm.a("nf_offlinePlayable", "does not allow auto refresh playableId=%s", aH_());
        if (cVar != null) {
            cVar.c(this);
        }
    }

    @Override // o.InterfaceC4290bbi
    public void b() {
        e eVar = this.d;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
            this.d = null;
        }
        this.n.d(aH_());
    }

    @Override // o.InterfaceC5206buQ
    public String aH_() {
        return this.t.h();
    }

    @Override // o.InterfaceC5206buQ
    public int aN_() {
        return this.t.n();
    }

    @Override // o.InterfaceC5206buQ
    public String y() {
        return this.t.i();
    }

    @Override // o.InterfaceC5206buQ
    public CreateRequest.DownloadRequestType s() {
        if (this.v == null) {
            this.v = CreateRequest.DownloadRequestType.a(this.t.f());
        }
        return this.v;
    }

    @Override // o.InterfaceC5206buQ
    public String t() {
        return this.t.g();
    }

    @Override // o.InterfaceC5206buQ
    public int l() {
        return this.t.c();
    }

    @Override // o.InterfaceC5206buQ
    public int at_() {
        return this.t.e();
    }

    @Override // o.InterfaceC5206buQ
    public String n() {
        return this.t.b();
    }

    @Override // o.InterfaceC5206buQ
    public long ar_() {
        return this.t.a();
    }

    @Override // o.InterfaceC5206buQ
    public int as_() {
        return this.t.d();
    }

    @Override // o.InterfaceC5206buQ
    public int aD_() {
        return this.p.e();
    }

    @Override // o.InterfaceC5206buQ
    public WatchState C() {
        boolean equals = this.t.t().equals(DownloadState.Complete);
        if (!equals) {
            equals = ((InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class)).a(aH_());
        }
        if (equals) {
            if (this.t.P() && ConnectivityUtils.l(this.a)) {
                return WatchState.GEO_BLOCKED;
            }
            WatchState watchState = WatchState.WATCHING_ALLOWED;
            if (this.t.u() == null) {
                return watchState;
            }
            if (!C4221baS.a(this.t)) {
                return WatchState.VIEW_WINDOW_EXPIRED;
            }
            if (C4221baS.d(this.t)) {
                return WatchState.LICENSE_EXPIRED;
            }
            long C = this.t.C();
            if (!C4221baS.c(this.a, this.t)) {
                if (this.t.D() && this.t.C() > 0) {
                    return WatchState.PLAY_WINDOW_EXPIRED_BUT_RENEWABLE;
                }
                return WatchState.PLAY_WINDOW_EXPIRED_FINAL;
            } else if (this.t.H().a()) {
                return WatchState.UNKNOWN;
            } else {
                long C2 = this.t.C();
                if (!this.t.F() || C2 == C) {
                    return watchState;
                }
                this.d.post(new Runnable() { // from class: o.bbn.10
                    @Override // java.lang.Runnable
                    public void run() {
                        C4295bbn.this.l.a();
                    }
                });
                return watchState;
            }
        }
        return WatchState.NOT_WATCHABLE_DUE_TO_NOT_ENOUGH_DATA;
    }

    @Override // o.InterfaceC5206buQ
    public DownloadState au_() {
        return this.t.t();
    }

    @Override // o.InterfaceC5206buQ
    public StopReason aM_() {
        return this.t.H();
    }

    @Override // o.InterfaceC5206buQ
    public long h() {
        if (au_() == DownloadState.Complete) {
            return this.p.e(this.h);
        }
        return this.p.c();
    }

    @Override // o.InterfaceC5206buQ
    public long aP_() {
        if (au_() == DownloadState.Complete) {
            return this.p.e(this.h);
        }
        return this.p.a();
    }

    @Override // o.InterfaceC5206buQ
    public String u() {
        return this.t.j();
    }

    @Override // o.InterfaceC5206buQ
    public long ax_() {
        if (this.t.F()) {
            long B = this.t.B();
            long C = this.t.C();
            long z = this.t.z();
            if (B <= 0 || C > 0 || z <= 0) {
                return -1L;
            }
            return z - (System.currentTimeMillis() - B);
        }
        return -1L;
    }

    @Override // o.InterfaceC5206buQ
    public long A() {
        return this.t.M();
    }

    public static boolean c(int i) {
        return i == PlayContextImp.q || i == PlayContextImp.a;
    }

    @Override // o.InterfaceC5206buQ
    public boolean aZ_() {
        return c(l());
    }

    @Override // o.InterfaceC5206buQ
    public boolean aT_() {
        return s() == CreateRequest.DownloadRequestType.DownloadForYou;
    }

    @Override // o.InterfaceC5206buQ
    public boolean ba_() {
        return l() == PlayContextImp.a;
    }

    @Override // o.InterfaceC5206buQ
    public int bc_() {
        return this.t.m();
    }

    @Override // o.InterfaceC5206buQ
    public boolean b(int i) {
        if (au_() == DownloadState.Complete) {
            return true;
        }
        return this.p.a(i);
    }

    @Override // o.InterfaceC5206buQ
    public Status aA_() {
        Status y = this.t.y();
        if (y == null) {
            if (this.t.w() != 0) {
                StatusCode statusCodeByValue = StatusCode.getStatusCodeByValue(this.t.w());
                if (statusCodeByValue == null) {
                    statusCodeByValue = StatusCode.UNKNOWN;
                }
                NetflixStatus netflixStatus = new NetflixStatus(statusCodeByValue);
                if (this.t.x() != null) {
                    netflixStatus.a(this.t.x());
                    netflixStatus.c(true);
                }
                y = netflixStatus;
            } else {
                y = InterfaceC1078Nw.aJ;
            }
            this.t.a(y);
        }
        return y;
    }

    @Override // o.InterfaceC4290bbi
    public boolean a() {
        return this.t.H().d();
    }

    @Override // o.InterfaceC4290bbi
    public void g() {
        if (!C4221baS.e(this.a)) {
            if (this.t.B() <= 0) {
                synchronized (this.t) {
                    this.t.ac();
                }
                if (this.t.F()) {
                    this.l.a();
                    return;
                }
                return;
            }
            return;
        }
        C1044Mm.a("nf_offlinePlayable", "notifyOfflinePlayStarted not starting playWindow");
    }

    @Override // o.InterfaceC4282bba
    public void a(C4226baX c4226baX) {
        C1044Mm.c("nf_offlinePlayable", "onCdnUrlDownloadSessionEnd downloadableId=%s", c4226baX.a());
        e(4, new c(InterfaceC1078Nw.aJ, c4226baX));
    }

    @Override // o.InterfaceC4282bba
    public void c(C4226baX c4226baX, Status status) {
        e(2, new c(status, c4226baX));
    }

    @Override // o.InterfaceC4282bba
    public void c(C4226baX c4226baX) {
        C1044Mm.a("nf_offlinePlayable", "onUrlDownloadDiskIOError");
        e(1, new c(new NetflixStatus(StatusCode.DL_URL_DOWNLOAD_DISK_IO_ERROR), c4226baX));
    }

    @Override // o.InterfaceC4282bba
    public void b(C4226baX c4226baX, Status status) {
        C1044Mm.c("nf_offlinePlayable", "onCdnUrlExpiredOrMoved downloadableId=%s", c4226baX.a());
        e(3, new c(status, c4226baX));
    }

    @Override // o.InterfaceC4282bba
    public void a(C4226baX c4226baX, Status status) {
        C1044Mm.c("nf_offlinePlayable", "onCdnUrlExpiredOrMoved downloadableId=%s", c4226baX.a());
        e(5, new c(status, c4226baX));
    }

    private void Y() {
        this.j = 0;
        this.b = 0;
        for (C4226baX c4226baX : this.i) {
            if (c4226baX.e()) {
                this.j++;
            }
            if (c4226baX.b()) {
                this.b++;
            }
        }
    }

    private C4226baX a(DownloadablePersistentData downloadablePersistentData, InterfaceC4285bbd interfaceC4285bbd, String str) {
        return new C4226baX(this.a, this.e.getLooper(), downloadablePersistentData, interfaceC4285bbd, a(downloadablePersistentData, interfaceC4285bbd.a()), C4336bcb.c(this.f, downloadablePersistentData.mDownloadableId, interfaceC4285bbd.a()), this.r, C4283bbb.b(this.t, interfaceC4285bbd, str), this.g, this);
    }

    private void X() {
        C1044Mm.a("nf_offlinePlayable", "startCdnUrlDownloaders");
        boolean z = false;
        for (C4226baX c4226baX : this.i) {
            if (!c4226baX.e()) {
                c4226baX.f();
                z = true;
            } else {
                C1044Mm.c("nf_offlinePlayable", "download was complete downloadableId=%s", c4226baX.a());
            }
        }
        if (z) {
            U();
            this.t.ab();
            T();
            return;
        }
        C1044Mm.d("nf_offlinePlayable", "startCdnUrlDownloaders not running progress watcher.");
    }

    private boolean a(InterfaceC4525bgE interfaceC4525bgE) {
        C1044Mm.a("nf_offlinePlayable", "createCdnUrlDownloadersFromUpdatedManifest");
        List<C4222baT> c2 = C4286bbe.c(interfaceC4525bgE, C4338bcd.b(this.t.l()));
        List<C4261bbF> b2 = C4286bbe.b(interfaceC4525bgE, C4338bcd.b(this.t.L()));
        List<C4307bbz> a = C4286bbe.a(interfaceC4525bgE, C4338bcd.b(this.t.K()));
        List<C4304bbw> d = C4286bbe.d(interfaceC4525bgE, C4338bcd.b(this.t.J()));
        if (C4338bcd.b(this.t, c2, b2, a, d)) {
            this.i.clear();
            String ac = interfaceC4525bgE.ac();
            for (DownloadablePersistentData downloadablePersistentData : this.t.l()) {
                d(c2, downloadablePersistentData, this.i, ac);
            }
            for (DownloadablePersistentData downloadablePersistentData2 : this.t.L()) {
                d(b2, downloadablePersistentData2, this.i, ac);
            }
            for (DownloadablePersistentData downloadablePersistentData3 : this.t.K()) {
                d(a, downloadablePersistentData3, this.i, ac);
            }
            for (DownloadablePersistentData downloadablePersistentData4 : this.t.J()) {
                d(d, downloadablePersistentData4, this.i, ac);
            }
            N();
            return true;
        }
        return false;
    }

    private Status e(InterfaceC4525bgE interfaceC4525bgE) {
        C1044Mm.a("nf_offlinePlayable", "createFreshCdnUrlDownloadersFromManifest");
        List<C4222baT> c2 = C4286bbe.c(interfaceC4525bgE, null);
        List<C4261bbF> b2 = C4286bbe.b(interfaceC4525bgE, null);
        List<C4307bbz> a = C4286bbe.a(interfaceC4525bgE, null);
        List<C4304bbw> d = C4286bbe.d(interfaceC4525bgE, null);
        this.i.clear();
        String ac = interfaceC4525bgE.ac();
        this.t.l().clear();
        for (C4222baT c4222baT : c2) {
            a(c4222baT, this.i, this.t.l(), ac);
        }
        this.t.L().clear();
        for (C4261bbF c4261bbF : b2) {
            a(c4261bbF, this.i, this.t.L(), ac);
        }
        this.t.K().clear();
        for (C4307bbz c4307bbz : a) {
            a(c4307bbz, this.i, this.t.K(), ac);
        }
        this.t.J().clear();
        for (C4304bbw c4304bbw : d) {
            a(c4304bbw, this.i, this.t.J(), ac);
        }
        this.t.e(C4526bgF.a(interfaceC4525bgE));
        N();
        return R();
    }

    private void a(InterfaceC4285bbd interfaceC4285bbd, List<C4226baX> list, List<DownloadablePersistentData> list2, String str) {
        if (interfaceC4285bbd != null) {
            DownloadablePersistentData downloadablePersistentData = new DownloadablePersistentData(interfaceC4285bbd.e(), interfaceC4285bbd.c());
            list.add(a(downloadablePersistentData, interfaceC4285bbd, str));
            list2.add(downloadablePersistentData);
        }
    }

    private void b(StopReason stopReason) {
        C8166dfJ.c();
        if (stopReason != null) {
            if (stopReason == StopReason.StoppedFromAgentAPI) {
                this.c.c();
            } else {
                this.c.d(stopReason);
            }
        }
        for (C4226baX c4226baX : this.i) {
            c4226baX.i();
        }
        this.d.removeCallbacksAndMessages(null);
    }

    private Status b(boolean z) {
        C8166dfJ.c();
        b(StopReason.StoppedFromAgentAPI);
        OfflineErrorLogblob.a(this.g.e(), this.t, "Delete");
        this.n.b(aH_());
        this.t.W();
        if (J() && !z) {
            c(this.k, this.t, (InterfaceC4290bbi.d) null, this.l);
        }
        if (C4338bcd.d(this.f)) {
            return InterfaceC1078Nw.aJ;
        }
        InterfaceC1598aHf.a("deletePlayableDirectory failed:" + this.f);
        return new NetflixStatus(StatusCode.DL_CANT_DELETE_PLAYABLE_DIRECTORY);
    }

    private boolean S() {
        long aP_ = (aP_() - h()) + 25000000;
        long a = C8054ddD.a(this.h);
        if (aP_ > a) {
            C1044Mm.e("nf_offlinePlayable", "hasEnoughFreeSpace freeSpaceNeeded=%d freeSpaceOnFileSystem=%d", Long.valueOf(aP_), Long.valueOf(a));
            return false;
        }
        return true;
    }

    private String M() {
        long aP_ = aP_();
        long h = h();
        long a = C8054ddD.a(this.h);
        return "freeSpaceOnFileSystem=" + a + " freeSpaceNeeded=" + ((aP_ - h) + 25000000);
    }

    private Status R() {
        if (this.i.size() > 0) {
            return InterfaceC1078Nw.aJ;
        }
        return new NetflixStatus(StatusCode.DL_MANIFEST_NO_TRACKS_TO_DOWNLOAD);
    }

    private void e(Status status, StopReason stopReason) {
        if (au_() == DownloadState.Stopped) {
            C1044Mm.a("nf_offlinePlayable", "sendNetworkError already in stopped state.");
            return;
        }
        C1044Mm.a("nf_offlinePlayable", "sendNetworkError sending error to mOfflinePlayableListener.");
        this.t.d(stopReason);
        this.l.b(this, status);
    }

    private void a(Status status, StopReason stopReason) {
        if (25000000 > C8054ddD.a(this.h)) {
            C1044Mm.d("nf_offlinePlayable", "sendStorageError overriding error to not enough space");
            status = new NetflixStatus(StatusCode.DL_NOT_ENOUGH_FREE_SPACE);
            stopReason = StopReason.NotEnoughSpace;
        }
        if (au_() == DownloadState.Stopped) {
            this.t.d(stopReason);
            C1044Mm.a("nf_offlinePlayable", "sendStorageError already in stopped state.");
            return;
        }
        this.t.d(stopReason);
        this.l.d(this, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        C1044Mm.a("nf_offlinePlayable", "refreshManifestFromServerAndContinue");
        List<DownloadablePersistentData> L = this.t.L();
        String str = L.size() > 0 ? L.get(0).mDownloadableId : null;
        InterfaceC4268bbM interfaceC4268bbM = this.n;
        InterfaceC4299bbr interfaceC4299bbr = this.t;
        interfaceC4268bbM.e(interfaceC4299bbr, this.f, str, DownloadVideoQuality.c(interfaceC4299bbr.r()), new InterfaceC4271bbP() { // from class: o.bbn.15
            @Override // o.InterfaceC4271bbP
            public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                C4295bbn.this.b(interfaceC4525bgE, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC4525bgE interfaceC4525bgE, Status status) {
        if (status.j()) {
            d(interfaceC4525bgE);
            return;
        }
        b(status, status.g() ? StopReason.NetworkError : StopReason.ManifestError);
        this.t.a(status);
    }

    private boolean K() {
        boolean z = true;
        for (DownloadablePersistentData downloadablePersistentData : this.t.l()) {
            File c2 = C4336bcb.c(this.f, downloadablePersistentData.mDownloadableId, DownloadableType.Audio);
            if (!c2.exists() || c2.length() == 0) {
                downloadablePersistentData.mIsComplete = false;
                z = false;
            } else if (c(downloadablePersistentData, c2)) {
                C1044Mm.d("nf_offlinePlayable", "audio downloadable marking complete.");
                downloadablePersistentData.mIsComplete = true;
            }
        }
        for (DownloadablePersistentData downloadablePersistentData2 : this.t.L()) {
            File c3 = C4336bcb.c(this.f, downloadablePersistentData2.mDownloadableId, DownloadableType.Video);
            if (!c3.exists() || c3.length() == 0) {
                downloadablePersistentData2.mIsComplete = false;
                z = false;
            } else if (c(downloadablePersistentData2, c3)) {
                C1044Mm.d("nf_offlinePlayable", "video downloadable marking complete.");
                downloadablePersistentData2.mIsComplete = true;
            }
        }
        for (DownloadablePersistentData downloadablePersistentData3 : this.t.K()) {
            File c4 = C4336bcb.c(this.f, downloadablePersistentData3.mDownloadableId, DownloadableType.Subtitle);
            if (!c4.exists() || c4.length() == 0) {
                downloadablePersistentData3.mIsComplete = false;
                z = false;
            } else if (c(downloadablePersistentData3, c4)) {
                C1044Mm.d("nf_offlinePlayable", "subtitle downloadable marking complete.");
                downloadablePersistentData3.mIsComplete = true;
            }
        }
        for (DownloadablePersistentData downloadablePersistentData4 : this.t.J()) {
            File c5 = C4336bcb.c(this.f, downloadablePersistentData4.mDownloadableId, DownloadableType.TrickPlay);
            if (!c5.exists() || c5.length() == 0) {
                downloadablePersistentData4.mIsComplete = false;
                z = false;
            } else if (c(downloadablePersistentData4, c5)) {
                C1044Mm.d("nf_offlinePlayable", "trickplay downloadable marking complete.");
                downloadablePersistentData4.mIsComplete = true;
            }
        }
        return z;
    }

    private void N() {
        for (DownloadablePersistentData downloadablePersistentData : this.t.l()) {
            a(downloadablePersistentData, DownloadableType.Audio);
        }
        for (DownloadablePersistentData downloadablePersistentData2 : this.t.L()) {
            a(downloadablePersistentData2, DownloadableType.Video);
        }
        for (DownloadablePersistentData downloadablePersistentData3 : this.t.K()) {
            a(downloadablePersistentData3, DownloadableType.Subtitle);
        }
        for (DownloadablePersistentData downloadablePersistentData4 : this.t.J()) {
            a(downloadablePersistentData4, DownloadableType.TrickPlay);
        }
        this.p.d();
    }

    private C4287bbf a(DownloadablePersistentData downloadablePersistentData, DownloadableType downloadableType) {
        C4287bbf c4287bbf = this.p.e.get(downloadablePersistentData.mDownloadableId);
        if (c4287bbf == null) {
            c4287bbf = new C4287bbf();
        }
        long length = C4336bcb.c(this.f, downloadablePersistentData.mDownloadableId, downloadableType).length();
        c4287bbf.d = length;
        boolean z = downloadablePersistentData.mIsComplete;
        if (z) {
            c4287bbf.b = length;
        } else {
            c4287bbf.b = downloadablePersistentData.mSizeOfDownloadable;
        }
        C1044Mm.e("nf_offlinePlayable", "getProgressInfoForDownloadable complete=%b downloadableId=%s  mBytesOnTheDisk=%d mTotalBytesToDownload=%d", Boolean.valueOf(z), downloadablePersistentData.mDownloadableId, Long.valueOf(c4287bbf.d), Long.valueOf(c4287bbf.b));
        this.p.e.put(downloadablePersistentData.mDownloadableId, c4287bbf);
        return c4287bbf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bbn$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295bbn.this.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (AnonymousClass3.c[this.t.t().ordinal()] == 1) {
            this.p.d();
            W();
            this.l.d(this);
            C4220baR.d.a(aH_());
        }
        C1044Mm.c("nf_offlinePlayable", "ProgressWatchRunnable playableId=%s PlayablePercentageProgress=%d", aH_(), Integer.valueOf(this.p.e()));
    }

    private boolean L() {
        return !C8106deC.b(this.f);
    }

    /* renamed from: o.bbn$c */
    /* loaded from: classes3.dex */
    class c {
        final C4226baX b;
        final Status d;

        c(Status status, C4226baX c4226baX) {
            this.d = status;
            this.b = c4226baX;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bbn$e */
    /* loaded from: classes3.dex */
    public class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1044Mm.c("nf_offlinePlayable", "handleMessage cmd=%d", Integer.valueOf(message.what));
            c cVar = (c) message.obj;
            StatusCode statusCode = StatusCode.OK;
            int i = message.what;
            if (i == 1) {
                C4295bbn.this.O();
                statusCode = StatusCode.DL_URL_DOWNLOAD_DISK_IO_ERROR;
            } else if (i == 2) {
                C4295bbn.this.d(cVar.b, cVar.d);
                statusCode = StatusCode.NETWORK_ERROR;
            } else if (i == 3) {
                C4295bbn.this.c(cVar.d);
            } else if (i == 4) {
                C4295bbn.this.d(cVar.b);
            } else if (i == 5) {
                C4295bbn.this.b(cVar.d);
                statusCode = StatusCode.DL_ALL_CDN_URLS_FAILED;
            }
            if (message.what != 4) {
                C4295bbn c4295bbn = C4295bbn.this;
                c4295bbn.d(new AbstractC4213baK.g(c4295bbn.aH_(), C4295bbn.this.y(), statusCode));
            }
        }
    }

    private void d(List<? extends InterfaceC4285bbd> list, DownloadablePersistentData downloadablePersistentData, List<C4226baX> list2, String str) {
        InterfaceC4285bbd e2 = e(list, downloadablePersistentData.mDownloadableId);
        if (e2 != null) {
            list2.add(a(downloadablePersistentData, e2, str));
        }
    }

    private InterfaceC4285bbd e(List<? extends InterfaceC4285bbd> list, String str) {
        for (InterfaceC4285bbd interfaceC4285bbd : list) {
            if (interfaceC4285bbd.e().equals(str)) {
                return interfaceC4285bbd;
            }
        }
        return null;
    }

    private boolean c(DownloadablePersistentData downloadablePersistentData, File file) {
        return !downloadablePersistentData.mIsComplete && file.length() > 0 && file.length() == downloadablePersistentData.mSizeOfDownloadable;
    }

    @Override // o.InterfaceC4290bbi
    public void e(final boolean z, final InterfaceC4208baF.d dVar) {
        if (C4221baS.c(this.t) && J()) {
            C1044Mm.c("nf_offlinePlayable", "refreshLicenseIfNeeded playableId=%s", aH_());
            this.n.e(this.t, this.f, new InterfaceC4271bbP() { // from class: o.bbn.12
                @Override // o.InterfaceC4271bbP
                public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                    if (status.j()) {
                        C4295bbn.this.b(z, interfaceC4525bgE, dVar);
                        return;
                    }
                    InterfaceC4208baF.d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.a(status);
                    }
                }
            });
            return;
        }
        C1044Mm.a("nf_offlinePlayable", "refreshLicenseIfNeeded not refreshing");
        if (dVar != null) {
            dVar.a(InterfaceC1078Nw.aJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bbn$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ClientActionFromLase.values().length];
            b = iArr;
            try {
                iArr[ClientActionFromLase.NO_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ClientActionFromLase.ACQUIRE_NEW_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ClientActionFromLase.DELETE_LICENSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ClientActionFromLase.MARK_PLAYABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ClientActionFromLase.DELETE_CONTENT_ON_REVOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[DownloadState.values().length];
            c = iArr2;
            try {
                iArr2[DownloadState.InProgress.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // o.InterfaceC4290bbi
    public void b(ClientActionFromLase clientActionFromLase) {
        if (AnonymousClass3.b[clientActionFromLase.ordinal()] != 5) {
            return;
        }
        NetflixStatus netflixStatus = new NetflixStatus(StatusCode.DL_ENCODES_DELETE_ON_REVOCATION);
        boolean a = C4338bcd.a(this.f, this.t);
        this.t.a(netflixStatus);
        this.t.d(StopReason.EncodesRevoked);
        C1044Mm.c("nf_offlinePlayable", "onLicenseSync encodes deleted=%b", Boolean.valueOf(a));
    }

    @Override // o.InterfaceC4290bbi
    public void d(final InterfaceC4208baF.c cVar) {
        this.n.e(this.t, this.f, new InterfaceC4271bbP() { // from class: o.bbn.11
            @Override // o.InterfaceC4271bbP
            public void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                cVar.a(C4295bbn.this.aH_(), status.j() ? new C4216baN(interfaceC4525bgE.U(), C4295bbn.this.y(), C4295bbn.this.t(), C4338bcd.c(C4295bbn.this.t)) : null, status);
            }
        });
    }

    @Override // o.InterfaceC5206buQ
    public boolean aW_() {
        return this.t.S();
    }

    @Override // o.InterfaceC5206buQ
    public boolean bb_() {
        if (this.t.O()) {
            return false;
        }
        return s().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, final InterfaceC4525bgE interfaceC4525bgE, final InterfaceC4208baF.d dVar) {
        if (J() && C4221baS.c(this.t)) {
            C1044Mm.a("nf_offlinePlayable", "refreshing license for %s", aH_());
            a(true);
            this.k.c(z, this.t, interfaceC4525bgE.R(), C4338bcd.b(this.t), this.t.k(), this.t.E(), new InterfaceC4264bbI() { // from class: o.bbn.1
                @Override // o.InterfaceC4264bbI
                public void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
                    if (status.c() == StatusCode.OFFLINE_LICENSE_FETCH_NEW) {
                        C4295bbn.this.d(interfaceC4525bgE, dVar);
                        return;
                    }
                    if (status.c() == StatusCode.DL_ENCODES_DELETE_ON_REVOCATION) {
                        boolean a = C4338bcd.a(C4295bbn.this.f, C4295bbn.this.t);
                        C4295bbn.this.t.d(StopReason.EncodesRevoked);
                        C1044Mm.c("nf_offlinePlayable", "refreshLicense DL_ENCODES_DELETE_ON_REVOCATION deleted encodes=%b", Boolean.valueOf(a));
                    }
                    C4295bbn.this.c(offlineLicenseResponse, status, dVar);
                }
            });
        } else if (dVar != null) {
            dVar.a(InterfaceC1078Nw.aJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(OfflineLicenseResponse offlineLicenseResponse, Status status, InterfaceC4208baF.d dVar) {
        if (status.j()) {
            C4338bcd.a(offlineLicenseResponse, this.t);
            this.t.Q();
        } else {
            C1044Mm.c("nf_offlinePlayable", "refreshLicense failed %s", status);
            if (C4221baS.d(this.t)) {
                this.t.a(status);
            }
        }
        a(false);
        this.l.a();
        if (dVar != null) {
            dVar.a(status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(InterfaceC4525bgE interfaceC4525bgE, final InterfaceC4208baF.d dVar) {
        C1044Mm.e("nf_offlinePlayable", "Fetching fresh license on refresh failure");
        this.k.a(this.t, interfaceC4525bgE.R(), interfaceC4525bgE.U().a(), new InterfaceC4264bbI() { // from class: o.bbn.5
            @Override // o.InterfaceC4264bbI
            public void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
                C1044Mm.c("nf_offlinePlayable", "onOfflineLicenseRequestDone status= %s", status);
                C4295bbn.this.c(offlineLicenseResponse, status, dVar);
            }
        });
    }

    public static void c(InterfaceC4262bbG interfaceC4262bbG, final InterfaceC4299bbr interfaceC4299bbr, final InterfaceC4290bbi.d dVar, final InterfaceC4300bbs interfaceC4300bbs) {
        byte[] b2 = C4338bcd.b(interfaceC4299bbr);
        if (b2 != null && b2.length != 0) {
            interfaceC4262bbG.a(interfaceC4299bbr, b2, interfaceC4299bbr.q() == DownloadState.Complete, interfaceC4299bbr.s(), new InterfaceC4264bbI() { // from class: o.bbn.4
                @Override // o.InterfaceC4264bbI
                public void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
                    InterfaceC4299bbr.this.V();
                    InterfaceC4290bbi.d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.b(InterfaceC4299bbr.this);
                    }
                    InterfaceC4300bbs interfaceC4300bbs2 = interfaceC4300bbs;
                    if (interfaceC4300bbs2 != null) {
                        interfaceC4300bbs2.d(InterfaceC4299bbr.this);
                    }
                }
            });
        } else if (dVar != null) {
            dVar.b(interfaceC4299bbr);
        }
    }

    private boolean J() {
        return !this.f13566o && ConnectivityUtils.l(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AbstractC4213baK abstractC4213baK) {
        this.m.c(abstractC4213baK);
    }
}
