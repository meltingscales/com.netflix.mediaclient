package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PushConsentOnRemindMe;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.CancellationException;
import o.AbstractC6233cYu;
import o.C4022bTi;
import o.C4027bTn;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import o.InterfaceC3643bFl;
import o.bNK;
import o.bTF;
import o.dpR;

/* renamed from: o.bTn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4027bTn {
    public static final c c = new c(null);
    private final FeedLolomoFragment a;
    private final bTF b;
    private final bNS d;
    private final C1758aNd e;
    private final NetflixActivity f;
    private final Lazy<PlaybackLauncher> g;
    private final InterfaceC7090cpe h;
    private final C1767aNm i;
    private final InterfaceC7089cpd j;
    private final InterfaceC1126Pr k;

    public C4027bTn(NetflixActivity netflixActivity, FeedLolomoFragment feedLolomoFragment, InterfaceC1126Pr interfaceC1126Pr, bTF btf, bNS bns, Lazy<PlaybackLauncher> lazy, InterfaceC7090cpe interfaceC7090cpe, InterfaceC7089cpd interfaceC7089cpd) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) feedLolomoFragment, "");
        C8632dsu.c((Object) interfaceC1126Pr, "");
        C8632dsu.c((Object) btf, "");
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) interfaceC7090cpe, "");
        C8632dsu.c((Object) interfaceC7089cpd, "");
        this.f = netflixActivity;
        this.a = feedLolomoFragment;
        this.k = interfaceC1126Pr;
        this.b = btf;
        this.d = bns;
        this.g = lazy;
        this.h = interfaceC7090cpe;
        this.j = interfaceC7089cpd;
        Observable subscribeOn = Observable.create(new b(feedLolomoFragment)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        this.e = new C1758aNd(subscribeOn);
        Observable subscribeOn2 = Observable.create(new a(feedLolomoFragment)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn2, "");
        this.i = new C1767aNm(subscribeOn2);
    }

    /* renamed from: o.bTn$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("FeedEventHandler");
        }
    }

    public final void d(final AbstractC6233cYu abstractC6233cYu) {
        C8632dsu.c((Object) abstractC6233cYu, "");
        if (abstractC6233cYu instanceof AbstractC6233cYu.e) {
            AbstractC6233cYu.e eVar = (AbstractC6233cYu.e) abstractC6233cYu;
            AppView e = eVar.e();
            if (e == null) {
                e = this.a.bh_();
            }
            PlaybackLauncher playbackLauncher = this.g.get();
            C8632dsu.a(playbackLauncher, "");
            int u = eVar.d().u();
            VideoType y = eVar.d().y();
            PlayContextImp b2 = TrackingInfoHolder.b(eVar.a(), false, 1, null);
            PlayerExtras playerExtras = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
            playerExtras.a(e);
            dpR dpr = dpR.c;
            PlaybackLauncher.b.e(playbackLauncher, String.valueOf(u), y, b2, playerExtras, this.f, null, 32, null);
        } else if (abstractC6233cYu instanceof AbstractC6233cYu.c) {
            AbstractC6233cYu.c cVar = (AbstractC6233cYu.c) abstractC6233cYu;
            TrailerItem d = cVar.d();
            if (d.C()) {
                InterfaceC1126Pr interfaceC1126Pr = this.k;
                int u2 = d.u();
                VideoType y2 = d.y();
                String v = d.v();
                interfaceC1126Pr.e(String.valueOf(u2), y2, v != null ? v : "", cVar.c());
                return;
            }
            InterfaceC1126Pr interfaceC1126Pr2 = this.k;
            int u3 = d.u();
            VideoType y3 = d.y();
            String v2 = d.v();
            interfaceC1126Pr2.c(String.valueOf(u3), y3, v2 != null ? v2 : "", cVar.c());
        } else if (abstractC6233cYu instanceof AbstractC6233cYu.a) {
            AbstractC6233cYu.a aVar = (AbstractC6233cYu.a) abstractC6233cYu;
            CLv2Utils.INSTANCE.b(aVar.e(), CommandValue.ViewDetailsCommand, TrackingInfoHolder.e(aVar.d(), null, 1, null));
            InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(this.f), this.f, aVar.j(), aVar.a(), aVar.c(), aVar.d(), aVar.b(), null, 64, null);
        } else if (abstractC6233cYu instanceof AbstractC6233cYu.d) {
            bTF.c(this.b, 0, 0, null, 7, null);
            AbstractC6233cYu.d dVar = (AbstractC6233cYu.d) abstractC6233cYu;
            LoMo b3 = dVar.b();
            if (b3 == null) {
                c.getLogTag();
                InterfaceC1593aHa.c.a("HomeEvent.Retry: fetchLolomo is called with RefreshType.HARD");
                bTF.c(this.b, 1, 0, null, 6, null);
                return;
            }
            c.getLogTag();
            InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
            String listId = b3.getListId();
            String listContext = b3.getListContext();
            int listPos = b3.getListPos();
            int d2 = dVar.d();
            aVar2.a("HomeEvent.Retry: fetchTitles is called for listId = " + listId + " listContext = " + listContext + " listPosition = " + listPos + " from = " + d2);
            bTF.a(this.b, b3, dVar.d(), false, 4, (Object) null);
        } else if (!(abstractC6233cYu instanceof AbstractC6233cYu.i)) {
            if (!(abstractC6233cYu instanceof AbstractC6233cYu.g)) {
                if (abstractC6233cYu instanceof AbstractC6233cYu.b) {
                    bNS bns = this.d;
                    AbstractC6233cYu.b bVar = (AbstractC6233cYu.b) abstractC6233cYu;
                    TrackingInfoHolder c2 = bVar.c();
                    bNK.e eVar2 = bNK.c;
                    NetflixActivity netflixActivity = this.f;
                    String d3 = bVar.d();
                    String a2 = AbstractC8266dhD.a();
                    C8632dsu.a(a2, "");
                    String e2 = bVar.e();
                    if (e2 == null) {
                        e2 = "";
                    }
                    bns.c(c2, eVar2.e(netflixActivity, d3, a2, e2, bVar.a(), bVar.b()));
                    return;
                }
                return;
            }
            c.getLogTag();
            AbstractC6233cYu.g gVar = (AbstractC6233cYu.g) abstractC6233cYu;
            if (gVar.a()) {
                if (Config_FastProperty_PushConsentOnRemindMe.Companion.a() && !this.j.b()) {
                    this.h.d(gVar.b());
                } else {
                    C8054ddD.c(this.f, C4022bTi.g.i, 1);
                }
            }
            this.i.c(gVar.e(), gVar.f(), gVar.a(), this.a.bh_(), gVar.d(), (r17 & 32) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedEventHandler$handleEvent$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool.booleanValue());
                    return dpR.c;
                }

                public final void e(boolean z) {
                    bTF btf;
                    C4027bTn.c.getLogTag();
                    btf = C4027bTn.this.b;
                    btf.a(((AbstractC6233cYu.g) abstractC6233cYu).e(), ((AbstractC6233cYu.g) abstractC6233cYu).c());
                }
            });
        } else {
            c.getLogTag();
            AbstractC6233cYu.i iVar = (AbstractC6233cYu.i) abstractC6233cYu;
            if (iVar.a()) {
                C8054ddD.c(this.f, iVar.d() == VideoType.GAMES ? C4022bTi.g.c : C4022bTi.g.e, 1);
            }
            this.e.b(iVar.c(), iVar.d(), iVar.a(), this.a.bh_(), iVar.b(), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedEventHandler$handleEvent$5
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
                    bTF btf;
                    C4027bTn.c.getLogTag();
                    btf = C4027bTn.this.b;
                    btf.a(((AbstractC6233cYu.i) abstractC6233cYu).c(), ((AbstractC6233cYu.i) abstractC6233cYu).e());
                }
            });
        }
    }

    /* renamed from: o.bTn$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner d;

        public a(LifecycleOwner lifecycleOwner) {
            this.d = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.d;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.d.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedEventHandler$special$$inlined$createDestroyObservable$2$1
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

    /* renamed from: o.bTn$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner e;

        public b(LifecycleOwner lifecycleOwner) {
            this.e = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.e;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.e.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedEventHandler$special$$inlined$createDestroyObservable$1$1
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
