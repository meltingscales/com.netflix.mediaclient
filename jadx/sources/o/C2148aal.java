package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1347Ye;

/* renamed from: o.aal  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2148aal {
    public static final C2148aal a = new C2148aal();

    /* renamed from: o.aal$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1347Ye.d> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("createAutoLoginToken");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1347Ye.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str != null) {
                return new C1347Ye.d(str);
            }
            C8956gW.a(jsonReader, "createAutoLoginToken");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1347Ye.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("createAutoLoginToken");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    private C2148aal() {
    }
}
