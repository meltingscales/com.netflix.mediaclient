package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.C4481bfN;

/* renamed from: o.bgn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4560bgn {
    @SerializedName("bytes")
    public abstract byte[] e();

    public static TypeAdapter<AbstractC4560bgn> c(Gson gson) {
        return new C4481bfN.c(gson);
    }

    /* renamed from: o.bgn$e */
    /* loaded from: classes.dex */
    public static class e extends TypeAdapter<byte[]> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, byte[] bArr) {
            if (bArr == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(C8427dle.e(bArr));
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public byte[] read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return C8427dle.e(jsonReader.nextString());
        }
    }
}
