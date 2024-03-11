package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o.AbstractC7877dM;
import o.C3658bG;
import o.C5643cD;
import o.C8909fc;
import o.InterfaceC7324cu;
import o.InterfaceC7697dC;

/* loaded from: classes2.dex */
public class MergePaths implements InterfaceC7697dC {
    private final String a;
    private final MergePathsMode c;
    private final boolean e;

    /* loaded from: classes2.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode a(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public String b() {
        return this.a;
    }

    public MergePathsMode c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.a = str;
        this.c = mergePathsMode;
        this.e = z;
    }

    @Override // o.InterfaceC7697dC
    public InterfaceC7324cu b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM) {
        if (!lottieDrawable.enableMergePathsForKitKatAndAbove()) {
            C8909fc.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C5643cD(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.c + '}';
    }
}
