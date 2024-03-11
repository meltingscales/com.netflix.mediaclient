package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.model.leafs.VideoInfo;
import java.util.Map;
import o.C1596aHd;
import o.C6388ccP;
import o.C7378cvA;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC7407cvd;
import o.dpR;
import o.dqE;

/* renamed from: o.cvA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7378cvA extends C6388ccP<InterfaceC5223buh> {
    public static final c b = new c(null);
    public static final int c = 8;
    private final TrackingInfoHolder f;
    private final InterfaceC6394ccV g;
    private final LolomoRecyclerViewAdapter j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7378cvA(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) lolomoRecyclerViewAdapter, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) interfaceC6394ccV, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.j = lolomoRecyclerViewAdapter;
        this.g = interfaceC6394ccV;
        this.f = trackingInfoHolder;
    }

    /* renamed from: o.cvA$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int c2 = c(i);
        if (i == 0 && c2 == 0) {
            return 2;
        }
        return c2;
    }

    @Override // o.C6388ccP, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public C6388ccP.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        if (i == 2) {
            Context context = viewGroup.getContext();
            C8632dsu.a(context, "");
            return c(viewGroup, new C7425cvv(context), this);
        }
        C6388ccP.a onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        C8632dsu.d(onCreateViewHolder);
        return onCreateViewHolder;
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // o.AbstractC6337cbR, o.AbstractC9900yh
    /* renamed from: e */
    public void b(final C6388ccP.a aVar, int i) {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) aVar, "");
        boolean z = i <= d().m();
        if (d(i)) {
            if (aVar instanceof d) {
                InterfaceC5223buh video = ((InterfaceC5222bug) g().get(i)).getVideo();
                C8632dsu.a(video, "");
                VideoInfo.HorzBillboardArt bN_ = ((InterfaceC5142btF) C9726vo.d(video, InterfaceC5142btF.class)).bN_();
                if (((dpR) C9726vo.d(bN_ != null ? bN_.getUrl() : null, bN_ != null ? bN_.getWidth() : null, bN_ != null ? bN_.getHeight() : null, new InterfaceC8612dsa<String, Integer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.lolomo.DownloadsForYouRowListAdapter$onBindCoverViewHolder$1
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(String str, Integer num, Integer num2) {
                        a(str, num, num2);
                        return dpR.c;
                    }

                    public final void a(String str, Integer num, Integer num2) {
                        Map d4;
                        Map k3;
                        Throwable th3;
                        C8632dsu.c((Object) str, "");
                        C8632dsu.c((Object) num, "");
                        C8632dsu.c((Object) num2, "");
                        if (str.length() > 0 && num.intValue() > 0 && num2.intValue() > 0) {
                            ((C7378cvA.d) C6388ccP.a.this).b(new InterfaceC7407cvd.d(str, num.intValue(), num2.intValue()));
                            return;
                        }
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d4 = dqE.d();
                        k3 = dqE.k(d4);
                        C1596aHd c1596aHd = new C1596aHd("Downloads For You row header billboard image asset data is invalid", null, null, false, k3, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                String c2 = errorType.c();
                                c1596aHd.a(c2 + " " + b2);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th3 = new Throwable(c1596aHd.b());
                        } else {
                            th3 = c1596aHd.i;
                            if (th3 == null) {
                                th3 = new Throwable("Handled exception with no message");
                            } else if (th3 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a = dVar.a();
                        if (a != null) {
                            a.e(c1596aHd, th3);
                        } else {
                            dVar.e().b(c1596aHd, th3);
                        }
                    }
                })) == null) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d3 = dqE.d();
                    k2 = dqE.k(d3);
                    C1596aHd c1596aHd = new C1596aHd("Downloads For You row header billboard image asset data is empty", null, null, false, k2, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            c1596aHd.a(errorType.c() + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                        return;
                    } else {
                        dVar.e().b(c1596aHd, th2);
                        return;
                    }
                }
                return;
            }
            int i2 = i - 1;
            d(aVar, (InterfaceC5222bug) g().get(i2), i2, z);
            return;
        }
        b(aVar, i, z);
        ServiceManager serviceManager = ((AbstractC6337cbR) this).e;
        if (serviceManager != null) {
            d(aVar.itemView.getContext(), serviceManager);
            return;
        }
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd2 = new C1596aHd("serviceManager should not be null while binding new data", null, null, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd2.a;
        if (errorType2 != null) {
            c1596aHd2.e.put("errorType", errorType2.c());
            String b3 = c1596aHd2.b();
            if (b3 != null) {
                c1596aHd2.a(errorType2.c() + " " + b3);
            }
        }
        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
            th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
        } else if (c1596aHd2.b() != null) {
            th = new Throwable(c1596aHd2.b());
        } else {
            th = c1596aHd2.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar2.a();
        if (a2 != null) {
            a2.e(c1596aHd2, th);
        } else {
            dVar2.e().b(c1596aHd2, th);
        }
    }

    private final int c(int i) {
        return !d(i);
    }

    private final boolean d(int i) {
        return g().size() > 0 && i < g().size() + 1;
    }

    private final d c(ViewGroup viewGroup, C7425cvv c7425cvv, InterfaceC1732aMe interfaceC1732aMe) {
        return new d(viewGroup, c7425cvv, interfaceC1732aMe);
    }

    /* renamed from: o.cvA$d */
    /* loaded from: classes4.dex */
    public static final class d extends C6388ccP.a {
        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup, C7425cvv c7425cvv, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, c7425cvv, interfaceC1732aMe);
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) c7425cvv, "");
            C8632dsu.c((Object) interfaceC1732aMe, "");
        }

        @Override // o.AbstractC9900yh.c
        public int d(int i, C1729aMb c1729aMb) {
            C8632dsu.c((Object) c1729aMb, "");
            return (i + c1729aMb.i()) * 2;
        }

        @Override // o.AbstractC9900yh.c
        public int d(ViewGroup.LayoutParams layoutParams, C1729aMb c1729aMb) {
            C8632dsu.c((Object) layoutParams, "");
            C8632dsu.c((Object) c1729aMb, "");
            return (layoutParams.width - c1729aMb.a()) / 2;
        }

        public final void b(InterfaceC7407cvd.d dVar) {
            C8632dsu.c((Object) dVar, "");
            View view = this.itemView;
            C7425cvv c7425cvv = view instanceof C7425cvv ? (C7425cvv) view : null;
            if (c7425cvv != null) {
                c7425cvv.c(dVar);
            }
        }
    }
}
