package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSLoggableSessionType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AH;
import o.C0752Bh;
import o.C0756Bl;

/* renamed from: o.Bf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0750Bf {
    public static final C0750Bf c = new C0750Bf();

    /* renamed from: o.Bf$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0752Bh> {
        public static final e a = new e();
        public static final int b;
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "errorHandling");
            c = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh b(JsonReader jsonReader, C9028hp c9028hp) {
            C0752Bh.o oVar;
            C0752Bh.u uVar;
            C0752Bh.t tVar;
            C0752Bh.r rVar;
            C0752Bh.q qVar;
            C0752Bh.m mVar;
            C0752Bh.j jVar;
            C0752Bh.n nVar;
            C0752Bh.p pVar;
            C0752Bh.s sVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0752Bh.l lVar = null;
            String str = null;
            C0752Bh.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C0752Bh.d) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSDismiss"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                oVar = k.c.b(jsonReader, c9028hp);
            } else {
                oVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSSubmitAction"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                uVar = x.a.b(jsonReader, c9028hp);
            } else {
                uVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSSendFeedback"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                tVar = y.e.b(jsonReader, c9028hp);
            } else {
                tVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSOpenWebView"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                rVar = t.e.b(jsonReader, c9028hp);
            } else {
                rVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSRecordRdidCtaConsent"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                qVar = r.e.b(jsonReader, c9028hp);
            } else {
                qVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSClientLogging"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                mVar = m.c.b(jsonReader, c9028hp);
            } else {
                mVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSClientDebugLogging"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = l.e.b(jsonReader, c9028hp);
            } else {
                jVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSInAppNavigation"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                nVar = n.d.b(jsonReader, c9028hp);
            } else {
                nVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSRequestScreenUpdate"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                pVar = p.c.b(jsonReader, c9028hp);
            } else {
                pVar = null;
            }
            C0752Bh.p pVar2 = pVar;
            if (C9014hb.d(C9014hb.c("CLCSNavigateBack"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                sVar = s.d.b(jsonReader, c9028hp);
            } else {
                sVar = null;
            }
            C0752Bh.s sVar2 = sVar;
            if (C9014hb.d(C9014hb.c("CLCSLogOut"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                lVar = q.b.b(jsonReader, c9028hp);
            }
            return new C0752Bh(str, dVar, oVar, uVar, tVar, rVar, qVar, mVar, jVar, nVar, pVar2, sVar2, lVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh c0752Bh) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0752Bh, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0752Bh.m());
            interfaceC9069id.e("errorHandling");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, c0752Bh.d());
            if (c0752Bh.c() != null) {
                k.c.e(interfaceC9069id, c9028hp, c0752Bh.c());
            }
            if (c0752Bh.o() != null) {
                x.a.e(interfaceC9069id, c9028hp, c0752Bh.o());
            }
            if (c0752Bh.n() != null) {
                y.e.e(interfaceC9069id, c9028hp, c0752Bh.n());
            }
            if (c0752Bh.f() != null) {
                t.e.e(interfaceC9069id, c9028hp, c0752Bh.f());
            }
            if (c0752Bh.g() != null) {
                r.e.e(interfaceC9069id, c9028hp, c0752Bh.g());
            }
            if (c0752Bh.b() != null) {
                m.c.e(interfaceC9069id, c9028hp, c0752Bh.b());
            }
            if (c0752Bh.e() != null) {
                l.e.e(interfaceC9069id, c9028hp, c0752Bh.e());
            }
            if (c0752Bh.a() != null) {
                n.d.e(interfaceC9069id, c9028hp, c0752Bh.a());
            }
            if (c0752Bh.i() != null) {
                p.c.e(interfaceC9069id, c9028hp, c0752Bh.i());
            }
            if (c0752Bh.j() != null) {
                s.d.e(interfaceC9069id, c9028hp, c0752Bh.j());
            }
            if (c0752Bh.h() != null) {
                q.b.e(interfaceC9069id, c9028hp, c0752Bh.h());
            }
        }
    }

    private C0750Bf() {
    }

    /* renamed from: o.Bf$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0752Bh.d> {
        public static final int a;
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0752Bh.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0752Bh.k kVar = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSEffectErrorHandlingAlert"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                kVar = o.e.b(jsonReader, c9028hp);
            }
            return new C0752Bh.d(str, kVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            if (dVar.a() != null) {
                o.e.e(interfaceC9069id, c9028hp, dVar.a());
            }
        }
    }

    /* renamed from: o.Bf$o */
    /* loaded from: classes2.dex */
    public static final class o implements InterfaceC8949gP<C0752Bh.k> {
        public static final int a;
        private static final List<String> d;
        public static final o e = new o();

        private o() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("alert");
            d = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0752Bh.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0752Bh.b bVar = null;
            while (jsonReader.a(d) == 0) {
                bVar = (C0752Bh.b) C8953gT.d(C8953gT.a(a.e, true)).b(jsonReader, c9028hp);
            }
            return new C0752Bh.k(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("alert");
            C8953gT.d(C8953gT.a(a.e, true)).e(interfaceC9069id, c9028hp, kVar.c());
        }
    }

    /* renamed from: o.Bf$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0752Bh.b> {
        private static final List<String> b;
        public static final int c;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0752Bh.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AE b2 = AH.e.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0752Bh.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            AH.e.d.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.Bf$k */
    /* loaded from: classes2.dex */
    public static final class k implements InterfaceC8949gP<C0752Bh.o> {
        private static final List<String> b;
        public static final k c = new k();
        public static final int e;

        private k() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("loggingCommand");
            b = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new C0752Bh.o(str);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("loggingCommand");
            C8953gT.t.e(interfaceC9069id, c9028hp, oVar.e());
        }
    }

    /* renamed from: o.Bf$x */
    /* loaded from: classes2.dex */
    public static final class x implements InterfaceC8949gP<C0752Bh.u> {
        public static final x a = new x();
        public static final int c;
        private static final List<String> e;

        private x() {
        }

        static {
            List<String> j;
            j = C8569dql.j("loggingCommand", "serverAction", "inputFieldRequirements");
            e = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh.u b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(j.e, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0752Bh.u(str2, str, list);
            }
            C8956gW.a(jsonReader, "serverAction");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.u uVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) uVar, "");
            interfaceC9069id.e("loggingCommand");
            C8953gT.t.e(interfaceC9069id, c9028hp, uVar.e());
            interfaceC9069id.e("serverAction");
            C8953gT.p.e(interfaceC9069id, c9028hp, uVar.b());
            interfaceC9069id.e("inputFieldRequirements");
            C8953gT.d(C8953gT.a(C8953gT.c(j.e, false, 1, null))).e(interfaceC9069id, c9028hp, uVar.c());
        }
    }

    /* renamed from: o.Bf$j */
    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<C0752Bh.h> {
        public static final int a;
        private static final List<String> b;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "field", "required");
            b = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0752Bh.e eVar = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    eVar = (C0752Bh.e) C8953gT.a(d.b, true).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (eVar == null) {
                C8956gW.a(jsonReader, "field");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C0752Bh.h(str, eVar, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "required");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("field");
            C8953gT.a(d.b, true).e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e("required");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(hVar.c()));
        }
    }

    /* renamed from: o.Bf$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0752Bh.e> {
        public static final d b = new d();
        public static final int d;
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0752Bh.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0751Bg b2 = C0756Bl.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0752Bh.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            C0756Bl.b.b.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.Bf$y */
    /* loaded from: classes2.dex */
    public static final class y implements InterfaceC8949gP<C0752Bh.t> {
        private static final List<String> b;
        public static final int d;
        public static final y e = new y();

        private y() {
        }

        static {
            List<String> j;
            j = C8569dql.j("serverFeedback", "inputFields");
            b = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.t b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(g.d, true))).b(jsonReader, c9028hp);
                } else {
                    return new C0752Bh.t(str, list);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.t tVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) tVar, "");
            interfaceC9069id.e("serverFeedback");
            C8953gT.d(C8953gT.p).e(interfaceC9069id, c9028hp, tVar.c());
            interfaceC9069id.e("inputFields");
            C8953gT.d(C8953gT.a(C8953gT.a(g.d, true))).e(interfaceC9069id, c9028hp, tVar.a());
        }
    }

    /* renamed from: o.Bf$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<C0752Bh.g> {
        private static final List<String> b;
        public static final int c;
        public static final g d = new g();

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0751Bg b2 = C0756Bl.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0752Bh.g(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.e());
            C0756Bl.b.b.e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* renamed from: o.Bf$t */
    /* loaded from: classes2.dex */
    public static final class t implements InterfaceC8949gP<C0752Bh.r> {
        private static final List<String> a;
        public static final int b;
        public static final t e = new t();

        private t() {
        }

        static {
            List<String> j;
            j = C8569dql.j("uri", "useAutoLogin", "useEmbeddedWebView");
            a = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0752Bh.r b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0752Bh.r(str, bool, bool2);
            }
            C8956gW.a(jsonReader, "uri");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.r rVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) rVar, "");
            interfaceC9069id.e("uri");
            C8953gT.p.e(interfaceC9069id, c9028hp, rVar.d());
            interfaceC9069id.e("useAutoLogin");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, rVar.e());
            interfaceC9069id.e("useEmbeddedWebView");
            c8994hH.e(interfaceC9069id, c9028hp, rVar.a());
        }
    }

    /* renamed from: o.Bf$r */
    /* loaded from: classes2.dex */
    public static final class r implements InterfaceC8949gP<C0752Bh.q> {
        public static final int a;
        private static final List<String> b;
        public static final r e = new r();

        private r() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("rdidCtaConsentState");
            b = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0752Bh.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0752Bh.v vVar = null;
            while (jsonReader.a(b) == 0) {
                vVar = (C0752Bh.v) C8953gT.d(C8953gT.c(u.e, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C0752Bh.q(vVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("rdidCtaConsentState");
            C8953gT.d(C8953gT.c(u.e, false, 1, null)).e(interfaceC9069id, c9028hp, qVar.d());
        }
    }

    /* renamed from: o.Bf$u */
    /* loaded from: classes2.dex */
    public static final class u implements InterfaceC8949gP<C0752Bh.v> {
        public static final int b;
        private static final List<String> d;
        public static final u e = new u();

        private u() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "consentId", "displayedAt", "isDenied");
            d = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh.v b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Instant instant = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0752Bh.v(str, str2, instant, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.v vVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) vVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, vVar.b());
            interfaceC9069id.e("consentId");
            C8953gT.t.e(interfaceC9069id, c9028hp, vVar.e());
            interfaceC9069id.e("displayedAt");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, vVar.d());
            interfaceC9069id.e("isDenied");
            C8953gT.l.e(interfaceC9069id, c9028hp, vVar.c());
        }
    }

    /* renamed from: o.Bf$m */
    /* loaded from: classes2.dex */
    public static final class m implements InterfaceC8949gP<C0752Bh.m> {
        public static final int a;
        public static final m c = new m();
        private static final List<String> d;

        private m() {
        }

        static {
            List<String> j;
            j = C8569dql.j("type", NotificationFactory.DATA);
            d = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0752Bh.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            CLCSLoggableSessionType cLCSLoggableSessionType = null;
            C0752Bh.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    cLCSLoggableSessionType = C0854Fd.c.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (C0752Bh.a) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (cLCSLoggableSessionType != null) {
                return new C0752Bh.m(cLCSLoggableSessionType, aVar);
            }
            C8956gW.a(jsonReader, "type");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("type");
            C0854Fd.c.e(interfaceC9069id, c9028hp, mVar.e());
            interfaceC9069id.e(NotificationFactory.DATA);
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, mVar.d());
        }
    }

    /* renamed from: o.Bf$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0752Bh.a> {
        public static final b b = new b();
        public static final int c;
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "viewName", "contextName", "trackingInfo");
            d = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str4 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0752Bh.a(str, str2, str3, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("viewName");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("contextName");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.Bf$l */
    /* loaded from: classes2.dex */
    public static final class l implements InterfaceC8949gP<C0752Bh.j> {
        private static final List<String> c;
        public static final int d;
        public static final l e = new l();

        private l() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("debugData");
            c = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0752Bh.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str != null) {
                return new C0752Bh.j(str);
            }
            C8956gW.a(jsonReader, "debugData");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("debugData");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.a());
        }
    }

    /* renamed from: o.Bf$n */
    /* loaded from: classes2.dex */
    public static final class n implements InterfaceC8949gP<C0752Bh.n> {
        public static final int c;
        public static final n d = new n();
        private static final List<String> e;

        private n() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("location");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0752Bh.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0752Bh.f fVar = null;
            while (jsonReader.a(e) == 0) {
                fVar = (C0752Bh.f) C8953gT.c(i.c, false, 1, null).b(jsonReader, c9028hp);
            }
            if (fVar != null) {
                return new C0752Bh.n(fVar);
            }
            C8956gW.a(jsonReader, "location");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("location");
            C8953gT.c(i.c, false, 1, null).e(interfaceC9069id, c9028hp, nVar.c());
        }
    }

    /* renamed from: o.Bf$i */
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<C0752Bh.f> {
        private static final List<String> b;
        public static final i c = new i();
        public static final int e;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "universal");
            b = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0752Bh.f(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.a());
            interfaceC9069id.e("universal");
            C8953gT.t.e(interfaceC9069id, c9028hp, fVar.d());
        }
    }

    /* renamed from: o.Bf$p */
    /* loaded from: classes2.dex */
    public static final class p implements InterfaceC8949gP<C0752Bh.p> {
        private static final List<String> b;
        public static final p c = new p();
        public static final int d;

        private p() {
        }

        static {
            List<String> j;
            j = C8569dql.j("serverScreenUpdate", "inputFieldRequirements", "loggingCommand", "loggingAction");
            b = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(f.b, false, 1, null))).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0752Bh.p(str, list, str2, str3);
            }
            C8956gW.a(jsonReader, "serverScreenUpdate");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("serverScreenUpdate");
            C8953gT.p.e(interfaceC9069id, c9028hp, pVar.c());
            interfaceC9069id.e("inputFieldRequirements");
            C8953gT.d(C8953gT.a(C8953gT.c(f.b, false, 1, null))).e(interfaceC9069id, c9028hp, pVar.a());
            interfaceC9069id.e("loggingCommand");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, pVar.d());
            interfaceC9069id.e("loggingAction");
            c8994hH.e(interfaceC9069id, c9028hp, pVar.b());
        }
    }

    /* renamed from: o.Bf$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<C0752Bh.i> {
        public static final int a;
        public static final f b = new f();
        private static final List<String> c;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "field", "required");
            c = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0752Bh.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0752Bh.c cVar = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cVar = (C0752Bh.c) C8953gT.a(h.d, true).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (cVar == null) {
                C8956gW.a(jsonReader, "field");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C0752Bh.i(str, cVar, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "required");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.c());
            interfaceC9069id.e("field");
            C8953gT.a(h.d, true).e(interfaceC9069id, c9028hp, iVar.a());
            interfaceC9069id.e("required");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(iVar.d()));
        }
    }

    /* renamed from: o.Bf$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<C0752Bh.c> {
        private static final List<String> a;
        public static final int c;
        public static final h d = new h();

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0751Bg b = C0756Bl.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0752Bh.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            C0756Bl.b.b.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.Bf$s */
    /* loaded from: classes2.dex */
    public static final class s implements InterfaceC8949gP<C0752Bh.s> {
        private static final List<String> a;
        public static final s d = new s();
        public static final int e;

        private s() {
        }

        static {
            List<String> j;
            j = C8569dql.j("loggingCommand", "loggingAction", "navigationMarker");
            a = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.s b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else {
                    return new C0752Bh.s(str, str2, str3);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.s sVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) sVar, "");
            interfaceC9069id.e("loggingCommand");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, sVar.e());
            interfaceC9069id.e("loggingAction");
            c8994hH.e(interfaceC9069id, c9028hp, sVar.a());
            interfaceC9069id.e("navigationMarker");
            c8994hH.e(interfaceC9069id, c9028hp, sVar.c());
        }
    }

    /* renamed from: o.Bf$q */
    /* loaded from: classes2.dex */
    public static final class q implements InterfaceC8949gP<C0752Bh.l> {
        private static final List<String> a;
        public static final q b = new q();
        public static final int c;

        private q() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("loggingCommand");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0752Bh.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new C0752Bh.l(str);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0752Bh.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("loggingCommand");
            C8953gT.t.e(interfaceC9069id, c9028hp, lVar.c());
        }
    }
}
