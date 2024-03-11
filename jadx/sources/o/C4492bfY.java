package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4492bfY extends AbstractC4506bfm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4492bfY(boolean z, String str, int i, int i2, String str2, String str3) {
        super(z, str, i, i2, str2, str3);
    }

    /* renamed from: o.bfY$e */
    /* loaded from: classes.dex */
    public static final class e extends TypeAdapter<AbstractC4534bgN> {
        private final TypeAdapter<String> f;
        private final TypeAdapter<String> g;
        private final TypeAdapter<Integer> h;
        private final TypeAdapter<Boolean> j;
        private final TypeAdapter<Integer> k;
        private final TypeAdapter<String> n;
        private boolean b = false;
        private String a = null;
        private int c = 0;
        private int d = 0;
        private String e = null;
        private String i = null;

        public e(Gson gson) {
            this.j = gson.getAdapter(Boolean.class);
            this.g = gson.getAdapter(String.class);
            this.k = gson.getAdapter(Integer.class);
            this.h = gson.getAdapter(Integer.class);
            this.f = gson.getAdapter(String.class);
            this.n = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4534bgN abstractC4534bgN) {
            if (abstractC4534bgN == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("lowgrade");
            this.j.write(jsonWriter, Boolean.valueOf(abstractC4534bgN.b()));
            jsonWriter.name("name");
            this.g.write(jsonWriter, abstractC4534bgN.c());
            jsonWriter.name("rank");
            this.k.write(jsonWriter, Integer.valueOf(abstractC4534bgN.e()));
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.h.write(jsonWriter, Integer.valueOf(abstractC4534bgN.a()));
            jsonWriter.name(SignupConstants.Error.DEBUG_FIELD_KEY);
            this.f.write(jsonWriter, abstractC4534bgN.d());
            jsonWriter.name("type");
            this.n.write(jsonWriter, abstractC4534bgN.f());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4534bgN read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.b;
            String str = this.a;
            int i = this.c;
            boolean z2 = z;
            String str2 = str;
            int i2 = i;
            int i3 = this.d;
            String str3 = this.e;
            String str4 = this.i;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1815867133:
                            if (nextName.equals("lowgrade")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3355:
                            if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106079:
                            if (nextName.equals(SignupConstants.Error.DEBUG_FIELD_KEY)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3492908:
                            if (nextName.equals("rank")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3575610:
                            if (nextName.equals("type")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        z2 = this.j.read(jsonReader).booleanValue();
                    } else if (c == 1) {
                        i3 = this.h.read(jsonReader).intValue();
                    } else if (c == 2) {
                        str3 = this.f.read(jsonReader);
                    } else if (c == 3) {
                        str2 = this.g.read(jsonReader);
                    } else if (c == 4) {
                        i2 = this.k.read(jsonReader).intValue();
                    } else if (c == 5) {
                        str4 = this.n.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C4492bfY(z2, str2, i2, i3, str3, str4);
        }
    }
}
