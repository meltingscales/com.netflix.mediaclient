package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4549bgc extends AbstractC4509bfp {
    C4549bgc(List<String> list, JsonObject jsonObject) {
        super(list, jsonObject);
    }

    /* renamed from: o.bgc$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4532bgL> {
        private final TypeAdapter<JsonObject> b;
        private final TypeAdapter<List<String>> c;
        private List<String> e = null;
        private JsonObject d = null;

        public d c(List<String> list) {
            this.e = list;
            return this;
        }

        public d(Gson gson) {
            this.c = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            this.b = gson.getAdapter(JsonObject.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AbstractC4532bgL abstractC4532bgL) {
            if (abstractC4532bgL == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("additionalGroupNames");
            this.c.write(jsonWriter, abstractC4532bgL.e());
            jsonWriter.name("streamingClientConfig");
            this.b.write(jsonWriter, abstractC4532bgL.a());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public AbstractC4532bgL read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<String> list = this.e;
            JsonObject jsonObject = this.d;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("streamingClientConfig")) {
                        jsonObject = this.b.read(jsonReader);
                    } else if (nextName.equals("additionalGroupNames")) {
                        list = this.c.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4549bgc(list, jsonObject);
        }
    }
}
