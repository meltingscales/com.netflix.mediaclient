package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.CLContext;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import java.util.Map;
import o.AbstractC9900yh;
import o.AbstractC9900yh.c;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5223buh;
import org.json.JSONObject;

/* renamed from: o.ccG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6379ccG<T extends AbstractC9900yh.c, O extends InterfaceC5223buh> extends AbstractC6337cbR<T, O> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6379ccG(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) lolomoRecyclerViewAdapter, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) interfaceC6394ccV, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
    }

    /* renamed from: o.ccG$d */
    /* loaded from: classes4.dex */
    public static abstract class d<V extends InterfaceC5223buh> extends AbstractC9900yh.c {
        private InterfaceC5222bug<V> c;
        private C6374ccB d;
        private final AbstractC5833cKa h;
        private TrackingInfoHolder j;

        public JSONObject a(InterfaceC5222bug<V> interfaceC5222bug, C6374ccB c6374ccB) {
            return null;
        }

        public void am_() {
        }

        public abstract boolean j();

        public CLContext k() {
            return null;
        }

        public final InterfaceC5222bug<V> m() {
            return this.c;
        }

        public final C6374ccB n() {
            return this.d;
        }

        public final TrackingInfoHolder q() {
            return this.j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(viewGroup, view, interfaceC1732aMe, i);
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) interfaceC1732aMe, "");
            this.j = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
            this.h = new c(view, this);
        }

        /* renamed from: o.ccG$d$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC5833cKa {
            final /* synthetic */ d<V> a;
            final /* synthetic */ View b;

            @Override // o.AbstractC5833cKa
            public View i() {
                return this.b;
            }

            c(View view, d<V> dVar) {
                this.b = view;
                this.a = dVar;
            }

            @Override // o.AbstractC5833cKa
            public TrackingInfo a(JSONObject jSONObject) {
                return this.a.q().c(jSONObject);
            }

            @Override // o.AbstractC5833cKa
            /* renamed from: n */
            public V j() {
                InterfaceC5222bug<V> m = this.a.m();
                if (m != null) {
                    return m.getVideo();
                }
                return null;
            }

            @Override // o.AbstractC5833cKa
            public String c() {
                V video;
                InterfaceC5223buh interfaceC5223buh;
                InterfaceC5149btM evidence;
                InterfaceC5149btM evidence2;
                InterfaceC5222bug<V> m = this.a.m();
                if (((m == null || (evidence2 = m.getEvidence()) == null) ? null : evidence2.getImageKey()) != null) {
                    InterfaceC5222bug<V> m2 = this.a.m();
                    if (m2 == null || (evidence = m2.getEvidence()) == null) {
                        return null;
                    }
                    return evidence.getImageKey();
                }
                InterfaceC5222bug<V> m3 = this.a.m();
                if (m3 == null || (video = m3.getVideo()) == null || (interfaceC5223buh = (InterfaceC5223buh) C9726vo.d(video, InterfaceC5223buh.class)) == null) {
                    return null;
                }
                return interfaceC5223buh.getBoxartId();
            }

            @Override // o.AbstractC5833cKa
            public Integer b() {
                if (this.a.getAdapterPosition() == -1) {
                    return null;
                }
                return Integer.valueOf(this.a.getAdapterPosition());
            }

            @Override // o.AbstractC5833cKa
            public Integer d() {
                C6374ccB n = this.a.n();
                if (n != null) {
                    return Integer.valueOf(n.a());
                }
                return null;
            }

            @Override // o.AbstractC5833cKa
            /* renamed from: m */
            public LoMo a() {
                C6374ccB n = this.a.n();
                if (n != null) {
                    return n.c();
                }
                return null;
            }

            @Override // o.AbstractC5833cKa
            public JSONObject g() {
                d<V> dVar = this.a;
                return dVar.a(dVar.m(), this.a.n());
            }

            @Override // o.AbstractC5833cKa
            public CLContext f() {
                return this.a.k();
            }

            @Override // o.AbstractC5833cKa
            public AppView h() {
                return this.a.al_();
            }

            @Override // o.AbstractC5833cKa
            public boolean e() {
                return this.a.j();
            }

            @Override // o.AbstractC5833cKa
            public void k() {
                this.a.am_();
            }
        }

        @Override // o.AbstractC9900yh.c
        public void a() {
            this.h.a(false);
            super.a();
            l();
        }

        public void e(C6374ccB c6374ccB, InterfaceC5222bug<V> interfaceC5222bug, int i, boolean z, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) c6374ccB, "");
            C8632dsu.c((Object) interfaceC5222bug, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.h.a(false);
            this.d = c6374ccB;
            this.c = interfaceC5222bug;
            this.j = c(trackingInfoHolder, interfaceC5222bug, i);
        }

        @Override // o.AbstractC9900yh.c
        public void d() {
            this.c = null;
            this.d = null;
            this.j = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
            C5838cKf.d(this.h);
            super.d();
        }

        public TrackingInfoHolder c(TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<V> interfaceC5222bug, int i) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) trackingInfoHolder, "");
            V video = interfaceC5222bug != null ? interfaceC5222bug.getVideo() : null;
            if (video instanceof C8329diN) {
                C8329diN c8329diN = (C8329diN) video;
                if (c8329diN.aF().getId() == null || c8329diN.aF().getBoxartId() == null) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "SPY-17693: Missing video summary data " + this.d;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
                return trackingInfoHolder.e(video, i);
            }
            return trackingInfoHolder;
        }

        public final void o() {
            this.h.a(false);
        }

        public void l() {
            C5838cKf.c(this.h);
        }

        public AppView al_() {
            return AppView.boxArt;
        }
    }
}
