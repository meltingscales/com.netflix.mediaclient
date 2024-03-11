package o;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import o.C9834xU;
import o.cWI;
import o.cWJ;
import o.cWN;

/* loaded from: classes5.dex */
public abstract class cWI extends MessagingTooltipScreen {
    public static final a e = new a(null);
    private final String a;
    private final C9935zP c;

    public /* synthetic */ cWI(C9935zP c9935zP, C8627dsp c8627dsp) {
        this(c9935zP);
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.a;
    }

    public final C9935zP y() {
        return this.c;
    }

    private cWI(C9935zP c9935zP) {
        this.c = c9935zP;
        this.a = "UmaScreen";
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends cWI {
        private final String a;
        private final String b;
        private final boolean c;
        private final MessagingTooltipScreen.Tooltip_Location f;
        private final boolean g;
        private final boolean h;
        private final Integer i;
        private final MessagingTooltipScreen.ScreenType k;
        private final int l;
        private final String m;
        private final UmaAlert n;

        /* renamed from: o  reason: collision with root package name */
        private final String f13705o;
        private final Integer t;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.a;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public boolean j() {
            return this.c;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public MessagingTooltipScreen.Tooltip_Location l() {
            return this.f;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public boolean n() {
            return this.g;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public boolean q() {
            return this.h;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public MessagingTooltipScreen.ScreenType r() {
            return this.k;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public int s() {
            return this.l;
        }

        public /* synthetic */ c(C9935zP c9935zP, String str, String str2, Integer num, Integer num2, String str3, UmaAlert umaAlert, int i, C8627dsp c8627dsp) {
            this(c9935zP, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? umaAlert : null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9935zP c9935zP, String str, String str2, Integer num, Integer num2, String str3, UmaAlert umaAlert) {
            super(c9935zP, null);
            C8632dsu.c((Object) c9935zP, "");
            this.f13705o = str;
            this.b = str2;
            this.t = num;
            this.i = num2;
            this.m = str3;
            this.n = umaAlert;
            this.a = "UmaTooltip";
            this.k = MessagingTooltipScreen.ScreenType.b;
            this.l = C9834xU.a.af;
            this.c = true;
            this.f = MessagingTooltipScreen.Tooltip_Location.b;
        }

        @Override // o.AbstractC6677chn
        public void f() {
            y().b(cWJ.class, cWJ.b.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c cVar, cWO cwo, cWN.c cVar2, int i) {
            C8632dsu.c((Object) cVar, "");
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                cVar.y().b(cWJ.class, cWJ.e.a);
                return;
            }
            C9935zP y = cVar.y();
            String str = cVar.m;
            UmaAlert umaAlert = cVar.n;
            y.b(cWJ.class, new cWJ.a(str, umaAlert != null ? umaAlert.umsAlertRenderFeedback() : null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void d(final o.cWI.c r2, android.view.View r3) {
            /*
                java.lang.String r3 = ""
                o.C8632dsu.c(r2, r3)
                com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert r3 = r2.n
                r0 = 0
                if (r3 == 0) goto L1d
                java.util.List r3 = r3.tooltipCtas()
                if (r3 == 0) goto L1d
                java.lang.Object r3 = o.C8570dqm.d(r3)
                com.netflix.mediaclient.service.webclient.model.leafs.UmaCta r3 = (com.netflix.mediaclient.service.webclient.model.leafs.UmaCta) r3
                if (r3 == 0) goto L1d
                java.lang.String r3 = r3.trackingInfo()
                goto L1e
            L1d:
                r3 = r0
            L1e:
                com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert r1 = r2.n
                if (r1 == 0) goto L34
                java.util.List r1 = r1.tooltipCtas()
                if (r1 == 0) goto L34
                java.lang.Object r1 = o.C8570dqm.d(r1)
                com.netflix.mediaclient.service.webclient.model.leafs.UmaCta r1 = (com.netflix.mediaclient.service.webclient.model.leafs.UmaCta) r1
                if (r1 == 0) goto L34
                java.lang.String r0 = r1.umsAlertCtaFeedback()
            L34:
                com.netflix.mediaclient.ui.uma.impl.UmaScreen$UmaTooltip$models$1$2$1 r1 = new com.netflix.mediaclient.ui.uma.impl.UmaScreen$UmaTooltip$models$1$2$1
                r1.<init>()
                o.C9726vo.d(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cWI.c.d(o.cWI$c, android.view.View):void");
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            cWO cwo = new cWO();
            cwo.e((CharSequence) "uma-tooltip");
            cwo.d(this.f13705o);
            cwo.e(this.b);
            cwo.e(this.t);
            cwo.b(this.i);
            cwo.a(this.m);
            cwo.b(new InterfaceC4732bk() { // from class: o.cWK
                @Override // o.InterfaceC4732bk
                public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                    cWI.c.d(cWI.c.this, (cWO) abstractC3073as, (cWN.c) obj, i);
                }
            });
            cwo.c(new View.OnClickListener() { // from class: o.cWQ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cWI.c.d(cWI.c.this, view);
                }
            });
            interfaceC2023aX.add(cwo);
        }
    }
}
