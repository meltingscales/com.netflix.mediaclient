package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.uiView.interactive.PlayerInteractiveNavigationAdapter$generateSnapshotList$2;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cBQ;
import o.cIE;

/* loaded from: classes4.dex */
public final class cHZ extends RecyclerView.Adapter<AbstractC5790cIl> {
    public static final d c = new d(null);
    private String a;
    private boolean b;
    private final a d;
    private InteractiveMoments e;
    private List<? extends State> g;
    private final cHT i;
    private RecyclerView j;

    public final InteractiveMoments b() {
        return this.e;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    public final cHT c() {
        return this.i;
    }

    public cHZ(cHT cht) {
        List<? extends State> i;
        C8632dsu.c((Object) cht, "");
        this.i = cht;
        i = C8569dql.i();
        this.g = i;
        this.d = new a();
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlayerInteractiveNavigationAdapter");
        }
    }

    public final int a() {
        return getItemCount() - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.netflix.model.leafs.originals.interactive.InteractiveMoments r18, boolean r19, o.InterfaceC8585dra<? super o.dpR> r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cHZ.a(com.netflix.model.leafs.originals.interactive.InteractiveMoments, boolean, o.dra):java.lang.Object");
    }

    private final Object d(PlayerControls playerControls, InterfaceC8585dra<? super List<? extends State>> interfaceC8585dra) {
        return C8738dws.c(GF.d(), new PlayerInteractiveNavigationAdapter$generateSnapshotList$2(playerControls, this, null), interfaceC8585dra);
    }

    /* loaded from: classes4.dex */
    public static final class a implements cHX {
        a() {
        }

        @Override // o.cHX
        public void c(State state, int i, long j) {
            Snapshots snapshots;
            int indexOf;
            C8632dsu.c((Object) state, "");
            RecyclerView recyclerView = cHZ.this.j;
            if (recyclerView != null) {
                cHZ chz = cHZ.this;
                if (recyclerView.isEnabled()) {
                    recyclerView.performHapticFeedback(3);
                    chz.c().b((cHT) new cBQ.e(null, "", state.getStateSegmentId(), true, null, j, true));
                    InteractiveMoments interactiveMoments = chz.e;
                    if (interactiveMoments == null || (snapshots = interactiveMoments.snapshots()) == null || (indexOf = snapshots.indexOf(state)) <= -1) {
                        return;
                    }
                    chz.c().e(indexOf, true);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public AbstractC5790cIl onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.f, viewGroup, false);
        C8632dsu.d(inflate);
        C5792cIn c5792cIn = new C5792cIn((FrameLayout) inflate, this.d);
        c5792cIn.d(this.b);
        return c5792cIn;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onBindViewHolder(AbstractC5790cIl abstractC5790cIl, int i) {
        PlayerControls playerControls;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) abstractC5790cIl, "");
        if (i <= this.g.size()) {
            InteractiveMoments interactiveMoments = this.e;
            if (interactiveMoments == null || (playerControls = interactiveMoments.playerControls()) == null) {
                return;
            }
            abstractC5790cIl.a(this.g.get(i), this.a, playerControls, getItemCount() > 1);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("trying to bind a view that we don't have", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b);
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
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b */
    public void onViewRecycled(AbstractC5790cIl abstractC5790cIl) {
        C8632dsu.c((Object) abstractC5790cIl, "");
        abstractC5790cIl.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.j = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.j = null;
    }

    public final boolean e() {
        return getItemCount() > 0;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        c.getLogTag();
        this.a = str;
    }
}
