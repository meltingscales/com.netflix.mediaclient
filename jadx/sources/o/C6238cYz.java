package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.upnextfeed.impl.CWRowBuilder$renderLoadingRow$1;
import com.netflix.mediaclient.ui.upnextfeed.impl.CWRowBuilder$renderRow$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.AbstractC3073as;
import o.AbstractC3781bKk;
import o.C6238cYz;
import o.C7939dav;
import o.InterfaceC3825bMa;
import o.InterfaceC6419ccu;

/* renamed from: o.cYz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6238cYz {
    public static final b c = new b(null);
    private final C1729aMb b;
    private final e d;
    private final Rect e;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        return C7939dav.a.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    public C6238cYz(NetflixActivity netflixActivity, bLU blu) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) blu, "");
        this.d = new e(blu);
        C1729aMb e2 = InterfaceC6419ccu.d.e(netflixActivity, 2);
        C1332Xp c1332Xp = C1332Xp.b;
        this.b = C1729aMb.b(e2, 0, 0, 0.0f, 0, 0, 0, 0, (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, true, 4194175, null);
        float f = 4;
        this.e = new Rect(0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
    }

    /* renamed from: o.cYz$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("CWRowBuilder");
        }
    }

    public final void e(InterfaceC2023aX interfaceC2023aX, C7978dbh c7978dbh, TrackingInfoHolder trackingInfoHolder, C9935zP c9935zP, drO<dpR> dro, drO<dpR> dro2) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c7978dbh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        C4003bSq c2 = c7978dbh.c().c();
        LoMo b2 = c2 != null ? c2.b() : null;
        if (c2 != null && b2 != null && b2.getLength() > 0) {
            c(interfaceC2023aX, b2);
            List<C4002bSp> e2 = c2.e();
            if (e2 != null) {
                b(interfaceC2023aX, b2, e2, TrackingInfoHolder.b(trackingInfoHolder, null, null, new ListSummaryCLTrackingInfo(b2, PlayContextImp.v), null, 11, null), c9935zP, dro, dro2);
            }
        } else if ((c7978dbh.c() instanceof C8932fz) || (c7978dbh.c() instanceof C8974go)) {
            b(interfaceC2023aX);
            a(interfaceC2023aX);
        }
    }

    private final void b(InterfaceC2023aX interfaceC2023aX, LoMo loMo, List<C4002bSp> list, TrackingInfoHolder trackingInfoHolder, C9935zP c9935zP, drO<dpR> dro, drO<dpR> dro2) {
        bKB.d(interfaceC2023aX, new CWRowBuilder$renderRow$1(this, loMo, this, list, trackingInfoHolder, dro, dro2, c9935zP));
    }

    private final void a(InterfaceC2023aX interfaceC2023aX) {
        bKB.d(interfaceC2023aX, new CWRowBuilder$renderLoadingRow$1(this, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingInfoHolder e(LoMo loMo, TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i) {
        boolean g;
        boolean g2;
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        g = C8691duz.g(id);
        if (g) {
            String a = loMo.getType().a();
            C8632dsu.a(a, "");
            g2 = C8691duz.g(a);
            String a2 = g2 ? "genre" : loMo.getType().a();
            int listPos = loMo.getListPos();
            String id2 = video.getId();
            String value = video.getType().getValue();
            String title = video.getTitle();
            InterfaceC1593aHa.c.a("Lolomo row=" + listPos + ", rank=" + i + ", type=" + a2 + ", video [id=" + id2 + ", type=" + value + ", title=" + title + "]");
        }
        return trackingInfoHolder.e(video, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(InterfaceC2023aX interfaceC2023aX, int i, int i2, int i3, int i4, C1729aMb c1729aMb, drO<dpR> dro) {
        int i5;
        i5 = C8657dts.i(i4 + i3, i2);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = dro;
        while (i3 < i5) {
            C3787bKq c3787bKq = new C3787bKq();
            c3787bKq.b((CharSequence) ("shim-" + i + "-" + i3));
            c3787bKq.c(400L);
            c3787bKq.a(BrowseExperience.e());
            c3787bKq.c(true);
            c3787bKq.d(true);
            c3787bKq.c(new InterfaceC4467bf() { // from class: o.cYy
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i6) {
                    C6238cYz.c(Ref.ObjectRef.this, (C3787bKq) abstractC3073as, (AbstractC3781bKk.a) obj, i6);
                }
            });
            interfaceC2023aX.add(c3787bKq);
            i3++;
        }
        int o2 = c1729aMb.o();
        for (int i6 = 0; i6 < o2; i6++) {
            bKU bku = new bKU();
            bku.d((CharSequence) ("loading-peek-" + i + "-" + (i5 + i6)));
            C1332Xp c1332Xp = C1332Xp.b;
            bku.d(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ref.ObjectRef objectRef, C3787bKq c3787bKq, AbstractC3781bKk.a aVar, int i) {
        C8632dsu.c((Object) objectRef, "");
        drO dro = (drO) objectRef.d;
        if (dro != null) {
            dro.invoke();
            objectRef.d = null;
        }
    }

    /* renamed from: o.cYz$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public static final d e = new d(null);
        private final bLU c;
        private final List<String> d;

        public e(bLU blu) {
            C8632dsu.c((Object) blu, "");
            this.c = blu;
            this.d = new ArrayList();
        }

        /* renamed from: o.cYz$e$d */
        /* loaded from: classes5.dex */
        public static final class d extends C1045Mp {
            public /* synthetic */ d(C8627dsp c8627dsp) {
                this();
            }

            private d() {
                super("HomeVisibilityTracking");
            }
        }

        public final <T extends AbstractC3073as<V>, V extends AbstractC3179au> InterfaceC4467bf<T, V> d(final InterfaceC5223buh interfaceC5223buh, final LoMoType loMoType) {
            return new InterfaceC4467bf() { // from class: o.cYE
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                    C6238cYz.e.e(InterfaceC5223buh.this, loMoType, this, abstractC3073as, (AbstractC3179au) obj, i);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5223buh interfaceC5223buh, LoMoType loMoType, e eVar, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
            C8632dsu.c((Object) eVar, "");
            if (interfaceC5223buh == null || loMoType == null || eVar.d.contains(interfaceC5223buh.getId()) || eVar.d.size() >= 3 || !(interfaceC5223buh instanceof InterfaceC5179btq)) {
                return;
            }
            List<String> list = eVar.d;
            String id = ((InterfaceC5179btq) interfaceC5223buh).getId();
            C8632dsu.a(id, "");
            list.add(id);
            C8006dcI.e((InterfaceC5160btX) interfaceC5223buh, PlayerPrefetchSource.ContinueWatching);
        }

        public static /* synthetic */ InterfaceC4732bk c(e eVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return eVar.a(z);
        }

        public final <T extends AbstractC3073as<V>, V extends AbstractC3179au> InterfaceC4732bk<T, V> a(final boolean z) {
            return new InterfaceC4732bk() { // from class: o.cYF
                @Override // o.InterfaceC4732bk
                public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                    C6238cYz.e.a(z, this, abstractC3073as, (AbstractC3179au) obj, i);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(boolean z, e eVar, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
            C8632dsu.c((Object) eVar, "");
            if (z) {
                eVar.c.c().b(abstractC3073as, abstractC3179au, i);
            }
        }
    }

    private final void c(InterfaceC2023aX interfaceC2023aX, LoMo loMo) {
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) "row-cw-videos-title");
        c3814bLq.d(C7939dav.a.i);
        c3814bLq.d((CharSequence) (loMo != null ? loMo.getTitle() : null));
        c3814bLq.d(new AbstractC3073as.b() { // from class: o.cYG
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int a;
                a = C6238cYz.a(i, i2, i3);
                return a;
            }
        });
        interfaceC2023aX.add(c3814bLq);
    }

    private final void b(InterfaceC2023aX interfaceC2023aX) {
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) "row-cw-videos-title");
        c3787bKq.c(C7939dav.a.g);
        c3787bKq.c(400L);
        c3787bKq.d(true);
        c3787bKq.a(BrowseExperience.e());
        c3787bKq.d(this.e);
        c3787bKq.e(new AbstractC3073as.b() { // from class: o.cYH
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int e2;
                e2 = C6238cYz.e(i, i2, i3);
                return e2;
            }
        });
        interfaceC2023aX.add(c3787bKq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC2023aX interfaceC2023aX, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i, TrackingInfoHolder trackingInfoHolder) {
        C7987dbq c7987dbq = new C7987dbq();
        String id = interfaceC5222bug.getVideo().getId();
        c7987dbq.d((CharSequence) ("continueWatching-" + id));
        c7987dbq.b((InterfaceC5179btq) C9726vo.d(interfaceC5222bug.getVideo(), InterfaceC5179btq.class));
        c7987dbq.b(i);
        c7987dbq.e(trackingInfoHolder.e(interfaceC5222bug.getVideo(), i));
        c7987dbq.e(AppView.boxArt);
        c7987dbq.a(e.c(this.d, false, 1, null));
        c7987dbq.a(this.d.d(interfaceC5222bug.getVideo(), loMo.getType()));
        c7987dbq.d(new InterfaceC3825bMa.a(loMo.getListId(), loMo.getRequestId(), Integer.valueOf(loMo.getTrackId())));
        interfaceC2023aX.add(c7987dbq);
    }
}
