package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4485bfR extends AbstractC4440beZ {
    C4485bfR(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: o.bfR$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4559bgm> {
        private final TypeAdapter<Integer> b;
        private final TypeAdapter<Integer> d;
        private int e = 0;
        private int c = 0;

        public b(Gson gson) {
            this.b = gson.getAdapter(Integer.class);
            this.d = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, AbstractC4559bgm abstractC4559bgm) {
            if (abstractC4559bgm == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("offset");
            this.b.write(jsonWriter, Integer.valueOf(abstractC4559bgm.b()));
            jsonWriter.name("size");
            this.d.write(jsonWriter, Integer.valueOf(abstractC4559bgm.c()));
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public AbstractC4559bgm read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.e;
            int i2 = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("offset")) {
                        i = this.b.read(jsonReader).intValue();
                    } else if (nextName.equals("size")) {
                        i2 = this.d.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4485bfR(i, i2);
        }
    }
}
