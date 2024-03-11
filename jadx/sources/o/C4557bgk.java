package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4557bgk extends AbstractC4517bfx {
    C4557bgk(List<List<Long>> list) {
        super(list);
    }

    /* renamed from: o.bgk$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4539bgS> {
        private List<List<Long>> a = null;
        private final TypeAdapter<List<List<Long>>> b;

        public b(Gson gson) {
            this.b = gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Long.class).getType()));
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4539bgS abstractC4539bgS) {
            if (abstractC4539bgS == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("interactionZonesV2");
            this.b.write(jsonWriter, abstractC4539bgS.e());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4539bgS read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<List<Long>> list = this.a;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("interactionZonesV2")) {
                        list = this.b.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4557bgk(list);
        }
    }
}
