package o;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import o.C6388ccP;

/* renamed from: o.ccr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6416ccr extends C6388ccP<InterfaceC5223buh> {
    public static final a c = new a(null);

    @Override // o.AbstractC9900yh
    public boolean c() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6416ccr(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) lolomoRecyclerViewAdapter, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) interfaceC6394ccV, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
    }

    /* renamed from: o.ccr$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("KidsFavoritesListAdapter");
        }
    }

    @Override // o.C6388ccP, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public C6388ccP.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = d().i();
        if (i == 0) {
            Context context = viewGroup.getContext();
            C8632dsu.a(context, "");
            RI ri = new RI(context);
            ri.setId(com.netflix.mediaclient.ui.R.g.dM);
            ri.setLayoutParams(layoutParams);
            return new e(viewGroup, ri, this);
        }
        C6388ccP.d a2 = a(viewGroup, this, layoutParams);
        C8632dsu.d(a2);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC9900yh
    /* renamed from: e */
    public ViewGroup a(C6388ccP.a aVar) {
        C8632dsu.c((Object) aVar, "");
        ViewParent parent = aVar.itemView.getParent().getParent();
        C8632dsu.d(parent);
        return (ViewGroup) parent;
    }

    /* renamed from: o.ccr$e */
    /* loaded from: classes4.dex */
    public static class e extends C6388ccP.a {
        private final RI c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewGroup viewGroup, RI ri, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, ri, interfaceC1732aMe);
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) ri, "");
            C8632dsu.c((Object) interfaceC1732aMe, "");
            this.c = ri;
        }

        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            return this.c.c();
        }

        @Override // o.AbstractC6379ccG.d
        public void e(C6374ccB c6374ccB, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i, boolean z, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) c6374ccB, "");
            C8632dsu.c((Object) interfaceC5222bug, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            super.e(c6374ccB, interfaceC5222bug, i, z, trackingInfoHolder);
            this.c.c(interfaceC5222bug.getVideo(), interfaceC5222bug.getEvidence(), q(), getAdapterPosition(), z);
        }
    }
}
