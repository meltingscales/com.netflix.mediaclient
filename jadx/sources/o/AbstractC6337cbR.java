package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.android.widgetry.lolomo.RowLinearLayoutManager;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.model.leafs.ListOfMoviesSummary;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC9900yh;
import o.AbstractC9900yh.c;
import o.C5126bsq;
import o.InterfaceC5223buh;
import o.aIB;

/* renamed from: o.cbR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6337cbR<T extends AbstractC9900yh.c, O extends InterfaceC5223buh> extends AbstractC9900yh<T> {
    protected TrackingInfoHolder a;
    private final BroadcastReceiver b;
    private final List<InterfaceC5222bug<O>> c;
    public final ServiceManager e;
    private d f;
    private boolean g;
    private int h;
    private boolean i;
    private final InterfaceC6394ccV j;
    private final LolomoRecyclerViewAdapter k;
    private boolean l;
    private C6374ccB m;
    private BroadcastReceiver n;

    /* renamed from: o  reason: collision with root package name */
    private Integer f13716o;
    private boolean r;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.cbR$c */
    /* loaded from: classes4.dex */
    interface c {
        InterfaceC5606cBq n();
    }

    /* renamed from: o.cbR$d */
    /* loaded from: classes4.dex */
    public interface d {
        void c(AbstractC6337cbR abstractC6337cbR, int i);

        void d(AbstractC6337cbR abstractC6337cbR);

        void d(AbstractC6337cbR abstractC6337cbR, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        this.g = z;
    }

    private int n() {
        return this.h;
    }

    protected void a(int i) {
        this.h = i;
    }

    protected void b(List<InterfaceC5222bug<O>> list) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        this.f = dVar;
    }

    protected abstract void b(T t, int i, boolean z);

    protected void c(ListOfMoviesSummary listOfMoviesSummary) {
    }

    protected abstract void d(T t, InterfaceC5222bug<O> interfaceC5222bug, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(C6374ccB c6374ccB) {
        this.m = c6374ccB;
    }

    protected boolean e(int i) {
        return i == 0;
    }

    public List<InterfaceC5222bug<O>> g() {
        return this.c;
    }

    public final boolean i() {
        return this.g;
    }

    public C6374ccB j() {
        return this.m;
    }

    protected boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6337cbR(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, c1729aMb, i);
        this.r = false;
        this.l = false;
        this.f = null;
        this.c = new ArrayList();
        this.h = 0;
        this.g = false;
        this.i = false;
        this.n = null;
        this.b = new BroadcastReceiver() { // from class: o.cbR.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C1044Mm.e("BaseListAdapter", "onReceive...");
                AbstractC6337cbR.this.a(C8168dfL.h(intent.getStringExtra("browse_agent_list_refresh_extra_reno_msg_id")));
            }
        };
        this.k = lolomoRecyclerViewAdapter;
        this.e = lolomoRecyclerViewAdapter.j();
        this.m = new C6374ccB(loMo, lolomoRecyclerViewAdapter.g(), lolomoRecyclerViewAdapter.i(), i);
        this.f13716o = Integer.valueOf(loMo.getLength());
        b(lolomoRecyclerViewAdapter);
        setHasStableIds(true);
        this.j = interfaceC6394ccV;
        this.a = trackingInfoHolder.a(loMo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6337cbR(Context context, LoMo loMo, String str, ServiceManager serviceManager, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, c1729aMb, i);
        this.r = false;
        this.l = false;
        this.f = null;
        this.c = new ArrayList();
        this.h = 0;
        this.g = false;
        this.i = false;
        this.n = null;
        this.b = new BroadcastReceiver() { // from class: o.cbR.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C1044Mm.e("BaseListAdapter", "onReceive...");
                AbstractC6337cbR.this.a(C8168dfL.h(intent.getStringExtra("browse_agent_list_refresh_extra_reno_msg_id")));
            }
        };
        this.k = null;
        this.e = serviceManager;
        this.m = new C6374ccB(loMo, str, null, i);
        this.f13716o = Integer.valueOf(loMo.getLength());
        setHasStableIds(true);
        this.j = interfaceC6394ccV;
        this.a = trackingInfoHolder.a(loMo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (i < g().size()) {
            return d((AbstractC6337cbR<T, O>) g().get(i).getVideo());
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long d(O o2) {
        long hashCode = o2.getId() == null ? 0L : o2.getId().hashCode();
        long hashCode2 = o2.getTitle() == null ? 0L : o2.getTitle().hashCode();
        long hashCode3 = o2.getBoxshotUrl() == null ? 0L : o2.getBoxshotUrl().hashCode();
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (f().getId() == null ? 0L : f().getId().hashCode())) * 1000003) ^ (f().getRequestId() != null ? f().getRequestId().hashCode() : 0L)) * 1000003) ^ f().getTrackId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LoMo f() {
        return this.m.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(List<InterfaceC5222bug<O>> list) {
        if (list.size() > 0) {
            this.c.addAll(list);
            if (this.r) {
                this.r = false;
                s();
            }
        } else if (this.m.c().isVolatile() && g().isEmpty()) {
            C5838cKf.d(this.a, AppView.noRow);
        }
    }

    @Override // o.AbstractC9900yh
    public void d(View view) {
        ServiceManager serviceManager = this.e;
        if (serviceManager != null) {
            g().clear();
            a(0);
            notifyDataSetChanged();
            InterfaceC1593aHa.b("List retry clicked for " + j());
            d(view.getContext(), serviceManager);
        }
    }

    @Override // o.AbstractC9900yh
    public void e(RecyclerView recyclerView, BaseVerticalRecyclerViewAdapter.d dVar) {
        ServiceManager serviceManager;
        super.e(recyclerView, dVar);
        if (!this.i && (serviceManager = this.e) != null) {
            d(dVar.itemView.getContext(), serviceManager);
            this.i = true;
        }
        if (!this.l) {
            if (g().isEmpty()) {
                this.r = true;
            } else {
                s();
            }
            this.l = true;
        }
        b("bind");
    }

    private void b(String str) {
        if (k()) {
            p();
        }
    }

    private void p() {
        ServiceManager serviceManager = this.e;
        if (serviceManager != null) {
            this.j.d(serviceManager.j(), l() ? null : o(), f().getListContext(), (String) null, "lomo.refreshIfExpired");
        }
    }

    private boolean k() {
        return this.e != null && f().needsRefresh();
    }

    private void s() {
        ArrayList arrayList = new ArrayList(g().size());
        for (InterfaceC5222bug<O> interfaceC5222bug : g()) {
            arrayList.add(interfaceC5222bug.getVideo());
        }
        if (arrayList.size() > 0) {
            c(this.e, (NetflixActivity) C8141del.e(a(), NetflixActivity.class), arrayList, f());
        }
    }

    public static void c(ServiceManager serviceManager, NetflixActivity netflixActivity, List<InterfaceC5223buh> list, LoMo loMo) {
        if (C8171dfO.e()) {
            C1044Mm.e("BaseListAdapter", "Not going to execute prefetchFromLolomoList");
            return;
        }
        int size = list.size();
        C1044Mm.a("BaseListAdapter", "Sending prefetch details request for %s videos in '%s' row", Integer.valueOf(size), loMo.getTitle());
        ((InterfaceC1590aGy) C1642aIw.b(netflixActivity, InterfaceC1590aGy.class)).e().e(serviceManager, list, netflixActivity);
    }

    public static void e(NetflixActivity netflixActivity, List<InterfaceC5223buh> list) {
        ((c) C1642aIw.b(netflixActivity, c.class)).n().b(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(Context context, int i) {
        return (i + C4000bSn.b(context, LoMoType.STANDARD)) - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i < g().size() ? 0 : 1;
    }

    @Override // o.AbstractC9900yh
    public void b(T t, int i) {
        boolean z = i <= d().m();
        if (i < g().size()) {
            d(t, g().get(i), i, z);
            return;
        }
        b((AbstractC6337cbR<T, O>) t, i, z);
        ServiceManager serviceManager = this.e;
        if (serviceManager != null) {
            d(t.itemView.getContext(), serviceManager);
        } else {
            InterfaceC1598aHf.a("serviceManager should not be null while binding new data");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, ServiceManager serviceManager, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        d dVar = this.f;
        if (dVar != null) {
            dVar.d(this);
        }
        c(context, serviceManager, i, i2, interfaceC5094bsK);
    }

    protected void c(Context context, ServiceManager serviceManager, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        this.j.a(serviceManager.j(), f(), i, i2, false, BrowseExperience.a(), interfaceC5094bsK);
    }

    private IntentFilter m() {
        if (f().isVolatile()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.netflix.mediaclient.intent.action.BA_LIST_REFRESH");
            intentFilter.addCategory(f().getListContext());
            return intentFilter;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5094bsK a(final long j, Context context, final boolean z, int i, int i2, boolean z2) {
        return new C5126bsq("BaseListAdapter.FetchVideosHandler", new C5126bsq.c<O>() { // from class: o.cbR.4
            @Override // o.C5126bsq.c
            public long b() {
                return j;
            }

            @Override // o.C5126bsq.c
            public void d() {
                AbstractC6337cbR.this.c(false);
                if (AbstractC6337cbR.this.g().size() != 0 || AbstractC6337cbR.this.f == null) {
                    return;
                }
                d dVar = AbstractC6337cbR.this.f;
                AbstractC6337cbR abstractC6337cbR = AbstractC6337cbR.this;
                dVar.c(abstractC6337cbR, abstractC6337cbR.e());
            }

            @Override // o.C5126bsq.c
            public void b(ListOfMoviesSummary listOfMoviesSummary) {
                AbstractC6337cbR.this.c(listOfMoviesSummary);
            }

            @Override // o.C5126bsq.c
            public void c(List<InterfaceC5222bug<O>> list, String str, int i3, int i4) {
                try {
                    AbstractC6337cbR.this.c(list, z);
                } finally {
                    AbstractC6337cbR.this.c(false);
                }
            }
        }, f().getListContext(), i, i2, z2, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(List<InterfaceC5222bug<O>> list, boolean z) {
        RecyclerView b;
        if (!C8054ddD.l(a())) {
            int size = g().size();
            if (z) {
                g().clear();
            }
            b(list);
            c(list);
            int size2 = g().size();
            InterfaceC1593aHa.b("loadData." + f().getType() + ".notifyDataSetChanged " + size + "," + size2 + "," + h());
            this.f13716o = Integer.valueOf(j().c().getLength());
            notifyDataSetChanged();
            if (size == 0 && !z && (b = b()) != null && (b.getLayoutManager() instanceof RowLinearLayoutManager)) {
                ((RowLinearLayoutManager) b.getLayoutManager()).e();
            }
            a(g().size());
            d dVar = this.f;
            if (dVar != null) {
                dVar.d(this, e());
            }
            if (this.k != null) {
                if ((c() && size == 0) || g().size() == 0) {
                    this.k.notifyItemChanged(e());
                    return;
                }
                return;
            }
            return;
        }
        C1044Mm.e("BaseListAdapter", "Ignoring callback, activity finished");
    }

    public void d(Context context, ServiceManager serviceManager) {
        if (i() || context == null) {
            return;
        }
        long nanoTime = System.nanoTime();
        c(true);
        int n = n();
        int c2 = c(context, n());
        e(context, serviceManager, n, c2, a(nanoTime, context, false, n, c2, e(n)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean a(final Context context, final ServiceManager serviceManager) {
        if (!i()) {
            c(true);
            this.j.d(serviceManager.j(), j().e(), e(), e(), new C5087bsD("BaseListAdapter") { // from class: o.cbR.5
                @Override // o.C5087bsD, o.InterfaceC5094bsK
                public void o(List<LoMo> list, Status status) {
                    super.o(list, status);
                    if (status.j() && list.size() == 1) {
                        LoMo loMo = list.get(0);
                        AbstractC6337cbR abstractC6337cbR = AbstractC6337cbR.this;
                        abstractC6337cbR.a = abstractC6337cbR.a.a(loMo);
                        if (TextUtils.equals(AbstractC6337cbR.this.m.c().getListContext(), loMo.getListContext())) {
                            AbstractC6337cbR abstractC6337cbR2 = AbstractC6337cbR.this;
                            abstractC6337cbR2.e(abstractC6337cbR2.m.a(loMo));
                            long nanoTime = System.nanoTime();
                            int c2 = AbstractC6337cbR.this.c(context, 0);
                            AbstractC6337cbR.this.e(context, serviceManager, 0, c2, AbstractC6337cbR.this.a(nanoTime, context, true, 0, c2, false));
                            return;
                        }
                        AbstractC6337cbR.this.c(false);
                        int e = AbstractC6337cbR.this.e();
                        C1044Mm.a("BaseListAdapter", "Ignoring list retrieved at index %s, was expecting %s but got %s", Integer.valueOf(e), AbstractC6337cbR.this.m.c().getType(), loMo.getType());
                    }
                }
            });
        }
        return i();
    }

    @Override // o.AbstractC9900yh
    public void d(Context context) {
        super.d(context);
        IntentFilter m = m();
        if (m != null) {
            C1044Mm.e("BaseListAdapter", "Register receiver in onCreate...");
            LocalBroadcastManager.getInstance(context).registerReceiver(this.b, m);
            this.n = this.b;
        }
    }

    @Override // o.AbstractC9900yh
    public void a(Context context) {
        super.a(context);
        if (b() != null) {
            b("resume");
        }
        IntentFilter m = m();
        if (m != null && this.n == null) {
            C1044Mm.e("BaseListAdapter", "Register receiver in onResume...");
            LocalBroadcastManager.getInstance(context).registerReceiver(this.b, m);
            this.n = this.b;
        }
        if (k() || !f().isVolatile()) {
            return;
        }
        a(false);
    }

    @Override // o.AbstractC9900yh
    public void c(Context context) {
        if (this.n != null) {
            C1044Mm.e("BaseListAdapter", "Unregister receiver...");
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.n);
            this.n = null;
        }
        super.c(context);
    }

    int h() {
        return Math.min(d().m(), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Integer num = this.f13716o;
        if (num == null) {
            throw new NullPointerException("lomo's numVideos should have been set to a non-null value");
        }
        return Math.min(num.intValue(), g().size() + h());
    }

    public void a(boolean z) {
        final NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(a(), NetflixActivity.class);
        if (netflixActivity == null || C8141del.c(netflixActivity)) {
            return;
        }
        aIB.b(netflixActivity, new aIB.e() { // from class: o.cbW
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                AbstractC6337cbR.this.a(netflixActivity, serviceManager);
            }
        });
    }

    private String o() {
        LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter = this.k;
        if (lolomoRecyclerViewAdapter != null) {
            return lolomoRecyclerViewAdapter.g();
        }
        return null;
    }
}
