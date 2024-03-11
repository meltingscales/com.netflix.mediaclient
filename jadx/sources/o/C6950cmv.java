package o;

import android.annotation.SuppressLint;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.action.AddToPlaylist;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$addVideoToMyList$1;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$addVideoToMyList$2;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$bindToVideo$1;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$bindToVideo$3;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$removeVideoFromMyList$1;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$removeVideoFromMyList$2;
import com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$subscribeToUiEvents$1;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC6948cmt;
import o.C6950cmv;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6945cmq;
import o.dpR;
import org.json.JSONObject;

@SuppressLint({"CheckResult"})
/* renamed from: o.cmv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6950cmv {
    private String a;
    private Disposable e;
    private boolean f;
    private InterfaceC6903cmA g;
    private String h;
    private final NetflixActivity i;
    private final Observable<dpR> j;
    private final InterfaceC8639dta k;
    private final InterfaceC6945cmq l;
    private drX<? super Boolean, ? super InterfaceC6945cmq, dpR> m;
    private final InterfaceC8639dta n;

    /* renamed from: o  reason: collision with root package name */
    private TrackingInfoHolder f13749o;
    private final InterfaceC8639dta p;
    private final InterfaceC8639dta s;
    static final /* synthetic */ dtC<Object>[] b = {dsA.b(new MutablePropertyReference1Impl(C6950cmv.class, SignupConstants.Field.VIDEO_ID, "getVideoId()Ljava/lang/String;", 0)), dsA.b(new MutablePropertyReference1Impl(C6950cmv.class, "videoType", "getVideoType()Lcom/netflix/mediaclient/servicemgr/interface_/VideoType;", 0)), dsA.b(new MutablePropertyReference1Impl(C6950cmv.class, "trackId", "getTrackId()I", 0)), dsA.b(new MutablePropertyReference1Impl(C6950cmv.class, "trackingInfo", "getTrackingInfo()Lcom/netflix/cl/model/TrackingInfo;", 0))};
    public static final b d = new b(null);
    public static final int c = 8;

    public final void d(drX<? super Boolean, ? super InterfaceC6945cmq, dpR> drx) {
        this.m = drx;
    }

    public final void e(String str, VideoType videoType, TrackingInfoHolder trackingInfoHolder, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        b(this, str, videoType, trackingInfoHolder, z, null, 16, null);
    }

    public final void e(InterfaceC6903cmA interfaceC6903cmA) {
        this.g = interfaceC6903cmA;
    }

    public C6950cmv(NetflixActivity netflixActivity, InterfaceC6945cmq interfaceC6945cmq, Observable<dpR> observable) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC6945cmq, "");
        C8632dsu.c((Object) observable, "");
        this.i = netflixActivity;
        this.l = interfaceC6945cmq;
        this.j = observable;
        dsW dsw = dsW.a;
        this.p = dsw.c();
        this.s = dsw.c();
        this.n = dsw.c();
        this.k = dsw.c();
        f();
    }

    /* renamed from: o.cmv$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MyListButtonPresenter");
        }
    }

    private final void c(String str) {
        this.p.setValue(this, b[0], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e() {
        return (String) this.p.getValue(this, b[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoType a() {
        return (VideoType) this.s.getValue(this, b[1]);
    }

    private final void d(VideoType videoType) {
        this.s.setValue(this, b[1], videoType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d() {
        return ((Number) this.n.getValue(this, b[2])).intValue();
    }

    private final void e(int i) {
        this.n.setValue(this, b[2], Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingInfo c() {
        return (TrackingInfo) this.k.getValue(this, b[3]);
    }

    private final void c(TrackingInfo trackingInfo) {
        this.k.setValue(this, b[3], trackingInfo);
    }

    public static /* synthetic */ void b(C6950cmv c6950cmv, String str, VideoType videoType, TrackingInfoHolder trackingInfoHolder, boolean z, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = null;
        }
        c6950cmv.c(str, videoType, trackingInfoHolder, z2, str2);
    }

    public final void c(String str, VideoType videoType, TrackingInfoHolder trackingInfoHolder, boolean z, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c(str);
        d(videoType);
        e(trackingInfoHolder.a());
        this.h = trackingInfoHolder.b();
        this.f13749o = trackingInfoHolder;
        c(trackingInfoHolder.c((JSONObject) null));
        this.f = z;
        this.a = str2;
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<AbstractC6948cmt> takeUntil = C6954cmz.c(str).takeUntil(this.j);
        MyListButtonPresenter$bindToVideo$1 myListButtonPresenter$bindToVideo$1 = new MyListButtonPresenter$bindToVideo$1(this);
        C8632dsu.d(takeUntil);
        this.e = SubscribersKt.subscribeBy$default(takeUntil, myListButtonPresenter$bindToVideo$1, (drO) null, new drM<AbstractC6948cmt, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$bindToVideo$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6948cmt abstractC6948cmt) {
                b(abstractC6948cmt);
                return dpR.c;
            }

            public final void b(AbstractC6948cmt abstractC6948cmt) {
                InterfaceC6945cmq interfaceC6945cmq;
                InterfaceC6945cmq interfaceC6945cmq2;
                InterfaceC6945cmq interfaceC6945cmq3;
                if (abstractC6948cmt instanceof AbstractC6948cmt.e) {
                    C6950cmv.this.e(true);
                } else if (abstractC6948cmt instanceof AbstractC6948cmt.d) {
                    C6950cmv.this.e(false);
                } else if (abstractC6948cmt instanceof AbstractC6948cmt.c) {
                    interfaceC6945cmq3 = C6950cmv.this.l;
                    interfaceC6945cmq3.b();
                } else if (abstractC6948cmt instanceof AbstractC6948cmt.b) {
                    interfaceC6945cmq = C6950cmv.this.l;
                    interfaceC6945cmq.b();
                    interfaceC6945cmq2 = C6950cmv.this.l;
                    interfaceC6945cmq2.c();
                }
            }
        }, 2, (Object) null);
    }

    public final void d(String str, VideoType videoType, int i, String str2, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfo, "");
        c(str);
        d(videoType);
        e(i);
        this.h = str2;
        c(trackingInfo);
        this.f = false;
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<AbstractC6948cmt> takeUntil = C6954cmz.c(str).takeUntil(this.j);
        MyListButtonPresenter$bindToVideo$3 myListButtonPresenter$bindToVideo$3 = new MyListButtonPresenter$bindToVideo$3(this);
        C8632dsu.d(takeUntil);
        this.e = SubscribersKt.subscribeBy$default(takeUntil, myListButtonPresenter$bindToVideo$3, (drO) null, new drM<AbstractC6948cmt, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$bindToVideo$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6948cmt abstractC6948cmt) {
                b(abstractC6948cmt);
                return dpR.c;
            }

            public final void b(AbstractC6948cmt abstractC6948cmt) {
                InterfaceC6945cmq interfaceC6945cmq;
                InterfaceC6945cmq interfaceC6945cmq2;
                InterfaceC6945cmq interfaceC6945cmq3;
                if (abstractC6948cmt instanceof AbstractC6948cmt.e) {
                    C6950cmv.this.e(true);
                } else if (abstractC6948cmt instanceof AbstractC6948cmt.d) {
                    C6950cmv.this.e(false);
                } else if (abstractC6948cmt instanceof AbstractC6948cmt.c) {
                    interfaceC6945cmq3 = C6950cmv.this.l;
                    interfaceC6945cmq3.b();
                } else if (abstractC6948cmt instanceof AbstractC6948cmt.b) {
                    interfaceC6945cmq = C6950cmv.this.l;
                    interfaceC6945cmq.b();
                    interfaceC6945cmq2 = C6950cmv.this.l;
                    interfaceC6945cmq2.c();
                }
            }
        }, 2, (Object) null);
    }

    public final void b() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final void f() {
        Observable<InterfaceC6945cmq.c> takeUntil = this.l.v().takeUntil(this.j);
        MyListButtonPresenter$subscribeToUiEvents$1 myListButtonPresenter$subscribeToUiEvents$1 = new MyListButtonPresenter$subscribeToUiEvents$1(this);
        C8632dsu.d(takeUntil);
        SubscribersKt.subscribeBy$default(takeUntil, myListButtonPresenter$subscribeToUiEvents$1, (drO) null, new drM<InterfaceC6945cmq.c, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$subscribeToUiEvents$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC6945cmq.c cVar) {
                b(cVar);
                return dpR.c;
            }

            public final void b(InterfaceC6945cmq.c cVar) {
                InterfaceC6945cmq interfaceC6945cmq;
                TrackingInfoHolder trackingInfoHolder;
                String e;
                VideoType a;
                String str;
                TrackingInfo c2;
                InterfaceC6945cmq interfaceC6945cmq2;
                TrackingInfoHolder trackingInfoHolder2;
                InterfaceC6945cmq interfaceC6945cmq3;
                String e2;
                String e3;
                VideoType a2;
                int d2;
                String str2;
                TrackingInfo c3;
                dpR dpr = null;
                if (cVar instanceof InterfaceC6945cmq.c.d) {
                    C6950cmv.this.e(true);
                    interfaceC6945cmq2 = C6950cmv.this.l;
                    interfaceC6945cmq2.f();
                    trackingInfoHolder2 = C6950cmv.this.f13749o;
                    if (trackingInfoHolder2 != null) {
                        C6950cmv.this.a(true, trackingInfoHolder2);
                        dpr = dpR.c;
                    }
                    if (dpr == null) {
                        C6950cmv c6950cmv = C6950cmv.this;
                        e3 = c6950cmv.e();
                        a2 = c6950cmv.a();
                        d2 = c6950cmv.d();
                        str2 = c6950cmv.h;
                        c3 = c6950cmv.c();
                        C6950cmv.a(c6950cmv, e3, a2, d2, str2, c3, null, 32, null);
                    }
                    interfaceC6945cmq3 = C6950cmv.this.l;
                    e2 = C6950cmv.this.e();
                    interfaceC6945cmq3.e(e2);
                } else if (cVar instanceof InterfaceC6945cmq.c.C0119c) {
                    C6950cmv.this.e(false);
                    interfaceC6945cmq = C6950cmv.this.l;
                    interfaceC6945cmq.h();
                    trackingInfoHolder = C6950cmv.this.f13749o;
                    if (trackingInfoHolder != null) {
                        C6950cmv.this.a(false, trackingInfoHolder);
                        dpr = dpR.c;
                    }
                    if (dpr == null) {
                        C6950cmv c6950cmv2 = C6950cmv.this;
                        e = c6950cmv2.e();
                        a = c6950cmv2.a();
                        str = c6950cmv2.h;
                        c2 = c6950cmv2.c();
                        C6950cmv.a(c6950cmv2, e, a, str, c2, null, 16, null);
                    }
                }
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Throwable th) {
        Map d2;
        Map k;
        Throwable th2;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("onError for MyListButtonPresenter", th, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th2 = new Throwable(c1596aHd.b());
        } else {
            th2 = c1596aHd.i;
            if (th2 == null) {
                th2 = new Throwable("Handled exception with no message");
            } else if (th2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th2);
        } else {
            dVar.e().b(c1596aHd, th2);
        }
        this.l.b();
        this.l.c();
    }

    public final void e(boolean z) {
        this.l.d(z);
        this.l.d();
        drX<? super Boolean, ? super InterfaceC6945cmq, dpR> drx = this.m;
        if (drx != null) {
            drx.invoke(Boolean.valueOf(z), this.l);
        }
    }

    public static /* synthetic */ void a(C6950cmv c6950cmv, String str, VideoType videoType, int i, String str2, TrackingInfo trackingInfo, AppView appView, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            appView = AppView.addToMyListButton;
        }
        c6950cmv.a(str, videoType, i, str2, trackingInfo, appView);
    }

    private final void a(String str, VideoType videoType, int i, String str2, TrackingInfo trackingInfo, AppView appView) {
        Long startSession = Logger.INSTANCE.startSession(new AddToPlaylist(appView, null, CommandValue.AddToPlaylistCommand, trackingInfo));
        if (C8153dex.ab()) {
            C0987Kg a = C0987Kg.e.a(this.i);
            if (videoType == VideoType.GAMES) {
                a.a(str, new MyListButtonPresenter$addVideoToMyList$1(new C6907cmE("MyListButtonPresenter", startSession)));
                return;
            }
            a.a(str, Integer.valueOf(i), this.a, new MyListButtonPresenter$addVideoToMyList$2(new C6907cmE("MyListButtonPresenter", startSession)));
            return;
        }
        InterfaceC5125bsp j = this.i.getServiceManager().j();
        if (j != null) {
            j.e(str, videoType, i, str2, this.a, new C6907cmE("MyListButtonPresenter", startSession));
        }
    }

    public static /* synthetic */ void a(C6950cmv c6950cmv, String str, VideoType videoType, String str2, TrackingInfo trackingInfo, AppView appView, int i, Object obj) {
        if ((i & 16) != 0) {
            appView = AppView.removeFromMyListButton;
        }
        c6950cmv.d(str, videoType, str2, trackingInfo, appView);
    }

    private final void d(String str, VideoType videoType, String str2, TrackingInfo trackingInfo, AppView appView) {
        Long startSession = Logger.INSTANCE.startSession(new RemoveFromPlaylist(appView, null, CommandValue.RemoveFromPlaylistCommand, trackingInfo));
        if (C8153dex.ab()) {
            C0987Kg a = C0987Kg.e.a(this.i);
            if (videoType == VideoType.GAMES) {
                a.b(str, new MyListButtonPresenter$removeVideoFromMyList$1(new C6907cmE("MyListButtonPresenter", startSession)));
                return;
            } else {
                a.a(str, this.a, new MyListButtonPresenter$removeVideoFromMyList$2(new C6907cmE("MyListButtonPresenter", startSession)));
                return;
            }
        }
        InterfaceC5125bsp j = this.i.getServiceManager().j();
        if (j != null) {
            j.c(str, videoType, str2, this.a, new C6907cmE("MyListButtonPresenter", startSession));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final boolean z, TrackingInfoHolder trackingInfoHolder) {
        InterfaceC6903cmA interfaceC6903cmA = this.g;
        if (interfaceC6903cmA != null) {
            if (this.f) {
                interfaceC6903cmA.d(e(), a(), z, trackingInfoHolder, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$mutateQueue$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        a(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void a(boolean z2) {
                        if (z2) {
                            return;
                        }
                        C6950cmv.this.e(!z);
                    }
                });
            } else {
                interfaceC6903cmA.c(e(), a(), z, trackingInfoHolder, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$mutateQueue$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        b(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void b(boolean z2) {
                        if (z2) {
                            return;
                        }
                        C6950cmv.this.e(!z);
                    }
                });
            }
        } else if (this.f) {
            new C1767aNm(this.j).c(e(), a(), z, null, trackingInfoHolder, this.a, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$mutateQueue$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    c(bool.booleanValue());
                    return dpR.c;
                }

                public final void c(boolean z2) {
                    if (z2) {
                        return;
                    }
                    C6950cmv.this.e(!z);
                }
            });
        } else {
            new C1758aNd(this.j).b(e(), a(), z, null, trackingInfoHolder, this.h, this.a, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonPresenter$mutateQueue$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool.booleanValue());
                    return dpR.c;
                }

                public final void e(boolean z2) {
                    if (z2) {
                        return;
                    }
                    C6950cmv.this.e(!z);
                }
            });
        }
    }
}
