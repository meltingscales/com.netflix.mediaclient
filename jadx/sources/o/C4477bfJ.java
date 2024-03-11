package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4477bfJ extends AbstractC4435beU {
    C4477bfJ(List<AbstractC4470bfC> list) {
        super(list);
    }

    /* renamed from: o.bfJ$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4473bfF> {
        private List<AbstractC4470bfC> c = null;
        private final TypeAdapter<List<AbstractC4470bfC>> e;

        public b(Gson gson) {
            this.e = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4470bfC.class));
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, AbstractC4473bfF abstractC4473bfF) {
            if (abstractC4473bfF == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("adBreaks");
            this.e.write(jsonWriter, abstractC4473bfF.b());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public AbstractC4473bfF read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<AbstractC4470bfC> list = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("adBreaks")) {
                        list = this.e.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4477bfJ(list);
        }
    }
}
