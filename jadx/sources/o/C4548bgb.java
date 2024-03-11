package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4548bgb extends AbstractC4503bfj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4548bgb(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: o.bgb$d */
    /* loaded from: classes.dex */
    public static final class d extends TypeAdapter<AbstractC4530bgJ> {
        private final TypeAdapter<String> b;
        private final TypeAdapter<String> e;
        private final TypeAdapter<String> h;
        private String a = null;
        private String c = null;
        private String d = null;

        public d(Gson gson) {
            this.h = gson.getAdapter(String.class);
            this.b = gson.getAdapter(String.class);
            this.e = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, AbstractC4530bgJ abstractC4530bgJ) {
            if (abstractC4530bgJ == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("videoTrackId");
            this.h.write(jsonWriter, abstractC4530bgJ.a());
            jsonWriter.name("audioTrackId");
            this.b.write(jsonWriter, abstractC4530bgJ.c());
            jsonWriter.name("timedTextTrackId");
            this.e.write(jsonWriter, abstractC4530bgJ.b());
            jsonWriter.endObject();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o.AbstractC4530bgJ read(com.google.gson.stream.JsonReader r9) {
            /*
                r8 = this;
                com.google.gson.stream.JsonToken r0 = r9.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r9.nextNull()
                r9 = 0
                return r9
            Ld:
                r9.beginObject()
                java.lang.String r0 = r8.a
                java.lang.String r1 = r8.c
                java.lang.String r2 = r8.d
            L16:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L8b
                java.lang.String r3 = r9.nextName()
                com.google.gson.stream.JsonToken r4 = r9.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 != r5) goto L2c
                r9.nextNull()
                goto L16
            L2c:
                r3.hashCode()
                int r4 = r3.hashCode()
                r5 = -1214552373(0xffffffffb79b66cb, float:-1.8525307E-5)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = 1230385698(0x49563222, float:877346.1)
                if (r4 == r5) goto L50
                r5 = 1641214736(0x61d2f310, float:4.8641634E20)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "audioTrackId"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "timedTextTrackId"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "videoTrackId"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L65
            L63:
                r3 = -1
                goto L66
            L65:
                r3 = 0
            L66:
                if (r3 == 0) goto L82
                if (r3 == r7) goto L79
                if (r3 == r6) goto L70
                r9.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.lang.String> r1 = r8.b
                java.lang.Object r1 = r1.read(r9)
                java.lang.String r1 = (java.lang.String) r1
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r8.e
                java.lang.Object r2 = r2.read(r9)
                java.lang.String r2 = (java.lang.String) r2
                goto L16
            L82:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r8.h
                java.lang.Object r0 = r0.read(r9)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L8b:
                r9.endObject()
                o.bgb r9 = new o.bgb
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C4548bgb.d.read(com.google.gson.stream.JsonReader):o.bgJ");
        }
    }
}
