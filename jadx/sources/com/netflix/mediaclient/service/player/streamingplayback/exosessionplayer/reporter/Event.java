package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import com.google.gson.annotations.SerializedName;
import o.C4831bnM;

/* loaded from: classes3.dex */
public class Event {
    public static final Event a;
    public static final Event b;
    public static final Event c;
    public static final Event d;
    public static final Event e;
    public static final Event f;
    public static final Event g;
    public static final Event h;
    public static final Event i;
    public static final Event j;
    @SerializedName("cat")
    public final Category k;
    @SerializedName("comp")
    public final Component l;
    @SerializedName("eventId")
    public final String m;
    public final transient String n;
    @SerializedName("ts")

    /* renamed from: o  reason: collision with root package name */
    public final long f13224o;
    @SerializedName("step")
    public final Step s;

    /* loaded from: classes3.dex */
    public enum Category {
        CLOUD,
        CDN,
        DEVICE,
        MIXED
    }

    /* loaded from: classes3.dex */
    public enum Component {
        MANIFEST,
        LICENSE,
        BUFFERING,
        RENDERING,
        DEBUG
    }

    /* loaded from: classes3.dex */
    public enum Step {
        START,
        END,
        DISCRETE
    }

    protected Event(Event event, long j2) {
        this(event.n, event.m, event.k, event.l, event.s, j2);
    }

    protected Event(String str, String str2, Category category, Component component, Step step) {
        this(str, str2, category, component, step, -1L);
    }

    protected Event(String str, String str2, Category category, Component component, Step step, long j2) {
        this.n = str;
        this.k = category;
        this.l = component;
        this.m = str2;
        this.s = step;
        this.f13224o = j2;
    }

    public Event b(C4831bnM c4831bnM) {
        long j2 = this.f13224o;
        if (j2 == -1) {
            return new Event(this, c4831bnM.c());
        }
        return new Event(this, c4831bnM.e(j2));
    }

    public Event e(long j2) {
        return new Event(this, j2);
    }

    static {
        Category category = Category.CLOUD;
        Component component = Component.MANIFEST;
        Step step = Step.START;
        j = new Event("manifestStart", "manifest", category, component, step);
        Step step2 = Step.END;
        b = new Event("manifestEnd", "manifest", category, component, step2);
        Component component2 = Component.LICENSE;
        a = new Event("licenseStart", "license", category, component2, step);
        c = new Event("licenseEnd", "license", category, component2, step2);
        Category category2 = Category.CDN;
        Component component3 = Component.BUFFERING;
        d = new Event("bufferingStart", "buffer", category2, component3, step);
        e = new Event("bufferingEnd", "buffer", category2, component3, step2);
        Category category3 = Category.DEVICE;
        Component component4 = Component.RENDERING;
        f = new Event("renderedFrameStart", "render", category3, component4, step);
        g = new Event("renderedFrameEnd", "render", category3, component4, step2);
        i = new Event("subtitleStart", "subtitle", category2, component3, step);
        h = new Event("subtitleEnd", "subtitle", category2, component3, step2);
    }

    public static Event d(String str, Component component) {
        return new Event(str, str, Category.DEVICE, component, Step.DISCRETE);
    }
}
