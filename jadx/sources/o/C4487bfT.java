package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4487bfT extends AbstractC4498bfe {
    C4487bfT(String str) {
        super(str);
    }

    /* renamed from: o.bfT$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4567bgu> {
        private String c = null;
        private final TypeAdapter<String> d;

        public b(Gson gson) {
            this.d = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, AbstractC4567bgu abstractC4567bgu) {
            if (abstractC4567bgu == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.d.write(jsonWriter, abstractC4567bgu.a());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public AbstractC4567bgu read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                        str = this.d.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4487bfT(str);
        }
    }
}
