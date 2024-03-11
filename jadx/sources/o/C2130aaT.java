package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1373Yx;

/* renamed from: o.aaT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2130aaT {
    public static final C2130aaT c = new C2130aaT();

    /* renamed from: o.aaT$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1373Yx.e> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("hideTitleViewing");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1373Yx.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1373Yx.d dVar = null;
            while (jsonReader.a(a) == 0) {
                dVar = (C1373Yx.d) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1373Yx.e(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1373Yx.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("hideTitleViewing");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private C2130aaT() {
    }

    /* renamed from: o.aaT$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1373Yx.d> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", VisualStateDefinition.ELEMENT_STATE.RESULT);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1373Yx.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C1373Yx.d(str, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, VisualStateDefinition.ELEMENT_STATE.RESULT);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1373Yx.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e(VisualStateDefinition.ELEMENT_STATE.RESULT);
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(dVar.e()));
        }
    }
}
