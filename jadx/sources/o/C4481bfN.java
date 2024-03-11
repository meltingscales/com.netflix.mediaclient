package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.AbstractC4560bgn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfN  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4481bfN extends AbstractC4494bfa {
    C4481bfN(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: o.bfN$c */
    /* loaded from: classes.dex */
    public static final class c extends TypeAdapter<AbstractC4560bgn> {
        private byte[] a = null;
        private final TypeAdapter<byte[]> e = new AbstractC4560bgn.e();

        public c(Gson gson) {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, AbstractC4560bgn abstractC4560bgn) {
            if (abstractC4560bgn == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("bytes");
            this.e.write(jsonWriter, abstractC4560bgn.e());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AbstractC4560bgn read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            byte[] bArr = this.a;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("bytes")) {
                        bArr = this.e.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4481bfN(bArr);
        }
    }
}
