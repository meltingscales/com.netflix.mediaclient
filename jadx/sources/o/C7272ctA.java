package o;

import android.os.Handler;
import com.google.gson.Gson;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ctA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7272ctA {
    private static final Gson b = C8118deO.a();

    C7272ctA() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C5327bwf e(InterfaceC5198buI interfaceC5198buI, List<InterfaceC5195buF> list, String str, int i) {
        String str2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC5195buF interfaceC5195buF : list) {
                arrayList.add(new C5333bwl(interfaceC5195buF.x(), interfaceC5195buF.getTitle(), interfaceC5195buF.D_()));
            }
            try {
                str2 = b.toJson(arrayList);
            } catch (Exception unused) {
            }
            return d(interfaceC5198buI, str2, str, i);
        }
        str2 = "[]";
        return d(interfaceC5198buI, str2, str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Handler handler, C5327bwf c5327bwf, C5327bwf c5327bwf2, final C5291bvw c5291bvw, final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(c5327bwf);
        arrayList.add(c5327bwf2);
        handler.post(new Runnable() { // from class: o.ctB
            @Override // java.lang.Runnable
            public final void run() {
                C7272ctA.d(C5291bvw.this, arrayList, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(C5291bvw c5291bvw, List list, Runnable runnable) {
        c5291bvw.d(list);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Handler handler, InterfaceC5198buI interfaceC5198buI, List<InterfaceC5195buF> list, String str, int i, final C5291bvw c5291bvw, final Runnable runnable) {
        final C5327bwf e = e(interfaceC5198buI, list, str, i);
        handler.post(new Runnable() { // from class: o.ctz
            @Override // java.lang.Runnable
            public final void run() {
                C7272ctA.d(C5291bvw.this, e, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(C5291bvw c5291bvw, C5327bwf c5327bwf, Runnable runnable) {
        c5291bvw.d(c5327bwf);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Handler handler, InterfaceC5283bvo interfaceC5283bvo, final C5291bvw c5291bvw) {
        final C5336bwo c5336bwo = new C5336bwo();
        c5336bwo.e = interfaceC5283bvo.getProfileGuid();
        c5336bwo.a = interfaceC5283bvo.getProfileName();
        c5336bwo.b = interfaceC5283bvo.isKidsProfile();
        c5336bwo.d = interfaceC5283bvo.getAvatarUrl();
        handler.post(new Runnable() { // from class: o.ctC
            @Override // java.lang.Runnable
            public final void run() {
                C5291bvw.this.d(c5336bwo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C5291bvw c5291bvw, List<C5327bwf> list) {
        c5291bvw.a(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(C5291bvw c5291bvw, List<C5336bwo> list) {
        c5291bvw.c(list);
    }

    private static C5327bwf d(InterfaceC5198buI interfaceC5198buI, String str, String str2, int i) {
        InterfaceC1912aSw f = new C6004cQk().f();
        Objects.requireNonNull(f);
        aSI c = f.c();
        C5327bwf c5327bwf = new C5327bwf();
        InterfaceC5160btX aE_ = interfaceC5198buI.aE_();
        c5327bwf.C = aE_.aY_();
        c5327bwf.I = aE_.G();
        c5327bwf.H = aE_.F();
        c5327bwf.E = aE_.aV_();
        c5327bwf.B = aE_.aS_();
        c5327bwf.N = aE_.aX_();
        c5327bwf.K = aE_.H();
        c5327bwf.z = aE_.aR_();
        c5327bwf.A = aE_.isAvailableToPlay();
        c5327bwf.M = aE_.M();
        c5327bwf.k = aE_.aJ_();
        c5327bwf.n = aE_.g();
        c5327bwf.ac = aE_.x();
        c5327bwf.f13636o = aE_.aw_();
        c5327bwf.Q = aE_.aB_();
        c5327bwf.l = aE_.av_();
        c5327bwf.W = aE_.an_();
        c5327bwf.an = aE_.aG_();
        c5327bwf.b = aE_.aF_();
        c5327bwf.ae = aE_.N();
        c5327bwf.m = aE_.aU_();
        c5327bwf.aa = aE_.aK_();
        try {
            c5327bwf.D = c.a(aE_.az_());
            c5327bwf.ak = c.b(interfaceC5198buI.B());
        } catch (Exception unused) {
        }
        c5327bwf.T = interfaceC5198buI.aE_().aO_();
        c5327bwf.aq = interfaceC5198buI.getId();
        c5327bwf.V = i;
        c5327bwf.am = interfaceC5198buI.getTitle();
        c5327bwf.ab = str;
        c5327bwf.Y = str2;
        c5327bwf.p = -1;
        c5327bwf.ao = interfaceC5198buI.getType().getKey();
        if (interfaceC5198buI instanceof InterfaceC5227bul) {
            InterfaceC5227bul interfaceC5227bul = (InterfaceC5227bul) interfaceC5198buI;
            c5327bwf.u = interfaceC5227bul.w();
            c5327bwf.U = interfaceC5227bul.cb_();
        } else {
            c5327bwf.u = interfaceC5198buI.bM_();
        }
        c5327bwf.O = interfaceC5198buI.ar();
        c5327bwf.S = interfaceC5198buI.aw();
        c5327bwf.f13635J = interfaceC5198buI.al();
        c5327bwf.w = interfaceC5198buI.ai();
        c5327bwf.R = interfaceC5198buI.av();
        c5327bwf.P = interfaceC5198buI.an();
        if (!(interfaceC5198buI instanceof C1536aEy) && !(interfaceC5198buI instanceof C1528aEq) && !(interfaceC5198buI instanceof C1529aEr)) {
            ContextualText e = interfaceC5198buI.e(ContextualText.TextContext.b);
            if (C8168dfL.h(e.text())) {
                c5327bwf.aj = e.text();
                c5327bwf.al = e.evidenceKey();
            }
            c5327bwf.d = interfaceC5198buI.bP_();
            try {
                c5327bwf.e = c.c(interfaceC5198buI.e());
            } catch (Exception unused2) {
            }
            c5327bwf.as = interfaceC5198buI.ag();
            c5327bwf.X = interfaceC5198buI.E();
            c5327bwf.af = interfaceC5198buI.ab();
            c5327bwf.Z = interfaceC5198buI.R();
            c5327bwf.d = interfaceC5198buI.bP_();
            c5327bwf.r = interfaceC5198buI.v();
            c5327bwf.h = interfaceC5198buI.k();
            c5327bwf.ah = interfaceC5198buI.Y();
            c5327bwf.g = interfaceC5198buI.p();
            c5327bwf.v = interfaceC5198buI.D();
            c5327bwf.i = interfaceC5198buI.getBoxshotUrl();
            c5327bwf.j = interfaceC5198buI.getBoxartId();
            c5327bwf.ad = interfaceC5198buI.U();
            c5327bwf.a = interfaceC5198buI.c();
            c5327bwf.f = interfaceC5198buI.m();
            c5327bwf.ar = interfaceC5198buI.Z();
            c5327bwf.ap = interfaceC5198buI.af();
            c5327bwf.F = interfaceC5198buI.isOriginal();
            c5327bwf.L = !interfaceC5198buI.isAvailableToPlay();
            c5327bwf.y = interfaceC5198buI.ao();
            c5327bwf.x = interfaceC5198buI.am();
            c5327bwf.G = interfaceC5198buI.ap();
            c5327bwf.ai = c.a(interfaceC5198buI.ac());
            c5327bwf.ag = interfaceC5198buI.A_().d();
        }
        return c5327bwf;
    }
}
