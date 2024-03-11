package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import o.C6388ccP;

/* renamed from: o.ccI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6381ccI extends C6388ccP<InterfaceC5223buh> {
    public C6381ccI(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
    }

    @Override // o.C6388ccP, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public C6388ccP.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = d().i();
        if (i == 0) {
            SB sb = new SB(viewGroup.getContext());
            sb.setId(com.netflix.mediaclient.ui.R.g.fr);
            sb.setLayoutParams(layoutParams);
            return new c(viewGroup, sb, this);
        }
        return a(viewGroup, this, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ccI$c */
    /* loaded from: classes4.dex */
    public static class c extends C6388ccP.c {
        c(ViewGroup viewGroup, C1220Th c1220Th, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, c1220Th, interfaceC1732aMe);
        }

        @Override // o.AbstractC6379ccG.d
        public TrackingInfoHolder c(TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i) {
            if (interfaceC5222bug != null && (interfaceC5222bug.getVideo() instanceof InterfaceC8366diy)) {
                InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) interfaceC5222bug.getVideo();
                if (interfaceC8366diy.a() != null) {
                    return trackingInfoHolder.b(interfaceC8366diy.aF(), interfaceC8366diy.a().getImageTypeIdentifier(), i);
                }
            }
            return super.c(trackingInfoHolder, interfaceC5222bug, i);
        }
    }
}
