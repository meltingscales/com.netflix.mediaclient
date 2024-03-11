package o;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import o.AbstractC9900yh;

/* renamed from: o.cct  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6418cct extends AbstractC6337cbR<a, InterfaceC5230buo> {
    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // o.AbstractC6337cbR
    int h() {
        return 1;
    }

    public C6418cct(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C4173bYy c4173bYy = new C4173bYy(viewGroup.getContext());
        c4173bYy.setId(com.netflix.mediaclient.ui.R.g.cU);
        return new a(viewGroup, c4173bYy, this, com.netflix.mediaclient.ui.R.g.cU);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    /* renamed from: c */
    public void d(a aVar, InterfaceC5222bug<InterfaceC5230buo> interfaceC5222bug, int i, boolean z) {
        aVar.a(((AbstractC6337cbR) this).a, j(), interfaceC5222bug.getVideo(), i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    /* renamed from: d */
    public void b(a aVar, int i, boolean z) {
        aVar.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cct$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC9900yh.c {
        private final C4173bYy c;
        private final FrameLayout d;
        private C1090Oh i;

        a(ViewGroup viewGroup, C4173bYy c4173bYy, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, new FrameLayout(viewGroup.getContext()), interfaceC1732aMe, i);
            FrameLayout frameLayout = (FrameLayout) this.itemView;
            this.d = frameLayout;
            this.c = c4173bYy;
            this.i = new C1090Oh(viewGroup.getContext());
            frameLayout.addView(c4173bYy, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.i, new FrameLayout.LayoutParams(-2, -2));
            ((FrameLayout.LayoutParams) this.i.getLayoutParams()).gravity = 17;
        }

        void a(TrackingInfoHolder trackingInfoHolder, C6374ccB c6374ccB, InterfaceC5230buo interfaceC5230buo, int i, boolean z) {
            this.i.setVisibility(8);
            this.c.setVisibility(0);
            if (interfaceC5230buo.w().getId() == null) {
                InterfaceC1598aHf.a("SPY-17693: Missing id from kidsSummary");
            }
            this.c.c(interfaceC5230buo, null, trackingInfoHolder.e(interfaceC5230buo.w(), i), i, z);
        }

        public void j() {
            this.c.setVisibility(8);
            this.i.setVisibility(0);
        }
    }
}
