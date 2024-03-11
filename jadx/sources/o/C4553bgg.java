package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4553bgg extends AbstractC4510bfq {
    C4553bgg(String str, long j, String str2) {
        super(str, j, str2);
    }

    /* renamed from: o.bgg$c */
    /* loaded from: classes.dex */
    public static final class c extends TypeAdapter<AbstractC4533bgM> {
        private final TypeAdapter<String> c;
        private final TypeAdapter<String> d;
        private final TypeAdapter<Long> i;
        private String a = null;
        private long b = 0;
        private String e = null;

        public c(Gson gson) {
            this.c = gson.getAdapter(String.class);
            this.i = gson.getAdapter(Long.class);
            this.d = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public void write(JsonWriter jsonWriter, AbstractC4533bgM abstractC4533bgM) {
            if (abstractC4533bgM == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("event");
            this.c.write(jsonWriter, abstractC4533bgM.e());
            jsonWriter.name("timeMs");
            this.i.write(jsonWriter, Long.valueOf(abstractC4533bgM.a()));
            jsonWriter.name("adEventToken");
            this.d.write(jsonWriter, abstractC4533bgM.d());
            jsonWriter.endObject();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0086 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o.AbstractC4533bgM read(com.google.gson.stream.JsonReader r10) {
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
                java.lang.String r0 = r9.a
                long r1 = r9.b
                java.lang.String r3 = r9.e
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
                r6 = -997834750(0xffffffffc4864002, float:-1074.0002)
                r7 = 2
                r8 = 1
                if (r5 == r6) goto L5b
                r6 = -873669293(0xffffffffcbecdd53, float:-3.104631E7)
                if (r5 == r6) goto L50
                r6 = 96891546(0x5c6729a, float:1.8661928E-35)
                if (r5 == r6) goto L45
                goto L63
            L45:
                java.lang.String r5 = "event"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L4e
                goto L63
            L4e:
                r4 = r7
                goto L66
            L50:
                java.lang.String r5 = "timeMs"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L59
                goto L63
            L59:
                r4 = r8
                goto L66
            L5b:
                java.lang.String r5 = "adEventToken"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L65
            L63:
                r4 = -1
                goto L66
            L65:
                r4 = 0
            L66:
                if (r4 == 0) goto L86
                if (r4 == r8) goto L79
                if (r4 == r7) goto L70
                r10.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r9.c
                java.lang.Object r0 = r0.read(r10)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.lang.Long> r1 = r9.i
                java.lang.Object r1 = r1.read(r10)
                java.lang.Long r1 = (java.lang.Long) r1
                long r1 = r1.longValue()
                goto L16
            L86:
                com.google.gson.TypeAdapter<java.lang.String> r3 = r9.d
                java.lang.Object r3 = r3.read(r10)
                java.lang.String r3 = (java.lang.String) r3
                goto L16
            L8f:
                r10.endObject()
                o.bgg r10 = new o.bgg
                r10.<init>(r0, r1, r3)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C4553bgg.c.read(com.google.gson.stream.JsonReader):o.bgM");
        }
    }
}
