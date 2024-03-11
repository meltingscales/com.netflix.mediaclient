package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.mediaclient.util.ViewUtils;
import o.C6388ccP;
import o.C9834xU;

/* renamed from: o.ccn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6412ccn extends C6388ccP<InterfaceC5185btw> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6412ccn(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
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
        if (i == 2) {
            View inflate = this.d.inflate(com.netflix.mediaclient.ui.R.i.al, viewGroup, false);
            C8632dsu.d(inflate);
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            viewGroup2.setLayoutParams(layoutParams);
            return new d(viewGroup, viewGroup2, this);
        }
        C6388ccP.d a = a(viewGroup, this, layoutParams);
        C8632dsu.d(a);
        return a;
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i < g().size() ? 2 : 1;
    }

    /* renamed from: o.ccn$d */
    /* loaded from: classes4.dex */
    public static final class d extends C6388ccP.a {
        public static final int c;
        private final C1204Sr d;
        private final RA g;
        private final C1204Sr i;

        static {
            int i = C1204Sr.d;
            c = i | i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup, ViewGroup viewGroup2, C6412ccn c6412ccn) {
            super(viewGroup, viewGroup2, c6412ccn);
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) viewGroup2, "");
            C8632dsu.c((Object) c6412ccn, "");
            RA ra = (RA) viewGroup2.findViewById(com.netflix.mediaclient.ui.R.g.cH);
            this.g = ra;
            this.i = (C1204Sr) viewGroup2.findViewById(com.netflix.mediaclient.ui.R.g.gr);
            this.d = (C1204Sr) viewGroup2.findViewById(com.netflix.mediaclient.ui.R.g.cg);
            ra.setRoundedCornerRadius(ra.getResources().getDimension(C9834xU.a.r));
        }

        @Override // o.AbstractC6379ccG.d, o.AbstractC9900yh.c
        public void d() {
            super.d();
            this.g.onViewRecycled();
        }

        @Override // o.AbstractC6379ccG.d
        public void e(C6374ccB c6374ccB, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i, boolean z, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) c6374ccB, "");
            C8632dsu.c((Object) interfaceC5222bug, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            super.e(c6374ccB, interfaceC5222bug, i, z, trackingInfoHolder);
            this.g.c(interfaceC5222bug.getVideo(), interfaceC5222bug.getEvidence(), q(), getAdapterPosition(), z);
            this.i.setText(interfaceC5222bug.getVideo().getTitle());
            this.i.getViewTreeObserver().addOnGlobalLayoutListener(new a());
            InterfaceC5223buh video = interfaceC5222bug.getVideo();
            InterfaceC5185btw interfaceC5185btw = video instanceof InterfaceC5185btw ? (InterfaceC5185btw) video : null;
            this.d.setText(interfaceC5185btw != null ? interfaceC5185btw.a() : null);
        }

        /* renamed from: o.ccn$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
            a() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d.this.d.setMinLines(d.this.i.getLineCount() == 1 ? 2 : 1);
                ViewUtils.d(d.this.i, this);
            }
        }

        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            return this.g.c();
        }

        @Override // o.AbstractC6379ccG.d
        public TrackingInfoHolder c(TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i) {
            C8632dsu.c((Object) trackingInfoHolder, "");
            InterfaceC5223buh video = interfaceC5222bug != null ? interfaceC5222bug.getVideo() : null;
            if (video instanceof C8327diL) {
                return trackingInfoHolder.e(video, i);
            }
            return super.c(trackingInfoHolder, interfaceC5222bug, i);
        }
    }
}
