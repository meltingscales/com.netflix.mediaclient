package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.brn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5070brn extends AbstractC5068brl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5070brn(String str, String str2, int i, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, long j5, long j6, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        super(str, str2, i, f, f2, j, j2, j3, j4, f3, f4, j5, j6, f5, f6, f7, f8, f9, f10, f11, f12, f13);
    }

    /* renamed from: o.brn$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC5079brw> {
        private final TypeAdapter<Float> D;
        private final TypeAdapter<Float> E;
        private final TypeAdapter<Float> F;
        private final TypeAdapter<Float> G;
        private final TypeAdapter<Long> H;
        private final TypeAdapter<Float> I;

        /* renamed from: J  reason: collision with root package name */
        private final TypeAdapter<Float> f13630J;
        private final TypeAdapter<Long> K;
        private final TypeAdapter<Long> L;
        private final TypeAdapter<Float> M;
        private final TypeAdapter<Integer> N;
        private final TypeAdapter<Float> O;
        private final TypeAdapter<String> P;
        private final TypeAdapter<Float> Q;
        private final TypeAdapter<Float> S;
        private final TypeAdapter<Float> a;
        private final TypeAdapter<Long> b;
        private final TypeAdapter<Float> c;
        private final TypeAdapter<Long> d;
        private final TypeAdapter<Float> e;
        private final TypeAdapter<String> h;
        private final TypeAdapter<Long> z;
        private String C = null;
        private String k = null;
        private int y = 0;
        private float m = 0.0f;
        private float A = 0.0f;
        private long v = 0;
        private long w = 0;

        /* renamed from: o  reason: collision with root package name */
        private long f13631o = 0;
        private long g = 0;
        private float B = 0.0f;
        private float u = 0.0f;
        private long l = 0;
        private long n = 0;
        private float j = 0.0f;
        private float s = 0.0f;
        private float q = 0.0f;
        private float f = 0.0f;
        private float r = 0.0f;
        private float p = 0.0f;
        private float i = 0.0f;
        private float x = 0.0f;
        private float t = 0.0f;

        public b(Gson gson) {
            this.P = gson.getAdapter(String.class);
            this.h = gson.getAdapter(String.class);
            this.N = gson.getAdapter(Integer.class);
            this.D = gson.getAdapter(Float.class);
            this.Q = gson.getAdapter(Float.class);
            this.L = gson.getAdapter(Long.class);
            this.K = gson.getAdapter(Long.class);
            this.b = gson.getAdapter(Long.class);
            this.d = gson.getAdapter(Long.class);
            this.S = gson.getAdapter(Float.class);
            this.O = gson.getAdapter(Float.class);
            this.H = gson.getAdapter(Long.class);
            this.z = gson.getAdapter(Long.class);
            this.e = gson.getAdapter(Float.class);
            this.G = gson.getAdapter(Float.class);
            this.F = gson.getAdapter(Float.class);
            this.c = gson.getAdapter(Float.class);
            this.f13630J = gson.getAdapter(Float.class);
            this.E = gson.getAdapter(Float.class);
            this.a = gson.getAdapter(Float.class);
            this.M = gson.getAdapter(Float.class);
            this.I = gson.getAdapter(Float.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC5079brw abstractC5079brw) {
            if (abstractC5079brw == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("sdk");
            this.P.write(jsonWriter, abstractC5079brw.q());
            jsonWriter.name("codec");
            this.h.write(jsonWriter, abstractC5079brw.g());
            jsonWriter.name("rate");
            this.N.write(jsonWriter, Integer.valueOf(abstractC5079brw.p()));
            jsonWriter.name("downloadBw");
            this.D.write(jsonWriter, Float.valueOf(abstractC5079brw.f()));
            jsonWriter.name("uploadBw");
            this.Q.write(jsonWriter, Float.valueOf(abstractC5079brw.u()));
            jsonWriter.name("packetsSent");
            this.L.write(jsonWriter, Long.valueOf(abstractC5079brw.t()));
            jsonWriter.name("packetsReceived");
            this.K.write(jsonWriter, Long.valueOf(abstractC5079brw.r()));
            jsonWriter.name("bytesSent");
            this.b.write(jsonWriter, Long.valueOf(abstractC5079brw.a()));
            jsonWriter.name("bytesReceived");
            this.d.write(jsonWriter, Long.valueOf(abstractC5079brw.d()));
            jsonWriter.name("sendLossRate");
            this.S.write(jsonWriter, Float.valueOf(abstractC5079brw.v()));
            jsonWriter.name("recvLossRate");
            this.O.write(jsonWriter, Float.valueOf(abstractC5079brw.s()));
            jsonWriter.name("incomingTooLate");
            this.H.write(jsonWriter, Long.valueOf(abstractC5079brw.j()));
            jsonWriter.name("incomingPacketsLost");
            this.z.write(jsonWriter, Long.valueOf(abstractC5079brw.i()));
            jsonWriter.name("averageJitterRx");
            this.e.write(jsonWriter, Float.valueOf(abstractC5079brw.b()));
            jsonWriter.name("minJitterRx");
            this.G.write(jsonWriter, Float.valueOf(abstractC5079brw.m()));
            jsonWriter.name("maxJitterRx");
            this.F.write(jsonWriter, Float.valueOf(abstractC5079brw.h()));
            jsonWriter.name("averageJitterTx");
            this.c.write(jsonWriter, Float.valueOf(abstractC5079brw.c()));
            jsonWriter.name("minJitterTx");
            this.f13630J.write(jsonWriter, Float.valueOf(abstractC5079brw.k()));
            jsonWriter.name("maxJitterTx");
            this.E.write(jsonWriter, Float.valueOf(abstractC5079brw.l()));
            jsonWriter.name("averageRtt");
            this.a.write(jsonWriter, Float.valueOf(abstractC5079brw.e()));
            jsonWriter.name("minRtt");
            this.M.write(jsonWriter, Float.valueOf(abstractC5079brw.n()));
            jsonWriter.name("maxRtt");
            this.I.write(jsonWriter, Float.valueOf(abstractC5079brw.o()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC5079brw read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.C;
            String str2 = this.k;
            int i = this.y;
            float f = this.m;
            float f2 = this.A;
            long j = this.v;
            long j2 = this.w;
            long j3 = this.f13631o;
            long j4 = this.g;
            float f3 = this.B;
            float f4 = this.u;
            long j5 = this.l;
            long j6 = this.n;
            float f5 = this.j;
            float f6 = this.s;
            float f7 = this.q;
            float f8 = this.f;
            float f9 = this.r;
            float f10 = this.p;
            float f11 = this.i;
            float f12 = this.x;
            float f13 = this.t;
            float f14 = f6;
            int i2 = i;
            float f15 = f;
            float f16 = f2;
            long j7 = j;
            long j8 = j2;
            long j9 = j3;
            long j10 = j4;
            float f17 = f3;
            String str3 = str;
            String str4 = str2;
            float f18 = f4;
            long j11 = j5;
            long j12 = j6;
            float f19 = f5;
            float f20 = f7;
            float f21 = f8;
            float f22 = f9;
            float f23 = f10;
            float f24 = f11;
            float f25 = f12;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2033658205:
                            if (nextName.equals("bytesSent")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1934772567:
                            if (nextName.equals("recvLossRate")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1497929141:
                            if (nextName.equals("sendLossRate")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1296873708:
                            if (nextName.equals("incomingTooLate")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1081150866:
                            if (nextName.equals("maxRtt")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1074060608:
                            if (nextName.equals("minRtt")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -791916887:
                            if (nextName.equals("incomingPacketsLost")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -755963708:
                            if (nextName.equals("minJitterRx")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -755963646:
                            if (nextName.equals("minJitterTx")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -78531114:
                            if (nextName.equals("maxJitterRx")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -78531052:
                            if (nextName.equals("maxJitterTx")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 113722:
                            if (nextName.equals("sdk")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3493088:
                            if (nextName.equals("rate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 94834710:
                            if (nextName.equals("codec")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 488428309:
                            if (nextName.equals("averageRtt")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 549067555:
                            if (nextName.equals("packetsSent")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 920221676:
                            if (nextName.equals("packetsReceived")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 941519724:
                            if (nextName.equals("bytesReceived")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1563990582:
                            if (nextName.equals("uploadBw")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1751721359:
                            if (nextName.equals("averageJitterRx")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1751721421:
                            if (nextName.equals("averageJitterTx")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2039140093:
                            if (nextName.equals("downloadBw")) {
                                c = 21;
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
                            j9 = this.b.read(jsonReader).longValue();
                            continue;
                        case 1:
                            f18 = this.O.read(jsonReader).floatValue();
                            continue;
                        case 2:
                            f17 = this.S.read(jsonReader).floatValue();
                            continue;
                        case 3:
                            j11 = this.H.read(jsonReader).longValue();
                            continue;
                        case 4:
                            f13 = this.I.read(jsonReader).floatValue();
                            continue;
                        case 5:
                            f25 = this.M.read(jsonReader).floatValue();
                            continue;
                        case 6:
                            j12 = this.z.read(jsonReader).longValue();
                            continue;
                        case 7:
                            f14 = this.G.read(jsonReader).floatValue();
                            continue;
                        case '\b':
                            f22 = this.f13630J.read(jsonReader).floatValue();
                            continue;
                        case '\t':
                            f20 = this.F.read(jsonReader).floatValue();
                            continue;
                        case '\n':
                            f23 = this.E.read(jsonReader).floatValue();
                            continue;
                        case 11:
                            str3 = this.P.read(jsonReader);
                            continue;
                        case '\f':
                            i2 = this.N.read(jsonReader).intValue();
                            continue;
                        case '\r':
                            str4 = this.h.read(jsonReader);
                            continue;
                        case 14:
                            f24 = this.a.read(jsonReader).floatValue();
                            continue;
                        case 15:
                            j7 = this.L.read(jsonReader).longValue();
                            continue;
                        case 16:
                            j8 = this.K.read(jsonReader).longValue();
                            continue;
                        case 17:
                            j10 = this.d.read(jsonReader).longValue();
                            continue;
                        case 18:
                            f16 = this.Q.read(jsonReader).floatValue();
                            continue;
                        case 19:
                            f19 = this.e.read(jsonReader).floatValue();
                            continue;
                        case 20:
                            f21 = this.c.read(jsonReader).floatValue();
                            continue;
                        case 21:
                            f15 = this.D.read(jsonReader).floatValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C5070brn(str3, str4, i2, f15, f16, j7, j8, j9, j10, f17, f18, j11, j12, f19, f14, f20, f21, f22, f23, f24, f25, f13);
        }
    }
}
