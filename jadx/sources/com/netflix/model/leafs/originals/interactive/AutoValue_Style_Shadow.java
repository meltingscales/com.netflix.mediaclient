package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Style;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Style_Shadow extends C$AutoValue_Style_Shadow {
    public static final Parcelable.Creator<AutoValue_Style_Shadow> CREATOR = new Parcelable.Creator<AutoValue_Style_Shadow>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Style_Shadow.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Style_Shadow createFromParcel(Parcel parcel) {
            return new AutoValue_Style_Shadow((Color) parcel.readParcelable(Style.Shadow.class.getClassLoader()), Float.valueOf(parcel.readFloat()), parcel.readHashMap(Style.Shadow.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Style_Shadow[] newArray(int i) {
            return new AutoValue_Style_Shadow[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Style_Shadow(Color color, Float f, Map<String, Float> map) {
        new C$$AutoValue_Style_Shadow(color, f, map) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Style_Shadow

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Style_Shadow$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Style.Shadow> {
                private final TypeAdapter<Color> colorAdapter;
                private final TypeAdapter<Map<String, Float>> offsetAdapter;
                private final TypeAdapter<Float> radiusAdapter;
                private Color defaultColor = null;
                private Float defaultRadius = null;
                private Map<String, Float> defaultOffset = null;

                public GsonTypeAdapter setDefaultColor(Color color) {
                    this.defaultColor = color;
                    return this;
                }

                public GsonTypeAdapter setDefaultOffset(Map<String, Float> map) {
                    this.defaultOffset = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultRadius(Float f) {
                    this.defaultRadius = f;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.colorAdapter = gson.getAdapter(Color.class);
                    this.radiusAdapter = gson.getAdapter(Float.class);
                    this.offsetAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Float.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Style.Shadow shadow) {
                    if (shadow == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("color");
                    this.colorAdapter.write(jsonWriter, shadow.color());
                    jsonWriter.name("radius");
                    this.radiusAdapter.write(jsonWriter, shadow.radius());
                    jsonWriter.name("offset");
                    this.offsetAdapter.write(jsonWriter, shadow.offset());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.Style.Shadow read(com.google.gson.stream.JsonReader r9) {
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
                        com.netflix.model.leafs.originals.interactive.Color r0 = r8.defaultColor
                        java.lang.Float r1 = r8.defaultRadius
                        java.util.Map<java.lang.String, java.lang.Float> r2 = r8.defaultOffset
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
                        r5 = -1019779949(0xffffffffc3376493, float:-183.39287)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = -938578798(0xffffffffc80e6c92, float:-145842.28)
                        if (r4 == r5) goto L50
                        r5 = 94842723(0x5a72f63, float:1.5722012E-35)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "color"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "radius"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "offset"
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
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.originals.interactive.Color> r0 = r8.colorAdapter
                        java.lang.Object r0 = r0.read(r9)
                        com.netflix.model.leafs.originals.interactive.Color r0 = (com.netflix.model.leafs.originals.interactive.Color) r0
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.lang.Float> r1 = r8.radiusAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.Float r1 = (java.lang.Float) r1
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, java.lang.Float>> r2 = r8.offsetAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.util.Map r2 = (java.util.Map) r2
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_Style_Shadow r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_Style_Shadow
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_Style_Shadow.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.Style$Shadow");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(color(), i);
        parcel.writeFloat(radius().floatValue());
        parcel.writeMap(offset());
    }
}
