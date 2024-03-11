package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1354Yl;

/* renamed from: o.aap  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2152aap {
    public static final C2152aap a = new C2152aap();

    /* renamed from: o.aap$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1354Yl.d> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("createSSOToken");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1354Yl.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str != null) {
                return new C1354Yl.d(str);
            }
            C8956gW.a(jsonReader, "createSSOToken");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1354Yl.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("createSSOToken");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    private C2152aap() {
    }
}
