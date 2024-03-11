package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4482bfO extends AbstractC4496bfc {
    C4482bfO(AbstractC4528bgH abstractC4528bgH, AbstractC4535bgO abstractC4535bgO) {
        super(abstractC4528bgH, abstractC4535bgO);
    }

    /* renamed from: o.bfO$e */
    /* loaded from: classes.dex */
    public static final class e extends TypeAdapter<AbstractC4558bgl> {
        private final TypeAdapter<AbstractC4528bgH> b;
        private final TypeAdapter<AbstractC4535bgO> e;
        private AbstractC4528bgH d = null;
        private AbstractC4535bgO c = null;

        public e(Gson gson) {
            this.b = gson.getAdapter(AbstractC4528bgH.class);
            this.e = gson.getAdapter(AbstractC4535bgO.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AbstractC4558bgl abstractC4558bgl) {
            if (abstractC4558bgl == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("playgraph");
            this.b.write(jsonWriter, abstractC4558bgl.b());
            jsonWriter.name("startIdent");
            this.e.write(jsonWriter, abstractC4558bgl.c());
            jsonWriter.endObject();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public AbstractC4558bgl read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            AbstractC4528bgH abstractC4528bgH = this.d;
            AbstractC4535bgO abstractC4535bgO = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("playgraph")) {
                        abstractC4528bgH = this.b.read(jsonReader);
                    } else if (nextName.equals("startIdent")) {
                        abstractC4535bgO = this.e.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4482bfO(abstractC4528bgH, abstractC4535bgO);
        }
    }
}
