package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC8991hE;

/* renamed from: o.ia  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9066ia {
    public static final C9066ia e = new C9066ia();

    /* renamed from: o.ia$c */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    private C9066ia() {
    }

    public final <D extends InterfaceC8991hE.b> C8954gU<D> c(JsonReader jsonReader, InterfaceC8991hE<D> interfaceC8991hE, UUID uuid, C9028hp c9028hp, Set<C9031hs> set) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) interfaceC8991hE, "");
        C8632dsu.c((Object) c9028hp, "");
        jsonReader.c();
        Map<String, ? extends Object> map = null;
        InterfaceC8991hE.b bVar = null;
        List<C9035hw> list = null;
        while (jsonReader.g()) {
            String n = jsonReader.n();
            int hashCode = n.hashCode();
            if (hashCode != -1809421292) {
                if (hashCode == -1294635157) {
                    if (n.equals("errors")) {
                        list = c(jsonReader);
                    } else {
                        jsonReader.s();
                    }
                } else {
                    if (hashCode == 3076010 && n.equals(NotificationFactory.DATA)) {
                        bVar = (InterfaceC8991hE.b) C9036hx.d(interfaceC8991hE, jsonReader, c9028hp, C9036hx.e(interfaceC8991hE, c9028hp), set, list);
                    }
                    jsonReader.s();
                }
            } else if (n.equals("extensions")) {
                Object b = C9011hY.b(jsonReader);
                map = b instanceof Map ? (Map) b : null;
            } else {
                jsonReader.s();
            }
        }
        jsonReader.b();
        if (uuid == null) {
            uuid = UUID.randomUUID();
            C8632dsu.a(uuid, "");
        }
        return new C8954gU.c(interfaceC8991hE, uuid).e(list).e((C8954gU.c<D>) bVar).a(map).e();
    }

    private final List<C9035hw> c(JsonReader jsonReader) {
        List<C9035hw> i;
        if (jsonReader.l() == JsonReader.Token.f) {
            jsonReader.o();
            i = C8569dql.i();
            return i;
        }
        jsonReader.e();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.g()) {
            arrayList.add(a(jsonReader));
        }
        jsonReader.a();
        return arrayList;
    }

    private final C9035hw a(JsonReader jsonReader) {
        jsonReader.c();
        String str = "";
        List<C9035hw.a> list = null;
        List<Object> list2 = null;
        Map map = null;
        LinkedHashMap linkedHashMap = null;
        while (jsonReader.g()) {
            String n = jsonReader.n();
            switch (n.hashCode()) {
                case -1809421292:
                    if (!n.equals("extensions")) {
                        break;
                    } else {
                        Object b = C9011hY.b(jsonReader);
                        if (b instanceof Map) {
                            map = (Map) b;
                        } else {
                            map = null;
                            continue;
                        }
                    }
                case -1197189282:
                    if (!n.equals("locations")) {
                        break;
                    } else {
                        list = b(jsonReader);
                        continue;
                    }
                case 3433509:
                    if (!n.equals(Ease.ANIMATION_EASE_TYPE.PATH)) {
                        break;
                    } else {
                        list2 = d(jsonReader);
                        continue;
                    }
                case 954925063:
                    if (!n.equals("message")) {
                        break;
                    } else {
                        str = jsonReader.k();
                        if (str == null) {
                            str = "";
                        } else {
                            continue;
                        }
                    }
            }
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(n, C9011hY.b(jsonReader));
        }
        jsonReader.b();
        return new C9035hw(str, list, list2, map, linkedHashMap);
    }

    private final List<Object> d(JsonReader jsonReader) {
        if (jsonReader.l() == JsonReader.Token.f) {
            return (List) jsonReader.o();
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.e();
        while (jsonReader.g()) {
            int i = c.e[jsonReader.l().ordinal()];
            if (i == 1 || i == 2) {
                arrayList.add(Integer.valueOf(jsonReader.f()));
            } else {
                String k = jsonReader.k();
                C8632dsu.d((Object) k);
                arrayList.add(k);
            }
        }
        jsonReader.a();
        return arrayList;
    }

    private final List<C9035hw.a> b(JsonReader jsonReader) {
        if (jsonReader.l() == JsonReader.Token.f) {
            return (List) jsonReader.o();
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.e();
        while (jsonReader.g()) {
            arrayList.add(e(jsonReader));
        }
        jsonReader.a();
        return arrayList;
    }

    private final C9035hw.a e(JsonReader jsonReader) {
        jsonReader.c();
        int i = -1;
        int i2 = -1;
        while (jsonReader.g()) {
            String n = jsonReader.n();
            if (C8632dsu.c((Object) n, (Object) "line")) {
                i = jsonReader.f();
            } else if (C8632dsu.c((Object) n, (Object) "column")) {
                i2 = jsonReader.f();
            } else {
                jsonReader.s();
            }
        }
        jsonReader.b();
        return new C9035hw.a(i, i2);
    }
}
