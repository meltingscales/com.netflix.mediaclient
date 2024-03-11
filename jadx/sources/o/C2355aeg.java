package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2357aei;
import o.C2511ahU;
import o.C2624ajb;
import o.C2626ajd;
import o.C2629ajg;
import o.C2632ajj;

/* renamed from: o.aeg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2355aeg {
    public static final C2355aeg b = new C2355aeg();

    /* renamed from: o.aeg$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2357aei> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "latestYear", "shortSynopsis", "supportsInteractiveExperiences");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2357aei b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2357aei.a aVar = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = d.b.b(jsonReader, c9028hp);
            }
            C2357aei.a aVar2 = aVar;
            jsonReader.q();
            C2630ajh b2 = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2514ahX b3 = C2511ahU.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2625ajc b4 = C2626ajd.d.d.b(jsonReader, c9028hp);
            jsonReader.q();
            C2628ajf b5 = C2624ajb.d.b.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2357aei(str, num, str2, bool, aVar2, b2, b3, b4, b5, C2629ajg.b.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2357aei c2357aei) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2357aei, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2357aei.h());
            interfaceC9069id.e("latestYear");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2357aei.a());
            interfaceC9069id.e("shortSynopsis");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2357aei.b());
            interfaceC9069id.e("supportsInteractiveExperiences");
            C8953gT.l.e(interfaceC9069id, c9028hp, c2357aei.c());
            if (c2357aei.e() != null) {
                d.b.e(interfaceC9069id, c9028hp, c2357aei.e());
            }
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2357aei.g());
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, c2357aei.d());
            C2626ajd.d.d.e(interfaceC9069id, c9028hp, c2357aei.j());
            C2624ajb.d.b.e(interfaceC9069id, c9028hp, c2357aei.i());
            C2629ajg.b.a.e(interfaceC9069id, c9028hp, c2357aei.f());
        }
    }

    private C2355aeg() {
    }

    /* renamed from: o.aeg$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2357aei.a> {
        private static final List<String> a;
        public static final d b = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "numSeasonsLabel");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2357aei.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2357aei.a(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2357aei.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.e()));
            interfaceC9069id.e("numSeasonsLabel");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
