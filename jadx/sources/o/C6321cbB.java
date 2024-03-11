package o;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCode;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCodesData;
import com.netflix.mediaclient.ui.login.countrySelector.PhoneCodeListWrapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.C6363cbr;
import org.json.JSONObject;

/* renamed from: o.cbB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6321cbB extends NetflixDialogFrag {
    public static final a d = new a(null);
    public static final int e = 8;
    private e a;
    private List<PhoneCodeListWrapper> b;
    private C6366cbu c;
    private Long g;

    /* renamed from: o.cbB$e */
    /* loaded from: classes4.dex */
    public interface e {
        void b(PhoneCode phoneCode);
    }

    public static final C6321cbB b(PhoneCodesData phoneCodesData, String str) {
        return d.a(phoneCodesData, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    /* renamed from: o.cbB$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C6321cbB a(PhoneCodesData phoneCodesData, String str) {
            C8632dsu.c((Object) phoneCodesData, "");
            C6321cbB c6321cbB = new C6321cbB();
            c6321cbB.setStyle(2, com.netflix.mediaclient.ui.R.l.m);
            Bundle bundle = new Bundle();
            bundle.putSerializable("phoneCodesData", phoneCodesData);
            bundle.putString("currentLocationId", str);
            c6321cbB.setArguments(bundle);
            return c6321cbB;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        List<PhoneCode> phoneCodes;
        int d2;
        boolean a2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        ArrayList arrayList = null;
        String string = arguments != null ? arguments.getString("currentLocationId") : null;
        d();
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable("phoneCodesData") : null;
        PhoneCodesData phoneCodesData = serializable instanceof PhoneCodesData ? (PhoneCodesData) serializable : null;
        if (phoneCodesData != null && (phoneCodes = phoneCodesData.getPhoneCodes()) != null) {
            d2 = C8572dqo.d(phoneCodes, 10);
            ArrayList arrayList2 = new ArrayList(d2);
            for (PhoneCode phoneCode : phoneCodes) {
                a2 = C8691duz.a(phoneCode.getId(), string, true);
                arrayList2.add(new PhoneCodeListWrapper(phoneCode, a2));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                PhoneCodeListWrapper phoneCodeListWrapper = (PhoneCodeListWrapper) obj;
                if (phoneCodeListWrapper.b().getId().length() != 0 && phoneCodeListWrapper.b().getName().length() != 0 && phoneCodeListWrapper.b().getCode().length() != 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        this.b = arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(C6363cbr.d.c, viewGroup, false);
        C6324cbE e2 = C6324cbE.e(inflate);
        C8632dsu.a(e2, "");
        RecyclerView recyclerView = e2.e;
        C8632dsu.a(recyclerView, "");
        recyclerView.setHasFixedSize(true);
        C6366cbu c6366cbu = new C6366cbu(this.a, this.b);
        this.c = c6366cbu;
        recyclerView.setAdapter(c6366cbu);
        a(e2);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        Logger.INSTANCE.endSession(this.g);
        super.onDestroy();
    }

    private final void b() {
        if (this.g == null) {
            final JSONObject jSONObject = new JSONObject();
            Bundle arguments = getArguments();
            jSONObject.put("resolvedCountry", arguments != null ? arguments.getString("currentLocationId") : null);
            Logger.INSTANCE.startSession(new Presentation(AppView.countrySelector, new TrackingInfo() { // from class: o.cbA
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject b;
                    b = C6321cbB.b(JSONObject.this);
                    return b;
                }
            }));
        }
    }

    private final void d() {
        if (getActivity() instanceof e) {
            FragmentActivity activity = getActivity();
            C8632dsu.d(activity);
            this.a = (e) activity;
            return;
        }
        dismiss();
    }

    public final void a(C6324cbE c6324cbE) {
        C8632dsu.c((Object) c6324cbE, "");
        Toolbar toolbar = c6324cbE.d;
        C8632dsu.a(toolbar, "");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.cbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6321cbB.d(C6321cbB.this, view);
            }
        });
        toolbar.inflateMenu(com.netflix.mediaclient.ui.R.j.b);
        Menu menu = toolbar.getMenu();
        final MenuItem findItem = menu != null ? menu.findItem(com.netflix.mediaclient.ui.R.g.fv) : null;
        SearchView searchView = (SearchView) (findItem != null ? findItem.getActionView() : null);
        if (searchView != null) {
            searchView.setOnQueryTextListener(new c());
        }
        if (searchView != null) {
            searchView.setQueryHint(getString(com.netflix.mediaclient.ui.R.o.li));
        }
        if (searchView != null) {
            searchView.setIconified(false);
        }
        if (searchView != null) {
            searchView.requestFocusFromTouch();
        }
        if (searchView != null) {
            searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: o.cby
                @Override // android.widget.SearchView.OnCloseListener
                public final boolean onClose() {
                    boolean e2;
                    e2 = C6321cbB.e(findItem);
                    return e2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C6321cbB c6321cbB, View view) {
        C8632dsu.c((Object) c6321cbB, "");
        c6321cbB.dismiss();
    }

    /* renamed from: o.cbB$c */
    /* loaded from: classes4.dex */
    public static final class c implements SearchView.OnQueryTextListener {
        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return false;
        }

        c() {
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            ArrayList arrayList;
            boolean b;
            if (!TextUtils.isEmpty(str)) {
                List list = C6321cbB.this.b;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        String name = ((PhoneCodeListWrapper) obj).b().getName();
                        C8632dsu.d((Object) str);
                        b = C8691duz.b(name, str, true);
                        if (b) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                C6366cbu c6366cbu = C6321cbB.this.c;
                if (c6366cbu != null) {
                    c6366cbu.d(arrayList);
                    return false;
                }
                return false;
            }
            C6366cbu c6366cbu2 = C6321cbB.this.c;
            if (c6366cbu2 != null) {
                c6366cbu2.d(C6321cbB.this.b);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(MenuItem menuItem) {
        if (menuItem != null) {
            menuItem.collapseActionView();
            return true;
        }
        return true;
    }
}
