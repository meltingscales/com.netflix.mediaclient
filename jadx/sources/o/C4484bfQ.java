package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfQ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4484bfQ extends AbstractC4495bfb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4484bfQ(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: o.bfQ$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4561bgo> {
        private final TypeAdapter<String> a;
        private final TypeAdapter<String> b;
        private String e = null;
        private String d = null;

        public d(Gson gson) {
            this.a = gson.getAdapter(String.class);
            this.b = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, AbstractC4561bgo abstractC4561bgo) {
            if (abstractC4561bgo == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("href");
            this.a.write(jsonWriter, abstractC4561bgo.d());
            jsonWriter.name("rel");
            this.b.write(jsonWriter, abstractC4561bgo.a());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AbstractC4561bgo read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.e;
            String str2 = this.d;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("rel")) {
                        str2 = this.b.read(jsonReader);
                    } else if (nextName.equals("href")) {
                        str = this.a.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4484bfQ(str, str2);
        }
    }
}
