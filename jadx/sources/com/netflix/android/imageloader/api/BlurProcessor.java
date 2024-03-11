package com.netflix.android.imageloader.api;

import android.content.Context;
import android.graphics.Bitmap;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public interface BlurProcessor {
    public static final c c = c.a;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes2.dex */
    public interface a {
        BlurProcessor b();
    }

    Bitmap c(Bitmap bitmap, Intensity intensity);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Intensity {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ Intensity[] d;
        public static final Intensity e = new Intensity("MEDIUM", 0);
        public static final Intensity c = new Intensity("HIGH", 1);

        private static final /* synthetic */ Intensity[] e() {
            return new Intensity[]{e, c};
        }

        public static Intensity valueOf(String str) {
            return (Intensity) Enum.valueOf(Intensity.class, str);
        }

        public static Intensity[] values() {
            return (Intensity[]) d.clone();
        }

        private Intensity(String str, int i) {
        }

        static {
            Intensity[] e2 = e();
            d = e2;
            b = C8600drp.e(e2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final BlurProcessor a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).b();
        }
    }
}
