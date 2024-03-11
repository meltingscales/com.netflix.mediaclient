package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aHw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615aHw extends AbstractC1609aHq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1615aHw(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: o.aHw$a */
    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<aHV> {
        private final TypeAdapter<Integer> c;
        private final TypeAdapter<Integer> d;
        private int a = 0;
        private int e = 0;

        public a a(int i) {
            this.e = i;
            return this;
        }

        public a d(int i) {
            this.a = i;
            return this;
        }

        public a(Gson gson) {
            this.c = gson.getAdapter(Integer.class);
            this.d = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, aHV ahv) {
            if (ahv == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("maxRetries");
            this.c.write(jsonWriter, Integer.valueOf(ahv.d()));
            jsonWriter.name("retryAfterSeconds");
            this.d.write(jsonWriter, Integer.valueOf(ahv.b()));
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public aHV read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.a;
            int i2 = this.e;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("retryAfterSeconds")) {
                        i2 = this.d.read(jsonReader).intValue();
                    } else if (nextName.equals("maxRetries")) {
                        i = this.c.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1615aHw(i, i2);
        }
    }
}
