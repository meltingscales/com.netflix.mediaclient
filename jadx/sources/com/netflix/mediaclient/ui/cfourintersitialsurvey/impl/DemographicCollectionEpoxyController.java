package com.netflix.mediaclient.ui.cfourintersitialsurvey.impl;

import android.util.Base64;
import android.view.View;
import android.widget.CompoundButton;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionEpoxyController;
import java.nio.charset.StandardCharsets;
import o.AbstractC5492bzl;
import o.C1333Xq;
import o.C3774bKd;
import o.C3805bLh;
import o.C3814bLq;
import o.C5461bzG;
import o.C5496bzp;
import o.C5502bzv;
import o.C5503bzw;
import o.C5505bzy;
import o.C8168dfL;
import o.C8632dsu;
import o.C9834xU;
import o.C9935zP;
import o.bJK;
import o.bKU;

/* loaded from: classes4.dex */
public final class DemographicCollectionEpoxyController extends TypedEpoxyController<C5496bzp> {
    private static int b = 0;
    private static int d = 1;
    private static byte e$ss2$143 = 24;
    private final NetflixActivity activity;
    private final C9935zP eventBusFactory;

    public DemographicCollectionEpoxyController(NetflixActivity netflixActivity, C9935zP c9935zP) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) c9935zP, "");
        this.activity = netflixActivity;
        this.eventBusFactory = c9935zP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9(DemographicCollectionEpoxyController demographicCollectionEpoxyController, View view) {
        C8632dsu.c((Object) demographicCollectionEpoxyController, "");
        demographicCollectionEpoxyController.eventBusFactory.b(AbstractC5492bzl.class, AbstractC5492bzl.c.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C5496bzp c5496bzp) {
        int i;
        int i2 = 2 % 2;
        C8632dsu.c((Object) c5496bzp, "");
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        add(bjk);
        if (c5496bzp.h()) {
            C3774bKd c3774bKd = new C3774bKd();
            c3774bKd.c((CharSequence) "loading_spinner");
            c3774bKd.d(C5503bzw.d.e);
            add(c3774bKd);
            bJK bjk2 = new bJK();
            bjk2.d((CharSequence) "filler-bottom");
            add(bjk2);
            return;
        }
        C5505bzy c5505bzy = new C5505bzy();
        c5505bzy.b((CharSequence) "profile-info");
        c5505bzy.a(c5496bzp.b());
        c5505bzy.e(c5496bzp.a());
        add(c5505bzy);
        bKU bku = new bKU();
        bku.d((CharSequence) "bottom-padding-2");
        bku.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) "header");
        String string = this.activity.getString(C5503bzw.a.d);
        if (string.startsWith("'!#+")) {
            int i3 = d + 39;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            c(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i5 = b + 111;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        c3814bLq.d((CharSequence) string);
        c3814bLq.d(C5503bzw.d.b);
        add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "bottom-padding-3");
        bku2.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.v)));
        add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        String string2 = this.activity.getString(C5503bzw.a.e);
        if (string2.startsWith("'!#+")) {
            int i7 = d + 51;
            b = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr2 = new Object[1];
            c(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
        }
        c3814bLq2.d((CharSequence) string2);
        c3814bLq2.d(C5503bzw.d.j);
        add(c3814bLq2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "bottom-padding-4");
        bku3.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.ai)));
        add(bku3);
        C5461bzG c5461bzG = new C5461bzG();
        c5461bzG.d((CharSequence) "date-of-birth");
        String string3 = this.activity.getString(C5503bzw.a.i);
        if (!(!string3.startsWith("'!#+"))) {
            Object[] objArr3 = new Object[1];
            c(string3.substring(4), objArr3);
            string3 = ((String) objArr3[0]).intern();
        }
        c5461bzG.c(string3);
        c5461bzG.e(c5496bzp.e());
        c5461bzG.b(new View.OnClickListener() { // from class: o.bze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DemographicCollectionEpoxyController.buildModels$lambda$10$lambda$9(DemographicCollectionEpoxyController.this, view);
            }
        });
        add(c5461bzG);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "bottom-padding-5");
        bku4.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.C)));
        add(bku4);
        C5461bzG c5461bzG2 = new C5461bzG();
        c5461bzG2.d((CharSequence) "gender-entry");
        String c = c5496bzp.c();
        Object obj = null;
        if (c != null) {
            int i9 = d + 85;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                c5461bzG2.e(c);
                throw null;
            }
            c5461bzG2.e(c);
        }
        c5461bzG2.c(C8168dfL.d(C5503bzw.a.l));
        c5461bzG2.e(c5496bzp.c());
        c5461bzG2.b(new View.OnClickListener() { // from class: o.bzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DemographicCollectionEpoxyController.buildModels$lambda$14$lambda$13(DemographicCollectionEpoxyController.this, view);
            }
        });
        add(c5461bzG2);
        if (!c5496bzp.j()) {
            int i10 = b + 23;
            d = i10 % 128;
            if (i10 % 2 == 0) {
                c5496bzp.d();
                obj.hashCode();
                throw null;
            } else if (!c5496bzp.d()) {
                bKU bku5 = new bKU();
                bku5.d((CharSequence) "bottom-padding-6");
                bku5.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.ai)));
                add(bku5);
            }
        }
        if (c5496bzp.j()) {
            bKU bku6 = new bKU();
            bku6.d((CharSequence) "tou-space-top");
            bku6.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.v)));
            add(bku6);
            C5502bzv c5502bzv = new C5502bzv();
            c5502bzv.e((CharSequence) "tou-checkbox");
            c5502bzv.c((CharSequence) C8168dfL.c(c5496bzp.f() != null ? C1333Xq.d(C5503bzw.a.g).d(SignupConstants.Field.MIN_AGE, c5496bzp.f()).c() : C8168dfL.d(C5503bzw.a.a)));
            c5502bzv.c(new CompoundButton.OnCheckedChangeListener() { // from class: o.bzi
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DemographicCollectionEpoxyController.buildModels$lambda$18$lambda$17(DemographicCollectionEpoxyController.this, compoundButton, z);
                }
            });
            add(c5502bzv);
            if (!c5496bzp.d()) {
                bKU bku7 = new bKU();
                bku7.d((CharSequence) "tou-space-bottom");
                bku7.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.ai)));
                add(bku7);
                int i11 = d + 81;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        if (c5496bzp.d()) {
            bKU bku8 = new bKU();
            bku8.d((CharSequence) "consent-space-top");
            bku8.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
            add(bku8);
            C5502bzv c5502bzv2 = new C5502bzv();
            c5502bzv2.e((CharSequence) "consent-checkbox");
            c5502bzv2.c((CharSequence) C8168dfL.c(C8168dfL.d(C5503bzw.a.b)));
            c5502bzv2.c(new CompoundButton.OnCheckedChangeListener() { // from class: o.bzj
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DemographicCollectionEpoxyController.buildModels$lambda$22$lambda$21(DemographicCollectionEpoxyController.this, compoundButton, z);
                }
            });
            add(c5502bzv2);
            bKU bku9 = new bKU();
            bku9.d((CharSequence) "consent-space-bottom");
            bku9.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.ai)));
            add(bku9);
        }
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "positive");
        c3805bLh.c(C5503bzw.d.g);
        if (c5496bzp.i()) {
            int i13 = b + 11;
            d = i13 % 128;
            if (i13 % 2 == 0) {
                i = C5503bzw.a.f;
                int i14 = 26 / 0;
            } else {
                i = C5503bzw.a.f;
            }
        } else {
            i = C5503bzw.a.h;
        }
        c3805bLh.b((CharSequence) C8168dfL.d(i));
        c3805bLh.d(c5496bzp.i());
        c3805bLh.b(new View.OnClickListener() { // from class: o.bzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DemographicCollectionEpoxyController.buildModels$lambda$25$lambda$24(DemographicCollectionEpoxyController.this, view);
            }
        });
        add(c3805bLh);
        bKU bku10 = new bKU();
        bku10.d((CharSequence) "bottom-padding-7");
        bku10.a(Integer.valueOf(this.activity.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        add(bku10);
        if (!c5496bzp.j()) {
            C3814bLq c3814bLq3 = new C3814bLq();
            c3814bLq3.b((CharSequence) "tou-text");
            c3814bLq3.d(C5503bzw.d.h);
            c3814bLq3.d((CharSequence) C8168dfL.c(C8168dfL.d(C5503bzw.a.c)));
            c3814bLq3.b(true);
            add(c3814bLq3);
        }
        bJK bjk3 = new bJK();
        bjk3.d((CharSequence) "filler-bottom2");
        add(bjk3);
        int i15 = d + 47;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$14$lambda$13(DemographicCollectionEpoxyController demographicCollectionEpoxyController, View view) {
        C8632dsu.c((Object) demographicCollectionEpoxyController, "");
        demographicCollectionEpoxyController.eventBusFactory.b(AbstractC5492bzl.class, AbstractC5492bzl.e.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$18$lambda$17(DemographicCollectionEpoxyController demographicCollectionEpoxyController, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) demographicCollectionEpoxyController, "");
        demographicCollectionEpoxyController.eventBusFactory.b(AbstractC5492bzl.class, new AbstractC5492bzl.d(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$22$lambda$21(DemographicCollectionEpoxyController demographicCollectionEpoxyController, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) demographicCollectionEpoxyController, "");
        demographicCollectionEpoxyController.eventBusFactory.b(AbstractC5492bzl.class, new AbstractC5492bzl.b(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$25$lambda$24(DemographicCollectionEpoxyController demographicCollectionEpoxyController, View view) {
        C8632dsu.c((Object) demographicCollectionEpoxyController, "");
        demographicCollectionEpoxyController.eventBusFactory.b(AbstractC5492bzl.class, AbstractC5492bzl.a.a);
    }

    private void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$143);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
