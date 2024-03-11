package com.netflix.model.leafs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.blades.SkipContentData;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_TimeCodesData extends C$AutoValue_TimeCodesData {
    public static final Parcelable.Creator<AutoValue_TimeCodesData> CREATOR = new Parcelable.Creator<AutoValue_TimeCodesData>() { // from class: com.netflix.model.leafs.AutoValue_TimeCodesData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TimeCodesData createFromParcel(Parcel parcel) {
            return new AutoValue_TimeCodesData((CreditMarks) parcel.readParcelable(TimeCodesData.class.getClassLoader()), parcel.readArrayList(TimeCodesData.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TimeCodesData[] newArray(int i) {
            return new AutoValue_TimeCodesData[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TimeCodesData(CreditMarks creditMarks, List<SkipContentData> list, int i) {
        new C$$AutoValue_TimeCodesData(creditMarks, list, i) { // from class: com.netflix.model.leafs.$AutoValue_TimeCodesData

            /* renamed from: com.netflix.model.leafs.$AutoValue_TimeCodesData$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TimeCodesData> {
                private final TypeAdapter<CreditMarks> creditMarksAdapter;
                private CreditMarks defaultCreditMarks = null;
                private List<SkipContentData> defaultSkipContent = null;
                private int defaultVideoId = 0;
                private final TypeAdapter<List<SkipContentData>> skipContentAdapter;
                private final TypeAdapter<Integer> videoIdAdapter;

                public GsonTypeAdapter setDefaultCreditMarks(CreditMarks creditMarks) {
                    this.defaultCreditMarks = creditMarks;
                    return this;
                }

                public GsonTypeAdapter setDefaultSkipContent(List<SkipContentData> list) {
                    this.defaultSkipContent = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoId(int i) {
                    this.defaultVideoId = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.creditMarksAdapter = gson.getAdapter(CreditMarks.class);
                    this.skipContentAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, SkipContentData.class));
                    this.videoIdAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TimeCodesData timeCodesData) {
                    if (timeCodesData == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("creditMarks");
                    this.creditMarksAdapter.write(jsonWriter, timeCodesData.creditMarks());
                    jsonWriter.name("skipContent");
                    this.skipContentAdapter.write(jsonWriter, timeCodesData.skipContent());
                    jsonWriter.name(SignupConstants.Field.VIDEO_ID);
                    this.videoIdAdapter.write(jsonWriter, Integer.valueOf(timeCodesData.videoId()));
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
                public com.netflix.model.leafs.TimeCodesData read(com.google.gson.stream.JsonReader r9) {
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
                        com.netflix.model.leafs.blades.CreditMarks r0 = r8.defaultCreditMarks
                        java.util.List<com.netflix.model.leafs.blades.SkipContentData> r1 = r8.defaultSkipContent
                        int r2 = r8.defaultVideoId
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
                        r5 = -604796422(0xffffffffdbf389fa, float:-1.37100252E17)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = -320459827(0xffffffffece62bcd, float:-2.2260783E27)
                        if (r4 == r5) goto L50
                        r5 = 452782838(0x1afceaf6, float:1.0460436E-22)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "videoId"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "creditMarks"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "skipContent"
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
                        com.google.gson.TypeAdapter<java.lang.Integer> r2 = r8.videoIdAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        int r2 = r2.intValue()
                        goto L16
                    L7d:
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.blades.CreditMarks> r0 = r8.creditMarksAdapter
                        java.lang.Object r0 = r0.read(r9)
                        com.netflix.model.leafs.blades.CreditMarks r0 = (com.netflix.model.leafs.blades.CreditMarks) r0
                        goto L16
                    L86:
                        com.google.gson.TypeAdapter<java.util.List<com.netflix.model.leafs.blades.SkipContentData>> r1 = r8.skipContentAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.util.List r1 = (java.util.List) r1
                        goto L16
                    L8f:
                        r9.endObject()
                        com.netflix.model.leafs.AutoValue_TimeCodesData r9 = new com.netflix.model.leafs.AutoValue_TimeCodesData
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.C$AutoValue_TimeCodesData.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.TimeCodesData");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(creditMarks(), i);
        parcel.writeList(skipContent());
        parcel.writeInt(videoId());
    }
}
