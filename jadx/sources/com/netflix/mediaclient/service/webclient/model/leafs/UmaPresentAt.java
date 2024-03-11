package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaPresentAt;
import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;

/* loaded from: classes.dex */
public abstract class UmaPresentAt {
    public static final Companion Companion = new Companion(null);

    public static final TypeAdapter<UmaPresentAt> typeAdapter(Gson gson) {
        return Companion.typeAdapter(gson);
    }

    @SerializedName("point")
    public abstract Point point();

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TypeAdapter<UmaPresentAt> typeAdapter(Gson gson) {
            return new AutoValue_UmaPresentAt.GsonTypeAdapter(gson);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class Point {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ Point[] $VALUES;
        @SerializedName("PROFILES_GATE")
        public static final Point PROFILES_GATE = new Point("PROFILES_GATE", 0);
        @SerializedName("LOLOMO")
        public static final Point LOLOMO = new Point("LOLOMO", 1);

        private static final /* synthetic */ Point[] $values() {
            return new Point[]{PROFILES_GATE, LOLOMO};
        }

        public static InterfaceC8598drn<Point> getEntries() {
            return $ENTRIES;
        }

        public static Point valueOf(String str) {
            return (Point) Enum.valueOf(Point.class, str);
        }

        public static Point[] values() {
            return (Point[]) $VALUES.clone();
        }

        private Point(String str, int i) {
        }

        static {
            Point[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }
}
