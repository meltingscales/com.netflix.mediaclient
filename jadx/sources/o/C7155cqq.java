package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.multititle.NotificationHeroModule;
import com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC7118cqF;
import o.C6004cQk;
import o.C7155cqq;
import o.C8632dsu;
import o.InterfaceC5194buE;
import o.InterfaceC5227bul;
import o.InterfaceC5238buw;
import o.dpR;

/* renamed from: o.cqq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7155cqq extends AbstractC7118cqF {
    public static final b d = new b(null);
    private boolean a;
    private Integer b;
    private final NotificationHeroModule c;
    private String e;
    private final boolean f;
    private final int h;
    private Map<NotificationHeroTitleAction, InterfaceC5198buI> i;

    /* renamed from: o.cqq$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.EPISODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoType.MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoType.SUPPLEMENTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
        }
    }

    public final NotificationHeroModule a() {
        return this.c;
    }

    @Override // o.AbstractC7118cqF
    public int d() {
        return this.h;
    }

    /* renamed from: o.cqq$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("HeroTitle");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7155cqq(NotificationHeroModule notificationHeroModule) {
        super(false, 1, null);
        C8632dsu.c((Object) notificationHeroModule, "");
        boolean z = false;
        this.c = notificationHeroModule;
        this.f = (notificationHeroModule.videoType() == VideoType.SEASON || notificationHeroModule.videoType() == VideoType.SHOW) ? true : z;
        this.h = 1;
        this.i = new LinkedHashMap();
    }

    public final List<Completable> b() {
        int d2;
        Completable complete;
        boolean g;
        this.i.clear();
        List<NotificationHeroTitleAction> actions = this.c.actions();
        C8632dsu.a(actions, "");
        d2 = C8572dqo.d(actions, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (NotificationHeroTitleAction notificationHeroTitleAction : actions) {
            String titleId = notificationHeroTitleAction.trackingInfo().titleId();
            if (titleId != null) {
                g = C8691duz.g(titleId);
                if (!g) {
                    VideoType videoType = notificationHeroTitleAction.videoType();
                    int i = videoType == null ? -1 : e.b[videoType.ordinal()];
                    if (i == 1) {
                        C8632dsu.d(notificationHeroTitleAction);
                        complete = e(notificationHeroTitleAction, titleId);
                    } else if (i == 2) {
                        C8632dsu.d(notificationHeroTitleAction);
                        complete = d(notificationHeroTitleAction, titleId);
                    } else if (i == 3) {
                        C8632dsu.d(notificationHeroTitleAction);
                        complete = b(notificationHeroTitleAction, String.valueOf(this.c.titleId()));
                    } else if (i == 4) {
                        C8632dsu.d(notificationHeroTitleAction);
                        complete = b(notificationHeroTitleAction, titleId);
                    } else {
                        complete = Completable.complete();
                        C8632dsu.a(complete, "");
                    }
                    arrayList.add(complete);
                }
            }
            complete = Completable.complete();
            arrayList.add(complete);
        }
        return arrayList;
    }

    public final boolean e() {
        return !this.i.isEmpty();
    }

    public final Completable d(final NotificationHeroTitleAction notificationHeroTitleAction, String str) {
        C8632dsu.c((Object) notificationHeroTitleAction, "");
        C8632dsu.c((Object) str, "");
        Single<C6004cQk.b<InterfaceC5227bul>> e2 = new C6004cQk().e(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, "HeroTitle");
        final drM<C6004cQk.b<InterfaceC5227bul>, dpR> drm = new drM<C6004cQk.b<InterfaceC5227bul>, dpR>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.HeroTitle$fetchEpisodeDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6004cQk.b<InterfaceC5227bul> bVar) {
                c(bVar);
                return dpR.c;
            }

            public final void c(C6004cQk.b<InterfaceC5227bul> bVar) {
                boolean z;
                InterfaceC5227bul b2 = bVar.b();
                if (b2 != null) {
                    C7155cqq.this.i.put(notificationHeroTitleAction, b2);
                    z = C7155cqq.this.f;
                    if (z) {
                        C7155cqq.this.e = b2.aK_();
                        C7155cqq.this.b = Integer.valueOf(b2.aw_());
                    }
                }
            }
        };
        Completable completable = e2.doOnSuccess(new Consumer() { // from class: o.cqs
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7155cqq.b(drM.this, obj);
            }
        }).toCompletable();
        C8632dsu.a(completable, "");
        return completable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Completable b(final NotificationHeroTitleAction notificationHeroTitleAction, String str) {
        C8632dsu.c((Object) notificationHeroTitleAction, "");
        C8632dsu.c((Object) str, "");
        Single<C6004cQk.b<InterfaceC5238buw>> a2 = new C6004cQk().a(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, "HeroTitle");
        final drM<C6004cQk.b<InterfaceC5238buw>, dpR> drm = new drM<C6004cQk.b<InterfaceC5238buw>, dpR>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.HeroTitle$fetchMovieDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6004cQk.b<InterfaceC5238buw> bVar) {
                d(bVar);
                return dpR.c;
            }

            public final void d(C6004cQk.b<InterfaceC5238buw> bVar) {
                InterfaceC5238buw b2 = bVar.b();
                if (b2 != null) {
                    C7155cqq.this.i.put(notificationHeroTitleAction, b2);
                    C7155cqq.this.a = b2.ap();
                }
            }
        };
        Completable completable = a2.doOnSuccess(new Consumer() { // from class: o.cqr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7155cqq.a(drM.this, obj);
            }
        }).toCompletable();
        C8632dsu.a(completable, "");
        return completable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Completable e(final NotificationHeroTitleAction notificationHeroTitleAction, String str) {
        C8632dsu.c((Object) notificationHeroTitleAction, "");
        C8632dsu.c((Object) str, "");
        Single<C6004cQk.b<InterfaceC5194buE>> d2 = new C6004cQk().d(str, null, TaskMode.FROM_CACHE_OR_NETWORK, "HeroTitle");
        final drM<C6004cQk.b<InterfaceC5194buE>, CompletableSource> drm = new drM<C6004cQk.b<InterfaceC5194buE>, CompletableSource>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.HeroTitle$fetchShowDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final CompletableSource invoke(C6004cQk.b<InterfaceC5194buE> bVar) {
                boolean z;
                C8632dsu.c((Object) bVar, "");
                InterfaceC5194buE b2 = bVar.b();
                if (b2 != null) {
                    C7155cqq.this.i.put(notificationHeroTitleAction, b2);
                    C7155cqq.this.a = b2.ap();
                    z = C7155cqq.this.f;
                    if (z) {
                        C7155cqq c7155cqq = C7155cqq.this;
                        NotificationHeroTitleAction notificationHeroTitleAction2 = notificationHeroTitleAction;
                        String bU_ = b2.bU_();
                        C8632dsu.a(bU_, "");
                        return c7155cqq.d(notificationHeroTitleAction2, bU_);
                    }
                    Completable complete = Completable.complete();
                    C8632dsu.d(complete);
                    return complete;
                }
                return Completable.complete();
            }
        };
        Completable flatMapCompletable = d2.flatMapCompletable(new Function() { // from class: o.cqp
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CompletableSource j;
                j = C7155cqq.j(drM.this, obj);
                return j;
            }
        });
        C8632dsu.a(flatMapCompletable, "");
        return flatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (CompletableSource) drm.invoke(obj);
    }

    /* renamed from: o.cqq$a */
    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder implements AbstractC7118cqF.a {
        private NotificationHeroTitleAction a;
        private final C7148cqj b;
        private TrackingInfo d;
        private String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7148cqj c7148cqj) {
            super(c7148cqj.d());
            C8632dsu.c((Object) c7148cqj, "");
            this.b = c7148cqj;
            c7148cqj.c.setOnClickListener(new View.OnClickListener() { // from class: o.cqv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7155cqq.a.a(C7155cqq.a.this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a aVar, View view) {
            C8632dsu.c((Object) aVar, "");
            aVar.c(aVar.d);
            Context context = aVar.itemView.getContext();
            C8632dsu.a(context, "");
            C1588aGw.e((Activity) C9737vz.e(context, NetflixActivity.class)).c(new Intent("android.intent.action.VIEW", Uri.parse(aVar.e)));
        }

        private final void c(TrackingInfo trackingInfo) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.notificationLandingItem, trackingInfo), (Command) new ViewDetailsCommand(), true);
        }

        public final dpR d(C7155cqq c7155cqq, Integer num, float f) {
            Object obj;
            boolean a;
            Object obj2;
            boolean a2;
            boolean a3;
            boolean a4;
            C8632dsu.c((Object) c7155cqq, "");
            NotificationHeroModule a5 = c7155cqq.a();
            if (num != null) {
                this.b.c.getLayoutParams().width = num.intValue();
                this.b.c.getLayoutParams().height = (int) (num.intValue() / f);
            }
            this.b.c.showImage(new ShowImageRequest().a(a5.heroImageWebp()).c(ShowImageRequest.Priority.a));
            this.b.e.setText(a5.bodyCopy());
            this.b.b.c(c7155cqq.e, c7155cqq.b);
            List<NotificationHeroTitleAction> actions = a5.actions();
            C8632dsu.a(actions, "");
            for (NotificationHeroTitleAction notificationHeroTitleAction : actions) {
                InterfaceC5198buI interfaceC5198buI = (InterfaceC5198buI) c7155cqq.i.get(notificationHeroTitleAction);
                if (interfaceC5198buI != null) {
                    a4 = C8691duz.a(notificationHeroTitleAction.actionType(), "add", true);
                    if (a4) {
                        this.b.b.a();
                    }
                    C7161cqw c7161cqw = this.b.b;
                    C8632dsu.d(notificationHeroTitleAction);
                    c7161cqw.e(notificationHeroTitleAction, interfaceC5198buI);
                }
            }
            this.b.b.e(c7155cqq.a);
            List<NotificationHeroTitleAction> actions2 = a5.actions();
            C8632dsu.a(actions2, "");
            Iterator<T> it = actions2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                a3 = C8691duz.a(((NotificationHeroTitleAction) obj).actionType(), SignupConstants.Field.VIDEO_TITLE, true);
                if (a3) {
                    break;
                }
            }
            NotificationHeroTitleAction notificationHeroTitleAction2 = (NotificationHeroTitleAction) obj;
            if (notificationHeroTitleAction2 == null) {
                List<NotificationHeroTitleAction> actions3 = a5.actions();
                C8632dsu.a(actions3, "");
                Iterator<T> it2 = actions3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    a2 = C8691duz.a(((NotificationHeroTitleAction) obj2).actionType(), "watch", true);
                    if (a2) {
                        break;
                    }
                }
                notificationHeroTitleAction2 = (NotificationHeroTitleAction) obj2;
            }
            this.a = notificationHeroTitleAction2;
            if (notificationHeroTitleAction2 != null) {
                a = C8691duz.a(notificationHeroTitleAction2.actionType(), SignupConstants.Field.VIDEO_TITLE, true);
                if (a) {
                    this.b.d.setVisibility(0);
                }
                this.d = CLv2Utils.a(notificationHeroTitleAction2.trackingInfo());
                this.e = notificationHeroTitleAction2.action();
                return dpR.c;
            }
            return null;
        }

        @Override // o.AbstractC7118cqF.a
        public void a() {
            this.b.b.d();
        }
    }
}
