package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4474bfG extends AbstractC4433beS {
    C4474bfG(long j, long j2, boolean z, String str, long j3, List<AbstractC4533bgM> list, Map<String, AbstractC4518bfy> map) {
        super(j, j2, z, str, j3, list, map);
    }

    /* renamed from: o.bfG$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4468bfA> {
        private final TypeAdapter<Map<String, AbstractC4518bfy>> d;
        private final TypeAdapter<Long> h;
        private final TypeAdapter<Long> i;
        private final TypeAdapter<String> k;
        private final TypeAdapter<Long> l;
        private final TypeAdapter<List<AbstractC4533bgM>> m;

        /* renamed from: o  reason: collision with root package name */
        private final TypeAdapter<Boolean> f13581o;
        private long e = 0;
        private long g = 0;
        private boolean b = false;
        private String f = null;
        private long c = 0;
        private List<AbstractC4533bgM> j = null;
        private Map<String, AbstractC4518bfy> a = null;

        public d b(List<AbstractC4533bgM> list) {
            this.j = list;
            return this;
        }

        public d b(Map<String, AbstractC4518bfy> map) {
            this.a = map;
            return this;
        }

        public d(Gson gson) {
            this.i = gson.getAdapter(Long.class);
            this.l = gson.getAdapter(Long.class);
            this.f13581o = gson.getAdapter(Boolean.class);
            this.k = gson.getAdapter(String.class);
            this.h = gson.getAdapter(Long.class);
            this.m = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4533bgM.class));
            this.d = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4518bfy.class));
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AbstractC4468bfA abstractC4468bfA) {
            if (abstractC4468bfA == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.i.write(jsonWriter, Long.valueOf(abstractC4468bfA.b()));
            jsonWriter.name("startTimeMs");
            this.l.write(jsonWriter, Long.valueOf(abstractC4468bfA.d()));
            jsonWriter.name("is3pVerificationEnabled");
            this.f13581o.write(jsonWriter, Boolean.valueOf(abstractC4468bfA.a()));
            jsonWriter.name("thirdPartyVerificationToken");
            this.k.write(jsonWriter, abstractC4468bfA.h());
            jsonWriter.name("endTimeMs");
            this.h.write(jsonWriter, Long.valueOf(abstractC4468bfA.e()));
            jsonWriter.name("timedAdEvents");
            this.m.write(jsonWriter, abstractC4468bfA.j());
            jsonWriter.name("actionAdEvents");
            this.d.write(jsonWriter, abstractC4468bfA.c());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AbstractC4468bfA read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = this.e;
            long j2 = this.g;
            boolean z = this.b;
            String str = this.f;
            long j3 = this.c;
            long j4 = j;
            long j5 = j2;
            boolean z2 = z;
            String str2 = str;
            long j6 = j3;
            List<AbstractC4533bgM> list = this.j;
            Map<String, AbstractC4518bfy> map = this.a;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2016854158:
                            if (nextName.equals("actionAdEvents")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1847837611:
                            if (nextName.equals("startTimeMs")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1019595617:
                            if (nextName.equals("thirdPartyVerificationToken")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -53840929:
                            if (nextName.equals("is3pVerificationEnabled")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3355:
                            if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1627521550:
                            if (nextName.equals("endTimeMs")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1926838131:
                            if (nextName.equals("timedAdEvents")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            map = this.d.read(jsonReader);
                            continue;
                        case 1:
                            j5 = this.l.read(jsonReader).longValue();
                            continue;
                        case 2:
                            str2 = this.k.read(jsonReader);
                            continue;
                        case 3:
                            z2 = this.f13581o.read(jsonReader).booleanValue();
                            continue;
                        case 4:
                            j4 = this.i.read(jsonReader).longValue();
                            continue;
                        case 5:
                            j6 = this.h.read(jsonReader).longValue();
                            continue;
                        case 6:
                            list = this.m.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4474bfG(j4, j5, z2, str2, j6, list, map);
        }
    }
}
