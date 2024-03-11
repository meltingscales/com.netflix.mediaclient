package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SourceRect extends C$AutoValue_SourceRect {
    public static final Parcelable.Creator<AutoValue_SourceRect> CREATOR = new Parcelable.Creator<AutoValue_SourceRect>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_SourceRect.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SourceRect createFromParcel(Parcel parcel) {
            return new AutoValue_SourceRect(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SourceRect[] newArray(int i) {
            return new AutoValue_SourceRect[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SourceRect(final Integer num, final Integer num2, final Integer num3, final Integer num4) {
        new C$$AutoValue_SourceRect(num, num2, num3, num4) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_SourceRect

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_SourceRect$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<SourceRect> {
                private final TypeAdapter<Integer> heightAdapter;
                private final TypeAdapter<Integer> widthAdapter;
                private final TypeAdapter<Integer> xAdapter;
                private final TypeAdapter<Integer> yAdapter;
                private Integer defaultX = null;
                private Integer defaultY = null;
                private Integer defaultWidth = null;
                private Integer defaultHeight = null;

                public GsonTypeAdapter setDefaultHeight(Integer num) {
                    this.defaultHeight = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultWidth(Integer num) {
                    this.defaultWidth = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultX(Integer num) {
                    this.defaultX = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultY(Integer num) {
                    this.defaultY = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.xAdapter = gson.getAdapter(Integer.class);
                    this.yAdapter = gson.getAdapter(Integer.class);
                    this.widthAdapter = gson.getAdapter(Integer.class);
                    this.heightAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, SourceRect sourceRect) {
                    if (sourceRect == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.X);
                    this.xAdapter.write(jsonWriter, sourceRect.x());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.Y);
                    this.yAdapter.write(jsonWriter, sourceRect.y());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
                    this.widthAdapter.write(jsonWriter, sourceRect.width());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                    this.heightAdapter.write(jsonWriter, sourceRect.height());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:51:0x009f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0079 A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.SourceRect read(com.google.gson.stream.JsonReader r11) {
                    /*
                        r10 = this;
                        com.google.gson.stream.JsonToken r0 = r11.peek()
                        com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                        if (r0 != r1) goto Ld
                        r11.nextNull()
                        r11 = 0
                        return r11
                    Ld:
                        r11.beginObject()
                        java.lang.Integer r0 = r10.defaultX
                        java.lang.Integer r1 = r10.defaultY
                        java.lang.Integer r2 = r10.defaultWidth
                        java.lang.Integer r3 = r10.defaultHeight
                    L18:
                        boolean r4 = r11.hasNext()
                        if (r4 == 0) goto La9
                        java.lang.String r4 = r11.nextName()
                        com.google.gson.stream.JsonToken r5 = r11.peek()
                        com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                        if (r5 != r6) goto L2e
                        r11.nextNull()
                        goto L18
                    L2e:
                        r4.hashCode()
                        int r5 = r4.hashCode()
                        r6 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
                        r7 = 3
                        r8 = 2
                        r9 = 1
                        if (r5 == r6) goto L6c
                        r6 = 113126854(0x6be2dc6, float:7.1537315E-35)
                        if (r5 == r6) goto L61
                        r6 = 120(0x78, float:1.68E-43)
                        if (r5 == r6) goto L56
                        r6 = 121(0x79, float:1.7E-43)
                        if (r5 == r6) goto L4b
                        goto L74
                    L4b:
                        java.lang.String r5 = "y"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L54
                        goto L74
                    L54:
                        r4 = r8
                        goto L77
                    L56:
                        java.lang.String r5 = "x"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L5f
                        goto L74
                    L5f:
                        r4 = r9
                        goto L77
                    L61:
                        java.lang.String r5 = "width"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L6a
                        goto L74
                    L6a:
                        r4 = r7
                        goto L77
                    L6c:
                        java.lang.String r5 = "height"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L76
                    L74:
                        r4 = -1
                        goto L77
                    L76:
                        r4 = 0
                    L77:
                        if (r4 == 0) goto L9f
                        if (r4 == r9) goto L95
                        if (r4 == r8) goto L8c
                        if (r4 == r7) goto L83
                        r11.skipValue()
                        goto L18
                    L83:
                        com.google.gson.TypeAdapter<java.lang.Integer> r2 = r10.widthAdapter
                        java.lang.Object r2 = r2.read(r11)
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        goto L18
                    L8c:
                        com.google.gson.TypeAdapter<java.lang.Integer> r1 = r10.yAdapter
                        java.lang.Object r1 = r1.read(r11)
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        goto L18
                    L95:
                        com.google.gson.TypeAdapter<java.lang.Integer> r0 = r10.xAdapter
                        java.lang.Object r0 = r0.read(r11)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        goto L18
                    L9f:
                        com.google.gson.TypeAdapter<java.lang.Integer> r3 = r10.heightAdapter
                        java.lang.Object r3 = r3.read(r11)
                        java.lang.Integer r3 = (java.lang.Integer) r3
                        goto L18
                    La9:
                        r11.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_SourceRect r11 = new com.netflix.model.leafs.originals.interactive.AutoValue_SourceRect
                        r11.<init>(r0, r1, r2, r3)
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_SourceRect.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.SourceRect");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(x().intValue());
        parcel.writeInt(y().intValue());
        parcel.writeInt(width().intValue());
        parcel.writeInt(height().intValue());
    }
}
