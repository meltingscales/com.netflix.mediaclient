package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.mediaclient.ui.lomo.CwView;
import java.util.ArrayList;
import java.util.List;
import o.C1090Oh;
import o.C6388ccP;
import o.C6400ccb;

/* renamed from: o.ccb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6400ccb extends C6388ccP<InterfaceC5179btq> {
    public static final d c = new d(null);

    @Override // o.AbstractC9900yh
    public boolean c() {
        return true;
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // o.AbstractC6337cbR
    protected boolean l() {
        return true;
    }

    @Override // o.AbstractC6337cbR
    /* renamed from: n */
    public int h() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6400ccb(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) lolomoRecyclerViewAdapter, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) interfaceC6394ccV, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
    }

    /* renamed from: o.ccb$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ContinueWatchingListAdapter");
        }

        public final void c(List<? extends InterfaceC5222bug<InterfaceC5179btq>> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                int min = Math.min(list.size(), 3);
                for (int i = 0; i < min; i++) {
                    arrayList.add(list.get(i).getVideo());
                }
                C8006dcI.d(arrayList, PlayerPrefetchSource.ContinueWatching);
            }
        }
    }

    @Override // o.AbstractC6337cbR
    protected void c(Context context, ServiceManager serviceManager, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) interfaceC5094bsK, "");
        serviceManager.j().d(i, i2, j().c() == null ? null : j().c().getId(), interfaceC5094bsK, "CWListAdapter");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    /* renamed from: b */
    public long d(InterfaceC5179btq interfaceC5179btq) {
        String C_;
        String w;
        C8632dsu.c((Object) interfaceC5179btq, "");
        long d2 = super.d((C6400ccb) interfaceC5179btq);
        long j = 1000003;
        long aF_ = interfaceC5179btq.aF_();
        return (((((d2 * j) ^ aF_) * j) ^ (interfaceC5179btq.C_() != null ? C_.hashCode() : 0L)) * j) ^ (interfaceC5179btq.w() != null ? w.hashCode() : 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6388ccP, o.AbstractC6337cbR
    /* renamed from: b */
    public void d(C6388ccP.a aVar, InterfaceC5222bug<InterfaceC5179btq> interfaceC5222bug, int i, boolean z) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C6374ccB j = j();
        C8632dsu.a(j, "");
        TrackingInfoHolder trackingInfoHolder = ((AbstractC6337cbR) this).a;
        C8632dsu.a(trackingInfoHolder, "");
        aVar.e(j, interfaceC5222bug, i, z, trackingInfoHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6388ccP, o.AbstractC6337cbR
    /* renamed from: e */
    public void b(C6388ccP.a aVar, int i, boolean z) {
        C8632dsu.c((Object) aVar, "");
        C6374ccB j = j();
        C8632dsu.a(j, "");
        ((b) aVar).c(j, i, z);
    }

    @Override // o.C6388ccP, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public C6388ccP.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        Context context = viewGroup.getContext();
        C8632dsu.a(context, "");
        C6428cdC c6428cdC = new C6428cdC(context, null, 0, 6, null);
        c6428cdC.setId(com.netflix.mediaclient.ui.R.g.aF);
        return new b(viewGroup, c6428cdC, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6388ccP, o.AbstractC6337cbR
    public void b(List<? extends InterfaceC5222bug<InterfaceC5179btq>> list) {
        Object b2;
        C8632dsu.c((Object) list, "");
        super.b(list);
        Context a = a();
        if (C9737vz.a(a) || (b2 = C9737vz.b(a, NetflixActivity.class)) == null) {
            return;
        }
        NetflixActivity netflixActivity = (NetflixActivity) b2;
        d dVar = c;
        dVar.c(list);
        dVar.getLogTag();
    }

    /* renamed from: o.ccb$b */
    /* loaded from: classes4.dex */
    public static class b extends C6388ccP.a {
        private final CwView c;
        private final FrameLayout d;
        private final InterfaceC8554dpx g;
        private boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final ViewGroup viewGroup, CwView cwView, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, new FrameLayout(viewGroup.getContext()), interfaceC1732aMe);
            InterfaceC8554dpx b;
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) cwView, "");
            C8632dsu.c((Object) interfaceC1732aMe, "");
            this.c = cwView;
            View view = this.itemView;
            C8632dsu.d(view);
            FrameLayout frameLayout = (FrameLayout) view;
            this.d = frameLayout;
            b = dpB.b(new drO<C1090Oh>() { // from class: com.netflix.mediaclient.ui.lolomo.ContinueWatchingListAdapter$ContinueWatchingViewHolder$loadingIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final C1090Oh invoke() {
                    FrameLayout frameLayout2;
                    C1090Oh c1090Oh = new C1090Oh(viewGroup.getContext());
                    C6400ccb.b bVar = this;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    frameLayout2 = bVar.d;
                    frameLayout2.addView(c1090Oh, 0, layoutParams);
                    return c1090Oh;
                }
            });
            this.g = b;
            frameLayout.addView(cwView, new FrameLayout.LayoutParams(-1, -1));
        }

        private final C1090Oh f() {
            return (C1090Oh) this.g.getValue();
        }

        @Override // o.AbstractC6379ccG.d
        public void e(C6374ccB c6374ccB, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i, boolean z, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) c6374ccB, "");
            C8632dsu.c((Object) interfaceC5222bug, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            super.e(c6374ccB, interfaceC5222bug, i, false, trackingInfoHolder);
            if (this.j) {
                f().setVisibility(8);
                this.j = false;
            }
            this.c.setVisibility(0);
            CwView cwView = this.c;
            InterfaceC5223buh video = interfaceC5222bug.getVideo();
            C8632dsu.d(video);
            cwView.c((InterfaceC5179btq) video, interfaceC5222bug.getEvidence(), q(), i, z);
        }

        public final void c(C6374ccB c6374ccB, int i, boolean z) {
            C8632dsu.c((Object) c6374ccB, "");
            this.c.setVisibility(8);
            f().setVisibility(0);
            this.j = true;
        }

        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            return this.j || this.c.c();
        }
    }
}
