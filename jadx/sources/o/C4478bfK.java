package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.manifest.Stream;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfK  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4478bfK extends AbstractC4437beW {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4478bfK(List<String> list, String str, boolean z, String str2, String str3, String str4, List<Stream> list2, String str5, String str6, String str7, boolean z2, boolean z3, int i, String str8, List<Integer> list3, String str9, String str10) {
        super(list, str, z, str2, str3, str4, list2, str5, str6, str7, z2, z3, i, str8, list3, str9, str10);
    }

    /* renamed from: o.bfK$a */
    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<AbstractC4472bfE> {
        private final TypeAdapter<Boolean> A;
        private final TypeAdapter<Boolean> B;
        private final TypeAdapter<String> C;
        private final TypeAdapter<String> D;
        private final TypeAdapter<String> F;
        private final TypeAdapter<String> G;
        private final TypeAdapter<Integer> H;
        private final TypeAdapter<String> I;
        private final TypeAdapter<String> a;
        private final TypeAdapter<String> c;
        private final TypeAdapter<List<Integer>> d;
        private final TypeAdapter<List<Stream>> e;
        private final TypeAdapter<String> r;
        private final TypeAdapter<List<String>> w;
        private final TypeAdapter<String> x;
        private final TypeAdapter<Boolean> y;
        private final TypeAdapter<String> z;
        private List<String> f = null;
        private String n = null;
        private boolean k = false;
        private String l = null;
        private String j = null;
        private String g = null;
        private List<Stream> u = null;
        private String s = null;
        private String q = null;
        private String m = null;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13582o = false;
        private boolean h = false;
        private int t = 0;
        private String v = null;
        private List<Integer> b = null;
        private String i = null;
        private String p = null;

        public a d(List<Stream> list) {
            this.u = list;
            return this;
        }

        public a d(boolean z) {
            this.h = z;
            return this;
        }

        public a(Gson gson) {
            this.w = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            this.z = gson.getAdapter(String.class);
            this.A = gson.getAdapter(Boolean.class);
            this.C = gson.getAdapter(String.class);
            this.x = gson.getAdapter(String.class);
            this.r = gson.getAdapter(String.class);
            this.e = gson.getAdapter(TypeToken.getParameterized(List.class, Stream.class));
            this.F = gson.getAdapter(String.class);
            this.G = gson.getAdapter(String.class);
            this.D = gson.getAdapter(String.class);
            this.B = gson.getAdapter(Boolean.class);
            this.y = gson.getAdapter(Boolean.class);
            this.H = gson.getAdapter(Integer.class);
            this.c = gson.getAdapter(String.class);
            this.d = gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
            this.a = gson.getAdapter(String.class);
            this.I = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AbstractC4472bfE abstractC4472bfE) {
            if (abstractC4472bfE == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("disallowedSubtitleTracks");
            this.w.write(jsonWriter, abstractC4472bfE.j());
            jsonWriter.name("language");
            this.z.write(jsonWriter, abstractC4472bfE.h());
            jsonWriter.name("isNative");
            this.A.write(jsonWriter, Boolean.valueOf(abstractC4472bfE.i()));
            jsonWriter.name("languageDescription");
            this.C.write(jsonWriter, abstractC4472bfE.o());
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.x.write(jsonWriter, abstractC4472bfE.f());
            jsonWriter.name("defaultTimedText");
            this.r.write(jsonWriter, abstractC4472bfE.c());
            jsonWriter.name("streams");
            this.e.write(jsonWriter, abstractC4472bfE.d());
            jsonWriter.name("trackType");
            this.F.write(jsonWriter, abstractC4472bfE.p());
            jsonWriter.name("track_id");
            this.G.write(jsonWriter, abstractC4472bfE.r());
            jsonWriter.name("new_track_id");
            this.D.write(jsonWriter, abstractC4472bfE.n());
            jsonWriter.name("offTrackDisallowed");
            this.B.write(jsonWriter, Boolean.valueOf(abstractC4472bfE.m()));
            jsonWriter.name("hydrated");
            this.y.write(jsonWriter, Boolean.valueOf(abstractC4472bfE.g()));
            jsonWriter.name("rank");
            this.H.write(jsonWriter, Integer.valueOf(abstractC4472bfE.k()));
            jsonWriter.name("channels");
            this.c.write(jsonWriter, abstractC4472bfE.e());
            jsonWriter.name("bitrates");
            this.d.write(jsonWriter, abstractC4472bfE.a());
            jsonWriter.name("codecName");
            this.a.write(jsonWriter, abstractC4472bfE.b());
            jsonWriter.name("profile");
            this.I.write(jsonWriter, abstractC4472bfE.l());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public AbstractC4472bfE read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<String> list = this.f;
            String str = this.n;
            boolean z = this.k;
            String str2 = this.l;
            String str3 = this.j;
            String str4 = this.g;
            List<Stream> list2 = this.u;
            String str5 = this.s;
            String str6 = this.q;
            String str7 = this.m;
            boolean z2 = this.f13582o;
            boolean z3 = this.h;
            int i = this.t;
            String str8 = this.v;
            List<Integer> list3 = this.b;
            String str9 = this.i;
            String str10 = this.p;
            String str11 = str;
            boolean z4 = z;
            String str12 = str2;
            String str13 = str3;
            String str14 = str4;
            List<Stream> list4 = list2;
            String str15 = str5;
            String str16 = str6;
            String str17 = str7;
            boolean z5 = z2;
            boolean z6 = z3;
            int i2 = i;
            String str18 = str8;
            List<String> list5 = list;
            List<Integer> list6 = list3;
            String str19 = str9;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1881890573:
                            if (nextName.equals("streams")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1613589672:
                            if (nextName.equals("language")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1328920902:
                            if (nextName.equals("disallowedSubtitleTracks")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1124465727:
                            if (nextName.equals("codecName")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -446354959:
                            if (nextName.equals("hydrated")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -378584607:
                            if (nextName.equals("isNative")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -338537394:
                            if (nextName.equals("new_track_id")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -309425751:
                            if (nextName.equals("profile")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3355:
                            if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3492908:
                            if (nextName.equals("rank")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 203975574:
                            if (nextName.equals("offTrackDisallowed")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 729831205:
                            if (nextName.equals("trackType")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1124594342:
                            if (nextName.equals("bitrates")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1270478991:
                            if (nextName.equals("track_id")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1284739460:
                            if (nextName.equals("languageDescription")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1432626128:
                            if (nextName.equals("channels")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1851527107:
                            if (nextName.equals("defaultTimedText")) {
                                c = 16;
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
                            list4 = this.e.read(jsonReader);
                            continue;
                        case 1:
                            str11 = this.z.read(jsonReader);
                            continue;
                        case 2:
                            list5 = this.w.read(jsonReader);
                            continue;
                        case 3:
                            str19 = this.a.read(jsonReader);
                            continue;
                        case 4:
                            z6 = this.y.read(jsonReader).booleanValue();
                            continue;
                        case 5:
                            z4 = this.A.read(jsonReader).booleanValue();
                            continue;
                        case 6:
                            str17 = this.D.read(jsonReader);
                            continue;
                        case 7:
                            str10 = this.I.read(jsonReader);
                            continue;
                        case '\b':
                            str13 = this.x.read(jsonReader);
                            continue;
                        case '\t':
                            i2 = this.H.read(jsonReader).intValue();
                            continue;
                        case '\n':
                            z5 = this.B.read(jsonReader).booleanValue();
                            continue;
                        case 11:
                            str15 = this.F.read(jsonReader);
                            continue;
                        case '\f':
                            list6 = this.d.read(jsonReader);
                            continue;
                        case '\r':
                            str16 = this.G.read(jsonReader);
                            continue;
                        case 14:
                            str12 = this.C.read(jsonReader);
                            continue;
                        case 15:
                            str18 = this.c.read(jsonReader);
                            continue;
                        case 16:
                            str14 = this.r.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4478bfK(list5, str11, z4, str12, str13, str14, list4, str15, str16, str17, z5, z6, i2, str18, list6, str19, str10);
        }
    }
}
