package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AJ;
import o.AQ;
import o.AT;
import o.AV;
import o.BE;
import o.BL;
import o.BN;
import o.BQ;
import o.BS;
import o.BW;
import o.C0757Bm;
import o.C0761Bq;
import o.C0763Bs;
import o.C0766Bv;
import o.C0768Bx;
import o.C0769By;
import o.C0770Bz;
import o.C0775Cc;
import o.C0778Cf;
import o.C0783Ck;

/* loaded from: classes2.dex */
public final class AY {
    public static final AY e = new AY();

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AV> {
        public static final b b = new b();
        private static final List<String> c;
        public static final int d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            c = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AV b(JsonReader jsonReader, C9028hp c9028hp) {
            AV.a aVar;
            BD bd;
            AF af;
            C0776Cd c0776Cd;
            C0784Cl c0784Cl;
            C0759Bo c0759Bo;
            BA ba;
            AM am;
            C0762Br c0762Br;
            C0760Bp c0760Bp;
            C0777Ce c0777Ce;
            C0754Bj c0754Bj;
            BV bv;
            BC bc;
            BJ bj;
            AR ar;
            BM bm;
            BT bt;
            BO bo;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0764Bt c0764Bt = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSInterstitialLegacyUMA"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = a.a.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSModal"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bd = BE.a.e.b(jsonReader, c9028hp);
            } else {
                bd = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSBanner"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                af = AJ.e.c.b(jsonReader, c9028hp);
            } else {
                af = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSToast"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0776Cd = C0778Cf.e.b.b(jsonReader, c9028hp);
            } else {
                c0776Cd = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSVerticalStack"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0784Cl = C0783Ck.e.c.b(jsonReader, c9028hp);
            } else {
                c0784Cl = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSHorizontalStack"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0759Bo = C0763Bs.a.a.b(jsonReader, c9028hp);
            } else {
                c0759Bo = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSLayout"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                ba = C0770Bz.i.d.b(jsonReader, c9028hp);
            } else {
                ba = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSButton"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                am = AT.b.a.b(jsonReader, c9028hp);
            } else {
                am = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSIcon"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0762Br = C0761Bq.e.c.b(jsonReader, c9028hp);
            } else {
                c0762Br = null;
            }
            C0762Br c0762Br2 = c0762Br;
            if (C9014hb.d(C9014hb.c("CLCSImageComponent"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0760Bp = C0766Bv.c.b.b(jsonReader, c9028hp);
            } else {
                c0760Bp = null;
            }
            C0760Bp c0760Bp2 = c0760Bp;
            if (C9014hb.d(C9014hb.c("CLCSText"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0777Ce = C0775Cc.f.e.b(jsonReader, c9028hp);
            } else {
                c0777Ce = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSHorizontalDivider"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0754Bj = C0757Bm.c.e.b(jsonReader, c9028hp);
            } else {
                c0754Bj = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSSpacer"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bv = BS.c.c.b(jsonReader, c9028hp);
            } else {
                bv = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSInput"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bc = C0769By.a.a.b(jsonReader, c9028hp);
            } else {
                bc = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSPhoneInput"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bj = BL.g.a.b(jsonReader, c9028hp);
            } else {
                bj = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSCheckbox"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                ar = AQ.e.c.b(jsonReader, c9028hp);
            } else {
                ar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSPinEntry"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bm = BN.c.c.b(jsonReader, c9028hp);
            } else {
                bm = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSStaticList"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bt = BW.j.e.b(jsonReader, c9028hp);
            } else {
                bt = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSSelectableCard"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bo = BQ.e.d.b(jsonReader, c9028hp);
            } else {
                bo = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSInputCopyLink"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c0764Bt = C0768Bx.e.d.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new AV(str, str2, aVar, bd, af, c0776Cd, c0784Cl, c0759Bo, ba, am, c0762Br2, c0760Bp2, c0777Ce, c0754Bj, bv, bc, bj, ar, bm, bt, bo, c0764Bt);
            }
            C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AV av) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) av, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, av.y());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, av.g());
            if (av.k() != null) {
                a.a.e(interfaceC9069id, c9028hp, av.k());
            }
            if (av.o() != null) {
                BE.a.e.e(interfaceC9069id, c9028hp, av.o());
            }
            if (av.e() != null) {
                AJ.e.c.e(interfaceC9069id, c9028hp, av.e());
            }
            if (av.t() != null) {
                C0778Cf.e.b.e(interfaceC9069id, c9028hp, av.t());
            }
            if (av.v() != null) {
                C0783Ck.e.c.e(interfaceC9069id, c9028hp, av.v());
            }
            if (av.c() != null) {
                C0763Bs.a.a.e(interfaceC9069id, c9028hp, av.c());
            }
            if (av.n() != null) {
                C0770Bz.i.d.e(interfaceC9069id, c9028hp, av.n());
            }
            if (av.b() != null) {
                AT.b.a.e(interfaceC9069id, c9028hp, av.b());
            }
            if (av.f() != null) {
                C0761Bq.e.c.e(interfaceC9069id, c9028hp, av.f());
            }
            if (av.j() != null) {
                C0766Bv.c.b.e(interfaceC9069id, c9028hp, av.j());
            }
            if (av.q() != null) {
                C0775Cc.f.e.e(interfaceC9069id, c9028hp, av.q());
            }
            if (av.a() != null) {
                C0757Bm.c.e.e(interfaceC9069id, c9028hp, av.a());
            }
            if (av.p() != null) {
                BS.c.c.e(interfaceC9069id, c9028hp, av.p());
            }
            if (av.i() != null) {
                C0769By.a.a.e(interfaceC9069id, c9028hp, av.i());
            }
            if (av.m() != null) {
                BL.g.a.e(interfaceC9069id, c9028hp, av.m());
            }
            if (av.d() != null) {
                AQ.e.c.e(interfaceC9069id, c9028hp, av.d());
            }
            if (av.l() != null) {
                BN.c.c.e(interfaceC9069id, c9028hp, av.l());
            }
            if (av.r() != null) {
                BW.j.e.e(interfaceC9069id, c9028hp, av.r());
            }
            if (av.s() != null) {
                BQ.e.d.e(interfaceC9069id, c9028hp, av.s());
            }
            if (av.h() != null) {
                C0768Bx.e.d.e(interfaceC9069id, c9028hp, av.h());
            }
        }
    }

    private AY() {
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AV.a> {
        public static final a a = new a();
        public static final int c;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("payload");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AV.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new AV.a(str);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AV.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("payload");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
