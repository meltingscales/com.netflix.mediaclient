package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Layout_InteractiveNotification extends C$AutoValue_CommonMetaData_Layout_InteractiveNotification {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Layout_InteractiveNotification> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Layout_InteractiveNotification>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_InteractiveNotification.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_InteractiveNotification createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData_Layout_InteractiveNotification((SpriteImage) parcel.readParcelable(CommonMetaData.Layout.InteractiveNotification.class.getClassLoader()), (Label) parcel.readParcelable(CommonMetaData.Layout.InteractiveNotification.class.getClassLoader()), (ChoicePointAnimations) parcel.readParcelable(CommonMetaData.Layout.InteractiveNotification.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_InteractiveNotification[] newArray(int i) {
            return new AutoValue_CommonMetaData_Layout_InteractiveNotification[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Layout_InteractiveNotification(SpriteImage spriteImage, Label label, ChoicePointAnimations choicePointAnimations) {
        new C$$AutoValue_CommonMetaData_Layout_InteractiveNotification(spriteImage, label, choicePointAnimations) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_InteractiveNotification

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_InteractiveNotification$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Layout.InteractiveNotification> {
                private final TypeAdapter<ChoicePointAnimations> animationAdapter;
                private final TypeAdapter<SpriteImage> backgroundAdapter;
                private final TypeAdapter<Label> labelAdapter;
                private SpriteImage defaultBackground = null;
                private Label defaultLabel = null;
                private ChoicePointAnimations defaultAnimation = null;

                public GsonTypeAdapter setDefaultAnimation(ChoicePointAnimations choicePointAnimations) {
                    this.defaultAnimation = choicePointAnimations;
                    return this;
                }

                public GsonTypeAdapter setDefaultBackground(SpriteImage spriteImage) {
                    this.defaultBackground = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(Label label) {
                    this.defaultLabel = label;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.backgroundAdapter = gson.getAdapter(SpriteImage.class);
                    this.labelAdapter = gson.getAdapter(Label.class);
                    this.animationAdapter = gson.getAdapter(ChoicePointAnimations.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Layout.InteractiveNotification interactiveNotification) {
                    if (interactiveNotification == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, interactiveNotification.background());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, interactiveNotification.label());
                    jsonWriter.name("animation");
                    this.animationAdapter.write(jsonWriter, interactiveNotification.animation());
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
                public com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.InteractiveNotification read(com.google.gson.stream.JsonReader r9) {
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
                        com.netflix.model.leafs.originals.interactive.SpriteImage r0 = r8.defaultBackground
                        com.netflix.model.leafs.originals.interactive.Label r1 = r8.defaultLabel
                        com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations r2 = r8.defaultAnimation
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
                        r5 = -1332194002(0xffffffffb098552e, float:-1.1083665E-9)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = 102727412(0x61f7ef4, float:2.9997847E-35)
                        if (r4 == r5) goto L50
                        r5 = 1118509956(0x42ab1b84, float:85.55374)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "animation"
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
                        java.lang.String r4 = "background"
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
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations> r2 = r8.animationAdapter
                        java.lang.Object r2 = r2.read(r9)
                        com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations r2 = (com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations) r2
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.originals.interactive.Label> r1 = r8.labelAdapter
                        java.lang.Object r1 = r1.read(r9)
                        com.netflix.model.leafs.originals.interactive.Label r1 = (com.netflix.model.leafs.originals.interactive.Label) r1
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.originals.interactive.SpriteImage> r0 = r8.backgroundAdapter
                        java.lang.Object r0 = r0.read(r9)
                        com.netflix.model.leafs.originals.interactive.SpriteImage r0 = (com.netflix.model.leafs.originals.interactive.SpriteImage) r0
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_InteractiveNotification r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_InteractiveNotification
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout_InteractiveNotification.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.CommonMetaData$Layout$InteractiveNotification");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(background(), i);
        parcel.writeParcelable(label(), i);
        parcel.writeParcelable(animation(), i);
    }
}
