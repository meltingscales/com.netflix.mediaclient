package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.animation.Animation;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import java.nio.charset.StandardCharsets;
import o.AbstractC1608aHp;
import o.AbstractC3823bLz;
import o.C1333Xq;
import o.C2376afA;
import o.C3796bKz;
import o.C4022bTi;
import o.C9834xU;
import o.InterfaceC5149btM;
import o.InterfaceC5162btZ;
import o.bLG;
import o.bSJ;

/* loaded from: classes4.dex */
public final class bUH {
    private static byte e$ss2$538 = 24;
    private static int g = 0;
    private static int i = 1;
    private final InterfaceC7407cvd a;
    private final bSY b;
    private final CollectTaste c;
    private final drM<bSJ, dpR> d;
    private final Context e;
    private final InterfaceC5840cKh h;
    private final InterfaceC8554dpx j;

    private final boolean a(LoMo loMo) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bUH(Context context, bSY bsy, InterfaceC5840cKh interfaceC5840cKh, CollectTaste collectTaste, InterfaceC7407cvd interfaceC7407cvd, drM<? super bSJ, dpR> drm) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) interfaceC5840cKh, "");
        C8632dsu.c((Object) collectTaste, "");
        C8632dsu.c((Object) interfaceC7407cvd, "");
        C8632dsu.c((Object) drm, "");
        this.e = context;
        this.b = bsy;
        this.h = interfaceC5840cKh;
        this.c = collectTaste;
        this.a = interfaceC7407cvd;
        this.d = drm;
        b = dpB.b(new drO<C1333Xq>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$mostLikedRowWithPercentageEvidenceVideoContentDescription$2
            @Override // o.drO
            /* renamed from: a */
            public final C1333Xq invoke() {
                return C1333Xq.d(R.o.hx);
            }
        });
        this.j = b;
    }

    private final C1333Xq c() {
        return (C1333Xq) this.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0537  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o.InterfaceC2023aX r28, o.C4049bUi r29, o.InterfaceC5155btS r30, com.netflix.mediaclient.servicemgr.interface_.LoMo r31, final o.InterfaceC5222bug<? extends o.InterfaceC5223buh> r32, final int r33, final com.netflix.mediaclient.clutils.TrackingInfoHolder r34) {
        /*
            Method dump skipped, instructions count: 1667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bUH.b(o.aX, o.bUi, o.btS, com.netflix.mediaclient.servicemgr.interface_.LoMo, o.bug, int, com.netflix.mediaclient.clutils.TrackingInfoHolder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    private final boolean d(LoMo loMo) {
        return aSC.a() && loMo.isRichUITreatment() && !C8171dfO.e();
    }

    private final void e(InterfaceC2023aX interfaceC2023aX, LoMo loMo, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, final TrackingInfoHolder trackingInfoHolder) {
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        C3793bKw c3793bKw = new C3793bKw();
        String id2 = interfaceC5222bug.getVideo().getId();
        c3793bKw.e((CharSequence) ("downloads-row-item-group-" + id2));
        c3793bKw.c(C3796bKz.g.f13517J);
        c3793bKw.a(true);
        c3793bKw.c(LolomoEpoxyController.Companion.b());
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addDownloadedVideo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final TrackingInfo invoke() {
                String boxartId;
                TrackingInfoHolder trackingInfoHolder2 = TrackingInfoHolder.this;
                InterfaceC5149btM evidence = interfaceC5222bug.getEvidence();
                if (evidence == null || (boxartId = evidence.getImageKey()) == null) {
                    boxartId = interfaceC5222bug.getVideo().getBoxartId();
                }
                return TrackingInfoHolder.a(trackingInfoHolder2, boxartId, null, null, 6, null);
            }
        });
        c3793bKw.d(bSI.c(loMo));
        c3793bKw.d(bSY.a(this.b, false, 1, null));
        c3793bKw.b(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        C8632dsu.d(video);
        final C7460cwd c7460cwd = (C7460cwd) video;
        bLE ble = new bLE();
        ble.d((CharSequence) id);
        ble.d(interfaceC5222bug.getVideo().getTitle());
        ble.e(C3796bKz.g.E);
        ble.c(C8140dek.a.a(this.e, interfaceC5222bug.getVideo()));
        ble.b(c7460cwd.aA());
        ble.b(new View.OnClickListener() { // from class: o.bUO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.c(bUH.this, c7460cwd, trackingInfoHolder, view);
            }
        });
        ble.c(new InterfaceC4467bf() { // from class: o.bUN
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                bUH.b(bUH.this, c7460cwd, (bLE) abstractC3073as, (bLG.a) obj, i2);
            }
        });
        c3793bKw.add(ble);
        this.h.c(c3793bKw, interfaceC5222bug);
        interfaceC2023aX.add(c3793bKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bUH buh, C7460cwd c7460cwd, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) c7460cwd, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        buh.h.e(c7460cwd, trackingInfoHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bUH buh, C7460cwd c7460cwd, bLE ble, bLG.a aVar, int i2) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) c7460cwd, "");
        Drawable drawable = ResourcesCompat.getDrawable(buh.e.getResources(), C9834xU.j.q, buh.e.getTheme());
        if (drawable != null) {
            if (c7460cwd.getType() == VideoType.MOVIE && c7460cwd.C() == WatchState.WATCHING_ALLOWED) {
                aVar.d().addOverlay(drawable, 17);
            } else {
                aVar.d().removeOverlay(drawable);
            }
        }
    }

    private final void e(InterfaceC2023aX interfaceC2023aX, LoMo loMo, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, C4049bUi c4049bUi, final TrackingInfoHolder trackingInfoHolder) {
        InterfaceC5149btM evidence;
        String boxshotUrl;
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        final C2376afA.e a = c4049bUi.l().a(Integer.parseInt(id));
        C3793bKw c3793bKw = new C3793bKw();
        String id2 = interfaceC5222bug.getVideo().getId();
        c3793bKw.e((CharSequence) ("favorite-titles-row-item-group-" + id2));
        c3793bKw.c(C3796bKz.g.M);
        c3793bKw.a(true);
        c3793bKw.c(LolomoEpoxyController.Companion.b());
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addFavoritesVideo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final TrackingInfo invoke() {
                InterfaceC5149btM evidence2;
                String boxartId;
                TrackingInfoHolder trackingInfoHolder2 = TrackingInfoHolder.this;
                C2376afA.e eVar = a;
                if ((eVar == null || (boxartId = eVar.c()) == null) && ((evidence2 = interfaceC5222bug.getEvidence()) == null || (boxartId = evidence2.getImageKey()) == null)) {
                    boxartId = interfaceC5222bug.getVideo().getBoxartId();
                }
                return TrackingInfoHolder.a(trackingInfoHolder2, boxartId, null, null, 6, null);
            }
        });
        c3793bKw.d(bSI.c(loMo));
        c3793bKw.d(bSY.a(this.b, false, 1, null));
        c3793bKw.b(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        bLE ble = new bLE();
        ble.d((CharSequence) id);
        ble.d(interfaceC5222bug.getVideo().getTitle());
        ble.e(C3796bKz.g.E);
        ble.c(C8140dek.a.a(this.e, interfaceC5222bug.getVideo()));
        if ((a == null || (boxshotUrl = a.e()) == null) && ((evidence = interfaceC5222bug.getEvidence()) == null || (boxshotUrl = evidence.getImageUrl()) == null)) {
            boxshotUrl = interfaceC5222bug.getVideo().getBoxshotUrl();
        }
        ble.b(boxshotUrl);
        ble.b(new View.OnClickListener() { // from class: o.bUU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.f(bUH.this, interfaceC5222bug, trackingInfoHolder, view);
            }
        });
        c3793bKw.add(ble);
        if (C8161dfE.d.a()) {
            this.h.d(c3793bKw, interfaceC5222bug.getVideo());
        }
        interfaceC2023aX.add(c3793bKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    private final void b(InterfaceC2023aX interfaceC2023aX, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, C4049bUi c4049bUi, final TrackingInfoHolder trackingInfoHolder) {
        final InterfaceC5223buh interfaceC5223buh;
        if (c4049bUi.y().contains(interfaceC5222bug.getVideo().getId())) {
            return;
        }
        if (interfaceC5222bug.getVideo().getType() == VideoType.EPISODE) {
            interfaceC5223buh = (InterfaceC5223buh) C9726vo.d(interfaceC5222bug.getVideo(), aEH.class);
        } else {
            interfaceC5223buh = (InterfaceC5223buh) C9726vo.d(interfaceC5222bug.getVideo(), aEM.class);
        }
        C3793bKw c3793bKw = new C3793bKw();
        String id = interfaceC5222bug.getVideo().getId();
        c3793bKw.e((CharSequence) ("recently-watched-row-item-group-" + id));
        c3793bKw.c(C3796bKz.g.K);
        c3793bKw.a(true);
        c3793bKw.c(LolomoEpoxyController.Companion.b());
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addRecentlyWatchedVideo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.a(TrackingInfoHolder.this, ((InterfaceC5162btZ) interfaceC5223buh).a(), null, null, 6, null);
            }
        });
        c3793bKw.d(bSI.c(loMo));
        c3793bKw.d(bSY.a(this.b, false, 1, null));
        c3793bKw.b(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        bLE ble = new bLE();
        ble.d((CharSequence) interfaceC5222bug.getVideo().getId());
        ble.d(interfaceC5222bug.getVideo().getTitle());
        ble.e(C3796bKz.g.E);
        ble.c(C8140dek.a.a(this.e, interfaceC5222bug.getVideo()));
        InterfaceC5162btZ interfaceC5162btZ = (InterfaceC5162btZ) interfaceC5223buh;
        ble.b(interfaceC5162btZ.b());
        ble.b(new View.OnClickListener() { // from class: o.bUV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.d(bUH.this, interfaceC5223buh, trackingInfoHolder, view);
            }
        });
        c3793bKw.add(ble);
        this.h.a(c3793bKw, interfaceC5162btZ, trackingInfoHolder);
        interfaceC2023aX.add(c3793bKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(bUH buh, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (interfaceC5223buh instanceof aEH) {
            interfaceC5223buh = ((aEH) interfaceC5223buh).e();
        }
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, interfaceC5223buh, trackingInfoHolder, context, null, 8, null);
    }

    private final void c(InterfaceC2023aX interfaceC2023aX, LoMo loMo, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, final TrackingInfoHolder trackingInfoHolder) {
        final C1510aDz c1510aDz = (C1510aDz) C9726vo.d(interfaceC5222bug.getVideo(), C1510aDz.class);
        C3793bKw c3793bKw = new C3793bKw();
        String id = interfaceC5222bug.getVideo().getId();
        c3793bKw.e((CharSequence) ("behind-the-scenes-row-item-group-" + id));
        c3793bKw.c(C3796bKz.g.M);
        c3793bKw.a(true);
        c3793bKw.c(LolomoEpoxyController.Companion.b());
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addBehindTheScenesVideo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final TrackingInfo invoke() {
                String boxartId;
                TrackingInfoHolder trackingInfoHolder2 = TrackingInfoHolder.this;
                InterfaceC5149btM evidence = interfaceC5222bug.getEvidence();
                if (evidence == null || (boxartId = evidence.getImageKey()) == null) {
                    boxartId = interfaceC5222bug.getVideo().getBoxartId();
                }
                return TrackingInfoHolder.a(trackingInfoHolder2, boxartId, null, null, 6, null);
            }
        });
        c3793bKw.d(bSI.c(loMo));
        c3793bKw.d(bSY.a(this.b, false, 1, null));
        c3793bKw.b(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        bLE ble = new bLE();
        ble.d((CharSequence) c1510aDz.getId());
        ble.d(interfaceC5222bug.getVideo().getTitle());
        ble.e(C3796bKz.g.E);
        ble.e(Float.valueOf(1.0f));
        ble.c(C8140dek.a.a(this.e, interfaceC5222bug.getVideo()));
        ble.b(c1510aDz.c());
        ble.b(new View.OnClickListener() { // from class: o.bUQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.c(bUH.this, c1510aDz, view);
            }
        });
        c3793bKw.add(ble);
        this.h.e(c3793bKw, c1510aDz);
        interfaceC2023aX.add(c3793bKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bUH buh, C1510aDz c1510aDz, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) c1510aDz, "");
        buh.h.c(c1510aDz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TrackingInfoHolder trackingInfoHolder, bUH buh, InterfaceC5222bug interfaceC5222bug, LoMo loMo, InterfaceC5155btS interfaceC5155btS, View view) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        CLv2Utils.INSTANCE.b(AppView.categoryBox, CommandValue.ViewTitlesCommand, TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null));
        HomeActivity.e((NetflixActivity) C9737vz.e(buh.e, NetflixActivity.class), new DefaultGenreItem(interfaceC5222bug.getVideo().getTitle(), interfaceC5222bug.getVideo().getId(), GenreItem.GenreType.LOLOMO, loMo.getTrackId(), interfaceC5222bug.getVideo().getUnifiedEntityId(), interfaceC5155btS.getLolomoId()));
    }

    static /* synthetic */ void e(bUH buh, InterfaceC2023aX interfaceC2023aX, LoMo loMo, InterfaceC5222bug interfaceC5222bug, C4049bUi c4049bUi, TrackingInfoHolder trackingInfoHolder, boolean z, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = true;
        }
        buh.a(interfaceC2023aX, loMo, interfaceC5222bug, c4049bUi, trackingInfoHolder, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, LoMo loMo, final C4139bXr c4139bXr, final TrackingInfoHolder trackingInfoHolder) {
        final InterfaceC4732bk a = bSY.a(this.b, false, 1, null);
        bLB blb = new bLB();
        blb.c((CharSequence) c4139bXr.getId());
        blb.d(c4139bXr.getVideo().getTitle());
        blb.a(c4139bXr.getVideo().ab());
        blb.b(C8140dek.a.a(this.e, c4139bXr.getVideo()));
        blb.e(c4139bXr.T());
        blb.b(new View.OnClickListener() { // from class: o.bUG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.d(TrackingInfoHolder.this, this, c4139bXr, view);
            }
        });
        blb.b(this.b.e(c4139bXr.getVideo(), loMo.getType()));
        blb.a(LolomoEpoxyController.Companion.b());
        blb.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addLocalMomentVideo$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final TrackingInfo invoke() {
                String boxartId;
                TrackingInfoHolder trackingInfoHolder2 = TrackingInfoHolder.this;
                InterfaceC5149btM evidence = c4139bXr.getEvidence();
                if (evidence == null || (boxartId = evidence.getImageKey()) == null) {
                    boxartId = c4139bXr.getVideo().getBoxartId();
                }
                return TrackingInfoHolder.a(trackingInfoHolder2, boxartId, null, null, 6, null);
            }
        });
        blb.a(bSI.c(loMo));
        blb.d(new InterfaceC4732bk() { // from class: o.bUL
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i2) {
                bUH.a(InterfaceC4732bk.this, c4139bXr, this, (bLB) abstractC3073as, (AbstractC3823bLz.a) obj, i2);
            }
        });
        interfaceC2023aX.add(blb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(TrackingInfoHolder trackingInfoHolder, bUH buh, C4139bXr c4139bXr, View view) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) c4139bXr, "");
        CLv2Utils.INSTANCE.b(AppView.categoryBox, CommandValue.ViewTitlesCommand, TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null));
        HomeActivity.e((NetflixActivity) C9737vz.e(buh.e, NetflixActivity.class), new DefaultGenreItem(c4139bXr.getVideo().getTitle(), c4139bXr.getVideo().getId(), GenreItem.GenreType.LOLOMO, c4139bXr.getVideo().getUnifiedEntityId(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4732bk interfaceC4732bk, C4139bXr c4139bXr, bUH buh, bLB blb, AbstractC3823bLz.a aVar, int i2) {
        String c2;
        C8632dsu.c((Object) interfaceC4732bk, "");
        C8632dsu.c((Object) c4139bXr, "");
        C8632dsu.c((Object) buh, "");
        interfaceC4732bk.b(blb, aVar, i2);
        if (i2 != 5 || (c2 = c4139bXr.c()) == null) {
            return;
        }
        buh.d.invoke(new bSJ.i(c2));
    }

    private final void e(InterfaceC2023aX interfaceC2023aX, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, C4049bUi c4049bUi) {
        String boxshotUrl;
        String e;
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        InterfaceC5149btM evidence = interfaceC5222bug.getEvidence();
        if (evidence == null || (boxshotUrl = evidence.getImageUrl()) == null) {
            boxshotUrl = interfaceC5222bug.getVideo().getBoxshotUrl();
        }
        C3768bJy c3768bJy = new C3768bJy();
        c3768bJy.e((CharSequence) id);
        c3768bJy.c(interfaceC5222bug.getVideo().getTitle());
        C2376afA.e a = c4049bUi.l().a(Integer.parseInt(id));
        if (a != null && (e = a.e()) != null) {
            boxshotUrl = e;
        }
        c3768bJy.b(boxshotUrl);
        c3768bJy.e(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        interfaceC2023aX.add(c3768bJy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ InterfaceC5222bug<? extends InterfaceC5223buh> a;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        c(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
            this.a = interfaceC5222bug;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            drM drm = bUH.this.d;
            String title = this.a.getVideo().getTitle();
            C8632dsu.a(title, "");
            drm.invoke(new bSJ.b(true, title, null, 4, null));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            bUH.this.d.invoke(new bSJ.b(false, "", ((InterfaceC5148btL) this.a).a()));
        }
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, int i2, LoMo loMo, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, TrackingInfoHolder trackingInfoHolder) {
        String boxartId;
        String str;
        String str2;
        String string;
        int i3 = 2 % 2;
        Object obj = null;
        InterfaceC5148btL interfaceC5148btL = interfaceC5222bug instanceof InterfaceC5148btL ? (InterfaceC5148btL) interfaceC5222bug : null;
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        InterfaceC5149btM evidence = interfaceC5222bug.getEvidence();
        if (evidence == null || (boxartId = evidence.getImageKey()) == null) {
            boxartId = interfaceC5222bug.getVideo().getBoxartId();
        }
        final TrackingInfoHolder b = trackingInfoHolder.b(video, boxartId, i2);
        if (interfaceC5148btL != null && interfaceC5148btL.b()) {
            c cVar = new c(interfaceC5222bug);
            final boolean z = interfaceC5148btL.c() || C8632dsu.c((Object) c4049bUi.k(), (Object) interfaceC5148btL.a());
            if (z) {
                string = interfaceC5222bug.getVideo().getTitle();
            } else {
                string = this.e.getString(C4022bTi.g.b);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    p(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
            }
            C4088bVu c4088bVu = new C4088bVu();
            c4088bVu.b((CharSequence) ("video-" + interfaceC5222bug.getVideo().getId()));
            c4088bVu.c(string);
            c4088bVu.a(LolomoEpoxyController.Companion.b());
            c4088bVu.a(z);
            c4088bVu.b(interfaceC5148btL.d());
            InterfaceC5149btM evidence2 = interfaceC5222bug.getEvidence();
            c4088bVu.e(evidence2 != null ? evidence2.getImageUrl() : null);
            InterfaceC5149btM evidence3 = interfaceC5222bug.getEvidence();
            c4088bVu.d(evidence3 != null ? evidence3.getTcardUrl() : null);
            c4088bVu.c((Animation.AnimationListener) cVar);
            c4088bVu.e(new View.OnClickListener() { // from class: o.bUZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bUH.b(bUH.this, interfaceC5222bug, b, z, view);
                }
            });
            c4088bVu.a((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addKidsFavoritesRow$1$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.a(TrackingInfoHolder.this, null, null, null, 7, null);
                }
            });
            c4088bVu.a(bSY.a(this.b, false, 1, null));
            c4088bVu.a(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
            c4088bVu.c(bSI.c(loMo));
            interfaceC2023aX.add(c4088bVu);
            int i4 = i + 75;
            g = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        bVA bva = new bVA();
        bva.b((CharSequence) ("video-" + interfaceC5222bug.getVideo().getId()));
        bva.c(interfaceC5222bug.getVideo().getTitle());
        InterfaceC5149btM evidence4 = interfaceC5222bug.getEvidence();
        if (evidence4 != null) {
            int i6 = g + 69;
            i = i6 % 128;
            int i7 = i6 % 2;
            str = evidence4.getImageUrl();
        } else {
            str = null;
        }
        bva.b(str);
        InterfaceC5149btM evidence5 = interfaceC5222bug.getEvidence();
        if (evidence5 != null) {
            int i8 = i + 95;
            g = i8 % 128;
            if (i8 % 2 != 0) {
                evidence5.getTcardUrl();
                obj.hashCode();
                throw null;
            }
            str2 = evidence5.getTcardUrl();
        } else {
            str2 = null;
        }
        bva.a(str2);
        bva.d(new View.OnClickListener() { // from class: o.bUX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.k(bUH.this, interfaceC5222bug, b, view);
            }
        });
        bva.c(LolomoEpoxyController.Companion.b());
        bva.e((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addKidsFavoritesRow$2$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.a(TrackingInfoHolder.this, null, null, null, 7, null);
            }
        });
        bva.e(bSY.a(this.b, false, 1, null));
        bva.a(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        bva.a(bSI.c(loMo));
        interfaceC2023aX.add(bva);
        int i9 = i + 83;
        g = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, boolean z, View view) {
        InterfaceC5149btM evidence;
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        buh.b(video, trackingInfoHolder, context, (z || (evidence = interfaceC5222bug.getEvidence()) == null) ? null : evidence.getImageUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(bUH buh, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) buh, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(buh, video, trackingInfoHolder, context, null, 8, null);
    }

    static /* synthetic */ void c(bUH buh, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, Context context, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        buh.b(interfaceC5223buh, trackingInfoHolder, context, str);
    }

    private final void b(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, Context context, String str) {
        C7017coI.c.e().d(AbstractC1608aHp.d.b).d(new AbstractC1608aHp.d.b(interfaceC5223buh, trackingInfoHolder, "lolomo.controller", str)).b(C9737vz.e(context, NetflixActivity.class));
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, int i2, final LoMo loMo, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, final TrackingInfoHolder trackingInfoHolder, final InterfaceC5155btS interfaceC5155btS) {
        C3763bJt c3763bJt = new C3763bJt();
        String id = interfaceC5222bug.getVideo().getId();
        c3763bJt.b((CharSequence) ("category-row-item-group-" + id));
        c3763bJt.c(C3796bKz.g.j);
        c3763bJt.a(true);
        c3763bJt.c(AppView.categoryBox);
        c3763bJt.a((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addCategory$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3763bJt.b(bSI.c(loMo));
        c3763bJt.d(bSY.a(this.b, false, 1, null));
        c3763bJt.c(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        c3763bJt.c((CharSequence) interfaceC5222bug.getVideo().getTitle());
        c3763bJt.b(new View.OnClickListener() { // from class: o.bUT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.e(TrackingInfoHolder.this, this, interfaceC5222bug, loMo, interfaceC5155btS, view);
            }
        });
        C3768bJy c3768bJy = new C3768bJy();
        c3768bJy.e((CharSequence) interfaceC5222bug.getVideo().getId());
        c3768bJy.b(C4006bSt.b.d(i2));
        c3763bJt.add(c3768bJy);
        C3814bLq c3814bLq = new C3814bLq();
        String id2 = interfaceC5222bug.getVideo().getId();
        c3814bLq.b((CharSequence) ("category-item-title-" + id2));
        c3814bLq.d(C3796bKz.g.d);
        c3814bLq.d((CharSequence) interfaceC5222bug.getVideo().getTitle());
        c3763bJt.add(c3814bLq);
        interfaceC2023aX.add(c3763bJt);
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, LoMo loMo, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, C4049bUi c4049bUi, final TrackingInfoHolder trackingInfoHolder, boolean z) {
        InterfaceC5149btM evidence;
        String boxshotUrl;
        InterfaceC5149btM evidence2;
        final String boxartId;
        String e;
        bLE ble = new bLE();
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        ble.d((CharSequence) id);
        ble.d(interfaceC5222bug.getVideo().getTitle());
        ble.c(C8140dek.a.a(this.e, interfaceC5222bug.getVideo()));
        C2376afA.e a = c4049bUi.l().a(Integer.parseInt(id));
        if ((a == null || (boxshotUrl = a.e()) == null) && ((evidence = interfaceC5222bug.getEvidence()) == null || (boxshotUrl = evidence.getImageUrl()) == null)) {
            boxshotUrl = interfaceC5222bug.getVideo().getBoxshotUrl();
        }
        if ((a == null || (boxartId = a.c()) == null) && ((evidence2 = interfaceC5222bug.getEvidence()) == null || (boxartId = evidence2.getImageKey()) == null)) {
            boxartId = interfaceC5222bug.getVideo().getBoxartId();
        }
        if (a != null && (e = a.e()) != null) {
            boxshotUrl = e;
        }
        ble.b(boxshotUrl);
        ble.b(new View.OnClickListener() { // from class: o.bUM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.n(bUH.this, interfaceC5222bug, trackingInfoHolder, view);
            }
        });
        ble.c(this.b.e(interfaceC5222bug.getVideo(), loMo.getType()));
        if (z) {
            ble.b(LolomoEpoxyController.Companion.b());
            ble.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addStandardVideo$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.a(TrackingInfoHolder.this, boxartId, null, null, 6, null);
                }
            });
            ble.b(bSI.c(loMo));
            ble.b(bSY.a(this.b, false, 1, null));
        }
        interfaceC2023aX.add(ble);
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, final TrackingInfoHolder trackingInfoHolder, LoMo loMo, C4049bUi c4049bUi) {
        C3763bJt c3763bJt = new C3763bJt();
        String id = interfaceC5222bug.getVideo().getId();
        c3763bJt.b((CharSequence) ("collect-taste-payoff-group-" + id));
        c3763bJt.c(C4022bTi.a.f);
        c3763bJt.a(true);
        c3763bJt.c(LolomoEpoxyController.Companion.b());
        c3763bJt.a((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.VideoCreator$addCollectTastePayoffVideo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final TrackingInfo invoke() {
                CollectTaste collectTaste;
                TrackingInfoHolder trackingInfoHolder2 = TrackingInfoHolder.this;
                collectTaste = this.c;
                return trackingInfoHolder2.d(collectTaste.d(interfaceC5222bug), "true");
            }
        });
        c3763bJt.b(bSI.c(loMo));
        c3763bJt.d(bSY.a(this.b, false, 1, null));
        c3763bJt.c((CharSequence) this.c.a(interfaceC5222bug));
        c3763bJt.b(new View.OnClickListener() { // from class: o.bUP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bUH.j(bUH.this, interfaceC5222bug, trackingInfoHolder, view);
            }
        });
        e(c3763bJt, loMo, interfaceC5222bug, c4049bUi);
        this.c.b(c3763bJt, interfaceC5222bug);
        this.c.d(c3763bJt, interfaceC5222bug);
        interfaceC2023aX.add(c3763bJt);
    }

    private void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$538);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
