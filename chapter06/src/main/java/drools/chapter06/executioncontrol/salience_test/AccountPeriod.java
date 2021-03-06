package drools.chapter06.executioncontrol.salience_test;

import java.util.Date;

/**
 * @author tanabe
 */
public class AccountPeriod {

  private Date start;
  private Date end;

  public AccountPeriod(Date start, Date end) {
    this.start = start;
    this.end = end;
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return "AccountPeriod{" +
      "start=" + start +
      ", end=" + end +
      '}';
  }

}
