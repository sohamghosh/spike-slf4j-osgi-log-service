package org.motechproject.spike.log.bridge.slf4j.internal;

import org.motechproject.spike.log.bridge.slf4j.MotechLoggerFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        MotechLoggerFactory.setBundleContext(context);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        //todo
    }
}
