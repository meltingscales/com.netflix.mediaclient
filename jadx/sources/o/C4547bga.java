package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bga  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4547bga extends AbstractC4504bfk {
    C4547bga(Long l, long j, long j2, String str, List<List<Long>> list, Map<String, AbstractC4565bgs> map, long j3, PlaylistMap.TransitionHintType transitionHintType, AbstractC4539bgS abstractC4539bgS) {
        super(l, j, j2, str, list, map, j3, transitionHintType, abstractC4539bgS);
    }

    /* renamed from: o.bga$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4531bgK> {
        private final TypeAdapter<String> j;
        private final TypeAdapter<Long> k;
        private final TypeAdapter<Long> l;
        private final TypeAdapter<List<List<Long>>> m;
        private final TypeAdapter<Map<String, AbstractC4565bgs>> n;

        /* renamed from: o  reason: collision with root package name */
        private final TypeAdapter<Long> f13591o;
        private final TypeAdapter<AbstractC4539bgS> p;
        private final TypeAdapter<PlaylistMap.TransitionHintType> r;
        private final TypeAdapter<Long> t;
        private Long g = null;
        private long f = 0;
        private long d = 0;
        private String c = null;
        private List<List<Long>> b = null;
        private Map<String, AbstractC4565bgs> a = null;
        private long e = 0;
        private PlaylistMap.TransitionHintType i = null;
        private AbstractC4539bgS h = null;

        public d a(Map<String, AbstractC4565bgs> map) {
            this.a = map;
            return this;
        }

        public d b(long j) {
            this.d = j;
            return this;
        }

        public d b(PlaylistMap.TransitionHintType transitionHintType) {
            this.i = transitionHintType;
            return this;
        }

        public d b(List<List<Long>> list) {
            this.b = list;
            return this;
        }

        public d c(long j) {
            this.e = j;
            return this;
        }

        public d e(long j) {
            this.f = j;
            return this;
        }

        public d(Gson gson) {
            this.t = gson.getAdapter(Long.class);
            this.l = gson.getAdapter(Long.class);
            this.k = gson.getAdapter(Long.class);
            this.j = gson.getAdapter(String.class);
            this.m = gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Long.class).getType()));
            this.n = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4565bgs.class));
            this.f13591o = gson.getAdapter(Long.class);
            this.r = gson.getAdapter(PlaylistMap.TransitionHintType.class);
            this.p = gson.getAdapter(AbstractC4539bgS.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4531bgK abstractC4531bgK) {
            if (abstractC4531bgK == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("viewableId");
            this.t.write(jsonWriter, abstractC4531bgK.h());
            jsonWriter.name("startTimeMs");
            this.l.write(jsonWriter, Long.valueOf(abstractC4531bgK.f()));
            jsonWriter.name("endTimeMs");
            this.k.write(jsonWriter, Long.valueOf(abstractC4531bgK.c()));
            jsonWriter.name("defaultNext");
            this.j.write(jsonWriter, abstractC4531bgK.a());
            jsonWriter.name("exitZones");
            this.m.write(jsonWriter, abstractC4531bgK.b());
            jsonWriter.name("next");
            this.n.write(jsonWriter, abstractC4531bgK.e());
            jsonWriter.name("earliestSkipRequestOffset");
            this.f13591o.write(jsonWriter, Long.valueOf(abstractC4531bgK.d()));
            jsonWriter.name("transitionHint");
            this.r.write(jsonWriter, abstractC4531bgK.i());
            jsonWriter.name("ui");
            this.p.write(jsonWriter, abstractC4531bgK.g());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4531bgK read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Long l = this.g;
            long j = this.f;
            long j2 = this.d;
            String str = this.c;
            List<List<Long>> list = this.b;
            Map<String, AbstractC4565bgs> map = this.a;
            long j3 = this.e;
            Long l2 = l;
            long j4 = j;
            long j5 = j2;
            String str2 = str;
            List<List<Long>> list2 = list;
            Map<String, AbstractC4565bgs> map2 = map;
            long j6 = j3;
            PlaylistMap.TransitionHintType transitionHintType = this.i;
            AbstractC4539bgS abstractC4539bgS = this.h;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2004021892:
                            if (nextName.equals("transitionHint")) {
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
                        case -1478124806:
                            if (nextName.equals("viewableId")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1374311479:
                            if (nextName.equals("exitZones")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -437138220:
                            if (nextName.equals("defaultNext")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3732:
                            if (nextName.equals("ui")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3377907:
                            if (nextName.equals("next")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 135966640:
                            if (nextName.equals("earliestSkipRequestOffset")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1627521550:
                            if (nextName.equals("endTimeMs")) {
                                c = '\b';
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
                            transitionHintType = this.r.read(jsonReader);
                            continue;
                        case 1:
                            j4 = this.l.read(jsonReader).longValue();
                            continue;
                        case 2:
                            l2 = this.t.read(jsonReader);
                            continue;
                        case 3:
                            list2 = this.m.read(jsonReader);
                            continue;
                        case 4:
                            str2 = this.j.read(jsonReader);
                            continue;
                        case 5:
                            abstractC4539bgS = this.p.read(jsonReader);
                            continue;
                        case 6:
                            map2 = this.n.read(jsonReader);
                            continue;
                        case 7:
                            j6 = this.f13591o.read(jsonReader).longValue();
                            continue;
                        case '\b':
                            j5 = this.k.read(jsonReader).longValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4547bga(l2, j4, j5, str2, list2, map2, j6, transitionHintType, abstractC4539bgS);
        }
    }
}
