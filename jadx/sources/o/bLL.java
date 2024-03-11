package o;

import com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides;

/* loaded from: classes4.dex */
public abstract class bLL {
    private final ControllerVideoDataOverrides.VideoOverrideName b;

    public /* synthetic */ bLL(ControllerVideoDataOverrides.VideoOverrideName videoOverrideName, C8627dsp c8627dsp) {
        this(videoOverrideName);
    }

    public final ControllerVideoDataOverrides.VideoOverrideName e() {
        return this.b;
    }

    /* loaded from: classes4.dex */
    public static final class d extends bLL implements bLM {
        private final boolean d;

        public d(boolean z) {
            super(ControllerVideoDataOverrides.VideoOverrideName.d, null);
            this.d = z;
        }

        @Override // o.bLK
        /* renamed from: c */
        public Boolean b() {
            return Boolean.valueOf(this.d);
        }
    }

    private bLL(ControllerVideoDataOverrides.VideoOverrideName videoOverrideName) {
        this.b = videoOverrideName;
    }

    /* loaded from: classes4.dex */
    public static final class b extends bLL implements bLM {
        private final boolean d;

        public b(boolean z) {
            super(ControllerVideoDataOverrides.VideoOverrideName.c, null);
            this.d = z;
        }

        @Override // o.bLK
        /* renamed from: d */
        public Boolean b() {
            return Boolean.valueOf(this.d);
        }
    }
}
