package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.playerui.videoview.api.PlayerControls;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControlsType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$7;
import com.netflix.model.leafs.ArtworkColors;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC3827bMc;
import o.AbstractC6719cic;
import o.C1337Xu;
import o.C1682aKi;
import o.C6691ciA;
import o.C6728cil;
import o.C6733ciq;
import o.C8632dsu;
import o.C9834xU;
import o.C9963zr;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3826bMb;
import o.InterfaceC6718cib;
import o.dpR;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.ciq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6733ciq {

    /* renamed from: o.ciq$e */
    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.ViewHolder {
        public static final C0118e b = new C0118e(null);
        private InterfaceC6718cib.d a;
        private InterfaceC6718cib.d c;
        private boolean d;
        private boolean e;
        private final CompositeDisposable f;
        private final MiniPlayerControls g;
        private C9935zP h;
        private final InterfaceC8554dpx i;
        private boolean j;
        private C6728cil k;
        private final String l;
        private final PublishSubject<dpR> m;
        private final NetflixImageView n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13736o;
        private InterfaceC3826bMb p;
        private long q;
        private InterfaceC6718cib r;
        private long s;
        private MiniPlayerVideoGroupViewModel t;
        private String u;
        private final ConstraintLayout v;
        private final C1677aKd w;
        private drX<? super View, ? super Boolean, dpR> x;
        private int y;

        /* renamed from: o.ciq$e$d */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class d {
            public static final /* synthetic */ int[] e;

            static {
                int[] iArr = new int[MiniPlayerControlsType.values().length];
                try {
                    iArr[MiniPlayerControlsType.e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                e = iArr;
            }
        }

        public final ConstraintLayout a() {
            return this.v;
        }

        public final void c(drX<? super View, ? super Boolean, dpR> drx) {
            C8632dsu.c((Object) drx, "");
            this.x = drx;
        }

        public final NetflixImageView d() {
            return this.n;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(final View view, C9935zP c9935zP, boolean z, MiniPlayerControlsType miniPlayerControlsType, String str) {
            super(view);
            InterfaceC8554dpx b2;
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) miniPlayerControlsType, "");
            this.h = c9935zP;
            this.l = str;
            this.u = "";
            this.v = (ConstraintLayout) view;
            this.n = (NetflixImageView) view.findViewById(C6691ciA.d.a);
            b2 = dpB.b(LazyThreadSafetyMode.e, new drO<C9963zr>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$debugView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final C9963zr invoke() {
                    Context context = view.getContext();
                    C8632dsu.a(context, "");
                    if (C1337Xu.e(context, C9834xU.g.q)) {
                        C9963zr c9963zr = new C9963zr(view.getContext());
                        C6733ciq.e eVar = this;
                        c9963zr.setId(C6691ciA.d.d);
                        ConstraintLayout a2 = eVar.a();
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
                        layoutParams.topToTop = eVar.w.getId();
                        layoutParams.bottomToBottom = eVar.w.getId();
                        layoutParams.startToStart = eVar.w.getId();
                        layoutParams.endToEnd = eVar.w.getId();
                        dpR dpr = dpR.c;
                        a2.addView(c9963zr, layoutParams);
                        return c9963zr;
                    }
                    return null;
                }
            });
            this.i = b2;
            this.x = new drX<View, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$updateLayoutForFullscreenMode$1
                @Override // o.drX
                public /* synthetic */ dpR invoke(View view2, Boolean bool) {
                    a(view2, bool.booleanValue());
                    return dpR.c;
                }

                public final void a(View view2, boolean z2) {
                    C8632dsu.c((Object) view2, "");
                    throw new IllegalStateException("`updateLayoutForFullscreenMode` should be implemented if orientation was changed");
                }
            };
            if (d.e[miniPlayerControlsType.ordinal()] == 1) {
                MiniPlayerControls miniPlayerControls = new MiniPlayerControls(view, str, z, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$controls$1
                    {
                        super(1);
                    }

                    public final void c(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C6733ciq.e.this.e(th);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        c(th);
                        return dpR.c;
                    }
                });
                this.g = miniPlayerControls;
                this.w = (C1677aKd) view.findViewById(C6691ciA.d.l);
                this.f = new CompositeDisposable();
                this.q = -1L;
                PublishSubject<dpR> create = PublishSubject.create();
                C8632dsu.a(create, "");
                this.m = create;
                b.getLogTag();
                miniPlayerControls.a(false, false, true);
                miniPlayerControls.b(false);
                l();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: o.ciq$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0118e extends C1045Mp {
            public /* synthetic */ C0118e(C8627dsp c8627dsp) {
                this();
            }

            private C0118e() {
                super("MiniPlayerViewHolder");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C9963zr f() {
            return (C9963zr) this.i.getValue();
        }

        private final void d(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
            if (C8632dsu.c(miniPlayerVideoGroupViewModel, this.t)) {
                return;
            }
            if (this.t != null && miniPlayerVideoGroupViewModel != null) {
                throw new IllegalStateException("playerViewModel instance should remain the same for the same bind. You likely missed to call unbind");
            }
            this.t = miniPlayerVideoGroupViewModel;
        }

        /* renamed from: o.ciq$e$c */
        /* loaded from: classes4.dex */
        public static final class c implements C1682aKi.e {
            c() {
            }

            @Override // o.C1682aKi.e
            public void e(long j) {
                C6728cil c6728cil = e.this.k;
                if (c6728cil != null) {
                    c6728cil.e((int) j);
                }
            }
        }

        @SuppressLint({"CheckResult"})
        private final void l() {
            this.w.setPlayProgressListener(new c());
            this.w.setPlayerStatusChangeListener(new a());
            this.w.setErrorListener(new b());
        }

        /* renamed from: o.ciq$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements C1682aKi.c {

            /* renamed from: o.ciq$e$a$c */
            /* loaded from: classes4.dex */
            public final /* synthetic */ class c {
                public static final /* synthetic */ int[] b;

                static {
                    int[] iArr = new int[PlayerState.values().length];
                    try {
                        iArr[PlayerState.c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlayerState.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PlayerState.e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PlayerState.f.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PlayerState.a.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PlayerState.i.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PlayerState.d.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    b = iArr;
                }
            }

            a() {
            }

            @Override // o.C1682aKi.c
            public void a(PlayerState playerState) {
                InterfaceC3826bMb interfaceC3826bMb;
                Map d;
                Map k;
                Throwable th;
                C8632dsu.c((Object) playerState, "");
                C6728cil c6728cil = e.this.k;
                if (c6728cil != null) {
                    final e eVar = e.this;
                    e.b.getLogTag();
                    C9963zr f = eVar.f();
                    if (f != null) {
                        f.b(String.valueOf(playerState));
                    }
                    InterfaceC6718cib interfaceC6718cib = null;
                    switch (c.b[playerState.ordinal()]) {
                        case 1:
                        case 7:
                            return;
                        case 2:
                            eVar.d().setVisibility(0);
                            InterfaceC3826bMb interfaceC3826bMb2 = eVar.p;
                            if (interfaceC3826bMb2 != null) {
                                interfaceC3826bMb2.c(AbstractC3827bMc.a.b);
                            }
                            e.d(eVar, c6728cil, false, 2, null);
                            return;
                        case 3:
                            C6728cil c6728cil2 = eVar.k;
                            if (c6728cil2 != null && c6728cil2.u()) {
                                eVar.w.b(0L);
                                eVar.d(true);
                            } else {
                                eVar.d().setVisibility(0);
                                eVar.b(c6728cil, true);
                                InterfaceC3826bMb interfaceC3826bMb3 = eVar.p;
                                if (interfaceC3826bMb3 != null) {
                                    interfaceC3826bMb3.c(AbstractC3827bMc.b.e);
                                }
                                InterfaceC6718cib.d dVar = eVar.a;
                                if (dVar != null) {
                                    InterfaceC6718cib interfaceC6718cib2 = eVar.r;
                                    if (interfaceC6718cib2 == null) {
                                        C8632dsu.d("");
                                        interfaceC6718cib2 = null;
                                    }
                                    InterfaceC6718cib.b.d(interfaceC6718cib2, dVar, null, 2, null);
                                    eVar.a = null;
                                }
                                C6728cil c6728cil3 = eVar.k;
                                if (c6728cil3 != null) {
                                    String w = c6728cil3.w();
                                    String h = c6728cil3.h();
                                    if (w != null && h != null) {
                                        InterfaceC6718cib interfaceC6718cib3 = eVar.r;
                                        if (interfaceC6718cib3 == null) {
                                            C8632dsu.d("");
                                        } else {
                                            interfaceC6718cib = interfaceC6718cib3;
                                        }
                                        interfaceC6718cib.c(c6728cil3);
                                    }
                                }
                            }
                            eVar.g.f();
                            eVar.h.b(AbstractC6719cic.class, AbstractC6719cic.b.b);
                            return;
                        case 4:
                            eVar.w.setVisibility(0);
                            eVar.d().setVisibility(4);
                            InterfaceC3826bMb interfaceC3826bMb4 = eVar.p;
                            if (interfaceC3826bMb4 != null) {
                                interfaceC3826bMb4.c(AbstractC3827bMc.j.c);
                            }
                            eVar.g.d(true);
                            c6728cil.b(true);
                            c6728cil.c(true);
                            if (eVar.q != -1) {
                                eVar.s = System.currentTimeMillis() - eVar.q;
                                C9963zr f2 = eVar.f();
                                if (f2 != null) {
                                    f2.b("play delay " + eVar.s + " msec");
                                }
                            }
                            C6728cil c6728cil4 = eVar.k;
                            if (c6728cil4 != null && !c6728cil4.u()) {
                                C1677aKd c1677aKd = eVar.w;
                                C8632dsu.a(c1677aKd, "");
                                Observable<dpR> takeUntil = C9618tM.c(c1677aKd).takeUntil(eVar.m);
                                C8632dsu.a(takeUntil, "");
                                SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$setupSubscriptionsAndListeners$2$onPlayerStatusChanged$1$4
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ dpR invoke(Throwable th2) {
                                        e(th2);
                                        return dpR.c;
                                    }

                                    public final void e(Throwable th2) {
                                        C8632dsu.c((Object) th2, "");
                                        C6733ciq.e.this.e(th2);
                                    }
                                }, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$setupSubscriptionsAndListeners$2$onPlayerStatusChanged$1$5
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ dpR invoke(dpR dpr) {
                                        e(dpr);
                                        return dpR.c;
                                    }

                                    public final void e(dpR dpr) {
                                        C6728cil c6728cil5 = C6733ciq.e.this.k;
                                        if (c6728cil5 != null && c6728cil5.v()) {
                                            if (!C6733ciq.e.this.w.ab() || C6733ciq.e.this.g.j()) {
                                                if (!C6733ciq.e.this.w.ab() && C6733ciq.e.this.g.j()) {
                                                    C6733ciq.e.this.d(true);
                                                }
                                            } else {
                                                C6733ciq.e.a(C6733ciq.e.this, true, false, 2, null);
                                            }
                                        }
                                        C6733ciq.e.this.g.y();
                                        C6733ciq.e.this.g.g();
                                    }
                                }, 2, (Object) null);
                                eVar.o();
                            }
                            InterfaceC6718cib interfaceC6718cib4 = eVar.r;
                            if (interfaceC6718cib4 == null) {
                                C8632dsu.d("");
                                interfaceC6718cib4 = null;
                            }
                            C6728cil c6728cil5 = eVar.k;
                            if (c6728cil5 != null) {
                                eVar.a = interfaceC6718cib4.c(c6728cil5, eVar.w.D(), eVar.f13736o);
                                InterfaceC6718cib.d dVar2 = eVar.c;
                                if (dVar2 != null) {
                                    InterfaceC6718cib interfaceC6718cib5 = eVar.r;
                                    if (interfaceC6718cib5 == null) {
                                        C8632dsu.d("");
                                        interfaceC6718cib5 = null;
                                    }
                                    InterfaceC6718cib.b.d(interfaceC6718cib5, dVar2, null, 2, null);
                                    eVar.c = null;
                                }
                                eVar.h.b(AbstractC6719cic.class, new AbstractC6719cic.a(c6728cil.a(), String.valueOf(eVar.w.n())));
                                return;
                            }
                            throw new IllegalArgumentException("Required value was null.".toString());
                        case 5:
                            if (eVar.j && (interfaceC3826bMb = eVar.p) != null) {
                                interfaceC3826bMb.c(AbstractC3827bMc.e.e);
                            }
                            if (eVar.j || eVar.d) {
                                eVar.g.d(false);
                            } else {
                                eVar.d().setVisibility(0);
                                MiniPlayerControls.e(eVar.g, false, true, false, 4, null);
                                InterfaceC3826bMb interfaceC3826bMb5 = eVar.p;
                                if (interfaceC3826bMb5 != null) {
                                    interfaceC3826bMb5.c(AbstractC3827bMc.a.b);
                                }
                                e.d(eVar, c6728cil, false, 2, null);
                            }
                            c6728cil.b(false);
                            InterfaceC6718cib.d dVar3 = eVar.a;
                            if (dVar3 != null) {
                                InterfaceC6718cib interfaceC6718cib6 = eVar.r;
                                if (interfaceC6718cib6 == null) {
                                    C8632dsu.d("");
                                    interfaceC6718cib6 = null;
                                }
                                interfaceC6718cib6.e(dVar3);
                                eVar.a = null;
                                return;
                            }
                            return;
                        case 6:
                            eVar.g.w();
                            return;
                        default:
                            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                            d = dqE.d();
                            k = dqE.k(d);
                            C1596aHd c1596aHd = new C1596aHd("Unhandled state : " + playerState, null, null, false, k, false, false, 96, null);
                            ErrorType errorType = c1596aHd.a;
                            if (errorType != null) {
                                c1596aHd.e.put("errorType", errorType.c());
                                String b = c1596aHd.b();
                                if (b != null) {
                                    c1596aHd.a(errorType.c() + " " + b);
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
                            InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
                            InterfaceC1598aHf a = dVar4.a();
                            if (a != null) {
                                a.e(c1596aHd, th);
                                return;
                            } else {
                                dVar4.e().b(c1596aHd, th);
                                return;
                            }
                    }
                }
            }
        }

        /* renamed from: o.ciq$e$b */
        /* loaded from: classes4.dex */
        public static final class b implements C1682aKi.a {
            b() {
            }

            @Override // o.C1682aKi.a
            public void d(IPlayer.c cVar) {
                C9963zr f = e.this.f();
                if (f != null) {
                    f.b("Playback error : " + cVar);
                }
                e.this.g.s();
                e.this.d().setVisibility(0);
                InterfaceC3826bMb interfaceC3826bMb = e.this.p;
                if (interfaceC3826bMb != null) {
                    interfaceC3826bMb.c(AbstractC3827bMc.a.b);
                }
                InterfaceC6718cib.d dVar = e.this.c;
                InterfaceC6718cib interfaceC6718cib = null;
                if (dVar != null) {
                    InterfaceC6718cib interfaceC6718cib2 = e.this.r;
                    if (interfaceC6718cib2 == null) {
                        C8632dsu.d("");
                        interfaceC6718cib2 = null;
                    }
                    interfaceC6718cib2.e(dVar, cVar);
                }
                InterfaceC6718cib.d dVar2 = e.this.a;
                if (dVar2 != null) {
                    InterfaceC6718cib interfaceC6718cib3 = e.this.r;
                    if (interfaceC6718cib3 == null) {
                        C8632dsu.d("");
                    } else {
                        interfaceC6718cib = interfaceC6718cib3;
                    }
                    interfaceC6718cib.e(dVar2, cVar);
                }
            }
        }

        public final boolean e() {
            return this.n.isImageLoaded();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(Throwable th) {
            Map d2;
            Map k;
            Throwable th2;
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void d(boolean z) {
            Map d2;
            Map k;
            Throwable th;
            C9963zr f;
            this.f13736o = !z;
            C6728cil c6728cil = this.k;
            if (c6728cil != null) {
                if (z && (f = f()) != null) {
                    f.b("play");
                }
                c6728cil.n().b(this.f13736o);
                C0118e c0118e = b;
                c0118e.getLogTag();
                String k2 = c6728cil.k();
                if (this.w.getVisibility() != 0) {
                    this.w.setVisibility(0);
                }
                this.w.setViewInFocus(true);
                if (!this.w.ab()) {
                    this.d = false;
                    if (this.w.A() == PlayerState.a) {
                        this.q = -1L;
                        this.w.ak();
                        return;
                    }
                    if (this.c == null) {
                        InterfaceC6718cib interfaceC6718cib = this.r;
                        if (interfaceC6718cib == null) {
                            C8632dsu.d("");
                            interfaceC6718cib = null;
                        }
                        this.c = interfaceC6718cib.c(c6728cil, this.w.D());
                    }
                    MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = this.t;
                    AbstractC5100bsQ j = miniPlayerVideoGroupViewModel != null ? miniPlayerVideoGroupViewModel.j() : null;
                    MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel2 = this.t;
                    if (j != null && miniPlayerVideoGroupViewModel2 != null) {
                        this.q = System.currentTimeMillis();
                        this.g.w();
                        C9963zr f2 = f();
                        if (f2 != null) {
                            f2.b("attachPlaybackSessionAndPlay");
                        }
                        C9726vo.d(Integer.valueOf(c6728cil.q()), Integer.valueOf(this.w.getWidth()), new drX<Integer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$play$2
                            {
                                super(2);
                            }

                            @Override // o.drX
                            public /* synthetic */ dpR invoke(Integer num, Integer num2) {
                                a(num.intValue(), num2.intValue());
                                return dpR.c;
                            }

                            public final void a(int i, int i2) {
                                long j2 = i2 > 0 ? (i * 1000) / i2 : 100L;
                                C6733ciq.e.b.getLogTag();
                                C6733ciq.e.this.w.c(j2);
                            }
                        });
                        MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel3 = this.t;
                        if (miniPlayerVideoGroupViewModel3 != null) {
                            C5208buS e = miniPlayerVideoGroupViewModel3.b(c6728cil.o()).e();
                            C1677aKd c1677aKd = this.w;
                            C8632dsu.a(c1677aKd, "");
                            c1677aKd.e(SystemClock.elapsedRealtime(), j, e, c6728cil.y(), miniPlayerVideoGroupViewModel2.g(), c6728cil.n(), new PlaylistTimestamp(e.b(), k2, c6728cil.d()), true, this.u, null, (r27 & 1024) != 0);
                            return;
                        }
                        return;
                    } else if (miniPlayerVideoGroupViewModel2 == null || miniPlayerVideoGroupViewModel2.m() || j != null) {
                        return;
                    } else {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd("extrasFeedViewModel.videoGroup should not ne null", null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                c1596aHd.a(errorType.c() + " " + b2);
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
                }
                c0118e.getLogTag();
            }
        }

        public static /* synthetic */ void a(e eVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            eVar.e(z, z2);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:19|(1:21)(1:68)|22|(2:24|(8:26|27|28|29|30|(1:32)|33|34))|63|(1:65)(1:67)|66|27|28|29|30|(0)|33|34) */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x016e, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
            r0 = o.InterfaceC1598aHf.a;
            r0 = new o.C1596aHd("SPY-16906: Trying to reuse an active controller: old==new?: " + o.C8632dsu.c(r6, r17.k), r0, null, false, null, true, false, 84, null);
            r2 = r0.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x019a, code lost:
            if (r2 != null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x019c, code lost:
            r0.e.put("errorType", r2.c());
            r7 = r0.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x01ab, code lost:
            if (r7 != null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
            r0.a(r2.c() + " " + r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01cc, code lost:
            if (r0.b() == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01d2, code lost:
            r2 = new java.lang.Throwable(r0.b(), r0.i);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01e2, code lost:
            if (r0.b() != null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01e4, code lost:
            r2 = new java.lang.Throwable(r0.b());
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01ee, code lost:
            r2 = r0.i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01f0, code lost:
            if (r2 != null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01f2, code lost:
            if (r2 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0200, code lost:
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0201, code lost:
            r2 = new java.lang.Throwable("Handled exception with no message");
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0208, code lost:
            r7 = o.InterfaceC1601aHi.c;
            r8 = r7.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x020e, code lost:
            if (r8 != null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0210, code lost:
            r8.e(r0, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0214, code lost:
            r7.e().b(r0, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x021b, code lost:
            if (r6 != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x021d, code lost:
            r17.g.e((com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls) r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0222, code lost:
            r17.g.b((com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls) r22);
         */
        /* JADX WARN: Removed duplicated region for block: B:66:0x022f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(final com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r18, final o.InterfaceC6718cib r19, final o.InterfaceC3826bMb r20, int r21, o.C6728cil r22, java.lang.Integer r23, java.util.List<? extends java.lang.Object> r24, java.lang.String r25, o.C9686vA r26, int r27) {
            /*
                Method dump skipped, instructions count: 569
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C6733ciq.e.b(com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel, o.cib, o.bMb, int, o.cil, java.lang.Integer, java.util.List, java.lang.String, o.vA, int):void");
        }

        private final void b(C9686vA c9686vA, int i) {
            this.v.setForeground(i > 0 ? d(c9686vA, i) : null);
        }

        private final MaterialShapeDrawable d(C9686vA c9686vA, int i) {
            int i2 = c9686vA != null ? 0 : 1;
            ShapeAppearanceModel.Builder builder = ShapeAppearanceModel.builder();
            if (c9686vA != null && !c9686vA.e()) {
                builder.setTopLeftCorner(i2, c9686vA.a());
                builder.setTopRightCorner(i2, c9686vA.a());
            } else {
                builder.setTopLeftCorner(i2, 0.0f);
                builder.setTopRightCorner(i2, 0.0f);
            }
            if (c9686vA != null && !c9686vA.b()) {
                builder.setBottomLeftCorner(i2, c9686vA.a());
                builder.setBottomRightCorner(i2, c9686vA.a());
            } else {
                builder.setBottomLeftCorner(i2, 0.0f);
                builder.setBottomRightCorner(i2, 0.0f);
            }
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(builder.build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setStroke(i, LF.c(Token.Color.C0421ai.c));
            return materialShapeDrawable;
        }

        public final void c() {
            C9963zr f = f();
            if (f != null) {
                f.d();
            }
            b.getLogTag();
            MiniPlayerControls.e(this.g, false, false, false, 4, null);
        }

        public final void i() {
            C9963zr f = f();
            if (f != null) {
                f.j();
            }
            b.getLogTag();
            InterfaceC6718cib.d dVar = this.c;
            if (dVar != null) {
                InterfaceC6718cib interfaceC6718cib = this.r;
                if (interfaceC6718cib == null) {
                    C8632dsu.d("");
                    interfaceC6718cib = null;
                }
                interfaceC6718cib.e(dVar);
                this.c = null;
            }
            a(this, false, false, 2, null);
        }

        private final void j() {
            InterfaceC6718cib.d dVar = this.c;
            if (dVar != null) {
                InterfaceC6718cib interfaceC6718cib = this.r;
                if (interfaceC6718cib == null) {
                    C8632dsu.d("");
                    interfaceC6718cib = null;
                }
                interfaceC6718cib.e(dVar);
                this.c = null;
            }
            InterfaceC6718cib.d dVar2 = this.a;
            if (dVar2 != null) {
                InterfaceC6718cib interfaceC6718cib2 = this.r;
                if (interfaceC6718cib2 == null) {
                    C8632dsu.d("");
                    interfaceC6718cib2 = null;
                }
                interfaceC6718cib2.e(dVar2);
                this.a = null;
            }
        }

        public final void h() {
            C9963zr f = f();
            if (f != null) {
                f.h();
            }
            b.getLogTag();
            j();
            C6728cil c6728cil = this.k;
            if (c6728cil != null) {
                this.g.e((MiniPlayerControls) c6728cil);
                this.k = null;
            }
            this.f.clear();
            this.w.ae();
            d((MiniPlayerVideoGroupViewModel) null);
            this.g.b();
        }

        public final boolean b() {
            C9963zr f = f();
            if (f != null) {
                f.c();
            }
            C0118e c0118e = b;
            c0118e.getLogTag();
            c0118e.getLogTag();
            View view = this.itemView;
            C8632dsu.a(view, "");
            if (view instanceof ViewGroup) {
                for (View view2 : C9703vR.e((ViewGroup) view)) {
                    b.getLogTag();
                }
                return false;
            }
            return false;
        }

        private final void c(final C6728cil c6728cil) {
            CompositeDisposable compositeDisposable = this.f;
            Observable<Boolean> e = c6728cil.e();
            final drM<Boolean, Boolean> drm = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(Boolean bool) {
                    C8632dsu.c((Object) bool, "");
                    return Boolean.valueOf(C8632dsu.c(C6733ciq.e.this.k, c6728cil) && !C6733ciq.e.this.w.ab());
                }
            };
            Observable<Boolean> filter = e.filter(new Predicate() { // from class: o.cio
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean e2;
                    e2 = C6733ciq.e.e(drM.this, obj);
                    return e2;
                }
            });
            C8632dsu.a(filter, "");
            DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(filter, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C6733ciq.e.this.e(th);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    a(bool);
                    return dpR.c;
                }

                public final void a(Boolean bool) {
                    boolean g;
                    C6733ciq.e.b.getLogTag();
                    C9963zr f = C6733ciq.e.this.f();
                    if (f != null) {
                        int adapterPosition = C6733ciq.e.this.getAdapterPosition();
                        f.b("focus(" + adapterPosition + ") " + bool);
                    }
                    C8632dsu.d(bool);
                    InterfaceC6718cib interfaceC6718cib = null;
                    if (bool.booleanValue()) {
                        g = C6733ciq.e.this.g();
                        if (g) {
                            C6733ciq.e.this.g.w();
                            c6728cil.n().b(true);
                            C6733ciq.e eVar = C6733ciq.e.this;
                            InterfaceC6718cib interfaceC6718cib2 = eVar.r;
                            if (interfaceC6718cib2 == null) {
                                C8632dsu.d("");
                            } else {
                                interfaceC6718cib = interfaceC6718cib2;
                            }
                            eVar.c = interfaceC6718cib.c(c6728cil, C6733ciq.e.this.w.D());
                            C9963zr f2 = C6733ciq.e.this.f();
                            if (f2 != null) {
                                f2.b("auto-play");
                            }
                            C6733ciq.e.this.d(false);
                            return;
                        }
                        C9963zr f3 = C6733ciq.e.this.f();
                        if (f3 != null) {
                            f3.b("auto-play-disabled_Do-nothing");
                        }
                    } else if (!bool.booleanValue()) {
                        C6733ciq.e.this.d().setVisibility(0);
                        InterfaceC3826bMb interfaceC3826bMb = C6733ciq.e.this.p;
                        if (interfaceC3826bMb != null) {
                            interfaceC3826bMb.c(AbstractC3827bMc.a.b);
                        }
                        C6733ciq.e.d(C6733ciq.e.this, c6728cil, false, 2, null);
                        C9963zr f4 = C6733ciq.e.this.f();
                        if (f4 != null) {
                            f4.b("auto-play-abort");
                        }
                    } else {
                        C6733ciq.e.d(C6733ciq.e.this, c6728cil, false, 2, null);
                    }
                }
            }, 2, (Object) null));
            CompositeDisposable compositeDisposable2 = this.f;
            Observable<Boolean> distinctUntilChanged = c6728cil.g().distinctUntilChanged();
            final drM<Boolean, Boolean> drm2 = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$4
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(Boolean bool) {
                    C8632dsu.c((Object) bool, "");
                    return Boolean.valueOf(!C6733ciq.e.this.g.d());
                }
            };
            Observable<Boolean> filter2 = distinctUntilChanged.filter(new Predicate() { // from class: o.cix
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean b2;
                    b2 = C6733ciq.e.b(drM.this, obj);
                    return b2;
                }
            });
            C8632dsu.a(filter2, "");
            DisposableKt.plusAssign(compositeDisposable2, SubscribersKt.subscribeBy$default(filter2, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$5
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C6733ciq.e.this.e(th);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    c(bool);
                    return dpR.c;
                }

                public final void c(Boolean bool) {
                    C6733ciq.e.C0118e c0118e = C6733ciq.e.b;
                    c0118e.getLogTag();
                    if (C8632dsu.c(C6733ciq.e.this.k, c6728cil)) {
                        c0118e.getLogTag();
                        if (bool.booleanValue()) {
                            if (C6733ciq.e.this.w.V() && C6733ciq.e.this.d) {
                                C6733ciq.e.this.d(false);
                                C9963zr f = C6733ciq.e.this.f();
                                if (f != null) {
                                    f.b("highlight-auto-resume");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        c0118e.getLogTag();
                        C6733ciq.e.this.d = true;
                        C6733ciq.e.a(C6733ciq.e.this, false, false, 2, null);
                        C9963zr f2 = C6733ciq.e.this.f();
                        if (f2 != null) {
                            f2.b("highlight-auto-pause");
                            return;
                        }
                        return;
                    }
                    c0118e.getLogTag();
                }
            }, 2, (Object) null));
            CompositeDisposable compositeDisposable3 = this.f;
            Observable<Boolean> e2 = c6728cil.e();
            final MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$7 miniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$7 = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$7
                @Override // o.drM
                /* renamed from: d */
                public final Boolean invoke(Boolean bool) {
                    C8632dsu.c((Object) bool, "");
                    return Boolean.valueOf(!bool.booleanValue());
                }
            };
            Observable<Boolean> filter3 = e2.filter(new Predicate() { // from class: o.civ
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean f;
                    f = C6733ciq.e.f(drM.this, obj);
                    return f;
                }
            });
            C8632dsu.a(filter3, "");
            DisposableKt.plusAssign(compositeDisposable3, SubscribersKt.subscribeBy$default(filter3, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$8
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C6733ciq.e.this.e(th);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool);
                    return dpR.c;
                }

                public final void e(Boolean bool) {
                    C6733ciq.e.b.getLogTag();
                    if (C8632dsu.c(C6733ciq.e.this.k, c6728cil)) {
                        C6733ciq.e.this.w.setViewInFocus(false);
                        if (C6733ciq.e.this.w.ab()) {
                            C9963zr f = C6733ciq.e.this.f();
                            if (f != null) {
                                f.b("focus-auto-pause");
                            }
                            C6733ciq.e.a(C6733ciq.e.this, false, false, 2, null);
                        } else if (C6733ciq.e.this.d) {
                            C9963zr f2 = C6733ciq.e.this.f();
                            if (f2 != null) {
                                f2.b("focus-auto-idle");
                            }
                            C6733ciq.e.this.d().setVisibility(0);
                            InterfaceC3826bMb interfaceC3826bMb = C6733ciq.e.this.p;
                            if (interfaceC3826bMb != null) {
                                interfaceC3826bMb.c(AbstractC3827bMc.a.b);
                            }
                            MiniPlayerControls.e(C6733ciq.e.this.g, false, true, false, 4, null);
                            C6733ciq.e.d(C6733ciq.e.this, c6728cil, false, 2, null);
                            C6733ciq.e.this.d = false;
                        }
                    }
                }
            }, 2, (Object) null));
            DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(c6728cil.m(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$10
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
                    C6733ciq.e.this.e(th);
                }
            }, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Integer num) {
                    a(num.intValue());
                    return dpR.c;
                }

                public final void a(int i) {
                    boolean g;
                    MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel;
                    C6733ciq.e.b.getLogTag();
                    if (C8632dsu.c(C6733ciq.e.this.k, c6728cil)) {
                        if (C6733ciq.e.this.w.ab() || C6733ciq.e.this.w.V() || i == 41) {
                            if (i != 10) {
                                if (i != 11) {
                                    if (i == 20) {
                                        C6733ciq.e.a(C6733ciq.e.this, false, false, 2, null);
                                        return;
                                    } else if (i == 21) {
                                        C6733ciq.e.this.d(false);
                                        return;
                                    } else if (i != 30) {
                                        if (i != 31) {
                                            if (i == 40) {
                                                C6733ciq.e.this.w.setViewInFocus(false);
                                                C6733ciq.e.a(C6733ciq.e.this, false, false, 2, null);
                                                return;
                                            } else if (i != 41) {
                                                return;
                                            } else {
                                                g = C6733ciq.e.this.g();
                                                if (g) {
                                                    miniPlayerVideoGroupViewModel = C6733ciq.e.this.t;
                                                    if (miniPlayerVideoGroupViewModel != null) {
                                                        C6733ciq.e.this.d(false);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                                C6733ciq.e.this.d(true);
                                return;
                            }
                            C6733ciq.e.a(C6733ciq.e.this, true, false, 2, null);
                        }
                    }
                }
            }, 2, (Object) null));
            PublishSubject<dpR> p = c6728cil.p();
            if (p != null) {
                DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(p, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$12
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
                        C6733ciq.e.this.e(th);
                    }
                }, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$13
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(dpR dpr) {
                        e(dpr);
                        return dpR.c;
                    }

                    public final void e(dpR dpr) {
                        C9963zr f = C6733ciq.e.this.f();
                        if (f != null) {
                            f.b("Preparing");
                        }
                    }
                }, 2, (Object) null));
            }
            DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(c6728cil.t(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$14
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
                    C6733ciq.e.this.e(th);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$15
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    d(bool.booleanValue());
                    return dpR.c;
                }

                public final void d(boolean z) {
                    C9963zr f = C6733ciq.e.this.f();
                    if (f != null) {
                        f.b("portrait=" + z);
                    }
                    C6733ciq.e.this.e(!z);
                }
            }, 2, (Object) null));
            CompositeDisposable compositeDisposable4 = this.f;
            C1129Pu c1129Pu = C1129Pu.e;
            DisposableKt.plusAssign(compositeDisposable4, SubscribersKt.subscribeBy$default(((C1125Pq) C1129Pu.b(C1125Pq.class)).b(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$16
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C6733ciq.e.this.e(th);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerViewHolders$MiniPlayerViewHolder$subscribeTo$17
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool.booleanValue());
                    return dpR.c;
                }

                public final void e(boolean z) {
                    C6733ciq.e.this.w.setShouldBeMuted(z);
                    C6733ciq.e.this.g.c(z);
                }
            }, 2, (Object) null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }

        public static /* synthetic */ void d(e eVar, C6728cil c6728cil, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            eVar.b(c6728cil, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(C6728cil c6728cil, boolean z) {
            this.g.b(z);
            this.m.onNext(dpR.c);
            MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = this.t;
            boolean i = miniPlayerVideoGroupViewModel != null ? miniPlayerVideoGroupViewModel.i() : false;
            if (c6728cil.C() && i) {
                n();
            }
            InterfaceC6718cib.d dVar = this.c;
            if (dVar != null) {
                InterfaceC6718cib interfaceC6718cib = this.r;
                if (interfaceC6718cib == null) {
                    C8632dsu.d("");
                    interfaceC6718cib = null;
                }
                InterfaceC6718cib.b.d(interfaceC6718cib, dVar, null, 2, null);
                this.c = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o() {
            if (this.k != null) {
                this.h.b(AbstractC6719cic.class, new AbstractC6719cic.h(true, false));
            }
        }

        private final void n() {
            if (this.k != null) {
                this.h.b(AbstractC6719cic.class, new AbstractC6719cic.h(false, true));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(boolean z) {
            C6728cil c6728cil = this.k;
            if (c6728cil != null) {
                if (this.e || c6728cil.C()) {
                    boolean z2 = this.w.ab() || (this.w.V() && this.j);
                    this.x.invoke(this.v, Boolean.valueOf(z));
                    MiniPlayerControls.c(this.g, z, z2, false, 4, null);
                    this.v.setClipChildren(!z);
                    if (z) {
                        this.n.setVisibility(4);
                        this.v.setBackgroundColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
                        ViewParent parent = this.v.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        if (view != null) {
                            view.setBackgroundColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
                        }
                        Drawable foreground = this.v.getForeground();
                        if (foreground == null) {
                            return;
                        }
                        foreground.setAlpha(0);
                        return;
                    }
                    this.n.setVisibility(z2 ? 4 : 0);
                    this.v.setBackground(null);
                    ViewParent parent2 = this.v.getParent();
                    View view2 = parent2 instanceof View ? (View) parent2 : null;
                    if (view2 != null) {
                        view2.setBackground(null);
                    }
                    Drawable foreground2 = this.v.getForeground();
                    if (foreground2 == null) {
                        return;
                    }
                    foreground2.setAlpha(PrivateKeyType.INVALID);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean g() {
            return C6692ciB.a.a();
        }

        public final void e(boolean z, boolean z2) {
            PlayerControls.PlayerPauseType playerPauseType;
            if (this.k != null) {
                b.getLogTag();
                if (this.w.ab()) {
                    this.j = z;
                    C1677aKd c1677aKd = this.w;
                    if (z) {
                        playerPauseType = PlayerControls.PlayerPauseType.c;
                    } else {
                        playerPauseType = PlayerControls.PlayerPauseType.e;
                    }
                    c1677aKd.d(playerPauseType);
                }
                if (z) {
                    return;
                }
                this.w.setViewInFocus(false);
                if (z2) {
                    this.w.setVisibility(4);
                }
            }
        }
    }
}
