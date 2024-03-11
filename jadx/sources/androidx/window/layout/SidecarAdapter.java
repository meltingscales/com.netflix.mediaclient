package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
public final class SidecarAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SidecarAdapter.class.getSimpleName();
    private final SpecificationComputer.VerificationMode verificationMode;

    public SidecarAdapter() {
        this(null, 1, null);
    }

    public SidecarAdapter(SpecificationComputer.VerificationMode verificationMode) {
        C8632dsu.c((Object) verificationMode, "");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }

    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        List i;
        C8632dsu.c((Object) sidecarDeviceState, "");
        if (sidecarWindowLayoutInfo == null) {
            i = C8569dql.i();
            return new WindowLayoutInfo(i);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState2, companion.getSidecarDevicePosture$window_release(sidecarDeviceState));
        return new WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C8632dsu.c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        return companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C8632dsu.c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!isEqualSidecarDisplayFeature(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C8632dsu.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C8632dsu.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final DisplayFeature translate$window_release(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        C8632dsu.c((Object) sidecarDisplayFeature, "");
        C8632dsu.c((Object) sidecarDeviceState, "");
        SpecificationComputer.Companion companion = SpecificationComputer.Companion;
        String str = TAG;
        C8632dsu.a(str, "");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) SpecificationComputer.Companion.startSpecification$default(companion, sidecarDisplayFeature, str, this.verificationMode, null, 4, null).require("Type must be either TYPE_FOLD or TYPE_HINGE", new drM<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$1
            @Override // o.drM
            public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature3) {
                C8632dsu.c((Object) sidecarDisplayFeature3, "");
                boolean z = true;
                if (sidecarDisplayFeature3.getType() != 1 && sidecarDisplayFeature3.getType() != 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).require("Feature bounds must not be 0", new drM<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$2
            @Override // o.drM
            public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature3) {
                C8632dsu.c((Object) sidecarDisplayFeature3, "");
                return Boolean.valueOf((sidecarDisplayFeature3.getRect().width() == 0 && sidecarDisplayFeature3.getRect().height() == 0) ? false : true);
            }
        }).require("TYPE_FOLD must have 0 area", new drM<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$3
            @Override // o.drM
            public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature3) {
                C8632dsu.c((Object) sidecarDisplayFeature3, "");
                boolean z = true;
                if (sidecarDisplayFeature3.getType() == 1 && sidecarDisplayFeature3.getRect().width() != 0 && sidecarDisplayFeature3.getRect().height() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).require("Feature be pinned to either left or top", new drM<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$4
            @Override // o.drM
            public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature3) {
                C8632dsu.c((Object) sidecarDisplayFeature3, "");
                return Boolean.valueOf(sidecarDisplayFeature3.getRect().left == 0 || sidecarDisplayFeature3.getRect().top == 0);
            }
        }).compute();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else if (type != 2) {
            return null;
        } else {
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int sidecarDevicePosture$window_release = Companion.getSidecarDevicePosture$window_release(sidecarDeviceState);
        if (sidecarDevicePosture$window_release == 0 || sidecarDevicePosture$window_release == 1) {
            return null;
        }
        if (sidecarDevicePosture$window_release == 2) {
            state = FoldingFeature.State.HALF_OPENED;
        } else if (sidecarDevicePosture$window_release == 3) {
            state = FoldingFeature.State.FLAT;
        } else if (sidecarDevicePosture$window_release == 4) {
            return null;
        } else {
            state = FoldingFeature.State.FLAT;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C8632dsu.a(rect, "");
        return new HardwareFoldingFeature(new Bounds(rect), fold, state);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            List<SidecarDisplayFeature> i;
            List<SidecarDisplayFeature> i2;
            C8632dsu.c((Object) sidecarWindowLayoutInfo, "");
            try {
                List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                if (list == null) {
                    i2 = C8569dql.i();
                    return i2;
                }
                return list;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    i = C8569dql.i();
                    return i;
                }
            }
        }

        public final int getSidecarDevicePosture$window_release(SidecarDeviceState sidecarDeviceState) {
            C8632dsu.c((Object) sidecarDeviceState, "");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int getRawSidecarDevicePosture(SidecarDeviceState sidecarDeviceState) {
            C8632dsu.c((Object) sidecarDeviceState, "");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void setSidecarDevicePosture(SidecarDeviceState sidecarDeviceState, int i) {
            C8632dsu.c((Object) sidecarDeviceState, "");
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                try {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }
    }

    public final List<DisplayFeature> translate(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) sidecarDeviceState, "");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : list) {
            DisplayFeature translate$window_release = translate$window_release(sidecarDisplayFeature, sidecarDeviceState);
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return arrayList;
    }
}
