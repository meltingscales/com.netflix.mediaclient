package o;

import android.annotation.SuppressLint;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Countdown;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.iko.VideoSegment;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$5;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C7557cyU;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5710cFm;
import o.cBA;
import o.cEW;
import o.dpR;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"CheckResult"})
/* renamed from: o.cyU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7557cyU implements cEW, InterfaceC5710cFm {
    public static final a d = new a(null);
    private Long a;
    private Long b;
    private Long c;
    private Interactivity e;
    private String f;
    private boolean g;
    private InteractiveMoments h;
    private Long i;
    private IPlaylistControl j;
    private Long l;
    private Long m;

    /* renamed from: o  reason: collision with root package name */
    private ServiceManager f13789o;

    /* renamed from: o.cyU$b */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[MomentState.values().length];
            try {
                iArr[MomentState.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentState.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject f(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject g(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject h(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject i(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject j(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    public Interactivity a() {
        return this.e;
    }

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.e = interactivity;
    }

    @Override // o.InterfaceC5710cFm
    public void b(String str) {
        this.f = str;
    }

    @Override // o.InterfaceC5710cFm
    public String c() {
        return this.f;
    }

    public final ServiceManager e() {
        return this.f13789o;
    }

    public final void e(ServiceManager serviceManager) {
        this.f13789o = serviceManager;
    }

    public C7557cyU(Observable<cBA> observable) {
        C8632dsu.c((Object) observable, "");
        this.g = true;
        c(observable);
        e(observable);
        SubscribersKt.subscribeBy$default(observable, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                a(cba);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
                if (r3.isBranchingNarrative() == true) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(o.cBA r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r3, r0)
                    boolean r0 = r3 instanceof o.cBA.C5542d
                    if (r0 == 0) goto L28
                    o.cyU r0 = o.C7557cyU.this
                    o.cBA$d r3 = (o.cBA.C5542d) r3
                    o.cxz r3 = r3.e()
                    o.buI r3 = r3.g()
                    com.netflix.model.leafs.originals.interactive.InteractiveSummary r3 = r3.az_()
                    if (r3 == 0) goto L23
                    boolean r3 = r3.isBranchingNarrative()
                    r1 = 1
                    if (r3 != r1) goto L23
                    goto L24
                L23:
                    r1 = 0
                L24:
                    o.C7557cyU.d(r0, r1)
                    goto L83
                L28:
                    boolean r0 = r3 instanceof o.cBA.au
                    if (r0 == 0) goto L44
                    o.cBA$au r3 = (o.cBA.au) r3
                    o.aJY r3 = r3.b()
                    o.cyU r0 = o.C7557cyU.this
                    com.netflix.mediaclient.ui.player.v2.interactive.Interactivity r0 = r0.a()
                    if (r0 == 0) goto L83
                    boolean r0 = r3 instanceof com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
                    if (r0 == 0) goto L83
                    o.cyU r0 = o.C7557cyU.this
                    o.C7557cyU.b(r0, r3)
                    goto L83
                L44:
                    boolean r0 = r3 instanceof o.cBA.C5546h
                    if (r0 == 0) goto L83
                    o.cyU r0 = o.C7557cyU.this
                    o.cBA$h r3 = (o.cBA.C5546h) r3
                    com.netflix.model.leafs.originals.interactive.InteractiveMoments r3 = r3.e()
                    o.C7557cyU.d(r0, r3)
                    o.cyU r3 = o.C7557cyU.this
                    com.netflix.model.leafs.originals.interactive.InteractiveMoments r3 = o.C7557cyU.c(r3)
                    r0 = 0
                    if (r3 == 0) goto L71
                    com.netflix.model.leafs.originals.interactive.PlayerControls r3 = r3.playerControls()
                    if (r3 == 0) goto L71
                    com.netflix.model.leafs.originals.interactive.PlayerControls$Config r3 = r3.config()
                    if (r3 == 0) goto L71
                    boolean r3 = r3.playerControlsSnapshots()
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    goto L72
                L71:
                    r3 = r0
                L72:
                    o.cyU r1 = o.C7557cyU.this
                    com.netflix.model.leafs.originals.interactive.InteractiveMoments r1 = o.C7557cyU.c(r1)
                    if (r1 == 0) goto L7e
                    com.netflix.model.leafs.originals.interactive.condition.StateHistory r0 = r1.stateHistory()
                L7e:
                    com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1$1 r1 = new o.drX<java.lang.Boolean, com.netflix.model.leafs.originals.interactive.condition.StateHistory, o.dpR>() { // from class: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.1
                        static {
                            /*
                                com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1$1 r0 = new com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1$1) com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.1.b com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.AnonymousClass1.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 2
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.AnonymousClass1.<init>():void");
                        }

                        @Override // o.drX
                        public /* synthetic */ o.dpR invoke(java.lang.Boolean r1, com.netflix.model.leafs.originals.interactive.condition.StateHistory r2) {
                            /*
                                r0 = this;
                                java.lang.Boolean r1 = (java.lang.Boolean) r1
                                boolean r1 = r1.booleanValue()
                                com.netflix.model.leafs.originals.interactive.condition.StateHistory r2 = (com.netflix.model.leafs.originals.interactive.condition.StateHistory) r2
                                r0.d(r1, r2)
                                o.dpR r1 = o.dpR.c
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }

                        public final void d(boolean r3, com.netflix.model.leafs.originals.interactive.condition.StateHistory r4) {
                            /*
                                r2 = this;
                                java.lang.String r0 = ""
                                o.C8632dsu.c(r4, r0)
                                if (r3 == 0) goto L24
                                boolean r3 = r4.isNotEmpty()
                                if (r3 == 0) goto L24
                                com.netflix.cl.Logger r3 = com.netflix.cl.Logger.INSTANCE
                                com.netflix.cl.model.context.iko.UserState r0 = new com.netflix.cl.model.context.iko.UserState
                                org.json.JSONObject r1 = new org.json.JSONObject
                                com.google.gson.JsonObject r4 = r4.toJson()
                                java.lang.String r4 = r4.toString()
                                r1.<init>(r4)
                                r0.<init>(r1)
                                r3.addContext(r0)
                            L24:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.AnonymousClass1.d(boolean, com.netflix.model.leafs.originals.interactive.condition.StateHistory):void");
                        }
                    }
                    o.C9726vo.d(r3, r0, r1)
                L83:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$1.a(o.cBA):void");
            }
        }, 3, (Object) null);
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$2
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(C7557cyU.this.a() != null);
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cyV
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean a2;
                a2 = C7557cyU.a(drM.this, obj);
                return a2;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy(filter, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                C7557cyU.a aVar = C7557cyU.d;
                C7557cyU.this.i();
                C7557cyU.this.h();
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.PlayerInteractivePresenter$4
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                C7557cyU.a aVar = C7557cyU.d;
                C7557cyU.this.i();
                C7557cyU.this.h();
            }
        }, new PlayerInteractivePresenter$5(this));
    }

    @Override // o.InterfaceC5710cFm
    public void c(Observable<cBA> observable) {
        InterfaceC5710cFm.e.c(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    /* renamed from: o.cyU$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayerInteractivePresenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(PlaylistTimestamp playlistTimestamp) {
        ServiceManager serviceManager;
        InterfaceC5125bsp j;
        if (!this.g || (serviceManager = this.f13789o) == null || (j = serviceManager.j()) == null) {
            return;
        }
        j.b(new C0994Kn(playlistTimestamp.c, "segment", playlistTimestamp.a), new e(playlistTimestamp));
    }

    /* renamed from: o.cyU$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC5164btb {
        final /* synthetic */ PlaylistTimestamp b;

        e(PlaylistTimestamp playlistTimestamp) {
            this.b = playlistTimestamp;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void a(boolean z, Status status) {
            InterfaceC5125bsp j;
            if (z) {
                return;
            }
            a aVar = C7557cyU.d;
            ServiceManager e = C7557cyU.this.e();
            if (e == null || (j = e.j()) == null) {
                return;
            }
            PlaylistTimestamp playlistTimestamp = this.b;
            j.b(new C0994Kn(playlistTimestamp.c, "segment", playlistTimestamp.a), new a());
        }

        /* renamed from: o.cyU$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC5164btb {
            a() {
            }

            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void a(boolean z, Status status) {
                if (z) {
                    return;
                }
                a aVar = C7557cyU.d;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(MomentState momentState, Moment moment) {
        PlaylistTimestamp l;
        String str;
        Long l2;
        int i = b.c[momentState.ordinal()];
        if (i != 1) {
            if (i == 2 && (l2 = this.i) != null) {
                Logger.INSTANCE.endSession(l2);
                this.i = null;
                return;
            }
            return;
        }
        final JSONObject c = c(moment);
        IPlaylistControl iPlaylistControl = this.j;
        if (iPlaylistControl != null && (l = iPlaylistControl.l()) != null && (str = l.c) != null) {
            try {
                c.put("viewableId", Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                c.put("viewableId", str);
            }
        }
        Long startMs = moment.startMs();
        C8632dsu.a(startMs, "");
        c.put("uiDisplayMs", startMs.longValue());
        String id = moment.id();
        if (id != null) {
            c.put("momentId", id);
        }
        this.i = Logger.INSTANCE.startSession(new Presentation(AppView.ixNotification, new TrackingInfo() { // from class: o.cyY
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject i2;
                i2 = C7557cyU.i(JSONObject.this);
                return i2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject c(Moment moment) {
        UiDefinition uiDefinition;
        UiDefinition.Config config;
        UiDefinition.Config.Logging logging;
        UiDefinition.Config.Logging.Moment moment2;
        com.netflix.model.leafs.originals.interactive.TrackingInfo trackingInfo;
        JSONObject jSONObject = new JSONObject();
        InteractiveMoments interactiveMoments = this.h;
        if (interactiveMoments != null && (uiDefinition = interactiveMoments.uiDefinition()) != null && (config = uiDefinition.config()) != null && (logging = config.logging()) != null && (moment2 = logging.moment()) != null && (trackingInfo = moment2.trackingInfo()) != null) {
            trackingInfo.copyValues(jSONObject);
        }
        com.netflix.model.leafs.originals.interactive.TrackingInfo trackingInfo2 = moment.trackingInfo(this.h);
        if (trackingInfo2 != null) {
            trackingInfo2.copyValues(jSONObject);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        PlaylistTimestamp l;
        ArrayList<String> segmentHistory;
        IPlaylistControl iPlaylistControl = this.j;
        if (iPlaylistControl == null || (l = iPlaylistControl.l()) == null || this.m != null) {
            return;
        }
        d.getLogTag();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("segmentId", l.a);
        try {
            String str = l.c;
            C8632dsu.a(str, "");
            jSONObject.put("viewableId", Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            jSONObject.put("viewableId", l.c);
        }
        InteractiveMoments interactiveMoments = this.h;
        if (interactiveMoments != null && (segmentHistory = interactiveMoments.segmentHistory()) != null) {
            segmentHistory.add(l.a);
        }
        this.m = Logger.INSTANCE.startSession(new VideoSegment(new TrackingInfo() { // from class: o.cyT
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject f;
                f = C7557cyU.f(JSONObject.this);
                return f;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(PlaylistTimestamp playlistTimestamp) {
        ArrayList<String> segmentHistory;
        i();
        d.getLogTag();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("segmentId", playlistTimestamp.a);
        try {
            String str = playlistTimestamp.c;
            C8632dsu.a(str, "");
            jSONObject.put("viewableId", Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            jSONObject.put("viewableId", playlistTimestamp.c);
        }
        InteractiveMoments interactiveMoments = this.h;
        if (interactiveMoments != null && (segmentHistory = interactiveMoments.segmentHistory()) != null) {
            segmentHistory.add(playlistTimestamp.a);
        }
        this.m = Logger.INSTANCE.startSession(new VideoSegment(new TrackingInfo() { // from class: o.cyX
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject j;
                j = C7557cyU.j(JSONObject.this);
                return j;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        b();
        f();
    }

    private final void b() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.c = null;
        }
        Long l2 = this.a;
        if (l2 != null) {
            Logger.INSTANCE.endSession(l2);
            this.a = null;
        }
        Long l3 = this.b;
        if (l3 != null) {
            Logger.INSTANCE.endSession(l3);
            this.b = null;
        }
        Long l4 = this.i;
        if (l4 != null) {
            Logger.INSTANCE.endSession(l4);
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        Long l = this.m;
        if (l != null) {
            long longValue = l.longValue();
            d.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject j() {
        return new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        IPlaylistControl iPlaylistControl;
        PlaylistTimestamp l;
        Map d2;
        Map k;
        Throwable th;
        InteractiveMoments interactiveMoments = this.h;
        if ((interactiveMoments != null ? interactiveMoments.playerControls() : null) == null || (iPlaylistControl = this.j) == null || (l = iPlaylistControl.l()) == null) {
            return;
        }
        d.getLogTag();
        Long l2 = this.l;
        if (l2 != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l2.longValue()));
        }
        if (C8168dfL.g(l.a)) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("logShowNavigationControlsPreview invalid segment id", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("segmentId", l.a);
        jSONObject.put("viewableId", l.c);
        this.l = Logger.INSTANCE.startSession(new Presentation(AppView.ikoChoicePointNavigatorPreview, new TrackingInfo() { // from class: o.czb
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject g;
                g = C7557cyU.g(JSONObject.this);
                return g;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Long l = this.l;
        if (l != null) {
            long longValue = l.longValue();
            d.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(MomentState momentState, Moment moment) {
        String videoId;
        ArrayList<String> segmentHistory;
        PlaylistTimestamp l;
        String str;
        d.getLogTag();
        int i = b.c[momentState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            b();
            return;
        }
        final JSONObject c = c(moment);
        IPlaylistControl iPlaylistControl = this.j;
        if (iPlaylistControl != null && (l = iPlaylistControl.l()) != null && (str = l.c) != null) {
            try {
                c.put("viewableId", Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                c.put("viewableId", str);
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<Choice> choices = moment.choices();
        String str2 = null;
        if (choices != null) {
            String str3 = null;
            for (Choice choice : choices) {
                if (choice != null) {
                    JSONObject jSONObject = new JSONObject();
                    com.netflix.model.leafs.originals.interactive.TrackingInfo trackingInfo = choice.trackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.copyValues(jSONObject);
                    }
                    if (!jSONObject.has("segmentId")) {
                        String segmentId = choice.segmentId();
                        if (segmentId == null) {
                            segmentId = choice.id();
                        }
                        jSONObject.put("segmentId", segmentId);
                    }
                    String id = choice.id();
                    if (id != null) {
                        C8632dsu.d((Object) id);
                        jSONObject.put(SignupConstants.Field.LANG_ID, id);
                    }
                    jSONObject.put("default", choice.isDefaultChoice);
                    InteractiveMoments interactiveMoments = this.h;
                    jSONObject.put("hasWatched", (interactiveMoments == null || (segmentHistory = interactiveMoments.segmentHistory()) == null) ? null : Boolean.valueOf(segmentHistory.contains(choice.segmentId())));
                    Choice.ChoiceAction action = choice.action();
                    if (action != null && (videoId = action.videoId()) != null) {
                        jSONObject.put("viewableId", videoId);
                    }
                    String code = choice.code();
                    if (code != null) {
                        str3 = code;
                    }
                    jSONArray.put(jSONObject);
                }
            }
            str2 = str3;
        }
        if (str2 != null) {
            c.put("code", str2);
        }
        c.put("choices", jSONArray);
        Long uiDisplayMS = moment.uiDisplayMS();
        C8632dsu.a(uiDisplayMS, "");
        c.put("uiDisplayMs", uiDisplayMS.longValue());
        String id2 = moment.id();
        if (id2 != null) {
            c.put("momentId", id2);
        }
        Logger logger = Logger.INSTANCE;
        this.b = logger.startSession(new Presentation(moment.isInterstitialPostPlay() ? AppView.ikoInterstitialPostPlay : AppView.ikoChoicePoint, new TrackingInfo() { // from class: o.cyW
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject h;
                h = C7557cyU.h(JSONObject.this);
                return h;
            }
        }));
        this.c = logger.startSession(new Countdown(Long.valueOf(C5639cCw.e.e(this.j, moment))));
        this.a = logger.startSession(new Presentation(AppView.ikoChoicePointOverlay, new TrackingInfo() { // from class: o.cza
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject j;
                j = C7557cyU.j();
                return j;
            }
        }));
    }
}
