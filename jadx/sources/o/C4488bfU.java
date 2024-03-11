package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4488bfU extends AbstractC4500bfg {
    C4488bfU(Map<String, AbstractC4529bgI> map, Map<String, String> map2, int i, String str, String str2, LiveMetadata.StreamingType streamingType, long j, boolean z) {
        super(map, map2, i, str, str2, streamingType, j, z);
    }

    /* renamed from: o.bfU$a */
    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<LiveMetadata> {
        private final TypeAdapter<Boolean> g;
        private final TypeAdapter<Map<String, String>> j;
        private final TypeAdapter<String> k;
        private final TypeAdapter<Integer> l;
        private final TypeAdapter<Long> m;
        private final TypeAdapter<String> n;

        /* renamed from: o  reason: collision with root package name */
        private final TypeAdapter<Map<String, AbstractC4529bgI>> f13583o;
        private final TypeAdapter<LiveMetadata.StreamingType> p;
        private Map<String, AbstractC4529bgI> f = null;
        private Map<String, String> c = null;
        private int h = 0;
        private String d = null;
        private String e = null;
        private LiveMetadata.StreamingType i = null;
        private long a = 0;
        private boolean b = false;

        public a a(LiveMetadata.StreamingType streamingType) {
            this.i = streamingType;
            return this;
        }

        public a(Gson gson) {
            this.f13583o = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4529bgI.class));
            this.j = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
            this.l = gson.getAdapter(Integer.class);
            this.n = gson.getAdapter(String.class);
            this.k = gson.getAdapter(String.class);
            this.p = gson.getAdapter(LiveMetadata.StreamingType.class);
            this.m = gson.getAdapter(Long.class);
            this.g = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, LiveMetadata liveMetadata) {
            if (liveMetadata == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("segmentTemplateIdToSegmentTemplate");
            this.f13583o.write(jsonWriter, liveMetadata.h());
            jsonWriter.name("downloadableIdToSegmentTemplateId");
            this.j.write(jsonWriter, liveMetadata.e());
            jsonWriter.name("ocLiveWindowDurationSeconds");
            this.l.write(jsonWriter, Integer.valueOf(liveMetadata.g()));
            jsonWriter.name("eventStartTime");
            this.n.write(jsonWriter, liveMetadata.a());
            jsonWriter.name("eventEndTime");
            this.k.write(jsonWriter, liveMetadata.d());
            jsonWriter.name("streamingType");
            this.p.write(jsonWriter, liveMetadata.i());
            jsonWriter.name("eventAvailabilityOffsetMs");
            this.m.write(jsonWriter, Long.valueOf(liveMetadata.c()));
            jsonWriter.name("disableLiveUi");
            this.g.write(jsonWriter, Boolean.valueOf(liveMetadata.b()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public LiveMetadata read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Map<String, AbstractC4529bgI> map = this.f;
            Map<String, String> map2 = this.c;
            int i = this.h;
            String str = this.d;
            String str2 = this.e;
            LiveMetadata.StreamingType streamingType = this.i;
            Map<String, AbstractC4529bgI> map3 = map;
            Map<String, String> map4 = map2;
            int i2 = i;
            String str3 = str;
            String str4 = str2;
            LiveMetadata.StreamingType streamingType2 = streamingType;
            long j = this.a;
            boolean z = this.b;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1288971826:
                            if (nextName.equals("eventAvailabilityOffsetMs")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1173388075:
                            if (nextName.equals("eventStartTime")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1051627096:
                            if (nextName.equals("disableLiveUi")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -698986930:
                            if (nextName.equals("eventEndTime")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 735716074:
                            if (nextName.equals("segmentTemplateIdToSegmentTemplate")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 753998524:
                            if (nextName.equals("streamingType")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1437047728:
                            if (nextName.equals("downloadableIdToSegmentTemplateId")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1609619259:
                            if (nextName.equals("ocLiveWindowDurationSeconds")) {
                                c = 7;
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
                            j = this.m.read(jsonReader).longValue();
                            continue;
                        case 1:
                            str3 = this.n.read(jsonReader);
                            continue;
                        case 2:
                            z = this.g.read(jsonReader).booleanValue();
                            continue;
                        case 3:
                            str4 = this.k.read(jsonReader);
                            continue;
                        case 4:
                            map3 = this.f13583o.read(jsonReader);
                            continue;
                        case 5:
                            streamingType2 = this.p.read(jsonReader);
                            continue;
                        case 6:
                            map4 = this.j.read(jsonReader);
                            continue;
                        case 7:
                            i2 = this.l.read(jsonReader).intValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4488bfU(map3, map4, i2, str3, str4, streamingType2, j, z);
        }
    }
}
