package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSTemplateItemFlexibleSize;
import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BX;

/* renamed from: o.Ca  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0773Ca {
    public static final C0773Ca c = new C0773Ca();

    /* renamed from: o.Ca$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BX> {
        public static final d a = new d();
        private static final List<String> b;
        public static final int c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BX b(JsonReader jsonReader, C9028hp c9028hp) {
            BX.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            BX.a aVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSTemplateItemFlexible"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = c.e.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSTemplateItemNumColumns"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = a.a.b(jsonReader, c9028hp);
            }
            return new BX(str, dVar, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BX bx) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bx, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bx.e());
            if (bx.d() != null) {
                c.e.e(interfaceC9069id, c9028hp, bx.d());
            }
            if (bx.c() != null) {
                a.a.e(interfaceC9069id, c9028hp, bx.c());
            }
        }
    }

    private C0773Ca() {
    }

    /* renamed from: o.Ca$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BX.d> {
        public static final int c;
        private static final List<String> d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j(BaseSubtitle.ATTR_ORDER, "size");
            d = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BX.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            CLCSTemplateItemFlexibleSize cLCSTemplateItemFlexibleSize = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cLCSTemplateItemFlexibleSize = C0862Fl.b.b(jsonReader, c9028hp);
                }
            }
            if (cLCSTemplateItemFlexibleSize != null) {
                return new BX.d(num, cLCSTemplateItemFlexibleSize);
            }
            C8956gW.a(jsonReader, "size");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BX.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(BaseSubtitle.ATTR_ORDER);
            C8953gT.n.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("size");
            C0862Fl.b.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.Ca$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BX.a> {
        public static final a a = new a();
        public static final int b;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j(BaseSubtitle.ATTR_ORDER, "numColumns");
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BX.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new BX.a(num2, num.intValue());
            }
            C8956gW.a(jsonReader, "numColumns");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BX.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(BaseSubtitle.ATTR_ORDER);
            C8953gT.n.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("numColumns");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.d()));
        }
    }
}
