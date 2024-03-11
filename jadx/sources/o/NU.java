package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NU extends NP {
    /* JADX INFO: Access modifiers changed from: package-private */
    public NU(int i, long j) {
        super(i, j);
    }

    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<NV> {
        private final TypeAdapter<Integer> b;
        private final TypeAdapter<Long> d;
        private int a = 0;
        private long c = 0;

        public a(Gson gson) {
            this.b = gson.getAdapter(Integer.class);
            this.d = gson.getAdapter(Long.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, NV nv) {
            if (nv == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("api");
            this.b.write(jsonWriter, Integer.valueOf(nv.e()));
            jsonWriter.name("firstSeenTime");
            this.d.write(jsonWriter, Long.valueOf(nv.c()));
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public NV read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.a;
            long j = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("firstSeenTime")) {
                        j = this.d.read(jsonReader).longValue();
                    } else if (nextName.equals("api")) {
                        i = this.b.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new NU(i, j);
        }
    }
}
