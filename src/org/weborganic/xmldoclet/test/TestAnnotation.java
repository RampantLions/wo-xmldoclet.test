package org.weborganic.xmldoclet.test;

/**
 * Our testing annotation.
 * 
 * @author Christophe
 * @version 1 April 2010
 */
public @interface TestAnnotation {

  /** A list of parameters. */
  String[] parameters() default { };

  /** Some boolean flag */
  boolean flag() default false;

  /** Some number */
  int count() default 99;

  /** Some enum */
  TestEnum greek() default TestEnum.ALPHA;

  /** Some string */
  String name() default "Bingo";

}
