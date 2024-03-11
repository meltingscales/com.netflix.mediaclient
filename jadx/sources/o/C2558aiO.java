package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.TextEvidenceClassification;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2560aiQ;

/* renamed from: o.aiO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2558aiO {
    public static final C2558aiO c = new C2558aiO();

    /* renamed from: o.aiO$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2560aiQ> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "taglineMessages");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2560aiQ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(e.d, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2560aiQ(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2560aiQ c2560aiQ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2560aiQ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2560aiQ.a());
            interfaceC9069id.e("taglineMessages");
            C8953gT.d(C8953gT.a(C8953gT.c(e.d, false, 1, null))).e(interfaceC9069id, c9028hp, c2560aiQ.d());
        }
    }

    private C2558aiO() {
    }

    /* renamed from: o.aiO$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2560aiQ.c> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "tagline", "typedClassification");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2560aiQ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            TextEvidenceClassification textEvidenceClassification = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    textEvidenceClassification = (TextEvidenceClassification) C8953gT.d(C3454azL.e).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2560aiQ.c(str, str2, textEvidenceClassification);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2560aiQ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("tagline");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("typedClassification");
            C8953gT.d(C3454azL.e).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
