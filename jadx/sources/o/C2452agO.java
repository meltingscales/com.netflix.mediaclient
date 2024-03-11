package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2473agj;

/* renamed from: o.agO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2452agO {
    public static final C2452agO e = new C2452agO();

    /* renamed from: o.agO$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2450agM> {
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2450agM b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2475agl b2 = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2450agM(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2450agM c2450agM) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2450agM, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2450agM.e());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2450agM.c());
        }
    }

    private C2452agO() {
    }
}
