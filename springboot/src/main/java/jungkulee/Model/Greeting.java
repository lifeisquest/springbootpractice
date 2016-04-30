package jungkulee.Model;

/**
 * @version : 1.0
 * @author: : junkulee
 * @since : 2016. 4. 30.
 */
public class Greeting {

  private final long id;
  private final String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
