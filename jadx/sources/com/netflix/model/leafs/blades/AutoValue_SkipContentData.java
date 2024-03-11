package com.netflix.model.leafs.blades;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SkipContentData extends C$AutoValue_SkipContentData {
    public static final Parcelable.Creator<AutoValue_SkipContentData> CREATOR = new Parcelable.Creator<AutoValue_SkipContentData>() { // from class: com.netflix.model.leafs.blades.AutoValue_SkipContentData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SkipContentData createFromParcel(Parcel parcel) {
            return new AutoValue_SkipContentData(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SkipContentData[] newArray(int i) {
            return new AutoValue_SkipContentData[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SkipContentData(final int i, final int i2, final String str) {
        new C$$AutoValue_SkipContentData(i, i2, str) { // from class: com.netflix.model.leafs.blades.$AutoValue_SkipContentData

            /* renamed from: com.netflix.model.leafs.blades.$AutoValue_SkipContentData$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<SkipContentData> {
                private final TypeAdapter<Integer> endAdapter;
                private final TypeAdapter<String> labelAdapter;
                private final TypeAdapter<Integer> startAdapter;
                private int defaultStart = 0;
                private int defaultEnd = 0;
                private String defaultLabel = null;

                public GsonTypeAdapter setDefaultEnd(int i) {
                    this.defaultEnd = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(String str) {
                    this.defaultLabel = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStart(int i) {
                    this.defaultStart = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.startAdapter = gson.getAdapter(Integer.class);
                    this.endAdapter = gson.getAdapter(Integer.class);
                    this.labelAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, SkipContentData skipContentData) {
                    if (skipContentData == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("start");
                    this.startAdapter.write(jsonWriter, Integer.valueOf(skipContentData.start()));
                    jsonWriter.name("end");
                    this.endAdapter.write(jsonWriter, Integer.valueOf(skipContentData.end()));
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, skipContentData.label());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0086 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.blades.SkipContentData read(com.google.gson.stream.JsonReader r9) {
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
                        int r0 = r8.defaultStart
                        int r1 = r8.defaultEnd
                        java.lang.String r2 = r8.defaultLabel
                    L16:
                        boolean r3 = r9.hasNext()
                        if (r3 == 0) goto L93
                        java.lang.String r3 = r9.nextName()
                        com.google.gson.stream.JsonToken r4 = r9.peek()
                        com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                        if (r4 != r5) goto L2c
                        r9.nextNull()
                        goto L16
                    L2c:
                        r3.hashCode()
                        int r4 = r3.hashCode()
                        r5 = 100571(0x188db, float:1.4093E-40)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = 102727412(0x61f7ef4, float:2.9997847E-35)
                        if (r4 == r5) goto L50
                        r5 = 109757538(0x68ac462, float:5.219839E-35)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "start"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "label"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "end"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L65
                    L63:
                        r3 = -1
                        goto L66
                    L65:
                        r3 = 0
                    L66:
                        if (r3 == 0) goto L86
                        if (r3 == r7) goto L7d
                        if (r3 == r6) goto L70
                        r9.skipValue()
                        goto L16
                    L70:
                        com.google.gson.TypeAdapter<java.lang.Integer> r0 = r8.startAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        goto L16
                    L7d:
                        com.google.gson.TypeAdapter<java.lang.String> r2 = r8.labelAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.lang.String r2 = (java.lang.String) r2
                        goto L16
                    L86:
                        com.google.gson.TypeAdapter<java.lang.Integer> r1 = r8.endAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        int r1 = r1.intValue()
                        goto L16
                    L93:
                        r9.endObject()
                        com.netflix.model.leafs.blades.AutoValue_SkipContentData r9 = new com.netflix.model.leafs.blades.AutoValue_SkipContentData
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.blades.C$AutoValue_SkipContentData.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.blades.SkipContentData");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(start());
        parcel.writeInt(end());
        parcel.writeString(label());
    }
}
