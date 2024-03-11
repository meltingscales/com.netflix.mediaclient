package com.netflix.mediaclient.ui.commander.api;

import o.C8600drp;
import o.InterfaceC5283bvo;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface TargetsDiscovery {

    /* loaded from: classes4.dex */
    public interface d {
        void a();

        void a(boolean z, int i);

        void b();

        void c(InterfaceC5283bvo interfaceC5283bvo);

        void e();
    }

    boolean a();

    void b();

    void b(d dVar);

    void c();

    NextAction d();

    void e();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class NextAction {
        public static final NextAction a = new NextAction("None", 0);
        public static final NextAction b = new NextAction("ShowDeviceSheet", 1);
        public static final NextAction c = new NextAction("ShowControllerSheet", 2);
        private static final /* synthetic */ InterfaceC8598drn d;
        private static final /* synthetic */ NextAction[] e;

        private static final /* synthetic */ NextAction[] e() {
            return new NextAction[]{a, b, c};
        }

        public static NextAction valueOf(String str) {
            return (NextAction) Enum.valueOf(NextAction.class, str);
        }

        public static NextAction[] values() {
            return (NextAction[]) e.clone();
        }

        private NextAction(String str, int i) {
        }

        static {
            NextAction[] e2 = e();
            e = e2;
            d = C8600drp.e(e2);
        }
    }
}
