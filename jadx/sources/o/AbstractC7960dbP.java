package o;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.ArtworkColors;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7960dbP;
import o.C6472cdu;
import o.C7939dav;
import o.C8632dsu;
import o.C9737vz;
import o.dpR;

/* renamed from: o.dbP  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7960dbP extends AbstractC3336ax<e> {
    public C7965dbU c;
    private String j;
    private int k;
    private String m;

    /* renamed from: o  reason: collision with root package name */
    private View.OnClickListener f13824o;
    public static final c b = new c(null);
    private static final Object h = new Object();
    private static final Map<String, C6472cdu.b> d = new LinkedHashMap();
    private static final int f = Color.parseColor("#660000");
    private static final LinkedList<String> i = new LinkedList<>();
    private static final Set<String> g = new LinkedHashSet();

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.ad;
    }

    public final void an_(String str) {
        this.j = str;
    }

    public final void ao_(String str) {
        this.m = str;
    }

    public final void e(int i2) {
        this.k = i2;
    }

    public final String m() {
        return this.j;
    }

    public final String q() {
        return this.m;
    }

    public final View.OnClickListener r() {
        return this.f13824o;
    }

    public final int s() {
        return this.k;
    }

    /* renamed from: o.dbP$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Top10NumberModel");
        }

        public final void b(final FragmentActivity fragmentActivity, final String str) {
            C8632dsu.c((Object) fragmentActivity, "");
            C8632dsu.c((Object) str, "");
            if (AbstractC7960dbP.d.get(str) != null) {
                return;
            }
            synchronized (AbstractC7960dbP.h) {
                if (!AbstractC7960dbP.i.contains(str) && !AbstractC7960dbP.g.contains(str)) {
                    c cVar = AbstractC7960dbP.b;
                    if (AbstractC7960dbP.g.size() >= 3) {
                        AbstractC7960dbP.i.push(str);
                    } else {
                        AbstractC7960dbP.g.add(str);
                        C8187dfe.c(new Runnable() { // from class: o.dbN
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC7960dbP.c.a(FragmentActivity.this, str);
                            }
                        });
                    }
                }
                dpR dpr = dpR.c;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(final FragmentActivity fragmentActivity, final String str) {
            C8632dsu.c((Object) fragmentActivity, "");
            C8632dsu.c((Object) str, "");
            AbstractC7960dbP.b.e(fragmentActivity, str, new drM<C6472cdu.b, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$prefetchColor$1$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6472cdu.b bVar) {
                    a(bVar);
                    return dpR.c;
                }

                public final void a(C6472cdu.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    AbstractC7960dbP.b.d(FragmentActivity.this, str, true);
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$prefetchColor$1$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    AbstractC7960dbP.b.d(FragmentActivity.this, str, false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(FragmentActivity fragmentActivity, String str, boolean z) {
            synchronized (AbstractC7960dbP.h) {
                AbstractC7960dbP.g.remove(str);
                AbstractC7960dbP.b.c(fragmentActivity);
                dpR dpr = dpR.c;
            }
        }

        private final void c(final FragmentActivity fragmentActivity) {
            synchronized (AbstractC7960dbP.h) {
                if (!AbstractC7960dbP.i.isEmpty()) {
                    final String str = (String) AbstractC7960dbP.i.pop();
                    Set set = AbstractC7960dbP.g;
                    C8632dsu.d((Object) str);
                    set.add(str);
                    C8187dfe.c(new Runnable() { // from class: o.dbR
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC7960dbP.c.c(FragmentActivity.this, str);
                        }
                    });
                }
                if (AbstractC7960dbP.g.isEmpty()) {
                    c cVar = AbstractC7960dbP.b;
                }
                dpR dpr = dpR.c;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final FragmentActivity fragmentActivity, final String str) {
            C8632dsu.c((Object) fragmentActivity, "");
            c cVar = AbstractC7960dbP.b;
            C8632dsu.d((Object) str);
            cVar.e(fragmentActivity, str, new drM<C6472cdu.b, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$processNextUrlFromQueue$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6472cdu.b bVar) {
                    e(bVar);
                    return dpR.c;
                }

                public final void e(C6472cdu.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    AbstractC7960dbP.c cVar2 = AbstractC7960dbP.b;
                    FragmentActivity fragmentActivity2 = FragmentActivity.this;
                    String str2 = str;
                    C8632dsu.a(str2, "");
                    cVar2.d(fragmentActivity2, str2, true);
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$processNextUrlFromQueue$1$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    AbstractC7960dbP.c cVar2 = AbstractC7960dbP.b;
                    FragmentActivity fragmentActivity2 = FragmentActivity.this;
                    String str2 = str;
                    C8632dsu.a(str2, "");
                    cVar2.d(fragmentActivity2, str2, false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Disposable e(FragmentActivity fragmentActivity, final String str, final drM<? super C6472cdu.b, dpR> drm, final drO<dpR> dro) {
            C6472cdu.b bVar = (C6472cdu.b) AbstractC7960dbP.d.get(str);
            if (bVar != null) {
                drm.invoke(bVar);
                return null;
            }
            Single<GetImageRequest.a> b = InterfaceC9638uF.a.d(fragmentActivity).b(GetImageRequest.c.d(fragmentActivity).a(str).a());
            final drM<GetImageRequest.a, SingleSource<? extends C6472cdu.b>> drm2 = new drM<GetImageRequest.a, SingleSource<? extends C6472cdu.b>>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$fetchImageAndCalculateColor$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final SingleSource<? extends C6472cdu.b> invoke(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    C6472cdu c6472cdu = C6472cdu.b;
                    return c6472cdu.b(aVar.b(), str, c6472cdu.d(aVar.b()), false);
                }
            };
            Single observeOn = b.flatMap(new Function() { // from class: o.dbQ
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    SingleSource e;
                    e = AbstractC7960dbP.c.e(drM.this, obj);
                    return e;
                }
            }).observeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(observeOn, "");
            return SubscribersKt.subscribeBy(observeOn, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$fetchImageAndCalculateColor$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    AbstractC7960dbP.c cVar = AbstractC7960dbP.b;
                    dro.invoke();
                }
            }, new drM<C6472cdu.b, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Companion$fetchImageAndCalculateColor$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6472cdu.b bVar2) {
                    c(bVar2);
                    return dpR.c;
                }

                public final void c(C6472cdu.b bVar2) {
                    AbstractC7960dbP.c cVar = AbstractC7960dbP.b;
                    Map map = AbstractC7960dbP.d;
                    String str2 = str;
                    C8632dsu.d(bVar2);
                    map.put(str2, bVar2);
                    drm.invoke(bVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleSource e(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return (SingleSource) drm.invoke(obj);
        }
    }

    public final C7965dbU t() {
        C7965dbU c7965dbU = this.c;
        if (c7965dbU != null) {
            return c7965dbU;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.e().setContentDescription(this.j);
        NetflixImageView e2 = eVar.e();
        View.OnClickListener onClickListener = this.f13824o;
        e2.setOnClickListener(onClickListener);
        e2.setClickable(onClickListener != null);
        eVar.c(t(), this.k, this.m);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        NetflixImageView e2 = eVar.e();
        e2.setOnClickListener(null);
        e2.setClickable(false);
        super.b((AbstractC7960dbP) eVar);
    }

    /* renamed from: o.dbP$e */
    /* loaded from: classes5.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "background", "getBackground()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final int[] a;
        private final InterfaceC8554dpx b;
        private a e;
        private Disposable g;
        private final int[] h;
        private final dsZ j = bIF.d(this, C7939dav.d.l, false, 2, null);
        private final dsZ d = bIF.d(this, C7939dav.d.x, false, 2, null);

        public e() {
            InterfaceC8554dpx b;
            b = dpB.b(new drO<FragmentActivity>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Holder$fragmentActivity$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final FragmentActivity invoke() {
                    Context context = AbstractC7960dbP.e.this.e().getContext();
                    C8632dsu.a(context, "");
                    return (FragmentActivity) C9737vz.e(context, FragmentActivity.class);
                }
            });
            this.b = b;
            this.h = new int[]{ArtworkColors.DEFAULT_BACKGROUND_COLOR, ArtworkColors.DEFAULT_BACKGROUND_COLOR, ArtworkColors.DEFAULT_BACKGROUND_COLOR};
            this.a = new int[]{ArtworkColors.DEFAULT_BACKGROUND_COLOR, ArtworkColors.DEFAULT_BACKGROUND_COLOR, AbstractC7960dbP.f};
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.j.getValue(this, c[0]);
        }

        public final NetflixImageView d() {
            return (NetflixImageView) this.d.getValue(this, c[1]);
        }

        private final FragmentActivity b() {
            return (FragmentActivity) this.b.getValue();
        }

        public final void c(final C7965dbU c7965dbU, final int i, String str) {
            C8632dsu.c((Object) c7965dbU, "");
            final a aVar = new a(i, str);
            if (C8632dsu.c(aVar, this.e)) {
                return;
            }
            Disposable disposable = this.g;
            if (disposable != null) {
                disposable.dispose();
            }
            this.g = null;
            this.e = aVar;
            if (str == null) {
                c(c7965dbU, i, aVar);
                return;
            }
            a(c7965dbU, i, aVar);
            this.g = AbstractC7960dbP.b.e(b(), str, new drM<C6472cdu.b, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Holder$setPositionAndImageForColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6472cdu.b bVar) {
                    c(bVar);
                    return dpR.c;
                }

                public final void c(C6472cdu.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    AbstractC7960dbP.e.this.c(c7965dbU, bVar, aVar);
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.Top10NumberModel$Holder$setPositionAndImageForColor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }

                public final void c() {
                    AbstractC7960dbP.e.this.c(c7965dbU, i, aVar);
                }
            });
        }

        private final void a(C7965dbU c7965dbU, int i, a aVar) {
            b(c7965dbU, i, this.h);
            d().setBackgroundColor(this.h[1]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(C7965dbU c7965dbU, int i, a aVar) {
            if (C8632dsu.c(this.e, aVar)) {
                b(c7965dbU, i, this.a);
                d().setBackgroundColor(this.a[1]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            r3 = o.C8563dqf.j(r3, 0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(o.C7965dbU r2, o.C6472cdu.b r3, o.AbstractC7960dbP.e.a r4) {
            /*
                r1 = this;
                android.graphics.drawable.GradientDrawable r3 = r3.c()
                int[] r3 = r3.getColors()
                if (r3 == 0) goto L16
                r0 = 0
                java.lang.Integer r3 = o.C8561dqd.a(r3, r0)
                if (r3 == 0) goto L16
                int r3 = r3.intValue()
                goto L1a
            L16:
                int r3 = o.AbstractC7960dbP.k()
            L1a:
                o.dbP$e$a r0 = r1.e
                boolean r0 = o.C8632dsu.c(r0, r4)
                if (r0 == 0) goto L2f
                int r4 = r4.a()
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                int[] r0 = new int[]{r0, r0, r3}
                r1.b(r2, r4, r0)
            L2f:
                com.netflix.mediaclient.android.widget.NetflixImageView r2 = r1.d()
                r2.setBackgroundColor(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7960dbP.e.c(o.dbU, o.cdu$b, o.dbP$e$a):void");
        }

        private final void b(C7965dbU c7965dbU, int i, int[] iArr) {
            e().setImageDrawable(c7965dbU.c(i, e().getLayoutParams().height, false, iArr));
        }

        /* renamed from: o.dbP$e$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private final int d;
            private final String e;

            public final int a() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return this.d == aVar.d && C8632dsu.c((Object) this.e, (Object) aVar.e);
                }
                return false;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.d);
                String str = this.e;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                int i = this.d;
                String str = this.e;
                return "ThemedNumber(position=" + i + ", imageUrl=" + str + ")";
            }

            public a(int i, String str) {
                this.d = i;
                this.e = str;
            }
        }
    }
}
