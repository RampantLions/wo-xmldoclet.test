package org.weborganic.xmldoclet.test;

import java.util.List;

/**
 * ABC!
 */
@TestAnnotation(parameters={"A", "B"}, count=33, greek=TestEnum.BETA)
public class TestClass extends TestAbstractClass implements TestInterface {

  /**
   * My favorite constant.
   */
  public static final String FAVORITE = "my favorite!";

  /**
   * Let's check this doclet.
   * 
   * {@inheritDoc}
   * 
   * <p>Let's add some <i>code</i>: {@code
   * <service id="123">
   *   <url pattern="/{sdd}"/>
   * </service>
   * }
   * 
   * <p>Include some value like {@value #FAVORITE}.
   * 
   * @see <a href="http://www.weborganic.org">Weborganic.org</a>
   */
  public void doSomething() {
  }

  protected void doNothing() {
  }

  /**
   * 
   * @CustomTag Alice in wonderland 
   * 
   * @MyTestTaglet Big Bang is it an {@link Object}?
   * 
   * @param e a random parameter, can be <code>null</code>
   * @return a list of <i>stuff</i>
   */
  @TestAnnotation
  public List<String> getStuff(TestEnum e) {
    return null;
  }

  /**
   * This is a link to {@linkplain java.lang.Object#getClass()}.
   * 
   * @see #doNothing()
   * @see TestAnnotation
   * @see TestEnum
   * @see org.weborganic.xmldoclet.test
   * 
   * @since 1.0
   * 
   */
  public void tags() {
    
  }
}
