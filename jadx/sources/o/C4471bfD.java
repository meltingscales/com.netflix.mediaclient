package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4471bfD extends AbstractC4431beQ {
    C4471bfD(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: o.bfD$e */
    /* loaded from: classes.dex */
    public static final class e extends TypeAdapter<AbstractC4518bfy> {
        private final TypeAdapter<String> a;
        private final TypeAdapter<String> e;
        private String d = null;
        private String c = null;

        public e(Gson gson) {
            this.e = gson.getAdapter(String.class);
            this.a = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4518bfy abstractC4518bfy) {
            if (abstractC4518bfy == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("event");
            this.e.write(jsonWriter, abstractC4518bfy.d());
            jsonWriter.name("adEventToken");
            this.a.write(jsonWriter, abstractC4518bfy.c());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4518bfy read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.d;
            String str2 = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("adEventToken")) {
                        str2 = this.a.read(jsonReader);
                    } else if (nextName.equals("event")) {
                        str = this.e.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4471bfD(str, str2);
        }
    }
}
