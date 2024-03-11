package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.aff  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2407aff {
    public static final C2407aff c = new C2407aff();

    /* renamed from: o.aff$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2409afh> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "headerId", "headerText");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2409afh b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2409afh(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2409afh c2409afh) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2409afh, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2409afh.c());
            interfaceC9069id.e("headerId");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2409afh.e());
            interfaceC9069id.e("headerText");
            c8994hH.e(interfaceC9069id, c9028hp, c2409afh.b());
        }
    }

    private C2407aff() {
    }
}
