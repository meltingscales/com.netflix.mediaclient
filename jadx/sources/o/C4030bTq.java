package o;

import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.home.impl.feed.FeedPrefetchHandler$prefetchImage$1;
import com.netflix.mediaclient.ui.home.impl.feed.FeedPrefetchHandler$prefetchImage$2;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.C4030bTq;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.C9646uN;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.dpR;

/* renamed from: o.bTq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4030bTq extends C4052bUl {
    public static final c c = new c(null);
    private final bTF a;
    private final Set<String> d;
    private final NetflixActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4030bTq(NetflixActivity netflixActivity, bTF btf) {
        super(netflixActivity, btf);
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) btf, "");
        this.e = netflixActivity;
        this.a = btf;
        this.d = new LinkedHashSet();
    }

    /* renamed from: o.bTq$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("FeedPrefetchHandler");
        }
    }

    public final void d(TrailerItem trailerItem) {
        C8632dsu.c((Object) trailerItem, "");
        C8166dfJ.e(null, false, 3, null);
        String B = trailerItem.B();
        if (B == null || this.d.contains(B)) {
            return;
        }
        c.getLogTag();
        String t = trailerItem.t();
        if (t != null) {
            a(t);
        }
        String r = trailerItem.r();
        if (r != null) {
            a(r);
        }
        this.d.add(B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.C4052bUl
    public void a(final InterfaceC5223buh interfaceC5223buh, LoMoType loMoType, String str) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        if (str != null) {
            c.getLogTag();
            this.a.b(str, new drX<LoMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedPrefetchHandler$onVideoBound$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(LoMo loMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list) {
                    e(loMo, list);
                    return dpR.c;
                }

                public final void e(LoMo loMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list) {
                    int i;
                    int i2;
                    C8654dtp g;
                    int b;
                    C8654dtp g2;
                    C8632dsu.c((Object) loMo, "");
                    C8632dsu.c((Object) list, "");
                    if (loMo.getType() != LoMoType.FEED) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof TrailerItem) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC5223buh interfaceC5223buh2 = interfaceC5223buh;
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        } else if (C8632dsu.c((Object) interfaceC5223buh2.getId(), (Object) ((TrailerItem) it.next()).B())) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 == -1) {
                        return;
                    }
                    C4030bTq.c cVar = C4030bTq.c;
                    cVar.getLogTag();
                    i = C8657dts.i(i3 + 1, arrayList.size());
                    i2 = C8657dts.i(i3 + 6, arrayList.size());
                    g = C8657dts.g(i, i2);
                    cVar.getLogTag();
                    int d = g.d();
                    int e = g.e();
                    if (d <= e) {
                        while (true) {
                            C4030bTq.this.d((TrailerItem) arrayList.get(d));
                            if (d == e) {
                                break;
                            }
                            d++;
                        }
                    }
                    if (i3 == 0) {
                        return;
                    }
                    b = C8657dts.b(i3 - 3, 0);
                    g2 = C8657dts.g(b, i3);
                    C4030bTq.c.getLogTag();
                    int d2 = g2.d();
                    int e2 = g2.e();
                    if (d2 > e2) {
                        return;
                    }
                    while (true) {
                        C4030bTq.this.d((TrailerItem) arrayList.get(d2));
                        if (d2 == e2) {
                            return;
                        }
                        d2++;
                    }
                }
            });
        }
    }

    private final void a(String str) {
        FragmentActivity fragmentActivity = (FragmentActivity) C9737vz.e(this.e, FragmentActivity.class);
        final FeedPrefetchHandler$prefetchImage$1 feedPrefetchHandler$prefetchImage$1 = new drM<C9646uN.e, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedPrefetchHandler$prefetchImage$1
            public final void a(C9646uN.e eVar) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C9646uN.e eVar) {
                a(eVar);
                return dpR.c;
            }
        };
        Consumer consumer = new Consumer() { // from class: o.bTo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4030bTq.d(drM.this, obj);
            }
        };
        final FeedPrefetchHandler$prefetchImage$2 feedPrefetchHandler$prefetchImage$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedPrefetchHandler$prefetchImage$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C4030bTq.c cVar = C4030bTq.c;
            }
        };
        ((SingleSubscribeProxy) InterfaceC9638uF.a.d(fragmentActivity).d(C9646uN.d.d(fragmentActivity).e(str).c(true).b()).as(AutoDispose.b(AndroidLifecycleScopeProvider.c(fragmentActivity)))).c(consumer, new Consumer() { // from class: o.bTr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4030bTq.a(drM.this, obj);
            }
        });
    }
}
