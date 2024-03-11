package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NT extends NO {
    /* JADX INFO: Access modifiers changed from: package-private */
    public NT(NV nv) {
        super(nv);
    }

    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<NX> {
        private NV d = null;
        private final TypeAdapter<NV> e;

        public a(Gson gson) {
            this.e = gson.getAdapter(NV.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, NX nx) {
            if (nx == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("osInfo");
            this.e.write(jsonWriter, nx.d());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public NX read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            NV nv = this.d;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("osInfo")) {
                        nv = this.e.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new NT(nv);
        }
    }
}
