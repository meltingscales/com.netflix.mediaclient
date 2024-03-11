package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Base64;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.ViewUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cBA;
import o.cIE;

/* loaded from: classes4.dex */
public final class bDK {
    private static byte e$ss2$1110 = 24;
    private static int h = 0;
    private static int l = 1;
    private final C9935zP a;
    private c b;
    private Long c;
    private final NetflixActivity d;
    private aJY e;
    private List<String> f;
    private final List<Float> g;
    private final e i;
    private ListView j;

    public bDK(NetflixActivity netflixActivity, aJY ajy, C9935zP c9935zP) {
        List<Float> j;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) c9935zP, "");
        this.d = netflixActivity;
        this.e = ajy;
        this.a = c9935zP;
        this.f = new ArrayList();
        j = C8569dql.j(Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f));
        this.g = j;
        e eVar = new e(this, netflixActivity, this.e, this.f, j);
        this.i = eVar;
        List<String> list = this.f;
        String string = netflixActivity.getResources().getString(cIE.a.t);
        C8632dsu.a(string, "");
        list.add(string);
        List<String> list2 = this.f;
        String string2 = netflixActivity.getResources().getString(cIE.a.s);
        C8632dsu.a(string2, "");
        list2.add(string2);
        List<String> list3 = this.f;
        String string3 = netflixActivity.getResources().getString(cIE.a.w);
        C8632dsu.a(string3, "");
        list3.add(string3);
        List<String> list4 = this.f;
        String string4 = netflixActivity.getResources().getString(cIE.a.y);
        C8632dsu.a(string4, "");
        list4.add(string4);
        List<String> list5 = this.f;
        String string5 = netflixActivity.getResources().getString(cIE.a.x);
        C8632dsu.a(string5, "");
        list5.add(string5);
        View inflate = LayoutInflater.from(netflixActivity).inflate(cIE.c.ae, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(cIE.b.bH);
        this.j = listView;
        if (listView != null) {
            listView.setChoiceMode(1);
        } else {
            int i = h + 37;
            l = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        ListView listView2 = this.j;
        if (listView2 != null) {
            listView2.setAdapter((ListAdapter) eVar);
            int i4 = 2 % 2;
        }
        this.b = new c(this, netflixActivity);
        ListView listView3 = this.j;
        if (listView3 != null) {
            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.bDQ
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
                    bDK.d(bDK.this, adapterView, view, i5, j2);
                }
            });
        }
        this.b.setCancelable(true);
        c cVar = this.b;
        String string6 = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.cL);
        if (!(!string6.startsWith("'!#+"))) {
            int i5 = l + 89;
            h = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                k(string6.substring(4), objArr);
                string6 = ((String) objArr[0]).intern();
                int i6 = 10 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                k(string6.substring(4), objArr2);
                string6 = ((String) objArr2[0]).intern();
            }
            int i7 = h + 63;
            l = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        }
        cVar.setButton(-2, string6, new DialogInterface.OnClickListener() { // from class: o.bDS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                bDK.c(bDK.this, dialogInterface, i9);
            }
        });
        this.b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.bDR
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bDK.a(bDK.this, dialogInterface);
            }
        });
        this.b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.bDP
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bDK.b(bDK.this, dialogInterface);
            }
        });
        this.b.setView(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(bDK bdk, AdapterView adapterView, View view, int i, long j) {
        int b;
        C8632dsu.c((Object) bdk, "");
        b = C8569dql.b(bdk.g, Float.valueOf(bdk.e.x()), 0, 0, 6, null);
        if (b != i) {
            bdk.e.setPlaybackSpeed(bdk.g.get(i).floatValue());
            bdk.i.notifyDataSetChanged();
            bdk.a.b(cBA.class, new cBA.C5551m(bdk.g.get(i).floatValue()));
            bdk.a.b(cBA.class, cBA.F.a);
            Logger logger = Logger.INSTANCE;
            logger.endSession(logger.startSession(new ChangeValueCommand(bdk.g.get(i))));
            logger.endSession(bdk.c);
        }
        bdk.b.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bDK bdk, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) bdk, "");
        if (Session.doesSessionExist(bdk.c)) {
            Logger.INSTANCE.cancelSession(bdk.c);
        }
        bdk.b.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bDK bdk, DialogInterface dialogInterface) {
        C8632dsu.c((Object) bdk, "");
        if (Session.doesSessionExist(bdk.c)) {
            Logger.INSTANCE.cancelSession(bdk.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bDK bdk, DialogInterface dialogInterface) {
        C8632dsu.c((Object) bdk, "");
        if (Session.doesSessionExist(bdk.c)) {
            Logger.INSTANCE.cancelSession(bdk.c);
        }
    }

    public final void a(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        this.e = ajy;
        this.i.c(ajy);
        this.d.displayDialog(this.b);
        this.c = Logger.INSTANCE.startSession(new Focus(AppView.playbackSpeedSelector, null));
    }

    /* loaded from: classes4.dex */
    public final class e extends BaseAdapter {
        private aJY a;
        private final List<String> b;
        private final List<Float> c;
        private final Activity d;
        final /* synthetic */ bDK e;

        public final void c(aJY ajy) {
            C8632dsu.c((Object) ajy, "");
            this.a = ajy;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public e(bDK bdk, Activity activity, aJY ajy, List<String> list, List<Float> list2) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) ajy, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            this.e = bdk;
            this.d = activity;
            this.a = ajy;
            this.b = list;
            this.c = list2;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.b.size();
        }

        @Override // android.widget.Adapter
        /* renamed from: e */
        public String getItem(int i) {
            return this.b.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int b2;
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) viewGroup, "");
            if (view == null) {
                view = this.d.getLayoutInflater().inflate(cIE.c.ak, viewGroup, false);
                view.setTag(new b(this, view));
            }
            Object tag = view.getTag();
            C8632dsu.d(tag);
            b bVar = (b) tag;
            float x = this.a.x();
            b2 = C8569dql.b(this.c, Float.valueOf(x), 0, 0, 6, null);
            if (b2 == -1) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Can't find the speed with value " + x + " in list", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        c1596aHd.a(errorType.c() + " " + b3);
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
                return view;
            }
            String item = getItem(i);
            boolean c = C8632dsu.c((Object) item, (Object) this.b.get(b2));
            bVar.a().setText(item);
            bVar.b().setChecked(c);
            if (c) {
                ViewUtils.a(bVar.a());
            } else {
                ViewUtils.c(bVar.a());
            }
            return view;
        }

        /* loaded from: classes4.dex */
        public final class b {
            private RadioButton a;
            final /* synthetic */ e d;
            private TextView e;

            public final TextView a() {
                return this.e;
            }

            public final RadioButton b() {
                return this.a;
            }

            public b(e eVar, View view) {
                C8632dsu.c((Object) view, "");
                this.d = eVar;
                View findViewById = view.findViewById(cIE.b.bF);
                C8632dsu.a(findViewById, "");
                this.e = (TextView) findViewById;
                View findViewById2 = view.findViewById(cIE.b.bG);
                C8632dsu.a(findViewById2, "");
                this.a = (RadioButton) findViewById2;
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends AlertDialog {
        final /* synthetic */ bDK b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(bDK bdk, Context context) {
            super(new ContextThemeWrapper(context, com.netflix.mediaclient.ui.R.l.m));
            C8632dsu.c((Object) context, "");
            this.b = bdk;
        }
    }

    private static void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1110);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
