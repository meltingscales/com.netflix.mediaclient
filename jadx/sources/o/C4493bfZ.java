package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfZ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4493bfZ extends AbstractC4507bfn {
    C4493bfZ(String str, Map<String, AbstractC4531bgK> map) {
        super(str, map);
    }

    /* renamed from: o.bfZ$c */
    /* loaded from: classes.dex */
    public static final class c extends TypeAdapter<AbstractC4528bgH> {
        private final TypeAdapter<String> c;
        private final TypeAdapter<Map<String, AbstractC4531bgK>> d;
        private String a = null;
        private Map<String, AbstractC4531bgK> e = null;

        public c(Gson gson) {
            this.c = gson.getAdapter(String.class);
            this.d = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4531bgK.class));
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, AbstractC4528bgH abstractC4528bgH) {
            if (abstractC4528bgH == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("initialSegment");
            this.c.write(jsonWriter, abstractC4528bgH.a());
            jsonWriter.name("segments");
            this.d.write(jsonWriter, abstractC4528bgH.c());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public AbstractC4528bgH read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.a;
            Map<String, AbstractC4531bgK> map = this.e;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("initialSegment")) {
                        str = this.c.read(jsonReader);
                    } else if (nextName.equals("segments")) {
                        map = this.d.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4493bfZ(str, map);
        }
    }
}
