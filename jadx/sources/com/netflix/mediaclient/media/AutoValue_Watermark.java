package com.netflix.mediaclient.media;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Watermark extends C$AutoValue_Watermark {
    AutoValue_Watermark(final String str, final int i, final Watermark.Anchor anchor) {
        new Watermark(str, i, anchor) { // from class: com.netflix.mediaclient.media.$AutoValue_Watermark
            private final Watermark.Anchor anchor;
            private final String identifier;
            private final int opacity;

            @Override // com.netflix.mediaclient.media.Watermark
            @SerializedName("anchor")
            public Watermark.Anchor anchor() {
                return this.anchor;
            }

            @Override // com.netflix.mediaclient.media.Watermark
            @SerializedName(SignupConstants.Field.LANG_ID)
            public String identifier() {
                return this.identifier;
            }

            @Override // com.netflix.mediaclient.media.Watermark
            @SerializedName(InteractiveAnimation.ANIMATION_TYPE.OPACITY)
            public int opacity() {
                return this.opacity;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (str == null) {
                    throw new NullPointerException("Null identifier");
                }
                this.identifier = str;
                this.opacity = i;
                if (anchor == null) {
                    throw new NullPointerException("Null anchor");
                }
                this.anchor = anchor;
            }

            public String toString() {
                return "Watermark{identifier=" + this.identifier + ", opacity=" + this.opacity + ", anchor=" + this.anchor + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Watermark) {
                    Watermark watermark = (Watermark) obj;
                    return this.identifier.equals(watermark.identifier()) && this.opacity == watermark.opacity() && this.anchor.equals(watermark.anchor());
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.identifier.hashCode();
                return ((((hashCode ^ 1000003) * 1000003) ^ this.opacity) * 1000003) ^ this.anchor.hashCode();
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Watermark> {
        private final TypeAdapter<Watermark.Anchor> anchorAdapter;
        private final TypeAdapter<String> identifierAdapter;
        private final TypeAdapter<Integer> opacityAdapter;
        private String defaultIdentifier = null;
        private int defaultOpacity = 0;
        private Watermark.Anchor defaultAnchor = null;

        public GsonTypeAdapter setDefaultAnchor(Watermark.Anchor anchor) {
            this.defaultAnchor = anchor;
            return this;
        }

        public GsonTypeAdapter setDefaultIdentifier(String str) {
            this.defaultIdentifier = str;
            return this;
        }

        public GsonTypeAdapter setDefaultOpacity(int i) {
            this.defaultOpacity = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.identifierAdapter = gson.getAdapter(String.class);
            this.opacityAdapter = gson.getAdapter(Integer.class);
            this.anchorAdapter = gson.getAdapter(Watermark.Anchor.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Watermark watermark) {
            if (watermark == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.identifierAdapter.write(jsonWriter, watermark.identifier());
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
            this.opacityAdapter.write(jsonWriter, Integer.valueOf(watermark.opacity()));
            jsonWriter.name("anchor");
            this.anchorAdapter.write(jsonWriter, watermark.anchor());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0067 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netflix.mediaclient.media.Watermark read(com.google.gson.stream.JsonReader r9) {
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
                java.lang.String r0 = r8.defaultIdentifier
                int r1 = r8.defaultOpacity
                com.netflix.mediaclient.media.Watermark$Anchor r2 = r8.defaultAnchor
            L16:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L8e
                java.lang.String r3 = r9.nextName()
                com.google.gson.stream.JsonToken r4 = r9.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 != r5) goto L2c
                r9.nextNull()
                goto L16
            L2c:
                r3.hashCode()
                int r4 = r3.hashCode()
                r5 = -1413299531(0xffffffffabc2c2b5, float:-1.3838571E-12)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5a
                r5 = -1267206133(0xffffffffb477f80b, float:-2.3093905E-7)
                if (r4 == r5) goto L4f
                r5 = 3355(0xd1b, float:4.701E-42)
                if (r4 == r5) goto L44
                goto L62
            L44:
                java.lang.String r4 = "id"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4d
                goto L62
            L4d:
                r3 = r6
                goto L65
            L4f:
                java.lang.String r4 = "opacity"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L58
                goto L62
            L58:
                r3 = r7
                goto L65
            L5a:
                java.lang.String r4 = "anchor"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L64
            L62:
                r3 = -1
                goto L65
            L64:
                r3 = 0
            L65:
                if (r3 == 0) goto L85
                if (r3 == r7) goto L78
                if (r3 == r6) goto L6f
                r9.skipValue()
                goto L16
            L6f:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r8.identifierAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L78:
                com.google.gson.TypeAdapter<java.lang.Integer> r1 = r8.opacityAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L16
            L85:
                com.google.gson.TypeAdapter<com.netflix.mediaclient.media.Watermark$Anchor> r2 = r8.anchorAdapter
                java.lang.Object r2 = r2.read(r9)
                com.netflix.mediaclient.media.Watermark$Anchor r2 = (com.netflix.mediaclient.media.Watermark.Anchor) r2
                goto L16
            L8e:
                r9.endObject()
                com.netflix.mediaclient.media.AutoValue_Watermark r9 = new com.netflix.mediaclient.media.AutoValue_Watermark
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.media.AutoValue_Watermark.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.media.Watermark");
        }
    }
}
