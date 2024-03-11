package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.Subject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C5528cAt;
import o.C8194dfl;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC8612dsa;
import o.cBO;
import o.cHK;
import o.cHL;
import o.dpR;

/* loaded from: classes4.dex */
public final class cHL extends AbstractC5765cHn {
    public static final a d = new a(null);
    private final C9935zP a;
    private final NetflixActivity b;
    private final CompositeDisposable c;
    private final ViewGroup e;
    private final InterfaceC7613czX f;
    private boolean g;
    private final PostPlayExperience h;
    private final Subject<cBO> j;
    private final InterfaceC8554dpx n;

    /* renamed from: o  reason: collision with root package name */
    private final FrameLayout f13661o;

    @Override // o.AbstractC9944zY
    /* renamed from: i */
    public FrameLayout e() {
        return this.f13661o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHL(ViewGroup viewGroup, PostPlayExperience postPlayExperience, Subject<cBO> subject, C9935zP c9935zP, NetflixActivity netflixActivity) {
        super(viewGroup);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) postPlayExperience, "");
        C8632dsu.c((Object) subject, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) netflixActivity, "");
        this.e = viewGroup;
        this.h = postPlayExperience;
        this.j = subject;
        this.a = c9935zP;
        this.b = netflixActivity;
        this.f13661o = new FrameLayout(viewGroup.getContext());
        this.f = aGP.e(netflixActivity).a().c(c9935zP, postPlayExperience.getAutoplay());
        this.c = new CompositeDisposable();
        b = dpB.b(new drO<List<? extends C5528cAt>>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayMultiItemPreviewsUIView$previewVideoInfos$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final List<C5528cAt> invoke() {
                PostPlayExperience postPlayExperience2;
                PostPlayAction e;
                PostPlayAction c;
                PostPlayAction d2;
                postPlayExperience2 = cHL.this.h;
                List<PostPlayItem> items = postPlayExperience2.getItems();
                C8632dsu.a(items, "");
                cHL chl = cHL.this;
                ArrayList arrayList = new ArrayList();
                for (final PostPlayItem postPlayItem : items) {
                    C8632dsu.d(postPlayItem);
                    e = chl.e(postPlayItem);
                    c = chl.c(postPlayItem);
                    d2 = chl.d(postPlayItem);
                    C5528cAt c5528cAt = (C5528cAt) C9726vo.d(e, c, d2, new InterfaceC8612dsa<PostPlayAction, PostPlayAction, PostPlayAction, C5528cAt>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayMultiItemPreviewsUIView$previewVideoInfos$2$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        /* renamed from: a */
                        public final C5528cAt invoke(PostPlayAction postPlayAction, PostPlayAction postPlayAction2, PostPlayAction postPlayAction3) {
                            C8632dsu.c((Object) postPlayAction, "");
                            C8632dsu.c((Object) postPlayAction2, "");
                            C8632dsu.c((Object) postPlayAction3, "");
                            TrackingInfoHolder a2 = C8194dfl.a(String.valueOf(postPlayAction.getVideoId()), "200117426");
                            String url = PostPlayItem.this.getBackgroundAsset().getUrl();
                            Integer videoId = PostPlayItem.this.getVideoId();
                            int videoId2 = postPlayAction.getVideoId();
                            VideoType videoType = postPlayAction.getVideoType();
                            String url2 = PostPlayItem.this.getLogoAsset().getUrl();
                            int runtimeSeconds = postPlayAction.getRuntimeSeconds();
                            Integer year = PostPlayItem.this.getYear();
                            String maturityRating = PostPlayItem.this.getMaturityRating();
                            int runtime = PostPlayItem.this.getRuntime();
                            String seasonNumLabel = PostPlayItem.this.getSeasonNumLabel();
                            int videoId3 = postPlayAction.getVideoId();
                            C8632dsu.d(a2);
                            C5528cAt.c cVar = new C5528cAt.c(String.valueOf(videoId3), a2);
                            boolean isInMyList = postPlayAction2.isInMyList();
                            C8632dsu.d(videoId);
                            int intValue = videoId.intValue();
                            C8632dsu.d(videoType);
                            C8632dsu.d((Object) url);
                            C8632dsu.d((Object) url2);
                            C8632dsu.d(year);
                            int intValue2 = year.intValue();
                            C8632dsu.d((Object) maturityRating);
                            return new C5528cAt(intValue, videoId2, videoType, url, url2, runtimeSeconds, intValue2, maturityRating, runtime, seasonNumLabel, postPlayAction3, postPlayAction2, cVar, isInMyList);
                        }
                    });
                    if (c5528cAt != null) {
                        arrayList.add(c5528cAt);
                    }
                }
                return arrayList.subList(0, 3);
            }
        });
        this.n = b;
        viewGroup.addView(e(), -1, -1);
        n();
        a(c9935zP);
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PostPlayPreviewsMultiItemPreviewsUIView");
        }
    }

    private final List<C5528cAt> j() {
        return (List) this.n.getValue();
    }

    private final void n() {
        Display display;
        Display defaultDisplay;
        Integer num = null;
        if (Build.VERSION.SDK_INT < 30) {
            Object systemService = this.b.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                num = Integer.valueOf(defaultDisplay.getRotation());
            }
        } else {
            display = this.b.getDisplay();
            if (display != null) {
                num = Integer.valueOf(display.getRotation());
            }
        }
        this.b.setRequestedOrientation((num != null && num.intValue() == 3) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i) {
        Object obj;
        PostPlayAction e;
        List<PostPlayItem> items = this.h.getItems();
        C8632dsu.a(items, "");
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer videoId = ((PostPlayItem) obj).getVideoId();
            if (videoId != null && videoId.intValue() == i) {
                break;
            }
        }
        PostPlayItem postPlayItem = (PostPlayItem) obj;
        if (postPlayItem == null || (e = e(postPlayItem)) == null) {
            return;
        }
        this.j.onNext(new cBO.ab(postPlayItem, e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        Object obj;
        PostPlayAction d2;
        List<PostPlayItem> items = this.h.getItems();
        C8632dsu.a(items, "");
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer videoId = ((PostPlayItem) obj).getVideoId();
            if (videoId != null && videoId.intValue() == i) {
                break;
            }
        }
        PostPlayItem postPlayItem = (PostPlayItem) obj;
        if (postPlayItem != null && (d2 = d(postPlayItem)) != null) {
            this.j.onNext(new cBO.V(postPlayItem, d2));
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostPlayAction d(PostPlayItem postPlayItem) {
        Object obj;
        boolean d2;
        List<PostPlayAction> actions = postPlayItem.getActions();
        C8632dsu.a(actions, "");
        Iterator<T> it = actions.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            PostPlayAction postPlayAction = (PostPlayAction) next;
            if (!C8632dsu.c((Object) postPlayAction.getName(), (Object) "playTrailer")) {
                String name = postPlayAction.getName();
                C8632dsu.a(name, "");
                d2 = duD.d((CharSequence) name, (CharSequence) "play", false, 2, (Object) null);
                if (d2) {
                    obj = next;
                    break;
                }
            }
        }
        return (PostPlayAction) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostPlayAction c(PostPlayItem postPlayItem) {
        Object obj;
        List<PostPlayAction> actions = postPlayItem.getActions();
        C8632dsu.a(actions, "");
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((PostPlayAction) obj).getName(), (Object) "addToMyList")) {
                break;
            }
        }
        return (PostPlayAction) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostPlayAction e(PostPlayItem postPlayItem) {
        Object obj;
        List<PostPlayAction> actions = postPlayItem.getActions();
        C8632dsu.a(actions, "");
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((PostPlayAction) obj).getName(), (Object) "playTrailer")) {
                break;
            }
        }
        return (PostPlayAction) obj;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        this.j.onNext(new cBO.C5572h(false));
        this.j.onNext(cBO.ac.b);
        if (e().getChildCount() == 0) {
            e().addView(f(), -1, -1);
            this.f.e(j());
        }
        e().animate().alpha(1.0f).setDuration(300L).start();
    }

    public final void d(int i) {
        this.g = true;
        this.f.c(i);
    }

    public final void g() {
        this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayMultiItemPreviewsUIView$prefetchPreviewAssets$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                CompositeDisposable compositeDisposable;
                C8632dsu.c((Object) lifecycleOwner, "");
                super.onDestroy(lifecycleOwner);
                compositeDisposable = cHL.this.c;
                compositeDisposable.clear();
            }
        });
        for (C5528cAt c5528cAt : j()) {
            c(c5528cAt.d());
            c(c5528cAt.e());
        }
    }

    private final void c(String str) {
        CompositeDisposable compositeDisposable = this.c;
        Disposable subscribe = InterfaceC9638uF.a.d(this.b).d(C9646uN.d.a().e(str).b()).subscribe();
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        this.j.onNext(cBO.aa.e);
        this.f.d();
    }

    private final View f() {
        return this.f.e();
    }

    @SuppressLint({"CheckResult"})
    private final void a(C9935zP c9935zP) {
        Observable takeUntil = c9935zP.d(cHK.class).takeUntil(this.b.getActivityDestroy());
        final drM<cHK, dpR> drm = new drM<cHK, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayMultiItemPreviewsUIView$subscribeToEvents$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cHK chk) {
                e(chk);
                return dpR.c;
            }

            public final void e(cHK chk) {
                Subject subject;
                Subject subject2;
                if (chk instanceof cHK.i) {
                    cHL.this.c(((cHK.i) chk).d());
                } else if (chk instanceof cHK.d) {
                    subject2 = cHL.this.j;
                    subject2.onNext(cBO.C5567c.c);
                } else if (chk instanceof cHK.f) {
                    subject = cHL.this.j;
                    subject.onNext(cBO.U.b);
                } else if (chk instanceof cHK.c) {
                    cHL.this.a(((cHK.c) chk).e());
                }
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: o.cHO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cHL.d(drM.this, obj);
            }
        });
    }
}
