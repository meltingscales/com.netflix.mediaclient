package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4552bgf extends AbstractC4512bfs {
    C4552bgf(long j) {
        super(j);
    }

    /* renamed from: o.bgf$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4535bgO> {
        private long c = 0;
        private final TypeAdapter<Long> e;

        public d(Gson gson) {
            this.e = gson.getAdapter(Long.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, AbstractC4535bgO abstractC4535bgO) {
            if (abstractC4535bgO == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("viewableId");
            this.e.write(jsonWriter, Long.valueOf(abstractC4535bgO.c()));
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4535bgO read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("viewableId")) {
                        j = this.e.read(jsonReader).longValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4552bgf(j);
        }
    }
}
