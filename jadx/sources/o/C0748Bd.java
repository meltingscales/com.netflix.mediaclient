package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.Bd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0748Bd {
    public static final C0748Bd d = new C0748Bd();

    /* renamed from: o.Bd$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0746Bb> {
        private static final List<String> b;
        public static final a d = new a();
        public static final int e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "token");
            b = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0746Bb b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C0746Bb(str, str2);
            } else {
                C8956gW.a(jsonReader, "token");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0746Bb c0746Bb) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0746Bb, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0746Bb.b());
            interfaceC9069id.e("token");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0746Bb.e());
        }
    }

    private C0748Bd() {
    }
}
