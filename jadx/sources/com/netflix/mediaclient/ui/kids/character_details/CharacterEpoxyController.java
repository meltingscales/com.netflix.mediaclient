package com.netflix.mediaclient.ui.kids.character_details;

import android.util.Base64;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.kids.character_details.CharacterEpoxyController;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.AbstractC3073as;
import o.C1045Mp;
import o.C2755am;
import o.C3745bJb;
import o.C3774bKd;
import o.C4156bYh;
import o.C4171bYw;
import o.C4174bYz;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC4255bb;
import o.InterfaceC5223buh;
import o.bIO;
import o.bIS;
import o.bJK;
import o.bXZ;

/* loaded from: classes4.dex */
public final class CharacterEpoxyController extends Typed3EpoxyController<C4156bYh, C4174bYz, C4171bYw> {
    public static final int $stable;
    public static final b Companion;
    private static int c = 0;
    private static int e = 1;
    private static byte e$ss2$337;
    private final C9935zP eventBusFactory;
    private final NetflixActivity netflixActivity;
    private RecyclerView recyclerView;
    private int requestedColumnNum;

    static {
        e();
        Companion = new b(null);
        $stable = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addFillingErrorView$lambda$10$lambda$9(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addFillingErrorView$lambda$12$lambda$11(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addFillingErrorView$lambda$15$lambda$14(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addFillingLoadingModel$lambda$6$lambda$5(int i, int i2, int i3) {
        return i;
    }

    static void e() {
        e$ss2$337 = (byte) 24;
    }

    public final C9935zP getEventBusFactory() {
        return this.eventBusFactory;
    }

    public final NetflixActivity getNetflixActivity() {
        return this.netflixActivity;
    }

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public CharacterEpoxyController(NetflixActivity netflixActivity, C9935zP c9935zP) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) c9935zP, "");
        this.netflixActivity = netflixActivity;
        this.eventBusFactory = c9935zP;
        this.requestedColumnNum = 1;
        addModelBuildListener(new InterfaceC4255bb() { // from class: o.bXG
            @Override // o.InterfaceC4255bb
            public final void b(C2755am c2755am) {
                CharacterEpoxyController._init_$lambda$0(CharacterEpoxyController.this, c2755am);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("CharacterController");
        }

        public final boolean a(C4156bYh c4156bYh) {
            C8632dsu.c((Object) c4156bYh, "");
            List<InterfaceC5223buh> e = c4156bYh.e();
            if (e != null && e.size() == 1) {
                InterfaceC5223buh c = c4156bYh.c();
                if ((c != null ? c.getType() : null) == VideoType.SHOW) {
                    return true;
                }
                InterfaceC5223buh c2 = c4156bYh.c();
                if ((c2 != null ? c2.getType() : null) == VideoType.EPISODE) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CharacterEpoxyController characterEpoxyController, C2755am c2755am) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) c2755am, "");
        characterEpoxyController.setGridSize(characterEpoxyController.requestedColumnNum);
    }

    @Override // o.AbstractC2914ap
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // o.AbstractC2914ap
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1(CharacterEpoxyController characterEpoxyController, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        characterEpoxyController.eventBusFactory.b(bXZ.class, new bXZ.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2(CharacterEpoxyController characterEpoxyController, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        characterEpoxyController.eventBusFactory.b(bXZ.class, new bXZ.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3(CharacterEpoxyController characterEpoxyController, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        characterEpoxyController.eventBusFactory.b(bXZ.class, new bXZ.g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r11.d().c() == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    @Override // com.airbnb.epoxy.Typed3EpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(o.C4156bYh r9, o.C4174bYz r10, o.C4171bYw r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.kids.character_details.CharacterEpoxyController.buildModels(o.bYh, o.bYz, o.bYw):void");
    }

    static /* synthetic */ void addFillingLoadingModel$default(CharacterEpoxyController characterEpoxyController, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        characterEpoxyController.addFillingLoadingModel(str, j);
    }

    private final void setGridSize(int i) {
        GridLayoutManager gridLayoutManager;
        if (i != getSpanCount()) {
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C8632dsu.d(layoutManager);
                    gridLayoutManager = (GridLayoutManager) layoutManager;
                } else {
                    FillerGridLayoutManager fillerGridLayoutManager = new FillerGridLayoutManager(this.netflixActivity, i, 0, false, false, 28, null);
                    recyclerView.setLayoutManager(fillerGridLayoutManager);
                    gridLayoutManager = fillerGridLayoutManager;
                }
                gridLayoutManager.setSpanCount(i);
                gridLayoutManager.setSpanSizeLookup(getSpanSizeLookup());
            }
            setSpanCount(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFillingLoadingModel(String str, long j) {
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        add(bjk);
        C3774bKd c3774bKd = new C3774bKd();
        c3774bKd.c((CharSequence) str);
        c3774bKd.b(j);
        c3774bKd.d(new AbstractC3073as.b() { // from class: o.bXI
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addFillingLoadingModel$lambda$6$lambda$5;
                addFillingLoadingModel$lambda$6$lambda$5 = CharacterEpoxyController.addFillingLoadingModel$lambda$6$lambda$5(i, i2, i3);
                return addFillingLoadingModel$lambda$6$lambda$5;
            }
        });
        add(c3774bKd);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        add(bjk2);
    }

    private final void addFillingErrorView(CharSequence charSequence, View.OnClickListener onClickListener) {
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        add(bjk);
        bIO bio = new bIO();
        bio.b((CharSequence) "filling-error-text");
        bio.e(charSequence);
        bio.b(new AbstractC3073as.b() { // from class: o.bXO
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addFillingErrorView$lambda$10$lambda$9;
                addFillingErrorView$lambda$10$lambda$9 = CharacterEpoxyController.addFillingErrorView$lambda$10$lambda$9(i, i2, i3);
                return addFillingErrorView$lambda$10$lambda$9;
            }
        });
        add(bio);
        bIS bis = new bIS();
        bis.b((CharSequence) "filling-retry-button");
        bis.c(new AbstractC3073as.b() { // from class: o.bXL
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addFillingErrorView$lambda$12$lambda$11;
                addFillingErrorView$lambda$12$lambda$11 = CharacterEpoxyController.addFillingErrorView$lambda$12$lambda$11(i, i2, i3);
                return addFillingErrorView$lambda$12$lambda$11;
            }
        });
        bis.e(onClickListener);
        add(bis);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        add(bjk2);
        C3745bJb c3745bJb = new C3745bJb();
        c3745bJb.d((CharSequence) "view-downloads");
        c3745bJb.b(new AbstractC3073as.b() { // from class: o.bXM
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addFillingErrorView$lambda$15$lambda$14;
                addFillingErrorView$lambda$15$lambda$14 = CharacterEpoxyController.addFillingErrorView$lambda$15$lambda$14(i, i2, i3);
                return addFillingErrorView$lambda$15$lambda$14;
            }
        });
        add(c3745bJb);
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$337);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
