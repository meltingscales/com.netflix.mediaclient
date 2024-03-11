package com.netflix.mediaclient.ui.player.postplay.ui;

import android.content.res.Resources;
import android.util.Base64;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.player.postplay.ui.PostPlayPreviewsEpoxyController;
import java.nio.charset.StandardCharsets;
import o.AbstractC3803bLf;
import o.C1026Lt;
import o.C1030Lx;
import o.C2808an;
import o.C3796bKz;
import o.C5528cAt;
import o.C5530cAv;
import o.C5592cBc;
import o.C7639czx;
import o.C8178dfV;
import o.C8632dsu;
import o.C8691duz;
import o.C9935zP;
import o.InterfaceC4308bc;
import o.InterfaceC6945cmq;
import o.bJO;
import o.bLW;
import o.cAJ;
import o.cAL;
import o.cAO;
import o.cAT;
import o.cAW;
import o.cHK;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class PostPlayPreviewsEpoxyController extends TypedEpoxyController<C5530cAv> {
    private static int c = 1;
    private static int d = 0;
    private static byte e$ss2$114 = 24;
    private final bLW epoxyVideoAutoPlay;
    private final C9935zP eventBusFactory;
    private final Resources resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPlayPreviewsEpoxyController(C9935zP c9935zP, Resources resources, bLW blw) {
        super(C2808an.a(), C2808an.a());
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) resources, "");
        C8632dsu.c((Object) blw, "");
        this.eventBusFactory = c9935zP;
        this.resources = resources;
        this.epoxyVideoAutoPlay = blw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C5530cAv c5530cAv) {
        C8632dsu.c((Object) c5530cAv, "");
        int i = 0;
        for (C5528cAt c5528cAt : c5530cAv.e()) {
            buildPostPlayPreviewModelGroup(c5528cAt, i);
            i++;
        }
    }

    private final void buildPostPlayPreviewModelGroup(final C5528cAt c5528cAt, int i) {
        int i2 = 2 % 2;
        int a = c5528cAt.a();
        cAJ caj = new cAJ();
        caj.d("postplay-preview-group-" + a + "-" + i);
        caj.d(C7639czx.c.k);
        caj.d(this.eventBusFactory);
        cAL cal = new cAL();
        cal.e((CharSequence) ("postplay-previews-" + a));
        cal.b(c5528cAt);
        cal.a(this.epoxyVideoAutoPlay.a());
        cal.b(this.eventBusFactory);
        caj.add(cal);
        C5592cBc c5592cBc = new C5592cBc();
        c5592cBc.d((CharSequence) ("postplay-preview-gradient-" + a));
        caj.add(c5592cBc);
        cAO cao = new cAO();
        cao.d((CharSequence) ("postplay-preview-logo-" + a));
        cao.c(c5528cAt.e());
        caj.add(cao);
        cAW caw = new cAW();
        caw.c((CharSequence) ("postplay-preview-play-" + a));
        caw.c(C7639czx.c.n);
        String string = this.resources.getString(R.o.ad);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = c + 73;
            d = i3 % 128;
            int i4 = i3 % 2;
        }
        C8632dsu.a(string, "");
        caw.e((CharSequence) string);
        caw.c(Integer.valueOf(R.e.aJ));
        caw.a(new InterfaceC4308bc() { // from class: o.cAz
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i5) {
                PostPlayPreviewsEpoxyController.buildPostPlayPreviewModelGroup$lambda$8$lambda$4$lambda$3(PostPlayPreviewsEpoxyController.this, c5528cAt, (cAW) abstractC3073as, (AbstractC3803bLf.c) obj, view, i5);
            }
        });
        caj.add(caw);
        cAT cat = new cAT();
        cat.d((CharSequence) ("postplay-preview-mylist-" + a));
        cat.b(C7639czx.c.i);
        cat.c(String.valueOf(c5528cAt.c().getVideoId()));
        cat.a(this.eventBusFactory.d());
        cat.c(c5528cAt.b());
        cat.b(c5528cAt.n());
        cat.a(c5528cAt.g().a());
        cat.a((drX<? super Boolean, ? super InterfaceC6945cmq, dpR>) new drX<Boolean, InterfaceC6945cmq, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.ui.PostPlayPreviewsEpoxyController$buildPostPlayPreviewModelGroup$1$5$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Boolean bool, InterfaceC6945cmq interfaceC6945cmq) {
                e(bool, interfaceC6945cmq);
                return dpR.c;
            }

            public final void e(Boolean bool, InterfaceC6945cmq interfaceC6945cmq) {
                C9935zP c9935zP;
                c9935zP = PostPlayPreviewsEpoxyController.this.eventBusFactory;
                int videoId = c5528cAt.c().getVideoId();
                C8632dsu.d(bool);
                c9935zP.b(cHK.class, new cHK.e(String.valueOf(videoId), bool.booleanValue()));
                interfaceC6945cmq.a(3);
            }
        });
        caj.add(cat);
        bJO bjo = new bJO();
        bjo.d((CharSequence) ("postplay-preview-close-" + a));
        bjo.b(Float.valueOf(0.0f));
        bjo.e(ResourcesCompat.getDrawable(this.resources, C1026Lt.a.RD, null));
        bjo.e(Integer.valueOf(this.resources.getColor(C1030Lx.d.f13374o, null)));
        String string2 = this.resources.getString(C3796bKz.j.e);
        if (string2.startsWith("'!#+")) {
            int i5 = c + 15;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                b(string2.substring(4), objArr2);
                ((String) objArr2[0]).intern();
                throw null;
            }
            String substring = string2.substring(4);
            Object[] objArr3 = new Object[1];
            b(substring, objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        bjo.e(string2);
        bjo.e(new View.OnClickListener() { // from class: o.cAC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostPlayPreviewsEpoxyController.buildPostPlayPreviewModelGroup$lambda$8$lambda$7$lambda$6(PostPlayPreviewsEpoxyController.this, c5528cAt, view);
            }
        });
        caj.add(bjo);
        add(caj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildPostPlayPreviewModelGroup$lambda$8$lambda$4$lambda$3(PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController, C5528cAt c5528cAt, cAW caw, AbstractC3803bLf.c cVar, View view, int i) {
        C8632dsu.c((Object) postPlayPreviewsEpoxyController, "");
        C8632dsu.c((Object) c5528cAt, "");
        postPlayPreviewsEpoxyController.eventBusFactory.b(cHK.class, new cHK.i(c5528cAt.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildPostPlayPreviewModelGroup$lambda$8$lambda$7$lambda$6(PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController, C5528cAt c5528cAt, View view) {
        C8632dsu.c((Object) postPlayPreviewsEpoxyController, "");
        C8632dsu.c((Object) c5528cAt, "");
        postPlayPreviewsEpoxyController.eventBusFactory.b(cHK.class, new cHK.d(c5528cAt.h()));
    }

    public final String getSeasonNumOrRuntimeText(C5528cAt c5528cAt) {
        boolean g;
        C8632dsu.c((Object) c5528cAt, "");
        String j = c5528cAt.j();
        if (j != null) {
            g = C8691duz.g(j);
            if (!g) {
                String j2 = c5528cAt.j();
                return j2 == null ? "" : j2;
            }
        }
        return c5528cAt.i() > 0 ? C8178dfV.a(c5528cAt.i(), this.resources).d() : "";
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$114);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
