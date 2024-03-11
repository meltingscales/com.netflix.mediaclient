package com.netflix.mediaclient.servicemgr.interface_;

import j$.time.Instant;
import java.util.List;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC5146btJ;
import o.InterfaceC5175btm;
import o.InterfaceC5218buc;
import o.InterfaceC5221buf;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface TrailerItem extends InterfaceC5221buf, InterfaceC5146btJ, InterfaceC5218buc, InterfaceC5175btm {
    String B();

    boolean C();

    boolean D();

    List<Action> a();

    ContextualText b();

    String c();

    String e();

    Instant f();

    String getVideoMerchComputeId();

    boolean isPlayable();

    String j();

    int k();

    List<String> l();

    String o();

    String p();

    List<String> q();

    String r();

    int s();

    String t();

    int u();

    String v();

    String x();

    VideoType y();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Action {
        private static final /* synthetic */ InterfaceC8598drn k;
        private static final /* synthetic */ Action[] m;
        public static final Action g = new Action("RemindMe", 0);
        public static final Action c = new Action("AddToMyList", 1);
        public static final Action i = new Action("Share", 2);
        public static final Action j = new Action("Play", 3);
        public static final Action h = new Action("PlayMovie", 4);
        public static final Action f = new Action("PlayEpisode", 5);
        public static final Action d = new Action("MoreInfo", 6);
        public static final Action e = new Action("InstallGame", 7);
        public static final Action a = new Action("LaunchGame", 8);
        public static final Action b = new Action("Gone", 9);

        private static final /* synthetic */ Action[] c() {
            return new Action[]{g, c, i, j, h, f, d, e, a, b};
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) m.clone();
        }

        private Action(String str, int i2) {
        }

        static {
            Action[] c2 = c();
            m = c2;
            k = C8600drp.e(c2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private final String a;
        private final String c;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            String str3 = this.a;
            return "Header(headerId=" + str + ", headerText=" + str2 + ", listContext=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.e = str;
            this.c = str2;
            this.a = str3;
        }
    }
}
