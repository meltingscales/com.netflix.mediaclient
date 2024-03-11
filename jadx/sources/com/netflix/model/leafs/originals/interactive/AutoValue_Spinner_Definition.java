package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Spinner;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Spinner_Definition extends C$AutoValue_Spinner_Definition {
    public static final Parcelable.Creator<AutoValue_Spinner_Definition> CREATOR = new Parcelable.Creator<AutoValue_Spinner_Definition>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Spinner_Definition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Spinner_Definition createFromParcel(Parcel parcel) {
            return new AutoValue_Spinner_Definition(parcel.readInt(), parcel.readString(), parcel.readArrayList(Spinner.Definition.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Spinner_Definition[] newArray(int i) {
            return new AutoValue_Spinner_Definition[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Spinner_Definition(int i, String str, List<Spinner.Definition.Sequence> list) {
        new C$$AutoValue_Spinner_Definition(i, str, list) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Spinner_Definition

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Spinner_Definition$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Spinner.Definition> {
                private int defaultFps = 0;
                private String defaultImageUrl = null;
                private List<Spinner.Definition.Sequence> defaultSequence = null;
                private final TypeAdapter<Integer> fpsAdapter;
                private final TypeAdapter<String> imageUrlAdapter;
                private final TypeAdapter<List<Spinner.Definition.Sequence>> sequenceAdapter;

                public GsonTypeAdapter setDefaultFps(int i) {
                    this.defaultFps = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultImageUrl(String str) {
                    this.defaultImageUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSequence(List<Spinner.Definition.Sequence> list) {
                    this.defaultSequence = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.fpsAdapter = gson.getAdapter(Integer.class);
                    this.imageUrlAdapter = gson.getAdapter(String.class);
                    this.sequenceAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Spinner.Definition.Sequence.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Spinner.Definition definition) {
                    if (definition == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("fps");
                    this.fpsAdapter.write(jsonWriter, Integer.valueOf(definition.fps()));
                    jsonWriter.name("image");
                    this.imageUrlAdapter.write(jsonWriter, definition.imageUrl());
                    jsonWriter.name("sequence");
                    this.sequenceAdapter.write(jsonWriter, definition.sequence());
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
                public com.netflix.model.leafs.originals.interactive.Spinner.Definition read(com.google.gson.stream.JsonReader r9) {
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
                        int r0 = r8.defaultFps
                        java.lang.String r1 = r8.defaultImageUrl
                        java.util.List<com.netflix.model.leafs.originals.interactive.Spinner$Definition$Sequence> r2 = r8.defaultSequence
                    L16:
                        boolean r3 = r9.hasNext()
                        if (r3 == 0) goto L8f
                        java.lang.String r3 = r9.nextName()
                        com.google.gson.stream.JsonToken r4 = r9.peek()
                        com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                        if (r4 != r5) goto L2c
                        r9.nextNull()
                        goto L16
                    L2c:
                        r3.hashCode()
                        int r4 = r3.hashCode()
                        r5 = 101609(0x18ce9, float:1.42385E-40)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = 100313435(0x5faa95b, float:2.3572098E-35)
                        if (r4 == r5) goto L50
                        r5 = 1349547969(0x507077c1, float:1.61375201E10)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "sequence"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "image"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "fps"
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
                        com.google.gson.TypeAdapter<java.util.List<com.netflix.model.leafs.originals.interactive.Spinner$Definition$Sequence>> r2 = r8.sequenceAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.util.List r2 = (java.util.List) r2
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.lang.String> r1 = r8.imageUrlAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.String r1 = (java.lang.String) r1
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<java.lang.Integer> r0 = r8.fpsAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        goto L16
                    L8f:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_Spinner_Definition r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_Spinner_Definition
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_Spinner_Definition.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.Spinner$Definition");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(fps());
        parcel.writeString(imageUrl());
        parcel.writeList(sequence());
    }
}
