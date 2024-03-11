package o;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aWq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2013aWq {
    private a c;
    private Context d;
    private Handler g;
    private boolean h = false;
    private String b = "";
    private String e = "";
    private String i = "";
    private d a = new d();

    /* renamed from: o.aWq$a */
    /* loaded from: classes.dex */
    public interface a {
        void b(String str, String str2);

        void w();
    }

    public String b() {
        return this.e;
    }

    public C2013aWq(Context context, a aVar) {
        this.d = context;
        this.c = aVar;
    }

    public void e() {
        if (true == this.h) {
            return;
        }
        this.h = true;
        this.g = new Handler() { // from class: o.aWq.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C8197dfo c8197dfo = new C8197dfo();
                int i = message.what;
                if (i == 1) {
                    C1044Mm.e("nf_mdxTargetSelector", "TargetSelector: target stickiness expired");
                    c8197dfo.d("mdx_target_lastactive", System.currentTimeMillis());
                    c8197dfo.b("mdx_target_uuid", "");
                    c8197dfo.b("mdx_target_location", "");
                    c8197dfo.a();
                    C2013aWq.this.c.w();
                    return;
                }
                if (i == 2) {
                    C1044Mm.e("nf_mdxTargetSelector", "TargetSelector: new target is selected " + C2013aWq.this.e);
                    c8197dfo.d("mdx_target_lastactive", System.currentTimeMillis());
                    c8197dfo.a();
                } else if (i == 3) {
                    c8197dfo.d("mdx_target_lastactive", System.currentTimeMillis());
                    c8197dfo.a();
                    return;
                } else if (i != 4) {
                    C1044Mm.d("nf_mdxTargetSelector", "TargetSelector: unknown message");
                    return;
                }
                C1044Mm.e("nf_mdxTargetSelector", "TargetSelector: update selected target " + C2013aWq.this.e + " targetInfo: " + C2013aWq.this.a.c());
                c8197dfo.b("mdx_target_uuid", C2013aWq.this.e);
                c8197dfo.b("mdx_target_location", C2013aWq.this.b);
                C2013aWq.this.a.a(C2013aWq.this.d);
                c8197dfo.a();
                C2013aWq.this.c.b(C2013aWq.this.e, C2013aWq.this.i);
            }
        };
        if (System.currentTimeMillis() - C8157dfA.b(this.d, "mdx_target_lastactive", 0L) <= 12600000) {
            this.e = C8157dfA.e(this.d, "mdx_target_uuid", this.e);
            this.b = C8157dfA.e(this.d, "mdx_target_location", this.b);
            this.a = this.a.d(this.d);
        }
    }

    public JSONObject c() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public boolean a(AbstractC2065aYo abstractC2065aYo) {
        if (this.h && !C8168dfL.d(this.e, "") && abstractC2065aYo != null) {
            String t = abstractC2065aYo.t();
            String n = abstractC2065aYo.n();
            if (C8168dfL.d(this.e, t) || C8168dfL.d(this.b, n)) {
                return true;
            }
        }
        return false;
    }

    public void d(AbstractC2065aYo abstractC2065aYo) {
        String t = abstractC2065aYo == null ? "" : abstractC2065aYo.t();
        String n = abstractC2065aYo == null ? "" : abstractC2065aYo.n();
        if (!this.h || C8168dfL.d(this.e, t)) {
            return;
        }
        this.i = this.e;
        this.e = t == null ? "" : t;
        this.b = n != null ? n : "";
        d dVar = abstractC2065aYo != null ? new d(abstractC2065aYo.t(), abstractC2065aYo.k()) : new d();
        this.a = dVar;
        C1044Mm.a("nf_mdxTargetSelector", "selectNewTarget %s", dVar.c());
        this.g.sendEmptyMessage(2);
        if (C8168dfL.g(t)) {
            this.g.removeMessages(1);
        } else {
            b(12600000L);
        }
    }

    public void d() {
        if (this.h) {
            this.g.sendEmptyMessage(3);
            this.g.removeMessages(1);
        }
    }

    public void a() {
        if (this.h) {
            this.g.sendEmptyMessage(3);
            b(12600000L);
        }
    }

    private void b(long j) {
        if (this.h) {
            C1044Mm.e("nf_mdxTargetSelector", "TargetSelector: startCountDown " + j);
            this.g.removeMessages(1);
            this.g.sendEmptyMessageDelayed(1, j);
        }
    }

    /* renamed from: o.aWq$d */
    /* loaded from: classes3.dex */
    public class d {
        private String c;
        private String e;

        public d() {
        }

        public d(String str, String str2) {
            this.e = str;
            this.c = str2;
        }

        public JSONObject c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("uuid", this.e);
                jSONObject.putOpt("fName", this.c);
            } catch (JSONException e) {
                C1044Mm.e("nf_mdxTargetSelector", "could not write target extra", e);
            }
            return jSONObject;
        }

        public void a(Context context) {
            C8157dfA.a(context, "mdx_target_extra_info", c().toString());
        }

        public d d(Context context) {
            d dVar = null;
            String e = C8157dfA.e(context, "mdx_target_extra_info", (String) null);
            if (C8168dfL.g(e)) {
                return this;
            }
            try {
                JSONObject jSONObject = new JSONObject(e);
                dVar = new d(jSONObject.optString("uuid"), jSONObject.optString("fName"));
            } catch (JSONException unused) {
                C1044Mm.e("nf_mdxTargetSelector", "couldn't create json obj for %s", e);
            }
            return dVar == null ? this : dVar;
        }
    }
}
