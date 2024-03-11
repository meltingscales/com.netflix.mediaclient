package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4486bfS extends AbstractC4499bff {
    C4486bfS(int i, long j, PlaylistMap.TransitionHintType transitionHintType) {
        super(i, j, transitionHintType);
    }

    /* renamed from: o.bfS$c */
    /* loaded from: classes.dex */
    public static final class c extends TypeAdapter<AbstractC4565bgs> {
        private final TypeAdapter<Long> b;
        private final TypeAdapter<PlaylistMap.TransitionHintType> c;
        private final TypeAdapter<Integer> f;
        private int d = 0;
        private long a = 0;
        private PlaylistMap.TransitionHintType e = null;

        public c e(long j) {
            this.a = j;
            return this;
        }

        public c e(PlaylistMap.TransitionHintType transitionHintType) {
            this.e = transitionHintType;
            return this;
        }

        public c(Gson gson) {
            this.f = gson.getAdapter(Integer.class);
            this.b = gson.getAdapter(Long.class);
            this.c = gson.getAdapter(PlaylistMap.TransitionHintType.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4565bgs abstractC4565bgs) {
            if (abstractC4565bgs == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("weight");
            this.f.write(jsonWriter, Integer.valueOf(abstractC4565bgs.e()));
            jsonWriter.name("earliestSkipRequestOffset");
            this.b.write(jsonWriter, Long.valueOf(abstractC4565bgs.b()));
            jsonWriter.name("transitionHint");
            this.c.write(jsonWriter, abstractC4565bgs.a());
            jsonWriter.endObject();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o.AbstractC4565bgs read(com.google.gson.stream.JsonReader r10) {
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
                int r0 = r9.d
                long r1 = r9.a
                com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap$TransitionHintType r3 = r9.e
            L16:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto L93
                java.lang.String r4 = r10.nextName()
                com.google.gson.stream.JsonToken r5 = r10.peek()
                com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                if (r5 != r6) goto L2c
                r10.nextNull()
                goto L16
            L2c:
                r4.hashCode()
                int r5 = r4.hashCode()
                r6 = -2004021892(0xffffffff888d0d7c, float:-8.489299E-34)
                r7 = 2
                r8 = 1
                if (r5 == r6) goto L5b
                r6 = -791592328(0xffffffffd0d14278, float:-2.80863539E10)
                if (r5 == r6) goto L50
                r6 = 135966640(0x81aafb0, float:4.654921E-34)
                if (r5 == r6) goto L45
                goto L63
            L45:
                java.lang.String r5 = "earliestSkipRequestOffset"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L4e
                goto L63
            L4e:
                r4 = r7
                goto L66
            L50:
                java.lang.String r5 = "weight"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L59
                goto L63
            L59:
                r4 = r8
                goto L66
            L5b:
                java.lang.String r5 = "transitionHint"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L65
            L63:
                r4 = -1
                goto L66
            L65:
                r4 = 0
            L66:
                if (r4 == 0) goto L8a
                if (r4 == r8) goto L7d
                if (r4 == r7) goto L70
                r10.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.lang.Long> r1 = r9.b
                java.lang.Object r1 = r1.read(r10)
                java.lang.Long r1 = (java.lang.Long) r1
                long r1 = r1.longValue()
                goto L16
            L7d:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r9.f
                java.lang.Object r0 = r0.read(r10)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                goto L16
            L8a:
                com.google.gson.TypeAdapter<com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap$TransitionHintType> r3 = r9.c
                java.lang.Object r3 = r3.read(r10)
                com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap$TransitionHintType r3 = (com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap.TransitionHintType) r3
                goto L16
            L93:
                r10.endObject()
                o.bfS r10 = new o.bfS
                r10.<init>(r0, r1, r3)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C4486bfS.c.read(com.google.gson.stream.JsonReader):o.bgs");
        }
    }
}
