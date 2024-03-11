package o;

import android.content.Intent;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;

/* loaded from: classes3.dex */
public final class aVL {
    private aVK e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aVL(aVK avk) {
        this.e = avk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Intent intent) {
        if (!intent.hasCategory("com.netflix.mediaclient.intent.category.MDX")) {
            C1044Mm.d("nf_mdx", "handleCommandIntent:intent is not for mdx, " + intent.getCategories());
            return;
        }
        String action = intent.getAction();
        if (C8168dfL.g(action)) {
            C1044Mm.d("nf_mdx", "handleCommandIntent:intent doesn't have action, " + intent.toString());
            return;
        }
        String stringExtra = intent.getStringExtra("uuid");
        if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_GETCAPABILITY")) {
            this.e.c(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_GETSTATE")) {
            this.e.h(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAY")) {
            String stringExtra2 = intent.getStringExtra("catalogId");
            int intExtra = intent.getIntExtra("trackId", -1);
            String stringExtra3 = intent.getStringExtra("episodeId");
            boolean booleanExtra = intent.getBooleanExtra("previewPinProtected", false);
            String stringExtra4 = intent.getStringExtra("prereleasePin");
            int intExtra2 = intent.getIntExtra("time", -1);
            if (intExtra == -1) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.c(stringExtra, stringExtra2, intExtra, stringExtra3, intExtra2, booleanExtra, stringExtra4);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_PAUSE")) {
            this.e.j(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_RESUME")) {
            this.e.g(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_SEEK")) {
            int intExtra3 = intent.getIntExtra("time", -1);
            if (intExtra3 == -1) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.a(stringExtra, intExtra3);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_SKIP")) {
            int intExtra4 = intent.getIntExtra("time", -1);
            if (intExtra4 == -1) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.d(stringExtra, intExtra4);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_STOP")) {
            this.e.e(stringExtra, intent.getStringExtra("invocSource"));
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_SETAUDIOSUB")) {
            String stringExtra5 = intent.getStringExtra("audioTrackId");
            String stringExtra6 = intent.getStringExtra("subtitleTrackId");
            if (C8168dfL.g(stringExtra5) || C8168dfL.g(stringExtra6)) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.d(stringExtra, stringExtra5, stringExtra6);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_SETVOLUME")) {
            int intExtra5 = intent.getIntExtra("volume", -1);
            if (intExtra5 == -1) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.b(stringExtra, intExtra5);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_AUTOADV")) {
            int intExtra6 = intent.getIntExtra("speed", -1);
            if (intExtra6 == -1) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.c(stringExtra, intExtra6);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_METADATA")) {
            String stringExtra7 = intent.getStringExtra("catalogId");
            String stringExtra8 = intent.getStringExtra("episodeId");
            String stringExtra9 = intent.getStringExtra("type");
            if (C8168dfL.g(stringExtra7) || C8168dfL.g(stringExtra8)) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.d(stringExtra, stringExtra7, stringExtra8, stringExtra9);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_DIALOGRESP")) {
            String stringExtra10 = intent.getStringExtra("uid");
            String stringExtra11 = intent.getStringExtra(NotificationFactory.DATA);
            if (C8168dfL.g(stringExtra10) || C8168dfL.g(stringExtra11)) {
                C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", invalid parameters");
                return;
            }
            this.e.e(stringExtra, stringExtra10, stringExtra11);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_GETAUDIOSUB")) {
            this.e.a(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_PINCONFIRMED")) {
            this.e.d(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_PINCANCELLED")) {
            this.e.b(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_STOPPOSTPALY")) {
            this.e.f(stringExtra);
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_SKIP_INTRO")) {
            this.e.a(stringExtra, intent.getStringExtra("segmentType"), intent.getStringExtra("invocSource"));
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_REMOTE_LOGIN_CONSENT")) {
            this.e.d(stringExtra, Boolean.valueOf(intent.getStringExtra(NotificationFactory.DATA)).booleanValue());
        } else if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_REGPAIR_PIN_CONFIRMATION")) {
            if (intent.getBooleanExtra("isRegPairPinSubmitted", false)) {
                this.e.c(stringExtra, intent.getStringExtra("regPairPin"));
                return;
            }
            this.e.e(stringExtra);
        } else {
            C1044Mm.d("nf_mdx", "handleCommandIntent: " + action + ", unknown command");
        }
    }
}
