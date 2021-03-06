package com.lisbonbigapps.myhoster.client.util;

public class ServerHelper {
    private static final String RestHost = "localeyes.no-ip.org";
    private static final String RestPort = "80";
    private static final String RestUrl = "http://" + RestHost + ":" + RestPort + "/local/rest";

    private static final String XmppHost = "localeyes.no-ip.org";
    private static final int XmppPort = 5222;
    private static final String XmppService = "localhost";

    public static String getRestHost() {
	return RestHost;
    }

    public static String getRestPort() {
	return RestPort;
    }

    public static String getRestUrl() {
	return RestUrl;
    }

    public static String buildRestUrl(String endPoint) {
	return RestUrl + endPoint;
    }

    public static String getXmppHost() {
	return XmppHost;
    }

    public static int getXmppPort() {
	return XmppPort;
    }

    public static String getXmppService() {
	return XmppService;
    }
}
