package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.v2.uiView.interactive.PlayerInteractiveNavigationUIView$setAdapterMoments$2;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.SourceRect;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import java.util.List;
import o.cBO;
import o.cBQ;
import o.cIE;
import o.dxD;

/* renamed from: o.cIc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5781cIc extends AbstractC5765cHn implements cHT, dwU {
    public static final c b = new c(null);
    private final C5795cIq a;
    private final dqZ c;
    private final cHZ d;
    private dxD e;
    private final C1204Sr f;
    private final ViewGroup g;
    private LinearLayoutManager h;
    private final RecyclerView j;
    private final ViewGroup l;

    @Override // o.AbstractC9944zY
    /* renamed from: f */
    public ViewGroup e() {
        return this.l;
    }

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5781cIc(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.g = viewGroup;
        View e = C9703vR.e(viewGroup, cIE.c.I, 0, 2, null);
        C8632dsu.d(e);
        this.l = (LinearLayout) e;
        View findViewById = e().findViewById(cIE.b.aR);
        C8632dsu.a(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.j = recyclerView;
        View findViewById2 = e().findViewById(cIE.b.R);
        C8632dsu.a(findViewById2, "");
        C1204Sr c1204Sr = (C1204Sr) findViewById2;
        this.f = c1204Sr;
        cHZ chz = new cHZ(this);
        this.d = chz;
        C5795cIq c5795cIq = new C5795cIq(e(), chz);
        this.a = c5795cIq;
        e().setOnClickListener(new View.OnClickListener() { // from class: o.cIh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5781cIc.a(C5781cIc.this, view);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewGroup.getContext(), 0, false);
        linearLayoutManager.setStackFromEnd(true);
        this.h = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(false);
        recyclerView.addItemDecoration(c5795cIq);
        recyclerView.setAdapter(chz);
        e().setVisibility(4);
        c1204Sr.setTextSize(C8150deu.h() ? 24.0f : 12.0f);
        this.c = dxZ.d(null, 1, null);
    }

    /* renamed from: o.cIc$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayerInteractiveNavigationView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5781cIc c5781cIc, View view) {
        C8632dsu.c((Object) c5781cIc, "");
        c5781cIc.b((C5781cIc) cBO.C5568d.e);
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        return e().getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        if (!this.d.e() || w()) {
            return;
        }
        i();
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, true, 6, null);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        super.b();
        this.j.setEnabled(false);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        super.d();
        this.j.setEnabled(true);
    }

    @Override // o.cHT
    public void a(String str) {
        this.f.setText(str);
        this.f.setVisibility(0);
    }

    @Override // o.cHT
    public void g() {
        e().setVisibility(8);
    }

    @Override // o.cHW
    public void d(boolean z) {
        this.d.b(z);
    }

    @Override // o.cHW
    public void b(int i, int i2, int i3, int i4) {
        b((C5781cIc) new cBQ.q(i, i2, i3, i4));
    }

    @Override // o.cHT
    public void a(InteractiveMoments interactiveMoments, boolean z) {
        PlayerControls.ChoicePointsMetadata choicePointsMetadata;
        PlayerControls.ChoicePointsMetadata.Cell cell;
        SourceRect rect;
        Integer width;
        C8632dsu.c((Object) interactiveMoments, "");
        PlayerControls playerControls = interactiveMoments.playerControls();
        if (playerControls != null && (choicePointsMetadata = playerControls.choicePointsMetadata()) != null && (cell = choicePointsMetadata.cell()) != null && (rect = cell.rect()) != null && (width = rect.width()) != null) {
            C8632dsu.d(width);
            int intValue = width.intValue();
            C5795cIq c5795cIq = this.a;
            C5794cIp c5794cIp = C5794cIp.a;
            Context context = e().getContext();
            C8632dsu.a(context, "");
            c5795cIq.c(intValue * c5794cIp.b(context));
        }
        e(interactiveMoments, z);
    }

    @Override // o.cHT
    public void b(PlaylistTimestamp playlistTimestamp) {
        String str;
        if (playlistTimestamp == null || (str = playlistTimestamp.a) == null) {
            return;
        }
        this.d.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        int a;
        if (!this.d.e() || (a = this.d.a()) < 0) {
            return;
        }
        this.j.scrollToPosition(a);
    }

    @Override // o.cHT
    public void e(int i, boolean z) {
        List i2;
        State state;
        PlayerControls.Config config;
        InteractiveMoments b2 = this.d.b();
        if (b2 != null) {
            Snapshots snapshots = b2.snapshots();
            C8632dsu.a(snapshots, "");
            int size = snapshots.size();
            if (z) {
                state = snapshots.get(i);
                i2 = C8576dqs.h((List) snapshots, size - i);
            } else {
                PlayerControls playerControls = b2.playerControls();
                int maxSnapshotsToPersist = size - ((playerControls == null || (config = playerControls.config()) == null) ? 0 : config.maxSnapshotsToPersist());
                if (maxSnapshotsToPersist <= 0) {
                    return;
                }
                i2 = C8576dqs.i(snapshots, maxSnapshotsToPersist);
                state = null;
            }
            snapshots.clear();
            snapshots.addAll(i2);
            if (state != null) {
                b2.stateHistory().persistent().values = state.values;
            }
            d(this, b2, false, 2, null);
        }
    }

    static /* synthetic */ void d(C5781cIc c5781cIc, InteractiveMoments interactiveMoments, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c5781cIc.e(interactiveMoments, z);
    }

    private final void e(InteractiveMoments interactiveMoments, boolean z) {
        dxD c2;
        dxD dxd = this.e;
        this.e = null;
        if (dxd != null && dxd.cu_()) {
            dxD.b.b(dxd, null, 1, null);
        }
        c2 = C8737dwr.c(this, GF.e(), null, new PlayerInteractiveNavigationUIView$setAdapterMoments$2(this, interactiveMoments, z, null), 2, null);
        this.e = c2;
    }

    @Override // o.cHT
    public void c(ImpressionData impressionData) {
        b((C5781cIc) new cBQ.r(impressionData));
    }
}
