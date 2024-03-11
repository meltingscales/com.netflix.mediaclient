package com.netflix.mediaclient.ui.lolomo;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import o.AbstractC6337cbR;
import o.AbstractC6385ccM;
import o.AbstractC9900yh;
import o.C1044Mm;
import o.C1729aMb;
import o.C5087bsD;
import o.C6339cbT;
import o.C6343cbX;
import o.C6378ccF;
import o.C6380ccH;
import o.C6381ccI;
import o.C6383ccK;
import o.C6384ccL;
import o.C6386ccN;
import o.C6388ccP;
import o.C6390ccR;
import o.C6392ccT;
import o.C6395ccW;
import o.C6399cca;
import o.C6400ccb;
import o.C6412ccn;
import o.C6415ccq;
import o.C6416ccr;
import o.C6418cct;
import o.C8054ddD;
import o.C8153dex;
import o.InterfaceC1077Nv;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC5155btS;
import o.InterfaceC5363bxO;
import o.InterfaceC5366bxR;
import o.InterfaceC6387ccO;
import o.InterfaceC6394ccV;
import o.InterfaceC6419ccu;
import o.InterfaceC7407cvd;
import o.aSC;

/* loaded from: classes4.dex */
public class LolomoRecyclerViewAdapter extends BaseVerticalRecyclerViewAdapter<BaseVerticalRecyclerViewAdapter.d> implements InterfaceC1077Nv, AbstractC6337cbR.d {
    final LifecycleOwner b;
    @Inject
    InterfaceC5363bxO bulkRater;
    private final InterfaceC6394ccV f;
    private final Map<String, AbstractC9900yh> g;
    private int h;
    private String i;
    private InterfaceC1077Nv.e j;
    private InterfaceC5155btS k;
    private int l;
    private boolean m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private final b f13283o;
    private boolean p;
    private final List<LoMo> q;
    private final InterfaceC6387ccO r;
    private boolean s;
    private long t;
    private TrackingInfoHolder x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum Payload {
        FetchError,
        FetchSuccess
    }

    /* loaded from: classes4.dex */
    public interface b {
        void d(Status status);

        ServiceManager e();
    }

    private int c(int i) {
        return 14;
    }

    @Override // o.AbstractC6337cbR.d
    public void d(AbstractC6337cbR abstractC6337cbR) {
    }

    public String g() {
        return this.n;
    }

    public String i() {
        return this.i;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.m;
    }

    @Override // o.InterfaceC1077Nv
    public void setLoadingStatusCallback(InterfaceC1077Nv.e eVar) {
        this.j = eVar;
    }

