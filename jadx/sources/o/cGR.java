package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cBO;
import o.cIE;

/* loaded from: classes4.dex */
public class cGR extends AbstractC5765cHn implements cFU {
    private final Button a;
    private final Button c;
    private final Button d;
    private List<? extends Button> e;
    private final Button f;
    private final Button g;
    private final ViewGroup h;
    private final View j;
    private final View n;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGR(ViewGroup viewGroup) {
        super(viewGroup);
        List<? extends Button> j;
        C8632dsu.c((Object) viewGroup, "");
        this.h = viewGroup;
        View a = a(viewGroup);
        this.j = a;
        this.n = a;
        View findViewById = a.findViewById(cIE.b.aW);
        C8632dsu.a(findViewById, "");
        Button button = (Button) findViewById;
        this.a = button;
        View findViewById2 = a.findViewById(cIE.b.aO);
        C8632dsu.a(findViewById2, "");
        Button button2 = (Button) findViewById2;
        this.d = button2;
        View findViewById3 = a.findViewById(cIE.b.aZ);
        C8632dsu.a(findViewById3, "");
        Button button3 = (Button) findViewById3;
        this.c = button3;
        View findViewById4 = a.findViewById(cIE.b.aX);
        C8632dsu.a(findViewById4, "");
        Button button4 = (Button) findViewById4;
        this.f = button4;
        View findViewById5 = a.findViewById(cIE.b.bb);
        C8632dsu.a(findViewById5, "");
        Button button5 = (Button) findViewById5;
        this.g = button5;
        button.setOnClickListener(new View.OnClickListener() { // from class: o.cGV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGR.h(cGR.this, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: o.cGT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGR.g(cGR.this, view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() { // from class: o.cGY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGR.j(cGR.this, view);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() { // from class: o.cGX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGR.f(cGR.this, view);
            }
        });
        r();
        if (button.getVisibility() == 0 && button5.getVisibility() == 0) {
            button.setText(viewGroup.getResources().getText(com.netflix.mediaclient.ui.R.o.ec));
        }
        if (button5.getVisibility() == 0) {
            j = C8569dql.j(button5, button, button2, button3, button4);
        } else {
            j = C8569dql.j(button, button2, button3, button4);
        }
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(cGR cgr, View view) {
        C8632dsu.c((Object) cgr, "");
        cgr.b((cGR) new cBO.C5572h(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(cGR cgr, View view) {
        C8632dsu.c((Object) cgr, "");
        cgr.b((cGR) cBO.G.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(cGR cgr, View view) {
        C8632dsu.c((Object) cgr, "");
        cgr.b((cGR) cBO.C.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(cGR cgr, View view) {
        C8632dsu.c((Object) cgr, "");
        cgr.b((cGR) cBO.C5583s.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(cGR cgr, View view) {
        C8632dsu.c((Object) cgr, "");
        cgr.b((cGR) cBO.H.d);
    }

    public View a(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return C9703vR.e(viewGroup, cIE.c.v, 0, 2, null);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        super.d();
        this.f.setEnabled(true);
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        this.g.setEnabled(true);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        super.b();
        this.f.setEnabled(false);
        this.c.setEnabled(false);
        this.d.setEnabled(false);
        this.g.setEnabled(false);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        AbstractC5765cHn.a(this, true, true, 0.0f, false, null, 28, null);
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public void x() {
        AbstractC5765cHn.a(this, true, true, 0.0f, true, null, 20, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, true, 0.0f, false, null, 28, null);
    }

    @Override // o.cFU
    public boolean m() {
        return this.f.getVisibility() == 0;
    }

    @Override // o.cFU
    public void c(float f) {
        String string;
        Button button = this.g;
        if (f == 1.0f) {
            string = this.h.getResources().getString(cIE.a.v, Float.valueOf(f));
        } else if (f == 1.5f || f == 0.5f) {
            string = this.h.getResources().getString(cIE.a.u, Float.valueOf(f));
        } else {
            string = this.h.getResources().getString(cIE.a.A, Float.valueOf(f));
        }
        button.setText(string);
    }

    private final void r() {
        Map d;
        Map k;
        Throwable th;
        this.g.setVisibility(0);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: o.cGZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGR.i(cGR.this, view);
            }
        });
        try {
            this.g.setText(this.h.getResources().getString(cIE.a.v, Float.valueOf(1.0f)));
        } catch (UnknownFormatConversionException e) {
            this.g.setVisibility(8);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Not able to format locale", e, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // o.cFU
    public void p() {
        this.c.setVisibility(0);
    }

    @Override // o.cFU
    public void g() {
        this.c.setVisibility(8);
    }

    @Override // o.cFU
    public void l() {
        this.f.setVisibility(0);
    }

    @Override // o.cFU
    public void i() {
        this.f.setVisibility(8);
    }

    @Override // o.cFU
    public void k() {
        this.d.setVisibility(0);
    }

    @Override // o.cFU
    public void h() {
        this.d.setVisibility(8);
    }

    @Override // o.cFU
    public void o() {
        this.a.setVisibility(0);
    }

    @Override // o.cFU
    public void j() {
        this.a.setVisibility(8);
    }

    @Override // o.cFU
    public void n() {
        this.g.setVisibility(0);
    }

    @Override // o.cFU
    public void f() {
        this.g.setVisibility(8);
    }
}
