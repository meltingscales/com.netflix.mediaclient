package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfX  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4491bfX extends AbstractC4505bfl {
    C4491bfX(String str, long j, long j2, String str2, String str3, long j3, long j4) {
        super(str, j, j2, str2, str3, j3, j4);
    }

    /* renamed from: o.bfX$a */
    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<AbstractC4529bgI> {
        private final TypeAdapter<String> a;
        private final TypeAdapter<Long> i;
        private final TypeAdapter<String> j;
        private final TypeAdapter<Long> k;
        private final TypeAdapter<Long> m;
        private final TypeAdapter<Long> n;

        /* renamed from: o  reason: collision with root package name */
        private final TypeAdapter<String> f13586o;
        private String e = null;
        private long f = 0;
        private long g = 0;
        private String d = null;
        private String b = null;
        private long c = 0;
        private long h = 0;

        public a(Gson gson) {
            this.a = gson.getAdapter(String.class);
            this.m = gson.getAdapter(Long.class);
            this.k = gson.getAdapter(Long.class);
            this.f13586o = gson.getAdapter(String.class);
            this.j = gson.getAdapter(String.class);
            this.i = gson.getAdapter(Long.class);
            this.n = gson.getAdapter(Long.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, AbstractC4529bgI abstractC4529bgI) {
            if (abstractC4529bgI == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("availabilityStartTime");
            this.a.write(jsonWriter, abstractC4529bgI.c());
            jsonWriter.name("presentationTimeOffset");
            this.m.write(jsonWriter, Long.valueOf(abstractC4529bgI.d()));
            jsonWriter.name("timescale");
            this.k.write(jsonWriter, Long.valueOf(abstractC4529bgI.j()));
            jsonWriter.name("media");
            this.f13586o.write(jsonWriter, abstractC4529bgI.a());
            jsonWriter.name("initialization");
            this.j.write(jsonWriter, abstractC4529bgI.e());
            jsonWriter.name("duration");
            this.i.write(jsonWriter, Long.valueOf(abstractC4529bgI.b()));
            jsonWriter.name("startNumber");
            this.n.write(jsonWriter, Long.valueOf(abstractC4529bgI.g()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AbstractC4529bgI read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.e;
            long j = this.f;
            long j2 = this.g;
            String str2 = this.d;
            String str3 = this.b;
            String str4 = str;
            long j3 = j;
            long j4 = j2;
            String str5 = str2;
            String str6 = str3;
            long j5 = this.c;
            long j6 = this.h;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2008532405:
                            if (nextName.equals("startNumber")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1992012396:
                            if (nextName.equals("duration")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -791750534:
                            if (nextName.equals("presentationTimeOffset")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 54619805:
                            if (nextName.equals("timescale")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 103772132:
                            if (nextName.equals("media")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1339714356:
                            if (nextName.equals("availabilityStartTime")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2063169696:
                            if (nextName.equals("initialization")) {
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
                            j6 = this.n.read(jsonReader).longValue();
                            continue;
                        case 1:
                            j5 = this.i.read(jsonReader).longValue();
                            continue;
                        case 2:
                            j3 = this.m.read(jsonReader).longValue();
                            continue;
                        case 3:
                            j4 = this.k.read(jsonReader).longValue();
                            continue;
                        case 4:
                            str5 = this.f13586o.read(jsonReader);
                            continue;
                        case 5:
                            str4 = this.a.read(jsonReader);
                            continue;
                        case 6:
                            str6 = this.j.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4491bfX(str4, j3, j4, str5, str6, j5, j6);
        }
    }
}
