package o;

import android.content.Context;
import android.view.View;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import com.netflix.mediaclient.ui.messaging.impl.MessagingEpoxyController;
import kotlin.NoWhenBranchMatchedException;
import o.C6638chA;
import o.C9834xU;
import o.bMW;
import o.dpR;

/* renamed from: o.chF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6643chF {
    private boolean a;
    private int b;
    private MessagingTooltipScreen.a c;
    private Integer d;
    private int e;
    private MessagingTooltipScreen.Tooltip_Location f;
    private drO<dpR> g;
    private C1619aI h;
    private MessagingTooltipScreen.e i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private MessagingTooltipScreen.ScreenType n;

    /* renamed from: o  reason: collision with root package name */
    private int f13726o;

    public C6643chF() {
        this(null, 0, null, false, false, false, 0, null, 0, false, null, null, 0, null, null, 32767, null);
    }

    public final void a(int i) {
        this.f13726o = i;
    }

    public final void a(MessagingTooltipScreen.Tooltip_Location tooltip_Location) {
        C8632dsu.c((Object) tooltip_Location, "");
        this.f = tooltip_Location;
    }

    public final void b(int i) {
        this.e = i;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final void c(Integer num) {
        this.d = num;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public final void d(int i) {
        this.m = i;
    }

    public final void d(MessagingTooltipScreen.ScreenType screenType) {
        C8632dsu.c((Object) screenType, "");
        this.n = screenType;
    }

    public final void d(drO<dpR> dro) {
        this.g = dro;
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public final int e() {
        return this.e;
    }

    public final void e(int i) {
        this.b = i;
    }

    public final void e(MessagingTooltipScreen.a aVar) {
        this.c = aVar;
    }

    public final void e(MessagingTooltipScreen.e eVar) {
        C8632dsu.c((Object) eVar, "");
        this.i = eVar;
    }

    public final void e(C1619aI c1619aI) {
        C8632dsu.c((Object) c1619aI, "");
        this.h = c1619aI;
    }

    public final void e(boolean z) {
        this.l = z;
    }

    public C6643chF(MessagingTooltipScreen.e eVar, int i, drO<dpR> dro, boolean z, boolean z2, boolean z3, int i2, MessagingTooltipScreen.Tooltip_Location tooltip_Location, int i3, boolean z4, MessagingTooltipScreen.ScreenType screenType, C1619aI c1619aI, int i4, Integer num, MessagingTooltipScreen.a aVar) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) tooltip_Location, "");
        C8632dsu.c((Object) screenType, "");
        C8632dsu.c((Object) c1619aI, "");
        this.i = eVar;
        this.e = i;
        this.g = dro;
        this.k = z;
        this.j = z2;
        this.l = z3;
        this.m = i2;
        this.f = tooltip_Location;
        this.f13726o = i3;
        this.a = z4;
        this.n = screenType;
        this.h = c1619aI;
        this.b = i4;
        this.d = num;
        this.c = aVar;
    }

    public /* synthetic */ C6643chF(MessagingTooltipScreen.e eVar, int i, drO dro, boolean z, boolean z2, boolean z3, int i2, MessagingTooltipScreen.Tooltip_Location tooltip_Location, int i3, boolean z4, MessagingTooltipScreen.ScreenType screenType, C1619aI c1619aI, int i4, Integer num, MessagingTooltipScreen.a aVar, int i5, C8627dsp c8627dsp) {
        this((i5 & 1) != 0 ? MessagingTooltipScreen.e.C0071e.e : eVar, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? null : dro, (i5 & 8) != 0 ? true : z, (i5 & 16) != 0 ? false : z2, (i5 & 32) == 0 ? z3 : true, (i5 & 64) != 0 ? C9834xU.a.ad : i2, (i5 & 128) != 0 ? MessagingTooltipScreen.Tooltip_Location.a : tooltip_Location, (i5 & JSONzip.end) != 0 ? C6638chA.e.d : i3, (i5 & 512) == 0 ? z4 : false, (i5 & 1024) != 0 ? MessagingTooltipScreen.ScreenType.b : screenType, (i5 & 2048) != 0 ? new C1619aI() : c1619aI, (i5 & 4096) != 0 ? C9834xU.c.y : i4, (i5 & 8192) != 0 ? null : num, (i5 & 16384) == 0 ? aVar : null);
    }

    public final InterfaceC6682chs b(final bMW bmw, MessagingEpoxyController messagingEpoxyController) {
        C8632dsu.c((Object) bmw, "");
        C8632dsu.c((Object) messagingEpoxyController, "");
        View findViewById = bmw.requireActivity().findViewById(com.netflix.mediaclient.ui.R.g.W);
        if (findViewById == null) {
            findViewById = null;
        }
        View view = findViewById;
        MessagingTooltipScreen.e eVar = this.i;
        if (C8632dsu.c(eVar, MessagingTooltipScreen.e.b.e)) {
            Context requireContext = bmw.requireContext();
            int i = C6638chA.a.b;
            View findViewById2 = bmw.requireActivity().findViewById(this.e);
            drO<dpR> dro = this.g;
            boolean z = this.k;
            boolean z2 = this.j;
            int i2 = this.m;
            MessagingTooltipScreen.Tooltip_Location tooltip_Location = this.f;
            int i3 = this.f13726o;
            boolean z3 = this.a;
            MessagingTooltipScreen.ScreenType screenType = this.n;
            boolean z4 = this.l;
            int i4 = this.b;
            Integer num = this.d;
            C1619aI c1619aI = this.h;
            MessagingTooltipScreen.a aVar = this.c;
            if (aVar == null) {
                aVar = C6642chE.e;
            }
            MessagingTooltipScreen.a aVar2 = aVar;
            C8632dsu.d(requireContext);
            return new C6644chG(requireContext, i, dro, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.layouts.MessagingTooltipLayoutBuilder$build$1$1
                {
                    super(0);
                }

                public final void d() {
                    bMW.this.dismiss();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            }, findViewById2, i4, z, z2, i2, tooltip_Location, i3, z3, messagingEpoxyController, screenType, view, z4, num, c1619aI, aVar2).b();
        } else if (C8632dsu.c(eVar, MessagingTooltipScreen.e.C0071e.e)) {
            Context requireContext2 = bmw.requireContext();
            int i5 = C6638chA.a.e;
            View findViewById3 = bmw.requireActivity().findViewById(this.e);
            drO<dpR> dro2 = this.g;
            boolean z5 = this.k;
            boolean z6 = this.j;
            int i6 = this.m;
            MessagingTooltipScreen.Tooltip_Location tooltip_Location2 = this.f;
            int i7 = this.f13726o;
            boolean z7 = this.a;
            MessagingTooltipScreen.ScreenType screenType2 = this.n;
            boolean z8 = this.l;
            int i8 = this.b;
            Integer num2 = this.d;
            C1619aI c1619aI2 = this.h;
            MessagingTooltipScreen.a aVar3 = this.c;
            if (aVar3 == null) {
                aVar3 = C6642chE.e;
            }
            MessagingTooltipScreen.a aVar4 = aVar3;
            C8632dsu.d(requireContext2);
            return new C6647chJ(requireContext2, i5, dro2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.layouts.MessagingTooltipLayoutBuilder$build$1$2
                {
                    super(0);
                }

                public final void e() {
                    bMW.this.dismiss();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            }, findViewById3, i8, z5, z6, i6, tooltip_Location2, i7, z7, messagingEpoxyController, screenType2, view, z8, num2, c1619aI2, aVar4).b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
