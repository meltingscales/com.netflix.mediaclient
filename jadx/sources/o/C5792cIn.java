package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.R;
import com.netflix.model.leafs.originals.interactive.AssetManifest;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.SourceRect;
import com.netflix.model.leafs.originals.interactive.condition.State;
import java.util.List;
import java.util.Map;
import o.C1204Sr;
import o.C5792cIn;
import o.C5794cIp;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC9638uF;
import o.cIA;
import o.cIE;
import o.dpR;
import o.drX;

/* renamed from: o.cIn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5792cIn extends AbstractC5790cIl {
    private PlayerControls.ChoicePointsMetadata.ChoicePoint a;
    private final C1204Sr b;
    private final C1204Sr e;
    private final NetflixImageView f;
    private final NetflixImageView g;
    private final FrameLayout h;
    private State i;
    private final NetflixImageView j;
    public static final d d = new d(null);
    private static final boolean c = C8150deu.h();

    public void b(PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint) {
        this.a = choicePoint;
    }

    public PlayerControls.ChoicePointsMetadata.ChoicePoint c() {
        return this.a;
    }

    @Override // o.AbstractC5790cIl
    public void c(State state) {
        this.i = state;
    }

    public C1204Sr d() {
        return this.b;
    }

    @Override // o.AbstractC5790cIl
    public State e() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5792cIn(FrameLayout frameLayout, cHX chx) {
        super(frameLayout, chx);
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) chx, "");
        View findViewById = frameLayout.findViewById(cIE.b.P);
        C8632dsu.a(findViewById, "");
        this.j = (NetflixImageView) findViewById;
        View findViewById2 = frameLayout.findViewById(cIE.b.S);
        C8632dsu.a(findViewById2, "");
        this.f = (NetflixImageView) findViewById2;
        View findViewById3 = frameLayout.findViewById(cIE.b.O);
        C8632dsu.a(findViewById3, "");
        this.g = (NetflixImageView) findViewById3;
        View findViewById4 = frameLayout.findViewById(cIE.b.az);
        C8632dsu.a(findViewById4, "");
        this.e = (C1204Sr) findViewById4;
        this.h = (FrameLayout) frameLayout.findViewById(cIE.b.Q);
        View findViewById5 = frameLayout.findViewById(cIE.b.aC);
        C8632dsu.a(findViewById5, "");
        this.b = (C1204Sr) findViewById5;
    }

    @Override // o.AbstractC5790cIl
    public long b() {
        PlayerControls.ChoicePointsMetadata.ChoicePoint c2 = c();
        Long startTimeMs = c2 != null ? c2.startTimeMs() : null;
        if (startTimeMs == null) {
            return 0L;
        }
        return startTimeMs.longValue();
    }

    /* renamed from: o.cIn$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SegmentSnapshotViewHolder");
        }

        public final boolean c() {
            return C5792cIn.c;
        }
    }

    @Override // o.AbstractC5790cIl
    public void a(State state, String str, final PlayerControls playerControls, final boolean z) {
        C8632dsu.c((Object) state, "");
        C8632dsu.c((Object) playerControls, "");
        c(state);
        final String stateSegmentId = state.getStateSegmentId();
        final PlayerControls.ChoicePointsMetadata choicePointsMetadata = playerControls.choicePointsMetadata();
        if (choicePointsMetadata != null) {
            Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints = choicePointsMetadata.choicePoints();
            b(choicePoints != null ? choicePoints.get(stateSegmentId) : null);
            i().setTag(stateSegmentId);
            if (g()) {
                d().setText(stateSegmentId);
                d().setVisibility(0);
            } else {
                d().setVisibility(8);
            }
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            this.j.setVisibility(0);
            dpR dpr = (dpR) C9726vo.d(choicePointsMetadata.assetManifest(), choicePointsMetadata.cell(), new drX<AssetManifest, PlayerControls.ChoicePointsMetadata.Cell, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SegmentSnapshotViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: b */
                public final dpR invoke(final AssetManifest assetManifest, PlayerControls.ChoicePointsMetadata.Cell cell) {
                    NetflixImageView netflixImageView;
                    NetflixImageView netflixImageView2;
                    NetflixImageView netflixImageView3;
                    C8632dsu.c((Object) assetManifest, "");
                    C8632dsu.c((Object) cell, "");
                    PlayerControls.ChoicePointsMetadata.Cell.MainView mainView = cell.mainView();
                    PlayerControls.ChoicePointsMetadata.Cell.Focus focus = cell.focus();
                    InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
                    netflixImageView = C5792cIn.this.j;
                    Context context = netflixImageView.getContext();
                    C8632dsu.a(context, "");
                    final InterfaceC9638uF d2 = eVar.d(context);
                    String assetId = mainView != null ? mainView.assetId() : null;
                    C5792cIn c5792cIn = C5792cIn.this;
                    C5794cIp c5794cIp = C5794cIp.a;
                    netflixImageView2 = c5792cIn.f;
                    c5794cIp.a(d2, netflixImageView2, assetManifest.getImage(assetId), (r18 & 8) != 0 ? null : cell.rect(), (r18 & 16) != 0 ? 1.0f : c5792cIn.j(), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                    String assetId2 = focus != null ? focus.assetId() : null;
                    C5792cIn c5792cIn2 = C5792cIn.this;
                    netflixImageView3 = c5792cIn2.g;
                    c5794cIp.a(d2, netflixImageView3, assetManifest.getImage(assetId2), (r18 & 8) != 0 ? null : cell.rect(), (r18 & 16) != 0 ? 1.0f : c5792cIn2.j(), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                    PlayerControls.Config config = playerControls.config();
                    List<SourceRect> choicePosition = cell.choicePosition();
                    SourceRect sourceRect = choicePosition != null ? choicePosition.get(0) : null;
                    final String str2 = stateSegmentId;
                    final PlayerControls.ChoicePointsMetadata choicePointsMetadata2 = choicePointsMetadata;
                    final C5792cIn c5792cIn3 = C5792cIn.this;
                    final boolean z2 = z;
                    final PlayerControls playerControls2 = playerControls;
                    return (dpR) C9726vo.d(config, sourceRect, new drX<PlayerControls.Config, SourceRect, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SegmentSnapshotViewHolder$bind$1$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(PlayerControls.Config config2, SourceRect sourceRect2) {
                            a(config2, sourceRect2);
                            return dpR.c;
                        }

                        public final void a(final PlayerControls.Config config2, final SourceRect sourceRect2) {
                            Image image;
                            PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint;
                            NetflixImageView netflixImageView4;
                            C8632dsu.c((Object) config2, "");
                            C8632dsu.c((Object) sourceRect2, "");
                            PlayerControls.Config.ImagesConfig images = config2.images();
                            if (images == null || (image = images.getImageForSegmentId(str2)) == null) {
                                AssetManifest assetManifest2 = assetManifest;
                                Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints2 = choicePointsMetadata2.choicePoints();
                                image = assetManifest2.getImage((choicePoints2 == null || (choicePoint = choicePoints2.get(str2)) == null) ? null : choicePoint.assetId());
                                if (image == null) {
                                    return;
                                }
                            }
                            Image image2 = image;
                            C5794cIp c5794cIp2 = C5794cIp.a;
                            InterfaceC9638uF interfaceC9638uF = d2;
                            netflixImageView4 = c5792cIn3.j;
                            float j = c5792cIn3.j();
                            final C5792cIn c5792cIn4 = c5792cIn3;
                            final boolean z3 = z2;
                            final PlayerControls playerControls3 = playerControls2;
                            c5794cIp2.a(interfaceC9638uF, netflixImageView4, image2, (r18 & 8) != 0 ? null : sourceRect2, (r18 & 16) != 0 ? 1.0f : j, (r18 & 32) != 0 ? null : new cIA() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SegmentSnapshotViewHolder.bind.1.1.3.3
                                @Override // o.cIA
                                public void b(String str3) {
                                    NetflixImageView netflixImageView5;
                                    netflixImageView5 = C5792cIn.this.j;
                                    netflixImageView5.setImageDrawable(null);
                                }

                                @Override // o.cIA
                                public void e(View view) {
                                    C1204Sr c1204Sr;
                                    C1204Sr c1204Sr2;
                                    C1204Sr c1204Sr3;
                                    C1204Sr c1204Sr4;
                                    FrameLayout frameLayout;
                                    PlayerControls.ChoicePointsMetadata.ChoicePoint c2;
                                    C8632dsu.c((Object) view, "");
                                    C5794cIp c5794cIp3 = C5794cIp.a;
                                    c1204Sr = C5792cIn.this.e;
                                    Integer width = sourceRect2.width();
                                    C8632dsu.a(width, "");
                                    c5794cIp3.d(c1204Sr, width.intValue(), -2, 0, 0, C5792cIn.this.j());
                                    String description = (!z3 || (c2 = C5792cIn.this.c()) == null) ? null : c2.description();
                                    C5792cIn.this.i().setContentDescription(description != null ? description : playerControls3.headerText());
                                    c1204Sr2 = C5792cIn.this.e;
                                    c1204Sr2.setText(description);
                                    c1204Sr3 = C5792cIn.this.e;
                                    c1204Sr3.setTextSize(C5792cIn.d.c() ? 24.0f : 12.0f);
                                    c1204Sr4 = C5792cIn.this.e;
                                    c1204Sr4.setTextDirection(config2.getTextDirection());
                                    frameLayout = C5792cIn.this.h;
                                    frameLayout.setForeground(ContextCompat.getDrawable(view.getContext(), R.e.aE));
                                }
                            }, (r18 & 64) != 0 ? null : null);
                        }
                    });
                }
            });
        }
    }

    @Override // o.AbstractC5790cIl
    public void f() {
        super.f();
        b((PlayerControls.ChoicePointsMetadata.ChoicePoint) null);
        this.e.setText((CharSequence) null);
        this.j.onViewRecycled();
        this.j.setImageDrawable(null);
    }
}
