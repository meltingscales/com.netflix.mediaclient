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
/* renamed from: o.bge  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4551bge extends AbstractC4514bfu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4551bge(List<String> list, Map<String, AbstractC4536bgP> map, List<AbstractC4534bgN> list2, String str, boolean z, String str2, String str3, boolean z2, Map<String, String> map2, String str4, String str5, String str6, boolean z3, boolean z4, int i) {
        super(list, map, list2, str, z, str2, str3, z2, map2, str4, str5, str6, z3, z4, i);
    }

    /* renamed from: o.bge$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4537bgQ> {
        private final TypeAdapter<String> A;
        private final TypeAdapter<Integer> B;
        private final TypeAdapter<String> C;
        private final TypeAdapter<String> D;
        private final TypeAdapter<Map<String, String>> a;
        private final TypeAdapter<List<AbstractC4534bgN>> b;
        private final TypeAdapter<Boolean> d;
        private final TypeAdapter<Map<String, AbstractC4536bgP>> e;
        private final TypeAdapter<List<String>> p;
        private final TypeAdapter<String> u;
        private final TypeAdapter<String> v;
        private final TypeAdapter<Boolean> w;
        private final TypeAdapter<Boolean> x;
        private final TypeAdapter<Boolean> y;
        private final TypeAdapter<String> z;
        private List<String> f = null;
        private Map<String, AbstractC4536bgP> r = null;
        private List<AbstractC4534bgN> g = null;
        private String s = null;
        private boolean j = false;
        private String l = null;
        private String m = null;
        private boolean k = false;
        private Map<String, String> q = null;
        private String i = null;
        private String t = null;
        private String n = null;
        private boolean c = false;
        private boolean h = false;

        /* renamed from: o  reason: collision with root package name */
        private int f13593o = 0;

        public d c(List<String> list) {
            this.f = list;
            return this;
        }

        public d d(boolean z) {
            this.h = z;
            return this;
        }

        public d(Gson gson) {
            this.p = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            this.e = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4536bgP.class));
            this.b = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4534bgN.class));
            this.A = gson.getAdapter(String.class);
            this.w = gson.getAdapter(Boolean.class);
            this.D = gson.getAdapter(String.class);
            this.v = gson.getAdapter(String.class);
            this.y = gson.getAdapter(Boolean.class);
            this.a = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
            this.u = gson.getAdapter(String.class);
            this.z = gson.getAdapter(String.class);
            this.C = gson.getAdapter(String.class);
            this.d = gson.getAdapter(Boolean.class);
            this.x = gson.getAdapter(Boolean.class);
            this.B = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, AbstractC4537bgQ abstractC4537bgQ) {
            if (abstractC4537bgQ == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("encodingProfileNames");
            this.p.write(jsonWriter, abstractC4537bgQ.b());
            jsonWriter.name("ttDownloadables");
            this.e.write(jsonWriter, abstractC4537bgQ.d());
            jsonWriter.name("cdnlist");
            this.b.write(jsonWriter, abstractC4537bgQ.a());
            jsonWriter.name("trackType");
            this.A.write(jsonWriter, abstractC4537bgQ.n());
            jsonWriter.name("isForcedNarrative");
            this.w.write(jsonWriter, Boolean.valueOf(abstractC4537bgQ.i()));
            jsonWriter.name("languageDescription");
            this.D.write(jsonWriter, abstractC4537bgQ.o());
            jsonWriter.name("language");
            this.v.write(jsonWriter, abstractC4537bgQ.h());
            jsonWriter.name("isNoneTrack");
            this.y.write(jsonWriter, Boolean.valueOf(abstractC4537bgQ.j()));
            jsonWriter.name("downloadableIds");
            this.a.write(jsonWriter, abstractC4537bgQ.c());
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.u.write(jsonWriter, abstractC4537bgQ.f());
            jsonWriter.name("type");
            this.z.write(jsonWriter, abstractC4537bgQ.p());
            jsonWriter.name("new_track_id");
            this.C.write(jsonWriter, abstractC4537bgQ.m());
            jsonWriter.name("canDeviceRender");
            this.d.write(jsonWriter, Boolean.valueOf(abstractC4537bgQ.e()));
            jsonWriter.name("hydrated");
            this.x.write(jsonWriter, Boolean.valueOf(abstractC4537bgQ.g()));
            jsonWriter.name("rank");
            this.B.write(jsonWriter, Integer.valueOf(abstractC4537bgQ.k()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4537bgQ read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<String> list = this.f;
            Map<String, AbstractC4536bgP> map = this.r;
            List<AbstractC4534bgN> list2 = this.g;
            String str = this.s;
            boolean z = this.j;
            String str2 = this.l;
            String str3 = this.m;
            boolean z2 = this.k;
            Map<String, String> map2 = this.q;
            String str4 = this.i;
            String str5 = this.t;
            String str6 = this.n;
            boolean z3 = this.c;
            boolean z4 = this.h;
            int i = this.f13593o;
            Map<String, AbstractC4536bgP> map3 = map;
            List<AbstractC4534bgN> list3 = list2;
            String str7 = str;
            boolean z5 = z;
            String str8 = str2;
            String str9 = str3;
            boolean z6 = z2;
            Map<String, String> map4 = map2;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            boolean z7 = z3;
            boolean z8 = z4;
            List<String> list4 = list;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1613589672:
                            if (nextName.equals("language")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1591718020:
                            if (nextName.equals("canDeviceRender")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -446354959:
                            if (nextName.equals("hydrated")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -338537394:
                            if (nextName.equals("new_track_id")) {
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
                        case 3492908:
                            if (nextName.equals("rank")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3575610:
                            if (nextName.equals("type")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 233118738:
                            if (nextName.equals("encodingProfileNames")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 636375627:
                            if (nextName.equals("cdnlist")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 639281935:
                            if (nextName.equals("isForcedNarrative")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 729831205:
                            if (nextName.equals("trackType")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1099240497:
                            if (nextName.equals("ttDownloadables")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1284739460:
                            if (nextName.equals("languageDescription")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1827430774:
                            if (nextName.equals("downloadableIds")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1919112937:
                            if (nextName.equals("isNoneTrack")) {
                                c = 14;
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
                            str9 = this.v.read(jsonReader);
                            continue;
                        case 1:
                            z7 = this.d.read(jsonReader).booleanValue();
                            continue;
                        case 2:
                            z8 = this.x.read(jsonReader).booleanValue();
                            continue;
                        case 3:
                            str12 = this.C.read(jsonReader);
                            continue;
                        case 4:
                            str10 = this.u.read(jsonReader);
                            continue;
                        case 5:
                            i = this.B.read(jsonReader).intValue();
                            continue;
                        case 6:
                            str11 = this.z.read(jsonReader);
                            continue;
                        case 7:
                            list4 = this.p.read(jsonReader);
                            continue;
                        case '\b':
                            list3 = this.b.read(jsonReader);
                            continue;
                        case '\t':
                            z5 = this.w.read(jsonReader).booleanValue();
                            continue;
                        case '\n':
                            str7 = this.A.read(jsonReader);
                            continue;
                        case 11:
                            map3 = this.e.read(jsonReader);
                            continue;
                        case '\f':
                            str8 = this.D.read(jsonReader);
                            continue;
                        case '\r':
                            map4 = this.a.read(jsonReader);
                            continue;
                        case 14:
                            z6 = this.y.read(jsonReader).booleanValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4551bge(list4, map3, list3, str7, z5, str8, str9, z6, map4, str10, str11, str12, z7, z8, i);
        }
    }
}
