package androidx.window.layout;

import o.C8632dsu;

/* loaded from: classes2.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        C8632dsu.c((Object) windowInfoTracker, "");
        return windowInfoTracker;
    }

    private EmptyDecorator() {
    }
}
