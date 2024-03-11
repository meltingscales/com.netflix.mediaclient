package com.netflix.clcs.models;

import android.net.Uri;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import o.C8600drp;
import o.C8632dsu;
import o.FC;
import o.FD;
import o.FE;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public final class Modal implements FD {
    private final String a;
    private final FD b;
    private final FE c;
    private final HawkinsButtonType d;
    private final Uri e;
    private final Presentation f;
    private final FC g;

    public final FD a() {
        return this.b;
    }

    public final FE b() {
        return this.c;
    }

    public final HawkinsButtonType c() {
        return this.d;
    }

    public final Uri d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Modal) {
            Modal modal = (Modal) obj;
            return C8632dsu.c((Object) this.a, (Object) modal.a) && C8632dsu.c(this.g, modal.g) && C8632dsu.c(this.e, modal.e) && this.f == modal.f && this.d == modal.d && C8632dsu.c(this.c, modal.c) && C8632dsu.c(this.b, modal.b);
        }
        return false;
    }

    public final Presentation h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        FC fc = this.g;
        int hashCode2 = fc == null ? 0 : fc.hashCode();
        Uri uri = this.e;
        int hashCode3 = uri == null ? 0 : uri.hashCode();
        int hashCode4 = this.f.hashCode();
        HawkinsButtonType hawkinsButtonType = this.d;
        int hashCode5 = hawkinsButtonType == null ? 0 : hawkinsButtonType.hashCode();
        FE fe = this.c;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (fe != null ? fe.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    public final FC i() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        FC fc = this.g;
        Uri uri = this.e;
        Presentation presentation = this.f;
        HawkinsButtonType hawkinsButtonType = this.d;
        FE fe = this.c;
        FD fd = this.b;
        return "Modal(key=" + str + ", style=" + fc + ", backgroundImageUrl=" + uri + ", presentation=" + presentation + ", closeButtonType=" + hawkinsButtonType + ", onClose=" + fe + ", content=" + fd + ")";
    }

    public Modal(String str, FC fc, Uri uri, Presentation presentation, HawkinsButtonType hawkinsButtonType, FE fe, FD fd) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) presentation, "");
        C8632dsu.c((Object) fd, "");
        this.a = str;
        this.g = fc;
        this.e = uri;
        this.f = presentation;
        this.d = hawkinsButtonType;
        this.c = fe;
        this.b = fd;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Presentation {
        private static final /* synthetic */ Presentation[] a;
        private static final /* synthetic */ InterfaceC8598drn c;
        public static final Presentation d = new Presentation("DIALOG", 0);
        public static final Presentation e = new Presentation("FULL_SCREEN", 1);
        public static final Presentation b = new Presentation("BOTTOM_SHEET", 2);

        private static final /* synthetic */ Presentation[] d() {
            return new Presentation[]{d, e, b};
        }

        public static Presentation valueOf(String str) {
            return (Presentation) Enum.valueOf(Presentation.class, str);
        }

        public static Presentation[] values() {
            return (Presentation[]) a.clone();
        }

        private Presentation(String str, int i) {
        }

        static {
            Presentation[] d2 = d();
            a = d2;
            c = C8600drp.e(d2);
        }
    }
}
