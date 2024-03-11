package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.appcompat.app.AlertDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.PauseDownloadCommand;
import com.netflix.cl.model.event.session.command.RemoveAllCachedVideosCommand;
import com.netflix.cl.model.event.session.command.RemoveCachedVideoCommand;
import com.netflix.cl.model.event.session.command.ResumeDownloadCommand;
import com.netflix.cl.model.event.session.command.ViewCachedVideosCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import o.C9834xU;

/* renamed from: o.crM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7178crM {
    private static boolean d(Context context) {
        return C8054ddD.a(context, OfflineActivityV2.b()) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PopupMenu b(final Context context, DownloadButton downloadButton, final String str, VideoType videoType, boolean z, PlayContext playContext) {
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, c(context)), downloadButton);
        popupMenu.inflate(com.netflix.mediaclient.ui.R.j.d);
        boolean z2 = true;
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.aO).setVisible(true);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.gX).setVisible((!z || d(context)) ? false : false);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.crM.5
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                InterfaceC4208baF t;
                if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.aO) {
                    CLv2Utils.d(new RemoveCachedVideoCommand());
                    NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
                    if (netflixActivity == null || (t = netflixActivity.getServiceManager().t()) == null) {
                        return true;
                    }
                    t.d(str);
                    DownloadButton.c(str);
                    return true;
                } else if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.gX) {
                    CLv2Utils.d(new ViewCachedVideosCommand());
                    Activity activity = (Activity) C8141del.d(context, Activity.class);
                    if (activity != null) {
                        context.startActivity(OfflineActivityV2.b(activity));
                        return true;
                    }
                    return true;
                } else {
                    return true;
                }
            }
        });
        return popupMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PopupMenu d(final Context context, final DownloadButton downloadButton, final String str, boolean z) {
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, c(context)), downloadButton);
        popupMenu.inflate(com.netflix.mediaclient.ui.R.j.d);
        boolean z2 = true;
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.eh).setVisible(true);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.ae).setVisible(true);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.gX).setVisible((d(context) || !z) ? false : false);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.crM.8
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                InterfaceC4208baF t;
                InterfaceC4208baF t2;
                if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.eh) {
                    CLv2Utils.d(new PauseDownloadCommand());
                    NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
                    if (netflixActivity == null || (t2 = netflixActivity.getServiceManager().t()) == null) {
                        return true;
                    }
                    t2.e(str);
                    downloadButton.e(DownloadButton.ButtonState.PAUSED, str);
                    return true;
                } else if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.ae) {
                    CLv2Utils.d(new RemoveCachedVideoCommand());
                    NetflixActivity netflixActivity2 = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
                    if (netflixActivity2 == null || (t = netflixActivity2.getServiceManager().t()) == null) {
                        return true;
                    }
                    t.d(str);
                    DownloadButton.c(str);
                    return true;
                } else if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.gX) {
                    CLv2Utils.d(new ViewCachedVideosCommand());
                    Activity activity = (Activity) C8141del.d(context, Activity.class);
                    if (activity != null) {
                        context.startActivity(OfflineActivityV2.b(activity));
                        return true;
                    }
                    return true;
                } else {
                    return true;
                }
            }
        });
        return popupMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PopupMenu d(final Context context, DownloadButton downloadButton, final String str, boolean z, boolean z2) {
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, c(context)), downloadButton);
        popupMenu.inflate(com.netflix.mediaclient.ui.R.j.d);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.f13246fi).setVisible(z2);
        boolean z3 = true;
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.ae).setVisible(true);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.gX).setVisible((!z || d(context)) ? false : false);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.crM.6
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                InterfaceC4208baF t;
                if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.f13246fi) {
                    NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
                    if (ConnectivityUtils.o(context) && netflixActivity != null) {
                        InterfaceC4208baF t2 = netflixActivity.getServiceManager().t();
                        if (t2 != null) {
                            boolean o2 = netflixActivity.getServiceManager().t().o();
                            boolean z4 = ConnectivityUtils.p(context) && ConnectivityUtils.k(context) && !ConnectivityUtils.m(context);
                            C7460cwd e = C7353cuc.e(str);
                            if (e != null && o2 && z4) {
                                C7178crM.d(context, str, e.getType(), true).show();
                            } else {
                                CLv2Utils.d(new ResumeDownloadCommand());
                                t2.h(str);
                            }
                        }
                    } else {
                        C7178crM.e(context, str, true).show();
                    }
                } else if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.ae) {
                    CLv2Utils.d(new RemoveCachedVideoCommand());
                    NetflixActivity netflixActivity2 = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
                    if (netflixActivity2 != null && (t = netflixActivity2.getServiceManager().t()) != null) {
                        t.d(str);
                    }
                    DownloadButton.c(str);
                } else if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.gX) {
                    CLv2Utils.d(new ViewCachedVideosCommand());
                    Activity activity = (Activity) C8141del.d(context, Activity.class);
                    if (activity != null) {
                        context.startActivity(OfflineActivityV2.b(activity));
                    }
                }
                return true;
            }
        });
        return popupMenu;
    }

    @SuppressLint({"PrivateResource"})
    private static int c(Context context) {
        return BrowseExperience.e() ? androidx.appcompat.R.style.Theme_AppCompat_Light : androidx.appcompat.R.style.Theme_AppCompat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Dialog e(final Context context, boolean z) {
        AlertDialog.Builder title = new AlertDialog.Builder(context, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.is);
        if (z) {
            title.setMessage(com.netflix.mediaclient.ui.R.o.iu).setNegativeButton(com.netflix.mediaclient.ui.R.o.hT, new DialogInterface.OnClickListener() { // from class: o.crM.11
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    CLv2Utils.d(new ViewCachedVideosCommand());
                    Activity activity = (Activity) C8141del.d(context, Activity.class);
                    if (activity != null) {
                        context.startActivity(OfflineActivityV2.b(activity));
                    }
                    dialogInterface.dismiss();
                }
            }).setPositiveButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.crM.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
        } else {
            title.setMessage(com.netflix.mediaclient.ui.R.o.it).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.crM.12
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
        }
        return title.create();
    }

    public static Dialog e(final Context context, final String str, boolean z) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(context, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.ir).setMessage(com.netflix.mediaclient.ui.R.o.f13254io).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.crM.14
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        if (z) {
            positiveButton.setNegativeButton(com.netflix.mediaclient.ui.R.o.hK, new DialogInterface.OnClickListener() { // from class: o.crM.13
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    InterfaceC4208baF e = C7178crM.e(context);
                    if (e != null) {
                        CLv2Utils.d(new RemoveCachedVideoCommand());
                        e.d(str);
                        DownloadButton.c(str);
                    }
                    dialogInterface.dismiss();
                }
            });
        }
        return positiveButton.create();
    }

    public static Dialog d(final Context context, final String str, final VideoType videoType, boolean z) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(context, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.iw).setMessage(com.netflix.mediaclient.ui.R.o.iv).setNeutralButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.crM.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(com.netflix.mediaclient.ui.R.o.hO, new DialogInterface.OnClickListener() { // from class: o.crM.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Activity activity = (Activity) C8141del.d(context, Activity.class);
                if (activity != null) {
                    Intent b = cUS.b(activity);
                    b.putExtra(NetflixActivity.EXTRA_DL_PLAYABLE_ID, str);
                    b.putExtra(NetflixActivity.EXTRA_DL_VIDEO_TYPE_STRING, videoType.getValue());
                    activity.startActivityForResult(b, MP.a);
                }
                dialogInterface.dismiss();
            }
        });
        if (z) {
            positiveButton.setNegativeButton(com.netflix.mediaclient.ui.R.o.hK, new DialogInterface.OnClickListener() { // from class: o.crM.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    InterfaceC4208baF e = C7178crM.e(context);
                    if (e != null) {
                        CLv2Utils.d(new RemoveCachedVideoCommand());
                        e.d(str);
                        DownloadButton.c(str);
                    }
                    dialogInterface.dismiss();
                }
            });
        }
        return positiveButton.create();
    }

    public static Dialog a(final Context context, final String str, final int i) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(context, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.iw).setMessage(com.netflix.mediaclient.ui.R.o.iD).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.crN
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        });
        final NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        if (!C8126deW.a()) {
            positiveButton.setNegativeButton(com.netflix.mediaclient.ui.R.o.iG, new DialogInterface.OnClickListener() { // from class: o.crV
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C7178crM.e(context, str, netflixActivity, i, dialogInterface, i2);
                }
            });
        }
        return positiveButton.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(final Context context, String str, NetflixActivity netflixActivity, final int i, DialogInterface dialogInterface, int i2) {
        final InterfaceC4208baF e = e(context);
        if (e != null) {
            e.b(str);
            if (netflixActivity != null) {
                final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) netflixActivity.findViewById(com.netflix.mediaclient.ui.R.g.aG);
                final View findViewById = netflixActivity.findViewById(com.netflix.mediaclient.ui.R.g.V);
                if (coordinatorLayout != null && findViewById != null) {
                    C8167dfK.a(coordinatorLayout, findViewById, com.netflix.mediaclient.ui.R.o.iK, com.netflix.mediaclient.ui.R.o.iH, i, new View.OnClickListener() { // from class: o.crP
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7178crM.e(InterfaceC4208baF.this, coordinatorLayout, findViewById, i, context, view);
                        }
                    });
                }
            }
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(InterfaceC4208baF interfaceC4208baF, CoordinatorLayout coordinatorLayout, View view, int i, final Context context, View view2) {
        interfaceC4208baF.c(false);
        CLv2Utils.INSTANCE.e(new Focus(AppView.wifiOnlyDownloadsSetting, null), new ChangeValueCommand(Boolean.FALSE));
        C8167dfK.a(coordinatorLayout, view, com.netflix.mediaclient.ui.R.o.iJ, com.netflix.mediaclient.ui.R.o.iI, i, new View.OnClickListener() { // from class: o.crO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C7178crM.a(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context) {
        Activity activity = (Activity) C8141del.d(context, Activity.class);
        if (activity != null) {
            activity.startActivity(cUS.b(activity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC4208baF e(Context context) {
        ServiceManager c;
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        if (netflixActivity == null || (c = ServiceManager.c(netflixActivity)) == null) {
            return null;
        }
        return c.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Dialog e(Context context, String str) {
        return new AlertDialog.Builder(context, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.ie).setMessage(context.getResources().getString(com.netflix.mediaclient.ui.R.o.f31if, str)).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.crM.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create();
    }

    public static Dialog a(Context context, final DialogInterface.OnClickListener onClickListener, String str) {
        String string = context.getResources().getString(com.netflix.mediaclient.ui.R.o.iO, str);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new TextAppearanceSpan(context, C9834xU.o.s), 0, string.length(), 33);
        return new AlertDialog.Builder(context, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.iM).setMessage(spannableString).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.crM.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                CLv2Utils.d(new RemoveAllCachedVideosCommand());
                onClickListener.onClick(dialogInterface, i);
                dialogInterface.dismiss();
            }
        }).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.crM.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create();
    }

    public static PopupMenu b(final Context context, DownloadButton downloadButton, final String str, boolean z) {
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, c(context)), downloadButton);
        popupMenu.inflate(com.netflix.mediaclient.ui.R.j.d);
        boolean z2 = true;
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.bi).setVisible(true);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.ae).setVisible(true);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.gX).setVisible((!z || d(context)) ? false : false);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.crM.9
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                Activity activity;
                InterfaceC4208baF t;
                if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.bi) {
                    InterfaceC4208baF e = C7178crM.e(context);
                    if (e != null) {
                        CLv2Utils.d(new ResumeDownloadCommand());
                        e.b(str);
                        return true;
                    }
                    return true;
                } else if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.ae) {
                    NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
                    if (netflixActivity != null && (t = netflixActivity.getServiceManager().t()) != null) {
                        CLv2Utils.d(new RemoveCachedVideoCommand());
                        t.d(str);
                    }
                    DownloadButton.c(str);
                    return true;
                } else if (menuItem.getItemId() != com.netflix.mediaclient.ui.R.g.gX || (activity = (Activity) C8141del.d(context, Activity.class)) == null) {
                    return true;
                } else {
                    CLv2Utils.d(new ViewCachedVideosCommand());
                    context.startActivity(OfflineActivityV2.b(activity));
                    return true;
                }
            }
        });
        return popupMenu;
    }
}
