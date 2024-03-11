package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PushConsentOnRemindMe;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Set;
import java.util.concurrent.CancellationException;
import o.AbstractC7019coK;
import o.AbstractC7938dau;
import o.C7939dav;
import o.C7942day;
import o.C7975dbe;
import o.C8632dsu;
import o.InterfaceC3643bFl;
import o.bNK;
import o.dpR;
import o.dqP;

/* renamed from: o.day  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7942day {
    public static final a d = new a(null);
    private final C1758aNd a;
    private final InterfaceC7020coL b;
    private final bNS c;
    private final NetflixActivity e;
    private final C1767aNm f;
    private final InterfaceC1126Pr g;
    private final InterfaceC7090cpe h;
    private final Lazy<PlaybackLauncher> i;
    private final InterfaceC7089cpd j;
    private final UpNextFeedFragment k;
    private final C7975dbe l;

    public C7942day(NetflixActivity netflixActivity, UpNextFeedFragment upNextFeedFragment, InterfaceC1126Pr interfaceC1126Pr, C7975dbe c7975dbe, bNS bns, Lazy<PlaybackLauncher> lazy, InterfaceC7090cpe interfaceC7090cpe, InterfaceC7089cpd interfaceC7089cpd, InterfaceC7020coL interfaceC7020coL) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) upNextFeedFragment, "");
        C8632dsu.c((Object) interfaceC1126Pr, "");
        C8632dsu.c((Object) c7975dbe, "");
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) interfaceC7090cpe, "");
        C8632dsu.c((Object) interfaceC7089cpd, "");
        C8632dsu.c((Object) interfaceC7020coL, "");
        this.e = netflixActivity;
        this.k = upNextFeedFragment;
        this.g = interfaceC1126Pr;
        this.l = c7975dbe;
        this.c = bns;
        this.i = lazy;
        this.h = interfaceC7090cpe;
        this.j = interfaceC7089cpd;
        this.b = interfaceC7020coL;
        Observable subscribeOn = Observable.create(new b(upNextFeedFragment)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        this.a = new C1758aNd(subscribeOn);
        Observable subscribeOn2 = Observable.create(new c(upNextFeedFragment)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn2, "");
        this.f = new C1767aNm(subscribeOn2);
    }

    /* renamed from: o.day$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("UpNextEventHandler");
        }
    }

    public final void a(final AbstractC7938dau abstractC7938dau) {
        C8632dsu.c((Object) abstractC7938dau, "");
        if (abstractC7938dau instanceof AbstractC7938dau.h) {
            AbstractC7938dau.h hVar = (AbstractC7938dau.h) abstractC7938dau;
            AppView a2 = hVar.a();
            if (a2 == null) {
                a2 = this.k.bh_();
            }
            PlaybackLauncher playbackLauncher = this.i.get();
            C8632dsu.a(playbackLauncher, "");
            InterfaceC5160btX aE_ = hVar.c().aE_();
            C8632dsu.a(aE_, "");
            VideoType type = hVar.c().getType();
            C8632dsu.a(type, "");
            PlayContextImp b2 = TrackingInfoHolder.b(hVar.b(), false, 1, null);
            PlayerExtras playerExtras = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
            playerExtras.a(a2);
            dpR dpr = dpR.c;
            PlaybackLauncher.b.a(playbackLauncher, aE_, type, b2, playerExtras, null, 16, null);
        } else if (abstractC7938dau instanceof AbstractC7938dau.j) {
            AbstractC7938dau.j jVar = (AbstractC7938dau.j) abstractC7938dau;
            this.g.a(jVar.e(), jVar.a());
        } else if (abstractC7938dau instanceof AbstractC7938dau.c) {
            if (this.b.a(this.e)) {
                AbstractC7938dau.c cVar = (AbstractC7938dau.c) abstractC7938dau;
                if (cVar.a() != AppView.synopsisEvidence) {
                    Long startSession = Logger.INSTANCE.startSession(new Navigate(cVar.a(), this.e.getUiScreen(), CommandValue.ViewDetailsCommand, TrackingInfoHolder.e(cVar.d(), null, 1, null)));
                    NetflixActivity netflixActivity = this.e;
                    AbstractC7019coK.a aVar = new AbstractC7019coK.a(cVar.b(), startSession);
                    C9935zP d2 = C9935zP.b.d(netflixActivity);
                    d2.d(AbstractC7019coK.a.class);
                    d2.b(AbstractC7019coK.a.class, aVar);
                    return;
                }
                return;
            }
            AbstractC7938dau.c cVar2 = (AbstractC7938dau.c) abstractC7938dau;
            CLv2Utils.INSTANCE.b(cVar2.a(), CommandValue.ViewDetailsCommand, TrackingInfoHolder.e(cVar2.d(), null, 1, null));
            InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(this.e), this.e, cVar2.f(), cVar2.b(), cVar2.e(), cVar2.d(), cVar2.c(), null, 64, null);
        } else if (C8632dsu.c(abstractC7938dau, AbstractC7938dau.f.a)) {
            this.l.a(true);
        } else if (!(abstractC7938dau instanceof AbstractC7938dau.g)) {
            if (!(abstractC7938dau instanceof AbstractC7938dau.i)) {
                if (abstractC7938dau instanceof AbstractC7938dau.a) {
                    bNS bns = this.c;
                    AbstractC7938dau.a aVar2 = (AbstractC7938dau.a) abstractC7938dau;
                    TrackingInfoHolder e = aVar2.e();
                    bNK.e eVar = bNK.c;
                    NetflixActivity netflixActivity2 = this.e;
                    String k = aVar2.a().k();
                    C8632dsu.d((Object) k);
                    String a3 = AbstractC8266dhD.a();
                    C8632dsu.a(a3, "");
                    String title = aVar2.a().getTitle();
                    C8632dsu.a(title, "");
                    bns.c(e, eVar.e(netflixActivity2, k, a3, title, aVar2.d(), aVar2.a().h()));
                    return;
                } else if (!(abstractC7938dau instanceof AbstractC7938dau.d)) {
                    if (!(abstractC7938dau instanceof AbstractC7938dau.e)) {
                        if (abstractC7938dau instanceof AbstractC7938dau.b) {
                            AbstractC7938dau.b bVar = (AbstractC7938dau.b) abstractC7938dau;
                            Long startSession2 = Logger.INSTANCE.startSession(new Navigate(bVar.b(), this.e.getUiScreen(), CommandValue.SignUpCommand, TrackingInfoHolder.e(bVar.c(), null, 1, null)));
                            NetflixActivity netflixActivity3 = this.e;
                            AbstractC7019coK.a aVar3 = new AbstractC7019coK.a(bVar.a(), startSession2);
                            C9935zP d3 = C9935zP.b.d(netflixActivity3);
                            d3.d(AbstractC7019coK.a.class);
                            d3.b(AbstractC7019coK.a.class, aVar3);
                            return;
                        }
                        return;
                    }
                    d.getLogTag();
                    AbstractC7938dau.e eVar2 = (AbstractC7938dau.e) abstractC7938dau;
                    this.l.c(eVar2.d(), eVar2.e());
                    return;
                } else {
                    d.getLogTag();
                    AbstractC7938dau.d dVar = (AbstractC7938dau.d) abstractC7938dau;
                    this.l.b(dVar.d(), dVar.b());
                    return;
                }
            }
            d.getLogTag();
            AbstractC7938dau.i iVar = (AbstractC7938dau.i) abstractC7938dau;
            if (iVar.a()) {
                if (Config_FastProperty_PushConsentOnRemindMe.Companion.a() && !this.j.b()) {
                    this.h.d(iVar.c());
                } else if (!this.b.a(this.e)) {
                    C8054ddD.c(this.e, C7939dav.i.e, 1);
                }
            }
            this.f.c(iVar.d(), iVar.j(), iVar.a(), this.k.bh_(), iVar.e(), (r17 & 32) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextEventHandler$handleEvent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    d(bool.booleanValue());
                    return dpR.c;
                }

                public final void d(boolean z) {
                    C7975dbe c7975dbe;
                    Set<Integer> a4;
                    C7942day.d.getLogTag();
                    c7975dbe = C7942day.this.l;
                    a4 = dqP.a(Integer.valueOf(((AbstractC7938dau.i) abstractC7938dau).b()));
                    c7975dbe.d(a4);
                }
            });
        } else {
            d.getLogTag();
            AbstractC7938dau.g gVar = (AbstractC7938dau.g) abstractC7938dau;
            if (gVar.e()) {
                C8054ddD.c(this.e, gVar.a() == VideoType.GAMES ? C7939dav.i.b : C7939dav.i.c, 1);
            }
            this.a.b(gVar.c(), gVar.a(), gVar.e(), this.k.bh_(), gVar.d(), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextEventHandler$handleEvent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    a(bool.booleanValue());
                    return dpR.c;
                }

                public final void a(boolean z) {
                    C7975dbe c7975dbe;
                    Set<Integer> a4;
                    C7942day.d.getLogTag();
                    c7975dbe = C7942day.this.l;
                    a4 = dqP.a(Integer.valueOf(((AbstractC7938dau.g) abstractC7938dau).b()));
                    c7975dbe.d(a4);
                }
            });
        }
    }

    /* renamed from: o.day$b */
    /* loaded from: classes5.dex */
    public static final class b<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner b;

        public b(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.b;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextEventHandler$special$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    /* renamed from: o.day$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner c;

        public c(LifecycleOwner lifecycleOwner) {
            this.c = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.c;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.c.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextEventHandler$special$$inlined$createDestroyObservable$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }
}
