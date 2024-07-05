//$Id$
package com.zmovizz.utility;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class CustomLogger {
    private static Logger logger;
    private static FileHandler handler;
    private static String path = "/Users/madhavan-21454/ZIDE/zmoviezz/logs/";

    static {
        try {
            logger = Logger.getLogger(CustomLogger.class.getName());
            
            LocalDate date = LocalDate.now();
            String fileName = date + "zmovizz.log";
            
            handler = new FileHandler(path+fileName, true);
            handler.setFormatter(new SimpleFormatter());
            
            logger.addHandler(handler);
          logger.setUseParentHandlers(true); // Disable console logging

        } catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
    }

    public static void log(Level level, String message, Exception e) {
        logger.log(level, message, e);
    }
}
