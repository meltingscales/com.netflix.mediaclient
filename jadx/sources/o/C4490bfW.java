package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfW  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4490bfW extends AbstractC4502bfi {
    C4490bfW(AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, AbstractC4561bgo abstractC4561bgo3, AbstractC4561bgo abstractC4561bgo4) {
        super(abstractC4561bgo, abstractC4561bgo2, abstractC4561bgo3, abstractC4561bgo4);
    }

    /* renamed from: o.bfW$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4564bgr> {
        private final TypeAdapter<AbstractC4561bgo> e;
        private final TypeAdapter<AbstractC4561bgo> g;
        private final TypeAdapter<AbstractC4561bgo> h;
        private final TypeAdapter<AbstractC4561bgo> i;
        private AbstractC4561bgo c = null;
        private AbstractC4561bgo d = null;
        private AbstractC4561bgo b = null;
        private AbstractC4561bgo a = null;

        public b(Gson gson) {
            this.e = gson.getAdapter(AbstractC4561bgo.class);
            this.g = gson.getAdapter(AbstractC4561bgo.class);
            this.h = gson.getAdapter(AbstractC4561bgo.class);
            this.i = gson.getAdapter(AbstractC4561bgo.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, AbstractC4564bgr abstractC4564bgr) {
            if (abstractC4564bgr == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("events");
            this.e.write(jsonWriter, abstractC4564bgr.b());
            jsonWriter.name("ldl");
            this.g.write(jsonWriter, abstractC4564bgr.e());
            jsonWriter.name("license");
            this.h.write(jsonWriter, abstractC4564bgr.a());
            jsonWriter.name("stopPlayback");
            this.i.write(jsonWriter, abstractC4564bgr.d());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public AbstractC4564bgr read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            AbstractC4561bgo abstractC4561bgo = this.c;
            AbstractC4561bgo abstractC4561bgo2 = this.d;
            AbstractC4561bgo abstractC4561bgo3 = this.b;
            AbstractC4561bgo abstractC4561bgo4 = this.a;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1291329255:
                            if (nextName.equals("events")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106996:
                            if (nextName.equals("ldl")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 166757441:
                            if (nextName.equals("license")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 705896509:
                            if (nextName.equals("stopPlayback")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        abstractC4561bgo = this.e.read(jsonReader);
                    } else if (c == 1) {
                        abstractC4561bgo2 = this.g.read(jsonReader);
                    } else if (c == 2) {
                        abstractC4561bgo3 = this.h.read(jsonReader);
                    } else if (c == 3) {
                        abstractC4561bgo4 = this.i.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4490bfW(abstractC4561bgo, abstractC4561bgo2, abstractC4561bgo3, abstractC4561bgo4);
        }
    }
}
