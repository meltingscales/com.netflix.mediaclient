package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2635ajm;

/* renamed from: o.ajn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2636ajn {
    public static final C2636ajn c = new C2636ajn();

    /* renamed from: o.ajn$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2635ajm> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "tags");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2635ajm b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.c, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2635ajm(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2635ajm c2635ajm) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2635ajm, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2635ajm.e());
            interfaceC9069id.e("tags");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.c, false, 1, null)))).e(interfaceC9069id, c9028hp, c2635ajm.a());
        }
    }

    private C2636ajn() {
    }

    /* renamed from: o.ajn$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2635ajm.d> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayName", "isDisplayable");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2635ajm.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2635ajm.d(str, str2, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2635ajm.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("displayName");
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("isDisplayable");
            C8953gT.l.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
