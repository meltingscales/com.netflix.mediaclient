package com.netflix.mediaclient.ui.nux.impl;

import android.view.View;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import com.airbnb.epoxy.Carousel;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceImpl$subscribe$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC7196cre;
import o.AbstractC7200cri;
import o.C3796bKz;
import o.C6638chA;
import o.C7193crb;
import o.C7197crf;
import o.C8187dfe;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC6675chl;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class NewUserExperienceImpl$subscribe$1 extends Lambda implements drM<AbstractC7196cre, dpR> {
    final /* synthetic */ C7197crf c;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[NewUserExperienceCtaType.values().length];
            try {
                iArr[NewUserExperienceCtaType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewUserExperienceCtaType.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserExperienceImpl$subscribe$1(C7197crf c7197crf) {
        super(1);
        this.c = c7197crf;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(AbstractC7196cre abstractC7196cre) {
        b(abstractC7196cre);
        return dpR.c;
    }

    public final void b(final AbstractC7196cre abstractC7196cre) {
        InterfaceC6675chl interfaceC6675chl;
        NetflixActivity netflixActivity;
        NetflixActivity netflixActivity2;
        NetflixActivity netflixActivity3;
        ViewOverlay overlay;
        NetflixActivity netflixActivity4;
        NetflixActivity netflixActivity5;
        InterfaceC6675chl interfaceC6675chl2;
        NetflixActivity netflixActivity6;
        ViewOverlay overlay2;
        if (abstractC7196cre instanceof AbstractC7196cre.d) {
            AbstractC7196cre.d dVar = (AbstractC7196cre.d) abstractC7196cre;
            int i = e.d[dVar.d().ordinal()];
            if (i == 1) {
                netflixActivity4 = this.c.e;
                Carousel carousel = (Carousel) netflixActivity4.findViewById(C3796bKz.a.f);
                if (carousel != null) {
                    carousel.smoothScrollToPosition(dVar.a() + 1);
                }
            } else if (i == 2) {
                netflixActivity5 = this.c.e;
                Carousel carousel2 = (Carousel) netflixActivity5.findViewById(C3796bKz.a.f);
                if (carousel2 != null) {
                    carousel2.smoothScrollToPosition(dVar.a() - 1);
                }
            } else {
                Integer c = dVar.c();
                if (c != null) {
                    C7197crf c7197crf = this.c;
                    int intValue = c.intValue();
                    netflixActivity6 = c7197crf.e;
                    View findViewById = netflixActivity6.findViewById(intValue);
                    if (findViewById != null && (overlay2 = findViewById.getOverlay()) != null) {
                        overlay2.clear();
                    }
                }
                interfaceC6675chl2 = this.c.a;
                InterfaceC6675chl.a.e(interfaceC6675chl2, "NewUserExperienceScreen", null, 2, null);
                C7193crb c7193crb = C7193crb.d;
                c7193crb.a(dVar.a());
                c7193crb.a();
            }
        } else if (abstractC7196cre instanceof AbstractC7196cre.c) {
            Integer e2 = ((AbstractC7196cre.c) abstractC7196cre).e();
            if (e2 != null) {
                C7197crf c7197crf2 = this.c;
                int intValue2 = e2.intValue();
                netflixActivity3 = c7197crf2.e;
                View findViewById2 = netflixActivity3.findViewById(intValue2);
                if (findViewById2 == null || (overlay = findViewById2.getOverlay()) == null) {
                    return;
                }
                overlay.clear();
            }
        } else if (abstractC7196cre instanceof AbstractC7196cre.e) {
            netflixActivity = this.c.e;
            FrameLayout frameLayout = (FrameLayout) netflixActivity.findViewById(C6638chA.d.a);
            int childCount = frameLayout != null ? frameLayout.getChildCount() : 0;
            if (childCount > 1 && frameLayout != null) {
                frameLayout.removeViews(1, childCount - 1);
            }
            final C7197crf c7197crf3 = this.c;
            C8187dfe.a(new Runnable() { // from class: o.crd
                @Override // java.lang.Runnable
                public final void run() {
                    NewUserExperienceImpl$subscribe$1.e(C7197crf.this, abstractC7196cre);
                }
            }, 1L);
            Integer e3 = ((AbstractC7196cre.e) abstractC7196cre).e();
            if (e3 != null) {
                C7197crf c7197crf4 = this.c;
                int intValue3 = e3.intValue();
                netflixActivity2 = c7197crf4.e;
                Boolean bool = (Boolean) C9726vo.d(netflixActivity2.findViewById(intValue3), frameLayout, new NewUserExperienceImpl$subscribe$1$4$1(c7197crf4, abstractC7196cre));
            }
        } else if (abstractC7196cre instanceof AbstractC7196cre.a) {
            interfaceC6675chl = this.c.a;
            InterfaceC6675chl.a.e(interfaceC6675chl, "NewUserExperienceScreen", null, 2, null);
            C7193crb c7193crb2 = C7193crb.d;
            c7193crb2.a(((AbstractC7196cre.a) abstractC7196cre).d());
            c7193crb2.a();
        } else {
            boolean z = abstractC7196cre instanceof AbstractC7196cre.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7197crf c7197crf, AbstractC7196cre abstractC7196cre) {
        InterfaceC6675chl interfaceC6675chl;
        C9935zP c9935zP;
        C8632dsu.c((Object) c7197crf, "");
        interfaceC6675chl = c7197crf.a;
        c9935zP = c7197crf.b;
        AbstractC7196cre.e eVar = (AbstractC7196cre.e) abstractC7196cre;
        interfaceC6675chl.e((MessagingTooltipScreen) new AbstractC7200cri.b(c9935zP), eVar.e(), eVar.e() == null);
    }
}
