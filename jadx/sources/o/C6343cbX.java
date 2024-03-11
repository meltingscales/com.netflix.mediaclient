package o;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.AbstractC6379ccG;
import o.C9646uN;

/* renamed from: o.cbX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6343cbX extends AbstractC6379ccG<c, InterfaceC5180btr> {
    private int b;
    private int c;
    private Disposable h;
    private final Set<c> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC6337cbR
    public int c(Context context, int i) {
        return i + 2;
    }

    @Override // o.AbstractC9900yh
    public boolean c() {
        return true;
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.c;
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    public C6343cbX(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, int i2, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        this.j = new HashSet();
        this.c = loMo.getLength();
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        BillboardView billboardView;
        c bVar;
        Context context = viewGroup.getContext();
        if (i == 0) {
            if (C8171dfO.e()) {
                billboardView = new C6470cds(context, this.b);
            } else {
                billboardView = new C6467cdp(context, this.b);
            }
            bVar = new a(viewGroup, billboardView, this, com.netflix.mediaclient.ui.R.g.R);
        } else {
            billboardView = new BillboardView(context);
            bVar = new b(viewGroup, billboardView, this, com.netflix.mediaclient.ui.R.g.R);
        }
        billboardView.setId(com.netflix.mediaclient.ui.R.g.R);
        this.j.add(bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC6337cbR
    public void c(List<InterfaceC5222bug<InterfaceC5180btr>> list) {
        super.c(list);
        if (list.isEmpty()) {
            this.c = 0;
            n();
            return;
        }
        this.c = list.size();
    }

    @Override // o.AbstractC6337cbR, o.AbstractC9900yh
    public void a(Context context) {
        c cVar;
        super.a(context);
        RecyclerView b2 = b();
        if (b2 == null || b2.getChildCount() <= 0 || (cVar = (c) b2.getChildViewHolder(b2.getChildAt(0))) == null) {
            return;
        }
        cVar.o();
        cVar.l();
    }

    @Override // o.AbstractC9900yh
    public void d(RecyclerView recyclerView, RecyclerView recyclerView2, int i) {
        c cVar;
        if (i != 0 || recyclerView2.getChildCount() <= 0 || (cVar = (c) recyclerView2.getChildViewHolder(recyclerView2.getChildAt(0))) == null) {
            return;
        }
        cVar.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    public void c(final List<InterfaceC5222bug<InterfaceC5180btr>> list, boolean z) {
        BillboardSummary f;
        if (z && d(list)) {
            InterfaceC5180btr video = list.get(0).getVideo();
            if (video == null || (f = video.f()) == null) {
                return;
            }
            BillboardAsset background = f.getBackground();
            if (background == null) {
                background = f.getHorizontalBackground();
            }
            BillboardAsset logo = f.getLogo();
            if (background == null || logo == null) {
                return;
            }
            Disposable disposable = this.h;
            if (disposable != null) {
                disposable.dispose();
            }
            ArrayList arrayList = new ArrayList();
            Single<C9646uN.e> e = C6469cdr.e(a(), background);
            Single<C9646uN.e> a2 = C6469cdr.a(a(), logo);
            if (e != null) {
                arrayList.add(e);
            }
            if (a2 != null) {
                arrayList.add(a2);
            }
            this.h = Single.merge(arrayList).subscribe(new Consumer() { // from class: o.cbZ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6343cbX.this.b(list, (C9646uN.e) obj);
                }
            }, new Consumer() { // from class: o.cbY
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1044Mm.e("BillboardListAdapter", "prefetching billboard failed", (Throwable) obj);
                }
            });
            return;
        }
        super.c(list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list, C9646uN.e eVar) {
        LocalBroadcastManager.getInstance(NetflixApplication.getInstance()).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.BILLBOARD_CHANGED"));
        super.c(list, true);
    }

    private boolean d(List<InterfaceC5222bug<InterfaceC5180btr>> list) {
        List<InterfaceC5222bug<O>> g = g();
        if (g.size() == 1 && list.size() == 1) {
            InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) g.get(0);
            InterfaceC5222bug<InterfaceC5180btr> interfaceC5222bug2 = list.get(0);
            if (interfaceC5222bug != null && interfaceC5222bug2 != null) {
                String aH_ = ((InterfaceC5180btr) interfaceC5222bug.getVideo()).aH_();
                String aH_2 = interfaceC5222bug2.getVideo().aH_();
                if (aH_ != null && aH_2 != null && !aH_.equals(aH_2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    /* renamed from: a */
    public void d(c cVar, InterfaceC5222bug<InterfaceC5180btr> interfaceC5222bug, int i, boolean z) {
        cVar.e(j(), interfaceC5222bug, i, z, ((AbstractC6337cbR) this).a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    /* renamed from: a */
    public void b(c cVar, int i, boolean z) {
        cVar.e(j(), i, z);
    }

    @Override // o.AbstractC6337cbR, o.AbstractC9900yh
    public void c(Context context) {
        for (c cVar : this.j) {
            cVar.f();
        }
        Disposable disposable = this.h;
        if (disposable != null && !disposable.isDisposed()) {
            this.h.dispose();
            this.h = null;
        }
        super.c(context);
    }

    @Override // o.AbstractC9900yh
    public void b(C1729aMb c1729aMb) {
        n();
        super.b(c1729aMb);
    }

    private void n() {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.BILLBOARD_CLEARED");
        intent.putExtra("lolomoFragmentInstance", this.b);
        C1044Mm.b("BillboardListAdapter", "Sending Clear Billboard broadcast syc");
        LocalBroadcastManager.getInstance(NetflixApplication.getInstance()).sendBroadcastSync(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cbX$c */
    /* loaded from: classes4.dex */
    public static abstract class c extends AbstractC6379ccG.d<InterfaceC5180btr> {
        private final BillboardView c;
        private final FrameLayout d;
        private final C1090Oh i;

        c(ViewGroup viewGroup, BillboardView billboardView, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, new FrameLayout(viewGroup.getContext()), interfaceC1732aMe, i);
            FrameLayout frameLayout = (FrameLayout) this.itemView;
            this.d = frameLayout;
            this.c = billboardView;
            C1090Oh c1090Oh = new C1090Oh(viewGroup.getContext());
            this.i = c1090Oh;
            frameLayout.addView(billboardView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(c1090Oh, new FrameLayout.LayoutParams(-2, -2));
            ((FrameLayout.LayoutParams) c1090Oh.getLayoutParams()).gravity = 17;
        }

        public void e(C6374ccB c6374ccB, int i, boolean z) {
            this.c.setVisibility(4);
            this.i.setVisibility(0);
        }

        @Override // o.AbstractC6379ccG.d
        public void e(C6374ccB c6374ccB, InterfaceC5222bug<InterfaceC5180btr> interfaceC5222bug, int i, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super.e(c6374ccB, interfaceC5222bug, i, z, trackingInfoHolder);
            this.i.setVisibility(8);
            this.c.setVisibility(0);
            this.c.c(interfaceC5222bug.getVideo(), interfaceC5222bug.getEvidence(), q(), i, true);
        }

        @Override // o.AbstractC6379ccG.d
        public TrackingInfoHolder c(TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<InterfaceC5180btr> interfaceC5222bug, int i) {
            if (interfaceC5222bug == null || !(interfaceC5222bug.getVideo() instanceof InterfaceC8366diy)) {
                return trackingInfoHolder;
            }
            InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) interfaceC5222bug.getVideo();
            BillboardSummary f = interfaceC8366diy.f();
            return trackingInfoHolder.b(interfaceC8366diy.aF(), (f == null || f.getBackground() == null) ? null : f.getBackground().getImageKey(), i);
        }

        @Override // o.AbstractC6379ccG.d, o.AbstractC9900yh.c
        public void d() {
            this.c.k();
            super.d();
        }

        public void f() {
            BillboardView billboardView = this.c;
            if (billboardView != null) {
                billboardView.p();
            }
        }

        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            if (this.i.getVisibility() == 0) {
                return true;
            }
            return this.c.c();
        }

        @Override // o.AbstractC6379ccG.d
        public void am_() {
            this.c.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cbX$a */
    /* loaded from: classes4.dex */
    public static class a extends c {
        a(ViewGroup viewGroup, BillboardView billboardView, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, billboardView, interfaceC1732aMe, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cbX$b */
    /* loaded from: classes4.dex */
    public static class b extends c {
        b(ViewGroup viewGroup, BillboardView billboardView, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, billboardView, interfaceC1732aMe, i);
        }
    }
}
