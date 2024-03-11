package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2637ajo;

/* renamed from: o.ajl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2634ajl {
    public static final C2634ajl e = new C2634ajl();

    /* renamed from: o.ajl$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2637ajo> {
        public static final a a = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "startCreditOffsetSec", "startRecapOffsetSec", "endCreditOffsetSec", "endRecapOffsetSec", "skipContentTimeCodes");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2637ajo b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    num3 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    num4 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(b.e, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2637ajo(str, num, num2, num3, num4, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2637ajo c2637ajo) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2637ajo, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2637ajo.j());
            interfaceC9069id.e("startCreditOffsetSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, c2637ajo.c());
            interfaceC9069id.e("startRecapOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2637ajo.d());
            interfaceC9069id.e("endCreditOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2637ajo.e());
            interfaceC9069id.e("endRecapOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2637ajo.a());
            interfaceC9069id.e("skipContentTimeCodes");
            C8953gT.d(C8953gT.a(C8953gT.c(b.e, false, 1, null))).e(interfaceC9069id, c9028hp, c2637ajo.b());
        }
    }

    private C2634ajl() {
    }

    /* renamed from: o.ajl$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2637ajo.d> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "label", "startSec", "endSec");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2637ajo.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2637ajo.d(str, str2, num, num2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2637ajo.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("label");
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("startSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("endSec");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }
}
