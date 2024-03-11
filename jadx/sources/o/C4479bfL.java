package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfL  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4479bfL extends AbstractC4438beX {
    C4479bfL(String str, long j, Map<String, AbstractC4531bgK> map) {
        super(str, j, map);
    }

    /* renamed from: o.bfL$a */
    /* loaded from: classes.dex */
    public static final class a extends TypeAdapter<AbstractC4556bgj> {
        private final TypeAdapter<Map<String, AbstractC4531bgK>> b;
        private final TypeAdapter<String> d;
        private final TypeAdapter<Long> h;
        private String e = null;
        private long c = 0;
        private Map<String, AbstractC4531bgK> a = null;

        public a(Gson gson) {
            this.d = gson.getAdapter(String.class);
            this.h = gson.getAdapter(Long.class);
            this.b = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AbstractC4531bgK.class));
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4556bgj abstractC4556bgj) {
            if (abstractC4556bgj == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("initialSegment");
            this.d.write(jsonWriter, abstractC4556bgj.b());
            jsonWriter.name("viewableId");
            this.h.write(jsonWriter, Long.valueOf(abstractC4556bgj.c()));
            jsonWriter.name("segments");
            this.b.write(jsonWriter, abstractC4556bgj.a());
            jsonWriter.endObject();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o.AbstractC4556bgj read(com.google.gson.stream.JsonReader r10) {
            /*
                r9 = this;
                com.google.gson.stream.JsonToken r0 = r10.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r10.nextNull()
                r10 = 0
                return r10
            Ld:
                r10.beginObject()
                java.lang.String r0 = r9.e
                long r1 = r9.c
                java.util.Map<java.lang.String, o.bgK> r3 = r9.a
            L16:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto L8f
                java.lang.String r4 = r10.nextName()
                com.google.gson.stream.JsonToken r5 = r10.peek()
                com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                if (r5 != r6) goto L2c
                r10.nextNull()
                goto L16
            L2c:
                r4.hashCode()
                int r5 = r4.hashCode()
                r6 = -1478124806(0xffffffffa7e59afa, float:-6.3728294E-15)
                r7 = 2
                r8 = 1
                if (r5 == r6) goto L5b
                r6 = -877925553(0xffffffffcbabeb4f, float:-2.253379E7)
                if (r5 == r6) goto L50
                r6 = 1055868832(0x3eef47a0, float:0.46734333)
                if (r5 == r6) goto L45
                goto L63
            L45:
                java.lang.String r5 = "segments"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L4e
                goto L63
            L4e:
                r4 = r7
                goto L66
            L50:
                java.lang.String r5 = "initialSegment"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L59
                goto L63
            L59:
                r4 = r8
                goto L66
            L5b:
                java.lang.String r5 = "viewableId"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L65
            L63:
                r4 = -1
                goto L66
            L65:
                r4 = 0
            L66:
                if (r4 == 0) goto L82
                if (r4 == r8) goto L79
                if (r4 == r7) goto L70
                r10.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.util.Map<java.lang.String, o.bgK>> r3 = r9.b
                java.lang.Object r3 = r3.read(r10)
                java.util.Map r3 = (java.util.Map) r3
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r9.d
                java.lang.Object r0 = r0.read(r10)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L82:
                com.google.gson.TypeAdapter<java.lang.Long> r1 = r9.h
                java.lang.Object r1 = r1.read(r10)
                java.lang.Long r1 = (java.lang.Long) r1
                long r1 = r1.longValue()
                goto L16
            L8f:
                r10.endObject()
                o.bfL r10 = new o.bfL
                r10.<init>(r0, r1, r3)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C4479bfL.a.read(com.google.gson.stream.JsonReader):o.bgj");
        }
    }
}
