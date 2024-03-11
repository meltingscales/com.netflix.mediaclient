package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.model.leafs.VideoInfo;
import o.C6388ccP;

/* renamed from: o.ccW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6395ccW extends C6388ccP<InterfaceC5223buh> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6395ccW(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) lolomoRecyclerViewAdapter, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) interfaceC6394ccV, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
    }

    @Override // o.C6388ccP, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public C6388ccP.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = d().i();
        if (i == 0) {
            Context context = viewGroup.getContext();
            C8632dsu.a(context, "");
            C1213Ta c1213Ta = new C1213Ta(context, null, 0, 6, null);
            c1213Ta.setId(com.netflix.mediaclient.ui.R.g.gx);
            c1213Ta.setLayoutParams(layoutParams);
            return new b(viewGroup, c1213Ta, this);
        }
        C6388ccP.d a = a(viewGroup, this, layoutParams);
        C8632dsu.d(a);
        return a;
    }

    /* renamed from: o.ccW$b */
    /* loaded from: classes4.dex */
    public static final class b extends C6388ccP.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, C1213Ta c1213Ta, C6395ccW c6395ccW) {
            super(viewGroup, c1213Ta, c6395ccW);
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) c1213Ta, "");
            C8632dsu.c((Object) c6395ccW, "");
        }

        @Override // o.AbstractC6379ccG.d
        public TrackingInfoHolder c(TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i) {
            C8632dsu.c((Object) trackingInfoHolder, "");
            InterfaceC5223buh video = interfaceC5222bug != null ? interfaceC5222bug.getVideo() : null;
            if (video instanceof C8329diN) {
                C8329diN c8329diN = (C8329diN) video;
                VideoInfo.TopTenBoxart b = c8329diN.b();
                String boxartId = b != null ? b.getBoxartId() : null;
                if (boxartId != null) {
                    InterfaceC5223buh aF = c8329diN.aF();
                    C8632dsu.a(aF, "");
                    return trackingInfoHolder.b(aF, boxartId, i);
                }
                return super.c(trackingInfoHolder, interfaceC5222bug, i);
            }
            return super.c(trackingInfoHolder, interfaceC5222bug, i);
        }
    }
}
