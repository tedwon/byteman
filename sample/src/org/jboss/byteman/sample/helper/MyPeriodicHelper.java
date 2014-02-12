package org.jboss.byteman.sample.helper;

import org.jboss.byteman.rule.Rule;
import org.jboss.byteman.rule.helper.Helper;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Periodic Helper Class<p/>
 *
 * @author <a href=mailto:iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 * @since 0.1.0
 */

public class MyPeriodicHelper extends Helper {

  private static Timer myTimer;
  private static long TIMER_PERIOD = 1000L;


  static {
    myTimer = new Timer("myTimer-thread", true);
    myTimer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        doPeriodicJob();
      }
    }, 0L, TIMER_PERIOD);
  }

  protected MyPeriodicHelper(Rule rule) {
    super(rule);
//    System.out.println("### MyPeriodicHelper.<init>: \n" + rule);
  }

  public static void doPeriodicJob() {
//    System.out.println("### MyPeriodicHelper.getHello: currentTimeMillis=" + System.currentTimeMillis());
  }
}
