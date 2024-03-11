package com.netflix.mediaclient.ui.details.uiView;

import o.AbstractC3652bFu;
import o.C1234Tv;
import o.C8600drp;
import o.InterfaceC8598drn;
import o.InterfaceC9939zT;

/* loaded from: classes4.dex */
public interface ISeasonsSelectionUIView extends InterfaceC9939zT<AbstractC3652bFu> {
    void a(int i);

    void b(C1234Tv c1234Tv);

    void d(String str);

    DisplayMode i();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class DisplayMode {
        private static final /* synthetic */ DisplayMode[] a;
        private static final /* synthetic */ InterfaceC8598drn c;
        public static final DisplayMode d = new DisplayMode("REGULAR", 0);
        public static final DisplayMode e = new DisplayMode("ACTION_BAR", 1);

        private static final /* synthetic */ DisplayMode[] a() {
            return new DisplayMode[]{d, e};
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) a.clone();
        }

        static {
            DisplayMode[] a2 = a();
            a = a2;
            c = C8600drp.e(a2);
        }

        private DisplayMode(String str, int i) {
        }
    }
}
