package jungkulee.controller;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 * @version : 1.0
 * @author: : junkulee
 * @since : 2016. 4. 30.
 */
@Component
public class ApplicationLoader implements CommandLineRunner {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(ApplicationLoader.class);

    @Override
    public void run(String... strings) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (String option : strings) {
            sb.append(" ").append(option);
        }
        sb = sb.length() == 0 ? sb.append("No Options Specified") : sb;
        logger.info(String.format("WAR launched with following options: %s", sb.toString()));
    }
}