    public ServiceManager j() {
        return this.f13283o.e();
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public AbstractC9900yh a(Context context, C1729aMb c1729aMb, int i) {
        LoMo f;
        if (i >= this.q.size() || i < d() || (f = f(i)) == null) {
            return null;
        }
        return this.g.get(f.getListId());
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public void a() {
        this.g.clear();
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public AbstractC9900yh c(Context context, C1729aMb c1729aMb, int i) {
        LoMo f;
        AbstractC9900yh<?> c6418cct;
        switch (c1729aMb.p()) {
            case -3:
            case -2:
            case -1:
            case 0:
            case 4:
            case 9:
                f = f(i);
                c6418cct = new C6418cct(context, f, this, c1729aMb, i, this.f, this.x);
                break;
            case 1:
            case 8:
                f = f(i);
                if (f.getType() == LoMoType.INSTANT_QUEUE) {
                    c6418cct = new C6415ccq(context, f, this, c1729aMb, i, this.f, this.x);
                    break;
                } else {
                    c6418cct = new C6388ccP<>(context, f, this, c1729aMb, i, this.f, this.x);
                    break;
                }
            case 2:
                f = f(i);
                c6418cct = new C6400ccb(context, f, this, c1729aMb, i, this.f, this.x);
                break;
            case 3:
                LoMo f2 = f(i);
                f = f2;
                c6418cct = new C6343cbX(context, f2, this, c1729aMb, i, this.h, this.f, this.x);
                break;
            case 5:
                f = f(i);
                c6418cct = new C6381ccI(context, f, this, c1729aMb, i, this.f, this.x);
                break;
            case 6:
            case 7:
            case 10:
            case 13:
            default:
                throw new RuntimeException("Missing BaseRowAdapter for view type " + c1729aMb.p());
            case 11:
                f = f(i);
                c6418cct = new C6395ccW(context, f, this, c1729aMb, i, this.f, this.x);
                break;
            case 12:
                f = f(i);
                c6418cct = new C6399cca(context, f, this, c1729aMb, i, this.f, this.x);
                break;
            case 14:
                f = f(i);
                c6418cct = InterfaceC7407cvd.a(context).e(context, c1729aMb, i, f, this, this.f, this.x);
                break;
            case 15:
                f = f(i);
                c6418cct = new C6416ccr(context, f, this, c1729aMb, i, this.f, this.x);
                break;
            case 16:
                f = f(i);
                c6418cct = new C6412ccn(context, f, this, c1729aMb, i, this.f, this.x);
                break;
        }
        if (f != null && f.getListId() != null) {
            Objects.requireNonNull(c6418cct, "Non-null result is expected");
            this.g.put(f.getListId(), c6418cct);
        }
        return c6418cct;
    }

    private LoMo f(int i) {
        try {
            return this.q.get(i - d());
        } catch (RuntimeException e) {
            InterfaceC1593aHa.b("SPY-32889 l=" + g() + " g=" + this.i + " s=" + this.q.size() + ",p=" + i + ", h=" + d());
            StringBuilder sb = new StringBuilder();
            Iterator<View> it = this.e.iterator();
            while (it.hasNext()) {
                View next = it.next();
                sb.append(next.getClass().getName());
                sb.append(" ");
                sb.append(next.getClass().getName());
            }
            InterfaceC1593aHa.b("SPY-32889 d=" + sb.toString());
            throw e;
        }
    }

    private boolean h(int i) {
        List<LoMo> list = this.q;
        return list == null || i == (list.size() + d()) + (b() ? 1 : 0);
    }

    private boolean i(int i) {
        return i < d();
    }

    private boolean j(int i) {
        return b() && i == getItemCount() - 1;
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int d(int i) {
        if (h(i)) {
            return this.p ? 9 : 0;
        } else if (i(i)) {
            return -1;
        } else {
            if (j(i)) {
                return -3;
            }
            LoMoType type = f(i).getType();
            if (C8153dex.d(type)) {
                return 1;
            }
            switch (AnonymousClass2.e[type.ordinal()]) {
                case 1:
                    return 3;
                case 2:
                    return 2;
                case 3:
                    return (aSC.a() && f(i).isRichUITreatment()) ? 5 : 1;
                case 4:
                case 5:
                case 6:
                case 7:
                    return 1;
                case 8:
                    return 4;
                case 9:
                    return 8;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 16;
                case 13:
                    return 15;
                case 14:
                case 15:
                    return c(i);
                default:
                    C1044Mm.d("LolomoRecyclerViewAdapter", "Unknown view type.");
                    throw new IllegalArgumentException("Unknown view type: " + type.toString());
            }
        }
    }

    /* renamed from: com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[LoMoType.values().length];
            e = iArr;
            try {
                iArr[LoMoType.BILLBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[LoMoType.CONTINUE_WATCHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[LoMoType.ROAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[LoMoType.CONTENT_PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[LoMoType.INSTANT_QUEUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[LoMoType.FLAT_GENRE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[LoMoType.STANDARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[LoMoType.CHARACTERS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[LoMoType.GALLERY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[LoMoType.TOP_TEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                e[LoMoType.BULK_RATER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                e[LoMoType.POPULAR_GAMES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                e[LoMoType.KIDS_FAVORITES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                e[LoMoType.COLLECTION_PAGE_EVIDENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                e[LoMoType.DOWNLOADS_FOR_YOU.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public BaseVerticalRecyclerViewAdapter.d a(ViewGroup viewGroup, C1729aMb c1729aMb) {
        switch (c1729aMb.p()) {
            case -3:
                return d(viewGroup);
            case -2:
                return h(viewGroup, c1729aMb);
            case -1:
                return c(viewGroup);
            case 0:
                return b(viewGroup);
            case 1:
            case 2:
            case 4:
            case 5:
            case 8:
            case 11:
            case 14:
            case 16:
                return b(viewGroup, c1729aMb);
            case 3:
                return d(viewGroup, c1729aMb);
            case 6:
            case 7:
            case 10:
            case 13:
            default:
                C1044Mm.d("LolomoRecyclerViewAdapter", "Unknown view type.");
                throw new IllegalArgumentException("Unknown view type: " + c1729aMb.p());
            case 9:
                return e(viewGroup);
            case 12:
                return e(viewGroup, c1729aMb);
            case 15:
                return c(viewGroup, c1729aMb);
        }
    }

    private C6386ccN b(ViewGroup viewGroup, C1729aMb c1729aMb) {
        return new C6386ccN(this.d.inflate(R.i.aA, viewGroup, false), c1729aMb, this.r);
    }

    private C6386ccN c(ViewGroup viewGroup, C1729aMb c1729aMb) {
        return new C6386ccN(this.d.inflate(R.i.av, viewGroup, false), c1729aMb, this.r);
    }

    private C6380ccH d(ViewGroup viewGroup, C1729aMb c1729aMb) {
        return new C6380ccH(this.d.inflate(R.i.as, viewGroup, false), c1729aMb, this.r);
    }

    private C6392ccT e(ViewGroup viewGroup, C1729aMb c1729aMb) {
        InterfaceC5366bxR e = this.bulkRater.e(viewGroup.getContext(), viewGroup, this.b);
        ViewGroup viewGroup2 = (ViewGroup) this.d.inflate(R.i.aw, viewGroup, false);
        viewGroup2.addView(e.a(), 0);
        return new C6392ccT(e, viewGroup2, c1729aMb, e.c(), this.r);
    }

    private C6390ccR h(ViewGroup viewGroup, C1729aMb c1729aMb) {
        return C6390ccR.a(viewGroup);
    }

    private C6339cbT b(ViewGroup viewGroup) {
        return C6339cbT.c(viewGroup);
    }

    private C6378ccF e(final ViewGroup viewGroup) {
        return new C6378ccF(this.d.inflate(R.i.aB, viewGroup, false), new C6378ccF.a() { // from class: o.ccw
            @Override // o.C6378ccF.a
            public final void d() {
                LolomoRecyclerViewAdapter.this.a(viewGroup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup) {
        this.p = false;
        notifyItemRemoved(getItemCount() - 1);
        b(viewGroup.getContext());
    }

    private C6384ccL c(ViewGroup viewGroup) {
        return C6384ccL.d(viewGroup);
    }

    private C6383ccK d(ViewGroup viewGroup) {
        return C6383ccK.d(viewGroup);
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public void d(BaseVerticalRecyclerViewAdapter.d dVar, int i, AbstractC9900yh abstractC9900yh, Parcelable parcelable) {
        if (dVar instanceof C6384ccL) {
            ((C6384ccL) dVar).e(e(i));
        } else if (dVar instanceof C6383ccK) {
            ((C6383ccK) dVar).d(c());
        } else if (dVar instanceof C6386ccN) {
            ((C6386ccN) dVar).a(f(i), abstractC9900yh, parcelable);
        } else if (dVar instanceof AbstractC6385ccM) {
            ((AbstractC6385ccM) dVar).a(f(i), abstractC9900yh, parcelable);
        } else if (dVar instanceof C6390ccR) {
            ((C6390ccR) dVar).d(f(i));
        }
        if (this.m || !this.s) {
            return;
        }
        if (i >= (e() + d()) - InterfaceC6419ccu.b.d()) {
            b(dVar.itemView.getContext());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public void onBindViewHolder(BaseVerticalRecyclerViewAdapter.d dVar, int i, List<Object> list) {
        if (list != null && list.contains(Payload.FetchError)) {
            dVar.d(true);
        } else if (list != null && list.contains(Payload.FetchSuccess)) {
            dVar.d(false);
        } else {
            super.onBindViewHolder(dVar, i, list);
        }
    }

    @Override // o.AbstractC6337cbR.d
    public void c(AbstractC6337cbR abstractC6337cbR, int i) {
        notifyItemChanged(i, Payload.FetchError);
    }

    @Override // o.AbstractC6337cbR.d
    public void d(AbstractC6337cbR abstractC6337cbR, int i) {
        notifyItemChanged(i, Payload.FetchSuccess);
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int e() {
        return a(true);
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter
    public int a(boolean z) {
        List<LoMo> list = this.q;
        int size = list == null ? 0 : list.size();
        return (z && this.s) ? size + 1 : size;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r13) {
        /*
            r12 = this;
            int r0 = r12.l
            boolean r0 = r12.g(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            o.aHd r0 = new o.aHd
            java.lang.String r2 = "fetchMoreData() should not be called if all rows are already fetched"
            r0.<init>(r2)
            o.aHd r0 = r0.b(r1)
            o.InterfaceC1598aHf.a(r0)
            r12.m = r1
            r12.s = r1
            return
        L1c:
            r0 = 1
            r12.m = r0
            long r2 = java.lang.System.nanoTime()
            r12.t = r2
            r12.p = r1
            int r2 = r12.l
            o.ccV r3 = r12.f
            if (r2 != 0) goto L2e
            r1 = r0
        L2e:
            int r1 = r3.c(r1)
            int r2 = r2 + r1
            int r2 = r2 - r0
            o.btS r1 = r12.k
            if (r1 == 0) goto L3d
            int r1 = r1.getNumLoMos()
            goto L3f
        L3d:
            r1 = 22
        L3f:
            int r1 = r1 + (-1)
            if (r2 <= r1) goto L4f
            o.ccV r3 = r12.f
            boolean r4 = r3 instanceof o.C6396ccX
            if (r4 != 0) goto L4d
            boolean r3 = r3 instanceof o.C6393ccU
            if (r3 == 0) goto L4f
        L4d:
            r10 = r1
            goto L50
        L4f:
            r10 = r2
        L50:
            int r1 = r12.l
            java.lang.String r2 = r12.n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2}
            java.lang.String r2 = "fetching from: %d to: %d, id: %s"
            java.lang.String r3 = "LolomoRecyclerViewAdapter"
            o.C1044Mm.d(r3, r2, r1)
            com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter$b r1 = r12.f13283o
            com.netflix.mediaclient.servicemgr.ServiceManager r1 = r1.e()
            if (r1 != 0) goto L75
            java.lang.String r0 = "Service manager is null - can't fetch data"
            o.C1044Mm.j(r3, r0)
            return
        L75:
            int r2 = r12.l
            o.ccV r6 = r12.f
            o.bsp r7 = r1.j()
            java.lang.String r8 = r12.n
            int r9 = r12.l
            com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter$d r11 = new com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter$d
            long r3 = r12.t
            int r1 = r10 - r2
            int r5 = r1 + 1
            r0 = r11
            r1 = r12
            r2 = r13
            r0.<init>(r2, r3, r5)
            r6.d(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter.b(android.content.Context):void");
    }

    protected void b(List<? extends LoMo> list, Status status) {
        int size = list.size();
        int size2 = this.q.size();
        this.q.addAll(list);
        this.l = this.q.size();
        if (g(this.q.size())) {
            this.s = false;
        }
        if (this.s) {
            notifyItemChanged(d() + size2);
            c(size2 + 1 + d(), size);
        } else {
            notifyItemRemoved(d() + size2);
            c(size2 + d(), size);
        }
        this.f13283o.d(status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Status status) {
        this.p = C8153dex.A();
        this.f13283o.d(status);
    }

    private boolean g(int i) {
        InterfaceC5155btS interfaceC5155btS;
        return this.l > 0 && (interfaceC5155btS = this.k) != null && interfaceC5155btS.getNumLoMos() > 0 && i >= this.k.getNumLoMos() - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends C5087bsD {
        private final Context a;
        private final WeakReference<Context> b;
        private final int d;
        private final long f;

        d(Context context, long j, int i) {
            super("LolomoRecyclerViewAdapter");
            this.f = j;
            this.d = i;
            this.b = new WeakReference<>(context);
            this.a = context;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void o(List<LoMo> list, Status status) {
            super.o(list, status);
            m(list, status);
        }

        private void m(List<? extends LoMo> list, Status status) {
            if (C8054ddD.l(this.b.get())) {
                return;
            }
            LolomoRecyclerViewAdapter.this.s = true;
            LolomoRecyclerViewAdapter.this.m = false;
            if (LolomoRecyclerViewAdapter.this.j != null) {
                LolomoRecyclerViewAdapter.this.j.c(status);
            }
            if (this.f != LolomoRecyclerViewAdapter.this.t) {
                C1044Mm.b("LolomoRecyclerViewAdapter", "Ignoring stale onLoMosFetched callback");
            } else if (status.i()) {
                C1044Mm.j("LolomoRecyclerViewAdapter", "Invalid status code");
                LolomoRecyclerViewAdapter.this.s = false;
                LolomoRecyclerViewAdapter.this.c(status);
            } else {
                LolomoRecyclerViewAdapter.this.p = false;
                if (list != null) {
                    if (list.size() < this.d) {
                        LolomoRecyclerViewAdapter.this.s = false;
                    }
                    LolomoRecyclerViewAdapter.this.b(list, status);
                    return;
                }
                InterfaceC1598aHf.a("lomos is null but error is not error : " + status);
            }
        }
    }
}
