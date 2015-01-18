package hj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by heiko on 14.01.15.
 */
@EnableSpringConfigured
@Configuration
@ComponentScan("hj")
public class Main {


    public static final void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:**/applicationContext.xml");




        DBSetup dbSetup = (DBSetup)context.getBean(DBSetup.class);
        dbSetup.init();

        new Main().run();

    }

    @Transactional
    public void run() {
        Country c = new Country();
        c.setName("Deutschland");
        c.setCode("DE");

        c.persist();
        c.flush();


        c.setName("Test");
        c.merge();
        c.flush();

        c.setName("XYZ");

        c.merge();
        c.flush();

        c.remove();
        c.flush();

        List<CountryHistory> historyList = c.getHistory();

        for(CountryHistory history : historyList) {
            System.out.println(history);
        }

    }



}
