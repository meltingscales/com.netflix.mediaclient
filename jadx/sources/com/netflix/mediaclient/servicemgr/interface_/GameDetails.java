package com.netflix.mediaclient.servicemgr.interface_;

import java.util.List;
import o.C8600drp;
import o.InterfaceC5141btE;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface GameDetails extends InterfaceC5141btE {
    Integer A();

    String B();

    Orientation C();

    List<String> D();

    int E();

    String G();

    String I();

    List<String> c();

    String d();

    String q();

    String t();

    List<String> u();

    Integer v();

    Integer x();

    String z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Orientation {
        private static final /* synthetic */ Orientation[] a;
        private static final /* synthetic */ InterfaceC8598drn b;
        private final String d;
        public static final Orientation e = new Orientation("LANDSCAPE", 0, "Landscape");
        public static final Orientation c = new Orientation("PORTRAIT", 1, "Portrait");

        private static final /* synthetic */ Orientation[] c() {
            return new Orientation[]{e, c};
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) a.clone();
        }

        public final String a() {
            return this.d;
        }

        private Orientation(String str, int i, String str2) {
            this.d = str2;
        }

        static {
            Orientation[] c2 = c();
            a = c2;
            b = C8600drp.e(c2);
        }
    }
}
