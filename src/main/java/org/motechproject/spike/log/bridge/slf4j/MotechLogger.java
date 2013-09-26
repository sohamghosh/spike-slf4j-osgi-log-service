package org.motechproject.spike.log.bridge.slf4j;

import org.motechproject.spike.log.service.MotechLogService;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

public class MotechLogger extends MarkerIgnoringBase {

    private static final long serialVersionUID = 1L;
    private MotechLogService logService;

    public MotechLogger() {
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public void trace(String msg) {
        internalLog(msg, null);
    }

    public void trace(String format, Object arg) {
        String msg = MessageFormatter.format(format, arg).getMessage();
        internalLog(msg, null);
    }

    public void trace(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.format(format, arg1, arg2).getMessage();
        internalLog(msg, null);
    }


    public void trace(String format, Object[] argArray) {
        String msg = MessageFormatter.arrayFormat(format, argArray).getMessage();
        ;
        internalLog(msg, null);
    }

    public void trace(String msg, Throwable t) {
        internalLog(msg, t);
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public void debug(String msg) {
        internalLog(msg, null);
    }

    public void debug(String format, Object arg) {
        String msg = MessageFormatter.format(format, arg).getMessage();
        internalLog(msg, null);
    }

    public void debug(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.format(format, arg1, arg2).getMessage();
        internalLog(msg, null);
    }

    public void debug(String format, Object[] argArray) {
        String msg = MessageFormatter.arrayFormat(format, argArray).getMessage();
        internalLog(msg, null);
    }

    public void debug(String msg, Throwable t) {
        internalLog(msg, t);
    }

    public boolean isInfoEnabled() {
        return true;
    }

    public void info(String msg) {
        internalLog(msg, null);
    }

    public void info(String format, Object arg) {
        String msg = MessageFormatter.format(format, arg).getMessage();
        internalLog(msg, null);
    }

    public void info(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.format(format, arg1, arg2).getMessage();
        internalLog(msg, null);
    }

    public void info(String format, Object[] argArray) {
        String msg = MessageFormatter.arrayFormat(format, argArray).getMessage();
        internalLog(msg, null);
    }

    public void info(String msg, Throwable t) {
        internalLog(msg, t);
    }

    public boolean isWarnEnabled() {
        return true;
    }

    public void warn(String msg) {
        internalLog(msg, null);
    }

    public void warn(String format, Object arg) {
        String msg = MessageFormatter.format(format, arg).getMessage();
        internalLog(msg, null);
    }

    public void warn(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.format(format, arg1, arg2).getMessage();
        internalLog(msg, null);
    }

    public void warn(String format, Object[] argArray) {
        String msg = MessageFormatter.arrayFormat(format, argArray).getMessage();
        internalLog(msg, null);
    }

    public void warn(String msg, Throwable t) {
        internalLog(msg, t);
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public void error(String msg) {
        internalLog(msg, null);
    }

    public void error(String format, Object arg) {
        String msg = MessageFormatter.format(format, arg).getMessage();
        internalLog(msg, null);
    }

    public void error(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.format(format, arg1, arg2).getMessage();
        internalLog(msg, null);
    }

    public void error(String format, Object[] argArray) {
        String msg = MessageFormatter.arrayFormat(format, argArray).getMessage();
        internalLog(msg, null);
    }

    public void error(String msg, Throwable t) {
        internalLog(msg, t);
    }

    private final void internalLog(Object message, Throwable t) {
        if (logService != null) {
            logService.info(message.toString(), null);
        }
    }

    public void removeLogService() {
        this.logService = null;
    }

    public void setLogService(MotechLogService logService) {
        this.logService = logService;
    }
}
