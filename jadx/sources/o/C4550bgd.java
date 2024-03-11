package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4550bgd extends AbstractC4511bfr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4550bgd(int i, Map<String, String> map, int i2, int i3, String str, Map<String, List<String>> map2) {
        super(i, map, i2, i3, str, map2);
    }

    /* renamed from: o.bgd$a */
    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<AbstractC4536bgP> {
        private final TypeAdapter<Integer> f;
        private final TypeAdapter<Integer> g;
        private final TypeAdapter<Map<String, List<String>>> i;
        private final TypeAdapter<Map<String, String>> j;
        private final TypeAdapter<String> n;

        /* renamed from: o  reason: collision with root package name */
        private final TypeAdapter<Integer> f13592o;
        private int h = 0;
        private Map<String, String> d = null;
        private int e = 0;
        private int c = 0;
        private String a = null;
        private Map<String, List<String>> b = null;

        public a(Gson gson) {
            this.f13592o = gson.getAdapter(Integer.class);
            this.j = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
            this.f = gson.getAdapter(Integer.class);
            this.g = gson.getAdapter(Integer.class);
            this.n = gson.getAdapter(String.class);
            this.i = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, String.class).getType()));
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, AbstractC4536bgP abstractC4536bgP) {
            if (abstractC4536bgP == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("size");
            this.f13592o.write(jsonWriter, Integer.valueOf(abstractC4536bgP.g()));
            jsonWriter.name("downloadUrls");
            this.j.write(jsonWriter, abstractC4536bgP.c());
            jsonWriter.name("midxOffset");
            this.f.write(jsonWriter, Integer.valueOf(abstractC4536bgP.e()));
            jsonWriter.name("midxSize");
            this.g.write(jsonWriter, Integer.valueOf(abstractC4536bgP.a()));
            jsonWriter.name("representationId");
            this.n.write(jsonWriter, abstractC4536bgP.d());
            jsonWriter.name("liveOcaCapabilities");
            this.i.write(jsonWriter, abstractC4536bgP.b());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public AbstractC4536bgP read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.h;
            Map<String, String> map = this.d;
            int i2 = this.e;
            int i3 = i;
            Map<String, String> map2 = map;
            int i4 = i2;
            int i5 = this.c;
            String str = this.a;
            Map<String, List<String>> map3 = this.b;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1632280751:
                            if (nextName.equals("midxSize")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1261406505:
                            if (nextName.equals("liveOcaCapabilities")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1076604957:
                            if (nextName.equals("midxOffset")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -649239864:
                            if (nextName.equals("representationId")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1109107084:
                            if (nextName.equals("downloadUrls")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        i5 = this.g.read(jsonReader).intValue();
                    } else if (c == 1) {
                        map3 = this.i.read(jsonReader);
                    } else if (c == 2) {
                        i4 = this.f.read(jsonReader).intValue();
                    } else if (c == 3) {
                        str = this.n.read(jsonReader);
                    } else if (c == 4) {
                        i3 = this.f13592o.read(jsonReader).intValue();
                    } else if (c == 5) {
                        map2 = this.j.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4550bgd(i3, map2, i4, i5, str, map3);
        }
    }
}
