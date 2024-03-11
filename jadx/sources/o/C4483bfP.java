package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4483bfP extends AbstractC4497bfd {
    C4483bfP(String str, String str2, String str3, String str4, int i) {
        super(str, str2, str3, str4, i);
    }

    /* renamed from: o.bfP$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4562bgp> {
        private final TypeAdapter<String> c;
        private final TypeAdapter<Integer> g;
        private final TypeAdapter<String> h;
        private final TypeAdapter<String> i;
        private final TypeAdapter<String> j;
        private String f = null;
        private String e = null;
        private String b = null;
        private String d = null;
        private int a = 0;

        public d(Gson gson) {
            this.j = gson.getAdapter(String.class);
            this.c = gson.getAdapter(String.class);
            this.i = gson.getAdapter(String.class);
            this.h = gson.getAdapter(String.class);
            this.g = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, AbstractC4562bgp abstractC4562bgp) {
            if (abstractC4562bgp == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("videoTrackId");
            this.j.write(jsonWriter, abstractC4562bgp.d());
            jsonWriter.name("audioTrackId");
            this.c.write(jsonWriter, abstractC4562bgp.e());
            jsonWriter.name("subtitleTrackId");
            this.i.write(jsonWriter, abstractC4562bgp.b());
            jsonWriter.name("mediaId");
            this.h.write(jsonWriter, abstractC4562bgp.a());
            jsonWriter.name("preferenceOrder");
            this.g.write(jsonWriter, Integer.valueOf(abstractC4562bgp.c()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public AbstractC4562bgp read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.f;
            String str2 = this.e;
            String str3 = str;
            String str4 = str2;
            String str5 = this.b;
            String str6 = this.d;
            int i = this.a;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1214552373:
                            if (nextName.equals("videoTrackId")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -772221810:
                            if (nextName.equals("subtitleTrackId")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -572740813:
                            if (nextName.equals("preferenceOrder")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 940773407:
                            if (nextName.equals("mediaId")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1641214736:
                            if (nextName.equals("audioTrackId")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str3 = this.j.read(jsonReader);
                    } else if (c == 1) {
                        str5 = this.i.read(jsonReader);
                    } else if (c == 2) {
                        i = this.g.read(jsonReader).intValue();
                    } else if (c == 3) {
                        str6 = this.h.read(jsonReader);
                    } else if (c == 4) {
                        str4 = this.c.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4483bfP(str3, str4, str5, str6, i);
        }
    }
}
