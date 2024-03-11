package o;

import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.util.PlayContext;

/* loaded from: classes.dex */
public interface bMZ {
    public static final bMZ d = new bMZ() { // from class: o.bMZ.3
        @Override // o.bMZ
        public int a() {
            return 0;
        }

        @Override // o.bMZ
        public void a(int i, int i2, int i3, int i4) {
        }

        @Override // o.bMZ
        public NetflixActionBar.b.C0051b b() {
            return null;
        }

        @Override // o.bMZ
        public boolean b(int i) {
            return false;
        }

        @Override // o.bMZ
        public boolean b(Intent intent) {
            return false;
        }

        @Override // o.bMZ
        public NetflixFrag c() {
            return null;
        }

        @Override // o.bMZ
        public void c(Bundle bundle) {
        }

        @Override // o.bMZ
        public boolean e() {
            return false;
        }

        @Override // o.bMZ
        public boolean f() {
            return false;
        }

        @Override // o.bMZ
        public boolean g() {
            return false;
        }

        @Override // o.bMZ
        public boolean h() {
            return false;
        }

        @Override // o.bMZ
        public boolean i() {
            return false;
        }

        @Override // o.bMZ
        public boolean j() {
            return false;
        }

        @Override // o.bMZ
        public boolean m() {
            return false;
        }

        @Override // o.bMZ
        public void n() {
        }

        @Override // o.bMZ
        public PlayContext d() {
            return new EmptyPlayContext("NOOP", -391);
        }
    };

    int a();

    void a(int i, int i2, int i3, int i4);

    NetflixActionBar.b.C0051b b();

    boolean b(int i);

    boolean b(Intent intent);

    NetflixFrag c();

    void c(Bundle bundle);

    PlayContext d();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    boolean m();

    void n();
}
