package com.netflix.hawkins.consumer.icons;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveySelectorViewModel;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.C1026Lt;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import org.linphone.BuildConfig;

/* loaded from: classes3.dex */
public abstract class HawkinsIcon {
    public static final bN a = new bN(null);
    private final int b;
    private final Category c;
    private final String d;
    private final int e;
    private final int h;
    private final int j;

    public /* synthetic */ HawkinsIcon(String str, Category category, int i, int i2, int i3, int i4, C8627dsp c8627dsp) {
        this(str, category, i, i2, i3, i4);
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.h;
    }

    public final int e() {
        return this.e;
    }

    public final int i() {
        return this.j;
    }

    private HawkinsIcon(String str, Category category, int i, int i2, int i3, int i4) {
        this.d = str;
        this.c = category;
        this.h = i;
        this.j = i2;
        this.b = i3;
        this.e = i4;
    }

    public final HawkinsIcon a() {
        return C8632dsu.c(this, X.e) ? V.e : C8632dsu.c(this, aL.b) ? aI.d : C8632dsu.c(this, C0218di.b) ? C0221dl.e : C8632dsu.c(this, eR.c) ? eW.c : C8632dsu.c(this, hM.c) ? hK.e : C8632dsu.c(this, U.e) ? T.e : C8632dsu.c(this, C0283fu.e) ? C0285fw.e : C8632dsu.c(this, C0284fv.e) ? C0286fx.d : C8632dsu.c(this, C0314gy.b) ? gD.e : C8632dsu.c(this, C0318hb.c) ? C0320hd.e : C8632dsu.c(this, C0408w.b) ? C0407v.b : C8632dsu.c(this, D.d) ? B.c : C8632dsu.c(this, O.b) ? W.c : C8632dsu.c(this, aD.b) ? aC.b : C8632dsu.c(this, aG.d) ? aE.c : C8632dsu.c(this, aQ.e) ? aS.c : C8632dsu.c(this, aT.e) ? aR.d : C8632dsu.c(this, C0280fr.c) ? C0276fn.d : C8632dsu.c(this, C0300gk.c) ? C0296gg.d : C8632dsu.c(this, C0174bs.b) ? C0176bu.b : C8632dsu.c(this, C0253er.b) ? C0252eq.c : C8632dsu.c(this, C0325hi.c) ? C0324hh.c : C8632dsu.c(this, hP.b) ? hN.d : C8632dsu.c(this, C0345ib.e) ? Cif.d : C8632dsu.c(this, C0348ie.b) ? C0349ig.d : C8632dsu.c(this, C0351ii.b) ? C0350ih.d : C8632dsu.c(this, C0390ju.d) ? jD.e : C8632dsu.c(this, hV.d) ? hT.c : C8632dsu.c(this, C0151aw.c) ? C0150av.b : C8632dsu.c(this, C0235e.e) ? C0182c.c : C8632dsu.c(this, jK.b) ? jL.e : this;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Category {
        private static final /* synthetic */ InterfaceC8598drn s;
        private static final /* synthetic */ Category[] t;
        public static final Category d = new Category("BRAND", 0);
        public static final Category e = new Category("COMMERCE", 1);
        public static final Category b = new Category("ENVIRONMENT", 2);
        public static final Category c = new Category("FILE", 3);
        public static final Category a = new Category("FILM", 4);
        public static final Category j = new Category("FORMATTING", 5);
        public static final Category g = new Category("MEDIA_PLAYER_CONTROLS", 6);
        public static final Category i = new Category("NAVIGATION", 7);
        public static final Category h = new Category("OBJECT", 8);
        public static final Category f = new Category("OPERATIONS", 9);
        public static final Category l = new Category(Payload.DEFAULT_SOCIAL_ACTION, 10);
        public static final Category n = new Category("STATUS", 11);
        public static final Category k = new Category("TECHNOLOGY", 12);

        /* renamed from: o  reason: collision with root package name */
        public static final Category f13145o = new Category("TIME", 13);
        public static final Category m = new Category("TOGGLE", 14);
        public static final Category q = new Category("USER", 15);

        private static final /* synthetic */ Category[] b() {
            return new Category[]{d, e, b, c, a, j, g, i, h, f, l, n, k, f13145o, m, q};
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) t.clone();
        }

        private Category(String str, int i2) {
        }

        static {
            Category[] b2 = b();
            t = b2;
            s = C8600drp.e(b2);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jr  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0387jr extends HawkinsIcon {
        public static final C0387jr b = new C0387jr();

        private C0387jr() {
            super("tudum", Category.d, C1026Lt.a.Ov, C1026Lt.a.Ou, C1026Lt.a.Op, C1026Lt.a.On, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class X extends HawkinsIcon {
        public static final X e = new X();

        private X() {
            super("bank", Category.e, C1026Lt.a.cP, C1026Lt.a.cO, C1026Lt.a.cJ, C1026Lt.a.cL, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class V extends HawkinsIcon {
        public static final V e = new V();

        private V() {
            super("bank-automirrored", Category.e, C1026Lt.a.cN, C1026Lt.a.cQ, C1026Lt.a.cR, C1026Lt.a.cK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ao  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0143ao extends HawkinsIcon {
        public static final C0143ao e = new C0143ao();

        private C0143ao() {
            super("building-facility", Category.e, C1026Lt.a.el, C1026Lt.a.em, C1026Lt.a.ej, C1026Lt.a.ei, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$aq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0145aq extends HawkinsIcon {
        public static final C0145aq e = new C0145aq();

        private C0145aq() {
            super("building-marketplace", Category.e, C1026Lt.a.ek, C1026Lt.a.eq, C1026Lt.a.eo, C1026Lt.a.en, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aL extends HawkinsIcon {
        public static final aL b = new aL();

        private aL() {
            super("cart", Category.e, C1026Lt.a.fL, C1026Lt.a.fO, C1026Lt.a.fK, C1026Lt.a.fE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aI extends HawkinsIcon {
        public static final aI d = new aI();

        private aI() {
            super("cart-automirrored", Category.e, C1026Lt.a.fI, C1026Lt.a.fP, C1026Lt.a.fJ, C1026Lt.a.fH, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bY extends HawkinsIcon {
        public static final bY c = new bY();

        private bY() {
            super("credit-card", Category.e, C1026Lt.a.kI, C1026Lt.a.kK, C1026Lt.a.kH, C1026Lt.a.kE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bU extends HawkinsIcon {
        public static final bU d = new bU();

        private bU() {
            super("credit-card-fill", Category.e, C1026Lt.a.kD, C1026Lt.a.kF, C1026Lt.a.kC, C1026Lt.a.kG, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0189cg extends HawkinsIcon {
        public static final C0189cg b = new C0189cg();

        private C0189cg() {
            super("delivery-truck", Category.e, C1026Lt.a.lA, C1026Lt.a.lC, C1026Lt.a.ly, C1026Lt.a.lv, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$eb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0237eb extends HawkinsIcon {
        public static final C0237eb d = new C0237eb();

        private C0237eb() {
            super("gift", Category.e, C1026Lt.a.ta, C1026Lt.a.td, C1026Lt.a.tc, C1026Lt.a.tb, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0178bw extends HawkinsIcon {
        public static final C0178bw c = new C0178bw();

        private C0178bw() {
            super("cloud", Category.b, C1026Lt.a.iQ, C1026Lt.a.iY, C1026Lt.a.iT, C1026Lt.a.iR, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ea  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0236ea extends HawkinsIcon {
        public static final C0236ea b = new C0236ea();

        private C0236ea() {
            super("globe", Category.b, C1026Lt.a.tq, C1026Lt.a.tt, C1026Lt.a.tp, C1026Lt.a.tr, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ej  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0245ej extends HawkinsIcon {
        public static final C0245ej c = new C0245ej();

        private C0245ej() {
            super("globe-earth", Category.b, C1026Lt.a.tm, C1026Lt.a.ts, C1026Lt.a.tk, C1026Lt.a.tl, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fH extends HawkinsIcon {
        public static final fH e = new fH();

        private fH() {
            super("map-pin", Category.b, C1026Lt.a.zP, C1026Lt.a.zS, C1026Lt.a.zO, C1026Lt.a.zQ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fW extends HawkinsIcon {
        public static final fW c = new fW();

        private fW() {
            super("moon", Category.b, C1026Lt.a.AZ, C1026Lt.a.Bc, C1026Lt.a.Ba, C1026Lt.a.Bd, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gf  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0295gf extends HawkinsIcon {
        public static final C0295gf c = new C0295gf();

        private C0295gf() {
            super("moon-fill", Category.b, C1026Lt.a.AU, C1026Lt.a.Bb, C1026Lt.a.AY, C1026Lt.a.AV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0306gq extends HawkinsIcon {
        public static final C0306gq e = new C0306gq();

        private C0306gq() {
            super("palm-tree-water", Category.b, C1026Lt.a.CA, C1026Lt.a.CE, C1026Lt.a.Cy, C1026Lt.a.Cx, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kh extends HawkinsIcon {
        public static final kh e = new kh();

        private kh() {
            super("weather-cold", Category.b, C1026Lt.a.Ri, C1026Lt.a.Rl, C1026Lt.a.Rj, C1026Lt.a.Rk, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kd extends HawkinsIcon {
        public static final kd e = new kd();

        private kd() {
            super("weather-heat", Category.b, C1026Lt.a.Ro, C1026Lt.a.Rp, C1026Lt.a.Rq, C1026Lt.a.Rm, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kg extends HawkinsIcon {
        public static final kg c = new kg();

        private kg() {
            super("weather-rain", Category.b, C1026Lt.a.Rs, C1026Lt.a.Rr, C1026Lt.a.Ru, C1026Lt.a.Rn, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ke extends HawkinsIcon {
        public static final ke e = new ke();

        private ke() {
            super("weather-snow", Category.b, C1026Lt.a.Rz, C1026Lt.a.RA, C1026Lt.a.Rt, C1026Lt.a.Rv, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cs  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0201cs extends HawkinsIcon {
        public static final C0201cs d = new C0201cs();

        private C0201cs() {
            super("document", Category.c, C1026Lt.a.nz, C1026Lt.a.nw, C1026Lt.a.mJ, C1026Lt.a.mL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0198cp extends HawkinsIcon {
        public static final C0198cp e = new C0198cp();

        private C0198cp() {
            super("document-ale", Category.c, C1026Lt.a.mc, C1026Lt.a.md, C1026Lt.a.lZ, C1026Lt.a.mb, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cr  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0200cr extends HawkinsIcon {
        public static final C0200cr c = new C0200cr();

        private C0200cr() {
            super("document-amf", Category.c, C1026Lt.a.mi, C1026Lt.a.mh, C1026Lt.a.me, C1026Lt.a.mf, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0199cq extends HawkinsIcon {
        public static final C0199cq d = new C0199cq();

        private C0199cq() {
            super("document-background", Category.c, C1026Lt.a.mj, C1026Lt.a.mm, C1026Lt.a.mk, C1026Lt.a.mg, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$co  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0197co extends HawkinsIcon {
        public static final C0197co c = new C0197co();

        private C0197co() {
            super("document-cdl", Category.c, C1026Lt.a.mq, C1026Lt.a.ms, C1026Lt.a.mn, C1026Lt.a.ml, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0203cu extends HawkinsIcon {
        public static final C0203cu c = new C0203cu();

        private C0203cu() {
            super("document-checkmark", Category.c, C1026Lt.a.mp, C1026Lt.a.mv, C1026Lt.a.mr, C1026Lt.a.mo, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0206cx extends HawkinsIcon {
        public static final C0206cx d = new C0206cx();

        private C0206cx() {
            super("document-dpx", Category.c, C1026Lt.a.mw, C1026Lt.a.mt, C1026Lt.a.mu, C1026Lt.a.mx, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0205cw extends HawkinsIcon {
        public static final C0205cw d = new C0205cw();

        private C0205cw() {
            super("document-exr", Category.c, C1026Lt.a.mC, C1026Lt.a.my, C1026Lt.a.mA, C1026Lt.a.mz, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ct  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0202ct extends HawkinsIcon {
        public static final C0202ct c = new C0202ct();

        private C0202ct() {
            super("document-fdl", Category.c, C1026Lt.a.mD, C1026Lt.a.mF, C1026Lt.a.mE, C1026Lt.a.mB, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0204cv extends HawkinsIcon {
        public static final C0204cv d = new C0204cv();

        private C0204cv() {
            super("document-fill", Category.c, C1026Lt.a.mI, C1026Lt.a.mK, C1026Lt.a.mG, C1026Lt.a.mH, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0207cy extends HawkinsIcon {
        public static final C0207cy e = new C0207cy();

        private C0207cy() {
            super("document-lut", Category.c, C1026Lt.a.mQ, C1026Lt.a.mR, C1026Lt.a.mP, C1026Lt.a.mM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cB extends HawkinsIcon {
        public static final cB b = new cB();

        private cB() {
            super("document-ma", Category.c, C1026Lt.a.mW, C1026Lt.a.mT, C1026Lt.a.mN, C1026Lt.a.mO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cA extends HawkinsIcon {
        public static final cA e = new cA();

        private cA() {
            super("document-mb", Category.c, C1026Lt.a.mS, C1026Lt.a.na, C1026Lt.a.mV, C1026Lt.a.mU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cC extends HawkinsIcon {
        public static final cC d = new cC();

        private cC() {
            super("document-mhl", Category.c, C1026Lt.a.mZ, C1026Lt.a.mX, C1026Lt.a.mY, C1026Lt.a.nb, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0208cz extends HawkinsIcon {
        public static final C0208cz e = new C0208cz();

        private C0208cz() {
            super("document-mxf", Category.c, C1026Lt.a.nd, C1026Lt.a.nc, C1026Lt.a.ng, C1026Lt.a.nf, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cF extends HawkinsIcon {
        public static final cF c = new cF();

        private cF() {
            super("document-nk", Category.c, C1026Lt.a.nh, C1026Lt.a.nj, C1026Lt.a.ni, C1026Lt.a.ne, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cH extends HawkinsIcon {
        public static final cH c = new cH();

        private cH() {
            super("document-pdf", Category.c, C1026Lt.a.nm, C1026Lt.a.nq, C1026Lt.a.nk, C1026Lt.a.nl, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cD extends HawkinsIcon {
        public static final cD b = new cD();

        private cD() {
            super("document-psb", Category.c, C1026Lt.a.nn, C1026Lt.a.ns, C1026Lt.a.np, C1026Lt.a.no, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cG extends HawkinsIcon {
        public static final cG d = new cG();

        private cG() {
            super("document-psd", Category.c, C1026Lt.a.nr, C1026Lt.a.nv, C1026Lt.a.nu, C1026Lt.a.nt, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cE extends HawkinsIcon {
        public static final cE c = new cE();

        private cE() {
            super("document-tif", Category.c, C1026Lt.a.ny, C1026Lt.a.nC, C1026Lt.a.nA, C1026Lt.a.nx, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cK extends HawkinsIcon {
        public static final cK d = new cK();

        private cK() {
            super("document-usd", Category.c, C1026Lt.a.nE, C1026Lt.a.nF, C1026Lt.a.nD, C1026Lt.a.nB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cI extends HawkinsIcon {
        public static final cI e = new cI();

        private cI() {
            super("document-x", Category.c, C1026Lt.a.nG, C1026Lt.a.nH, C1026Lt.a.nK, C1026Lt.a.nJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cQ extends HawkinsIcon {
        public static final cQ e = new cQ();

        private cQ() {
            super("download", Category.c, C1026Lt.a.ol, C1026Lt.a.os, C1026Lt.a.og, C1026Lt.a.oi, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cO extends HawkinsIcon {
        public static final cO d = new cO();

        private cO() {
            super("download-checkmark", Category.c, C1026Lt.a.nX, C1026Lt.a.nZ, C1026Lt.a.nY, C1026Lt.a.nW, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cN extends HawkinsIcon {
        public static final cN b = new cN();

        private cN() {
            super("download-circle", Category.c, C1026Lt.a.oj, C1026Lt.a.oh, C1026Lt.a.of, C1026Lt.a.oa, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cR extends HawkinsIcon {
        public static final cR e = new cR();

        private cR() {
            super("download-circle-fill", Category.c, C1026Lt.a.oe, C1026Lt.a.ob, C1026Lt.a.od, C1026Lt.a.oc, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cP extends HawkinsIcon {
        public static final cP c = new cP();

        private cP() {
            super("download-series", Category.c, C1026Lt.a.ok, C1026Lt.a.om, C1026Lt.a.oo, C1026Lt.a.on, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cV extends HawkinsIcon {
        public static final cV c = new cV();

        private cV() {
            super("downloads-smart", Category.c, C1026Lt.a.or, C1026Lt.a.oq, C1026Lt.a.op, C1026Lt.a.ot, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$di  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0218di extends HawkinsIcon {
        public static final C0218di b = new C0218di();

        private C0218di() {
            super("export", Category.c, C1026Lt.a.pC, C1026Lt.a.pJ, C1026Lt.a.pG, C1026Lt.a.pE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0221dl extends HawkinsIcon {
        public static final C0221dl e = new C0221dl();

        private C0221dl() {
            super("export-automirrored", Category.c, C1026Lt.a.pI, C1026Lt.a.pK, C1026Lt.a.pD, C1026Lt.a.pF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0233dy extends HawkinsIcon {
        public static final C0233dy c = new C0233dy();

        private C0233dy() {
            super("folder", Category.c, C1026Lt.a.qV, C1026Lt.a.rb, C1026Lt.a.qH, C1026Lt.a.qG, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0232dx extends HawkinsIcon {
        public static final C0232dx d = new C0232dx();

        private C0232dx() {
            super("folder-open", Category.c, C1026Lt.a.qM, C1026Lt.a.qK, C1026Lt.a.qI, C1026Lt.a.qF, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dA extends HawkinsIcon {
        public static final dA c = new dA();

        private dA() {
            super("folder-plus", Category.c, C1026Lt.a.qR, C1026Lt.a.qQ, C1026Lt.a.qS, C1026Lt.a.qT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0234dz extends HawkinsIcon {
        public static final C0234dz c = new C0234dz();

        private C0234dz() {
            super("folder-shield", Category.c, C1026Lt.a.qX, C1026Lt.a.qW, C1026Lt.a.qY, C1026Lt.a.qU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dE extends HawkinsIcon {
        public static final dE c = new dE();

        private dE() {
            super("folder-user", Category.c, C1026Lt.a.rd, C1026Lt.a.ra, C1026Lt.a.qZ, C1026Lt.a.rc, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dF extends HawkinsIcon {
        public static final dF c = new dF();

        private dF() {
            super("folder-x", Category.c, C1026Lt.a.ri, C1026Lt.a.rh, C1026Lt.a.re, C1026Lt.a.rf, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ef  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0241ef extends HawkinsIcon {
        public static final C0241ef e = new C0241ef();

        private C0241ef() {
            super("google-doc", Category.c, C1026Lt.a.tC, C1026Lt.a.tB, C1026Lt.a.tA, C1026Lt.a.tx, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ek  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0246ek extends HawkinsIcon {
        public static final C0246ek b = new C0246ek();

        private C0246ek() {
            super("google-sheet", Category.c, C1026Lt.a.tR, C1026Lt.a.tS, C1026Lt.a.tK, C1026Lt.a.tM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eR extends HawkinsIcon {
        public static final eR c = new eR();

        private eR() {
            super("import", Category.c, C1026Lt.a.wu, C1026Lt.a.wt, C1026Lt.a.wq, C1026Lt.a.wo, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eW extends HawkinsIcon {
        public static final eW c = new eW();

        private eW() {
            super("import-automirrored", Category.c, C1026Lt.a.wx, C1026Lt.a.ww, C1026Lt.a.wv, C1026Lt.a.wp, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gs  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0308gs extends HawkinsIcon {
        public static final C0308gs c = new C0308gs();

        private C0308gs() {
            super("notes", Category.c, C1026Lt.a.Ci, C1026Lt.a.Cj, C1026Lt.a.Cl, C1026Lt.a.Ck, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hM extends HawkinsIcon {
        public static final hM c = new hM();

        private hM() {
            super("share", Category.c, C1026Lt.a.HZ, C1026Lt.a.HX, C1026Lt.a.HQ, C1026Lt.a.HO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hK extends HawkinsIcon {
        public static final hK e = new hK();

        private hK() {
            super("share-automirrored", Category.c, C1026Lt.a.HY, C1026Lt.a.HV, C1026Lt.a.HR, C1026Lt.a.HP, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hJ extends HawkinsIcon {
        public static final hJ e = new hJ();

        private hJ() {
            super("share-android", Category.c, C1026Lt.a.HI, C1026Lt.a.HH, C1026Lt.a.HG, C1026Lt.a.HJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hL extends HawkinsIcon {
        public static final hL d = new hL();

        private hL() {
            super("share-ios", Category.c, C1026Lt.a.HN, C1026Lt.a.HM, C1026Lt.a.HL, C1026Lt.a.HK, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hR extends HawkinsIcon {
        public static final hR d = new hR();

        private hR() {
            super("share-plane", Category.c, C1026Lt.a.HU, C1026Lt.a.HW, C1026Lt.a.HS, C1026Lt.a.HT, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hO extends HawkinsIcon {
        public static final hO c = new hO();

        private hO() {
            super("shield-checkmark", Category.c, C1026Lt.a.Ii, C1026Lt.a.Ig, C1026Lt.a.If, C1026Lt.a.Ia, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hQ extends HawkinsIcon {
        public static final hQ b = new hQ();

        private hQ() {
            super("shield-checkmark-fill", Category.c, C1026Lt.a.Ib, C1026Lt.a.Ic, C1026Lt.a.Id, C1026Lt.a.Ie, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ja  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0370ja extends HawkinsIcon {
        public static final C0370ja d = new C0370ja();

        private C0370ja() {
            super("ticket", Category.c, C1026Lt.a.Nk, C1026Lt.a.Nr, C1026Lt.a.Nm, C1026Lt.a.Nl, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0395jz extends HawkinsIcon {
        public static final C0395jz e = new C0395jz();

        private C0395jz() {
            super("upload", Category.c, C1026Lt.a.Ph, C1026Lt.a.Pl, C1026Lt.a.Pk, C1026Lt.a.Pi, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$q  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0402q extends HawkinsIcon {
        public static final C0402q c = new C0402q();

        private C0402q() {
            super("animatic", Category.a, C1026Lt.a.at, C1026Lt.a.av, C1026Lt.a.ar, C1026Lt.a.ao, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class I extends HawkinsIcon {
        public static final I e = new I();

        private I() {
            super("asset", Category.a, C1026Lt.a.bF, C1026Lt.a.bH, C1026Lt.a.bC, C1026Lt.a.bD, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class F extends HawkinsIcon {
        public static final F c = new F();

        private F() {
            super("asset-background-scenery", Category.a, C1026Lt.a.bx, C1026Lt.a.by, C1026Lt.a.bv, C1026Lt.a.bu, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class E extends HawkinsIcon {
        public static final E e = new E();

        private E() {
            super("asset-character", Category.a, C1026Lt.a.bA, C1026Lt.a.bE, C1026Lt.a.bz, C1026Lt.a.bw, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class G extends HawkinsIcon {
        public static final G b = new G();

        private G() {
            super("asset-prop", Category.a, C1026Lt.a.bI, C1026Lt.a.bG, C1026Lt.a.bJ, C1026Lt.a.bB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class L extends HawkinsIcon {
        public static final L d = new L();

        private L() {
            super("asset-vehicle", Category.a, C1026Lt.a.bL, C1026Lt.a.bK, C1026Lt.a.bM, C1026Lt.a.bO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Y extends HawkinsIcon {
        public static final Y c = new Y();

        private Y() {
            super("blm", Category.a, C1026Lt.a.df, C1026Lt.a.dh, C1026Lt.a.dc, C1026Lt.a.de, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bH extends HawkinsIcon {
        public static final bH d = new bH();

        private bH() {
            super("collection", Category.a, C1026Lt.a.jE, C1026Lt.a.jI, C1026Lt.a.jA, C1026Lt.a.jB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bL extends HawkinsIcon {
        public static final bL b = new bL();

        private bL() {
            super("coming-soon", Category.a, C1026Lt.a.jX, C1026Lt.a.jW, C1026Lt.a.jU, C1026Lt.a.jS, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bK extends HawkinsIcon {
        public static final bK e = new bK();

        private bK() {
            super("coming-soon-fill", Category.a, C1026Lt.a.jQ, C1026Lt.a.jP, C1026Lt.a.jR, C1026Lt.a.jO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bM extends HawkinsIcon {
        public static final bM b = new bM();

        private bM() {
            super("content-type-documentary", Category.a, C1026Lt.a.ka, C1026Lt.a.kd, C1026Lt.a.kb, C1026Lt.a.jY, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bS extends HawkinsIcon {
        public static final bS c = new bS();

        private bS() {
            super("content-type-interactive", Category.a, C1026Lt.a.kg, C1026Lt.a.kf, C1026Lt.a.ke, C1026Lt.a.kh, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bT extends HawkinsIcon {
        public static final bT d = new bT();

        private bT() {
            super("content-type-kids-and-family", Category.a, C1026Lt.a.kj, C1026Lt.a.km, C1026Lt.a.kk, C1026Lt.a.ki, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bR extends HawkinsIcon {
        public static final bR e = new bR();

        private bR() {
            super("content-type-reality-unscripted", Category.a, C1026Lt.a.kp, C1026Lt.a.kn, C1026Lt.a.kr, C1026Lt.a.kl, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bP extends HawkinsIcon {
        public static final bP b = new bP();

        private bP() {
            super("content-type-stand-up-comedy", Category.a, C1026Lt.a.kt, C1026Lt.a.ku, C1026Lt.a.kq, C1026Lt.a.ko, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0196cn extends HawkinsIcon {
        public static final C0196cn d = new C0196cn();

        private C0196cn() {
            super("directors-chair", Category.a, C1026Lt.a.lN, C1026Lt.a.lM, C1026Lt.a.lL, C1026Lt.a.lK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0192cj extends HawkinsIcon {
        public static final C0192cj d = new C0192cj();

        private C0192cj() {
            super("display-set-a", Category.a, C1026Lt.a.lP, C1026Lt.a.lS, C1026Lt.a.lR, C1026Lt.a.lO, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0194cl extends HawkinsIcon {
        public static final C0194cl c = new C0194cl();

        private C0194cl() {
            super("display-set-general", Category.a, C1026Lt.a.lY, C1026Lt.a.lX, C1026Lt.a.lQ, C1026Lt.a.lT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ck  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0193ck extends HawkinsIcon {
        public static final C0193ck c = new C0193ck();

        private C0193ck() {
            super("display-set-m", Category.a, C1026Lt.a.lW, C1026Lt.a.ma, C1026Lt.a.lU, C1026Lt.a.lV, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cX extends HawkinsIcon {
        public static final cX c = new cX();

        private cX() {
            super("end-credits", Category.a, C1026Lt.a.oU, C1026Lt.a.oT, C1026Lt.a.oW, C1026Lt.a.oO, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0212dc extends HawkinsIcon {
        public static final C0212dc c = new C0212dc();

        private C0212dc() {
            super("episodes", Category.a, C1026Lt.a.pk, C1026Lt.a.pj, C1026Lt.a.pi, C1026Lt.a.pl, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dt  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0228dt extends HawkinsIcon {
        public static final C0228dt b = new C0228dt();

        private C0228dt() {
            super("film", Category.a, C1026Lt.a.qr, C1026Lt.a.qs, C1026Lt.a.qq, C1026Lt.a.qu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0231dw extends HawkinsIcon {
        public static final C0231dw c = new C0231dw();

        private C0231dw() {
            super("folder-play", Category.a, C1026Lt.a.qL, C1026Lt.a.qP, C1026Lt.a.qN, C1026Lt.a.qO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dD extends HawkinsIcon {
        public static final dD e = new dD();

        private dD() {
            super("footage-clip", Category.a, C1026Lt.a.rm, C1026Lt.a.rk, C1026Lt.a.rl, C1026Lt.a.rg, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dM extends HawkinsIcon {
        public static final dM e = new dM();

        private dM() {
            super("genre-action", Category.a, C1026Lt.a.sc, C1026Lt.a.sj, C1026Lt.a.sf, C1026Lt.a.sd, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dQ extends HawkinsIcon {
        public static final dQ d = new dQ();

        private dQ() {
            super("genre-adventure", Category.a, C1026Lt.a.sl, C1026Lt.a.sh, C1026Lt.a.si, C1026Lt.a.sk, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dU extends HawkinsIcon {
        public static final dU b = new dU();

        private dU() {
            super("genre-comedy", Category.a, C1026Lt.a.sp, C1026Lt.a.sn, C1026Lt.a.so, C1026Lt.a.sm, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dT extends HawkinsIcon {
        public static final dT b = new dT();

        private dT() {
            super("genre-drama", Category.a, C1026Lt.a.st, C1026Lt.a.sv, C1026Lt.a.sr, C1026Lt.a.sq, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dR extends HawkinsIcon {
        public static final dR d = new dR();

        private dR() {
            super("genre-fantasy", Category.a, C1026Lt.a.sA, C1026Lt.a.sy, C1026Lt.a.ss, C1026Lt.a.su, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dS extends HawkinsIcon {
        public static final dS d = new dS();

        private dS() {
            super("genre-horror", Category.a, C1026Lt.a.sw, C1026Lt.a.sE, C1026Lt.a.sx, C1026Lt.a.sz, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dZ extends HawkinsIcon {
        public static final dZ b = new dZ();

        private dZ() {
            super("genre-mystery", Category.a, C1026Lt.a.sB, C1026Lt.a.sC, C1026Lt.a.sF, C1026Lt.a.sD, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dV extends HawkinsIcon {
        public static final dV e = new dV();

        private dV() {
            super("genre-romance", Category.a, C1026Lt.a.sJ, C1026Lt.a.sG, C1026Lt.a.sI, C1026Lt.a.sK, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dY extends HawkinsIcon {
        public static final dY e = new dY();

        private dY() {
            super("genre-sci-fi", Category.a, C1026Lt.a.sP, C1026Lt.a.sM, C1026Lt.a.sO, C1026Lt.a.sH, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dX extends HawkinsIcon {
        public static final dX d = new dX();

        private dX() {
            super("genre-special-interest", Category.a, C1026Lt.a.sU, C1026Lt.a.sS, C1026Lt.a.sN, C1026Lt.a.sL, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dW extends HawkinsIcon {
        public static final dW b = new dW();

        private dW() {
            super("genre-thriller", Category.a, C1026Lt.a.sR, C1026Lt.a.sV, C1026Lt.a.sT, C1026Lt.a.sQ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ed  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0239ed extends HawkinsIcon {
        public static final C0239ed b = new C0239ed();

        private C0239ed() {
            super("genre-western", Category.a, C1026Lt.a.sZ, C1026Lt.a.sW, C1026Lt.a.sY, C1026Lt.a.sX, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eB extends HawkinsIcon {
        public static final eB d = new eB();

        private eB() {
            super("hexagon", Category.a, C1026Lt.a.vz, C1026Lt.a.vw, C1026Lt.a.vv, C1026Lt.a.vs, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eI extends HawkinsIcon {
        public static final eI b = new eI();

        private eI() {
            super("hexagon-exclamation-point", Category.a, C1026Lt.a.vt, C1026Lt.a.vq, C1026Lt.a.vu, C1026Lt.a.vr, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eN extends HawkinsIcon {
        public static final eN b = new eN();

        private eN() {
            super("horn", Category.a, C1026Lt.a.vV, C1026Lt.a.wc, C1026Lt.a.vQ, C1026Lt.a.vS, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eL extends HawkinsIcon {
        public static final eL d = new eL();

        private eL() {
            super("horn-off", Category.a, C1026Lt.a.vU, C1026Lt.a.vX, C1026Lt.a.vW, C1026Lt.a.vY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0269fg extends HawkinsIcon {
        public static final C0269fg c = new C0269fg();

        private C0269fg() {
            super("laurel-wreath", Category.a, C1026Lt.a.xx, C1026Lt.a.xz, C1026Lt.a.xr, C1026Lt.a.xv, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0288fz extends HawkinsIcon {
        public static final C0288fz e = new C0288fz();

        private C0288fz() {
            super("live-action-shot", Category.a, C1026Lt.a.yR, C1026Lt.a.yS, C1026Lt.a.yO, C1026Lt.a.yQ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fA extends HawkinsIcon {
        public static final fA c = new fA();

        private fA() {
            super("live-action-soundroll", Category.a, C1026Lt.a.yX, C1026Lt.a.yU, C1026Lt.a.yT, C1026Lt.a.yP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0292gc extends HawkinsIcon {
        public static final C0292gc e = new C0292gc();

        private C0292gc() {
            super("movie", Category.a, C1026Lt.a.Bt, C1026Lt.a.Bw, C1026Lt.a.Bo, C1026Lt.a.Bs, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ge  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0294ge extends HawkinsIcon {
        public static final C0294ge b = new C0294ge();

        private C0294ge() {
            super("movie-check", Category.a, C1026Lt.a.Bq, C1026Lt.a.Br, C1026Lt.a.Bk, C1026Lt.a.Bn, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0297gh extends HawkinsIcon {
        public static final C0297gh b = new C0297gh();

        private C0297gh() {
            super("movie-lock", Category.a, C1026Lt.a.Bx, C1026Lt.a.Bu, C1026Lt.a.Bv, C1026Lt.a.Bp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gU extends HawkinsIcon {
        public static final gU e = new gU();

        private gU() {
            super("pull-conform", Category.a, C1026Lt.a.EL, C1026Lt.a.EI, C1026Lt.a.EJ, C1026Lt.a.EF, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gV extends HawkinsIcon {
        public static final gV d = new gV();

        private gV() {
            super("pull-vfx", Category.a, C1026Lt.a.EO, C1026Lt.a.ET, C1026Lt.a.EM, C1026Lt.a.EP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ha  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0317ha extends HawkinsIcon {
        public static final C0317ha d = new C0317ha();

        private C0317ha() {
            super("rectangle-hexagon", Category.a, C1026Lt.a.Fi, C1026Lt.a.Fj, C1026Lt.a.Fe, C1026Lt.a.Fc, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hk  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0327hk extends HawkinsIcon {
        public static final C0327hk c = new C0327hk();

        private C0327hk() {
            super("request-title", Category.a, C1026Lt.a.FI, C1026Lt.a.FG, C1026Lt.a.FJ, C1026Lt.a.FH, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0333hq extends HawkinsIcon {
        public static final C0333hq b = new C0333hq();

        private C0333hq() {
            super("rotate-play", Category.a, C1026Lt.a.Gm, C1026Lt.a.Gj, C1026Lt.a.Gn, C1026Lt.a.Gl, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0337hu extends HawkinsIcon {
        public static final C0337hu b = new C0337hu();

        private C0337hu() {
            super(Moment.TYPE.SCENE, Category.a, C1026Lt.a.GF, C1026Lt.a.GE, C1026Lt.a.GD, C1026Lt.a.Gz, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hB extends HawkinsIcon {
        public static final hB e = new hB();

        private hB() {
            super("script", Category.a, C1026Lt.a.GW, C1026Lt.a.GV, C1026Lt.a.GT, C1026Lt.a.GS, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hD extends HawkinsIcon {
        public static final hD c = new hD();

        private hD() {
            super("series", Category.a, C1026Lt.a.Hn, C1026Lt.a.Hq, C1026Lt.a.Hm, C1026Lt.a.Hp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hI extends HawkinsIcon {
        public static final hI c = new hI();

        private hI() {
            super("shapes", Category.a, C1026Lt.a.HE, C1026Lt.a.HD, C1026Lt.a.HC, C1026Lt.a.HF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$im  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0355im extends HawkinsIcon {
        public static final C0355im c = new C0355im();

        private C0355im() {
            super("sparkles", Category.a, C1026Lt.a.JS, C1026Lt.a.JU, C1026Lt.a.JT, C1026Lt.a.JR, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iB extends HawkinsIcon {
        public static final iB d = new iB();

        private iB() {
            super("subtitle-position-bottom", Category.a, C1026Lt.a.Lu, C1026Lt.a.Lv, C1026Lt.a.Lk, C1026Lt.a.Ln, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iE extends HawkinsIcon {
        public static final iE e = new iE();

        private iE() {
            super("subtitle-position-bottom-left", Category.a, C1026Lt.a.Lr, C1026Lt.a.Lq, C1026Lt.a.Lo, C1026Lt.a.Lp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iK extends HawkinsIcon {
        public static final iK d = new iK();

        private iK() {
            super("subtitle-position-bottom-right", Category.a, C1026Lt.a.Lx, C1026Lt.a.Lw, C1026Lt.a.Lt, C1026Lt.a.Ls, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iG extends HawkinsIcon {
        public static final iG d = new iG();

        private iG() {
            super("subtitle-position-left", Category.a, C1026Lt.a.LA, C1026Lt.a.Lz, C1026Lt.a.LC, C1026Lt.a.Ly, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iH extends HawkinsIcon {
        public static final iH c = new iH();

        private iH() {
            super("subtitle-position-right", Category.a, C1026Lt.a.LH, C1026Lt.a.LF, C1026Lt.a.LG, C1026Lt.a.LB, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ji  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0378ji extends HawkinsIcon {
        public static final C0378ji e = new C0378ji();

        private C0378ji() {
            super("timeline-magnifying-glass", Category.a, C1026Lt.a.Nw, C1026Lt.a.Nv, C1026Lt.a.Ny, C1026Lt.a.Nu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jf  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0375jf extends HawkinsIcon {
        public static final C0375jf b = new C0375jf();

        private C0375jf() {
            super("timeline-magnifying-glass-zoom", Category.a, C1026Lt.a.ND, C1026Lt.a.NA, C1026Lt.a.Nz, C1026Lt.a.Nx, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0379jj extends HawkinsIcon {
        public static final C0379jj d = new C0379jj();

        private C0379jj() {
            super("top-ten", Category.a, C1026Lt.a.NH, C1026Lt.a.NL, C1026Lt.a.NG, C1026Lt.a.NI, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jP extends HawkinsIcon {
        public static final jP c = new jP();

        private jP() {
            super("vfx-plate", Category.a, C1026Lt.a.Qr, C1026Lt.a.Qt, C1026Lt.a.Qq, C1026Lt.a.Qs, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jT extends HawkinsIcon {
        public static final jT b = new jT();

        private jT() {
            super("vfx-shot", Category.a, C1026Lt.a.Qx, C1026Lt.a.Qv, C1026Lt.a.Qw, C1026Lt.a.Qu, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jV extends HawkinsIcon {
        public static final jV b = new jV();

        private jV() {
            super("video-camera", Category.a, C1026Lt.a.QC, C1026Lt.a.Qy, C1026Lt.a.Qz, C1026Lt.a.QA, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jU extends HawkinsIcon {
        public static final jU d = new jU();

        private jU() {
            super("video-resolution", Category.a, C1026Lt.a.QF, C1026Lt.a.QH, C1026Lt.a.QD, C1026Lt.a.QB, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0155b extends HawkinsIcon {
        public static final C0155b d = new C0155b();

        private C0155b() {
            super("align-object-bottom", Category.j, C1026Lt.a.q, C1026Lt.a.t, C1026Lt.a.r, C1026Lt.a.p, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0262f extends HawkinsIcon {
        public static final C0262f d = new C0262f();

        private C0262f() {
            super("align-object-horizontal-center", Category.j, C1026Lt.a.v, C1026Lt.a.y, C1026Lt.a.x, C1026Lt.a.w, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$g  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0289g extends HawkinsIcon {
        public static final C0289g c = new C0289g();

        private C0289g() {
            super("align-object-left", Category.j, C1026Lt.a.C, C1026Lt.a.D, C1026Lt.a.A, C1026Lt.a.u, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$h  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0316h extends HawkinsIcon {
        public static final C0316h b = new C0316h();

        private C0316h() {
            super("align-object-right", Category.j, C1026Lt.a.G, C1026Lt.a.F, C1026Lt.a.z, C1026Lt.a.B, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$j  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0369j extends HawkinsIcon {
        public static final C0369j d = new C0369j();

        private C0369j() {
            super("align-object-top", Category.j, C1026Lt.a.E, C1026Lt.a.M, C1026Lt.a.H, C1026Lt.a.I, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$i  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0343i extends HawkinsIcon {
        public static final C0343i e = new C0343i();

        private C0343i() {
            super("align-object-vertical-center", Category.j, C1026Lt.a.N, C1026Lt.a.f13369J, C1026Lt.a.L, C1026Lt.a.K, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$n  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0399n extends HawkinsIcon {
        public static final C0399n b = new C0399n();

        private C0399n() {
            super("align-text-bottom", Category.j, C1026Lt.a.O, C1026Lt.a.S, C1026Lt.a.Q, C1026Lt.a.R, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$o  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0400o extends HawkinsIcon {
        public static final C0400o e = new C0400o();

        private C0400o() {
            super("align-text-center", Category.j, C1026Lt.a.W, C1026Lt.a.U, C1026Lt.a.T, C1026Lt.a.P, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$m  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0398m extends HawkinsIcon {
        public static final C0398m e = new C0398m();

        private C0398m() {
            super("align-text-left", Category.j, C1026Lt.a.aa, C1026Lt.a.Y, C1026Lt.a.X, C1026Lt.a.V, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$l  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0397l extends HawkinsIcon {
        public static final C0397l b = new C0397l();

        private C0397l() {
            super("align-text-middle", Category.j, C1026Lt.a.ac, C1026Lt.a.ad, C1026Lt.a.ab, C1026Lt.a.Z, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$k  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0396k extends HawkinsIcon {
        public static final C0396k e = new C0396k();

        private C0396k() {
            super("align-text-right", Category.j, C1026Lt.a.af, C1026Lt.a.ag, C1026Lt.a.ae, C1026Lt.a.ah, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$s  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0404s extends HawkinsIcon {
        public static final C0404s e = new C0404s();

        private C0404s() {
            super("align-text-top", Category.j, C1026Lt.a.aj, C1026Lt.a.ak, C1026Lt.a.ai, C1026Lt.a.am, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class J extends HawkinsIcon {
        public static final J c = new J();

        private J() {
            super("asterisk", Category.j, C1026Lt.a.bP, C1026Lt.a.bR, C1026Lt.a.bS, C1026Lt.a.bN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class K extends HawkinsIcon {
        public static final K c = new K();

        private K() {
            super("attachment", Category.j, C1026Lt.a.cd, C1026Lt.a.bZ, C1026Lt.a.cc, C1026Lt.a.cb, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class U extends HawkinsIcon {
        public static final U e = new U();

        private U() {
            super("backspace", Category.j, C1026Lt.a.cD, C1026Lt.a.cI, C1026Lt.a.cH, C1026Lt.a.cA, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class T extends HawkinsIcon {
        public static final T e = new T();

        private T() {
            super("backspace-automirrored", Category.j, C1026Lt.a.cG, C1026Lt.a.cM, C1026Lt.a.cE, C1026Lt.a.cF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ag  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0135ag extends HawkinsIcon {
        public static final C0135ag d = new C0135ag();

        private C0135ag() {
            super("braces", Category.j, C1026Lt.a.dA, C1026Lt.a.dw, C1026Lt.a.ds, C1026Lt.a.dr, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0172bq extends HawkinsIcon {
        public static final C0172bq c = new C0172bq();

        private C0172bq() {
            super("clear-formatting", Category.j, C1026Lt.a.iv, C1026Lt.a.is, C1026Lt.a.iu, C1026Lt.a.f13371io, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ce  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0187ce extends HawkinsIcon {
        public static final C0187ce b = new C0187ce();

        private C0187ce() {
            super("cut-sequence", Category.j, C1026Lt.a.ln, C1026Lt.a.lo, C1026Lt.a.ll, C1026Lt.a.lp, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0222dm extends HawkinsIcon {
        public static final C0222dm e = new C0222dm();

        private C0222dm() {
            super("eyedropper", Category.j, C1026Lt.a.pY, C1026Lt.a.pX, C1026Lt.a.qa, C1026Lt.a.pZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$du  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0229du extends HawkinsIcon {
        public static final C0229du e = new C0229du();

        private C0229du() {
            super("filter", Category.j, C1026Lt.a.qz, C1026Lt.a.qx, C1026Lt.a.qw, C1026Lt.a.qt, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eQ extends HawkinsIcon {
        public static final eQ d = new eQ();

        private eQ() {
            super("image", Category.j, C1026Lt.a.wn, C1026Lt.a.wk, C1026Lt.a.wm, C1026Lt.a.wi, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0278fp extends HawkinsIcon {
        public static final C0278fp b = new C0278fp();

        private C0278fp() {
            super("link", Category.j, C1026Lt.a.yj, C1026Lt.a.yg, C1026Lt.a.xW, C1026Lt.a.xV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0279fq extends HawkinsIcon {
        public static final C0279fq c = new C0279fq();

        private C0279fq() {
            super("list", Category.j, C1026Lt.a.yN, C1026Lt.a.yL, C1026Lt.a.yz, C1026Lt.a.yy, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0283fu extends HawkinsIcon {
        public static final C0283fu e = new C0283fu();

        private C0283fu() {
            super("list-bullets", Category.j, C1026Lt.a.yt, C1026Lt.a.ys, C1026Lt.a.ym, C1026Lt.a.yo, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0285fw extends HawkinsIcon {
        public static final C0285fw e = new C0285fw();

        private C0285fw() {
            super("list-bullets-automirrored", Category.j, C1026Lt.a.yq, C1026Lt.a.yr, C1026Lt.a.yp, C1026Lt.a.yl, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fs  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0281fs extends HawkinsIcon {
        public static final C0281fs d = new C0281fs();

        private C0281fs() {
            super("list-checkmark", Category.j, C1026Lt.a.yw, C1026Lt.a.yv, C1026Lt.a.yx, C1026Lt.a.yu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ft  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0282ft extends HawkinsIcon {
        public static final C0282ft d = new C0282ft();

        private C0282ft() {
            super("list-numbered", Category.j, C1026Lt.a.yD, C1026Lt.a.yB, C1026Lt.a.yA, C1026Lt.a.yC, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0284fv extends HawkinsIcon {
        public static final C0284fv e = new C0284fv();

        private C0284fv() {
            super("list-plus", Category.j, C1026Lt.a.yG, C1026Lt.a.yK, C1026Lt.a.yE, C1026Lt.a.yH, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0286fx extends HawkinsIcon {
        public static final C0286fx d = new C0286fx();

        private C0286fx() {
            super("list-plus-automirrored", Category.j, C1026Lt.a.yM, C1026Lt.a.yJ, C1026Lt.a.yI, C1026Lt.a.yF, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fO extends HawkinsIcon {
        public static final fO d = new fO();

        private fO() {
            super("marker", Category.j, C1026Lt.a.zU, C1026Lt.a.zV, C1026Lt.a.zR, C1026Lt.a.zT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0314gy extends HawkinsIcon {
        public static final C0314gy b = new C0314gy();

        private C0314gy() {
            super("pencil", Category.j, C1026Lt.a.CV, C1026Lt.a.CW, C1026Lt.a.CT, C1026Lt.a.CU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gD extends HawkinsIcon {
        public static final gD e = new gD();

        private gD() {
            super("pencil-automirrored", Category.j, C1026Lt.a.CY, C1026Lt.a.CX, C1026Lt.a.CZ, C1026Lt.a.CS, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0318hb extends HawkinsIcon {
        public static final C0318hb c = new C0318hb();

        private C0318hb() {
            super("quote", Category.j, C1026Lt.a.EW, C1026Lt.a.Fd, C1026Lt.a.EZ, C1026Lt.a.EX, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0320hd extends HawkinsIcon {
        public static final C0320hd e = new C0320hd();

        private C0320hd() {
            super("quote-automirrored", Category.j, C1026Lt.a.Ff, C1026Lt.a.Fb, C1026Lt.a.Fa, C1026Lt.a.EY, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hX extends HawkinsIcon {
        public static final hX c = new hX();

        private hX() {
            super("sliders", Category.j, C1026Lt.a.IV, C1026Lt.a.IT, C1026Lt.a.IW, C1026Lt.a.IR, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$il  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0354il extends HawkinsIcon {
        public static final C0354il e = new C0354il();

        private C0354il() {
            super("space", Category.j, C1026Lt.a.JM, C1026Lt.a.JP, C1026Lt.a.JJ, C1026Lt.a.JH, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iT extends HawkinsIcon {
        public static final iT c = new iT();

        private iT() {
            super("text", Category.j, C1026Lt.a.Mw, C1026Lt.a.MF, C1026Lt.a.Mu, C1026Lt.a.Mq, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iQ extends HawkinsIcon {
        public static final iQ d = new iQ();

        private iQ() {
            super("text-bold", Category.j, C1026Lt.a.Ml, C1026Lt.a.Mh, C1026Lt.a.Mi, C1026Lt.a.Mj, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iR extends HawkinsIcon {
        public static final iR e = new iR();

        private iR() {
            super("text-italic", Category.j, C1026Lt.a.Mp, C1026Lt.a.Mn, C1026Lt.a.Mo, C1026Lt.a.Mm, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iS extends HawkinsIcon {
        public static final iS e = new iS();

        private iS() {
            super("text-line-height", Category.j, C1026Lt.a.Mr, C1026Lt.a.Mv, C1026Lt.a.Ms, C1026Lt.a.Mt, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iU extends HawkinsIcon {
        public static final iU d = new iU();

        private iU() {
            super("text-shadow", Category.j, C1026Lt.a.Mx, C1026Lt.a.MA, C1026Lt.a.My, C1026Lt.a.Mz, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iX extends HawkinsIcon {
        public static final iX d = new iX();

        private iX() {
            super("text-strikethrough", Category.j, C1026Lt.a.MC, C1026Lt.a.MD, C1026Lt.a.ME, C1026Lt.a.MB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iZ extends HawkinsIcon {
        public static final iZ e = new iZ();

        private iZ() {
            super("text-tracking", Category.j, C1026Lt.a.MI, C1026Lt.a.MH, C1026Lt.a.MK, C1026Lt.a.MG, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iY extends HawkinsIcon {
        public static final iY c = new iY();

        private iY() {
            super("text-underline", Category.j, C1026Lt.a.ML, C1026Lt.a.MO, C1026Lt.a.MN, C1026Lt.a.MJ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0382jm extends HawkinsIcon {
        public static final C0382jm c = new C0382jm();

        private C0382jm() {
            super("trash-can", Category.j, C1026Lt.a.NW, C1026Lt.a.NU, C1026Lt.a.NV, C1026Lt.a.NR, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jk  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0380jk extends HawkinsIcon {
        public static final C0380jk d = new C0380jk();

        private C0380jk() {
            super("trash-can-gear", Category.j, C1026Lt.a.NQ, C1026Lt.a.NS, C1026Lt.a.NP, C1026Lt.a.NO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class S extends HawkinsIcon {
        public static final S c = new S();

        private S() {
            super("audio-description", Category.g, C1026Lt.a.ck, C1026Lt.a.cl, C1026Lt.a.cj, C1026Lt.a.cf, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class R extends HawkinsIcon {
        public static final R b = new R();

        private R() {
            super("back-10", Category.g, C1026Lt.a.co, C1026Lt.a.cq, C1026Lt.a.cm, C1026Lt.a.cn, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Q extends HawkinsIcon {
        public static final Q d = new Q();

        private Q() {
            super("back-30", Category.g, C1026Lt.a.cp, C1026Lt.a.cx, C1026Lt.a.cs, C1026Lt.a.cr, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ay  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0153ay extends HawkinsIcon {
        public static final C0153ay b = new C0153ay();

        private C0153ay() {
            super("camera", Category.g, C1026Lt.a.fa, C1026Lt.a.fe, C1026Lt.a.fc, C1026Lt.a.eY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0179bx extends HawkinsIcon {
        public static final C0179bx e = new C0179bx();

        private C0179bx() {
            super("closed-captions", Category.g, C1026Lt.a.iS, C1026Lt.a.iU, C1026Lt.a.iN, C1026Lt.a.iM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cJ extends HawkinsIcon {
        public static final cJ e = new cJ();

        private cJ() {
            super("dolby-atmos", Category.g, C1026Lt.a.nP, C1026Lt.a.nO, C1026Lt.a.nL, C1026Lt.a.nI, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cM extends HawkinsIcon {
        public static final cM e = new cM();

        private cM() {
            super("dolby-vision", Category.g, C1026Lt.a.nS, C1026Lt.a.nV, C1026Lt.a.nQ, C1026Lt.a.nT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0224dp extends HawkinsIcon {
        public static final C0224dp e = new C0224dp();

        private C0224dp() {
            super("fast-forward", Category.g, C1026Lt.a.qi, C1026Lt.a.qk, C1026Lt.a.qe, C1026Lt.a.qc, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$do  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class Cdo extends HawkinsIcon {
        public static final Cdo e = new Cdo();

        private Cdo() {
            super("fast-rewind", Category.g, C1026Lt.a.qj, C1026Lt.a.qp, C1026Lt.a.qh, C1026Lt.a.qg, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dB extends HawkinsIcon {
        public static final dB d = new dB();

        private dB() {
            super("force-narrative", Category.g, C1026Lt.a.rr, C1026Lt.a.rs, C1026Lt.a.rj, C1026Lt.a.rn, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dK extends HawkinsIcon {
        public static final dK e = new dK();

        private dK() {
            super("forward-10", Category.g, C1026Lt.a.ru, C1026Lt.a.rt, C1026Lt.a.rw, C1026Lt.a.rx, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dG extends HawkinsIcon {
        public static final dG b = new dG();

        private dG() {
            super("forward-30", Category.g, C1026Lt.a.rA, C1026Lt.a.ry, C1026Lt.a.rz, C1026Lt.a.rB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dJ extends HawkinsIcon {
        public static final dJ e = new dJ();

        private dJ() {
            super("fullscreen-enter", Category.g, C1026Lt.a.rM, C1026Lt.a.rL, C1026Lt.a.rH, C1026Lt.a.rG, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dI extends HawkinsIcon {
        public static final dI e = new dI();

        private dI() {
            super("fullscreen-exit", Category.g, C1026Lt.a.rK, C1026Lt.a.rR, C1026Lt.a.rI, C1026Lt.a.rJ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ex  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0259ex extends HawkinsIcon {
        public static final C0259ex e = new C0259ex();

        private C0259ex() {
            super("hdr", Category.g, C1026Lt.a.uP, C1026Lt.a.uT, C1026Lt.a.uN, C1026Lt.a.uO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fC extends HawkinsIcon {
        public static final fC b = new fC();

        private fC() {
            super("loop", Category.g, C1026Lt.a.zk, C1026Lt.a.zl, C1026Lt.a.zh, C1026Lt.a.zd, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fD extends HawkinsIcon {
        public static final fD b = new fD();

        private fD() {
            super("loop-play", Category.g, C1026Lt.a.zm, C1026Lt.a.zj, C1026Lt.a.ze, C1026Lt.a.zg, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fF extends HawkinsIcon {
        public static final fF e = new fF();

        private fF() {
            super("loop-subtitles", Category.g, C1026Lt.a.zn, C1026Lt.a.zr, C1026Lt.a.zo, C1026Lt.a.zi, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0305gp extends HawkinsIcon {
        public static final C0305gp e = new C0305gp();

        private C0305gp() {
            super("next-episode", Category.g, C1026Lt.a.Cg, C1026Lt.a.Cc, C1026Lt.a.Cb, C1026Lt.a.Ca, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$go  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0304go extends HawkinsIcon {
        public static final C0304go c = new C0304go();

        private C0304go() {
            super("next-episode-fill", Category.g, C1026Lt.a.BX, C1026Lt.a.BZ, C1026Lt.a.BY, C1026Lt.a.BW, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0302gm extends HawkinsIcon {
        public static final C0302gm d = new C0302gm();

        private C0302gm() {
            super("next-frame", Category.g, C1026Lt.a.Ce, C1026Lt.a.Ch, C1026Lt.a.Cf, C1026Lt.a.Cd, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0312gw extends HawkinsIcon {
        public static final C0312gw c = new C0312gw();

        private C0312gw() {
            super("pause", Category.g, C1026Lt.a.CO, C1026Lt.a.CL, C1026Lt.a.CN, C1026Lt.a.CK, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gG extends HawkinsIcon {
        public static final gG e = new gG();

        private gG() {
            super("play", Category.g, C1026Lt.a.DN, C1026Lt.a.DK, C1026Lt.a.DL, C1026Lt.a.DJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gF extends HawkinsIcon {
        public static final gF b = new gF();

        private gF() {
            super("play-circle", Category.g, C1026Lt.a.DD, C1026Lt.a.DA, C1026Lt.a.Dz, C1026Lt.a.Du, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gH extends HawkinsIcon {
        public static final gH c = new gH();

        private gH() {
            super("play-from-beginning", Category.g, C1026Lt.a.DE, C1026Lt.a.DH, C1026Lt.a.DB, C1026Lt.a.DC, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gK extends HawkinsIcon {
        public static final gK c = new gK();

        private gK() {
            super("play-in-to-out", Category.g, C1026Lt.a.DG, C1026Lt.a.DM, C1026Lt.a.DI, C1026Lt.a.DF, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gR extends HawkinsIcon {
        public static final gR e = new gR();

        private gR() {
            super("preview", Category.g, C1026Lt.a.Ee, C1026Lt.a.Ed, C1026Lt.a.Eh, C1026Lt.a.Ef, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gQ extends HawkinsIcon {
        public static final gQ e = new gQ();

        private gQ() {
            super("previous-episode", Category.g, C1026Lt.a.Ei, C1026Lt.a.Ek, C1026Lt.a.El, C1026Lt.a.Em, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gP extends HawkinsIcon {
        public static final gP b = new gP();

        private gP() {
            super("previous-frame", Category.g, C1026Lt.a.En, C1026Lt.a.Ep, C1026Lt.a.Er, C1026Lt.a.Ej, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0329hm extends HawkinsIcon {
        public static final C0329hm d = new C0329hm();

        private C0329hm() {
            super("resolution-4k", Category.g, C1026Lt.a.FM, C1026Lt.a.FO, C1026Lt.a.FK, C1026Lt.a.FN, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0326hj extends HawkinsIcon {
        public static final C0326hj b = new C0326hj();

        private C0326hj() {
            super("resolution-hd", Category.g, C1026Lt.a.FS, C1026Lt.a.FT, C1026Lt.a.FQ, C1026Lt.a.FL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0328hl extends HawkinsIcon {
        public static final C0328hl e = new C0328hl();

        private C0328hl() {
            super("resolution-sd", Category.g, C1026Lt.a.FU, C1026Lt.a.FY, C1026Lt.a.FR, C1026Lt.a.FP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0341hy extends HawkinsIcon {
        public static final C0341hy c = new C0341hy();

        private C0341hy() {
            super("sdr", Category.g, C1026Lt.a.GX, C1026Lt.a.GZ, C1026Lt.a.GY, C1026Lt.a.GU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hC extends HawkinsIcon {
        public static final hC b = new hC();

        private hC() {
            super("seek-back", Category.g, C1026Lt.a.Hc, C1026Lt.a.Hd, C1026Lt.a.Hb, C1026Lt.a.Ha, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0342hz extends HawkinsIcon {
        public static final C0342hz e = new C0342hz();

        private C0342hz() {
            super("seek-forward", Category.g, C1026Lt.a.Hf, C1026Lt.a.Hj, C1026Lt.a.Hg, C1026Lt.a.He, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hF extends HawkinsIcon {
        public static final hF b = new hF();

        private hF() {
            super("set-in", Category.g, C1026Lt.a.Hs, C1026Lt.a.Hr, C1026Lt.a.Hv, C1026Lt.a.Ho, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hG extends HawkinsIcon {
        public static final hG b = new hG();

        private hG() {
            super("set-out", Category.g, C1026Lt.a.Hw, C1026Lt.a.Hz, C1026Lt.a.Hu, C1026Lt.a.Ht, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hW extends HawkinsIcon {
        public static final hW c = new hW();

        private hW() {
            super("skip-credits", Category.g, C1026Lt.a.II, C1026Lt.a.IJ, C1026Lt.a.IG, C1026Lt.a.IF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$iy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0367iy extends HawkinsIcon {
        public static final C0367iy d = new C0367iy();

        private C0367iy() {
            super("stop", Category.g, C1026Lt.a.KN, C1026Lt.a.KO, C1026Lt.a.KM, C1026Lt.a.KL, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iI extends HawkinsIcon {
        public static final iI c = new iI();

        private iI() {
            super("subtitles", Category.g, C1026Lt.a.LL, C1026Lt.a.LR, C1026Lt.a.LD, C1026Lt.a.LE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iJ extends HawkinsIcon {
        public static final iJ c = new iJ();

        private iJ() {
            super("subtitles-pencil", Category.g, C1026Lt.a.LJ, C1026Lt.a.LK, C1026Lt.a.LI, C1026Lt.a.LM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iL extends HawkinsIcon {
        public static final iL b = new iL();

        private iL() {
            super("subtitles-x", Category.g, C1026Lt.a.LP, C1026Lt.a.LO, C1026Lt.a.LQ, C1026Lt.a.LN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iN extends HawkinsIcon {
        public static final iN d = new iN();

        private iN() {
            super("surround-sound-2-1", Category.g, C1026Lt.a.LU, C1026Lt.a.LS, C1026Lt.a.LV, C1026Lt.a.LT, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iP extends HawkinsIcon {
        public static final iP c = new iP();

        private iP() {
            super("surround-sound-5-1", Category.g, C1026Lt.a.LY, C1026Lt.a.Mb, C1026Lt.a.Ma, C1026Lt.a.LW, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jX extends HawkinsIcon {
        public static final jX c = new jX();

        private jX() {
            super("volume-high", Category.g, C1026Lt.a.QM, C1026Lt.a.QJ, C1026Lt.a.QE, C1026Lt.a.QG, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jW extends HawkinsIcon {
        public static final jW e = new jW();

        private jW() {
            super("volume-low", Category.g, C1026Lt.a.QI, C1026Lt.a.QR, C1026Lt.a.QK, C1026Lt.a.QL, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ka extends HawkinsIcon {
        public static final ka c = new ka();

        private ka() {
            super("volume-medium", Category.g, C1026Lt.a.QQ, C1026Lt.a.QO, C1026Lt.a.QN, C1026Lt.a.QP, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kc extends HawkinsIcon {
        public static final kc b = new kc();

        private kc() {
            super("volume-off", Category.g, C1026Lt.a.QU, C1026Lt.a.QS, C1026Lt.a.QW, C1026Lt.a.QV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$u  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0406u extends HawkinsIcon {
        public static final C0406u c = new C0406u();

        private C0406u() {
            super("apps", Category.i, C1026Lt.a.aD, C1026Lt.a.aC, C1026Lt.a.aG, C1026Lt.a.aE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$y  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0410y extends HawkinsIcon {
        public static final C0410y c = new C0410y();

        private C0410y() {
            super("arrow-down", Category.i, C1026Lt.a.aH, C1026Lt.a.aI, C1026Lt.a.aJ, C1026Lt.a.aF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$w  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0408w extends HawkinsIcon {
        public static final C0408w b = new C0408w();

        private C0408w() {
            super("arrow-left", Category.i, C1026Lt.a.aS, C1026Lt.a.aT, C1026Lt.a.aO, C1026Lt.a.aK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$v  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0407v extends HawkinsIcon {
        public static final C0407v b = new C0407v();

        private C0407v() {
            super("arrow-left-automirrored", Category.i, C1026Lt.a.aR, C1026Lt.a.aV, C1026Lt.a.aM, C1026Lt.a.aL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$x  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0409x extends HawkinsIcon {
        public static final C0409x c = new C0409x();

        private C0409x() {
            super("arrow-left-right", Category.i, C1026Lt.a.aN, C1026Lt.a.aU, C1026Lt.a.aP, C1026Lt.a.aQ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class D extends HawkinsIcon {
        public static final D d = new D();

        private D() {
            super("arrow-right", Category.i, C1026Lt.a.ba, C1026Lt.a.bd, C1026Lt.a.aZ, C1026Lt.a.aX, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class B extends HawkinsIcon {
        public static final B c = new B();

        private B() {
            super("arrow-right-automirrored", Category.i, C1026Lt.a.be, C1026Lt.a.bf, C1026Lt.a.aY, C1026Lt.a.aW, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$z  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0411z extends HawkinsIcon {
        public static final C0411z c = new C0411z();

        private C0411z() {
            super("arrow-up", Category.i, C1026Lt.a.bl, C1026Lt.a.bn, C1026Lt.a.bp, C1026Lt.a.bo, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class C extends HawkinsIcon {
        public static final C e = new C();

        private C() {
            super("arrow-up-down", Category.i, C1026Lt.a.bk, C1026Lt.a.bm, C1026Lt.a.bg, C1026Lt.a.bj, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class O extends HawkinsIcon {
        public static final O b = new O();

        private O() {
            super("back", Category.i, C1026Lt.a.cz, C1026Lt.a.cC, C1026Lt.a.cu, C1026Lt.a.cv, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class W extends HawkinsIcon {
        public static final W c = new W();

        private W() {
            super("back-automirrored", Category.i, C1026Lt.a.cB, C1026Lt.a.cy, C1026Lt.a.ct, C1026Lt.a.cw, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aF extends HawkinsIcon {
        public static final aF e = new aF();

        private aF() {
            super("caret-down", Category.i, C1026Lt.a.fk, C1026Lt.a.fj, C1026Lt.a.fm, C1026Lt.a.fl, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aD extends HawkinsIcon {
        public static final aD b = new aD();

        private aD() {
            super("caret-left", Category.i, C1026Lt.a.fp, C1026Lt.a.fu, C1026Lt.a.fr, C1026Lt.a.f13370fi, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aC extends HawkinsIcon {
        public static final aC b = new aC();

        private aC() {
            super("caret-left-automirrored", Category.i, C1026Lt.a.fq, C1026Lt.a.fv, C1026Lt.a.fn, C1026Lt.a.fo, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aG extends HawkinsIcon {
        public static final aG d = new aG();

        private aG() {
            super("caret-right", Category.i, C1026Lt.a.fx, C1026Lt.a.fy, C1026Lt.a.fs, C1026Lt.a.fw, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aE extends HawkinsIcon {
        public static final aE c = new aE();

        private aE() {
            super("caret-right-automirrored", Category.i, C1026Lt.a.fA, C1026Lt.a.fB, C1026Lt.a.fz, C1026Lt.a.ft, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aK extends HawkinsIcon {
        public static final aK b = new aK();

        private aK() {
            super("caret-up", Category.i, C1026Lt.a.fD, C1026Lt.a.fG, C1026Lt.a.fC, C1026Lt.a.fF, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aO extends HawkinsIcon {
        public static final aO e = new aO();

        private aO() {
            super("chevron-down", Category.i, C1026Lt.a.gk, C1026Lt.a.gl, C1026Lt.a.gj, C1026Lt.a.gg, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aQ extends HawkinsIcon {
        public static final aQ e = new aQ();

        private aQ() {
            super("chevron-left", Category.i, C1026Lt.a.gu, C1026Lt.a.gq, C1026Lt.a.gn, C1026Lt.a.gp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aS extends HawkinsIcon {
        public static final aS c = new aS();

        private aS() {
            super("chevron-left-automirrored", Category.i, C1026Lt.a.gs, C1026Lt.a.gt, C1026Lt.a.go, C1026Lt.a.gm, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aT extends HawkinsIcon {
        public static final aT e = new aT();

        private aT() {
            super("chevron-right", Category.i, C1026Lt.a.gx, C1026Lt.a.gC, C1026Lt.a.gy, C1026Lt.a.gr, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aR extends HawkinsIcon {
        public static final aR d = new aR();

        private aR() {
            super("chevron-right-automirrored", Category.i, C1026Lt.a.gz, C1026Lt.a.gB, C1026Lt.a.gw, C1026Lt.a.gv, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aV extends HawkinsIcon {
        public static final aV c = new aV();

        private aV() {
            super("chevron-up", Category.i, C1026Lt.a.gA, C1026Lt.a.gG, C1026Lt.a.gD, C1026Lt.a.gE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aW extends HawkinsIcon {
        public static final aW e = new aW();

        private aW() {
            super("circle", Category.i, C1026Lt.a.f33if, C1026Lt.a.ig, C1026Lt.a.hl, C1026Lt.a.hj, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bf  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0161bf extends HawkinsIcon {
        public static final C0161bf c = new C0161bf();

        private C0161bf() {
            super("circle-fill", Category.i, C1026Lt.a.hd, C1026Lt.a.gZ, C1026Lt.a.ha, C1026Lt.a.hc, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0163bh extends HawkinsIcon {
        public static final C0163bh d = new C0163bh();

        private C0163bh() {
            super("circle-plus", Category.i, C1026Lt.a.hI, C1026Lt.a.hJ, C1026Lt.a.hM, C1026Lt.a.hL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0165bj extends HawkinsIcon {
        public static final C0165bj b = new C0165bj();

        private C0165bj() {
            super("circle-plus-fill", Category.i, C1026Lt.a.hF, C1026Lt.a.hG, C1026Lt.a.hD, C1026Lt.a.hE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0167bl extends HawkinsIcon {
        public static final C0167bl d = new C0167bl();

        private C0167bl() {
            super("circle-selected", Category.i, C1026Lt.a.hT, C1026Lt.a.hX, C1026Lt.a.hS, C1026Lt.a.hW, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0185cc extends HawkinsIcon {
        public static final C0185cc d = new C0185cc();

        private C0185cc() {
            super("cursor", Category.i, C1026Lt.a.le, C1026Lt.a.ld, C1026Lt.a.kX, C1026Lt.a.kY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0186cd extends HawkinsIcon {
        public static final C0186cd e = new C0186cd();

        private C0186cd() {
            super("cursor-fill", Category.i, C1026Lt.a.kR, C1026Lt.a.kT, C1026Lt.a.kU, C1026Lt.a.kV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0184cb extends HawkinsIcon {
        public static final C0184cb d = new C0184cb();

        private C0184cb() {
            super("cursor-mouse", Category.i, C1026Lt.a.kW, C1026Lt.a.lf, C1026Lt.a.kZ, C1026Lt.a.la, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cS extends HawkinsIcon {
        public static final cS c = new cS();

        private cS() {
            super("dpad-fill", Category.i, C1026Lt.a.oy, C1026Lt.a.ox, C1026Lt.a.ou, C1026Lt.a.ow, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dH extends HawkinsIcon {
        public static final dH b = new dH();

        private dH() {
            super("forward", Category.i, C1026Lt.a.rD, C1026Lt.a.rF, C1026Lt.a.rE, C1026Lt.a.rC, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$es  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0254es extends HawkinsIcon {
        public static final C0254es e = new C0254es();

        private C0254es() {
            super("hand-touch", Category.i, C1026Lt.a.uw, C1026Lt.a.uz, C1026Lt.a.us, C1026Lt.a.ut, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eJ extends HawkinsIcon {
        public static final eJ c = new eJ();

        private eJ() {
            super("home", Category.i, C1026Lt.a.vR, C1026Lt.a.vP, C1026Lt.a.vT, C1026Lt.a.vM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eM extends HawkinsIcon {
        public static final eM c = new eM();

        private eM() {
            super("home-fill", Category.i, C1026Lt.a.vK, C1026Lt.a.vO, C1026Lt.a.vN, C1026Lt.a.vL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0270fh extends HawkinsIcon {
        public static final C0270fh c = new C0270fh();

        private C0270fh() {
            super("layout", Category.i, C1026Lt.a.xA, C1026Lt.a.xD, C1026Lt.a.xw, C1026Lt.a.xy, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fr  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0280fr extends HawkinsIcon {
        public static final C0280fr c = new C0280fr();

        private C0280fr() {
            super("link-out", Category.i, C1026Lt.a.yb, C1026Lt.a.ya, C1026Lt.a.yc, C1026Lt.a.xY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0276fn extends HawkinsIcon {
        public static final C0276fn d = new C0276fn();

        private C0276fn() {
            super("link-out-automirrored", Category.i, C1026Lt.a.yd, C1026Lt.a.yi, C1026Lt.a.ye, C1026Lt.a.xX, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0287fy extends HawkinsIcon {
        public static final C0287fy d = new C0287fy();

        private C0287fy() {
            super("location", Category.i, C1026Lt.a.yZ, C1026Lt.a.zb, C1026Lt.a.yW, C1026Lt.a.yV, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fV extends HawkinsIcon {
        public static final fV c = new fV();

        private fV() {
            super("menu", Category.i, C1026Lt.a.AE, C1026Lt.a.AF, C1026Lt.a.AB, C1026Lt.a.AC, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0291gb extends HawkinsIcon {
        public static final C0291gb e = new C0291gb();

        private C0291gb() {
            super("more-horizontal", Category.i, C1026Lt.a.Bf, C1026Lt.a.Bh, C1026Lt.a.Bi, C1026Lt.a.Be, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0293gd extends HawkinsIcon {
        public static final C0293gd b = new C0293gd();

        private C0293gd() {
            super("more-vertical", Category.i, C1026Lt.a.Bl, C1026Lt.a.Bm, C1026Lt.a.Bj, C1026Lt.a.Bg, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gk  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0300gk extends HawkinsIcon {
        public static final C0300gk c = new C0300gk();

        private C0300gk() {
            super("my-plan", Category.i, C1026Lt.a.BK, C1026Lt.a.BJ, C1026Lt.a.BL, C1026Lt.a.BF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0296gg extends HawkinsIcon {
        public static final C0296gg d = new C0296gg();

        private C0296gg() {
            super("my-plan-automirrored", Category.i, C1026Lt.a.BI, C1026Lt.a.BO, C1026Lt.a.BM, C1026Lt.a.BG, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0313gx extends HawkinsIcon {
        public static final C0313gx d = new C0313gx();

        private C0313gx() {
            super("pan", Category.i, C1026Lt.a.CF, C1026Lt.a.CD, C1026Lt.a.CC, C1026Lt.a.CB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gO extends HawkinsIcon {
        public static final gO b = new gO();

        private gO() {
            super("plus", Category.i, C1026Lt.a.DQ, C1026Lt.a.DS, C1026Lt.a.DO, C1026Lt.a.DR, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gN extends HawkinsIcon {
        public static final gN e = new gN();

        private gN() {
            super("popcorn", Category.i, C1026Lt.a.Eb, C1026Lt.a.DY, C1026Lt.a.DX, C1026Lt.a.DV, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gL extends HawkinsIcon {
        public static final gL c = new gL();

        private gL() {
            super("popcorn-fill", Category.i, C1026Lt.a.DW, C1026Lt.a.DU, C1026Lt.a.DT, C1026Lt.a.DP, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hE extends HawkinsIcon {
        public static final hE b = new hE();

        private hE() {
            super("settings", Category.i, C1026Lt.a.HA, C1026Lt.a.HB, C1026Lt.a.Hx, C1026Lt.a.Hy, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$in  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0356in extends HawkinsIcon {
        public static final C0356in b = new C0356in();

        private C0356in() {
            super("square", Category.i, C1026Lt.a.Kv, C1026Lt.a.Kz, C1026Lt.a.Kp, C1026Lt.a.Ko, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ir  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0360ir extends HawkinsIcon {
        public static final C0360ir c = new C0360ir();

        private C0360ir() {
            super("square-checkmark-fill", Category.i, C1026Lt.a.Kg, C1026Lt.a.Kl, C1026Lt.a.Kk, C1026Lt.a.Kj, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$it  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0362it extends HawkinsIcon {
        public static final C0362it b = new C0362it();

        private C0362it() {
            super("square-minus-fill", Category.i, C1026Lt.a.Kq, C1026Lt.a.Kr, C1026Lt.a.Km, C1026Lt.a.Kn, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jo  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0384jo extends HawkinsIcon {
        public static final C0384jo c = new C0384jo();

        private C0384jo() {
            super("triangle", Category.i, C1026Lt.a.Oi, C1026Lt.a.Ol, C1026Lt.a.Ok, C1026Lt.a.Oj, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0383jn extends HawkinsIcon {
        public static final C0383jn b = new C0383jn();

        private C0383jn() {
            super("triangle-down", Category.i, C1026Lt.a.Ob, C1026Lt.a.Og, C1026Lt.a.Oa, C1026Lt.a.NY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0386jq extends HawkinsIcon {
        public static final C0386jq d = new C0386jq();

        private C0386jq() {
            super("triangle-down-fill", Category.i, C1026Lt.a.NZ, C1026Lt.a.Oc, C1026Lt.a.NX, C1026Lt.a.NT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jt  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0389jt extends HawkinsIcon {
        public static final C0389jt b = new C0389jt();

        private C0389jt() {
            super("triangle-fill", Category.i, C1026Lt.a.Oh, C1026Lt.a.Oe, C1026Lt.a.Of, C1026Lt.a.Od, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kk extends HawkinsIcon {
        public static final kk e = new kk();

        private kk() {
            super(InteractiveAnimation.ANIMATION_TYPE.X, Category.i, C1026Lt.a.RB, C1026Lt.a.RC, C1026Lt.a.RF, C1026Lt.a.RD, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class M extends HawkinsIcon {
        public static final M d = new M();

        private M() {
            super("atom", Category.h, C1026Lt.a.bY, C1026Lt.a.ca, C1026Lt.a.bU, C1026Lt.a.bV, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Z extends HawkinsIcon {
        public static final Z d = new Z();

        private Z() {
            super("book", Category.h, C1026Lt.a.di, C1026Lt.a.dj, C1026Lt.a.dk, C1026Lt.a.dl, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$af  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0134af extends HawkinsIcon {
        public static final C0134af e = new C0134af();

        private C0134af() {
            super("brain", Category.h, C1026Lt.a.dz, C1026Lt.a.dD, C1026Lt.a.dx, C1026Lt.a.dy, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$an  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0142an extends HawkinsIcon {
        public static final C0142an d = new C0142an();

        private C0142an() {
            super("bullseye", Category.h, C1026Lt.a.et, C1026Lt.a.er, C1026Lt.a.ep, C1026Lt.a.es, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aM extends HawkinsIcon {
        public static final aM b = new aM();

        private aM() {
            super("chef-hat", Category.h, C1026Lt.a.gh, C1026Lt.a.gi, C1026Lt.a.gc, C1026Lt.a.gf, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bW extends HawkinsIcon {
        public static final bW b = new bW();

        private bW() {
            super("crystal-ball", Category.h, C1026Lt.a.kM, C1026Lt.a.kS, C1026Lt.a.kO, C1026Lt.a.kN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cY extends HawkinsIcon {
        public static final cY b = new cY();

        private cY() {
            super("employee-badge", Category.h, C1026Lt.a.oS, C1026Lt.a.oR, C1026Lt.a.oP, C1026Lt.a.oQ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dC extends HawkinsIcon {
        public static final dC b = new dC();

        private dC() {
            super("fork-knife", Category.h, C1026Lt.a.rp, C1026Lt.a.rv, C1026Lt.a.rq, C1026Lt.a.ro, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eY extends HawkinsIcon {
        public static final eY e = new eY();

        private eY() {
            super("lab-flask", Category.h, C1026Lt.a.xf, C1026Lt.a.xl, C1026Lt.a.xd, C1026Lt.a.xe, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fk  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0273fk extends HawkinsIcon {
        public static final C0273fk c = new C0273fk();

        private C0273fk() {
            super("lightbulb", Category.h, C1026Lt.a.xF, C1026Lt.a.xE, C1026Lt.a.xB, C1026Lt.a.xC, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fJ extends HawkinsIcon {
        public static final fJ c = new fJ();

        private fJ() {
            super("mantis", Category.h, C1026Lt.a.zM, C1026Lt.a.zN, C1026Lt.a.zL, C1026Lt.a.zK, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fM extends HawkinsIcon {
        public static final fM b = new fM();

        private fM() {
            super("mask", Category.h, C1026Lt.a.Ab, C1026Lt.a.Ac, C1026Lt.a.Af, C1026Lt.a.zY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0299gj extends HawkinsIcon {
        public static final C0299gj d = new C0299gj();

        private C0299gj() {
            super("music", Category.h, C1026Lt.a.BH, C1026Lt.a.BE, C1026Lt.a.BD, C1026Lt.a.By, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0310gu extends HawkinsIcon {
        public static final C0310gu d = new C0310gu();

        private C0310gu() {
            super("paint-palette", Category.h, C1026Lt.a.Cv, C1026Lt.a.Cu, C1026Lt.a.Cr, C1026Lt.a.Cq, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gt  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0309gt extends HawkinsIcon {
        public static final C0309gt e = new C0309gt();

        private C0309gt() {
            super("paintbrush", Category.h, C1026Lt.a.Cw, C1026Lt.a.Cz, C1026Lt.a.Ct, C1026Lt.a.Cs, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0315gz extends HawkinsIcon {
        public static final C0315gz d = new C0315gz();

        private C0315gz() {
            super("pen", Category.h, C1026Lt.a.CR, C1026Lt.a.CQ, C1026Lt.a.CP, C1026Lt.a.CM, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0330hn extends HawkinsIcon {
        public static final C0330hn d = new C0330hn();

        private C0330hn() {
            super("ribbon", Category.h, C1026Lt.a.FV, C1026Lt.a.Gb, C1026Lt.a.FX, C1026Lt.a.FW, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hs  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0335hs extends HawkinsIcon {
        public static final C0335hs d = new C0335hs();

        private C0335hs() {
            super("rocketship", Category.h, C1026Lt.a.Gf, C1026Lt.a.Gh, C1026Lt.a.Gg, C1026Lt.a.Gi, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hZ extends HawkinsIcon {
        public static final hZ d = new hZ();

        private hZ() {
            super("skull", Category.h, C1026Lt.a.IK, C1026Lt.a.IN, C1026Lt.a.IM, C1026Lt.a.IL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$js  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0388js extends HawkinsIcon {
        public static final C0388js d = new C0388js();

        private C0388js() {
            super("trophy", Category.h, C1026Lt.a.Or, C1026Lt.a.Oq, C1026Lt.a.Oo, C1026Lt.a.Om, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$r  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0403r extends HawkinsIcon {
        public static final C0403r b = new C0403r();

        private C0403r() {
            super(InteractiveAnimation.ANIMATION_TYPE.ALPHA, Category.f, C1026Lt.a.an, C1026Lt.a.aq, C1026Lt.a.ap, C1026Lt.a.al, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ae  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0133ae extends HawkinsIcon {
        public static final C0133ae e = new C0133ae();

        private C0133ae() {
            super("branch-redirect", Category.f, C1026Lt.a.dB, C1026Lt.a.dF, C1026Lt.a.dE, C1026Lt.a.dC, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ak  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0139ak extends HawkinsIcon {
        public static final C0139ak e = new C0139ak();

        private C0139ak() {
            super("broom", Category.f, C1026Lt.a.dZ, C1026Lt.a.dY, C1026Lt.a.dX, C1026Lt.a.dW, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aJ extends HawkinsIcon {
        public static final aJ d = new aJ();

        private aJ() {
            super("chat", Category.f, C1026Lt.a.fY, C1026Lt.a.fW, C1026Lt.a.fZ, C1026Lt.a.ga, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aH extends HawkinsIcon {
        public static final aH e = new aH();

        private aH() {
            super("chat-bubble-exclamation-point", Category.f, C1026Lt.a.fM, C1026Lt.a.fV, C1026Lt.a.fN, C1026Lt.a.fQ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aN extends HawkinsIcon {
        public static final aN b = new aN();

        private aN() {
            super("chat-bubbles", Category.f, C1026Lt.a.fT, C1026Lt.a.fR, C1026Lt.a.fS, C1026Lt.a.fU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aU extends HawkinsIcon {
        public static final aU d = new aU();

        private aU() {
            super("choice", Category.f, C1026Lt.a.gI, C1026Lt.a.gH, C1026Lt.a.gJ, C1026Lt.a.gF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bs  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0174bs extends HawkinsIcon {
        public static final C0174bs b = new C0174bs();

        private C0174bs() {
            super("clipboard", Category.f, C1026Lt.a.iC, C1026Lt.a.iE, C1026Lt.a.iw, C1026Lt.a.ir, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0176bu extends HawkinsIcon {
        public static final C0176bu b = new C0176bu();

        private C0176bu() {
            super("clipboard-automirrored", Category.f, C1026Lt.a.iB, C1026Lt.a.iF, C1026Lt.a.iy, C1026Lt.a.it, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$br  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0173br extends HawkinsIcon {
        public static final C0173br e = new C0173br();

        private C0173br() {
            super("clipboard-magnifying-glass", Category.f, C1026Lt.a.iA, C1026Lt.a.iD, C1026Lt.a.ix, C1026Lt.a.iz, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0181bz extends HawkinsIcon {
        public static final C0181bz d = new C0181bz();

        private C0181bz() {
            super("collapse", Category.f, C1026Lt.a.ju, C1026Lt.a.jw, C1026Lt.a.jh, C1026Lt.a.jc, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bD extends HawkinsIcon {
        public static final bD e = new bD();

        private bD() {
            super("collapse-all", Category.f, C1026Lt.a.iZ, C1026Lt.a.iW, C1026Lt.a.iX, C1026Lt.a.iV, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bE extends HawkinsIcon {
        public static final bE e = new bE();

        private bE() {
            super("collapse-horizontal", Category.f, C1026Lt.a.jd, C1026Lt.a.je, C1026Lt.a.ja, C1026Lt.a.jb, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bA extends HawkinsIcon {
        public static final bA e = new bA();

        private bA() {
            super("collapse-panel-down", Category.f, C1026Lt.a.jf, C1026Lt.a.jg, C1026Lt.a.ji, C1026Lt.a.jj, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bC extends HawkinsIcon {
        public static final bC e = new bC();

        private bC() {
            super("collapse-panel-left", Category.f, C1026Lt.a.jn, C1026Lt.a.jm, C1026Lt.a.jl, C1026Lt.a.jo, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bB extends HawkinsIcon {
        public static final bB b = new bB();

        private bB() {
            super("collapse-panel-right", Category.f, C1026Lt.a.js, C1026Lt.a.jr, C1026Lt.a.jq, C1026Lt.a.jk, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bJ extends HawkinsIcon {
        public static final bJ b = new bJ();

        private bJ() {
            super("collapse-panel-up", Category.f, C1026Lt.a.jy, C1026Lt.a.jv, C1026Lt.a.jt, C1026Lt.a.jp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bI extends HawkinsIcon {
        public static final bI c = new bI();

        private bI() {
            super("collapse-vertical", Category.f, C1026Lt.a.jC, C1026Lt.a.jD, C1026Lt.a.jz, C1026Lt.a.jx, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bG extends HawkinsIcon {
        public static final bG d = new bG();

        private bG() {
            super("color", Category.f, C1026Lt.a.jG, C1026Lt.a.jL, C1026Lt.a.jF, C1026Lt.a.jH, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bF extends HawkinsIcon {
        public static final bF b = new bF();

        private bF() {
            super("columns", Category.f, C1026Lt.a.jK, C1026Lt.a.jN, C1026Lt.a.jJ, C1026Lt.a.jM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bO extends HawkinsIcon {
        public static final bO d = new bO();

        private bO() {
            super("compare", Category.f, C1026Lt.a.jZ, C1026Lt.a.kc, C1026Lt.a.jV, C1026Lt.a.jT, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bQ extends HawkinsIcon {
        public static final bQ d = new bQ();

        private bQ() {
            super("copy-checkmark", Category.f, C1026Lt.a.kv, C1026Lt.a.ky, C1026Lt.a.ks, C1026Lt.a.kw, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bX extends HawkinsIcon {
        public static final bX c = new bX();

        private bX() {
            super("copy-plus", Category.f, C1026Lt.a.kA, C1026Lt.a.kz, C1026Lt.a.kx, C1026Lt.a.kB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bV extends HawkinsIcon {
        public static final bV c = new bV();

        private bV() {
            super("crop", Category.f, C1026Lt.a.kQ, C1026Lt.a.kP, C1026Lt.a.kL, C1026Lt.a.kJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bZ extends HawkinsIcon {
        public static final bZ e = new bZ();

        private bZ() {
            super("cursor-text", Category.f, C1026Lt.a.lg, C1026Lt.a.lh, C1026Lt.a.lc, C1026Lt.a.lb, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cU extends HawkinsIcon {
        public static final cU c = new cU();

        private cU() {
            super("drag", Category.f, C1026Lt.a.oH, C1026Lt.a.oG, C1026Lt.a.oD, C1026Lt.a.oA, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$da  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0210da extends HawkinsIcon {
        public static final C0210da d = new C0210da();

        private C0210da() {
            super("ending", Category.f, C1026Lt.a.pb, C1026Lt.a.pa, C1026Lt.a.oX, C1026Lt.a.oV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$de  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0214de extends HawkinsIcon {
        public static final C0214de b = new C0214de();

        private C0214de() {
            super("expand", Category.f, C1026Lt.a.pv, C1026Lt.a.py, C1026Lt.a.pw, C1026Lt.a.ps, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$df  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0215df extends HawkinsIcon {
        public static final C0215df d = new C0215df();

        private C0215df() {
            super("expand-all", Category.f, C1026Lt.a.pq, C1026Lt.a.pr, C1026Lt.a.pn, C1026Lt.a.pm, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0216dg extends HawkinsIcon {
        public static final C0216dg e = new C0216dg();

        private C0216dg() {
            super("expand-horizontal", Category.f, C1026Lt.a.pu, C1026Lt.a.pt, C1026Lt.a.pp, C1026Lt.a.po, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dk  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0220dk extends HawkinsIcon {
        public static final C0220dk d = new C0220dk();

        private C0220dk() {
            super("expand-vertical", Category.f, C1026Lt.a.pz, C1026Lt.a.pB, C1026Lt.a.px, C1026Lt.a.pA, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0230dv extends HawkinsIcon {
        public static final C0230dv d = new C0230dv();

        private C0230dv() {
            super("flag", Category.f, C1026Lt.a.qA, C1026Lt.a.qJ, C1026Lt.a.qE, C1026Lt.a.qC, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ec  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0238ec extends HawkinsIcon {
        public static final C0238ec c = new C0238ec();

        private C0238ec() {
            super("glasses", Category.f, C1026Lt.a.to, C1026Lt.a.tn, C1026Lt.a.tj, C1026Lt.a.tg, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$et  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0255et extends HawkinsIcon {
        public static final C0255et e = new C0255et();

        private C0255et() {
            super("group", Category.f, C1026Lt.a.uv, C1026Lt.a.uu, C1026Lt.a.up, C1026Lt.a.uo, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$er  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0253er extends HawkinsIcon {
        public static final C0253er b = new C0253er();

        private C0253er() {
            super("group-by", Category.f, C1026Lt.a.um, C1026Lt.a.uq, C1026Lt.a.ui, C1026Lt.a.uj, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$eq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0252eq extends HawkinsIcon {
        public static final C0252eq c = new C0252eq();

        private C0252eq() {
            super("group-by-automirrored", Category.f, C1026Lt.a.un, C1026Lt.a.ur, C1026Lt.a.ul, C1026Lt.a.uk, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ey  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0260ey extends HawkinsIcon {
        public static final C0260ey c = new C0260ey();

        private C0260ey() {
            super("hashtag", Category.f, C1026Lt.a.uD, C1026Lt.a.uC, C1026Lt.a.uF, C1026Lt.a.uG, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0264fb extends HawkinsIcon {
        public static final C0264fb c = new C0264fb();

        private C0264fb() {
            super("jump-to", Category.f, C1026Lt.a.wO, C1026Lt.a.wP, C1026Lt.a.wN, C1026Lt.a.wR, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fe  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0267fe extends HawkinsIcon {
        public static final C0267fe e = new C0267fe();

        private C0267fe() {
            super("languages", Category.f, C1026Lt.a.xp, C1026Lt.a.xo, C1026Lt.a.xj, C1026Lt.a.xk, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0266fd extends HawkinsIcon {
        public static final C0266fd e = new C0266fd();

        private C0266fd() {
            super("languages-screen", Category.f, C1026Lt.a.xn, C1026Lt.a.xm, C1026Lt.a.xh, C1026Lt.a.xi, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fE extends HawkinsIcon {
        public static final fE b = new fE();

        private fE() {
            super("magnifying-glass", Category.f, C1026Lt.a.zz, C1026Lt.a.zA, C1026Lt.a.zs, C1026Lt.a.zt, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fG extends HawkinsIcon {
        public static final fG b = new fG();

        private fG() {
            super("magnifying-glass-fill", Category.f, C1026Lt.a.zw, C1026Lt.a.zu, C1026Lt.a.zq, C1026Lt.a.zp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fL extends HawkinsIcon {
        public static final fL c = new fL();

        private fL() {
            super("magnifying-glass-plus", Category.f, C1026Lt.a.zx, C1026Lt.a.zB, C1026Lt.a.zy, C1026Lt.a.zv, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fK extends HawkinsIcon {
        public static final fK c = new fK();

        private fK() {
            super("magnifying-glass-zoom-in", Category.f, C1026Lt.a.zF, C1026Lt.a.zC, C1026Lt.a.zG, C1026Lt.a.zD, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fI extends HawkinsIcon {
        public static final fI c = new fI();

        private fI() {
            super("magnifying-glass-zoom-out", Category.f, C1026Lt.a.zJ, C1026Lt.a.zH, C1026Lt.a.zI, C1026Lt.a.zE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fQ extends HawkinsIcon {
        public static final fQ e = new fQ();

        private fQ() {
            super("maximize", Category.f, C1026Lt.a.Ah, C1026Lt.a.Aj, C1026Lt.a.Ae, C1026Lt.a.Ad, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fU extends HawkinsIcon {
        public static final fU e = new fU();

        private fU() {
            super("memory", Category.f, C1026Lt.a.AD, C1026Lt.a.AA, C1026Lt.a.Av, C1026Lt.a.Ax, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fR extends HawkinsIcon {
        public static final fR b = new fR();

        private fR() {
            super("memory-checkmark", Category.f, C1026Lt.a.Aq, C1026Lt.a.At, C1026Lt.a.As, C1026Lt.a.Ar, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fS extends HawkinsIcon {
        public static final fS e = new fS();

        private fS() {
            super("memory-event", Category.f, C1026Lt.a.Az, C1026Lt.a.Ay, C1026Lt.a.Aw, C1026Lt.a.Au, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fZ extends HawkinsIcon {
        public static final fZ b = new fZ();

        private fZ() {
            super("minimize", Category.f, C1026Lt.a.AR, C1026Lt.a.AQ, C1026Lt.a.AS, C1026Lt.a.AO, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fY extends HawkinsIcon {
        public static final fY b = new fY();

        private fY() {
            super("minus", Category.f, C1026Lt.a.AX, C1026Lt.a.AW, C1026Lt.a.AT, C1026Lt.a.AP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0311gv extends HawkinsIcon {
        public static final C0311gv b = new C0311gv();

        private C0311gv() {
            super("particles", Category.f, C1026Lt.a.CJ, C1026Lt.a.CG, C1026Lt.a.CI, C1026Lt.a.CH, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gB extends HawkinsIcon {
        public static final gB d = new gB();

        private gB() {
            super(SignupConstants.Field.PIN, Category.f, C1026Lt.a.Dr, C1026Lt.a.Dq, C1026Lt.a.Ds, C1026Lt.a.Dt, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gJ extends HawkinsIcon {
        public static final gJ e = new gJ();

        private gJ() {
            super("pin-fill", Category.f, C1026Lt.a.Do, C1026Lt.a.Dp, C1026Lt.a.Dm, C1026Lt.a.Dl, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gZ extends HawkinsIcon {
        public static final gZ b = new gZ();

        private gZ() {
            super("rectangle-horizontal", Category.f, C1026Lt.a.Fg, C1026Lt.a.Fp, C1026Lt.a.Fh, C1026Lt.a.Fk, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hi  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0325hi extends HawkinsIcon {
        public static final C0325hi c = new C0325hi();

        private C0325hi() {
            super("redo", Category.f, C1026Lt.a.Fq, C1026Lt.a.Fr, C1026Lt.a.Fm, C1026Lt.a.Fo, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0324hh extends HawkinsIcon {
        public static final C0324hh c = new C0324hh();

        private C0324hh() {
            super("redo-automirrored", Category.f, C1026Lt.a.Ft, C1026Lt.a.Fs, C1026Lt.a.Fl, C1026Lt.a.Fn, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$he  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0321he extends HawkinsIcon {
        public static final C0321he c = new C0321he();

        private C0321he() {
            super(BuildConfig.BUILD_TYPE, Category.f, C1026Lt.a.FA, C1026Lt.a.FF, C1026Lt.a.FB, C1026Lt.a.FE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hr  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0334hr extends HawkinsIcon {
        public static final C0334hr e = new C0334hr();

        private C0334hr() {
            super("rotate", Category.f, C1026Lt.a.Gp, C1026Lt.a.Gv, C1026Lt.a.Gk, C1026Lt.a.Ge, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ht  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0336ht extends HawkinsIcon {
        public static final C0336ht b = new C0336ht();

        private C0336ht() {
            super("rotate-x", Category.f, C1026Lt.a.Gt, C1026Lt.a.Gx, C1026Lt.a.Gw, C1026Lt.a.Gu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0339hw extends HawkinsIcon {
        public static final C0339hw c = new C0339hw();

        private C0339hw() {
            super(InteractiveAnimation.ANIMATION_TYPE.SCALE, Category.f, C1026Lt.a.GC, C1026Lt.a.Gy, C1026Lt.a.GB, C1026Lt.a.GA, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hA extends HawkinsIcon {
        public static final hA b = new hA();

        private hA() {
            super("scissors", Category.f, C1026Lt.a.GP, C1026Lt.a.GR, C1026Lt.a.GO, C1026Lt.a.GN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hH extends HawkinsIcon {
        public static final hH c = new hH();

        private hH() {
            super("segment", Category.f, C1026Lt.a.Hk, C1026Lt.a.Hl, C1026Lt.a.Hi, C1026Lt.a.Hh, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hP extends HawkinsIcon {
        public static final hP b = new hP();

        private hP() {
            super("shuffle", Category.f, C1026Lt.a.Im, C1026Lt.a.Il, C1026Lt.a.Io, C1026Lt.a.Ij, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hN extends HawkinsIcon {
        public static final hN d = new hN();

        private hN() {
            super("shuffle-automirrored", Category.f, C1026Lt.a.Ik, C1026Lt.a.Ir, C1026Lt.a.In, C1026Lt.a.Ih, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ib  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0345ib extends HawkinsIcon {
        public static final C0345ib e = new C0345ib();

        private C0345ib() {
            super("sort", Category.f, C1026Lt.a.JG, C1026Lt.a.JD, C1026Lt.a.JB, C1026Lt.a.Jx, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$if  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class Cif extends HawkinsIcon {
        public static final Cif d = new Cif();

        private Cif() {
            super("sort-automirrored", Category.f, C1026Lt.a.JF, C1026Lt.a.JE, C1026Lt.a.JA, C1026Lt.a.Jz, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$id  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0347id extends HawkinsIcon {
        public static final C0347id e = new C0347id();

        private C0347id() {
            super("sort-alpha-ascending", Category.f, C1026Lt.a.Jc, C1026Lt.a.Jf, C1026Lt.a.Jb, C1026Lt.a.IY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ic  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0346ic extends HawkinsIcon {
        public static final C0346ic e = new C0346ic();

        private C0346ic() {
            super("sort-alpha-descending", Category.f, C1026Lt.a.Jh, C1026Lt.a.Je, C1026Lt.a.Jd, C1026Lt.a.Jg, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ie  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0348ie extends HawkinsIcon {
        public static final C0348ie b = new C0348ie();

        private C0348ie() {
            super("sort-column-ascending", Category.f, C1026Lt.a.Jm, C1026Lt.a.Jn, C1026Lt.a.Jj, C1026Lt.a.Jl, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ig  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0349ig extends HawkinsIcon {
        public static final C0349ig d = new C0349ig();

        private C0349ig() {
            super("sort-column-ascending-automirrored", Category.f, C1026Lt.a.Jq, C1026Lt.a.Jo, C1026Lt.a.Ji, C1026Lt.a.Jk, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ii  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0351ii extends HawkinsIcon {
        public static final C0351ii b = new C0351ii();

        private C0351ii() {
            super("sort-column-descending", Category.f, C1026Lt.a.Ju, C1026Lt.a.Jt, C1026Lt.a.Jw, C1026Lt.a.Jr, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ih  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0350ih extends HawkinsIcon {
        public static final C0350ih d = new C0350ih();

        private C0350ih() {
            super("sort-column-descending-automirrored", Category.f, C1026Lt.a.Js, C1026Lt.a.Jy, C1026Lt.a.Jv, C1026Lt.a.Jp, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ik  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0353ik extends HawkinsIcon {
        public static final C0353ik e = new C0353ik();

        private C0353ik() {
            super("spark", Category.f, C1026Lt.a.JN, C1026Lt.a.JV, C1026Lt.a.JO, C1026Lt.a.JQ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$iq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0359iq extends HawkinsIcon {
        public static final C0359iq e = new C0359iq();

        private C0359iq() {
            super("spellcheck", Category.f, C1026Lt.a.JY, C1026Lt.a.JZ, C1026Lt.a.JX, C1026Lt.a.JW, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$iu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0363iu extends HawkinsIcon {
        public static final C0363iu d = new C0363iu();

        private C0363iu() {
            super("square-plus", Category.f, C1026Lt.a.Kt, C1026Lt.a.Kx, C1026Lt.a.Ks, C1026Lt.a.Ku, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$is  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0361is extends HawkinsIcon {
        public static final C0361is c = new C0361is();

        private C0361is() {
            super("stacks", Category.f, C1026Lt.a.KA, C1026Lt.a.KD, C1026Lt.a.Kw, C1026Lt.a.Ky, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iM extends HawkinsIcon {
        public static final iM d = new iM();

        private iM() {
            super("tag", Category.f, C1026Lt.a.Mg, C1026Lt.a.Mk, C1026Lt.a.Mf, C1026Lt.a.Me, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ju  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0390ju extends HawkinsIcon {
        public static final C0390ju d = new C0390ju();

        private C0390ju() {
            super("undo", Category.f, C1026Lt.a.OR, C1026Lt.a.OU, C1026Lt.a.OQ, C1026Lt.a.OP, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jD extends HawkinsIcon {
        public static final jD e = new jD();

        private jD() {
            super("undo-automirrored", Category.f, C1026Lt.a.OV, C1026Lt.a.OS, C1026Lt.a.OT, C1026Lt.a.OM, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kf extends HawkinsIcon {
        public static final kf e = new kf();

        private kf() {
            super("wrench", Category.f, C1026Lt.a.Rw, C1026Lt.a.RE, C1026Lt.a.Rx, C1026Lt.a.Ry, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$p  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0401p extends HawkinsIcon {
        public static final C0401p c = new C0401p();

        private C0401p() {
            super("apple", Category.l, C1026Lt.a.aw, C1026Lt.a.az, C1026Lt.a.as, C1026Lt.a.au, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class N extends HawkinsIcon {
        public static final N e = new N();

        private N() {
            super("atlas", Category.l, C1026Lt.a.bW, C1026Lt.a.bX, C1026Lt.a.bQ, C1026Lt.a.bT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ac  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0131ac extends HawkinsIcon {
        public static final C0131ac b = new C0131ac();

        private C0131ac() {
            super("bitbucket", Category.l, C1026Lt.a.dd, C1026Lt.a.dg, C1026Lt.a.cZ, C1026Lt.a.db, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ch  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0190ch extends HawkinsIcon {
        public static final C0190ch e = new C0190ch();

        private C0190ch() {
            super("dialogue-app", Category.l, C1026Lt.a.lD, C1026Lt.a.lF, C1026Lt.a.lE, C1026Lt.a.lB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cL extends HawkinsIcon {
        public static final cL e = new cL();

        private cL() {
            super("dolby", Category.l, C1026Lt.a.nU, C1026Lt.a.nR, C1026Lt.a.nN, C1026Lt.a.nM, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dq  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0225dq extends HawkinsIcon {
        public static final C0225dq e = new C0225dq();

        private C0225dq() {
            super("facebook", Category.l, C1026Lt.a.qb, C1026Lt.a.qd, C1026Lt.a.qf, C1026Lt.a.pW, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ds  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0227ds extends HawkinsIcon {
        public static final C0227ds d = new C0227ds();

        private C0227ds() {
            super("figma", Category.l, C1026Lt.a.qn, C1026Lt.a.qm, C1026Lt.a.qo, C1026Lt.a.ql, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dr  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0226dr extends HawkinsIcon {
        public static final C0226dr e = new C0226dr();

        private C0226dr() {
            super("final-draft", Category.l, C1026Lt.a.qB, C1026Lt.a.qD, C1026Lt.a.qy, C1026Lt.a.qv, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ee  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0240ee extends HawkinsIcon {
        public static final C0240ee d = new C0240ee();

        private C0240ee() {
            super("git", Category.l, C1026Lt.a.tf, C1026Lt.a.th, C1026Lt.a.ti, C1026Lt.a.te, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$eh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0243eh extends HawkinsIcon {
        public static final C0243eh e = new C0243eh();

        private C0243eh() {
            super("google", Category.l, C1026Lt.a.tO, C1026Lt.a.tP, C1026Lt.a.tN, C1026Lt.a.tL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$eg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0242eg extends HawkinsIcon {
        public static final C0242eg b = new C0242eg();

        private C0242eg() {
            super("google-android", Category.l, C1026Lt.a.tu, C1026Lt.a.tw, C1026Lt.a.ty, C1026Lt.a.tv, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ei  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0244ei extends HawkinsIcon {
        public static final C0244ei c = new C0244ei();

        private C0244ei() {
            super("google-drive", Category.l, C1026Lt.a.tI, C1026Lt.a.tF, C1026Lt.a.tD, C1026Lt.a.tz, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$en  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0249en extends HawkinsIcon {
        public static final C0249en e = new C0249en();

        private C0249en() {
            super("google-group", Category.l, C1026Lt.a.tG, C1026Lt.a.tJ, C1026Lt.a.tH, C1026Lt.a.tE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$el  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0247el extends HawkinsIcon {
        public static final C0247el c = new C0247el();

        private C0247el() {
            super("graphql", Category.l, C1026Lt.a.uc, C1026Lt.a.ua, C1026Lt.a.tX, C1026Lt.a.tV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ev  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0257ev extends HawkinsIcon {
        public static final C0257ev c = new C0257ev();

        private C0257ev() {
            super("hawkins", Category.l, C1026Lt.a.uJ, C1026Lt.a.uI, C1026Lt.a.uK, C1026Lt.a.uE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eS extends HawkinsIcon {
        public static final eS b = new eS();

        private eS() {
            super("igtv", Category.l, C1026Lt.a.wg, C1026Lt.a.we, C1026Lt.a.wh, C1026Lt.a.wf, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eP extends HawkinsIcon {
        public static final eP c = new eP();

        private eP() {
            super("imdb", Category.l, C1026Lt.a.wr, C1026Lt.a.ws, C1026Lt.a.wj, C1026Lt.a.wl, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eU extends HawkinsIcon {
        public static final eU b = new eU();

        private eU() {
            super("insta-stories", Category.l, C1026Lt.a.wz, C1026Lt.a.wC, C1026Lt.a.wy, C1026Lt.a.wA, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eT extends HawkinsIcon {
        public static final eT c = new eT();

        private eT() {
            super("instagram", Category.l, C1026Lt.a.wF, C1026Lt.a.wG, C1026Lt.a.wE, C1026Lt.a.wB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eX extends HawkinsIcon {
        public static final eX e = new eX();

        private eX() {
            super("jira", Category.l, C1026Lt.a.wK, C1026Lt.a.wQ, C1026Lt.a.wJ, C1026Lt.a.wI, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eZ extends HawkinsIcon {
        public static final eZ e = new eZ();

        private eZ() {
            super("kibana", Category.l, C1026Lt.a.xg, C1026Lt.a.xc, C1026Lt.a.xb, C1026Lt.a.wZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fo  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0277fo extends HawkinsIcon {
        public static final C0277fo e = new C0277fo();

        private C0277fo() {
            super("linkedin", Category.l, C1026Lt.a.yk, C1026Lt.a.yn, C1026Lt.a.yf, C1026Lt.a.yh, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0303gn extends HawkinsIcon {
        public static final C0303gn e = new C0303gn();

        private C0303gn() {
            super("netflix", Category.l, C1026Lt.a.BR, C1026Lt.a.BN, C1026Lt.a.BQ, C1026Lt.a.BP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gr  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0307gr extends HawkinsIcon {
        public static final C0307gr c = new C0307gr();

        private C0307gr() {
            super("pagerduty", Category.l, C1026Lt.a.Cp, C1026Lt.a.Cm, C1026Lt.a.Cn, C1026Lt.a.Co, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gI extends HawkinsIcon {
        public static final gI c = new gI();

        private gI() {
            super("pix", Category.l, C1026Lt.a.Dv, C1026Lt.a.Dx, C1026Lt.a.Dw, C1026Lt.a.Dy, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hY extends HawkinsIcon {
        public static final hY d = new hY();

        private hY() {
            super("slack", Category.l, C1026Lt.a.IO, C1026Lt.a.IS, C1026Lt.a.IQ, C1026Lt.a.IP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ia  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0344ia extends HawkinsIcon {
        public static final C0344ia e = new C0344ia();

        private C0344ia() {
            super("snapchat", Category.l, C1026Lt.a.Ja, C1026Lt.a.IZ, C1026Lt.a.IU, C1026Lt.a.IX, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ij  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0352ij extends HawkinsIcon {
        public static final C0352ij b = new C0352ij();

        private C0352ij() {
            super("soundcloud", Category.l, C1026Lt.a.JI, C1026Lt.a.JL, C1026Lt.a.JK, C1026Lt.a.JC, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$io  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0357io extends HawkinsIcon {
        public static final C0357io e = new C0357io();

        private C0357io() {
            super("spinnaker", Category.l, C1026Lt.a.Kd, C1026Lt.a.Kc, C1026Lt.a.Ke, C1026Lt.a.Ka, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ip  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0358ip extends HawkinsIcon {
        public static final C0358ip c = new C0358ip();

        private C0358ip() {
            super("spotify", Category.l, C1026Lt.a.Ki, C1026Lt.a.Kh, C1026Lt.a.Kf, C1026Lt.a.Kb, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0376jg extends HawkinsIcon {
        public static final C0376jg c = new C0376jg();

        private C0376jg() {
            super("tiktok", Category.l, C1026Lt.a.Ns, C1026Lt.a.Nq, C1026Lt.a.Nt, C1026Lt.a.Np, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jy  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0394jy extends HawkinsIcon {
        public static final C0394jy b = new C0394jy();

        private C0394jy() {
            super("twitter", Category.l, C1026Lt.a.OO, C1026Lt.a.ON, C1026Lt.a.OL, C1026Lt.a.OJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jA extends HawkinsIcon {
        public static final jA c = new jA();

        private jA() {
            super("unity", Category.l, C1026Lt.a.OX, C1026Lt.a.OZ, C1026Lt.a.Pa, C1026Lt.a.OY, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jC extends HawkinsIcon {
        public static final jC c = new jC();

        private jC() {
            super("unreal-engine", Category.l, C1026Lt.a.Pg, C1026Lt.a.Pj, C1026Lt.a.Pf, C1026Lt.a.Pb, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ki extends HawkinsIcon {
        public static final ki e = new ki();

        private ki() {
            super("youtube", Category.l, C1026Lt.a.RG, C1026Lt.a.RI, C1026Lt.a.RK, C1026Lt.a.RJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class A extends HawkinsIcon {
        public static final A c = new A();

        private A() {
            super("arrow-trending", Category.n, C1026Lt.a.bi, C1026Lt.a.bh, C1026Lt.a.bc, C1026Lt.a.bb, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ai  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0137ai extends HawkinsIcon {
        public static final C0137ai c = new C0137ai();

        private C0137ai() {
            super("brightness-high", Category.n, C1026Lt.a.dG, C1026Lt.a.dI, C1026Lt.a.dK, C1026Lt.a.dH, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$am  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0141am extends HawkinsIcon {
        public static final C0141am b = new C0141am();

        private C0141am() {
            super("brightness-low", Category.n, C1026Lt.a.dP, C1026Lt.a.dL, C1026Lt.a.dN, C1026Lt.a.dJ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$al  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0140al extends HawkinsIcon {
        public static final C0140al c = new C0140al();

        private C0140al() {
            super("brightness-medium", Category.n, C1026Lt.a.dQ, C1026Lt.a.dS, C1026Lt.a.dM, C1026Lt.a.dO, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$aj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0138aj extends HawkinsIcon {
        public static final C0138aj e = new C0138aj();

        private C0138aj() {
            super("brightness-off", Category.n, C1026Lt.a.dU, C1026Lt.a.dV, C1026Lt.a.dT, C1026Lt.a.dR, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aP extends HawkinsIcon {
        public static final aP e = new aP();

        private aP() {
            super("checkmark", Category.n, C1026Lt.a.gb, C1026Lt.a.gd, C1026Lt.a.ge, C1026Lt.a.fX, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aZ extends HawkinsIcon {
        public static final aZ b = new aZ();

        private aZ() {
            super("circle-checkmark", Category.n, C1026Lt.a.gQ, C1026Lt.a.gP, C1026Lt.a.gT, C1026Lt.a.gN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aY extends HawkinsIcon {
        public static final aY e = new aY();

        private aY() {
            super("circle-checkmark-fill", Category.n, C1026Lt.a.gM, C1026Lt.a.gL, C1026Lt.a.gO, C1026Lt.a.gK, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aX extends HawkinsIcon {
        public static final aX c = new aX();

        private aX() {
            super("circle-exclamation-point", Category.n, C1026Lt.a.gW, C1026Lt.a.hb, C1026Lt.a.gX, C1026Lt.a.gY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ba  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0156ba extends HawkinsIcon {
        public static final C0156ba e = new C0156ba();

        private C0156ba() {
            super("circle-exclamation-point-fill", Category.n, C1026Lt.a.gU, C1026Lt.a.gV, C1026Lt.a.gS, C1026Lt.a.gR, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$be  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0160be extends HawkinsIcon {
        public static final C0160be c = new C0160be();

        private C0160be() {
            super("circle-i", Category.n, C1026Lt.a.hk, C1026Lt.a.hn, C1026Lt.a.hm, C1026Lt.a.hf, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0158bc extends HawkinsIcon {
        public static final C0158bc b = new C0158bc();

        private C0158bc() {
            super("circle-i-fill", Category.n, C1026Lt.a.hg, C1026Lt.a.he, C1026Lt.a.hh, C1026Lt.a.hi, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bi  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0164bi extends HawkinsIcon {
        public static final C0164bi c = new C0164bi();

        private C0164bi() {
            super("circle-question-mark", Category.n, C1026Lt.a.hV, C1026Lt.a.hU, C1026Lt.a.hP, C1026Lt.a.hO, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0171bp extends HawkinsIcon {
        public static final C0171bp c = new C0171bp();

        private C0171bp() {
            super("circle-question-mark-fill", Category.n, C1026Lt.a.hR, C1026Lt.a.hN, C1026Lt.a.hQ, C1026Lt.a.hK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0169bn extends HawkinsIcon {
        public static final C0169bn e = new C0169bn();

        private C0169bn() {
            super("circle-slash", Category.n, C1026Lt.a.ia, C1026Lt.a.hY, C1026Lt.a.hZ, C1026Lt.a.ib, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0168bm extends HawkinsIcon {
        public static final C0168bm b = new C0168bm();

        private C0168bm() {
            super("circle-star", Category.n, C1026Lt.a.ic, C1026Lt.a.ij, C1026Lt.a.ie, C1026Lt.a.id, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bo  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0170bo extends HawkinsIcon {
        public static final C0170bo e = new C0170bo();

        private C0170bo() {
            super("circle-x", Category.n, C1026Lt.a.in, C1026Lt.a.im, C1026Lt.a.iq, C1026Lt.a.ip, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bt  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0175bt extends HawkinsIcon {
        public static final C0175bt e = new C0175bt();

        private C0175bt() {
            super("circle-x-fill", Category.n, C1026Lt.a.il, C1026Lt.a.ih, C1026Lt.a.ik, C1026Lt.a.ii, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eA extends HawkinsIcon {
        public static final eA e = new eA();

        private eA() {
            super("heart-monitor", Category.n, C1026Lt.a.vd, C1026Lt.a.vb, C1026Lt.a.vf, C1026Lt.a.ve, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eH extends HawkinsIcon {
        public static final eH e = new eH();

        private eH() {
            super("hexagon-check", Category.n, C1026Lt.a.vg, C1026Lt.a.vl, C1026Lt.a.vk, C1026Lt.a.vh, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eF extends HawkinsIcon {
        public static final eF e = new eF();

        private eF() {
            super("hexagon-dotted-line", Category.n, C1026Lt.a.vn, C1026Lt.a.vo, C1026Lt.a.vm, C1026Lt.a.vp, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eE extends HawkinsIcon {
        public static final eE e = new eE();

        private eE() {
            super("hexagon-star", Category.n, C1026Lt.a.vD, C1026Lt.a.vJ, C1026Lt.a.vx, C1026Lt.a.vy, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eG extends HawkinsIcon {
        public static final eG e = new eG();

        private eG() {
            super("hexagon-star-line", Category.n, C1026Lt.a.vA, C1026Lt.a.vC, C1026Lt.a.vE, C1026Lt.a.vB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eK extends HawkinsIcon {
        public static final eK e = new eK();

        private eK() {
            super("hexagon-x", Category.n, C1026Lt.a.vG, C1026Lt.a.vF, C1026Lt.a.vH, C1026Lt.a.vI, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0209d extends HawkinsIcon {
        public static final C0209d d = new C0209d();

        private C0209d() {
            super("airplane", Category.k, C1026Lt.a.f13372o, C1026Lt.a.k, C1026Lt.a.g, C1026Lt.a.f, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0128a extends HawkinsIcon {
        public static final C0128a b = new C0128a();

        private C0128a() {
            super("airplay", Category.k, C1026Lt.a.n, C1026Lt.a.s, C1026Lt.a.m, C1026Lt.a.l, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$t  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0405t extends HawkinsIcon {
        public static final C0405t e = new C0405t();

        private C0405t() {
            super("applications", Category.k, C1026Lt.a.aA, C1026Lt.a.ay, C1026Lt.a.ax, C1026Lt.a.aB, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class H extends HawkinsIcon {
        public static final H b = new H();

        private H() {
            super("artifact", Category.k, C1026Lt.a.bt, C1026Lt.a.br, C1026Lt.a.bs, C1026Lt.a.bq, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class P extends HawkinsIcon {
        public static final P c = new P();

        private P() {
            super("audio-clip", Category.k, C1026Lt.a.ce, C1026Lt.a.ci, C1026Lt.a.cg, C1026Lt.a.ch, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ap  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0144ap extends HawkinsIcon {
        public static final C0144ap c = new C0144ap();

        private C0144ap() {
            super("browser", Category.k, C1026Lt.a.ec, C1026Lt.a.ee, C1026Lt.a.eb, C1026Lt.a.ed, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ar  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0146ar extends HawkinsIcon {
        public static final C0146ar e = new C0146ar();

        private C0146ar() {
            super("bug", Category.k, C1026Lt.a.ef, C1026Lt.a.eh, C1026Lt.a.eg, C1026Lt.a.ea, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$as  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0147as extends HawkinsIcon {
        public static final C0147as c = new C0147as();

        private C0147as() {
            super("bus", Category.k, C1026Lt.a.ex, C1026Lt.a.ew, C1026Lt.a.ey, C1026Lt.a.ev, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$az  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0154az extends HawkinsIcon {
        public static final C0154az d = new C0154az();

        private C0154az() {
            super("camera-star", Category.k, C1026Lt.a.fg, C1026Lt.a.ff, C1026Lt.a.fh, C1026Lt.a.fd, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0159bd extends HawkinsIcon {
        public static final C0159bd b = new C0159bd();

        private C0159bd() {
            super("circle-letter-a-fill", Category.k, C1026Lt.a.hq, C1026Lt.a.hr, C1026Lt.a.hp, C1026Lt.a.hs, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0157bb extends HawkinsIcon {
        public static final C0157bb d = new C0157bb();

        private C0157bb() {
            super("circle-letter-b-fill", Category.k, C1026Lt.a.hw, C1026Lt.a.hv, C1026Lt.a.ht, C1026Lt.a.ho, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bk  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0166bk extends HawkinsIcon {
        public static final C0166bk c = new C0166bk();

        private C0166bk() {
            super("circle-letter-x-fill", Category.k, C1026Lt.a.hC, C1026Lt.a.hz, C1026Lt.a.hx, C1026Lt.a.hu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0162bg extends HawkinsIcon {
        public static final C0162bg e = new C0162bg();

        private C0162bg() {
            super("circle-letter-y-fill", Category.k, C1026Lt.a.hy, C1026Lt.a.hH, C1026Lt.a.hA, C1026Lt.a.hB, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$by  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0180by extends HawkinsIcon {
        public static final C0180by c = new C0180by();

        private C0180by() {
            super("clone", Category.k, C1026Lt.a.iO, C1026Lt.a.iL, C1026Lt.a.iP, C1026Lt.a.iI, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ca  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0183ca extends HawkinsIcon {
        public static final C0183ca e = new C0183ca();

        private C0183ca() {
            super("customer-support", Category.k, C1026Lt.a.lk, C1026Lt.a.lm, C1026Lt.a.lj, C1026Lt.a.li, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ci  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0191ci extends HawkinsIcon {
        public static final C0191ci d = new C0191ci();

        private C0191ci() {
            super("data-workflow", Category.k, C1026Lt.a.lr, C1026Lt.a.ls, C1026Lt.a.lq, C1026Lt.a.lt, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cf  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0188cf extends HawkinsIcon {
        public static final C0188cf e = new C0188cf();

        private C0188cf() {
            super("database", Category.k, C1026Lt.a.lw, C1026Lt.a.lz, C1026Lt.a.lx, C1026Lt.a.lu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$cm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0195cm extends HawkinsIcon {
        public static final C0195cm d = new C0195cm();

        private C0195cm() {
            super("dialpad", Category.k, C1026Lt.a.lH, C1026Lt.a.lI, C1026Lt.a.lJ, C1026Lt.a.lG, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cT extends HawkinsIcon {
        public static final cT d = new cT();

        private cT() {
            super("dpad", Category.k, C1026Lt.a.oB, C1026Lt.a.oC, C1026Lt.a.oz, C1026Lt.a.ov, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$db  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0211db extends HawkinsIcon {
        public static final C0211db c = new C0211db();

        private C0211db() {
            super("envelope", Category.k, C1026Lt.a.pc, C1026Lt.a.pf, C1026Lt.a.oY, C1026Lt.a.oZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0213dd extends HawkinsIcon {
        public static final C0213dd c = new C0213dd();

        private C0213dd() {
            super("envelope-star", Category.k, C1026Lt.a.pg, C1026Lt.a.ph, C1026Lt.a.pd, C1026Lt.a.pe, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dN extends HawkinsIcon {
        public static final dN d = new dN();

        private dN() {
            super("game-controller", Category.k, C1026Lt.a.rY, C1026Lt.a.rX, C1026Lt.a.sb, C1026Lt.a.rU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dL extends HawkinsIcon {
        public static final dL e = new dL();

        private dL() {
            super("game-controller-cloud", Category.k, C1026Lt.a.rQ, C1026Lt.a.rO, C1026Lt.a.rP, C1026Lt.a.rN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dO extends HawkinsIcon {
        public static final dO d = new dO();

        private dO() {
            super("game-controller-fill", Category.k, C1026Lt.a.rV, C1026Lt.a.rS, C1026Lt.a.rT, C1026Lt.a.rW, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class dP extends HawkinsIcon {
        public static final dP b = new dP();

        private dP() {
            super("gantt-chart", Category.k, C1026Lt.a.se, C1026Lt.a.sg, C1026Lt.a.sa, C1026Lt.a.rZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$em  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0248em extends HawkinsIcon {
        public static final C0248em b = new C0248em();

        private C0248em() {
            super("graph-bar", Category.k, C1026Lt.a.tU, C1026Lt.a.tW, C1026Lt.a.tT, C1026Lt.a.tQ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$eu  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0256eu extends HawkinsIcon {
        public static final C0256eu e = new C0256eu();

        private C0256eu() {
            super("hdmi", Category.k, C1026Lt.a.uQ, C1026Lt.a.uM, C1026Lt.a.uH, C1026Lt.a.uL, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eD extends HawkinsIcon {
        public static final eD c = new eD();

        private eD() {
            super("headphones", Category.k, C1026Lt.a.uV, C1026Lt.a.uU, C1026Lt.a.uS, C1026Lt.a.uR, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eV extends HawkinsIcon {
        public static final eV c = new eV();

        private eV() {
            super("internet-speed", Category.k, C1026Lt.a.wL, C1026Lt.a.wM, C1026Lt.a.wH, C1026Lt.a.wD, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0265fc extends HawkinsIcon {
        public static final C0265fc b = new C0265fc();

        private C0265fc() {
            super("keyboard", Category.k, C1026Lt.a.wX, C1026Lt.a.xa, C1026Lt.a.wV, C1026Lt.a.wT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fa  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0263fa extends HawkinsIcon {
        public static final C0263fa e = new C0263fa();

        private C0263fa() {
            super("keyboard-osk", Category.k, C1026Lt.a.wW, C1026Lt.a.wY, C1026Lt.a.wU, C1026Lt.a.wS, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ff  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0268ff extends HawkinsIcon {
        public static final C0268ff b = new C0268ff();

        private C0268ff() {
            super("laptop", Category.k, C1026Lt.a.xs, C1026Lt.a.xt, C1026Lt.a.xu, C1026Lt.a.xq, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fP extends HawkinsIcon {
        public static final fP d = new fP();

        private fP() {
            super("markup", Category.k, C1026Lt.a.Aa, C1026Lt.a.zZ, C1026Lt.a.zW, C1026Lt.a.zX, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fN extends HawkinsIcon {
        public static final fN d = new fN();

        private fN() {
            super("mdx", Category.k, C1026Lt.a.Am, C1026Lt.a.Al, C1026Lt.a.Ao, C1026Lt.a.Ap, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fT extends HawkinsIcon {
        public static final fT d = new fT();

        private fT() {
            super("mdx-connected", Category.k, C1026Lt.a.Ak, C1026Lt.a.An, C1026Lt.a.Ag, C1026Lt.a.Ai, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0301gl extends HawkinsIcon {
        public static final C0301gl e = new C0301gl();

        private C0301gl() {
            super("newspaper", Category.k, C1026Lt.a.BS, C1026Lt.a.BT, C1026Lt.a.BU, C1026Lt.a.BV, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gE extends HawkinsIcon {
        public static final gE c = new gE();

        private gE() {
            super("phone", Category.k, C1026Lt.a.Dg, C1026Lt.a.Df, C1026Lt.a.Dj, C1026Lt.a.Db, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gA extends HawkinsIcon {
        public static final gA b = new gA();

        private gA() {
            super("phone-controller", Category.k, C1026Lt.a.Dd, C1026Lt.a.Dc, C1026Lt.a.Da, C1026Lt.a.De, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gC extends HawkinsIcon {
        public static final gC b = new gC();

        private gC() {
            super("picture-in-picture", Category.k, C1026Lt.a.Dn, C1026Lt.a.Dk, C1026Lt.a.Dh, C1026Lt.a.Di, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gM extends HawkinsIcon {
        public static final gM d = new gM();

        private gM() {
            super("presentation-chart", Category.k, C1026Lt.a.DZ, C1026Lt.a.Eg, C1026Lt.a.Ec, C1026Lt.a.Ea, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gS extends HawkinsIcon {
        public static final gS c = new gS();

        private gS() {
            super("print", Category.k, C1026Lt.a.Ew, C1026Lt.a.Ev, C1026Lt.a.Eq, C1026Lt.a.Eo, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gX extends HawkinsIcon {
        public static final gX d = new gX();

        private gX() {
            super("pull-request", Category.k, C1026Lt.a.EN, C1026Lt.a.EQ, C1026Lt.a.EH, C1026Lt.a.EK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0319hc extends HawkinsIcon {
        public static final C0319hc d = new C0319hc();

        private C0319hc() {
            super("qr-code", Category.k, C1026Lt.a.ER, C1026Lt.a.EV, C1026Lt.a.ES, C1026Lt.a.EU, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0332hp extends HawkinsIcon {
        public static final C0332hp e = new C0332hp();

        private C0332hp() {
            super("robot", Category.k, C1026Lt.a.Gd, C1026Lt.a.FZ, C1026Lt.a.Ga, C1026Lt.a.Gc, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ho  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0331ho extends HawkinsIcon {
        public static final C0331ho b = new C0331ho();

        private C0331ho() {
            super("rotate-power", Category.k, C1026Lt.a.Go, C1026Lt.a.Gs, C1026Lt.a.Gr, C1026Lt.a.Gq, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hU extends HawkinsIcon {
        public static final hU b = new hU();

        private hU() {
            super("signal", Category.k, C1026Lt.a.ID, C1026Lt.a.IA, C1026Lt.a.IB, C1026Lt.a.Iy, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hV extends HawkinsIcon {
        public static final hV d = new hV();

        private hV() {
            super("signal-cellular", Category.k, C1026Lt.a.Ix, C1026Lt.a.Iw, C1026Lt.a.Is, C1026Lt.a.Ip, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hT extends HawkinsIcon {
        public static final hT c = new hT();

        private hT() {
            super("signal-cellular-automirrored", Category.k, C1026Lt.a.Iv, C1026Lt.a.Iu, C1026Lt.a.Iq, C1026Lt.a.It, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class hS extends HawkinsIcon {
        public static final hS b = new hS();

        private hS() {
            super("signal-wifi", Category.k, C1026Lt.a.IE, C1026Lt.a.IH, C1026Lt.a.IC, C1026Lt.a.Iz, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ix  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0366ix extends HawkinsIcon {
        public static final C0366ix b = new C0366ix();

        private C0366ix() {
            super("storage-card", Category.k, C1026Lt.a.KS, C1026Lt.a.KT, C1026Lt.a.KP, C1026Lt.a.KK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$iz  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0368iz extends HawkinsIcon {
        public static final C0368iz b = new C0368iz();

        private C0368iz() {
            super("storage-local", Category.k, C1026Lt.a.Lh, C1026Lt.a.Le, C1026Lt.a.KZ, C1026Lt.a.La, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$iw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0365iw extends HawkinsIcon {
        public static final C0365iw d = new C0365iw();

        private C0365iw() {
            super("storage-local-archive", Category.k, C1026Lt.a.KV, C1026Lt.a.KX, C1026Lt.a.KQ, C1026Lt.a.KR, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iC extends HawkinsIcon {
        public static final iC e = new iC();

        private iC() {
            super("storage-local-deliver", Category.k, C1026Lt.a.KY, C1026Lt.a.Lb, C1026Lt.a.KU, C1026Lt.a.KW, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iF extends HawkinsIcon {
        public static final iF c = new iF();

        private iF() {
            super("storage-local-restore", Category.k, C1026Lt.a.Lg, C1026Lt.a.Lf, C1026Lt.a.Ld, C1026Lt.a.Lc, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iD extends HawkinsIcon {
        public static final iD d = new iD();

        private iD() {
            super("storage-usb", Category.k, C1026Lt.a.Lm, C1026Lt.a.Lj, C1026Lt.a.Ll, C1026Lt.a.Li, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iO extends HawkinsIcon {
        public static final iO b = new iO();

        private iO() {
            super(DeviceSurveySelectorViewModel.TABLET, Category.k, C1026Lt.a.Md, C1026Lt.a.Mc, C1026Lt.a.LX, C1026Lt.a.LZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0381jl extends HawkinsIcon {
        public static final C0381jl e = new C0381jl();

        private C0381jl() {
            super("train", Category.k, C1026Lt.a.NK, C1026Lt.a.NM, C1026Lt.a.NN, C1026Lt.a.NJ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jp  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0385jp extends HawkinsIcon {
        public static final C0385jp e = new C0385jp();

        private C0385jp() {
            super("tv", Category.k, C1026Lt.a.OH, C1026Lt.a.OI, C1026Lt.a.Os, C1026Lt.a.Ow, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0393jx extends HawkinsIcon {
        public static final C0393jx c = new C0393jx();

        private C0393jx() {
            super("tv-mobile", Category.k, C1026Lt.a.OD, C1026Lt.a.OF, C1026Lt.a.OB, C1026Lt.a.Ox, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0392jw extends HawkinsIcon {
        public static final C0392jw d = new C0392jw();

        private C0392jw() {
            super("tv-mobile-fill", Category.k, C1026Lt.a.Oy, C1026Lt.a.Oz, C1026Lt.a.OA, C1026Lt.a.Ot, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0391jv extends HawkinsIcon {
        public static final C0391jv e = new C0391jv();

        private C0391jv() {
            super("tv-remote", Category.k, C1026Lt.a.OC, C1026Lt.a.OK, C1026Lt.a.OG, C1026Lt.a.OE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$au  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0149au extends HawkinsIcon {
        public static final C0149au d = new C0149au();

        private C0149au() {
            super("calendar", Category.f13145o, C1026Lt.a.eK, C1026Lt.a.eN, C1026Lt.a.eD, C1026Lt.a.eB, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$at  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0148at extends HawkinsIcon {
        public static final C0148at d = new C0148at();

        private C0148at() {
            super("calendar-check", Category.f13145o, C1026Lt.a.ez, C1026Lt.a.eA, C1026Lt.a.eC, C1026Lt.a.eu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$aw  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0151aw extends HawkinsIcon {
        public static final C0151aw c = new C0151aw();

        private C0151aw() {
            super("calendar-off", Category.f13145o, C1026Lt.a.eH, C1026Lt.a.eJ, C1026Lt.a.eG, C1026Lt.a.eF, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$av  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0150av extends HawkinsIcon {
        public static final C0150av b = new C0150av();

        private C0150av() {
            super("calendar-off-automirrored", Category.f13145o, C1026Lt.a.eM, C1026Lt.a.eL, C1026Lt.a.eE, C1026Lt.a.eI, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aB extends HawkinsIcon {
        public static final aB e = new aB();

        private aB() {
            super("calendar-today", Category.f13145o, C1026Lt.a.eP, C1026Lt.a.eS, C1026Lt.a.eQ, C1026Lt.a.eO, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$bv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0177bv extends HawkinsIcon {
        public static final C0177bv e = new C0177bv();

        private C0177bv() {
            super("clock", Category.f13145o, C1026Lt.a.iH, C1026Lt.a.iG, C1026Lt.a.iJ, C1026Lt.a.iK, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eO extends HawkinsIcon {
        public static final eO e = new eO();

        private eO() {
            super("hourglass", Category.f13145o, C1026Lt.a.wd, C1026Lt.a.wb, C1026Lt.a.vZ, C1026Lt.a.wa, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hx  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0340hx extends HawkinsIcon {
        public static final C0340hx d = new C0340hx();

        private C0340hx() {
            super("schedule", Category.f13145o, C1026Lt.a.GL, C1026Lt.a.GQ, C1026Lt.a.GG, C1026Lt.a.GH, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0338hv extends HawkinsIcon {
        public static final C0338hv b = new C0338hv();

        private C0338hv() {
            super("schedule-plus", Category.f13145o, C1026Lt.a.GJ, C1026Lt.a.GI, C1026Lt.a.GM, C1026Lt.a.GK, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0377jh extends HawkinsIcon {
        public static final C0377jh c = new C0377jh();

        private C0377jh() {
            super("timer", Category.f13145o, C1026Lt.a.NE, C1026Lt.a.NF, C1026Lt.a.NB, C1026Lt.a.NC, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jZ extends HawkinsIcon {
        public static final jZ c = new jZ();

        private jZ() {
            super("watchlist", Category.f13145o, C1026Lt.a.Rf, C1026Lt.a.Rh, C1026Lt.a.Rc, C1026Lt.a.Rd, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$aa  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0129aa extends HawkinsIcon {
        public static final C0129aa d = new C0129aa();

        private C0129aa() {
            super("bell", Category.m, C1026Lt.a.cY, C1026Lt.a.da, C1026Lt.a.cX, C1026Lt.a.cT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ab  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0130ab extends HawkinsIcon {
        public static final C0130ab e = new C0130ab();

        private C0130ab() {
            super("bell-fill", Category.m, C1026Lt.a.cW, C1026Lt.a.cU, C1026Lt.a.cS, C1026Lt.a.cV, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ah  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0136ah extends HawkinsIcon {
        public static final C0136ah d = new C0136ah();

        private C0136ah() {
            super("bookmark", Category.m, C1026Lt.a.du, C1026Lt.a.dt, C1026Lt.a.dv, C1026Lt.a.dq, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ad  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0132ad extends HawkinsIcon {
        public static final C0132ad c = new C0132ad();

        private C0132ad() {
            super("bookmark-fill", Category.m, C1026Lt.a.dm, C1026Lt.a.dp, C1026Lt.a.f32do, C1026Lt.a.dn, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ax  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0152ax extends HawkinsIcon {
        public static final C0152ax c = new C0152ax();

        private C0152ax() {
            super("call", Category.m, C1026Lt.a.fb, C1026Lt.a.eZ, C1026Lt.a.eX, C1026Lt.a.eU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class aA extends HawkinsIcon {
        public static final aA c = new aA();

        private aA() {
            super("call-end", Category.m, C1026Lt.a.eT, C1026Lt.a.eV, C1026Lt.a.eW, C1026Lt.a.eR, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dh  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0217dh extends HawkinsIcon {
        public static final C0217dh c = new C0217dh();

        private C0217dh() {
            super("eye", Category.m, C1026Lt.a.pR, C1026Lt.a.pU, C1026Lt.a.pO, C1026Lt.a.pQ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0219dj extends HawkinsIcon {
        public static final C0219dj c = new C0219dj();

        private C0219dj() {
            super("eye-closed", Category.m, C1026Lt.a.pM, C1026Lt.a.pN, C1026Lt.a.pH, C1026Lt.a.pL, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$dn  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0223dn extends HawkinsIcon {
        public static final C0223dn b = new C0223dn();

        private C0223dn() {
            super("eye-off", Category.m, C1026Lt.a.pS, C1026Lt.a.pV, C1026Lt.a.pT, C1026Lt.a.pP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$eo  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0250eo extends HawkinsIcon {
        public static final C0250eo b = new C0250eo();

        private C0250eo() {
            super("grid", Category.m, C1026Lt.a.ue, C1026Lt.a.uf, C1026Lt.a.ud, C1026Lt.a.uh, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ep  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0251ep extends HawkinsIcon {
        public static final C0251ep c = new C0251ep();

        private C0251ep() {
            super("grid-fill", Category.m, C1026Lt.a.ub, C1026Lt.a.ug, C1026Lt.a.tZ, C1026Lt.a.tY, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ez  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0261ez extends HawkinsIcon {
        public static final C0261ez e = new C0261ez();

        private C0261ez() {
            super("heart", Category.m, C1026Lt.a.vj, C1026Lt.a.vi, C1026Lt.a.vc, C1026Lt.a.va, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class eC extends HawkinsIcon {
        public static final eC b = new eC();

        private eC() {
            super("heart-fill", Category.m, C1026Lt.a.uW, C1026Lt.a.uY, C1026Lt.a.uX, C1026Lt.a.uZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fi  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0271fi extends HawkinsIcon {
        public static final C0271fi e = new C0271fi();

        private C0271fi() {
            super("lightning", Category.m, C1026Lt.a.xS, C1026Lt.a.xZ, C1026Lt.a.xN, C1026Lt.a.xO, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fj  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0272fj extends HawkinsIcon {
        public static final C0272fj d = new C0272fj();

        private C0272fj() {
            super("lightning-alert", Category.m, C1026Lt.a.xI, C1026Lt.a.xH, C1026Lt.a.xK, C1026Lt.a.xG, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fl  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0274fl extends HawkinsIcon {
        public static final C0274fl e = new C0274fl();

        private C0274fl() {
            super("lightning-auto", Category.m, C1026Lt.a.xP, C1026Lt.a.xL, C1026Lt.a.xM, C1026Lt.a.xJ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$fm  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0275fm extends HawkinsIcon {
        public static final C0275fm c = new C0275fm();

        private C0275fm() {
            super("lightning-off", Category.m, C1026Lt.a.xR, C1026Lt.a.xQ, C1026Lt.a.xU, C1026Lt.a.xT, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fB extends HawkinsIcon {
        public static final fB c = new fB();

        private fB() {
            super("lock", Category.m, C1026Lt.a.yY, C1026Lt.a.zf, C1026Lt.a.zc, C1026Lt.a.za, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class fX extends HawkinsIcon {
        public static final fX c = new fX();

        private fX() {
            super("microphone", Category.m, C1026Lt.a.AM, C1026Lt.a.AN, C1026Lt.a.AH, C1026Lt.a.AG, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ga  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0290ga extends HawkinsIcon {
        public static final C0290ga e = new C0290ga();

        private C0290ga() {
            super("microphone-off", Category.m, C1026Lt.a.AK, C1026Lt.a.AL, C1026Lt.a.AI, C1026Lt.a.AJ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hg  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0323hg extends HawkinsIcon {
        public static final C0323hg b = new C0323hg();

        private C0323hg() {
            super("refresh", Category.m, C1026Lt.a.FC, C1026Lt.a.FD, C1026Lt.a.Fy, C1026Lt.a.Fz, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$hf  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0322hf extends HawkinsIcon {
        public static final C0322hf e = new C0322hf();

        private C0322hf() {
            super("refresh-exclamation-point", Category.m, C1026Lt.a.Fv, C1026Lt.a.Fw, C1026Lt.a.Fx, C1026Lt.a.Fu, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$iv  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0364iv extends HawkinsIcon {
        public static final C0364iv c = new C0364iv();

        private C0364iv() {
            super("star", Category.m, C1026Lt.a.KG, C1026Lt.a.KJ, C1026Lt.a.KF, C1026Lt.a.KH, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iA extends HawkinsIcon {
        public static final iA d = new iA();

        private iA() {
            super("star-fill", Category.m, C1026Lt.a.KB, C1026Lt.a.KI, C1026Lt.a.KC, C1026Lt.a.KE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iV extends HawkinsIcon {
        public static final iV e = new iV();

        private iV() {
            super("thumbs-down", Category.m, C1026Lt.a.MQ, C1026Lt.a.MY, C1026Lt.a.MR, C1026Lt.a.MU, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class iW extends HawkinsIcon {
        public static final iW b = new iW();

        private iW() {
            super("thumbs-down-fill", Category.m, C1026Lt.a.MT, C1026Lt.a.MS, C1026Lt.a.MM, C1026Lt.a.MP, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jb  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0371jb extends HawkinsIcon {
        public static final C0371jb d = new C0371jb();

        private C0371jb() {
            super("thumbs-up", Category.m, C1026Lt.a.Ne, C1026Lt.a.Na, C1026Lt.a.Nd, C1026Lt.a.Nb, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$je  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0374je extends HawkinsIcon {
        public static final C0374je b = new C0374je();

        private C0374je() {
            super("thumbs-up-fill", Category.m, C1026Lt.a.MV, C1026Lt.a.MW, C1026Lt.a.MX, C1026Lt.a.MZ, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jc  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0372jc extends HawkinsIcon {
        public static final C0372jc b = new C0372jc();

        private C0372jc() {
            super("thumbs-up-two", Category.m, C1026Lt.a.Nn, C1026Lt.a.No, C1026Lt.a.Nj, C1026Lt.a.Nh, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$jd  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0373jd extends HawkinsIcon {
        public static final C0373jd d = new C0373jd();

        private C0373jd() {
            super("thumbs-up-two-fill", Category.m, C1026Lt.a.Nf, C1026Lt.a.Ng, C1026Lt.a.Ni, C1026Lt.a.Nc, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jB extends HawkinsIcon {
        public static final jB b = new jB();

        private jB() {
            super("unlock", Category.m, C1026Lt.a.Pd, C1026Lt.a.Pe, C1026Lt.a.Pc, C1026Lt.a.OW, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class kb extends HawkinsIcon {
        public static final kb c = new kb();

        private kb() {
            super("warning", Category.m, C1026Lt.a.Re, C1026Lt.a.Rg, C1026Lt.a.QY, C1026Lt.a.QZ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jY extends HawkinsIcon {
        public static final jY c = new jY();

        private jY() {
            super("warning-fill", Category.m, C1026Lt.a.Ra, C1026Lt.a.QX, C1026Lt.a.Rb, C1026Lt.a.QT, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$e  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0235e extends HawkinsIcon {
        public static final C0235e e = new C0235e();

        private C0235e() {
            super("accessibility", Category.q, C1026Lt.a.e, C1026Lt.a.h, C1026Lt.a.d, C1026Lt.a.c, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0182c extends HawkinsIcon {
        public static final C0182c c = new C0182c();

        private C0182c() {
            super("accessibility-automirrored", Category.q, C1026Lt.a.i, C1026Lt.a.j, C1026Lt.a.a, C1026Lt.a.b, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cW extends HawkinsIcon {
        public static final cW b = new cW();

        private cW() {
            super("emoji-lol", Category.q, C1026Lt.a.oJ, C1026Lt.a.oL, C1026Lt.a.oK, C1026Lt.a.oN, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class cZ extends HawkinsIcon {
        public static final cZ c = new cZ();

        private cZ() {
            super("emoji-lol-fill", Category.q, C1026Lt.a.oI, C1026Lt.a.oM, C1026Lt.a.oF, C1026Lt.a.oE, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$ew  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0258ew extends HawkinsIcon {
        public static final C0258ew c = new C0258ew();

        private C0258ew() {
            super("handshake", Category.q, C1026Lt.a.uB, C1026Lt.a.uy, C1026Lt.a.ux, C1026Lt.a.uA, null);
        }
    }

    /* renamed from: com.netflix.hawkins.consumer.icons.HawkinsIcon$gi  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C0298gi extends HawkinsIcon {
        public static final C0298gi b = new C0298gi();

        private C0298gi() {
            super("multiplayer-online", Category.q, C1026Lt.a.BA, C1026Lt.a.Bz, C1026Lt.a.BB, C1026Lt.a.BC, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gT extends HawkinsIcon {
        public static final gT e = new gT();

        private gT() {
            super("profile-arrow", Category.q, C1026Lt.a.Eu, C1026Lt.a.Ex, C1026Lt.a.Et, C1026Lt.a.Es, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gW extends HawkinsIcon {
        public static final gW e = new gW();

        private gW() {
            super("profiles", Category.q, C1026Lt.a.EE, C1026Lt.a.EC, C1026Lt.a.EG, C1026Lt.a.ED, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class gY extends HawkinsIcon {
        public static final gY e = new gY();

        private gY() {
            super("profiles-fill", Category.q, C1026Lt.a.EA, C1026Lt.a.Ey, C1026Lt.a.EB, C1026Lt.a.Ez, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jG extends HawkinsIcon {
        public static final jG d = new jG();

        private jG() {
            super("user", Category.q, C1026Lt.a.PU, C1026Lt.a.PZ, C1026Lt.a.PH, C1026Lt.a.PG, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jI extends HawkinsIcon {
        public static final jI d = new jI();

        private jI() {
            super("user-add", Category.q, C1026Lt.a.Po, C1026Lt.a.Pp, C1026Lt.a.Pm, C1026Lt.a.Pn, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jF extends HawkinsIcon {
        public static final jF e = new jF();

        private jF() {
            super("user-alert", Category.q, C1026Lt.a.Pu, C1026Lt.a.Pr, C1026Lt.a.Ps, C1026Lt.a.Pq, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jH extends HawkinsIcon {
        public static final jH e = new jH();

        private jH() {
            super("user-checkmark", Category.q, C1026Lt.a.Px, C1026Lt.a.Pz, C1026Lt.a.Pw, C1026Lt.a.Pt, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jE extends HawkinsIcon {
        public static final jE b = new jE();

        private jE() {
            super("user-fill", Category.q, C1026Lt.a.PB, C1026Lt.a.PC, C1026Lt.a.Pv, C1026Lt.a.Py, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jJ extends HawkinsIcon {
        public static final jJ b = new jJ();

        private jJ() {
            super("user-incoming", Category.q, C1026Lt.a.PE, C1026Lt.a.PF, C1026Lt.a.PA, C1026Lt.a.PD, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jK extends HawkinsIcon {
        public static final jK b = new jK();

        private jK() {
            super("user-list", Category.q, C1026Lt.a.PL, C1026Lt.a.PM, C1026Lt.a.PO, C1026Lt.a.PJ, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jL extends HawkinsIcon {
        public static final jL e = new jL();

        private jL() {
            super("user-list-automirrored", Category.q, C1026Lt.a.PK, C1026Lt.a.PS, C1026Lt.a.PN, C1026Lt.a.PI, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jN extends HawkinsIcon {
        public static final jN d = new jN();

        private jN() {
            super("user-minus", Category.q, C1026Lt.a.PP, C1026Lt.a.PR, C1026Lt.a.PQ, C1026Lt.a.PT, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jM extends HawkinsIcon {
        public static final jM c = new jM();

        private jM() {
            super("user-outgoing", Category.q, C1026Lt.a.PW, C1026Lt.a.PV, C1026Lt.a.PY, C1026Lt.a.PX, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jQ extends HawkinsIcon {
        public static final jQ b = new jQ();

        private jQ() {
            super("user-spatial-audio", Category.q, C1026Lt.a.Qa, C1026Lt.a.Qc, C1026Lt.a.Qb, C1026Lt.a.Qd, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jR extends HawkinsIcon {
        public static final jR e = new jR();

        private jR() {
            super("user-star", Category.q, C1026Lt.a.Qf, C1026Lt.a.Qi, C1026Lt.a.Qh, C1026Lt.a.Qg, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jS extends HawkinsIcon {
        public static final jS c = new jS();

        private jS() {
            super("users-2", Category.q, C1026Lt.a.Ql, C1026Lt.a.Qk, C1026Lt.a.Qn, C1026Lt.a.Qe, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class jO extends HawkinsIcon {
        public static final jO e = new jO();

        private jO() {
            super("users-3", Category.q, C1026Lt.a.Qo, C1026Lt.a.Qp, C1026Lt.a.Qj, C1026Lt.a.Qm, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class bN {
        public /* synthetic */ bN(C8627dsp c8627dsp) {
            this();
        }

        private bN() {
        }
    }
}
