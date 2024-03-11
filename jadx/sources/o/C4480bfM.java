package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4480bfM extends AbstractC4439beY {
    C4480bfM(String str) {
        super(str);
    }

    /* renamed from: o.bfM$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4554bgh> {
        private String a = null;
        private final TypeAdapter<String> e;

        public b(Gson gson) {
            this.e = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AbstractC4554bgh abstractC4554bgh) {
            if (abstractC4554bgh == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("pbcid");
            this.e.write(jsonWriter, abstractC4554bgh.d());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public AbstractC4554bgh read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.a;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("pbcid")) {
                        str = this.e.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4480bfM(str);
        }
    }
}
