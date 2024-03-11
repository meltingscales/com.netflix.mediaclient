package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import java.util.List;
import java.util.Map;
import org.chromium.net.ConnectionSubtype;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfV  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4489bfV extends AbstractC4501bfh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4489bfV(long j, List<AbstractC4537bgQ> list, List<AbstractC4567bgu> list2, AbstractC4554bgh abstractC4554bgh, long j2, List<AbstractC4541bgU> list3, List<AbstractC4472bfE> list4, List<VideoTrack> list5, AbstractC4564bgr abstractC4564bgr, List<AbstractC4562bgp> list6, String str, long j3, Watermark watermark, long j4, AbstractC4556bgj abstractC4556bgj, List<AbstractC4534bgN> list7, List<Location> list8, Map<String, String> map, AbstractC4530bgJ abstractC4530bgJ, Integer num, Integer num2, AbstractC4558bgl abstractC4558bgl, List<AbstractC4566bgt> list9, String str2, AbstractC4473bfF abstractC4473bfF, String str3, LiveMetadata liveMetadata, Boolean bool, AbstractC4532bgL abstractC4532bgL) {
        super(j, list, list2, abstractC4554bgh, j2, list3, list4, list5, abstractC4564bgr, list6, str, j3, watermark, j4, abstractC4556bgj, list7, list8, map, abstractC4530bgJ, num, num2, abstractC4558bgl, list9, str2, abstractC4473bfF, str3, liveMetadata, bool, abstractC4532bgL);
    }

    /* renamed from: o.bfV$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4566bgt> {
        private final TypeAdapter<List<AbstractC4562bgp>> I;
        private final TypeAdapter<Long> K;
        private final TypeAdapter<Map<String, String>> M;
        private final TypeAdapter<Long> N;
        private final TypeAdapter<Long> O;
        private final TypeAdapter<List<Location>> P;
        private final TypeAdapter<LiveMetadata> Q;
        private final TypeAdapter<AbstractC4564bgr> R;
        private final TypeAdapter<Boolean> S;
        private final TypeAdapter<String> T;
        private final TypeAdapter<Integer> U;
        private final TypeAdapter<Integer> V;
        private final TypeAdapter<List<AbstractC4567bgu>> W;
        private final TypeAdapter<Long> X;
        private final TypeAdapter<List<AbstractC4541bgU>> Y;
        private final TypeAdapter<List<AbstractC4537bgQ>> Z;
        private final TypeAdapter<List<AbstractC4566bgt>> a;
        private final TypeAdapter<AbstractC4530bgJ> aa;
        private final TypeAdapter<List<AbstractC4534bgN>> ab;
        private final TypeAdapter<AbstractC4532bgL> ac;
        private final TypeAdapter<Watermark> ae;
        private final TypeAdapter<List<VideoTrack>> af;
        private final TypeAdapter<String> ah;
        private final TypeAdapter<String> b;
        private final TypeAdapter<AbstractC4473bfF> c;
        private final TypeAdapter<List<AbstractC4472bfE>> d;
        private final TypeAdapter<AbstractC4554bgh> e;
        private final TypeAdapter<AbstractC4558bgl> f;
        private final TypeAdapter<AbstractC4556bgj> h;
        private long D = 0;
        private List<AbstractC4537bgQ> E = null;
        private List<AbstractC4567bgu> z = null;
        private AbstractC4554bgh k = null;
        private long s = 0;
        private List<AbstractC4541bgU> F = null;
        private List<AbstractC4472bfE> g = null;
        private List<VideoTrack> H = null;
        private AbstractC4564bgr q = null;

        /* renamed from: o  reason: collision with root package name */
        private List<AbstractC4562bgp> f13585o = null;
        private String C = null;
        private long x = 0;
        private Watermark L = null;
        private long r = 0;
        private AbstractC4556bgj m = null;
        private List<AbstractC4534bgN> A = null;
        private List<Location> u = null;
        private Map<String, String> p = null;
        private AbstractC4530bgJ B = null;
        private Integer y = null;
        private Integer w = null;
        private AbstractC4558bgl l = null;
        private List<AbstractC4566bgt> n = null;
        private String j = null;
        private AbstractC4473bfF i = null;

        /* renamed from: J  reason: collision with root package name */
        private String f13584J = null;
        private LiveMetadata v = null;
        private Boolean t = null;
        private AbstractC4532bgL G = null;

        public d a(long j) {
            this.x = j;
            return this;
        }

        public d a(List<VideoTrack> list) {
            this.H = list;
            return this;
        }

        public d b(List<AbstractC4541bgU> list) {
            this.F = list;
            return this;
        }

        public d c(Boolean bool) {
            this.t = bool;
            return this;
        }

        public d c(List<AbstractC4567bgu> list) {
            this.z = list;
            return this;
        }

        public d d(List<AbstractC4472bfE> list) {
            this.g = list;
            return this;
        }

        public d e(List<AbstractC4537bgQ> list) {
            this.E = list;
            return this;
        }

        public d(Gson gson) {
            this.X = gson.getAdapter(Long.class);
            this.Z = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4537bgQ.class));
            this.W = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4567bgu.class));
            this.e = gson.getAdapter(AbstractC4554bgh.class);
            this.K = gson.getAdapter(Long.class);
            this.Y = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4541bgU.class));
            this.d = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4472bfE.class));
            this.af = gson.getAdapter(TypeToken.getParameterized(List.class, VideoTrack.class));
            this.R = gson.getAdapter(AbstractC4564bgr.class);
            this.I = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4562bgp.class));
            this.T = gson.getAdapter(String.class);
            this.O = gson.getAdapter(Long.class);
            this.ae = gson.getAdapter(Watermark.class);
            this.N = gson.getAdapter(Long.class);
            this.h = gson.getAdapter(AbstractC4556bgj.class);
            this.ab = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4534bgN.class));
            this.P = gson.getAdapter(TypeToken.getParameterized(List.class, Location.class));
            this.M = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
            this.aa = gson.getAdapter(AbstractC4530bgJ.class);
            this.V = gson.getAdapter(Integer.class);
            this.U = gson.getAdapter(Integer.class);
            this.f = gson.getAdapter(AbstractC4558bgl.class);
            this.a = gson.getAdapter(TypeToken.getParameterized(List.class, AbstractC4566bgt.class));
            this.b = gson.getAdapter(String.class);
            this.c = gson.getAdapter(AbstractC4473bfF.class);
            this.ah = gson.getAdapter(String.class);
            this.Q = gson.getAdapter(LiveMetadata.class);
            this.S = gson.getAdapter(Boolean.class);
            this.ac = gson.getAdapter(AbstractC4532bgL.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, AbstractC4566bgt abstractC4566bgt) {
            if (abstractC4566bgt == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("movieId");
            this.X.write(jsonWriter, Long.valueOf(abstractC4566bgt.s()));
            jsonWriter.name("timedtexttracks");
            this.Z.write(jsonWriter, abstractC4566bgt.y());
            jsonWriter.name("media");
            this.W.write(jsonWriter, abstractC4566bgt.t());
            jsonWriter.name("cdnResponseData");
            this.e.write(jsonWriter, abstractC4566bgt.b());
            jsonWriter.name("duration");
            this.K.write(jsonWriter, Long.valueOf(abstractC4566bgt.g()));
            jsonWriter.name("trickplays");
            this.Y.write(jsonWriter, abstractC4566bgt.z());
            jsonWriter.name("audio_tracks");
            this.d.write(jsonWriter, abstractC4566bgt.d());
            jsonWriter.name("video_tracks");
            this.af.write(jsonWriter, abstractC4566bgt.C());
            jsonWriter.name("links");
            this.R.write(jsonWriter, abstractC4566bgt.o());
            jsonWriter.name("defaultTrackOrderList");
            this.I.write(jsonWriter, abstractC4566bgt.h());
            jsonWriter.name("playbackContextId");
            this.T.write(jsonWriter, abstractC4566bgt.w());
            jsonWriter.name("timestamp");
            this.O.write(jsonWriter, Long.valueOf(abstractC4566bgt.r()));
            jsonWriter.name("watermarkInfo");
            this.ae.write(jsonWriter, abstractC4566bgt.D());
            jsonWriter.name("expiration");
            this.N.write(jsonWriter, Long.valueOf(abstractC4566bgt.l()));
            jsonWriter.name("choiceMap");
            this.h.write(jsonWriter, abstractC4566bgt.f());
            jsonWriter.name("servers");
            this.ab.write(jsonWriter, abstractC4566bgt.u());
            jsonWriter.name("locations");
            this.P.write(jsonWriter, abstractC4566bgt.k());
            jsonWriter.name("eligibleABTests");
            this.M.write(jsonWriter, abstractC4566bgt.i());
            jsonWriter.name("recommendedMedia");
            this.aa.write(jsonWriter, abstractC4566bgt.v());
            jsonWriter.name("maxRecommendedAudioRank");
            this.V.write(jsonWriter, abstractC4566bgt.p());
            jsonWriter.name("maxRecommendedTextRank");
            this.U.write(jsonWriter, abstractC4566bgt.q());
            jsonWriter.name("contentPlaygraph");
            this.f.write(jsonWriter, abstractC4566bgt.j());
            jsonWriter.name("auxiliaryManifests");
            this.a.write(jsonWriter, abstractC4566bgt.a());
            jsonWriter.name("auxiliaryManifestToken");
            this.b.write(jsonWriter, abstractC4566bgt.c());
            jsonWriter.name("adverts");
            this.c.write(jsonWriter, abstractC4566bgt.e());
            jsonWriter.name("viewableType");
            this.ah.write(jsonWriter, abstractC4566bgt.A());
            jsonWriter.name("liveMetadata");
            this.Q.write(jsonWriter, abstractC4566bgt.n());
            jsonWriter.name("isAd");
            this.S.write(jsonWriter, abstractC4566bgt.m());
            jsonWriter.name("steeringAdditionalInfo");
            this.ac.write(jsonWriter, abstractC4566bgt.x());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public AbstractC4566bgt read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = this.D;
            List<AbstractC4537bgQ> list = this.E;
            List<AbstractC4567bgu> list2 = this.z;
            AbstractC4554bgh abstractC4554bgh = this.k;
            long j2 = this.s;
            List<AbstractC4541bgU> list3 = this.F;
            List<AbstractC4472bfE> list4 = this.g;
            List<VideoTrack> list5 = this.H;
            AbstractC4564bgr abstractC4564bgr = this.q;
            List<AbstractC4562bgp> list6 = this.f13585o;
            String str = this.C;
            long j3 = this.x;
            Watermark watermark = this.L;
            long j4 = this.r;
            AbstractC4556bgj abstractC4556bgj = this.m;
            List<AbstractC4534bgN> list7 = this.A;
            List<Location> list8 = this.u;
            Map<String, String> map = this.p;
            AbstractC4530bgJ abstractC4530bgJ = this.B;
            Integer num = this.y;
            Integer num2 = this.w;
            AbstractC4558bgl abstractC4558bgl = this.l;
            List<AbstractC4566bgt> list9 = this.n;
            String str2 = this.j;
            AbstractC4473bfF abstractC4473bfF = this.i;
            String str3 = this.f13584J;
            LiveMetadata liveMetadata = this.v;
            Boolean bool = this.t;
            AbstractC4532bgL abstractC4532bgL = this.G;
            List<AbstractC4534bgN> list10 = list7;
            List<AbstractC4537bgQ> list11 = list;
            List<AbstractC4567bgu> list12 = list2;
            AbstractC4554bgh abstractC4554bgh2 = abstractC4554bgh;
            long j5 = j2;
            List<AbstractC4541bgU> list13 = list3;
            List<AbstractC4472bfE> list14 = list4;
            List<VideoTrack> list15 = list5;
            AbstractC4564bgr abstractC4564bgr2 = abstractC4564bgr;
            List<AbstractC4562bgp> list16 = list6;
            String str4 = str;
            long j6 = j;
            long j7 = j3;
            Watermark watermark2 = watermark;
            long j8 = j4;
            AbstractC4556bgj abstractC4556bgj2 = abstractC4556bgj;
            List<Location> list17 = list8;
            Map<String, String> map2 = map;
            AbstractC4530bgJ abstractC4530bgJ2 = abstractC4530bgJ;
            Integer num3 = num;
            Integer num4 = num2;
            AbstractC4558bgl abstractC4558bgl2 = abstractC4558bgl;
            List<AbstractC4566bgt> list18 = list9;
            String str5 = str2;
            AbstractC4473bfF abstractC4473bfF2 = abstractC4473bfF;
            String str6 = str3;
            LiveMetadata liveMetadata2 = liveMetadata;
            Boolean bool2 = bool;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2061998004:
                            if (nextName.equals("trickplays")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -2002745521:
                            if (nextName.equals("playbackContextId")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1992012396:
                            if (nextName.equals("duration")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1906613687:
                            if (nextName.equals("recommendedMedia")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1411540791:
                            if (nextName.equals("eligibleABTests")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1408254703:
                            if (nextName.equals("audio_tracks")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225298126:
                            if (nextName.equals("watermarkInfo")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1197189282:
                            if (nextName.equals("locations")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1131443425:
                            if (nextName.equals("adverts")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1037642132:
                            if (nextName.equals("timedtexttracks")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -955980638:
                            if (nextName.equals("defaultTrackOrderList")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -837465425:
                            if (nextName.equals("expiration")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -698980264:
                            if (nextName.equals("cdnResponseData")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -415219642:
                            if (nextName.equals("steeringAdditionalInfo")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3240685:
                            if (nextName.equals("isAd")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 30945484:
                            if (nextName.equals("video_tracks")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 55126294:
                            if (nextName.equals("timestamp")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102977465:
                            if (nextName.equals("links")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 103772132:
                            if (nextName.equals("media")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 248707617:
                            if (nextName.equals("contentPlaygraph")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 566697584:
                            if (nextName.equals("maxRecommendedTextRank")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 625141246:
                            if (nextName.equals("auxiliaryManifests")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 848551931:
                            if (nextName.equals("choiceMap")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1156587865:
                            if (nextName.equals("viewableType")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1243692139:
                            if (nextName.equals("movieId")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1386275899:
                            if (nextName.equals("liveMetadata")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1539502564:
                            if (nextName.equals("auxiliaryManifestToken")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1626011787:
                            if (nextName.equals("maxRecommendedAudioRank")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1984149904:
                            if (nextName.equals("servers")) {
                                c = 28;
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
                            list13 = this.Y.read(jsonReader);
                            continue;
                        case 1:
                            str4 = this.T.read(jsonReader);
                            continue;
                        case 2:
                            j5 = this.K.read(jsonReader).longValue();
                            continue;
                        case 3:
                            abstractC4530bgJ2 = this.aa.read(jsonReader);
                            continue;
                        case 4:
                            map2 = this.M.read(jsonReader);
                            continue;
                        case 5:
                            list14 = this.d.read(jsonReader);
                            continue;
                        case 6:
                            watermark2 = this.ae.read(jsonReader);
                            continue;
                        case 7:
                            list17 = this.P.read(jsonReader);
                            continue;
                        case '\b':
                            abstractC4473bfF2 = this.c.read(jsonReader);
                            continue;
                        case '\t':
                            list11 = this.Z.read(jsonReader);
                            continue;
                        case '\n':
                            list16 = this.I.read(jsonReader);
                            continue;
                        case 11:
                            j8 = this.N.read(jsonReader).longValue();
                            continue;
                        case '\f':
                            abstractC4554bgh2 = this.e.read(jsonReader);
                            continue;
                        case '\r':
                            abstractC4532bgL = this.ac.read(jsonReader);
                            continue;
                        case 14:
                            bool2 = this.S.read(jsonReader);
                            continue;
                        case 15:
                            list15 = this.af.read(jsonReader);
                            continue;
                        case 16:
                            j7 = this.O.read(jsonReader).longValue();
                            continue;
                        case 17:
                            abstractC4564bgr2 = this.R.read(jsonReader);
                            continue;
                        case 18:
                            list12 = this.W.read(jsonReader);
                            continue;
                        case 19:
                            abstractC4558bgl2 = this.f.read(jsonReader);
                            continue;
                        case 20:
                            num4 = this.U.read(jsonReader);
                            continue;
                        case 21:
                            list18 = this.a.read(jsonReader);
                            continue;
                        case 22:
                            abstractC4556bgj2 = this.h.read(jsonReader);
                            continue;
                        case 23:
                            str6 = this.ah.read(jsonReader);
                            continue;
                        case 24:
                            j6 = this.X.read(jsonReader).longValue();
                            continue;
                        case 25:
                            liveMetadata2 = this.Q.read(jsonReader);
                            continue;
                        case 26:
                            str5 = this.b.read(jsonReader);
                            continue;
                        case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                            num3 = this.V.read(jsonReader);
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                            list10 = this.ab.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4489bfV(j6, list11, list12, abstractC4554bgh2, j5, list13, list14, list15, abstractC4564bgr2, list16, str4, j7, watermark2, j8, abstractC4556bgj2, list10, list17, map2, abstractC4530bgJ2, num3, num4, abstractC4558bgl2, list18, str5, abstractC4473bfF2, str6, liveMetadata2, bool2, abstractC4532bgL);
        }
    }
}
