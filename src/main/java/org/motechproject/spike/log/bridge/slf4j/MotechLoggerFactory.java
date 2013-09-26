package org.motechproject.spike.log.bridge.slf4j;

import org.osgi.framework.BundleContext;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class MotechLoggerFactory implements ILoggerFactory {

    private static MotechLoggerManager loggerManager;

    @Override
    public Logger getLogger(String s) {
        return loggerManager == null ? null : loggerManager.getLogger();
    }

    public static void setBundleContext(BundleContext context) {
        loggerManager = new MotechLoggerManager(context);
        loggerManager.open();
    }
}
