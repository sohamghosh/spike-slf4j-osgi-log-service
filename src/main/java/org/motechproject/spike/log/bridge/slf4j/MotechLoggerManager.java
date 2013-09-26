package org.motechproject.spike.log.bridge.slf4j;

import org.motechproject.spike.log.service.MotechLogService;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;

public class MotechLoggerManager extends ServiceTracker {

    private LogService logService;
    private MotechLogger logger;

    public MotechLoggerManager(BundleContext context) {
        super(context, LogService.class.getName(), null);
        logger = new MotechLogger();
    }


    @Override
    public Object addingService(ServiceReference reference) {
        logService = (LogService) super.addingService(reference);
        MotechLogService motechLogService = new MotechLogService();
        motechLogService.setLogService(logService);
        logger.setLogService(motechLogService);
        return logService;
    }

    @Override
    public void removedService(ServiceReference reference, Object service) {
        super.removedService(reference, service);
        logService = null;
        logger.removeLogService();
    }

    public Logger getLogger() {
        return logger;
    }
}
