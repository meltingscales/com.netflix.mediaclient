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
/* renamed from: o.bfI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4476bfI extends AbstractC4432beR {
    C4476bfI(long j, List<AbstractC4468bfA> list, Map<String, AbstractC4518bfy> map, String str, String str2) {
        super(j, list, map, str, str2);
    }

    /* renamed from: o.bfI$c */
    /* loaded from: classes.dex */
    public static final class c extends TypeAdapter<AbstractC4470bfC> {
        private final TypeAdapter<Map<String, AbstractC4518bfy>> a;
        private final TypeAdapter<String> b;
        private final TypeAdapter<String> d;
        private final TypeAdapter<List<AbstractC4468bfA>> e;
        private final TypeAdapter<Long> i;
        private long g = 0;
        private List<AbstractC4468bfA> j = null;
        private Map<String, AbstractC4518bfy> c = null;
        private String h = null;
        private String f = null;

        public c a(Map<String, AbstractC4518bfy> map) {
            this.c = map;
            return this;
        }

        public c(Gson gson) {
            this.i = gson.getAdapter(Long.class);
            this.e = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4468bfA.class));
            this.a = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4518bfy.class));
            this.b = gson.getAdapter(String.class);
            this.d = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AbstractC4470bfC abstractC4470bfC) {
            if (abstractC4470bfC == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("locationMs");
            this.i.write(jsonWriter, Long.valueOf(abstractC4470bfC.b()));
            jsonWriter.name("ads");
            this.e.write(jsonWriter, abstractC4470bfC.a());
            jsonWriter.name("actionAdBreakEvents");
            this.a.write(jsonWriter, abstractC4470bfC.c());
            jsonWriter.name("auditPingUrl");
            this.b.write(jsonWriter, abstractC4470bfC.d());
            jsonWriter.name("adBreakToken");
            this.d.write(jsonWriter, abstractC4470bfC.e());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4470bfC read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = this.g;
            List<AbstractC4468bfA> list = this.j;
            long j2 = j;
            List<AbstractC4468bfA> list2 = list;
            Map<String, AbstractC4518bfy> map = this.c;
            String str = this.h;
            String str2 = this.f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2030240190:
                            if (nextName.equals("auditPingUrl")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -678719299:
                            if (nextName.equals("adBreakToken")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 96432:
                            if (nextName.equals("ads")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 931322943:
                            if (nextName.equals("actionAdBreakEvents")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1541836859:
                            if (nextName.equals("locationMs")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str = this.b.read(jsonReader);
                    } else if (c == 1) {
                        str2 = this.d.read(jsonReader);
                    } else if (c == 2) {
                        list2 = this.e.read(jsonReader);
                    } else if (c == 3) {
                        map = this.a.read(jsonReader);
                    } else if (c == 4) {
                        j2 = this.i.read(jsonReader).longValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4476bfI(j2, list2, map, str, str2);
        }
    }
}
